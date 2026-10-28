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
    static Runnable revoke(){synchronized(SyncCommit.LOCK){epoch.incrementAndGet();CloudHttp http=active;Thread t=worker;return ()->{if(http!=null)http.close();if(t!=null)t.interrupt();};}}
    static void cancel(){revoke().run();}
    static void startManual(Context context){CloudSyncScheduler.manual(context);}
    static void message(Context c,String scope,String text){progress=text;CloudSyncState.prefs(c).edit().putString(scope+".summary",text).apply();}
    static boolean start(Context context,Completion completion){return start(context,null,completion);}
    static synchronized boolean start(Context context,android.net.Network network,Completion completion){
        if(worker!=null)return false;
        Context c=context.getApplicationContext();long lease; synchronized(SyncCommit.LOCK){lease=epoch.incrementAndGet();} long revision=CloudSyncState.revision(c),generation=HealthAccountStore.generation();
        worker=new Thread(()->{
            boolean retry=false;long deadline=SystemClock.elapsedRealtime()+7*60*1000;String scope="";CloudCategory current=null;long attempt=System.currentTimeMillis();
            BooleanSupplier allowed=()->epoch.get()==lease&&HealthAccountStore.generation()==generation&&CloudSyncState.revision(c)==revision&&CloudSyncState.enabled(c)&&HealthAccountStore.exists(c);
            try{
                if(!allowed.getAsBoolean()||!CloudSyncState.any(c))return;
                JSONObject stored=HealthAccountStore.load(c);if(stored==null)throw new IOException("CLOUD_LOGIN_REQUIRED");
                String account=stored.getString("account");scope=accountKey(account);
                JSONObject session=stored;
                if("independent-sdk".equals(stored.optString("source"))){
                    android.net.ConnectivityManager connectivity=(android.net.ConnectivityManager)c.getSystemService(Context.CONNECTIVITY_SERVICE);
                    // The pinned account SDK uses the default network internally. Defer when it differs from the Job network.
                    if(network!=null&&(connectivity==null||!network.equals(connectivity.getActiveNetwork())))throw new IOException("CLOUD_JOB_NETWORK_CHANGED");
                    session=AccountSdk.fresh(c,stored,allowed);
                    if(network!=null&&!network.equals(connectivity.getActiveNetwork()))throw new IOException("CLOUD_JOB_NETWORK_CHANGED");
                    if(!account.equals(session.getString("account")))throw new IOException("CLOUD_ACCOUNT_MISMATCH");

                }
                message(c,scope,"正在连接健康云…");
                try(CloudHttp http=new CloudHttp(session,allowed,network,deadline);CloudStore store=new CloudStore(c,account,allowed,deadline)){
                    active=http;http.check();
                    if("independent-sdk".equals(stored.optString("source")))HealthAccountClient.login(session,http);
                    CloudCrypto crypto=CloudCrypto.exchange(http,new JSONObject(CloudStream.asset(c,"cloud-public-key.json")),session.getString("deviceId"));
                    List<CloudStream> streams=CloudStream.all(c);
                    int succeeded=0,failed=0;
                    CloudCategory[] categories=CloudCategory.values();int first=CloudSyncState.prefs(c).getInt(scope+".nextCategory",0);
                    for(int offset=0;offset<categories.length;offset++){
                        CloudCategory category=categories[Math.floorMod(first+offset,categories.length)];
                        if(!CloudSyncState.selected(c,category))continue;
                        CloudSyncState.prefs(c).edit().putInt(scope+".nextCategory",(category.ordinal()+1)%categories.length).apply();
                        current=category;attempt=System.currentTimeMillis();http.check();
                        CloudSyncState.result(c,scope,category,"正在同步",attempt,false);
                        int downloaded=0,uploaded=0,pending=0,conflicts=0,partial=0;boolean found=false;
                        try{
                            List<CloudStream> members=new ArrayList<>();for(CloudStream stream:streams)if(stream.category.equals(category.key))members.add(stream);
                            int streamFirst=CloudSyncState.prefs(c).getInt(scope+".nextStream."+category.key,0);
                            for(int index=0;index<members.size();index++){
                                int position=Math.floorMod(streamFirst+index,members.size());CloudStream stream=members.get(position);found=true;
                                CloudSyncState.prefs(c).edit().putInt(scope+".nextStream."+category.key,(position+1)%members.size()).apply();
                                if(!stream.push.isEmpty()){
                                    CloudUpload.Result up=CloudUpload.synchronize(c,scope,store,http,crypto,stream,deadline);
                                    uploaded+=up.confirmed;pending+=up.waiting;conflicts+=up.conflicts;partial+=up.partial;retry|=up.ready>0;
                                }
                                downloaded+=pull(c,scope,store,http,crypto,stream,deadline);
                            }
                            if(!found)throw new IOException("CLOUD_CATEGORY_NOT_READY");
                            boolean preferencesDone=category==CloudCategory.SETTINGS&&CloudPreferences.pending(c,account)==0;
                            boolean completed=category==CloudCategory.SETTINGS?preferencesDone:category!=CloudCategory.ARCHIVES&&pending==0&&conflicts==0&&partial==0;
                            String health="已确认上传 "+uploaded+" 条，增量下载 "+downloaded+" 条";
                            if(pending>0)health+="；待处理 "+pending+" 条";
                            if(conflicts>0)health+="；云端冲突 "+conflicts+" 条，已保留本地记录";
                            if(partial>0)health+="；身心日汇总 "+partial+" 条部分确认，平均睡眠 HRV 已保留本地，云端尚无法验证";
                            if(category==CloudCategory.ARCHIVES)health+="；档案上行尚未开放";
                            CloudSyncState.result(c,scope,category,category==CloudCategory.SETTINGS?(preferencesDone?"已支持项目同步成功 · 资料/目标下载，偏好读回确认":"本轮已保存；另有新偏好修改待同步"):health,attempt,completed);
                            succeeded++;
                        }catch(Exception failure){
                            if(!"CLOUD_BUDGET_YIELD".equals(failure.getMessage()))http.check();
                            if("CLOUD_BUDGET_YIELD".equals(failure.getMessage())){
                                CloudSyncState.result(c,scope,category,"已保存进度，等待继续同步",attempt,false);retry=true;break;
                            }
                            CloudSyncState.result(c,scope,category,error(failure),attempt,false);failed++;retry|=retryable(failure);
                        }
                        current=null;
                    }
                    message(c,scope,retry?"本轮进度已保存，将继续同步":failed>0?"部分项目未完成，请查看分类提示":"本轮已支持项目处理完成，请查看各类确认结果");
                    try{HealthDataManager.get(c).historyChanged();}catch(Exception ignored){}
                }
            }catch(Exception failure){
                if(!scope.isEmpty()){String error=allowed.getAsBoolean()?error(failure):"已停止，已保存的记录保留";
                    message(c,scope,error);
                    if(current!=null)try{CloudSyncState.result(c,scope,current,error,attempt,false);}
                    catch(RuntimeException statusFailure){android.util.Log.w("HealthCloud","Unable to record sync failure: "+statusFailure.getClass().getSimpleName());}
                }
                retry=allowed.getAsBoolean()&&retryable(failure);
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
            long version=Math.addExact(store.cursor(stream),1);int count=store.savePage(stream,rows,version,crypto);store.complete(stream,version);return count;
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
    static boolean retryable(Throwable failure){
        String code=failure.getMessage();
        if(code==null)return true;
        if(code.equals("CLOUD_CANCELLED")||code.equals("CLOUD_ACCOUNT_MISMATCH")||code.equals("CLOUD_LOGIN_REQUIRED")||code.equals("ACCOUNT_LOGIN_REQUIRED")||code.equals("ACCOUNT_ID_MISMATCH")||code.equals("ACCOUNT_CONFIG_NOT_IMPORTED")||code.equals("CLOUD_CATEGORY_NOT_READY"))return false;
        if(failure instanceof CloudHttp.HttpFailure){int status=((CloudHttp.HttpFailure)failure).status;if(status==400||status==401||status==403||status==404||status==413||status==422)return false;}
        if(failure instanceof CloudHttp.Failure){int n=((CloudHttp.Failure)failure).code;if(n==10101||n==10102||n==22300)return false;}
        return true;
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
