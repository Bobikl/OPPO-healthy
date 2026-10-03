package com.heytap.webview.extension.jsapi;

import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H§\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "", AcBaseTraceHelper.VAL_FAIL, "", "code", "message", "", "invoke", "obj", "success", "Lorg/json/JSONObject;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IJsApiCallback {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void success$default(IJsApiCallback iJsApiCallback, JSONObject jSONObject, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: success");
            }
            if ((i & 1) != 0) {
                jSONObject = new JSONObject();
            }
            iJsApiCallback.success(jSONObject);
        }
    }

    void fail(@NotNull Object code, @NotNull String message);

    @Deprecated(message = "use success() or fail()")
    void invoke(@NotNull Object obj);

    void success(@NotNull JSONObject obj);
}
