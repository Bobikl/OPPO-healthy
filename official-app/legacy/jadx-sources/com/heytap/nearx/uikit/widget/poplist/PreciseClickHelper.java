package com.heytap.nearx.uikit.widget.poplist;

import android.view.MotionEvent;
import android.view.View;
import com.heytap.nearx.uikit.widget.touchsearchview.NearAccessibilityUtil;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class PreciseClickHelper {
    private OnPreciseClickListener mOnPreciseClickListener;
    private View mTarget;
    private Float[] mLastTouchDownXY = new Float[2];
    private View.OnTouchListener mOnTouchListener = new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.poplist.PreciseClickHelper.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                PreciseClickHelper.this.mLastTouchDownXY[0] = Float.valueOf(motionEvent.getX());
                PreciseClickHelper.this.mLastTouchDownXY[1] = Float.valueOf(motionEvent.getY());
            }
            return false;
        }
    };
    private View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.poplist.PreciseClickHelper.2
        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (NearAccessibilityUtil.isTalkbackEnabled(view.getContext()) || PreciseClickHelper.this.mLastTouchDownXY.length <= 0 || PreciseClickHelper.this.mLastTouchDownXY[0] == null) {
                PreciseClickHelper.this.mOnPreciseClickListener.onClick(view, view.getWidth() / 2, view.getHeight() / 2);
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
                return;
            }
            if (PreciseClickHelper.this.mLastTouchDownXY[0] != null && PreciseClickHelper.this.mLastTouchDownXY[1] != null) {
                PreciseClickHelper.this.mOnPreciseClickListener.onClick(view, PreciseClickHelper.this.mLastTouchDownXY[0].intValue(), PreciseClickHelper.this.mLastTouchDownXY[1].intValue());
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    };

    public interface OnPreciseClickListener {
        void onClick(View view, int i, int i2);
    }

    public PreciseClickHelper(View view, OnPreciseClickListener onPreciseClickListener) {
        this.mTarget = view;
        this.mOnPreciseClickListener = onPreciseClickListener;
    }

    public void setup() {
        this.mTarget.setOnTouchListener(this.mOnTouchListener);
        this.mTarget.setOnClickListener(this.mOnClickListener);
    }

    public void unSet() {
        this.mTarget.setOnClickListener(null);
        this.mTarget.setOnTouchListener(null);
    }
}
