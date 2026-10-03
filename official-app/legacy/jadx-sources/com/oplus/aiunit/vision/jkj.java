package com.oplus.aiunit.vision;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsControllerCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/jkj;", "", "Landroid/content/Context;", "context", "", "c", "Landroid/app/Activity;", "activity", "Landroid/view/WindowInsets;", "insets", "", "b", "d", "<init>", "()V", "coui-support-component_release"}, k = 1, mv = {1, 8, 0})
public final class jkj {

    @NotNull
    public static final jkj INSTANCE = new jkj();

    @JvmStatic
    public static final void b(Activity activity, WindowInsets insets) {
        int i = Build.VERSION.SDK_INT >= 30 ? insets.getInsets(WindowInsets.Type.navigationBars()).bottom : 0;
        if (c(activity)) {
            i = 0;
        }
        activity.findViewById(R.id.content).setPadding(0, 0, 0, i);
    }

    @JvmStatic
    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = Settings.Secure.getInt(context.getContentResolver(), "hide_navigationbar_enable", 0);
        return i == 2 || i == 3;
    }

    @JvmStatic
    public static final void d(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
            window.setNavigationBarContrastEnforced(false);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 3;
            window.setAttributes(attributes);
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.oplus.aiunit.vision.ikj
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return jkj.e(activity, view, windowInsets);
                }
            });
        } else {
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & 1024);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        new WindowInsetsControllerCompat(activity.getWindow(), window.getDecorView()).setAppearanceLightStatusBars(!ph2.a(activity));
    }

    public static final WindowInsets e(Activity activity, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        b(activity, insets);
        return insets;
    }
}
