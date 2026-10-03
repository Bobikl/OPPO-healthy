package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0017R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/lfc;", "Lcom/oplus/aiunit/vision/kol;", "", "obj", "", "interfaceName", "", "addJavascriptInterface", "Landroid/content/Context;", "getContext", "", "color", "setBackgroundColor", "script", "Lkotlin/Function0;", "resultCallback", "evaluateJavascript", "", "allow", "setForceDarkAllowed", "Landroid/webkit/WebView;", "a", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView", "<init>", "(Landroid/webkit/WebView;)V", "lib_webpro_theme_release"}, k = 1, mv = {1, 4, 0})
public final class lfc implements kol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebView webView;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 4, 0})
    public static final class a<T> implements ValueCallback<String> {
        public static final a INSTANCE = new a();

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(String str) {
        }
    }

    public lfc(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
    }

    @Override // com.oplus.aiunit.vision.kol
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(@NotNull Object obj, @NotNull String interfaceName) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(interfaceName, "interfaceName");
        this.webView.addJavascriptInterface(obj, interfaceName);
    }

    @Override // com.oplus.aiunit.vision.kol
    public void evaluateJavascript(@Nullable String script, @NotNull Function0<Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        if (script != null) {
            this.webView.evaluateJavascript(script, a.INSTANCE);
        }
    }

    @Override // com.oplus.aiunit.vision.kol
    @NotNull
    public Context getContext() {
        Context context = this.webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        return context;
    }

    @Override // com.oplus.aiunit.vision.kol
    public void setBackgroundColor(int color) {
        this.webView.setBackgroundColor(color);
    }

    @Override // com.oplus.aiunit.vision.kol
    @RequiresApi(29)
    public void setForceDarkAllowed(boolean allow) {
        this.webView.setForceDarkAllowed(allow);
    }
}
