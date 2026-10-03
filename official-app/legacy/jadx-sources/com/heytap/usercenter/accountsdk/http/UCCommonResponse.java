package com.heytap.usercenter.accountsdk.http;

import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.helper.Base64Helper;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.algorithm.XORUtils;
import com.platform.usercenter.tools.json.JsonUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Deprecated
public abstract class UCCommonResponse<T> implements UCBaseResult {
    private static final String TAG = "UCCommonResponse";
    public T data;
    public ErrorResp error;
    public boolean success;

    @Keep
    public static class ErrorResp {
        public String code;
        public String message;
    }

    public String getCode() {
        ErrorResp errorResp = this.error;
        return errorResp != null ? errorResp.code : "0";
    }

    public String getMessage() {
        ErrorResp errorResp = this.error;
        return errorResp != null ? errorResp.message : "nothing happen";
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void loadCommonJson(JSONObject jSONObject, UCCommonResponse<T> uCCommonResponse) {
        if (jSONObject == null || uCCommonResponse == null) {
            return;
        }
        try {
            uCCommonResponse.success = JsonUtil.getjsonBoolean(jSONObject, "success");
            ErrorResp errorResp = new ErrorResp();
            String str = JsonUtil.getjsonString(jSONObject, "error");
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject(str);
                errorResp.code = JsonUtil.getjsonString(jSONObject2, "code");
                errorResp.message = JsonUtil.getjsonString(jSONObject2, "message");
                uCCommonResponse.error = errorResp;
            }
            String str2 = JsonUtil.getjsonString(jSONObject, "data");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                uCCommonResponse.data = parserData(new JSONObject(str2));
            } catch (JSONException e2) {
                UCLogUtil.detailE("JSONException = " + e2.getMessage());
                uCCommonResponse.data = parserData(str2);
            }
        } catch (JSONException e3) {
            UCLogUtil.e(TAG, e3.toString());
        }
    }

    public T parserData(String str) {
        return null;
    }

    public abstract T parserData(JSONObject jSONObject);

    public void setSuccess(boolean z) {
        this.success = z;
    }

    @Override // com.heytap.usercenter.accountsdk.http.UCBaseResult
    public UCCommonResponse<T> parseNetworkResponse(byte[] bArr) {
        try {
            String str = new String(bArr, "utf-8");
            UCLogUtil.i("parseNetworkResponse UCCommonResponse body = " + XORUtils.encrypt(Base64Helper.base64Encode(str), 8));
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            loadCommonJson(new JSONObject(str), this);
            return this;
        } catch (UnsupportedEncodingException e2) {
            UCLogUtil.e(TAG, e2.toString());
            return null;
        } catch (JSONException e3) {
            UCLogUtil.e(TAG, e3.toString());
            return null;
        }
    }
}
