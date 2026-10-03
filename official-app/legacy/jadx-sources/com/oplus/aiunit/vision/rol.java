package com.oplus.aiunit.vision;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.fragment.ArgumentKey;
import com.heytap.webview.extension.protocol.Const;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 92\u00020\u0001:\u0001$B\u000f\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\b7\u00108J'\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0087\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\"\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\tJ'\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020 H\u0002J\u001c\u0010\"\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010#\u001a\u00020\tH\u0002R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/oplus/aiunit/vision/rol;", "", "", "methodName", Const.Batch.ARGUMENTS, "callbackId", "", "invoke", "batch", "", "invokeBatch", "broadcast", "registerBroadcastReceiver", "removeBroadcastReceiver", "", "getNavBarType", "Landroid/webkit/WebView;", "webView", "Landroid/os/Bundle;", "savedInstanceState", MapSchema.FIELD_NAME_KEY, LogFieldKey.MESSAGE_KEY, "outState", LogFieldKey.PROCESS_NAME_KEY, "o", "n", LogFieldKey.LEVEL_KEY, "", "instanceId", Languages.ANY, b2n.g, "(JLjava/lang/String;Ljava/lang/Object;)V", "Lorg/json/JSONArray;", "q", "i", "j", "a", "Landroid/webkit/WebView;", "b", "J", "Lcom/oplus/aiunit/vision/hja;", "c", "Lcom/oplus/aiunit/vision/hja;", "jsApiManager", "", "d", "Ljava/util/Map;", "broadcastReceivers", MapSchema.FIELD_NAME_ENTRY, "I", "navBarType", "Lcom/oplus/aiunit/vision/pr9;", "f", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "<init>", "(Lcom/oplus/aiunit/vision/pr9;)V", "Companion", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class rol {
    public static final List<rol> g = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public WebView webView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long instanceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final hja jsApiManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Map<String, String> broadcastReceivers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int navBarType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final pr9 fragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16281j;
        public final /* synthetic */ String k;

        public b(String str, String str2) {
            this.f16281j = str;
            this.k = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("broadcast url: ");
            WebView webView = rol.this.webView;
            sb.append(webView != null ? webView.getUrl() : null);
            sb.append(" \n send broadcast: ");
            sb.append(this.f16281j);
            sb.append(" \n arguments: ");
            sb.append(this.k);
            q7b.a("WebViewManager", sb.toString());
            for (rol rolVar : rol.g) {
                String str = (String) rolVar.broadcastReceivers.get(this.f16281j);
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("broadcast url: ");
                    WebView webView2 = rol.this.webView;
                    sb2.append(webView2 != null ? webView2.getUrl() : null);
                    sb2.append(" \n receive broadcast: ");
                    sb2.append(this.f16281j);
                    sb2.append(" \n arguments: ");
                    sb2.append(this.k);
                    q7b.a("WebViewManager", sb2.toString());
                    String str2 = "window.HeytapJsApi.broadcastReceiver('" + str + "', " + this.k + ");";
                    WebView webView3 = rolVar.webView;
                    if (webView3 != null) {
                        webView3.evaluateJavascript(str2, null);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16282j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f16283l;

        public c(String str, String str2, String str3) {
            this.f16282j = str;
            this.k = str2;
            this.f16283l = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("invoke url: ");
            WebView webView = rol.this.webView;
            sb.append(webView != null ? webView.getUrl() : null);
            sb.append(" \n method: ");
            sb.append(this.f16282j);
            sb.append(" \n arguments: ");
            sb.append(this.k);
            q7b.a("WebViewManager", sb.toString());
            rol.this.jsApiManager.b(this.f16282j, this.k, this.f16283l != null ? new q3h(rol.this.instanceId, this.f16283l, rol.this, this.f16282j) : new kuc());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/json/JSONArray;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lorg/json/JSONArray;)V", "com/heytap/webpro/core/WebViewManager$invokeBatch$1$2"}, k = 3, mv = {1, 4, 0})
    public static final class d<T> implements lwj.b<JSONArray> {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.lwj.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(JSONArray jSONArray) {
            if (jSONArray == null || rol.this.fragment.getActivity() == null) {
                return;
            }
            rol.this.q(jSONArray);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/json/JSONArray;", "kotlin.jvm.PlatformType", "a", "()Lorg/json/JSONArray;"}, k = 3, mv = {1, 4, 0})
    public static final class e<V> implements Callable<JSONArray> {
        public final /* synthetic */ String i;

        public e(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray call() {
            return new JSONArray(this.i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16284j;
        public final /* synthetic */ String k;

        public f(String str, String str2) {
            this.f16284j = str;
            this.k = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("registerBroadcastReceiver url: ");
            WebView webView = rol.this.webView;
            sb.append(webView != null ? webView.getUrl() : null);
            sb.append(" \n register broadcast: ");
            sb.append(this.f16284j);
            q7b.a("WebViewManager", sb.toString());
            rol.this.broadcastReceivers.put(this.f16284j, this.k);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16285j;

        public g(String str) {
            this.f16285j = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("removeBroadcastReceiver url: ");
            WebView webView = rol.this.webView;
            sb.append(webView != null ? webView.getUrl() : null);
            sb.append(" \n remove broadcast: ");
            sb.append(this.f16285j);
            q7b.a("WebViewManager", sb.toString());
            rol.this.broadcastReceivers.remove(this.f16285j);
        }
    }

    public rol(@NotNull pr9 fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.jsApiManager = new hja(fragment);
        this.broadcastReceivers = new LinkedHashMap();
        this.navBarType = -1;
    }

    @JavascriptInterface
    public final void broadcast(@NotNull String broadcast, @NotNull String arguments) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        lwj.h(new b(broadcast, arguments));
    }

    @JavascriptInterface
    public final int getNavBarType() {
        return rfc.a(d94.b());
    }

    public final void h(long instanceId, @NotNull String callbackId, @NotNull Object any) {
        WebView webView;
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(any, "any");
        if (instanceId != this.instanceId || (webView = this.webView) == null) {
            return;
        }
        webView.evaluateJavascript("window.HeytapJsApi.callback('" + callbackId + "', " + any + ");", null);
    }

    public final void i(Bundle arguments, Bundle savedInstanceState) {
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

    @JavascriptInterface
    public final boolean invoke(@Nullable String methodName, @Nullable String arguments, @Nullable String callbackId) {
        lwj.h(new c(methodName, arguments, callbackId));
        return true;
    }

    @JavascriptInterface
    public final void invokeBatch(@Nullable String batch) {
        if (batch != null) {
            lwj.l(new e(batch), new d());
        }
    }

    public final void j() {
        int navBarType = getNavBarType();
        if (navBarType == this.navBarType) {
            return;
        }
        this.navBarType = navBarType;
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("window.HeytapJsApi.onNavBarTypeChanged(" + navBarType + ");", null);
        }
    }

    public final void k(@NotNull WebView webView, @Nullable Bundle arguments, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.instanceId = 0L;
        this.broadcastReceivers.clear();
        webView.addJavascriptInterface(this, Const.ObjectName.JS_API_OBJECT);
        i(arguments, savedInstanceState);
        g.add(this);
    }

    public final void l() {
        this.instanceId = 0L;
        WebView webView = this.webView;
        if (webView != null) {
            webView.removeJavascriptInterface(Const.ObjectName.JS_API_OBJECT);
        }
        g.remove(this);
        this.broadcastReceivers.clear();
        this.webView = null;
    }

    public final void m() {
        if (this.webView != null) {
            this.instanceId = SystemClock.uptimeMillis();
            this.broadcastReceivers.clear();
        }
    }

    public final void n() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void o() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
        j();
    }

    public final void p(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        WebView webView = this.webView;
        if (webView != null) {
            webView.saveState(outState);
        }
    }

    public final void q(JSONArray batch) {
        int length = batch.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = batch.optJSONObject(i);
            String url = null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("method") : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(Const.Batch.ARGUMENTS) : null;
            String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(Const.Batch.CALLBACK_ID) : null;
            kr9 q3hVar = strOptString2 != null ? new q3h(this.instanceId, strOptString2, this, strOptString) : new kuc();
            StringBuilder sb = new StringBuilder();
            sb.append("processBatch url: ");
            WebView webView = this.webView;
            if (webView != null) {
                url = webView.getUrl();
            }
            sb.append(url);
            sb.append(" \n method: ");
            sb.append(strOptString);
            sb.append(" \n arguments: ");
            sb.append(jSONObjectOptJSONObject2);
            q7b.a("WebViewManager", sb.toString());
            this.jsApiManager.e(strOptString, jSONObjectOptJSONObject2, q3hVar);
        }
    }

    @JavascriptInterface
    public final void registerBroadcastReceiver(@NotNull String broadcast, @NotNull String callbackId) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        lwj.h(new f(broadcast, callbackId));
    }

    @JavascriptInterface
    public final void removeBroadcastReceiver(@NotNull String broadcast) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        lwj.h(new g(broadcast));
    }
}
