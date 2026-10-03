package com.heytap.nearx.uikit.widget.tintimageview;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: classes18.dex */
public class NearTintImageView extends AppCompatImageView {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.src};
    private final NearTintManager mTintManager;

    public NearTintImageView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        setImageDrawable(this.mTintManager.getDrawable(i));
    }

    public NearTintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearTintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (tintTypedArrayObtainStyledAttributes.length() > 0) {
            if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
                setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(1));
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.mTintManager = NearTintManager.get(context);
    }
}
