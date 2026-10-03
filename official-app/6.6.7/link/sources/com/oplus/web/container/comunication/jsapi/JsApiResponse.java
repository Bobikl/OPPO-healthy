package com.oplus.web.container.comunication.jsapi;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.rs9;
import com.oplus.web.container.comunication.common.exception.HandleException;
import com.oplus.web.container.comunication.common.exception.NotGrantException;
import com.oplus.web.container.comunication.common.exception.NotImplementException;
import com.oplus.web.container.comunication.common.exception.ParamException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
        return str == null ? MSG_FAIL : str;
    }

    public static void invokeFailed(rs9 rs9Var) {
        invokeFailed(rs9Var, MSG_FAIL);
    }

    public static void invokeIllegal(rs9 rs9Var) {
        invokeIllegal(rs9Var, MSG_ILLEGAL);
    }

    public static void invokeSuccess(rs9 rs9Var) {
        invokeSuccess(rs9Var, new JSONObject());
    }

    public static void invokeUnsupported(rs9 rs9Var) {
        invokeFailed(rs9Var, 1, MSG_UNSUPPORTED);
    }

    public static void invokeFailed(rs9 rs9Var, String str) {
        invokeFailed(rs9Var, 5999, str);
    }

    public static void invokeIllegal(rs9 rs9Var, String str) {
        invokeFailed(rs9Var, 2, str);
    }

    public static void invokeSuccess(rs9 rs9Var, JSONObject jSONObject) {
        rs9Var.success(getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(rs9 rs9Var, int i, String str) {
        rs9Var.fail(Integer.valueOf(i), getNonNullMsg(str));
    }

    public static void invokeSuccess(rs9 rs9Var, String str, JSONObject jSONObject) {
        invokeSuccess(rs9Var, 0, str, jSONObject);
    }

    public static void invokeFailed(rs9 rs9Var, String str, JSONObject jSONObject) {
        invokeFailed(rs9Var, 5999, str, jSONObject);
    }

    public static void invokeSuccess(rs9 rs9Var, int i, String str, JSONObject jSONObject) {
        rs9Var.a(Integer.valueOf(i), str, getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(rs9 rs9Var, int i, String str, JSONObject jSONObject) {
        rs9Var.a(Integer.valueOf(i), str, getNonNullJsonObject(jSONObject));
    }

    public static void invokeFailed(rs9 rs9Var, Throwable th) {
        if (th instanceof NotGrantException) {
            invokeFailed(rs9Var, 4001, th.getMessage());
            return;
        }
        if (th instanceof ParamException) {
            invokeFailed(rs9Var, 4005, th.getMessage());
            return;
        }
        if (th instanceof HandleException) {
            invokeFailed(rs9Var, 5000, th.getMessage());
        } else if (th instanceof NotImplementException) {
            invokeFailed(rs9Var, 5001, th.getMessage());
        } else {
            invokeFailed(rs9Var, 5999, th.getMessage());
        }
    }
}
