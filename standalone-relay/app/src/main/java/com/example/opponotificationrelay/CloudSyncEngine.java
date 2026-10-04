package com.example.opponotificationrelay;
import android.content.*;
import android.app.job.*;
import android.os.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BooleanSupplier;
import org.json.*;

/** One account-scoped run, with cooperative cancellation before HTTP and durable commits. */
final class CloudSyncEngine {
    interface Completion {void done(boolean retry);}
    private static final AtomicLong epoch=new AtomicLong();
    private static volatile Thread worker;private static volatile CloudHttp active;
    private static volatile String progress="";
    static boolean running(){return worker!=null;}
    static String progress(){return progress;}
    static String accountKey(String account){return HealthArchive.hash(("health-cloud-cn-v1:"+account).getBytes(StandardCharsets.UTF_8));}
    static void cancel(){epoch.incrementAndGet();CloudHttp http=active;if(http!=null)http.close();Thread t=worker;if(t!=null)t.interrupt();}
    static void startManual(Context context){CloudSyncScheduler.manual(context);}
    static void message(Context c,String scope,String text){progress=text;CloudSyncState.prefs(c).edit().putString(scope+".summary",text).apply();}
    static synchronized boolean start(Context context,Completion completion){
        if(worker!=null)return false;
        Context c=context.getApplicationContext();long lease=epoch.incrementAndGet(),revision=CloudSyncState.revision(c),generation=HealthAccountStore.generation();
        worker=new Thread(()->{
            boolean retry=false;String scope="";CloudCategory current=null;long attempt=System.currentTimeMillis();
            BooleanSupplier allowed=()->epoch.get()==lease&&HealthAccountStore.generation()==generation&&CloudSyncState.revision(c)==revision&&CloudSyncState.enabled(c)&&HealthAccountStore.exists(c);
            try{
                if(!allowed.getAsBoolean()||!CloudSyncState.any(c))return;
                JSONObject stored=HealthAccountStore.load(c);if(stored==null)throw new IOException("CLOUD_LOGIN_REQUIRED");
                String account=stored.getString("account");scope=accountKey(account);
                JSONObject session=stored;
                if("independent-sdk".equals(stored.optString("source"))){
                    session=AccountSdk.fresh(c,stored);
                    if(!account.equals(session.getString("account")))throw new IOException("CLOUD_ACCOUNT_MISMATCH");
                    HealthAccountClient.login(session);
                }
                message(c,scope,"正在连接健康云…");
                try(CloudHttp http=new CloudHttp(session,allowed);CloudStore store=new CloudStore(c,account,allowed)){
                    active=http;
                    CloudCrypto crypto=CloudCrypto.exchange(http,new JSONObject(CloudStream.asset(c,"cloud-public-key.json")),session.getString("deviceId"));
                    List<CloudStream> streams=CloudStream.all(c);
                    long deadline=SystemClock.elapsedRealtime()+7*60*1000;int succeeded=0,failed=0;
                    for(CloudCategory category:CloudCategory.values()){
                        if(!CloudSyncState.selected(c,category))continue;
                        current=category;attempt=System.currentTimeMillis();http.check();
                        CloudSyncState.result(c,scope,category,"正在同步",attempt,false);
                        int downloaded=0;boolean found=false;
                        try{
                            for(CloudStream stream:streams)if(stream.category.equals(category.key)){
                                found=true;downloaded+=pull(c,scope,store,http,crypto,stream,deadline);
                            }
                            if(!found)throw new IOException("CLOUD_CATEGORY_NOT_READY");
                            // Capability-qualified status until upload, attachments and all subtypes pass verification.
                            boolean preferencesDone=category==CloudCategory.SETTINGS&&CloudPreferences.pending(c,account)==0;
                            CloudSyncState.result(c,scope,category,(category==CloudCategory.SETTINGS?(preferencesDone?"已支持项目同步成功 · 资料/目标下载，偏好读回确认":"本轮已保存；另有新偏好修改待同步"):"已下载 "+downloaded+" 条；健康记录上行尚未开放"),attempt,preferencesDone);
                            succeeded++;
                        }catch(Exception failure){
                            http.check();
                            if("CLOUD_BUDGET_YIELD".equals(failure.getMessage())){
                                CloudSyncState.result(c,scope,category,"已保存进度，等待继续同步",attempt,false);retry=true;break;
                            }
                            CloudSyncState.result(c,scope,category,error(failure),attempt,false);failed++;retry=true;
                        }
                        current=null;
                    }
                    message(c,scope,retry?"部分数据已保存，将继续重试":"已开放项目下载完成；其余范围请查看同步说明");
                    try{HealthDataManager.get(c).historyChanged();}catch(Exception ignored){}
                }
            }catch(Exception failure){
                if(!scope.isEmpty()){String error=allowed.getAsBoolean()?error(failure):"已停止，已保存的记录保留";
                    message(c,scope,error);
                    if(current!=null)CloudSyncState.result(c,scope,current,error,attempt,false);
                }
                retry=allowed.getAsBoolean();
            }finally{
                active=null;synchronized(CloudSyncEngine.class){worker=null;}
                completion.done(retry);
            }
        },"health-cloud-sync");worker.start();return true;
    }
    static int pull(Context c,String scope,CloudStore store,CloudHttp http,CloudCrypto crypto,CloudStream stream,long deadline)throws Exception {
        if(stream.definition.optBoolean("snapshot")){
            http.check();JSONObject request=stream.definition.optJSONObject("request");if(request==null)request=new JSONObject();
            Object body=stream.id.equals("preferences")?CloudPreferences.synchronize(c,store.account,http,request.getJSONArray("settingKeyList"),()->{try{store.check();return true;}catch(Exception e){return false;}}):http.post(stream.pull,request).get("body");
            if(stream.definition.optBoolean("encrypted"))body=new JSONTokener(crypto.body((String)body,false)).nextValue();
            JSONArray rows=stream.definition.optBoolean("single")?new JSONArray().put(body):stream.records(body);
            long version=System.currentTimeMillis();int count=store.savePage(stream,rows,version,crypto);store.complete(stream,version);return count;
        }
        long cursor=store.cursor(stream);int downloaded=0;
        while(true){
            http.check();if(SystemClock.elapsedRealtime()>=deadline)throw new IOException("CLOUD_BUDGET_YIELD");
            message(c,scope,"正在同步"+stream.title+" · 本轮已下载 "+downloaded+" 条");
            JSONObject body=http.post(stream.version,stream.versionRequest(cursor)).getJSONObject("body");
            JSONArray source=body.getJSONArray(stream.definition.getString("versionList"));
            int more=body.getInt("hasMore");if(more!=0&&more!=1)throw new IOException("CLOUD_VERSION_SHAPE");
            TreeSet<Long> versions=new TreeSet<>();for(int i=0;i<source.length();i++){long v=source.getLong(i);if(v<=0||v==Long.MAX_VALUE)throw new IOException("CLOUD_VERSION_SHAPE");if(v>cursor)versions.add(v);}
            if(versions.isEmpty()){
                if(more!=0)throw new IOException("CLOUD_CURSOR_STALLED");
                store.complete(stream,cursor);return downloaded;
            }
            for(long version:versions){
                http.check();if(SystemClock.elapsedRealtime()>=deadline)throw new IOException("CLOUD_BUDGET_YIELD");
                Object records=http.post(stream.pull,stream.pullRequest(version)).get("body");
                JSONArray rows=stream.records(records);
                downloaded+=store.savePage(stream,rows,version,crypto);cursor=version;
            }
            if(more==0){store.complete(stream,cursor);return downloaded;}
        }
    }
    static String error(Throwable failure){
        String code=failure.getMessage();
        if("CLOUD_CANCELLED".equals(code))return "已停止，保留同步进度";
        if("CLOUD_CATEGORY_NOT_READY".equals(code))return "该类别接口核对中，尚未执行";
        if("CLOUD_ACCOUNT_MISMATCH".equals(code))return "账号与记录归属不一致，已停止";
        if(code!=null&&(code.startsWith("ACCOUNT_")||code.equals("CLOUD_LOGIN_REQUIRED")))return "登录状态需要更新，请到账号页重新验证";
        if(failure instanceof java.net.SocketTimeoutException)return "连接超时，保留进度等待重试";
        if(failure instanceof java.net.UnknownHostException)return "网络不可用，等待重试";
        if(code!=null&&code.matches("CLOUD_[A-Z0-9_]{1,60}"))return "同步未完成 · "+code.substring(6);
        return "同步未完成 · "+failure.getClass().getSimpleName();
    }
}
