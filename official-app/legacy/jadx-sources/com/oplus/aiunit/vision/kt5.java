package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.oppo.lib.common.R$bool;
import com.oppo.lib.common.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class kt5 {
    public static void a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.DirectionTextView, i, 0)) == null) {
            return;
        }
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.DirectionTextView_textDirection, 0);
        if (view.getResources().getBoolean(R$bool.is_right_to_left) && integer >= 0) {
            if (integer == 0) {
                view.setTextDirection(0);
            } else if (integer == 1) {
                view.setTextDirection(1);
            } else if (integer == 2) {
                view.setTextDirection(2);
            } else if (integer == 3) {
                view.setTextDirection(3);
            } else if (integer == 4) {
                view.setTextDirection(4);
            } else if (integer == 5) {
                view.setTextDirection(5);
            } else if (integer == 6) {
                view.setTextDirection(6);
            } else if (integer == 7) {
                view.setTextDirection(7);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
