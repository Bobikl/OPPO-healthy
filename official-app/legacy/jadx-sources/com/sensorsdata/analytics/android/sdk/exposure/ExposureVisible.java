package com.sensorsdata.analytics.android.sdk.exposure;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.WindowHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ExposureVisible {
    private final HashMap<String, Boolean> mVisible = new HashMap<>();

    private boolean isParentVisible(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (!isViewSelfVisible((View) parent, new Rect()) || (parent = parent.getParent()) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean isViewSelfVisible(View view, Rect rect) {
        boolean zBooleanValue;
        if (view == null || view.getWindowVisibility() == 8) {
            SALog.i("SA.ExposureVisible", "view.getWindowVisibility() == View.GONE");
            return false;
        }
        Boolean bool = this.mVisible.get(view.hashCode() + "");
        if (bool == null) {
            zBooleanValue = view.getLocalVisibleRect(rect);
            this.mVisible.put(view.hashCode() + "", Boolean.valueOf(zBooleanValue));
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (WindowHelper.isDecorView(view.getClass())) {
            return true;
        }
        if (view.getWidth() > 0 && view.getHeight() > 0 && view.getAlpha() > 0.0f && zBooleanValue) {
            return (view.getAnimation() != null && view.getAnimation().getFillAfter()) || view.getVisibility() == 0;
        }
        SALog.i("SA.ExposureVisible", "isViewSelfVisible，width = " + view.getWidth() + ",height = " + view.getHeight() + "，alpha = " + view.getAlpha());
        return false;
    }

    public void cleanVisible() {
        this.mVisible.clear();
    }

    public boolean isVisible(View view, Rect rect) {
        if (isViewSelfVisible(view, rect) && isParentVisible(view)) {
            return view.isShown();
        }
        return false;
    }
}
