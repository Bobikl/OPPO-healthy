package com.lifesense.device.scale.infrastructure.protocol;

import com.alibaba.fastjson.JSON;
import com.lifesense.device.scale.login.User;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GetLoginUserResponse extends JsonResponse {
    public User user;

    public User getUser() {
        return this.user;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        try {
            this.user = (User) JSON.parseObject(jSONObject.toString(), User.class);
        } catch (Exception unused) {
        }
    }
}
