package com.heytap.webview.extension.jsapi.common.executor;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiExecutor;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApi;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.heytap.webview.extension.jsapi.common.CommonApiMethod;
import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@JsApi(method = CommonApiMethod.SYSTEM_SETTING)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/heytap/webview/extension/jsapi/common/executor/CommonSystemSettingExecutor;", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "()V", "execute", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "apiArguments", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "callback", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "needPackage", "", "action", "", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonSystemSettingExecutor implements IJsApiExecutor {
    private final boolean needPackage(String action) {
        return Intrinsics.areEqual("android.settings.APPLICATION_DETAILS_SETTINGS", action);
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiExecutor
    public void execute(@NotNull IJsApiFragmentInterface fragment, @NotNull JsApiObject apiArguments, @NotNull IJsApiCallback callback) {
        Intent intent;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = apiArguments.getString("action");
        if (TextUtils.isEmpty(string)) {
            callback.fail(2, Const.JsApiResponse.IllegalArgument.MESSAGE);
            return;
        }
        String str = Const.Arguments.Setting.Prefix.SETTING_PREFIX + string;
        if (needPackage(str)) {
            String packageName = fragment.getActivity().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "fragment.activity.packageName");
            intent = new Intent(str, Uri.fromParts("package", apiArguments.getString("package_name", packageName), null));
        } else {
            intent = new Intent(str);
        }
        if (fragment.getActivity().getPackageManager().resolveActivity(intent, 0) != null) {
            callback.fail(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE);
        } else {
            fragment.getActivity().startActivity(intent);
            IJsApiCallback.DefaultImpls.success$default(callback, null, 1, null);
        }
    }
}
