package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/yni;", "", "Landroid/app/Activity;", "activity", "", "dark", "", "b", "Landroid/content/Context;", "context", "a", "c", "<init>", "()V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class yni {
    public static final yni INSTANCE = new yni();

    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return 32 == (resources.getConfiguration().uiMode & 48);
    }

    public final void b(@NotNull Activity activity, boolean dark) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        if (dark) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
    }

    @TargetApi(23)
    public final void c(@Nullable Activity activity, boolean dark) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (dark) {
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "it.decorView");
            View decorView2 = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "it.decorView");
            decorView.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView3 = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "it.decorView");
        View decorView4 = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "it.decorView");
        decorView3.setSystemUiVisibility(decorView4.getSystemUiVisibility() & (-8193));
    }
}
