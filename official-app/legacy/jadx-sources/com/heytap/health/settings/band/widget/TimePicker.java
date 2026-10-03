package com.heytap.health.settings.band.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.coui.appcompat.picker.COUITimePicker;
import com.heytap.health.base.R$color;

/* JADX INFO: loaded from: classes17.dex */
public class TimePicker extends COUITimePicker {
    public TimePicker(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setBackgroundResource(R$color.lib_base_color_nx_transparence);
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
