package com.heytap.webview.extension.jsapi.common.executor;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.heytap.webview.extension.activity.WebExtRouter;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApiObject;
import com.heytap.webview.extension.protocol.Const;
import com.heytap.webview.extension.utils.UriUtil;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0013JS\u0010\u0015\u001a\u00020\u00002K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nJ\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RS\u0010\t\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/heytap/webview/extension/jsapi/common/executor/InnerOpenExecutor;", "", "fragmentInterface", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "apiArguments", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "callback", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "(Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;Lcom/heytap/webview/extension/jsapi/JsApiObject;Lcom/heytap/webview/extension/jsapi/IJsApiCallback;)V", "networkUriCall", "Lkotlin/Function3;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", ParserTag.TAG_URI, "", Const.Arguments.Open.STYLE, "Landroid/os/Bundle;", "bundle", "", "execute", "onNetworkUri", "toBundle", "jsonObject", "Lorg/json/JSONObject;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InnerOpenExecutor {

    @NotNull
    private final JsApiObject apiArguments;

    @NotNull
    private final IJsApiCallback callback;

    @NotNull
    private final IJsApiFragmentInterface fragmentInterface;

    @NotNull
    private Function3<? super Uri, ? super String, ? super Bundle, Unit> networkUriCall;

    public InnerOpenExecutor(@NotNull IJsApiFragmentInterface fragmentInterface, @NotNull JsApiObject apiArguments, @NotNull IJsApiCallback callback) {
        Intrinsics.checkNotNullParameter(fragmentInterface, "fragmentInterface");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fragmentInterface = fragmentInterface;
        this.apiArguments = apiArguments;
        this.callback = callback;
        this.networkUriCall = new Function3<Uri, String, Bundle, Unit>() { // from class: com.heytap.webview.extension.jsapi.common.executor.InnerOpenExecutor$networkUriCall$1
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri, String str, Bundle bundle) {
                invoke2(uri, str, bundle);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Uri uri, @NotNull String style, @NotNull Bundle bundle) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                WebExtRouter webExtRouterAddExt = new WebExtRouter().setUri(uri).setStyle(style).addExt(bundle);
                FragmentActivity activity = this.this$0.fragmentInterface.getActivity();
                Intrinsics.checkNotNullExpressionValue(activity, "fragmentInterface.activity");
                webExtRouterAddExt.startUrl(activity);
                IJsApiCallback.DefaultImpls.success$default(this.this$0.callback, null, 1, null);
            }
        };
    }

    private final Bundle toBundle(JSONObject jsonObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            bundle.putString(next, jsonObject.optString(next));
        }
        return bundle;
    }

    public final void execute() {
        if (TextUtils.isEmpty(this.apiArguments.getString("url"))) {
            this.callback.fail(2, "url is nil");
            return;
        }
        Uri uri = Uri.parse(this.apiArguments.getString("url"));
        String string = this.apiArguments.getString(Const.Arguments.Open.STYLE, "default");
        UriUtil uriUtil = UriUtil.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        if (uriUtil.isNetworkUri(uri) && !Intrinsics.areEqual(FragmentStyle.BROWSER, string)) {
            this.networkUriCall.invoke(uri, string, toBundle(this.apiArguments.getJsonObject()));
            return;
        }
        WebExtRouter uri2 = new WebExtRouter().setUri(uri);
        FragmentActivity activity = this.fragmentInterface.getActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "fragmentInterface.activity");
        if (uri2.startDeepLink(activity)) {
            IJsApiCallback.DefaultImpls.success$default(this.callback, null, 1, null);
        } else {
            this.callback.fail(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE);
        }
    }

    @NotNull
    public final InnerOpenExecutor onNetworkUri(@NotNull Function3<? super Uri, ? super String, ? super Bundle, Unit> networkUriCall) {
        Intrinsics.checkNotNullParameter(networkUriCall, "networkUriCall");
        this.networkUriCall = networkUriCall;
        return this;
    }
}
