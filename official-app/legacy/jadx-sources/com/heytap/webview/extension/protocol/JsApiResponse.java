package com.heytap.webview.extension.protocol;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "use IJsApiCallback.fail or IJsApiCallback.success")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/webview/extension/protocol/JsApiResponse;", "", "mCode", "", "mMessage", "", "(Ljava/lang/String;IILjava/lang/String;)V", "code", "message", "toJSONObject", "", "toString", "SUCCESS", "UNSUPPORTED_OPERATION", "ILLEGAL_ARGUMENT", "PERMISSION_DENIED", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum JsApiResponse {
    SUCCESS(0, "success!"),
    UNSUPPORTED_OPERATION(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE),
    ILLEGAL_ARGUMENT(2, Const.JsApiResponse.IllegalArgument.MESSAGE),
    PERMISSION_DENIED(3, Const.JsApiResponse.PermissionDenied.MESSAGE);

    private int mCode;

    @NotNull
    private final String mMessage;

    JsApiResponse(int i, String str) {
        this.mCode = i;
        this.mMessage = str;
    }

    /* JADX INFO: renamed from: code, reason: from getter */
    public final int getMCode() {
        return this.mCode;
    }

    @NotNull
    /* JADX INFO: renamed from: message, reason: from getter */
    public final String getMMessage() {
        return this.mMessage;
    }

    @NotNull
    public final Object toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.mCode);
            jSONObject.put("msg", this.mMessage);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return toJSONObject().toString();
    }
}
