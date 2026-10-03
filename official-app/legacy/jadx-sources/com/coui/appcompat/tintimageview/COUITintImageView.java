package com.coui.appcompat.tintimageview;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.TintTypedArray;
import com.oplus.aiunit.vision.um2;

/* JADX INFO: loaded from: classes13.dex */
public class COUITintImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f2135j = {R.attr.background, R.attr.src};
    public final um2 i;

    public COUITintImageView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        setImageDrawable(this.i.b(i));
    }

    public COUITintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUITintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, f2135j, i, 0);
        if (tintTypedArrayObtainStyledAttributes.length() > 0) {
            if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
                setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(1));
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.i = um2.a(context);
    }
}
