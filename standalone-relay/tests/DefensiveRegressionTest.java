package com.example.opponotificationrelay;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.webkit.CookieManager;
import java.io.IOException;
import java.lang.reflect.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/** Actual production methods; platform fixtures never start a process, network or microphone. */
public final class DefensiveRegressionTest {
    private static int checks;
    private static void check(boolean value,String message){checks++;if(!value)throw new AssertionError(message);}
    private static void retry(){
        for(Throwable failure:new Throwable[]{new SocketTimeoutException(),new SocketException(),new UnknownHostException(),new IOException("CLOUD_BUDGET_YIELD"),new CloudHttp.NotSent(new SocketTimeoutException())})
            check(CloudHttp.retryable(failure),"temporary network/budget is retryable");
        for(Throwable failure:new Throwable[]{new IOException(),new IOException("CLOUD_PATH"),new IOException("CLOUD_REQUEST_LIMIT"),new IOException("CLOUD_CANCELLED"),new IllegalStateException(),new CloudHttp.Failure(23103),new CloudHttp.NotSent(new IOException("CLOUD_PATH"))})
            check(!CloudHttp.retryable(failure),"unknown/permanent failure must stop");
        for(int status:new int[]{408,429,500,502,503,599})check(CloudHttp.retryable(new CloudHttp.HttpFailure(status,"")),"transient HTTP");
        for(int status:new int[]{301,400,401,403,404,409,413,422})check(!CloudHttp.retryable(new CloudHttp.HttpFailure(status,"")),"non-transient HTTP");
    }
    private static void ownership(Context context)throws Exception {
        HealthAccountStore.session=null;check(CloudNativeProducer.owner(context,"AA:BB:CC:DD:EE:01")==null,"no session is normal ineligible state");
        IOException broken=new IOException("FIXTURE_KEYSTORE_FAILURE");HealthAccountStore.failure=broken;
        try{CloudNativeProducer.owner(context,"AA:BB:CC:DD:EE:01");throw new AssertionError("ownership failure was swallowed");}
        catch(IOException failure){check("SYNC_SOURCE_OWNER_READ".equals(failure.getMessage())&&failure.getCause()==broken,"ownership failure preserves cause");}
        int start=1790910000,end=start+7200;
        HealthSyncProtocol.Request request=HealthSyncProtocol.range(HealthSyncProtocol.Kind.HEART,start,end);
        byte[] packet=HealthProto.numbers(1,0,2,start,3,end).withMessages(4,Collections.singletonList(HealthProto.numbers(1,10,2,70))).encode();
        try{HealthArchive.get(context).save("AA:BB:CC:DD:EE:01",request,packet,Collections.emptyMap());throw new AssertionError("window falsely succeeded");}
        catch(IOException failure){check("SYNC_SOURCE_OWNER_READ".equals(failure.getMessage()),"window reports incomplete ownership");}
        SQLiteDatabase db=SQLiteDatabase.archive;
        check(db.committed&&!db.inTransaction(),"raw archive transaction committed before reporting owner failure");
        check(db.rows.get("packets").size()==1&&db.rows.get("records").size()==1,"received packet and record are retained");
        check(!db.rows.containsKey("cloud_source_events")&&!db.rows.containsKey("cursors"),"no guessed owner or advanced cursor");
        HealthAccountStore.failure=null;
        HealthArchive.get(context).save("AA:BB:CC:DD:EE:01",request,packet,Collections.emptyMap());
        check(db.committed,"normal ineligible packet can finish");
    }
    private static void receipt(Context context)throws Exception {
        OfficialHistoryStore.response=SettingsPreviewProtocol.PREFIX+"known_receipt\n"+SettingsPreviewProtocol.END+"\n";
        Method run=OfficialSettingsClient.class.getDeclaredMethod("run",JSONObject.class);run.setAccessible(true);
        JSONObject request=new JSONObject().put("operation","NAP_SAVE");OfficialDataLease.failRelease=true;
        Object value=run.invoke(new OfficialSettingsClient(context),request);
        check("known_receipt".equals(value),"cleanup failure cannot erase business receipt");
        check(OfficialDataLease.releases==1&&FileLogger.warnings.contains("LEASE_RELEASE_FAILED"),"release attempted and diagnosed");
        OfficialHistoryStore.failLaunch=true;
        try{run.invoke(new OfficialSettingsClient(context),request);throw new AssertionError("business failure erased");}
        catch(InvocationTargetException expected){check("BUSINESS_FAILED".equals(expected.getCause().getMessage()),"original failure survives cleanup failure");}
        OfficialHistoryStore.failLaunch=false;OfficialDataLease.failRelease=false;
        check("known_receipt".equals(run.invoke(new OfficialSettingsClient(context),request)),"busy guard resets after both failure paths");
    }
    private static void account()throws Exception {
        AtomicReference<Throwable> result=new AtomicReference<>();HealthAccountStore.current=true;
        CookieManager.throwRemove=true;AccountSdk.clearWeb(1,result::set);
        check(result.get()!=null&&!AccountSdk.webCleaning,"synchronous cookie error completes and clears state");
        CookieManager.throwRemove=false;result.set(null);AccountSdk.clearWeb(1,result::set);
        check(AccountSdk.webCleaning,"cleanup holds login boundary until callback");
        AtomicReference<Throwable> login=new AtomicReference<>();AccountSdk.login(new android.app.Activity(),null,()->true,(s,e)->login.set(e));
        check(login.get()==null,"login waits on cleanup completion without polling");
        CookieManager.throwFlush=true;CookieManager.pending.onReceiveValue(true);
        check(result.get()!=null&&!AccountSdk.webCleaning,"callback error clears state and completes failure");
        check(login.get()!=null,"waiting login receives cleanup failure");
        CookieManager.throwFlush=false;result.set(new IOException());AccountSdk.clearWeb(1,result::set);CookieManager.pending.onReceiveValue(true);
        check(result.get()==null&&!AccountSdk.webCleaning,"successful cleanup completes");
        login.set(null);AccountSdk.login(new android.app.Activity(),null,()->false,(s,e)->login.set(e));
        check("ACCOUNT_OPERATION_CANCELLED".equals(login.get().getMessage()),"cancelled login never waits");
        result.set(null);AccountSdk.clearWeb(1,result::set);HealthAccountStore.current=false;CookieManager.pending.onReceiveValue(true);
        check(result.get()!=null&&!AccountSdk.webCleaning,"old account callback is cancelled and releases cleanup state");HealthAccountStore.current=true;
        result.set(null);AccountSdk.clearWeb(1,result::set);login.set(null);AccountSdk.login(new android.app.Activity(),null,()->true,(s,e)->login.set(e));
        android.os.Handler.fireTimeouts();
        check(result.get()!=null&&"ACCOUNT_WEB_CLEANUP_TIMEOUT".equals(result.get().getMessage()),"missing callback completes with bounded failure");
        check(login.get()!=null&&"ACCOUNT_WEB_CLEANUP_TIMEOUT".equals(login.get().getMessage()),"waiting login gets same timeout");
        check(AccountSdk.webCleaning,"late system cleanup cannot race a new login");CookieManager.pending.onReceiveValue(true);
        check(!AccountSdk.webCleaning,"late callback releases cleanup boundary");
    }
    private static void analysis(Context context)throws Exception {
        check(OsaLocalAnalysis.last(context).equals("尚无本机分析结果"),"missing analysis is explicit absence");
        String key=RelayConfig.getTargetMac(context)+"|"+java.time.LocalDate.now();
        context.getSharedPreferences("osa_local_results",0).edit().putString(key,"{bad").commit();
        check(OsaLocalAnalysis.last(context).contains("无法读取"),"corrupt result is not absence");
        JSONObject stored=new JSONObject().put("date","2026-10-28").put("level",1).put("ahi",8.5);
        context.getSharedPreferences("osa_local_results",0).edit().putString(key,stored.toString()).commit();
        check(OsaLocalAnalysis.last(context).contains("疑似轻度"),"valid saved result still renders");
        stored.put("level",99);context.getSharedPreferences("osa_local_results",0).edit().putString(key,stored.toString()).commit();
        check(OsaLocalAnalysis.last(context).contains("无法读取"),"invalid level is unreadable, not no result");
    }
    private static void osa(Context context)throws Exception {
        byte[] response=HealthProto.numbers(1,1,2,1).encode();RfcommWearTransport.response=response;
        byte[] value=OsaWatchSync.read(context,RelayConfig.getTargetMac(context),OsaWatchProtocol.queryActivation(),()->false,Long.MAX_VALUE);
        check(OsaWatchProtocol.activation(value),"consumer parser still validates accepted response");
        RfcommWearTransport.changeGeneration=true;
        try{OsaWatchSync.read(context,RelayConfig.getTargetMac(context),OsaWatchProtocol.queryActivation(),()->false,Long.MAX_VALUE);throw new AssertionError("old connection accepted");}
        catch(IOException expected){check(expected.getMessage().startsWith("OSA_WATCH_RESPONSE"),"connection generation protection retained");}
        RfcommWearTransport.changeGeneration=false;
        try{OsaWatchSync.read(context,RelayConfig.getTargetMac(context),OsaWatchProtocol.queryActivation(),()->true,Long.MAX_VALUE);throw new AssertionError("cancel accepted");}
        catch(IOException expected){check("OSA_SYNC_CANCELLED".equals(expected.getMessage()),"cancel protection retained");}
        try{OsaWatchProtocol.activation(HealthProto.numbers(1,2,2,99).encode());throw new AssertionError("bad payload accepted");}
        catch(IOException expected){check(true,"final parser rejects malformed payload");}
    }
    public static void main(String[] args)throws Exception {
        Context context=new Context();retry();ownership(context);receipt(context);account();analysis(context);osa(context);
        System.out.println("DEFENSIVE_REGRESSION_PASS checks="+checks+" isolated_platform=true");
    }
}
