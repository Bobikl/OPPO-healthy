package com.heytap.webview.extension.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/heytap/webview/extension/utils/StatusBarUtil;", "", "()V", "isNightMode", "", "context", "Landroid/content/Context;", "setDarkMode", "", "activity", "Landroid/app/Activity;", "dark", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StatusBarUtil {

    @NotNull
    public static final StatusBarUtil INSTANCE = new StatusBarUtil();

    private StatusBarUtil() {
    }

    public final boolean isNightMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    public final void setDarkMode(@NotNull Activity activity, boolean dark) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        if (dark) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
    }
}
