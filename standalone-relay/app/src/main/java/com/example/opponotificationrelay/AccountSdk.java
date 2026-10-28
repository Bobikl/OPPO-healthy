package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.*;
import org.json.JSONObject;
import com.oplus.accountsdk.base.account.AcAccountManager;
import com.oplus.accountsdk.base.account.beans.*;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.common.util.AcLogUtil$IAcLogImpl;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig$Builder;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig$Brand;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;

final class AccountSdk {
    interface Result {void done(JSONObject session,Throwable failure);}
    private static final ExecutorService worker=Executors.newSingleThreadExecutor();
    private static String initializedApp;
    static volatile boolean webCleaning;
    static void silence(){
        AcLogUtil.switchDebug(false);
        AcLogUtil.setLogImpl(new AcLogUtil$IAcLogImpl(){public void d(String t,String m){}public void e(String t,String m){}public void i(String t,String m){}public void w(String t,String m){}});
        AcLogUtil.setLogUploader(null);
    }
    static void silence(Context context){
        silence();
        try{
            Object base=Class.forName("com.oplus.aiunit.vision.ih").getMethod("b",Context.class).invoke(null,context);
            base.getClass().getMethod("setTraceEnable",boolean.class).invoke(base,false);
            Object account=Class.forName("com.oplus.accountsdk.service.account.trace.AcIdTraceManager").getMethod("getInstance",Context.class).invoke(null,context);
            account.getClass().getMethod("setTraceEnable",boolean.class).invoke(account,false);
        }catch(ReflectiveOperationException failure){throw new IllegalStateException("ACCOUNT_TRACE_DISABLE",failure);}
    }
    static synchronized String init(Context context,JSONObject configuration)throws Exception {
        silence(context);String appId=configuration.optString("sdkAppId"),appKey=configuration.optString("sdkAppKey");
        if(appId.isEmpty()||appKey.isEmpty())throw new IOException("ACCOUNT_CONFIG_NOT_IMPORTED");
        if(!appId.equals(initializedApp)){
            AcOpenAccountConfig config=new AcOpenAccountConfig$Builder().setAppI(appId).setAppK(appKey)
                .setBrand(AcOpenAccountConfig$Brand.BRAND_HEYTAP).setCountry("CN").setHost(Boolean.TRUE).create();
            if(config==null)throw new IOException("ACCOUNT_CONFIG_INVALID");
            AcAccountManager.init(OfficialUiResources.wrapAccount(context),config);initializedApp=appId;
        }
        return appId;
    }
    static synchronized void clearLocal(Context context,long expected){
        if(!HealthAccountStore.valid(expected))return;
        silence();
        com.oplus.accountsdk.open.core.storage.AcOpenStorageHelper.getInstance(context).cleanAllDB();
        com.oplus.aiunit.vision.rf.B().b(context);
        com.oplus.aiunit.vision.mc.b(context);
        initializedApp=null;
    }
    static JSONObject fresh(Context context,JSONObject configuration)throws Exception {return fresh(context,configuration,()->true);}
    static synchronized JSONObject fresh(Context context,JSONObject configuration,java.util.function.BooleanSupplier allowed)throws Exception {
        if(Thread.currentThread().isInterrupted()||!allowed.getAsBoolean())throw new IOException("ACCOUNT_OPERATION_CANCELLED");
        OfficialUiResources.ensureReady(context.getApplicationContext());
        String appId=init(context,configuration);
        AcApiResponse token=AcAccountManager.getClient(appId).getAccountToken();
        if(Thread.currentThread().isInterrupted()||!allowed.getAsBoolean())throw new IOException("ACCOUNT_OPERATION_CANCELLED");
        if(!token.isSuccess()||token.getData()==null)throw sdkFailure("TOKEN",token.getCode());
        AcApiResponse info=AcAccountManager.getClient(appId).getAccountInfo();
        if(Thread.currentThread().isInterrupted()||!allowed.getAsBoolean())throw new IOException("ACCOUNT_OPERATION_CANCELLED");
        if(!info.isSuccess()||info.getData()==null)throw sdkFailure("INFO",info.getCode());
        return new JSONObject(configuration.toString()).put("account",((AcAccountInfo)info.getData()).getSsoid())
            .put("token",((AcAccountToken)token.getData()).getToken()).put("deviceId",((AcAccountToken)token.getData()).getDeviceId())
            .put("source","independent-sdk").put("verifiedAt",0);
    }
    private static IOException sdkFailure(String step,int code){
        com.platform.usercenter.account.ams.ipc.ResponseEnum[] expired={com.platform.usercenter.account.ams.ipc.ResponseEnum.ERROR_NOT_AUTH,com.platform.usercenter.account.ams.ipc.ResponseEnum.OAUTH_NO_LOGIN_ERROR,com.platform.usercenter.account.ams.ipc.ResponseEnum.CODE_ACCESS_TOKEN_EXPIRED,com.platform.usercenter.account.ams.ipc.ResponseEnum.CODE_ID_TOKEN_EXPIRED,com.platform.usercenter.account.ams.ipc.ResponseEnum.NET_ACCOUNT_EXPIRED,com.platform.usercenter.account.ams.ipc.ResponseEnum.NET_AUTH_EXPIRED};
        for(com.platform.usercenter.account.ams.ipc.ResponseEnum value:expired)if(value.getCode()==code)return new IOException("ACCOUNT_LOGIN_REQUIRED");
        return new IOException("ACCOUNT_SDK_"+step+"_"+code);
    }
    static void login(Activity activity,JSONObject configuration,java.util.function.BooleanSupplier allowed,Result result){
        if(!allowed.getAsBoolean()){result.done(null,new IOException("ACCOUNT_OPERATION_CANCELLED"));return;}
        if(webCleaning){new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(()->{if(!activity.isFinishing()&&!activity.isDestroyed())login(activity,configuration,allowed,result);},50);return;}
        try {
            String appId=init(activity,configuration);
            AcAccountManager.getClient(appId).login(activity,rawResponse->{
                AcApiResponse response=(AcApiResponse)rawResponse;
                if(!response.isSuccess()){result.done(null,new IOException("ACCOUNT_SDK_"+response.getCode()));return;}
                worker.execute(()->{
                    try{
                        JSONObject session=fresh(activity,configuration,allowed);
                        try(CloudHttp http=new CloudHttp(session,allowed)){JSONObject verified=HealthAccountClient.login(session,http);result.done(verified,null);}
                    }catch(Throwable failure){result.done(null,failure);}
                });
            });
        }catch(Throwable failure){result.done(null,failure);}
    }
}
