package com.heytap.usercenter.wrapper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.heytap.service.accountsdk.IStatistics;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.usercenter.accountsdk.AccountAgentInterface;
import com.heytap.usercenter.accountsdk.AccountResult;
import com.heytap.usercenter.accountsdk.helper.Constants;
import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.heytap.usercenter.accountsdk.utils.StatusCodeUtil;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.nearme.aidl.UserEntity;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.platform.usercenter.tools.env.IEnvConstant;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class SellModeAccountAgentWrapper extends Observable implements AccountAgentInterface {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_SELLACCOUNT_PROVIDER = "android.intent.action.ACTION_SELLACCOUNT_PROVIDER";
    private static final int CACHEACCOUNT_EXPIRE = 60000;
    private static final String SUCCESS = "0";
    SellModeAccount cacheAccount;
    private AccountAgentInterface delegate;
    private static final Object LOCK = new Object();
    private static final Uri SELLMODE_RETOKEN = Uri.parse("content://com.platform.usercenter.ac.sell.model.SellAccountProvider/reqToken");
    private static final Uri SELLMODE_DEL_TOKEN = Uri.parse("content://com.platform.usercenter.ac.sell.model.SellAccountProvider/delToken");
    private AtomicBoolean singleTaskCtl = new AtomicBoolean(false);
    private ThreadPoolExecutor singleExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(1), new ThreadFactory() { // from class: com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("SellModeAccountAgentWrapper-singleExecutor-name");
            return thread;
        }
    });

    public static abstract class AccountCallback implements Observer {
        Handler mainHandler;

        public AccountCallback() {
        }

        public abstract void callback(SellModeAccount sellModeAccount);

        @Override // java.util.Observer
        public void update(Observable observable, final Object obj) {
            Handler handler = this.mainHandler;
            if (handler != null) {
                Message.obtain(handler, new Runnable() { // from class: com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.AccountCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Object obj2 = obj;
                        if (obj2 instanceof SellModeAccount) {
                            AccountCallback.this.callback((SellModeAccount) obj2);
                        } else {
                            AccountCallback.this.callback(null);
                        }
                    }
                }).sendToTarget();
            } else if (obj instanceof SellModeAccount) {
                callback((SellModeAccount) obj);
            } else {
                callback(null);
            }
        }

        public AccountCallback(Handler handler) {
            this.mainHandler = handler;
        }
    }

    public static class LocalUserInfoDataSource {
        private static final String SP_NAME_ACCOUNT_USERINFO = "k_sp_account_userinfo";

        private LocalUserInfoDataSource() {
        }

        private static SharedPreferences getPackageSharedPreferences(Context context) {
            return context.getSharedPreferences(context.getPackageName() + "_suffix_sell_mode_share_preference", 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SellModeAccount getSellModeAccount(Context context) {
            try {
                String string = getPackageSharedPreferences(context).getString("k_sp_account_userinfo", null);
                if (!TextUtils.isEmpty(string)) {
                    return (SellModeAccount) new Gson().fromJson(string, SellModeAccount.class);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void saveSellModeAccount(Context context, SellModeAccount sellModeAccount) {
            if (sellModeAccount != null) {
                getPackageSharedPreferences(context).edit().putString("k_sp_account_userinfo", new Gson().toJson(sellModeAccount)).apply();
            }
        }
    }

    public static class SellModeAccount {
        private String imageUrl;
        private String isLoading;
        private String phoneNum;
        private long responseTime;
        private String ssoid;
        private String userName;
        private String userToken;

        public SellModeAccount(String str, String str2, String str3, String str4, String str5, String str6) {
            this.ssoid = str;
            this.userName = str2;
            this.userToken = str3;
            this.imageUrl = str4;
            this.isLoading = str5;
            this.phoneNum = str6;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getIsLoading() {
            return this.isLoading;
        }

        public String getPhoneNum() {
            return this.phoneNum;
        }

        public String getSsoid() {
            return this.ssoid;
        }

        public String getUserName() {
            return this.userName;
        }

        public String getUserToken() {
            return this.userToken;
        }

        public void setImageUrl(String str) {
            this.imageUrl = str;
        }

        public void setIsLoading(String str) {
            this.isLoading = str;
        }

        public void setPhoneNum(String str) {
            this.phoneNum = str;
        }

        public void setSsoid(String str) {
            this.ssoid = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public void setUserToken(String str) {
            this.userToken = str;
        }
    }

    public SellModeAccountAgentWrapper(AccountAgentInterface accountAgentInterface) {
        this.delegate = accountAgentInterface;
    }

    public static boolean isSellMode(Context context) {
        Intent intent = new Intent();
        intent.setAction(ACTION_SELLACCOUNT_PROVIDER);
        return context.getPackageManager().queryIntentContentProviders(intent, 0).size() > 0;
    }

    @SuppressLint({"HandlerLeak"})
    private static Handler provideHandler(final Handler handler, final int i) {
        return new Handler(Looper.getMainLooper()) { // from class: com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.5
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (handler == null) {
                    return;
                }
                Message messageObtain = Message.obtain((Handler) null, i);
                messageObtain.obj = message.obj;
                handler.sendMessage(messageObtain);
            }
        };
    }

    private void requestSellAccount(final Context context, AccountCallback accountCallback) {
        SellModeAccount sellModeAccountRequireSellAccount = requireSellAccount(context);
        if (sellModeAccountRequireSellAccount != null) {
            accountCallback.callback(sellModeAccountRequireSellAccount);
            return;
        }
        synchronized (LOCK) {
            addObserver(accountCallback);
        }
        if (this.singleTaskCtl.get()) {
            return;
        }
        this.singleTaskCtl.set(true);
        this.singleExecutor.execute(new Runnable() { // from class: com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                SellModeAccount sellModeAccountRequireSellAccount2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                do {
                    sellModeAccountRequireSellAccount2 = SellModeAccountAgentWrapper.this.requireSellAccount(context);
                    if (sellModeAccountRequireSellAccount2 == null) {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (sellModeAccountRequireSellAccount2 != null) {
                        break;
                    }
                } while (System.currentTimeMillis() - jCurrentTimeMillis < 10000);
                SellModeAccountAgentWrapper.this.singleTaskCtl.compareAndSet(true, false);
                SellModeAccountAgentWrapper.this.setChanged();
                synchronized (SellModeAccountAgentWrapper.LOCK) {
                    SellModeAccountAgentWrapper.this.notifyObservers(sellModeAccountRequireSellAccount2);
                    SellModeAccountAgentWrapper.this.deleteObservers();
                }
            }
        });
    }

    private AccountAgentInterface requireDelegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    public SellModeAccount requireSellAccount(Context context) {
        SellModeAccount sellModeAccount;
        if (this.cacheAccount != null && System.currentTimeMillis() - this.cacheAccount.responseTime < 60000) {
            return this.cacheAccount;
        }
        SellModeAccount sellModeAccount2 = LocalUserInfoDataSource.getSellModeAccount(context);
        this.cacheAccount = sellModeAccount2;
        if (sellModeAccount2 != null && System.currentTimeMillis() - this.cacheAccount.responseTime < 60000) {
            return this.cacheAccount;
        }
        synchronized (SellModeAccountAgentWrapper.class) {
            if (this.cacheAccount != null && System.currentTimeMillis() - this.cacheAccount.responseTime < 60000) {
                return this.cacheAccount;
            }
            SellModeAccount sellModeAccount3 = LocalUserInfoDataSource.getSellModeAccount(context);
            this.cacheAccount = sellModeAccount3;
            if (sellModeAccount3 != null && System.currentTimeMillis() - this.cacheAccount.responseTime < 60000) {
                return this.cacheAccount;
            }
            Cursor cursorQuery = context.getContentResolver().query(SELLMODE_RETOKEN, null, null, null, null);
            if (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("isLoading"));
                if ("0".equals(string)) {
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("ssoid"));
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("userName"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndex(SpeechConstant.KEY_USER_TOKEN));
                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndex("imageUrl"));
                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndex(DeepLinkInterpreter.KEY_PHONE_NUM));
                    if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string4)) {
                        sellModeAccount = null;
                    } else {
                        sellModeAccount = new SellModeAccount(string2, string3, string4, string5, string, string6);
                        this.cacheAccount = sellModeAccount;
                        sellModeAccount.responseTime = System.currentTimeMillis();
                        LocalUserInfoDataSource.saveSellModeAccount(context, sellModeAccount);
                    }
                } else {
                    sellModeAccount = null;
                }
            } else {
                sellModeAccount = null;
            }
            cursorQuery.close();
            return sellModeAccount == null ? this.cacheAccount : sellModeAccount;
        }
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public AccountEntity getAccountEntity(Context context, String str) {
        SellModeAccount sellModeAccountRequireSellAccount = requireSellAccount(context);
        if (sellModeAccountRequireSellAccount == null) {
            return null;
        }
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.authToken = sellModeAccountRequireSellAccount.getUserToken();
        accountEntity.accountName = sellModeAccountRequireSellAccount.getUserName();
        accountEntity.ssoid = sellModeAccountRequireSellAccount.getSsoid();
        return accountEntity;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getAccountName(Context context, String str) {
        return getUserName(context, str);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public AccountResult getAccountResult(Context context, String str) {
        SellModeAccount sellModeAccountRequireSellAccount = requireSellAccount(context);
        if (sellModeAccountRequireSellAccount == null) {
            AccountResult accountResult = new AccountResult();
            accountResult.setCanJump2Bind(false);
            accountResult.setOldUserName(getUserName(context, str));
            accountResult.setResultCode(Constants.REQ_NO_SUPPORT_ACCOUNTNAME);
            accountResult.setResultMsg("usercenter low version");
            return accountResult;
        }
        AccountResult accountResult2 = new AccountResult();
        accountResult2.setAccountName(sellModeAccountRequireSellAccount.getPhoneNum());
        accountResult2.setOldUserName(sellModeAccountRequireSellAccount.getUserName());
        accountResult2.setAvatar(sellModeAccountRequireSellAccount.getImageUrl());
        accountResult2.setResultCode(30001001);
        accountResult2.setResultMsg("success");
        return accountResult2;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void getSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        if (onreqaccountcallback != null) {
            SellModeAccount sellModeAccountRequireSellAccount = requireSellAccount(context);
            if (sellModeAccountRequireSellAccount == null) {
                SignInAccount signInAccount = new SignInAccount();
                signInAccount.isLogin = false;
                signInAccount.resultCode = "1001";
                signInAccount.resultMsg = StatusCodeUtil.matchResultMsg("1001");
                onreqaccountcallback.onReqFinish(signInAccount);
                return;
            }
            SignInAccount signInAccount2 = new SignInAccount();
            signInAccount2.isLogin = true;
            signInAccount2.resultCode = "2000";
            signInAccount2.resultMsg = StatusCodeUtil.matchResultMsg("2000");
            BasicUserInfo basicUserInfo = new BasicUserInfo();
            basicUserInfo.accountName = sellModeAccountRequireSellAccount.phoneNum;
            basicUserInfo.avatarUrl = sellModeAccountRequireSellAccount.imageUrl;
            basicUserInfo.userName = sellModeAccountRequireSellAccount.userName;
            basicUserInfo.ssoid = sellModeAccountRequireSellAccount.ssoid;
            signInAccount2.userInfo = basicUserInfo;
            signInAccount2.token = sellModeAccountRequireSellAccount.userToken;
            onreqaccountcallback.onReqFinish(signInAccount2);
        }
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getToken(Context context, String str) {
        SellModeAccount sellModeAccountRequireSellAccount = requireSellAccount(context);
        return sellModeAccountRequireSellAccount == null ? "" : sellModeAccountRequireSellAccount.userToken;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getUserName(Context context, String str) {
        SellModeAccount sellModeAccountRequireSellAccount = requireSellAccount(context);
        return sellModeAccountRequireSellAccount == null ? "" : sellModeAccountRequireSellAccount.getUserName();
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean hasUserCenterApp(Context context) {
        return requireDelegate().hasUserCenterApp(context);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void init(Context context, IStatistics iStatistics, IEnvConstant iEnvConstant) {
        requireDelegate().init(context, iStatistics, iEnvConstant);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isLogin(Context context, String str) {
        return true;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isSupportAccountCountry(Context context) {
        return false;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isVersionUpV320(Context context) {
        return requireDelegate().isVersionUpV320(context);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String reqAccountCountry(Context context) {
        return requireDelegate().reqAccountCountry(context);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqLogout(Context context, String str) {
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqReSignin(Context context, Handler handler, String str) {
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqSignInAccount(final Context context, final String str, final AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        if (onreqaccountcallback != null) {
            onreqaccountcallback.onReqStart();
            onreqaccountcallback.onReqLoading();
        }
        requestSellAccount(context, new AccountCallback(provideHandler(null, 40001000)) { // from class: com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.3
            @Override // com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.AccountCallback
            public void callback(SellModeAccount sellModeAccount) {
                SellModeAccountAgentWrapper.this.getSignInAccount(context, str, onreqaccountcallback);
            }
        });
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqToken(Context context, Handler handler, String str) {
        if (context == null || handler == null) {
            return;
        }
        final Handler handlerProvideHandler = provideHandler(handler, 40001000);
        requestSellAccount(context, new AccountCallback() { // from class: com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.2
            @Override // com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper.AccountCallback
            public void callback(SellModeAccount sellModeAccount) {
                if (sellModeAccount != null) {
                    Message message = new Message();
                    message.obj = new UserEntity(30001001, "success", sellModeAccount.phoneNum, sellModeAccount.userToken);
                    handlerProvideHandler.sendMessage(message);
                } else {
                    Message message2 = new Message();
                    message2.obj = new UserEntity(30001002, AcBaseTraceHelper.VAL_FAIL, "", "");
                    handlerProvideHandler.sendMessage(message2);
                }
            }
        });
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void sendSingleReqMessage(UserEntity userEntity) {
        requireDelegate().sendSingleReqMessage(userEntity);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void startAccountSettingActivity(Context context, String str) {
    }
}
