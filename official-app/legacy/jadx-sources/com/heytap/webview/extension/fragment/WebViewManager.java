package com.heytap.webview.extension.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.heytap.webview.extension.WebExtEnvironment;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.JsApiManager;
import com.heytap.webview.extension.protocol.Const;
import com.heytap.webview.extension.utils.ThreadUtil;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J%\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u0014J\u001c\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J'\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0087\u0002J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0007J\"\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0007J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/heytap/webview/extension/fragment/WebViewManager;", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "(Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;)V", "broadcastReceivers", "", "", "instanceId", "", "jsApiManager", "Lcom/heytap/webview/extension/jsapi/JsApiManager;", "webView", "Landroid/webkit/WebView;", "broadcast", "", Const.Batch.ARGUMENTS, "callback", "callbackId", Languages.ANY, "callback$lib_webext_release", "initArguments", "Landroid/os/Bundle;", "savedInstanceState", "invoke", "", "methodName", "invokeBatch", "batch", "onCreate", "onDestroy", "onPageStarted", "onPause", "onResume", "onSaveInstanceState", "outState", "processBatch", "Lorg/json/JSONArray;", "registerBroadcastReceiver", "removeBroadcastReceiver", "Companion", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewManager.kt\ncom/heytap/webview/extension/fragment/WebViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class WebViewManager {

    @NotNull
    private static final List<WebViewManager> WEB_VIEW_MANAGERS = new ArrayList();

    @NotNull
    private final Map<String, String> broadcastReceivers;

    @Nullable
    private IJsApiFragmentInterface fragment;
    private long instanceId;

    @Nullable
    private JsApiManager jsApiManager;

    @Nullable
    private WebView webView;

    public WebViewManager(@Nullable IJsApiFragmentInterface iJsApiFragmentInterface) {
        this.fragment = iJsApiFragmentInterface;
        this.jsApiManager = iJsApiFragmentInterface != null ? new JsApiManager(iJsApiFragmentInterface) : null;
        this.broadcastReceivers = new LinkedHashMap();
    }

    private final void initArguments(Bundle arguments, Bundle savedInstanceState) {
        Uri uri;
        WebView webView;
        WebView webView2;
        if (savedInstanceState != null && (webView2 = this.webView) != null) {
            webView2.restoreState(savedInstanceState);
        }
        if (arguments == null || (uri = (Uri) arguments.getParcelable(ArgumentKey.URI)) == null || (webView = this.webView) == null) {
            return;
        }
        String string = uri.toString();
        webView.loadUrl(string);
        JSHookAop.loadUrl(webView, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBatch(JSONArray batch) {
        try {
            int length = batch.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = batch.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("method") : null;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(Const.Batch.ARGUMENTS) : null;
                String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(Const.Batch.CALLBACK_ID) : null;
                IJsApiCallback simpleCallback = strOptString2 != null ? new SimpleCallback(this.instanceId, strOptString2, this, strOptString) : new NoneCallback();
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("url: ");
                    WebView webView = this.webView;
                    sb.append(webView != null ? webView.getUrl() : null);
                    sb.append(" \n method: ");
                    sb.append(strOptString);
                    sb.append(" \n arguments: ");
                    sb.append(jSONObjectOptJSONObject2);
                    Log.d(Const.Tag.EXECUTOR, sb.toString());
                }
                JsApiManager jsApiManager = this.jsApiManager;
                if (jsApiManager != null) {
                    jsApiManager.post(strOptString, jSONObjectOptJSONObject2, simpleCallback);
                }
            }
        } catch (Exception unused) {
            Log.e(Const.Tag.EXECUTOR, "processBatch error ...");
        }
    }

    @JavascriptInterface
    public final void broadcast(@NotNull final String broadcast, @NotNull final String arguments) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ThreadUtil.post$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebViewManager.broadcast.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("url: ");
                    WebView webView = WebViewManager.this.webView;
                    sb.append(webView != null ? webView.getUrl() : null);
                    sb.append(" \n send broadcast: ");
                    sb.append(broadcast);
                    sb.append(" \n arguments: ");
                    sb.append(arguments);
                    Log.d(Const.Tag.BROADCAST, sb.toString());
                }
                for (WebViewManager webViewManager : WebViewManager.WEB_VIEW_MANAGERS) {
                    String str = (String) webViewManager.broadcastReceivers.get(broadcast);
                    if (str != null) {
                        WebViewManager webViewManager2 = WebViewManager.this;
                        String str2 = broadcast;
                        String str3 = arguments;
                        if (WebExtEnvironment.INSTANCE.getDebug()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("url: ");
                            WebView webView2 = webViewManager2.webView;
                            sb2.append(webView2 != null ? webView2.getUrl() : null);
                            sb2.append(" \n receive broadcast: ");
                            sb2.append(str2);
                            sb2.append(" \n arguments: ");
                            sb2.append(str3);
                            Log.d(Const.Tag.BROADCAST, sb2.toString());
                        }
                        String str4 = "window.HeytapJsApi.broadcastReceiver('" + str + "', " + str3 + ");";
                        WebView webView3 = webViewManager.webView;
                        if (webView3 != null) {
                            webView3.evaluateJavascript(str4, null);
                        }
                    }
                }
            }
        }, 1, null);
    }

    public final void callback$lib_webext_release(long instanceId, @NotNull String callbackId, @NotNull Object any) {
        WebView webView;
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(any, "any");
        if (instanceId != this.instanceId || (webView = this.webView) == null) {
            return;
        }
        webView.evaluateJavascript("window.HeytapJsApi.callback('" + callbackId + "', " + any + ");", null);
    }

    @JavascriptInterface
    public final boolean invoke(@Nullable final String methodName, @Nullable final String arguments, @Nullable final String callbackId) {
        ThreadUtil.post$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebViewManager.invoke.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IJsApiCallback noneCallback;
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("url: ");
                    WebView webView = WebViewManager.this.webView;
                    sb.append(webView != null ? webView.getUrl() : null);
                    sb.append(" \n method: ");
                    sb.append(methodName);
                    sb.append(" \n arguments: ");
                    sb.append(arguments);
                    Log.d(Const.Tag.EXECUTOR, sb.toString());
                }
                String str = callbackId;
                if (str != null) {
                    WebViewManager webViewManager = WebViewManager.this;
                    noneCallback = new SimpleCallback(webViewManager.instanceId, str, webViewManager, methodName);
                } else {
                    noneCallback = new NoneCallback();
                }
                JsApiManager jsApiManager = WebViewManager.this.jsApiManager;
                if (jsApiManager != null) {
                    jsApiManager.execute(methodName, arguments, noneCallback);
                }
            }
        }, 1, null);
        return true;
    }

    @JavascriptInterface
    public final void invokeBatch(@Nullable final String batch) {
        if (batch != null) {
            ThreadUtil.INSTANCE.postBackToUI$lib_webext_release(new Function0<JSONArray>() { // from class: com.heytap.webview.extension.fragment.WebViewManager$invokeBatch$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @Nullable
                public final JSONArray invoke() {
                    return new JSONArray(batch);
                }
            }, new Function1<JSONArray, Unit>() { // from class: com.heytap.webview.extension.fragment.WebViewManager$invokeBatch$1$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JSONArray jSONArray) {
                    invoke2(jSONArray);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable JSONArray jSONArray) {
                    WebViewManager webViewManager;
                    IJsApiFragmentInterface iJsApiFragmentInterface;
                    FragmentActivity activity;
                    if (jSONArray == null || (iJsApiFragmentInterface = (webViewManager = this.this$0).fragment) == null || (activity = iJsApiFragmentInterface.getActivity()) == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(activity, "activity");
                    webViewManager.processBatch(jSONArray);
                }
            });
        }
    }

    public final void onCreate(@NotNull WebView webView, @Nullable Bundle arguments, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.instanceId = 0L;
        this.broadcastReceivers.clear();
        webView.addJavascriptInterface(this, Const.ObjectName.JS_API_OBJECT);
        initArguments(arguments, savedInstanceState);
        WEB_VIEW_MANAGERS.add(this);
    }

    public final void onDestroy() {
        try {
            this.instanceId = 0L;
            WEB_VIEW_MANAGERS.remove(this);
            this.broadcastReceivers.clear();
            WebView webView = this.webView;
            if (webView != null) {
                webView.removeJavascriptInterface(Const.ObjectName.JS_API_OBJECT);
                webView.stopLoading();
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.clearHistory();
                webView.destroy();
            }
            this.webView = null;
            this.jsApiManager = null;
            this.fragment = null;
            Log.d(Const.Tag.EXECUTOR, "内存泄漏逻辑验证");
        } catch (Throwable unused) {
        }
    }

    public final void onPageStarted() {
        if (this.webView != null) {
            this.instanceId = SystemClock.uptimeMillis();
            this.broadcastReceivers.clear();
        }
    }

    public final void onPause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void onResume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        WebView webView = this.webView;
        if (webView != null) {
            webView.saveState(outState);
        }
    }

    @JavascriptInterface
    public final void registerBroadcastReceiver(@NotNull final String broadcast, @NotNull final String callbackId) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        ThreadUtil.post$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebViewManager.registerBroadcastReceiver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("url: ");
                    WebView webView = WebViewManager.this.webView;
                    sb.append(webView != null ? webView.getUrl() : null);
                    sb.append(" \n register broadcast: ");
                    sb.append(broadcast);
                    Log.d(Const.Tag.BROADCAST, sb.toString());
                }
                WebViewManager.this.broadcastReceivers.put(broadcast, callbackId);
            }
        }, 1, null);
    }

    @JavascriptInterface
    public final void removeBroadcastReceiver(@NotNull final String broadcast) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        ThreadUtil.post$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebViewManager.removeBroadcastReceiver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("url: ");
                    WebView webView = WebViewManager.this.webView;
                    sb.append(webView != null ? webView.getUrl() : null);
                    sb.append(" \n remove broadcast: ");
                    sb.append(broadcast);
                    Log.d(Const.Tag.BROADCAST, sb.toString());
                }
                WebViewManager.this.broadcastReceivers.remove(broadcast);
            }
        }, 1, null);
    }
}
