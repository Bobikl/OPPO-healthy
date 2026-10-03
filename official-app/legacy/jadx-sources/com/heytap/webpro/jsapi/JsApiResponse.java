package com.heytap.webpro.jsapi;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.webpro.common.exception.HandleException;
import com.heytap.webpro.common.exception.NotGrantException;
import com.heytap.webpro.common.exception.NotImplementException;
import com.heytap.webpro.common.exception.ParamException;
import com.oplus.aiunit.vision.kr9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class JsApiResponse {
    private static final int CODE_ILLEGAL = 2;
    private static final int CODE_UNSUPPORTED = 1;
    private static final String MSG_FAIL = "fail";
    private static final String MSG_ILLEGAL = "illegal argument!";
    private static final String MSG_UNSUPPORTED = "unsupported operation!";
    private static final String TAG = "JsApiResponse";

    @NonNull
    private static JSONObject getNonNullJsonObject(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @NonNull
    private static String getNonNullMsg(String str) {
        return str == null ? "fail" : str;
    }

    public static void invokeFailed(kr9 kr9Var) {
        invokeFailed(kr9Var, "fail");
    }

    public static void invokeIllegal(kr9 kr9Var) {
        invokeIllegal(kr9Var, "illegal argument!");
    }

    public static void invokeSuccess(kr9 kr9Var) {
        invokeSuccess(kr9Var, new JSONObject());
    }

    public static void invokeUnsupported(kr9 kr9Var) {
        invokeFailed(kr9Var, 1, "unsupported operation!");
    }

    public static void invokeFailed(kr9 kr9Var, String str) {
        invokeFailed(kr9Var, 5999, str);
    }

    public static void invokeIllegal(kr9 kr9Var, String str) {
        invokeFailed(kr9Var, 2, str);
    }

    public static void invokeSuccess(kr9 kr9Var, JSONObject jSONObject) {
        kr9Var.success(getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(kr9 kr9Var, int i, String str) {
        kr9Var.fail(Integer.valueOf(i), getNonNullMsg(str));
    }

    public static void invokeSuccess(kr9 kr9Var, String str, JSONObject jSONObject) {
        invokeSuccess(kr9Var, 0, str, jSONObject);
    }

    public static void invokeFailed(kr9 kr9Var, String str, JSONObject jSONObject) {
        invokeFailed(kr9Var, 5999, str, jSONObject);
    }

    public static void invokeSuccess(kr9 kr9Var, int i, String str, JSONObject jSONObject) {
        kr9Var.a(Integer.valueOf(i), str, getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(kr9 kr9Var, int i, String str, JSONObject jSONObject) {
        kr9Var.a(Integer.valueOf(i), str, getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(kr9 kr9Var, Throwable th) {
        if (th instanceof NotGrantException) {
            invokeFailed(kr9Var, 4001, th.getMessage());
            return;
        }
        if (th instanceof ParamException) {
            invokeFailed(kr9Var, 4005, th.getMessage());
            return;
        }
        if (th instanceof HandleException) {
            invokeFailed(kr9Var, 5000, th.getMessage());
        } else if (th instanceof NotImplementException) {
            invokeFailed(kr9Var, 5001, th.getMessage());
        } else {
            invokeFailed(kr9Var, 5999, th.getMessage());
        }
    }
}
