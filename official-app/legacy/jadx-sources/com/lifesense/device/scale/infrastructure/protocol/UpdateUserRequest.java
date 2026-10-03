package com.lifesense.device.scale.infrastructure.protocol;

import com.alibaba.fastjson.JSON;
import com.lifesense.device.scale.login.User;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UpdateUserRequest extends BaseRequest {
    public UpdateUserRequest(User user) {
        try {
            JSONObject jSONObject = new JSONObject(JSON.toJSONString(user));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                addValue(next, jSONObject.opt(next));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return UpdateUserResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/user_service/updateUser";
    }
}
