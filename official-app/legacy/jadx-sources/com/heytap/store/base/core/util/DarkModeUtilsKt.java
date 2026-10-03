package com.heytap.store.base.core.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.oplus.aiunit.vision.vhc;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u000b\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\f¨\u0006\r"}, d2 = {"setForceDarkAllowed", "", "isAllowed", "", "views", "", "Landroid/view/View;", "(Z[Landroid/view/View;)V", "disableForceDark", "enableForceDark", "isDarkMode", "Landroid/app/Activity;", "Landroidx/fragment/app/Fragment;", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DarkModeUtilsKt {
    public static final void disableForceDark(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setForceDarkAllowed(false);
    }

    public static final void enableForceDark(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setForceDarkAllowed(true);
    }

    public static final boolean isDarkMode(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (fragment.getContext() == null) {
            return false;
        }
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        return vhc.a(contextRequireContext);
    }

    public static final void setForceDarkAllowed(boolean z, @NotNull View... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        for (View view : views) {
            view.setForceDarkAllowed(z);
        }
    }

    public static final boolean isDarkMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return vhc.a(activity);
    }

    public static final boolean isDarkMode(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return vhc.a(context);
    }
}
