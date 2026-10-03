package com.heytap.store.base.widget.state;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.store.base.widget.state.StateViewScreenCheckUtilKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"checkStateViewScreenAdapt", "", "view", "Landroid/view/View;", "getMetricsFull", "Landroid/util/DisplayMetrics;", "context", "Landroid/content/Context;", "Widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StateViewScreenCheckUtilKt {
    public static final void checkStateViewScreenAdapt(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.oplus.aiunit.vision.vmi
            @Override // java.lang.Runnable
            public final void run() {
                StateViewScreenCheckUtilKt.m4817checkStateViewScreenAdapt$lambda0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkStateViewScreenAdapt$lambda-0, reason: not valid java name */
    public static final void m4817checkStateViewScreenAdapt$lambda0(View view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        DisplayMetrics metricsFull = getMetricsFull(context);
        int[] iArr = new int[2];
        ViewParent parent = view.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent).getLocationOnScreen(iArr);
        int height = view.getHeight();
        if (height == 0) {
            view.setVisibility(0);
            return;
        }
        int i = iArr[1];
        int i2 = (metricsFull.heightPixels - height) / 2;
        if (i > i2) {
            view.setVisibility(0);
            return;
        }
        int i3 = i2 - i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = -1;
        layoutParams2.setMargins(0, i3, 0, 0);
        view.setLayoutParams(layoutParams2);
        view.setVisibility(0);
    }

    private static final DisplayMetrics getMetricsFull(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
