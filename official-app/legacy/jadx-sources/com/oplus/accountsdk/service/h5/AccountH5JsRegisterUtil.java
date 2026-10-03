package com.oplus.accountsdk.service.h5;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.account.AcAccountManager;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.config.AcAccountConfig;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.sdk.verifysystembasic.AcVerifyAgent;
import com.oplus.accountsdk.base.sdk.verifysystembasic.callback.VerifySysCallBack;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.AcVerifyResultData;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.VerifyParam;
import com.oplus.accountsdk.service.account.BuildConfig;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.i8;
import com.oplus.aiunit.vision.il9;
import com.oplus.aiunit.vision.l7;
import com.oplus.aiunit.vision.xa;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountH5JsRegisterUtil {
    private static final String JS_CALLBACK_NAME = "window.HeytapAccountSdkJsApi";
    private static final String JS_INTERFACE_NAME = "HeytapAccountSdkNativeApi";
    private static final String METHOD_GET_ACCOUNT_INFO = "accountsdk.getAccountInfo";
    private static final String METHOD_GET_ACCOUNT_VERSION = "accountsdk.getAccountVersion";
    private static final String METHOD_GET_ID_SDK_VERSION = "accountsdk.getIdSdkVersion";
    private static final String METHOD_GET_TOKEN = "accountsdk.getAccountToken";
    private static final String METHOD_GET_V1_TOKEN = "accountsdk.getV1Token";
    private static final String METHOD_INIT = "accountsdk.init";
    private static final String METHOD_INVOKE_IDENTIFY_ENGINE = "accountsdk.invokeIdentifyEngine";
    private static final String METHOD_IS_LOGIN = "accountsdk.isLogin";
    private static final String METHOD_LOGIN = "accountsdk.login";
    private static final String METHOD_REFRESH = "accountsdk.refresh";
    private static final String TAG = "AccountH5JsRegisterUtil";
    private static Handler mHandler;

    @Keep
    public class AcH5BizInfo {
        public String appI;

        public AcH5BizInfo() {
        }
    }

    @Keep
    public static class AccountH5JsInterface {
        private final Context mContext;
        private final WebView mWebView;

        public class a implements VerifySysCallBack {
            public final /* synthetic */ String a;

            public a(String str) {
                this.a = str;
            }

            @Override // com.oplus.accountsdk.base.sdk.verifysystembasic.callback.VerifySysCallBack
            public void callBack(AcVerifyResultData acVerifyResultData) {
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleCallIdentifyEngine: verify callback, code: " + acVerifyResultData.getCode() + ", msg: " + acVerifyResultData.getMsg());
                AccountH5JsInterface.this.sendSuccessCallback(this.a, new AcApiResponse(acVerifyResultData.getCode(), acVerifyResultData.getMsg(), acVerifyResultData));
            }
        }

        public AccountH5JsInterface(Context context, WebView webView) {
            this.mContext = context;
            this.mWebView = webView;
        }

        private void handleCallIdentifyEngine(String str, String str2) {
            Activity activity;
            IdentifyEngineParam identifyEngineParam = (IdentifyEngineParam) xa.c(str, IdentifyEngineParam.class);
            if (identifyEngineParam == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleCallIdentifyEngine: param is null, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            if (TextUtils.isEmpty(identifyEngineParam.appI) || TextUtils.isEmpty(identifyEngineParam.businessId) || TextUtils.isEmpty(identifyEngineParam.operateType)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleCallIdentifyEngine: required params missing");
                sendErrorCallback(str2, "Required params missing: appI, businessId ,operateType");
                return;
            }
            if (this.mWebView.getContext() instanceof Activity) {
                activity = (Activity) this.mWebView.getContext();
            } else {
                Context context = this.mContext;
                activity = context instanceof Activity ? (Activity) context : null;
            }
            if (activity == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleCallIdentifyEngine: required need activity");
                sendErrorCallback(str2, "required need activity");
                return;
            }
            AcAccountConfig acAccountConfigA = i8.a(identifyEngineParam.appI);
            if (acAccountConfigA == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleCallIdentifyEngine: client is null for appI: " + identifyEngineParam.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            VerifyParam.Builder builderOperateType = new VerifyParam.Builder().appI(identifyEngineParam.appI).bizk(acAccountConfigA.getAppK()).bizs(identifyEngineParam.bizs).businessId(identifyEngineParam.businessId).operateType(identifyEngineParam.operateType);
            if (!TextUtils.isEmpty(identifyEngineParam.userToken)) {
                builderOperateType.userToken(identifyEngineParam.userToken);
            }
            if (!TextUtils.isEmpty(identifyEngineParam.requestCode)) {
                builderOperateType.requestCode(identifyEngineParam.requestCode);
            }
            if (!TextUtils.isEmpty(identifyEngineParam.extraCallbackScene)) {
                builderOperateType.extraCallbackScene(identifyEngineParam.extraCallbackScene);
            }
            try {
                AcVerifyAgent.startVerifyForResult(activity, builderOperateType.create(), new a(str2));
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountInfo: failed for appI: " + identifyEngineParam.appI, e2);
                sendErrorCallback(str2, "handleCallIdentifyEngine failed: " + e2.getMessage());
            }
        }

        private void handleGetAccountInfo(String str, String str2) {
            AcH5BizInfo acH5BizInfo = (AcH5BizInfo) xa.c(str, AcH5BizInfo.class);
            if (acH5BizInfo == null || TextUtils.isEmpty(acH5BizInfo.appI)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountInfo: bean is null or appI is empty, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            il9 client = AcAccountManager.getClient(acH5BizInfo.appI);
            if (client == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountInfo: client is null for appI: " + acH5BizInfo.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            try {
                AcApiResponse<AcAccountInfo> accountInfo = client.getAccountInfo();
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleGetAccountInfo: get account info result for appI: " + acH5BizInfo.appI + ", code: " + accountInfo.getCode());
                sendSuccessCallback(str2, accountInfo);
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountInfo: get account info failed for appI: " + acH5BizInfo.appI, e2);
                sendErrorCallback(str2, "Get account info failed: " + e2.getMessage());
            }
        }

        private void handleGetAccountToken(String str, String str2) {
            AcH5BizInfo acH5BizInfo = (AcH5BizInfo) xa.c(str, AcH5BizInfo.class);
            if (acH5BizInfo == null || TextUtils.isEmpty(acH5BizInfo.appI)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountToken: bean is null or appI is empty, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            il9 client = AcAccountManager.getClient(acH5BizInfo.appI);
            if (client == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountToken: client is null for appI: " + acH5BizInfo.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            try {
                AcApiResponse<AcAccountToken> accountToken = client.getAccountToken();
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleGetAccountToken: get token result for appI: " + acH5BizInfo.appI + ", code: " + accountToken.getCode());
                sendSuccessCallback(str2, accountToken);
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetAccountToken: get token failed for appI: " + acH5BizInfo.appI, e2);
                sendErrorCallback(str2, "Get token failed: " + e2.getMessage());
            }
        }

        private void handleGetAccountVersion(String str) {
            int iB = l7.b(this.mContext);
            AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleGetAccountVersion: get account version result for appI: , version: " + iB);
            ResponseEnum responseEnum = ResponseEnum.SUCCESS;
            sendSuccessCallback(str, new AcApiResponse<>(responseEnum.getCode(), responseEnum.getRemark(), Integer.valueOf(iB)));
        }

        private void handleGetIdSdkVersion(String str) {
            AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleGetIdSdkVersion: get id sdk version result: " + BuildConfig.VERSION_CODE);
            ResponseEnum responseEnum = ResponseEnum.SUCCESS;
            sendSuccessCallback(str, new AcApiResponse<>(responseEnum.getCode(), responseEnum.getRemark(), Integer.valueOf(BuildConfig.VERSION_CODE)));
        }

        private void handleGetV1Token(String str, String str2) {
            AcH5BizInfo acH5BizInfo = (AcH5BizInfo) xa.c(str, AcH5BizInfo.class);
            if (acH5BizInfo == null || TextUtils.isEmpty(acH5BizInfo.appI)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetV1Token: bean is null or appI is empty, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            il9 client = AcAccountManager.getClient(acH5BizInfo.appI);
            if (client == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetV1Token: client is null for appI: " + acH5BizInfo.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            try {
                AcApiResponse<AcAccountToken> v1Token = client.getV1Token();
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleGetV1Token: get V1 token result for appI: " + acH5BizInfo.appI + ", code: " + v1Token.getCode());
                sendSuccessCallback(str2, v1Token);
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleGetV1Token: get V1 token failed for appI: " + acH5BizInfo.appI, e2);
                sendErrorCallback(str2, "Get V1 token failed: " + e2.getMessage());
            }
        }

        private void handleInit(String str, String str2) {
            AcAccountConfig acAccountConfig = (AcAccountConfig) xa.c(str, AcAccountConfig.class);
            if (acAccountConfig == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleInit: config is null, arguments: " + str);
                sendErrorCallback(str2, "Config format error: " + str);
                return;
            }
            try {
                AcAccountManager.init(this.mContext, acAccountConfig);
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleInit: init success for appI: " + acAccountConfig.getAppI());
                sendSuccessCallback(str2, null);
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleInit: init failed", e2);
                sendErrorCallback(str2, "Init failed: " + e2.getMessage());
            }
        }

        private void handleIsLogin(String str, String str2) {
            AcH5BizInfo acH5BizInfo = (AcH5BizInfo) xa.c(str, AcH5BizInfo.class);
            if (acH5BizInfo == null || TextUtils.isEmpty(acH5BizInfo.appI)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleIsLogin: bean is null or appI is empty, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            il9 client = AcAccountManager.getClient(acH5BizInfo.appI);
            if (client == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleIsLogin: client is null for appI: " + acH5BizInfo.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            try {
                boolean zIsLogin = client.isLogin();
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleIsLogin: isLogin result for appI: " + acH5BizInfo.appI + ", isLogin: " + zIsLogin);
                IsLoginResult isLoginResult = new IsLoginResult();
                isLoginResult.isLogin = zIsLogin;
                ResponseEnum responseEnum = ResponseEnum.SUCCESS;
                sendSuccessCallback(str2, new AcApiResponse<>(responseEnum.getCode(), responseEnum.getRemark(), isLoginResult));
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleIsLogin: check login status failed for appI: " + acH5BizInfo.appI, e2);
                sendErrorCallback(str2, "Check login status failed: " + e2.getMessage());
            }
        }

        private void handleLogin(String str, final String str2) {
            final AcH5BizInfo acH5BizInfo = (AcH5BizInfo) xa.c(str, AcH5BizInfo.class);
            if (acH5BizInfo == null || TextUtils.isEmpty(acH5BizInfo.appI)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleLogin: bean is null or appI is empty, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            il9 client = AcAccountManager.getClient(acH5BizInfo.appI);
            if (client == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleLogin: client is null for appI: " + acH5BizInfo.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            try {
                client.login(this.mContext, new c8() { // from class: com.oplus.accountsdk.service.h5.b
                    @Override // com.oplus.aiunit.vision.c8
                    public final void call(Object obj) {
                        this.a.lambda$handleLogin$0(acH5BizInfo, str2, (AcApiResponse) obj);
                    }
                });
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleLogin: login failed for appI: " + acH5BizInfo.appI, e2);
                sendErrorCallback(str2, "Login failed: " + e2.getMessage());
            }
        }

        private void handleRefresh(String str, String str2) {
            AcH5BizInfo acH5BizInfo = (AcH5BizInfo) xa.c(str, AcH5BizInfo.class);
            if (acH5BizInfo == null || TextUtils.isEmpty(acH5BizInfo.appI)) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleRefresh: bean is null or appI is empty, arguments: " + str);
                sendErrorCallback(str2, "Arguments format error: " + str);
                return;
            }
            il9 client = AcAccountManager.getClient(acH5BizInfo.appI);
            if (client == null) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleRefresh: client is null for appI: " + acH5BizInfo.appI);
                sendErrorCallback(str2, "Please init first");
                return;
            }
            try {
                AcApiResponse<String> acApiResponseRefresh = client.refresh();
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleRefresh: refresh token result for appI: " + acH5BizInfo.appI + ", code: " + acApiResponseRefresh.getCode());
                sendSuccessCallback(str2, acApiResponseRefresh);
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "handleRefresh: refresh token failed for appI: " + acH5BizInfo.appI, e2);
                sendErrorCallback(str2, "Refresh token failed: " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleLogin$0(AcH5BizInfo acH5BizInfo, String str, AcApiResponse acApiResponse) {
            AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "handleLogin: login result for appI: " + acH5BizInfo.appI + ", code: " + acApiResponse.getCode());
            sendSuccessCallback(str, acApiResponse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendCallback$1(String str, AcApiResponse acApiResponse) {
            try {
                String str2 = "window.HeytapAccountSdkJsApi.callback('" + str + "', " + xa.d(acApiResponse) + ");";
                this.mWebView.evaluateJavascript(str2, null);
                AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "sendCallback: " + str2);
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "sendCallback error: " + e2.getMessage(), e2);
            }
        }

        private void sendCallback(final String str, final AcApiResponse<?> acApiResponse) {
            if (AccountH5JsRegisterUtil.mHandler != null) {
                AccountH5JsRegisterUtil.mHandler.post(new Runnable() { // from class: com.oplus.accountsdk.service.h5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$sendCallback$1(str, acApiResponse);
                    }
                });
            }
        }

        private void sendErrorCallback(String str, String str2) {
            sendCallback(str, new AcApiResponse<>(2, str2, null));
        }

        private void sendNotSupportCallback(String str, String str2) {
            sendCallback(str, new AcApiResponse<>(1, "Unknown method: " + str2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendSuccessCallback(String str, AcApiResponse<?> acApiResponse) {
            sendCallback(str, new AcApiResponse<>(0, "success", acApiResponse));
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0097  */
        @JavascriptInterface
        @Keep
        public boolean invoke(String str, String str2, String str3) {
            AcLogUtil.i(AccountH5JsRegisterUtil.TAG, "invoke method: " + str + ", arguments: " + str2 + ", callbackId: " + str3);
            try {
                switch (str) {
                    case "accountsdk.init":
                        handleInit(str2, str3);
                        return true;
                    case "accountsdk.getAccountToken":
                        handleGetAccountToken(str2, str3);
                        return true;
                    case "accountsdk.isLogin":
                        handleIsLogin(str2, str3);
                        return true;
                    case "accountsdk.getAccountInfo":
                        handleGetAccountInfo(str2, str3);
                        return true;
                    case "accountsdk.getAccountVersion":
                        handleGetAccountVersion(str3);
                        return true;
                    case "accountsdk.getIdSdkVersion":
                        handleGetIdSdkVersion(str3);
                        return true;
                    case "accountsdk.invokeIdentifyEngine":
                        handleCallIdentifyEngine(str2, str3);
                        return true;
                    case "accountsdk.login":
                        handleLogin(str2, str3);
                        return true;
                    case "accountsdk.getV1Token":
                        handleGetV1Token(str2, str3);
                        return true;
                    case "accountsdk.refresh":
                        handleRefresh(str2, str3);
                        return true;
                    default:
                        AcLogUtil.w(AccountH5JsRegisterUtil.TAG, "Unknown method: " + str);
                        sendNotSupportCallback(str3, str);
                        return false;
                }
            } catch (Exception e2) {
                AcLogUtil.e(AccountH5JsRegisterUtil.TAG, "invoke error: " + e2.getMessage(), e2);
                sendErrorCallback(str3, "Internal error: " + e2.getMessage());
                return false;
            }
        }
    }

    @Keep
    public static class IdentifyEngineParam {
        public String appI;
        public String bizs;
        public String businessId;
        public String extraCallbackScene;
        public String operateType;
        public String requestCode;
        public String userToken;
    }

    @Keep
    public static class IsLoginResult {
        public boolean isLogin;
    }

    public static void registerAccountJs(Context context, WebView webView) {
        if (context == null || webView == null) {
            AcLogUtil.e(TAG, "registerAccountJs: context or webView is null");
            return;
        }
        if (mHandler == null) {
            mHandler = new Handler(Looper.getMainLooper());
        }
        webView.addJavascriptInterface(new AccountH5JsInterface(context, webView), JS_INTERFACE_NAME);
        AcLogUtil.i(TAG, "registerAccountJs: JavaScript interface registered successfully");
    }
}
