package com.heytap.store.platform.barcode.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.annotation.FloatRange;
import androidx.appcompat.widget.Toolbar;
import com.heytap.store.platform.barcode.R;
import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes6.dex */
public final class StatusBarUtils {
    private StatusBarUtils() {
        throw new AssertionError();
    }

    private static View createStatusBarView(Activity activity, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        view.setBackgroundColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
        view.setId(R.id.translucent_view);
        return view;
    }

    public static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.status_bar_height);
    }

    public static void immersiveStatusBar(Activity activity, Toolbar toolbar) {
        immersiveStatusBar(activity, toolbar, 0.0f);
    }

    public static void immersiveStatusBar(Activity activity, Toolbar toolbar, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        View childAt = ((ViewGroup) window.getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
        }
        if (toolbar != null) {
            toolbar.setPadding(0, getStatusBarHeight(activity), 0, 0);
        }
        viewGroup.addView(createStatusBarView(activity, f));
    }
}
