package com.heytap.webview.extension.jsapi.common.executor;

import android.os.Build;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiExecutor;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApi;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.heytap.webview.extension.protocol.Const;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@JsApi(method = "device_info")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/webview/extension/jsapi/common/executor/CommonDeviceInfoExecutor;", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "()V", "execute", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "apiArguments", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "callback", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonDeviceInfoExecutor implements IJsApiExecutor {
    @Override // com.heytap.webview.extension.jsapi.IJsApiExecutor
    public void execute(@NotNull IJsApiFragmentInterface fragment, @NotNull JsApiObject apiArguments, @NotNull IJsApiCallback callback) throws JSONException {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject jSONObjectPut = new JSONObject().put("language", Locale.getDefault().getLanguage()).put(Const.Callback.DeviceInfo.TZ, TimeZone.getDefault().getDisplayName(false, 0)).put("country", Locale.getDefault().getCountry()).put(Const.Callback.DeviceInfo.SYSTEM_VERSION, Build.VERSION.RELEASE).put("brand", Build.BRAND).put("model", Build.MODEL);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …eInfo.MODEL, Build.MODEL)");
        callback.success(jSONObjectPut);
    }
}
