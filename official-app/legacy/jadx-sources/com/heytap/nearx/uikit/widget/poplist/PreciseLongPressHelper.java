package com.heytap.nearx.uikit.widget.poplist;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class PreciseLongPressHelper {
    private OnPreciseLongClickListener mOnPreciseLongClickListener;
    private View mTarget;
    private Float[] mLastTouchDownXY = new Float[2];
    private View.OnTouchListener mOnTouchListener = new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.poplist.PreciseLongPressHelper.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                PreciseLongPressHelper.this.mLastTouchDownXY[0] = Float.valueOf(motionEvent.getX());
                PreciseLongPressHelper.this.mLastTouchDownXY[1] = Float.valueOf(motionEvent.getY());
            }
            return false;
        }
    };
    private View.OnLongClickListener mOnLongClickListener = new View.OnLongClickListener() { // from class: com.heytap.nearx.uikit.widget.poplist.PreciseLongPressHelper.2
        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PreciseLongPressHelper.this.mOnPreciseLongClickListener.onLongClick(view, PreciseLongPressHelper.this.mLastTouchDownXY[0].intValue(), PreciseLongPressHelper.this.mLastTouchDownXY[1].intValue());
            return true;
        }
    };

    public interface OnPreciseLongClickListener {
        void onLongClick(View view, int i, int i2);
    }

    public PreciseLongPressHelper(View view, OnPreciseLongClickListener onPreciseLongClickListener) {
        this.mTarget = view;
        this.mOnPreciseLongClickListener = onPreciseLongClickListener;
    }

    public void setup() {
        this.mTarget.setOnTouchListener(this.mOnTouchListener);
        this.mTarget.setOnLongClickListener(this.mOnLongClickListener);
    }
}
