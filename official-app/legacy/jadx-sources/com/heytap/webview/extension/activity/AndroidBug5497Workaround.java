package com.heytap.webview.extension.activity;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidBug5497Workaround {
    private static int frameLayoutHeight;
    private static int usableHeightPrevious;

    private static void FixedkeyboardOcclude(Activity activity) {
        final View childAt = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        if (childAt == null) {
            return;
        }
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.webview.extension.activity.AndroidBug5497Workaround.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AndroidBug5497Workaround.possiblyResizeChildOfContent(childAt, layoutParams);
            }
        });
    }

    public static void assistActivity(Activity activity) {
        if (activity != null) {
            FixedkeyboardOcclude(activity);
        }
    }

    private static int computeUsableHeight(View view) {
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void possiblyResizeChildOfContent(View view, FrameLayout.LayoutParams layoutParams) {
        int iComputeUsableHeight;
        if (view == null || layoutParams == null || (iComputeUsableHeight = computeUsableHeight(view)) == usableHeightPrevious) {
            return;
        }
        int height = view.getRootView().getHeight();
        int i = height - iComputeUsableHeight;
        if (i > height / 4) {
            frameLayoutHeight = layoutParams.height;
            layoutParams.height = height - i;
        } else {
            int i2 = frameLayoutHeight;
            if (i2 != 0) {
                layoutParams.height = i2;
            }
        }
        view.requestLayout();
        usableHeightPrevious = iComputeUsableHeight;
    }
}
