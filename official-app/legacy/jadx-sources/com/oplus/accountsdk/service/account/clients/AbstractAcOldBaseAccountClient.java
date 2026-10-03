package com.oplus.accountsdk.service.account.clients;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.AccountAgentInterface;
import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.bj;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.zj;
import com.platform.usercenter.account.ams.bean.AcLoginParam;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractAcOldBaseAccountClient extends AcBaseAccountClient {
    private final String appI;
    protected Object mWrapper;

    public class a implements AccountNameTask.onReqAccountCallback<SignInAccount> {
        public final /* synthetic */ String a;
        public final /* synthetic */ c8 b;

        public a(String str, c8 c8Var) {
            this.a = str;
            this.b = c8Var;
        }

        @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReqFinish(SignInAccount signInAccount) {
            if (signInAccount == null) {
                AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "login, request login but result is null", this.a);
                this.b.call(new AcApiResponse(ResponseEnum.REMOTE_DATA_NULL, null));
                return;
            }
            if (signInAccount.isLogin) {
                if (TextUtils.isEmpty(signInAccount.token)) {
                    AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "login, request login fail, token is null", this.a);
                    this.b.call(new AcApiResponse(ResponseEnum.REMOTE_DATA_NULL, null));
                    return;
                } else {
                    AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "login success.", this.a);
                    this.b.call(new AcApiResponse(ResponseEnum.SUCCESS, null));
                    return;
                }
            }
            String str = signInAccount.resultCode;
            String str2 = signInAccount.resultMsg;
            int iB = bj.b(str);
            AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "login, request login fail, originCode:" + str + " newCode:" + iB + " msg:" + str2, this.a);
            this.b.call(new AcApiResponse(iB, str2, null));
        }

        @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
        public void onReqLoading() {
            AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "login, onReqLoading..", this.a);
        }

        @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
        public void onReqStart() {
            AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "login, onReqStart..", this.a);
        }
    }

    public class b implements c8<zj.d<AcApiResponse<AcAccountInfo>>> {
        public final /* synthetic */ String a;

        public class a implements c8<AcApiResponse<AcAccountInfo>> {
            public final /* synthetic */ zj.d a;

            public a(zj.d dVar) {
                this.a = dVar;
            }

            @Override // com.oplus.aiunit.vision.c8
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(AcApiResponse<AcAccountInfo> acApiResponse) {
                this.a.a(acApiResponse);
            }
        }

        public b(String str) {
            this.a = str;
        }

        @Override // com.oplus.aiunit.vision.c8
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(zj.d<AcApiResponse<AcAccountInfo>> dVar) {
            AbstractAcOldBaseAccountClient.this.getAccountInfoAsyc(this.a, new a(dVar));
        }
    }

    public class c implements AccountNameTask.onReqAccountCallback<SignInAccount> {
        public final /* synthetic */ String a;
        public final /* synthetic */ c8 b;

        public c(String str, c8 c8Var) {
            this.a = str;
            this.b = c8Var;
        }

        @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReqFinish(SignInAccount signInAccount) {
            if (signInAccount == null) {
                AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "getAccountInfo, request AccountInfo but result is null", this.a);
                this.b.call(new AcApiResponse(ResponseEnum.REMOTE_DATA_NULL, null));
                return;
            }
            if (!signInAccount.isLogin) {
                String str = signInAccount.resultCode;
                String str2 = signInAccount.resultMsg;
                int iB = bj.b(str);
                AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "getAccountInfo, request AccountInfo fail, originCode:" + str + " newCode:" + iB + " msg:" + str2, this.a);
                this.b.call(new AcApiResponse(iB, str2, null));
                return;
            }
            BasicUserInfo basicUserInfo = signInAccount.userInfo;
            if (basicUserInfo == null) {
                AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "userInfo is null", this.a);
                this.b.call(new AcApiResponse(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null));
                return;
            }
            AcAccountInfo acAccountInfo = new AcAccountInfo(basicUserInfo.avatarUrl, basicUserInfo.userName, basicUserInfo.accountName, basicUserInfo.ssoid);
            acAccountInfo.setSex(basicUserInfo.gender);
            acAccountInfo.setClassifyByAge(basicUserInfo.classifyByAge);
            acAccountInfo.setStatus(basicUserInfo.status);
            acAccountInfo.setMaskedEmail(basicUserInfo.boundEmail);
            acAccountInfo.setMaskedMobile(basicUserInfo.boundPhone);
            acAccountInfo.setCountry(basicUserInfo.country);
            acAccountInfo.setNameHasModified(basicUserInfo.userNameNeedModify);
            acAccountInfo.setRegisterTime(basicUserInfo.registerTime);
            this.b.call(new AcApiResponse(ResponseEnum.SUCCESS, acAccountInfo));
        }

        @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
        public void onReqLoading() {
            AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "realGetAccountInfo loading..", this.a);
        }

        @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
        public void onReqStart() {
            AcLogUtil.i(AbstractAcOldBaseAccountClient.this.getTag(), "realGetAccountInfo start..", this.a);
        }
    }

    public AbstractAcOldBaseAccountClient(String str, Context context) {
        super(context);
        this.mWrapper = null;
        this.appI = str;
    }

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountInfo> getAccountInfo() {
        String strCreateTraceId = AcBaseTraceHelper.createTraceId(this.appI);
        AcLogUtil.i(getTag(), "getAccountInfo start by " + this.appI, strCreateTraceId);
        if (zj.a().d()) {
            AcLogUtil.e(getTag(), "getAccountInfo error: main thread", strCreateTraceId);
            return new AcApiResponse<>(ResponseEnum.ERROR_RUN_IN_MAIN_THREAD, null);
        }
        AcApiResponse<AcAccountInfo> acApiResponseIsSupport = isSupport();
        if (!acApiResponseIsSupport.isSuccess()) {
            AcLogUtil.e(getTag(), "getAccountInfo, mWrapper is null", strCreateTraceId);
            return acApiResponseIsSupport;
        }
        AcApiResponse<AcAccountInfo> acApiResponse = (AcApiResponse) zj.a().e(10000L, new b(strCreateTraceId));
        if (acApiResponse != null) {
            return acApiResponse;
        }
        AcLogUtil.e(getTag(), "runInBlock error, unkonwn error", strCreateTraceId);
        return new AcApiResponse<>(ResponseEnum.ERROR_REQUEST_TIMEOUT, null);
    }

    public void getAccountInfoAsyc(String str, c8<AcApiResponse<AcAccountInfo>> c8Var) {
        ((AccountAgentInterface) this.mWrapper).getSignInAccount(this.mContext, "", new c(str, c8Var));
    }

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountToken> getAccountToken() {
        AcApiResponse<AcAccountToken> acApiResponseIsSupport = isSupport();
        String strCreateTraceId = AcBaseTraceHelper.createTraceId(this.appI);
        AcLogUtil.i(getTag(), "getAccountToken start by " + this.appI, strCreateTraceId);
        if (!acApiResponseIsSupport.isSuccess()) {
            AcLogUtil.e(getTag(), "getAccountToken, mWrapper is null", strCreateTraceId);
            return acApiResponseIsSupport;
        }
        if (zj.a().d()) {
            AcLogUtil.e(getTag(), "can not getAccountToken in main thread", strCreateTraceId);
            return new AcApiResponse<>(ResponseEnum.ERROR_RUN_IN_MAIN_THREAD, null);
        }
        String token = ((AccountAgentInterface) this.mWrapper).getToken(this.mContext, "");
        if (TextUtils.isEmpty(token)) {
            AcLogUtil.i(getTag(), "getAccountToken, token is empty", strCreateTraceId);
            return new AcApiResponse<>(ResponseEnum.ERROR_NOT_AUTH, null);
        }
        return new AcApiResponse<>(ResponseEnum.SUCCESS, new AcAccountToken(token, "", ""));
    }

    public abstract ResponseEnum getNotSupportResult();

    public abstract String getTag();

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountToken> getV1Token() {
        AcApiResponse<AcAccountToken> acApiResponseIsSupport = isSupport();
        String strCreateTraceId = AcBaseTraceHelper.createTraceId(this.appI);
        AcLogUtil.i(getTag(), "getV1Token start by " + this.appI, strCreateTraceId);
        if (!acApiResponseIsSupport.isSuccess()) {
            AcLogUtil.e(getTag(), "getV1Token, mWrapper is null", strCreateTraceId);
            return acApiResponseIsSupport;
        }
        String token = ((AccountAgentInterface) this.mWrapper).getToken(this.mContext, "");
        if (TextUtils.isEmpty(token)) {
            AcLogUtil.i(getTag(), "getV1Token, token is empty", strCreateTraceId);
            return new AcApiResponse<>(ResponseEnum.ERROR_NOT_AUTH, null);
        }
        return new AcApiResponse<>(ResponseEnum.SUCCESS, new AcAccountToken(token, "", ""));
    }

    public abstract void initWrapper();

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public boolean isLogin() {
        AcApiResponse acApiResponseIsSupport = isSupport();
        String strCreateTraceId = AcBaseTraceHelper.createTraceId(this.appI);
        AcLogUtil.i(getTag(), "start login by " + this.appI, strCreateTraceId);
        if (acApiResponseIsSupport.isSuccess()) {
            return !TextUtils.isEmpty(((AccountAgentInterface) this.mWrapper).getToken(this.mContext, ""));
        }
        AcLogUtil.e(getTag(), "isLogin, mWrapper is null", strCreateTraceId);
        return false;
    }

    public <T> AcApiResponse<T> isSupport() {
        return this.mWrapper == null ? new AcApiResponse<>(getNotSupportResult(), null) : new AcApiResponse<>(ResponseEnum.SUCCESS, null);
    }

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public void login(Context context, c8<AcApiResponse<String>> c8Var) {
        AcApiResponse<String> acApiResponseIsSupport = isSupport();
        String strCreateTraceId = AcBaseTraceHelper.createTraceId(this.appI);
        AcLogUtil.i(getTag(), "start login by " + this.appI, strCreateTraceId);
        if (acApiResponseIsSupport.isSuccess()) {
            ((AccountAgentInterface) this.mWrapper).reqSignInAccount(context, "", new a(strCreateTraceId, c8Var));
        } else {
            AcLogUtil.e(getTag(), "login, mWrapper is null", strCreateTraceId);
            c8Var.call(acApiResponseIsSupport);
        }
    }

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public AcApiResponse<String> refresh() {
        return new AcApiResponse<>(ResponseEnum.REMOTE_REQ_TYPE_ILLEGAL, null);
    }

    @Override // com.oplus.accountsdk.service.account.clients.AcBaseAccountClient, com.oplus.aiunit.vision.il9
    public void login(Context context, AcLoginParam acLoginParam, c8<AcApiResponse<String>> c8Var) {
        login(context, c8Var);
    }
}
