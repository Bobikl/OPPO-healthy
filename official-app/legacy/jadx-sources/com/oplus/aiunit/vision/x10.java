package com.oplus.aiunit.vision;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class x10 {
    public static int a;
    public static int b;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f18464j;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.i = view;
            this.f18464j = layoutParams;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            x10.e(this.i, this.f18464j);
        }
    }

    public static void a(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new a(childAt, (FrameLayout.LayoutParams) childAt.getLayoutParams()));
    }

    public static void c(Activity activity) {
        if (activity != null) {
            a(activity);
        }
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }

    public static void e(View view, FrameLayout.LayoutParams layoutParams) {
        int iD;
        if (view == null || layoutParams == null || (iD = d(view)) == b) {
            return;
        }
        int height = view.getRootView().getHeight();
        int i = height - iD;
        if (i > height / 4) {
            a = layoutParams.height;
            layoutParams.height = height - i;
        } else {
            int i2 = a;
            if (i2 != 0) {
                layoutParams.height = i2;
            }
        }
        view.requestLayout();
        b = iD;
    }
}
