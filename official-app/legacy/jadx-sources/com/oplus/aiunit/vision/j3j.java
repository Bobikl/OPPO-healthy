package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.oppo.lib.common.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class j3j {
    public int a = 0;

    public void a(TextView textView, Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SuitableFontView, i, 0)) == null) {
            return;
        }
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.SuitableFontView_textLevel, 0);
        this.a = integer;
        if (integer == 1) {
            this.a = 1;
        } else if (integer == 2) {
            this.a = 2;
        } else if (integer == 3) {
            this.a = 3;
        } else if (integer == 4) {
            this.a = 4;
        } else if (integer == 5) {
            this.a = 5;
        }
        typedArrayObtainStyledAttributes.recycle();
        b(textView, textView.getTextSize());
    }

    public final void b(TextView textView, float f) {
        if (this.a > 0) {
            textView.getPaint().setTextSize(gg2.g(f, textView.getContext().getResources().getConfiguration().fontScale, this.a));
            textView.invalidate();
        }
    }

    public void c(TextView textView, float f) {
        if (this.a > 0) {
            b(textView, f);
        } else {
            textView.setTextSize(f);
        }
    }

    public void d(TextView textView, int i, float f) {
        if (this.a > 0) {
            b(textView, f);
        } else {
            textView.setTextSize(i, f);
        }
    }
}
