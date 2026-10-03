package com.coui.appcompat.poplist;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.rne;

/* JADX INFO: loaded from: classes13.dex */
public class COUIIsolatedPopupListWindow extends b {
    public static final boolean W;
    public PopupWindow.OnDismissListener V;

    public class DummyAnchorView extends View implements rne {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1861j;
        public int k;

        @Override // com.oplus.aiunit.vision.rne
        public int getBarrierDirection() {
            return -1;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getDisplayFrame() {
            int i = this.f1861j;
            int i2 = this.k;
            return new Rect(i, i2, i + 1, i2 + 1);
        }

        @Override // android.view.View
        public boolean getGlobalVisibleRect(Rect rect, Point point) {
            int x = (int) getX();
            int y = (int) getY();
            int width = getWidth() + x;
            int height = getHeight() + y;
            rect.set(x, y, width, height);
            if (!COUIIsolatedPopupListWindow.W) {
                return true;
            }
            Log.d("COUIIsolatedPopupList", "DummyAnchorView getGlobalVisibleRect x " + x + " y " + y + " right " + width + " bottom " + height);
            return true;
        }

        @Override // com.oplus.aiunit.vision.rne
        @NonNull
        public Rect getOutsets() {
            return new Rect(0, 0, 0, 0);
        }

        @Override // com.oplus.aiunit.vision.rne
        public boolean getPopupMenuRuleEnabled() {
            return this.i;
        }

        @Override // com.oplus.aiunit.vision.rne
        public int getType() {
            return 1;
        }
    }

    public class DummyRootView extends ViewGroup {
        @Override // android.view.View
        public boolean getGlobalVisibleRect(Rect rect, Point point) {
            int x = (int) getX();
            int y = (int) getY();
            int width = getWidth() + x;
            int height = getHeight() + y;
            rect.set(x, y, width, height);
            if (!COUIIsolatedPopupListWindow.W) {
                return true;
            }
            Log.d("COUIIsolatedPopupList", "DummyRootView getGlobalVisibleRect x " + x + " y " + y + " right " + width + " bottom " + height);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            if (COUIIsolatedPopupListWindow.W) {
                Log.d("COUIIsolatedPopupList", "onLayout b " + z + " left " + i + " top " + i2 + " right " + i3 + " bottom " + i4);
            }
        }
    }

    static {
        W = bj2.LOG_DEBUG || bj2.e("COUIIsolatedPopupList", 3);
    }

    @Override // com.coui.appcompat.poplist.b, android.widget.PopupWindow
    public void dismiss() {
        try {
            ((WindowManager) getContentView().getContext().getSystemService("window")).removeViewImmediate(getContentView());
        } catch (Exception e2) {
            bj2.c("COUIIsolatedPopupList", "Dismiss exception:" + e2.getMessage());
        }
        PopupWindow.OnDismissListener onDismissListener = this.V;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setIsolatedOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }
}
