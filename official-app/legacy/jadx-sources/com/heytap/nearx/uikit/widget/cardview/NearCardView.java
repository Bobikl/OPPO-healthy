package com.heytap.nearx.uikit.widget.cardview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
public class NearCardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final NearCardViewImpl IMPL;
    private final NearCardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    static {
        NearCardViewApi21Impl nearCardViewApi21Impl = new NearCardViewApi21Impl();
        IMPL = nearCardViewApi21Impl;
        nearCardViewApi21Impl.initStatic();
    }

    public NearCardView(Context context) {
        super(context);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new NearCardViewDelegate() { // from class: com.heytap.nearx.uikit.widget.cardview.NearCardView.1
            private Drawable mCardBackground;

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public View getCardView() {
                return NearCardView.this;
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public boolean getPreventCornerOverlap() {
                return NearCardView.this.getPreventCornerOverlap();
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public boolean getUseCompatPadding() {
                return NearCardView.this.getUseCompatPadding();
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                NearCardView.this.setBackgroundDrawable(drawable);
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setMinWidthHeightInternal(int i, int i2) {
                NearCardView nearCardView = NearCardView.this;
                if (i > nearCardView.mUserSetMinWidth) {
                    NearCardView.super.setMinimumWidth(i);
                }
                NearCardView nearCardView2 = NearCardView.this;
                if (i2 > nearCardView2.mUserSetMinHeight) {
                    NearCardView.super.setMinimumHeight(i2);
                }
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setShadowPadding(int i, int i2, int i3, int i4) {
                NearCardView.this.mShadowBounds.set(i, i2, i3, i4);
                NearCardView nearCardView = NearCardView.this;
                Rect rect = nearCardView.mContentPadding;
                NearCardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
            }
        };
        initialize(context, null, 0);
    }

    private void initialize(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCardView, i, 0);
        int i2 = R$styleable.NearCardView_nxCardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R$color.cardview_light_background) : getResources().getColor(R$color.cardview_dark_background));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearCardView_nxCardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearCardView_nxCardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearCardView_nxCardMaxElevation, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearCardView_nxCardUseCompatPadding, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearCardView_nxCardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_nxContentPadding, 0);
        this.mContentPadding.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_nxContentPaddingLeft, dimensionPixelSize);
        this.mContentPadding.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_nxContentPaddingTop, dimensionPixelSize);
        this.mContentPadding.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_nxContentPaddingRight, dimensionPixelSize);
        this.mContentPadding.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_nxContentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_android_minWidth, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.initialize(this.mCardViewDelegate, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.getBackgroundColor(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.getElevation(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.getRadius(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        NearCardViewImpl nearCardViewImpl = IMPL;
        if (nearCardViewImpl instanceof NearCardViewApi21Impl) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(nearCardViewImpl.getMinWidth(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(nearCardViewImpl.getMinHeight(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.setElevation(this.mCardViewDelegate, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.updatePadding(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.setMaxElevation(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.setRadius(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, colorStateList);
    }

    public NearCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new NearCardViewDelegate() { // from class: com.heytap.nearx.uikit.widget.cardview.NearCardView.1
            private Drawable mCardBackground;

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public View getCardView() {
                return NearCardView.this;
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public boolean getPreventCornerOverlap() {
                return NearCardView.this.getPreventCornerOverlap();
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public boolean getUseCompatPadding() {
                return NearCardView.this.getUseCompatPadding();
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                NearCardView.this.setBackgroundDrawable(drawable);
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setMinWidthHeightInternal(int i, int i2) {
                NearCardView nearCardView = NearCardView.this;
                if (i > nearCardView.mUserSetMinWidth) {
                    NearCardView.super.setMinimumWidth(i);
                }
                NearCardView nearCardView2 = NearCardView.this;
                if (i2 > nearCardView2.mUserSetMinHeight) {
                    NearCardView.super.setMinimumHeight(i2);
                }
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setShadowPadding(int i, int i2, int i3, int i4) {
                NearCardView.this.mShadowBounds.set(i, i2, i3, i4);
                NearCardView nearCardView = NearCardView.this;
                Rect rect = nearCardView.mContentPadding;
                NearCardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
            }
        };
        initialize(context, attributeSet, 0);
    }

    public NearCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new NearCardViewDelegate() { // from class: com.heytap.nearx.uikit.widget.cardview.NearCardView.1
            private Drawable mCardBackground;

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public View getCardView() {
                return NearCardView.this;
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public boolean getPreventCornerOverlap() {
                return NearCardView.this.getPreventCornerOverlap();
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public boolean getUseCompatPadding() {
                return NearCardView.this.getUseCompatPadding();
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                NearCardView.this.setBackgroundDrawable(drawable);
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setMinWidthHeightInternal(int i2, int i3) {
                NearCardView nearCardView = NearCardView.this;
                if (i2 > nearCardView.mUserSetMinWidth) {
                    NearCardView.super.setMinimumWidth(i2);
                }
                NearCardView nearCardView2 = NearCardView.this;
                if (i3 > nearCardView2.mUserSetMinHeight) {
                    NearCardView.super.setMinimumHeight(i3);
                }
            }

            @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewDelegate
            public void setShadowPadding(int i2, int i3, int i4, int i5) {
                NearCardView.this.mShadowBounds.set(i2, i3, i4, i5);
                NearCardView nearCardView = NearCardView.this;
                Rect rect = nearCardView.mContentPadding;
                NearCardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
            }
        };
        initialize(context, attributeSet, i);
    }
}
