package com.oppo.store.web.util;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.heytap.store.base.core.util.DisplayUtil;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidBug5497Workaround {
    private FrameLayout.LayoutParams frameLayoutParams;
    private ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private View mChildOfContent;
    private int usableHeightPrevious;
    private boolean isOnPause = false;
    private int normalFrameLayoutHeight = 0;

    public AndroidBug5497Workaround(Activity activity) {
        this.globalLayoutListener = null;
        this.mChildOfContent = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.oppo.store.web.util.AndroidBug5497Workaround.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (AndroidBug5497Workaround.this.isOnPause) {
                    return;
                }
                AndroidBug5497Workaround.this.possiblyResizeChildOfContent();
            }
        };
        this.mChildOfContent.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        this.frameLayoutParams = (FrameLayout.LayoutParams) this.mChildOfContent.getLayoutParams();
    }

    public static AndroidBug5497Workaround assistActivity(Activity activity) {
        return new AndroidBug5497Workaround(activity);
    }

    private int computeUsableHeight() {
        Rect rect = new Rect();
        this.mChildOfContent.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void possiblyResizeChildOfContent() {
        int iComputeUsableHeight = computeUsableHeight();
        int i = this.usableHeightPrevious;
        if (i == 0) {
            this.usableHeightPrevious = iComputeUsableHeight;
            return;
        }
        if (iComputeUsableHeight != i) {
            int height = this.mChildOfContent.getRootView().getHeight();
            int i2 = height - iComputeUsableHeight;
            if (i2 == 0) {
                this.normalFrameLayoutHeight = this.frameLayoutParams.height;
                return;
            }
            if (i2 > height / 4) {
                this.frameLayoutParams.height = (height - i2) + DisplayUtil.dip2px(40.0f);
            } else {
                int i3 = this.normalFrameLayoutHeight;
                if (i3 != 0) {
                    this.frameLayoutParams.height = i3;
                } else {
                    this.frameLayoutParams.height = height - DisplayUtil.getNavigationBarHeight();
                }
            }
            this.mChildOfContent.requestLayout();
            this.usableHeightPrevious = iComputeUsableHeight;
        }
    }

    public void removeGlobalLayoutListener(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        this.mChildOfContent = childAt;
        if (this.globalLayoutListener != null) {
            try {
                childAt.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            } catch (Exception unused) {
            }
        }
    }

    public void setPause(boolean z) {
        this.isOnPause = z;
    }
}
