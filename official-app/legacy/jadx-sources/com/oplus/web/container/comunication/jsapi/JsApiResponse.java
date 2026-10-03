package com.oplus.web.container.comunication.jsapi;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.lr9;
import com.oplus.web.container.comunication.common.exception.HandleException;
import com.oplus.web.container.comunication.common.exception.NotGrantException;
import com.oplus.web.container.comunication.common.exception.NotImplementException;
import com.oplus.web.container.comunication.common.exception.ParamException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
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

    public static void invokeFailed(lr9 lr9Var) {
        invokeFailed(lr9Var, "fail");
    }

    public static void invokeIllegal(lr9 lr9Var) {
        invokeIllegal(lr9Var, "illegal argument!");
    }

    public static void invokeSuccess(lr9 lr9Var) {
        invokeSuccess(lr9Var, new JSONObject());
    }

    public static void invokeUnsupported(lr9 lr9Var) {
        invokeFailed(lr9Var, 1, "unsupported operation!");
    }

    public static void invokeFailed(lr9 lr9Var, String str) {
        invokeFailed(lr9Var, 5999, str);
    }

    public static void invokeIllegal(lr9 lr9Var, String str) {
        invokeFailed(lr9Var, 2, str);
    }

    public static void invokeSuccess(lr9 lr9Var, JSONObject jSONObject) {
        lr9Var.success(getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(lr9 lr9Var, int i, String str) {
        lr9Var.fail(Integer.valueOf(i), getNonNullMsg(str));
    }

    public static void invokeSuccess(lr9 lr9Var, String str, JSONObject jSONObject) {
        invokeSuccess(lr9Var, 0, str, jSONObject);
    }

    public static void invokeFailed(lr9 lr9Var, String str, JSONObject jSONObject) {
        invokeFailed(lr9Var, 5999, str, jSONObject);
    }

    public static void invokeSuccess(lr9 lr9Var, int i, String str, JSONObject jSONObject) {
        lr9Var.a(Integer.valueOf(i), str, getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(lr9 lr9Var, int i, String str, JSONObject jSONObject) {
        lr9Var.a(Integer.valueOf(i), str, getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(lr9 lr9Var, Throwable th) {
        if (th instanceof NotGrantException) {
            invokeFailed(lr9Var, 4001, th.getMessage());
            return;
        }
        if (th instanceof ParamException) {
            invokeFailed(lr9Var, 4005, th.getMessage());
            return;
        }
        if (th instanceof HandleException) {
            invokeFailed(lr9Var, 5000, th.getMessage());
        } else if (th instanceof NotImplementException) {
            invokeFailed(lr9Var, 5001, th.getMessage());
        } else {
            invokeFailed(lr9Var, 5999, th.getMessage());
        }
    }
}
