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
    static void silence(){
        AcLogUtil.switchDebug(false);
        AcLogUtil.setLogImpl(new AcLogUtil$IAcLogImpl(){public void d(String t,String m){}public void e(String t,String m){}public void i(String t,String m){}public void w(String t,String m){}});
        AcLogUtil.setLogUploader(null);
    }
    static synchronized String init(Context context,JSONObject configuration)throws Exception {
        silence();String appId=configuration.optString("sdkAppId"),appKey=configuration.optString("sdkAppKey");
        if(appId.isEmpty()||appKey.isEmpty())throw new IOException("ACCOUNT_CONFIG_NOT_IMPORTED");
        if(!appId.equals(initializedApp)){
            AcOpenAccountConfig config=new AcOpenAccountConfig$Builder().setAppI(appId).setAppK(appKey)
                .setBrand(AcOpenAccountConfig$Brand.BRAND_HEYTAP).setCountry("CN").setHost(Boolean.TRUE).create();
            if(config==null)throw new IOException("ACCOUNT_CONFIG_INVALID");
            AcAccountManager.init(OfficialUiResources.wrapAccount(context),config);initializedApp=appId;
        }
        return appId;
    }
    static void clearLocal(Context context){
        silence();
        com.oplus.accountsdk.open.core.storage.AcOpenStorageHelper.getInstance(context).cleanAllDB();
        com.oplus.aiunit.vision.rf.B().b(context);
        com.oplus.aiunit.vision.mc.b(context);
        initializedApp=null;
    }
    static JSONObject fresh(Context context,JSONObject configuration)throws Exception {
        String appId=init(context,configuration);
        AcApiResponse token=AcAccountManager.getClient(appId).getAccountToken();
        if(!token.isSuccess()||token.getData()==null)throw new IOException("ACCOUNT_SDK_TOKEN_"+token.getCode());
        AcApiResponse info=AcAccountManager.getClient(appId).getAccountInfo();
        if(!info.isSuccess()||info.getData()==null)throw new IOException("ACCOUNT_SDK_INFO_"+info.getCode());
        return new JSONObject(configuration.toString()).put("account",((AcAccountInfo)info.getData()).getSsoid())
            .put("token",((AcAccountToken)token.getData()).getToken()).put("deviceId",((AcAccountToken)token.getData()).getDeviceId())
            .put("source","independent-sdk").put("verifiedAt",0);
    }
    static void login(Activity activity,JSONObject configuration,Result result){
        try {
            String appId=init(activity,configuration);
            AcAccountManager.getClient(appId).login(activity,rawResponse->{
                AcApiResponse response=(AcApiResponse)rawResponse;
                if(!response.isSuccess()){result.done(null,new IOException("ACCOUNT_SDK_"+response.getCode()));return;}
                worker.execute(()->{
                    try{
                        JSONObject session=fresh(activity,configuration);
                        JSONObject verified=HealthAccountClient.login(session);result.done(verified,null);
                    }catch(Throwable failure){result.done(null,failure);}
                });
            });
        }catch(Throwable failure){result.done(null,failure);}
    }
}
