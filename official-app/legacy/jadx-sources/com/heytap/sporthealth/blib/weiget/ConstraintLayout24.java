package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintLayout24 extends ConstraintLayout {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7744j;
    public int k;

    public ConstraintLayout24(@NonNull Context context) {
        this(context, null);
    }

    public int getActualWidth() {
        return this.k - (this.i * 2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int actualWidth = getActualWidth();
        if (this.f7744j != 0.0f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(actualWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(actualWidth * this.f7744j), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(actualWidth, 1073741824), i2);
        }
    }

    public ConstraintLayout24(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstraintLayout24(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ConstraintLayout24(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        int i3;
        super(context, attributeSet, i, i2);
        this.i = MultiStateLayout.g(24.0f);
        this.k = getResources().getDisplayMetrics().widthPixels;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio);
        int length = string.length();
        int iIndexOf = string.indexOf(44);
        int i4 = 0;
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            i3 = 0;
        } else {
            String strSubstring = string.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST) && strSubstring.equalsIgnoreCase("H")) {
                i4 = 1;
            }
            int i5 = i4;
            i4 = iIndexOf + 1;
            i3 = i5;
        }
        int iIndexOf2 = string.indexOf(58);
        int iLastIndexOf = string.lastIndexOf(44);
        if (iLastIndexOf <= i4) {
            iLastIndexOf = string.length();
        } else {
            this.i = MultiStateLayout.g(Integer.parseInt(string.substring(iLastIndexOf + 1)));
        }
        if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
            String strSubstring2 = string.substring(i4, iIndexOf2);
            String strSubstring3 = string.substring(iIndexOf2 + 1, iLastIndexOf);
            if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                try {
                    float f = Float.parseFloat(strSubstring2);
                    float f2 = Float.parseFloat(strSubstring3);
                    if (f > 0.0f && f2 > 0.0f) {
                        if (i3 == 1) {
                            this.f7744j = Math.abs(f / f2);
                        } else {
                            this.f7744j = Math.abs(f2 / f);
                        }
                    }
                } catch (NumberFormatException e2) {
                    e2.getMessage();
                }
            }
        } else {
            String strSubstring4 = string.substring(i4);
            if (strSubstring4.length() > 0) {
                try {
                    this.f7744j = Float.parseFloat(strSubstring4);
                } catch (NumberFormatException e3) {
                    e3.getMessage();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
