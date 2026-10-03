package com.heytap.webview.extension.adapter;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/heytap/webview/extension/adapter/WebViewInterface;", "", "addJavascriptInterface", "", "obj", "interfaceName", "", "evaluateJavascript", "script", "resultCallback", "Lkotlin/Function0;", "getContext", "Landroid/content/Context;", "setBackgroundColor", "color", "", "setForceDarkAllowed", "allow", "", "lib_webtheme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebViewInterface {
    void addJavascriptInterface(@NotNull Object obj, @NotNull String interfaceName);

    void evaluateJavascript(@Nullable String script, @NotNull Function0<Unit> resultCallback);

    @NotNull
    Context getContext();

    void setBackgroundColor(int color);

    void setForceDarkAllowed(boolean allow);
}
