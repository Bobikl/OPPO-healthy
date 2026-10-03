package com.heytap.nearx.uikit.widget.panel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes18.dex */
public class NearDraggableVerticalLinearLayout extends LinearLayout {
    private ImageView mAnimDragView;
    private Drawable mDragViewDrawable;

    @ColorInt
    private int mDragViewDrawableTintColor;
    private float mElevation;
    private boolean mHasShadowNinePatchDrawable;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private int mStyle;

    public NearDraggableVerticalLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    private void initDragView(AttributeSet attributeSet, int i, int i2) {
        setOrientation(1);
        this.mAnimDragView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R$dimen.nx_panel_drag_view_width), (int) getResources().getDimension(R$dimen.nx_panel_drag_view_height));
        layoutParams.gravity = 1;
        this.mAnimDragView.setLayoutParams(layoutParams);
        this.mAnimDragView.setForceDarkAllowed(false);
        setDragViewByTypeArray(getContext().obtainStyledAttributes(attributeSet, R$styleable.NearDraggableVerticalLinearLayout, i, i2));
        if (attributeSet != null) {
            int styleAttribute = attributeSet.getStyleAttribute();
            this.mStyle = styleAttribute;
            if (styleAttribute == 0) {
                this.mStyle = i;
            }
        } else {
            this.mStyle = i;
        }
        recordPaddingAndElevation();
        addView(this.mAnimDragView);
    }

    private void recordPaddingAndElevation() {
        this.mElevation = getElevation();
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingBottom = getPaddingBottom();
    }

    private void setDragViewByTypeArray(TypedArray typedArray) {
        if (typedArray != null) {
            this.mHasShadowNinePatchDrawable = typedArray.getBoolean(R$styleable.NearDraggableVerticalLinearLayout_hasShadowNinePatchDrawable, false);
            int resourceId = typedArray.getResourceId(R$styleable.NearDraggableVerticalLinearLayout_dragViewIcon, R$drawable.nx_panel_drag_view);
            int color = typedArray.getColor(R$styleable.NearDraggableVerticalLinearLayout_dragViewTintColor, getContext().getResources().getColor(R$color.nx_panel_drag_view_color));
            typedArray.recycle();
            Drawable drawable = AppCompatResources.getDrawable(getContext(), resourceId);
            if (drawable != null) {
                drawable.setTint(color);
                this.mAnimDragView.setImageDrawable(drawable);
            }
            if (this.mHasShadowNinePatchDrawable) {
                setBackground(getContext().getDrawable(R$drawable.nx_panel_bg_with_shadow));
            } else {
                setBackground(getContext().getDrawable(R$drawable.nx_panel_bg_without_shadow));
            }
        }
    }

    public ImageView getDragView() {
        return this.mAnimDragView;
    }

    @Deprecated
    public boolean isHasShadowNinePatchDrawable() {
        return this.mHasShadowNinePatchDrawable;
    }

    public void refresh() {
        TypedArray typedArrayObtainStyledAttributes = null;
        if (this.mStyle != 0) {
            String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
            if (TextUtils.equals(resourceTypeName, "attr")) {
                typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearDraggableVerticalLinearLayout, this.mStyle, 0);
            } else if (TextUtils.equals(resourceTypeName, Const.Arguments.Open.STYLE)) {
                typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearDraggableVerticalLinearLayout, 0, this.mStyle);
            }
        }
        setDragViewByTypeArray(typedArrayObtainStyledAttributes);
        setBackground(getContext().getResources().getDrawable(R$drawable.nx_panel_bg_with_shadow));
    }

    public void setDragViewDrawable(Drawable drawable) {
        if (drawable != null) {
            this.mDragViewDrawable = drawable;
            this.mAnimDragView.setImageDrawable(drawable);
        }
    }

    public void setDragViewDrawableTintColor(int i) {
        Drawable drawable = this.mDragViewDrawable;
        if (drawable == null || this.mDragViewDrawableTintColor == i) {
            return;
        }
        this.mDragViewDrawableTintColor = i;
        drawable.setTint(i);
        this.mAnimDragView.setImageDrawable(this.mDragViewDrawable);
    }

    @Deprecated
    public void setHasShadowNinePatchDrawable(boolean z) {
        this.mHasShadowNinePatchDrawable = z;
        if (z) {
            setBackground(getContext().getDrawable(R$drawable.nx_panel_bg_with_shadow));
            setElevation(0.0f);
        } else {
            setBackground(getContext().getDrawable(R$drawable.nx_panel_bg_without_shadow));
            setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
            setElevation(this.mElevation);
        }
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(1);
    }

    public NearDraggableVerticalLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxDraggableVerticalLinearLayoutStyle);
    }

    public NearDraggableVerticalLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearDraggableVerticalLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHasShadowNinePatchDrawable = false;
        this.mElevation = 0.0f;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        initDragView(attributeSet, i, i2);
    }
}
