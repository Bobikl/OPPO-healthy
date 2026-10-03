package com.oplus.aiunit.vision;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J \u0010\u000f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/kol;", "", "obj", "", "interfaceName", "", "addJavascriptInterface", "Landroid/content/Context;", "getContext", "", "color", "setBackgroundColor", "script", "Lkotlin/Function0;", "resultCallback", "evaluateJavascript", "", "allow", "setForceDarkAllowed", "lib_webpro_theme_release"}, k = 1, mv = {1, 4, 0})
public interface kol {
    void addJavascriptInterface(@NotNull Object obj, @NotNull String interfaceName);

    void evaluateJavascript(@Nullable String script, @NotNull Function0<Unit> resultCallback);

    @NotNull
    Context getContext();

    void setBackgroundColor(int color);

    void setForceDarkAllowed(boolean allow);
}
