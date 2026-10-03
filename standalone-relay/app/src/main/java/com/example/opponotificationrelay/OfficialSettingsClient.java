package com.example.opponotificationrelay;

import android.content.Context;
import android.content.pm.*;
import android.os.Build;
import android.os.SystemClock;
import org.json.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/** 用户手动发起的有界读取或明确确认的午休写回。写回永不自动重试。 */
public final class OfficialSettingsClient {
    private static final AtomicBoolean BUSY=new AtomicBoolean();
    private final Context context;
    private volatile boolean cancelled;
    private Process child;
    public OfficialSettingsClient(Context c){context=c.getApplicationContext();}
    public synchronized void cancel() {
        cancelled=true;closeChild();
    }
    private synchronized void closeChild(){
        if(child!=null){try{child.getOutputStream().close();}catch(Exception ignored){}child.destroy();child=null;}
    }
    public OfficialSettingsPreview read() throws Exception {return decode(run(null));}
    public JSONObject readSleep() throws Exception {
        JSONObject result=new JSONObject(run(new JSONObject().put("operation","readSleep")));
        if(result.optInt("schema")!=1 || !"OK".equals(result.optString("status")))throw new IllegalStateException(code(result));
        JSONObject sleep=result.getJSONObject("sleep");if(!"OK".equals(sleep.optString("status")))throw new IllegalStateException(code(sleep));return sleep;
    }
    public JSONObject activity(String device,JSONArray rows)throws Exception {
        JSONObject request=new JSONObject().put("operation",rows==null?"readActivity":"syncActivity").put("device",device);if(rows!=null)request.put("rows",rows);
        JSONObject result=new JSONObject(run(request));if(result.optInt("schema")!=1||!"OK".equals(result.optString("status")))throw new IllegalStateException(code(result));
        JSONObject activity=result.getJSONObject("activity");if(!"OK".equals(activity.optString("status")))throw new IllegalStateException(code(activity));return activity;
    }
    public JSONObject health(String device,long start,long end,boolean raw)throws Exception {
        JSONObject result=new JSONObject(run(new JSONObject().put("operation",raw?"readHeartRaw":"readHealth").put("device",device).put("start",start).put("end",end)));
        if(result.optInt("schema")!=1||!"OK".equals(result.optString("status")))throw new IllegalStateException(code(result));
        JSONObject health=result.getJSONObject("health");if(!"OK".equals(health.optString("status")))throw new IllegalStateException(code(health));return health;
    }
    private String run(JSONObject request) throws Exception {
        boolean activity=request!=null && request.optString("operation").endsWith("Activity");
        boolean offlineWrite=activity && "syncActivity".equals(request.optString("operation"));
        boolean write=request!=null && !activity && !"readSleep".equals(request.optString("operation")) && !"readHealth".equals(request.optString("operation")) && !"readHeartRaw".equals(request.optString("operation"));
        if(!BUSY.compareAndSet(false,true))throw new IllegalStateException("BUSY");
        ServiceLease<android.os.IBinder> lease=null;
        try {
            if(Build.VERSION.SDK_INT<33 || !android.os.Process.is64Bit() ||
                !Arrays.asList(Build.SUPPORTED_ABIS).contains("arm64-v8a"))throw new IllegalStateException("DEVICE_UNSUPPORTED");
            PackageInfo info=context.getPackageManager().getPackageInfo("com.heytap.health",PackageManager.MATCH_DISABLED_COMPONENTS);
            if(info.getLongVersionCode()!=6060700 || !"6.6.7_097c6ef_260803".equals(info.versionName))
                throw new IllegalStateException("OFFICIAL_BUILD_UNSUPPORTED");
            ApplicationInfo app=info.applicationInfo;
            if(app==null || app.uid<10000 || app.uid>=100000 || android.os.Process.myUid()>=100000)
                throw new IllegalStateException("USER_UNSUPPORTED");
            if(offlineWrite && app.enabled)throw new IllegalStateException("ACTIVITY_OFFICIAL_RUNNING");
            if(write && !app.enabled)throw new IllegalStateException("OFFICIAL_DISABLED");
            long deadline=SystemClock.elapsedRealtime()+65000;
            if(write) {
                lease=OfficialDataLease.open(context,app.uid);
                if(!lease.value().isBinderAlive())throw new IllegalStateException("LEASE_DISCONNECTED");
                FileLogger.i("SettingsWrite","dataServiceLease=CONNECTED");
            }
            Exception last=null;
            for(boolean global:(!write&&!offlineWrite?new boolean[]{true,false}:new boolean[]{true})) {
                try {
                    String command="exec env CLASSPATH="+SettingsPreviewProtocol.quote(context.getApplicationInfo().sourceDir)+
                        " /system/bin/app_process /system/bin com.example.opponotificationrelay.RootSettingsBootstrap "+
                        SettingsPreviewProtocol.quote(context.getApplicationInfo().sourceDir)+" "+
                        SettingsPreviewProtocol.quote(app.sourceDir)+" "+app.uid+" "+(global?"global":"plain")+(request==null?"":" "+SettingsPreviewProtocol.quote(android.util.Base64.encodeToString(request.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8),android.util.Base64.NO_WRAP)));
                    final Process running;
                    synchronized(this) {
                        if(cancelled || Thread.currentThread().isInterrupted())throw new InterruptedException();
                        if(lease!=null && !lease.value().isBinderAlive())throw new IllegalStateException("LEASE_DISCONNECTED");
                        child=(global?new ProcessBuilder("su","--mount-master","-c",command):new ProcessBuilder("su","-c",command))
                            .redirectErrorStream(true).start();running=child;
                    }
                    FutureTask<String> read=new FutureTask<>(()->SettingsPreviewProtocol.read(running.getInputStream()));
                    Thread pipe=new Thread(read,"settings-preview-result");pipe.setDaemon(true);pipe.start();
                    long remaining=deadline-SystemClock.elapsedRealtime();
                    if(remaining<=0)throw new TimeoutException();
                    String payload=read.get(remaining,TimeUnit.MILLISECONDS);
                    if(cancelled)throw new InterruptedException();
                    PackageInfo current=context.getPackageManager().getPackageInfo("com.heytap.health",PackageManager.MATCH_DISABLED_COMPONENTS);
                    if(current.applicationInfo==null || current.applicationInfo.uid!=app.uid ||
                       !current.applicationInfo.sourceDir.equals(app.sourceDir) || current.getLongVersionCode()!=info.getLongVersionCode())
                        throw new IllegalStateException("OFFICIAL_CHANGED");
                    return payload;
                } catch(InterruptedException e){Thread.currentThread().interrupt();throw e;}
                catch(ExecutionException e){if(write||offlineWrite)throw e;last=e;}
                catch(java.io.IOException e){if(write||offlineWrite)throw e;last=e;}
                finally{closeChild();}
            }
            throw new IllegalStateException("ROOT_UNAVAILABLE",last);
        } finally {try{if(lease!=null)lease.close();}finally{BUSY.set(false);}}
    }
    static OfficialSettingsPreview decode(String text) throws Exception {
        JSONObject json=new JSONObject(text);
        if(json.getInt("schema")!=1)throw new IllegalStateException("RESULT_FORMAT");
        if(!"OK".equals(json.getString("status")))throw new IllegalStateException(code(json));
        JSONObject a=json.getJSONObject("apps"),n=json.getJSONObject("nap");
        Map<String,Boolean> apps=null;String appsError=null,napError=null;int skipped=0,self=0;
        if("OK".equals(a.getString("status"))) {
            apps=new TreeMap<>();JSONArray rows=a.getJSONArray("rows");
            if(rows.length()>OfficialSettingsPreview.MAX_APPS)throw new IllegalStateException("APP_LIMIT");
            for(int i=0;i<rows.length();i++) {
                JSONArray row=rows.getJSONArray(i);
                if(row.length()!=2 || apps.put(row.getString(0),row.getBoolean(1))!=null)
                    throw new IllegalStateException("INVALID_APP_RECORD");
            }
            skipped=a.getInt("skipped");self=a.getInt("selfRows");
        } else appsError=code(a);
        OfficialSettingsPreview.Nap nap=null;
        if("OK".equals(n.getString("status")))nap=new OfficialSettingsPreview.Nap(n.getBoolean("enabled"),n.getInt("start"),n.getInt("duration"),n.has("revision")?n.getString("revision"):null);
        else napError=code(n);
        return new OfficialSettingsPreview(apps,appsError,nap,napError,skipped,self,System.currentTimeMillis());
    }
    private static String code(JSONObject j) {
        String s=j.optString("code","RESULT_FORMAT");return s.matches("[A-Z_]{1,64}")?s:"RESULT_FORMAT";
    }
    public static String errorMessage(Throwable error) {
        if(error instanceof PackageManager.NameNotFoundException)return "未安装受支持的官方健康应用。";
        if(error instanceof TimeoutException)return "读取超时，请检查 Root 授权后重试。";
        if(error instanceof InterruptedException)return "读取已取消。";
        String code=error.getMessage();
        if(code==null || !code.matches("[A-Z_]{1,64}"))code="READ_FAILED";
        switch(code) {
            case "BUSY":return "上一次读取正在结束，请稍后重试。";
            case "DEVICE_UNSUPPORTED":return "当前只支持 Android 13 及以上的 ARM64 设备。";
            case "USER_UNSUPPORTED":return "当前预览仅支持手机主用户，暂不支持应用分身或工作资料。";
            case "OFFICIAL_BUILD_UNSUPPORTED":return "当前仅适配已验证的官方健康 6.6.7 构建；此安装包尚未适配。";
            case "OFFICIAL_CHANGED":return "读取期间官方应用发生变化，请重试。";
            case "ROOT_UNAVAILABLE":return "无法完成 Root 读取，请检查授权及 Root 管理器兼容性。";
            default:return "未能读取（"+code+"），请保持官方配置稳定后重试。";
        }
    }

    private static final Object WRITE_LOCK=new Object();
    private android.content.SharedPreferences journal() {
        return context.getSharedPreferences("official_nap_write_state",Context.MODE_PRIVATE);
    }
    public static String lastWrite(Context context) {
        android.content.SharedPreferences prefs=context.getSharedPreferences("official_nap_write_state",Context.MODE_PRIVATE);
        if(prefs.getBoolean("pending",false))return "上次写回未能完整确认。官方可能继续处理，请先重新读取并核对，再决定是否重试。";
        return prefs.getString("message","午休写回需要官方健康已启用且网络可用；确认后临时连接官方保存服务。");
    }
    public NapWritePolicy.Result writeNap(NapWritePolicy.Plan plan) {
        synchronized(WRITE_LOCK) {
            NapWritePolicy.Result outcome;
            if(plan.expired(SystemClock.elapsedRealtime()) || !plan.localMatches(SettingsImportStore.snapshot(context)))
                return new NapWritePolicy.Result(NapWritePolicy.Status.REJECTED,"LOCAL_CHANGED",0,0,-1);
            try {
                if(!journal().edit().putBoolean("pending",true).remove("message").commit())
                    return new NapWritePolicy.Result(NapWritePolicy.Status.REJECTED,"JOURNAL_FAILED",0,0,-1);
                JSONObject request=new JSONObject().put("operation","NAP_SAVE").put("revision",plan.source.revision)
                    .put("enabled",plan.target.nap.enabled).put("start",plan.target.nap.start).put("end",plan.target.nap.end())
                    .put("expires",plan.reviewedAt+NapWritePolicy.REVIEW_MS);
                JSONObject envelope=new JSONObject(run(request));
                if(envelope.getInt("schema")!=1 || !"OK".equals(envelope.getString("status")))throw new IllegalStateException("WRITE_UNCONFIRMED");
                JSONObject saved=envelope.getJSONObject("write");
                NapWritePolicy.Status status=NapWritePolicy.Status.valueOf(saved.getString("status"));
                int attempted=saved.getInt("attempted"),confirmed=saved.getInt("confirmed"),matching=saved.getInt("matching");
                String reason=saved.getString("code");
                if(attempted<0 || attempted>7 || confirmed<0 || confirmed>7 || (confirmed&~attempted)!=0 ||
                    matching < -1 || matching>7 || !reason.matches("[A-Z_]{1,64}") ||
                    ((status==NapWritePolicy.Status.APPLIED || status==NapWritePolicy.Status.NO_CHANGE)&&matching!=7))
                    throw new IllegalStateException("WRITE_UNCONFIRMED");
                outcome=new NapWritePolicy.Result(status,reason,attempted,confirmed,matching);
            } catch(Exception failure) {
                String code=failure.getMessage();
                boolean rejected="BUSY".equals(code)||"OFFICIAL_DISABLED".equals(code)||"OFFICIAL_BUILD_UNSUPPORTED".equals(code)||
                    "DEVICE_UNSUPPORTED".equals(code)||"USER_UNSUPPORTED".equals(code)||
                    "LEASE_BIND_FAILED".equals(code)||"LEASE_BIND_TIMEOUT".equals(code)||"LEASE_DISCONNECTED".equals(code)||
                    "LEASE_BINDING_DIED".equals(code)||"LEASE_NULL_BINDING".equals(code)||"LEASE_SERVICE_CHANGED".equals(code)||
                    "LEASE_CANCELLED".equals(code)||"LEASE_MAIN_THREAD".equals(code);
                outcome=new NapWritePolicy.Result(rejected?NapWritePolicy.Status.REJECTED:NapWritePolicy.Status.UNCERTAIN,
                    rejected?code:"WRITE_UNCONFIRMED",0,0,-1);
            }
            String message=writeMessage(outcome);
            boolean recorded=journal().edit().putBoolean("pending",outcome.status==NapWritePolicy.Status.UNCERTAIN).putString("message",message).commit();
            FileLogger.i("SettingsWrite","nap="+outcome.status+" code="+outcome.code+" attempted="+outcome.attempted+
                " confirmed="+outcome.confirmed+" matching="+outcome.matching+" resultRecorded="+recorded);
            return outcome;
        }
    }
    public static String writeMessage(NapWritePolicy.Result result) {
        switch(result.status) {
            case APPLIED:return "已通过官方保存接口提交，三项午休配置读回与目标一致。请在官方页面核对显示。";
            case NO_CHANGE:return "官方午休设置已经一致，没有提交修改。";
            case REJECTED:
                switch(result.code) {
                    case "LEASE_BIND_FAILED":case "LEASE_BIND_TIMEOUT":case "LEASE_DISCONNECTED":
                    case "LEASE_BINDING_DIED":case "LEASE_NULL_BINDING":case "LEASE_SERVICE_CHANGED":
                    case "LEASE_CANCELLED":case "LEASE_MAIN_THREAD":
                        return "未能建立官方保存连接（"+result.code+"），本次未提交设置。请检查官方是否已启用，以及系统是否限制后台连接。";
                    case "SERVICE_NOT_PUBLISHED":
                        return "临时连接建立后仍未取得官方保存接口，本次未提交设置。请保留此结果，以便检查接口兼容性。";
                    case "OFFICIAL_DISABLED":case "NULL_HEALTH_BINDER":
                        return "请先打开官方健康并保持运行，再重新读取和确认写回。尚未提交修改。";
                    case "SOURCE_CHANGED":case "ACCOUNT_CHANGED":case "LOCAL_CHANGED":
                        return "账号或设置已变化，本次未提交修改，请重新读取后确认。";
                    case "EXPIRED":case "TIMEOUT":return "确认已超时，本次未提交修改，请重新读取。";
                    case "JOURNAL_FAILED":return "无法保存操作记录，本次未提交修改。";
                    default:return "写回准备失败（"+result.code+"），尚未提交修改。";
                }
            default:
                return "写回未能完整确认（"+result.code+"）。"+
                    (result.matching<0?"":("最近读回有 "+Integer.bitCount(result.matching)+"/3 项与目标一致。"))+
                    "官方可能仍在处理已提交的请求；本应用没有自动重试或回滚。请稍后重新读取并核对官方设置。";
        }
    }
}
