package com.platform.sdk.center.webview.interceptor;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.d68;
import com.oplus.aiunit.vision.ho3;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class UwsGetTokenInterceptorImpl extends d68 {

    public interface SignInAccountCallback {
        void onReqInfo(SignInAccount signInAccount);
    }

    public final void a(MutableLiveData mutableLiveData, SignInAccount signInAccount) {
        ho3 ho3VarC;
        if (signInAccount == null || signInAccount.userInfo == null) {
            ho3VarC = ho3.c(new JSONObject());
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                BasicUserInfo basicUserInfo = signInAccount.userInfo;
                String str = basicUserInfo.ssoid;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("ssoid", str);
                String str3 = signInAccount.token;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("authToken", str3);
                String str4 = signInAccount.token;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject.put("secondaryToken", str4);
                String str5 = basicUserInfo.accountName;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put(AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, str5);
                String str6 = basicUserInfo.country;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("country", str6);
                String str7 = basicUserInfo.classifyByAge;
                if (str7 != null) {
                    str2 = str7;
                }
                jSONObject.put("classifyByAge", str2);
                ho3VarC = ho3.c(jSONObject);
            } catch (JSONException e2) {
                UCLogUtil.e("UwsGetTokenInterceptorImpl", e2);
                ho3VarC = ho3.b(e2.getMessage());
            }
        }
        mutableLiveData.postValue(ho3VarC);
    }

    @Override // com.oplus.aiunit.vision.d68
    public final LiveData<ho3<JSONObject>> getUserEntity(Context context) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        if (context != null) {
            AccountAgent.getSignInAccount(context, "", new a(new SignInAccountCallback() { // from class: com.oplus.aiunit.vision.bsk
                @Override // com.platform.sdk.center.webview.interceptor.UwsGetTokenInterceptorImpl.SignInAccountCallback
                public final void onReqInfo(SignInAccount signInAccount) {
                    this.a.a(mutableLiveData, signInAccount);
                }
            }));
        }
        return mutableLiveData;
    }
}
