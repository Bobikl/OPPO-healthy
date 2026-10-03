package com.lifesense.device.scale.login;

import android.text.TextUtils;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LoginResponse extends JsonResponse {
    public LoginEntity loginEntity = null;
    public User user = null;

    public LoginEntity getLoginEntity() {
        return this.loginEntity;
    }

    public User getUser() {
        return this.user;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("userId"))) {
            return;
        }
        LoginEntity loginEntity = new LoginEntity();
        this.loginEntity = loginEntity;
        loginEntity.setAccessToken(jSONObject.optString("accessToken"));
        this.loginEntity.setUserId(jSONObject.optString("userId"));
        this.loginEntity.setNeedInfo(jSONObject.optBoolean("needInfo"));
    }

    public void setUser(User user) {
        this.user = user;
    }
}
