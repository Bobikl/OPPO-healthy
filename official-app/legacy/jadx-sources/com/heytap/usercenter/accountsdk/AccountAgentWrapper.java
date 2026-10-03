package com.heytap.usercenter.accountsdk;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import com.accountbase.k;
import com.heytap.service.accountsdk.AccountService;
import com.heytap.service.accountsdk.IStatistics;
import com.heytap.usercenter.accountsdk.AccountAgentWrapper;
import com.heytap.usercenter.accountsdk.helper.AccountHelper;
import com.heytap.usercenter.accountsdk.helper.AccountPrefUtils;
import com.heytap.usercenter.accountsdk.helper.Constants;
import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.heytap.usercenter.accountsdk.utils.StatusCodeUtil;
import com.nearme.aidl.UserEntity;
import com.oplus.aiunit.vision.nm;
import com.oplus.aiunit.vision.vk;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.core.mvvm.Resource;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.env.IEnvConstant;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentWrapper implements AccountAgentInterface {
    private static final String TAG = "AccountAgentWrapper ";
    private Handler mLocalReqHandlerRef;
    private int mVersionCode = -1;

    public class a extends Handler {
        final /* synthetic */ Handler a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, Handler handler, int i) {
            super(looper);
            this.a = handler;
            this.b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.a == null) {
                return;
            }
            Message messageObtain = Message.obtain((Handler) null, this.b);
            messageObtain.obj = message.obj;
            this.a.sendMessage(messageObtain);
        }
    }

    public class b extends Handler {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountNameTask.onReqAccountCallback f8349c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper, Context context, String str, AccountNameTask.onReqAccountCallback onreqaccountcallback) {
            super(looper);
            this.a = context;
            this.b = str;
            this.f8349c = onreqaccountcallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AccountAgentWrapper.this.handleLoginMessage(this.a, message, this.b, this.f8349c);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f8350c;

        public c(Context context, String str, Handler handler) {
            this.a = context;
            this.b = str;
            this.f8350c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AccountAgentWrapper.this.isLogin(this.a, this.b)) {
                AccountAgentWrapper.this.reqReSignin(this.a, this.f8350c, this.b);
            } else {
                AccountAgentWrapper.this.realReqToken(this.a, this.f8350c, this.b);
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ Handler a;
        final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8351c;

        public d(Handler handler, Context context, String str) {
            this.a = handler;
            this.b = context;
            this.f8351c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AccountAgentWrapper.this.mLocalReqHandlerRef = this.a;
                AccountHelper.startReqTokenActivity(this.b, this.f8351c, false, AccountAgentWrapper.this.isShowLoginPage());
            } catch (ActivityNotFoundException unused) {
                UCLogUtil.w(nm.SDK_TAG, "AccountAgentWrapper reqToken isSingleUserVersion isNotLogged ActivityNotFoundException");
                AccountAgentWrapper.this.sendUserMessage(this.a, new UserEntity(Constants.REQ_USERCENTER_NOT_EXIST, "usercenter is not exist!", "", ""));
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IAsyncTaskExecutor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountNameTask.onReqAccountCallback f8352c;
        final /* synthetic */ Context d;

        public class a implements Runnable {
            final /* synthetic */ IpcAccountEntity a;

            /* JADX INFO: renamed from: com.heytap.usercenter.accountsdk.AccountAgentWrapper$e$a$a, reason: collision with other inner class name */
            public class C0809a implements Observer<Resource<BasicUserInfo>> {
                public C0809a() {
                }

                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onChanged(Resource<BasicUserInfo> resource) {
                    a aVar = a.this;
                    e eVar = e.this;
                    AccountAgentWrapper.this.lambda$getSignInAccount$2(eVar.d, resource, aVar.a, eVar.f8352c);
                }
            }

            public a(IpcAccountEntity ipcAccountEntity) {
                this.a = ipcAccountEntity;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a != null) {
                    k.a().a(false, this.a).observeForever(new C0809a());
                    return;
                }
                UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper IPC account is null");
                SignInAccount signInAccount = new SignInAccount();
                signInAccount.isLogin = false;
                signInAccount.resultCode = "1004";
                signInAccount.resultMsg = StatusCodeUtil.matchResultMsg("1004");
                e.this.f8352c.onReqFinish(signInAccount);
            }
        }

        public e(String str, IAsyncTaskExecutor iAsyncTaskExecutor, AccountNameTask.onReqAccountCallback onreqaccountcallback, Context context) {
            this.a = str;
            this.b = iAsyncTaskExecutor;
            this.f8352c = onreqaccountcallback;
            this.d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.runOnMainThread(new a(com.accountbase.c.a().ipcEntity(this.a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLoginMessage(Context context, Message message, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        if (onreqaccountcallback == null) {
            UCLogUtil.e(nm.SDK_TAG, "AccountAgentWrapper please handleLoginMessage set callback");
            return;
        }
        UserEntity userEntity = (UserEntity) message.obj;
        if (userEntity != null && userEntity.getResult() == 30001001) {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper handleLoginMessage success");
            IAsyncTaskExecutor asyncTaskExecutor = UCDispatcherManager.getInstance().getAsyncTaskExecutor();
            asyncTaskExecutor.runOnAsyncExecutor(new e(str, asyncTaskExecutor, onreqaccountcallback, context));
        } else {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper handleLoginMessage failure");
            SignInAccount signInAccount = new SignInAccount();
            signInAccount.isLogin = false;
            signInAccount.resultCode = "1002";
            signInAccount.resultMsg = StatusCodeUtil.matchResultMsg("1002");
            onreqaccountcallback.onReqFinish(signInAccount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleUserInfo, reason: merged with bridge method [inline-methods] */
    public void lambda$getSignInAccount$2(@NonNull Context context, @NonNull Resource<BasicUserInfo> resource, @NonNull IpcAccountEntity ipcAccountEntity, @NonNull AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        if (Resource.isLoading(resource.status)) {
            onreqaccountcallback.onReqStart();
            onreqaccountcallback.onReqLoading();
            return;
        }
        if (Resource.isSuccessed(resource.status) && resource.data != null) {
            SignInAccount signInAccount = new SignInAccount();
            Log.i(TAG, "handleUserInfo account userInfo = success");
            signInAccount.isLogin = true;
            signInAccount.resultCode = "1000";
            signInAccount.resultMsg = StatusCodeUtil.matchResultMsg("1000");
            signInAccount.userInfo = resource.data;
            signInAccount.token = ipcAccountEntity.authToken;
            signInAccount.deviceId = ipcAccountEntity.deviceId;
            onreqaccountcallback.onReqFinish(signInAccount);
            return;
        }
        if (Resource.isError(resource.status)) {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountAgentWrapper handleUserInfo account isLogin = ");
            sb.append(resource.data != null);
            sb.append(" result = ");
            sb.append(resource.code);
            sb.append(resource.message);
            Log.i(nm.SDK_TAG, sb.toString());
            if ("3040".equals("" + resource.code)) {
                UCLogUtil.e(TAG, "token invalid, cache authToken");
                AccountPrefUtils.setString(context, vk.INVALID_TOKEN_MD_KEY, MD5Util.md5Hex(ipcAccountEntity.authToken));
            }
            if (resource.data == null) {
                SignInAccount signInAccount2 = new SignInAccount();
                signInAccount2.isLogin = false;
                signInAccount2.resultCode = "2001";
                signInAccount2.resultMsg = StatusCodeUtil.matchResultMsg("2001");
                onreqaccountcallback.onReqFinish(signInAccount2);
                return;
            }
            SignInAccount signInAccount3 = new SignInAccount();
            signInAccount3.isLogin = true;
            signInAccount3.resultCode = "2000";
            signInAccount3.resultMsg = StatusCodeUtil.matchResultMsg("2000");
            signInAccount3.userInfo = resource.data;
            signInAccount3.token = ipcAccountEntity.authToken;
            signInAccount3.deviceId = ipcAccountEntity.deviceId;
            onreqaccountcallback.onReqFinish(signInAccount3);
        }
    }

    private boolean isMultiAccountVersion(Context context) {
        return !isSingleUserVersion(context) && ApkInfoHelper.getVersionCode(context, UCCommonXor8Provider.getUCServicePackageName()) > 0 && getVersionCode(context) >= 230;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isShowLoginPage() {
        if (AccountAgentClient.get().getConfig() != null) {
            return AccountAgentClient.get().getConfig().mExtension.isShowAcPage();
        }
        return true;
    }

    private void jumpToUserCenter(Context context, String str) {
        try {
            context.startActivity(AccountHelper.getUserCenterIntent(context));
        } catch (ActivityNotFoundException e2) {
            UCLogUtil.e(TAG, e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSignInAccount$1(IpcAccountEntity ipcAccountEntity, AccountNameTask.onReqAccountCallback onreqaccountcallback, BasicUserInfo basicUserInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("getSignInAccount authToken is invalid, has local userInfo :");
        sb.append(basicUserInfo != null);
        UCLogUtil.e(TAG, sb.toString());
        SignInAccount signInAccount = new SignInAccount();
        if (basicUserInfo != null) {
            signInAccount.isLogin = true;
            signInAccount.userInfo = basicUserInfo;
            signInAccount.token = ipcAccountEntity.authToken;
        } else {
            signInAccount.isLogin = false;
        }
        signInAccount.resultCode = "3040";
        signInAccount.resultMsg = StatusCodeUtil.matchResultMsg("3040");
        onreqaccountcallback.onReqFinish(signInAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSignInAccount$3(final IpcAccountEntity ipcAccountEntity, final AccountNameTask.onReqAccountCallback onreqaccountcallback, final Context context, boolean z) {
        if (ipcAccountEntity == null) {
            SignInAccount signInAccount = new SignInAccount();
            signInAccount.isLogin = false;
            signInAccount.resultCode = "1001";
            signInAccount.resultMsg = StatusCodeUtil.matchResultMsg("1001");
            onreqaccountcallback.onReqFinish(signInAccount);
            return;
        }
        if (!TextUtils.equals(AccountPrefUtils.getString(context, vk.INVALID_TOKEN_MD_KEY), MD5Util.md5Hex(ipcAccountEntity.authToken))) {
            k.a().a(z, ipcAccountEntity).observeForever(new Observer() { // from class: com.oplus.aiunit.vision.im
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.lambda$getSignInAccount$2(context, ipcAccountEntity, onreqaccountcallback, (Resource) obj);
                }
            });
        } else {
            UCLogUtil.e(TAG, "getSignInAccount authToken is invalid");
            k.a().a(ipcAccountEntity).observeForever(new Observer() { // from class: com.oplus.aiunit.vision.hm
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    AccountAgentWrapper.lambda$getSignInAccount$1(ipcAccountEntity, onreqaccountcallback, (BasicUserInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSignInAccount$4(String str, IAsyncTaskExecutor iAsyncTaskExecutor, final AccountNameTask.onReqAccountCallback onreqaccountcallback, final Context context, final boolean z) {
        final IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity(str);
        iAsyncTaskExecutor.runOnMainThread(new Runnable() { // from class: com.oplus.aiunit.vision.gm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$getSignInAccount$3(ipcAccountEntityIpcEntity, onreqaccountcallback, context, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reqReSignin$0(Context context, String str) {
        AccountHelper.startReqSignInActivity(context, str, isShowLoginPage());
    }

    @SuppressLint({"HandlerLeak"})
    private static Handler provideHandler(Handler handler, int i) {
        return new a(Looper.getMainLooper(), handler, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realReqToken(Context context, Handler handler, String str) {
        Handler handlerProvideHandler = provideHandler(handler, 40001000);
        if (!isSingleUserVersion(context)) {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper reqToken isNotSingleUserVersion");
            this.mLocalReqHandlerRef = null;
            AccountService.initAgent();
            AccountService.reqToken(context, handlerProvideHandler, str);
            return;
        }
        IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity(str);
        StringBuilder sb = new StringBuilder();
        sb.append("AccountAgentWrapper reqToken isSingleUserVersion true, ");
        sb.append(ipcAccountEntityIpcEntity != null);
        UCLogUtil.i(nm.SDK_TAG, sb.toString());
        if (ipcAccountEntityIpcEntity == null) {
            handlerProvideHandler.post(new d(handlerProvideHandler, context, str));
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = new UserEntity(30001001, "success", ipcAccountEntityIpcEntity.accountName, ipcAccountEntityIpcEntity.authToken);
        handlerProvideHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendUserMessage(Handler handler, UserEntity userEntity) {
        if (handler == null) {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper sendUserMessage handler = null ");
            return;
        }
        UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper sendUserMessage success ");
        Message messageObtain = Message.obtain();
        messageObtain.obj = userEntity;
        handler.sendMessage(messageObtain);
        this.mLocalReqHandlerRef = null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public AccountEntity getAccountEntity(Context context, String str) {
        IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity(str);
        if (ipcAccountEntityIpcEntity == null) {
            return null;
        }
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.authToken = ipcAccountEntityIpcEntity.authToken;
        accountEntity.accountName = ipcAccountEntityIpcEntity.accountName;
        accountEntity.ssoid = ipcAccountEntityIpcEntity.ssoid;
        accountEntity.deviceId = ipcAccountEntityIpcEntity.deviceId;
        accountEntity.avatar = ipcAccountEntityIpcEntity.avatar;
        return accountEntity;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getAccountName(Context context, String str) {
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public AccountResult getAccountResult(Context context, String str) {
        if (getVersionCode(context) < 331) {
            boolean zIsLogin = com.accountbase.c.a().isLogin(str);
            AccountResult accountResult = new AccountResult();
            accountResult.setCanJump2Bind(false);
            if (zIsLogin) {
                accountResult.setOldUserName(getUserName(context, str));
                accountResult.setResultCode(Constants.REQ_NO_SUPPORT_ACCOUNTNAME);
                accountResult.setResultMsg("usercenter low version");
            } else {
                accountResult.setOldUserName(null);
                accountResult.setResultCode(30003042);
                accountResult.setResultMsg("usercenter has none account");
            }
            return accountResult;
        }
        IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity(str);
        AccountResult accountResult2 = new AccountResult();
        if (ipcAccountEntityIpcEntity != null) {
            accountResult2.setCanJump2Bind(true);
            accountResult2.setNeedBind(ipcAccountEntityIpcEntity.isNeed2Bind);
            accountResult2.setNameModified(ipcAccountEntityIpcEntity.isNameModified);
            accountResult2.setAccountName(ipcAccountEntityIpcEntity.showUserName);
            accountResult2.setOldUserName(ipcAccountEntityIpcEntity.accountName);
            accountResult2.setAvatar(ipcAccountEntityIpcEntity.avatar);
            accountResult2.setResultCode(30001001);
            accountResult2.setResultMsg("success");
        } else {
            accountResult2.setCanJump2Bind(false);
            accountResult2.setOldUserName(null);
            accountResult2.setResultCode(30003042);
            accountResult2.setResultMsg("usercenter has none account");
        }
        return accountResult2;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    @SuppressLint({"StaticFieldLeak"})
    public void getSignInAccount(final Context context, final String str, final AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        boolean zIsForeground;
        if (onreqaccountcallback == null) {
            UCLogUtil.e(nm.SDK_TAG, "AccountAgentWrapper please getSignInAccount set callback");
            return;
        }
        final IAsyncTaskExecutor asyncTaskExecutor = UCDispatcherManager.getInstance().getAsyncTaskExecutor();
        if (AccountAgentClient.get().getConfig() != null) {
            zIsForeground = AccountAgentClient.get().getConfig().mExtension.isForeground();
        } else {
            Log.w(nm.SDK_TAG, "do not AccountAgentClient.get().init, use default");
            zIsForeground = false;
        }
        final boolean z = zIsForeground;
        UCLogUtil.e(nm.SDK_TAG, "AccountAgentWrapper getSignInAccount is foreground " + z + ",pkgName=" + context.getPackageName() + ", getSignInAccount env:" + AccountSDKConfig.sEnv);
        asyncTaskExecutor.runOnAsyncExecutor(new Runnable() { // from class: com.oplus.aiunit.vision.jm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$getSignInAccount$4(str, asyncTaskExecutor, onreqaccountcallback, context, z);
            }
        });
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getToken(Context context, String str) {
        IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity(str);
        if (ipcAccountEntityIpcEntity != null) {
            return ipcAccountEntityIpcEntity.authToken;
        }
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getUserName(Context context, String str) {
        IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity(str);
        if (ipcAccountEntityIpcEntity != null) {
            return ipcAccountEntityIpcEntity.accountName;
        }
        return null;
    }

    public int getVersionCode(Context context) {
        if (this.mVersionCode < 0) {
            this.mVersionCode = AccountHelper.getUserCenterVersionCode(context);
        }
        return this.mVersionCode;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean hasUserCenterApp(Context context) {
        return getVersionCode(context) > 0;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void init(Context context, IStatistics iStatistics, IEnvConstant iEnvConstant) {
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isLogin(Context context, String str) {
        return com.accountbase.c.a().isLogin(str);
    }

    public boolean isSingleUserVersion(Context context) {
        if (this.mVersionCode < 0) {
            this.mVersionCode = AccountHelper.getUserCenterVersionCode(context);
        }
        return this.mVersionCode >= 300;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isSupportAccountCountry(Context context) {
        return !TextUtils.isEmpty(reqAccountCountry(context));
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isVersionUpV320(Context context) {
        if (this.mVersionCode < 0) {
            this.mVersionCode = AccountHelper.getUserCenterVersionCode(context);
        }
        return this.mVersionCode >= 320;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String reqAccountCountry(Context context) {
        IpcAccountEntity ipcAccountEntityIpcEntity = com.accountbase.c.a().ipcEntity("");
        if (ipcAccountEntityIpcEntity != null) {
            return ipcAccountEntityIpcEntity.country;
        }
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqLogout(Context context, String str) {
        if (isSingleUserVersion(context)) {
            jumpToUserCenter(context, str);
        } else {
            AccountService.jumpToFuc(context, str);
        }
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqReSignin(final Context context, Handler handler, final String str) {
        Handler handlerProvideHandler = provideHandler(handler, Constants.MSG_WHAT_UC_OPERATE_REFRESH);
        if (!isSingleUserVersion(context)) {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper reqReSignin isNotSingleUserVersion");
            AccountService.reqReSignin(context, handlerProvideHandler, str);
            return;
        }
        UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper reqReSignin isSingleUserVersion");
        try {
            this.mLocalReqHandlerRef = handlerProvideHandler;
            handlerProvideHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.fm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$reqReSignin$0(context, str);
                }
            });
        } catch (ActivityNotFoundException unused) {
            UCLogUtil.w(nm.SDK_TAG, "AccountAgentWrapper reqReSignin isSingleUserVersion ActivityNotFoundException");
            sendUserMessage(handlerProvideHandler, new UserEntity(Constants.REQ_USERCENTER_NOT_EXIST, "usercenter is not exist!", "", ""));
        }
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    @SuppressLint({"HandlerLeak"})
    public void reqSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        if (onreqaccountcallback == null) {
            throw new RuntimeException("please reqSignInAccount set callback");
        }
        UCLogUtil.i(TAG, "reqSignInAccount start pkgName = " + context.getPackageName());
        onreqaccountcallback.onReqStart();
        onreqaccountcallback.onReqLoading();
        UCDispatcherManager.getInstance().getAsyncTaskExecutor().runOnAsyncExecutor(new c(context, str, new b(Looper.getMainLooper(), context, str, onreqaccountcallback)));
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqToken(Context context, Handler handler, String str) {
        if (handler == null) {
            throw new RuntimeException("reqToken method please set handler");
        }
        realReqToken(context, handler, str);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void sendSingleReqMessage(UserEntity userEntity) {
        UCLogUtil.i(nm.SDK_TAG, "AccountAgentWrapper sendSingleReqMessage");
        Handler handler = this.mLocalReqHandlerRef;
        if (handler != null) {
            sendUserMessage(handler, userEntity);
        }
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void startAccountSettingActivity(Context context, String str) {
        if (isSingleUserVersion(context)) {
            jumpToUserCenter(context, str);
        } else {
            AccountService.jumpToFuc(context, "");
        }
    }
}
