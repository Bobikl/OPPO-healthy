package com.oppo.store.web.widget.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* JADX INFO: loaded from: classes9.dex */
public class WebCardView extends FrameLayout {
    private final Path mClipPath;
    private final RectF mClipRectF;
    private ColorStateList mColorStateList;
    private WebShapeDrawable mMaterialShapeDrawable;
    private ShapeAppearanceModel mShapeAppearanceModel;
    private int nxCardBLCornerRadius;
    private int nxCardBRCornerRadius;
    private int nxCardCornerRadius;
    private int nxCardTLCornerRadius;
    private int nxCardTRCornerRadius;
    private boolean nxHideBottomShadow;
    private boolean nxHideLeftShadow;
    private boolean nxHideRightShadow;
    private boolean nxHideTopShadow;

    @IntRange(from = 0, to = 360)
    private int nxShadowAngle;

    @ColorInt
    private int nxShadowColor;

    @Px
    private int nxShadowOffset;
    private int nxShadowSize;
    private int nxStrokeColor;
    private ColorStateList nxStrokeStateColor;
    private float nxStrokeWidth;

    public WebCardView(@NonNull Context context) {
        this(context, null);
    }

    private void generateShadowModel() {
        ShapeAppearanceModel.Builder bottomLeftCorner = new ShapeAppearanceModel.Builder().setTopRightCorner(0, this.nxCardTRCornerRadius).setBottomRightCorner(0, this.nxCardBRCornerRadius).setTopLeftCorner(0, this.nxCardTLCornerRadius).setBottomLeftCorner(0, this.nxCardBLCornerRadius);
        if (this.nxHideTopShadow) {
            bottomLeftCorner.setTopEdge(new WebEmptyEdgeTreatment());
        }
        if (this.nxHideBottomShadow) {
            bottomLeftCorner.setBottomEdge(new WebEmptyEdgeTreatment());
        }
        if (this.nxHideLeftShadow) {
            bottomLeftCorner.setLeftEdge(new WebEmptyEdgeTreatment());
        }
        if (this.nxHideRightShadow) {
            bottomLeftCorner.setRightEdge(new WebEmptyEdgeTreatment());
        }
        if (this.nxHideLeftShadow || this.nxHideTopShadow) {
            bottomLeftCorner.setTopLeftCorner(new WebEmptyCornerTreatment());
        }
        if (this.nxHideBottomShadow || this.nxHideLeftShadow) {
            bottomLeftCorner.setBottomLeftCorner(new WebEmptyCornerTreatment());
        }
        if (this.nxHideTopShadow || this.nxHideRightShadow) {
            bottomLeftCorner.setTopRightCorner(new WebEmptyCornerTreatment());
        }
        if (this.nxHideBottomShadow || this.nxHideRightShadow) {
            bottomLeftCorner.setBottomRightCorner(new WebEmptyCornerTreatment());
        }
        this.mShapeAppearanceModel = bottomLeftCorner.build();
    }

    private void initDrawable() {
        WebShapeDrawable webShapeDrawable = this.mMaterialShapeDrawable;
        if (webShapeDrawable == null) {
            this.mMaterialShapeDrawable = new WebShapeDrawable(this.mShapeAppearanceModel);
        } else {
            webShapeDrawable.setShapeAppearanceModel(this.mShapeAppearanceModel);
        }
        this.mMaterialShapeDrawable.setShadowCompatibilityMode(2);
        this.mMaterialShapeDrawable.initializeElevationOverlay(getContext());
        this.mMaterialShapeDrawable.setElevation(this.nxShadowSize);
        this.mMaterialShapeDrawable.setShadowColor(this.nxShadowColor);
        this.mMaterialShapeDrawable.setShadowCompatRotation(this.nxShadowAngle);
        this.mMaterialShapeDrawable.setOffset(this.nxShadowOffset);
        this.mMaterialShapeDrawable.setFillColor(this.mColorStateList);
        this.mMaterialShapeDrawable.setStroke(this.nxStrokeWidth, this.nxStrokeStateColor);
    }

    private void setupDrawable() {
        setBackground(this.mMaterialShapeDrawable);
    }

    public ColorStateList getColorStateList() {
        return this.mColorStateList;
    }

    public WebShapeDrawable getMaterialShapeDrawable() {
        return this.mMaterialShapeDrawable;
    }

    public int getNxCardBLCornerRadius() {
        return this.nxCardBLCornerRadius;
    }

    public int getNxCardBRCornerRadius() {
        return this.nxCardBRCornerRadius;
    }

    public int getNxCardCornerRadius() {
        return this.nxCardCornerRadius;
    }

    public int getNxCardTLCornerRadius() {
        return this.nxCardTLCornerRadius;
    }

    public int getNxCardTRCornerRadius() {
        return this.nxCardTRCornerRadius;
    }

    public int getNxShadowAngle() {
        return this.nxShadowAngle;
    }

    public int getNxShadowColor() {
        return this.nxShadowColor;
    }

    public int getNxShadowOffset() {
        return this.nxShadowOffset;
    }

    public int getNxShadowSize() {
        return this.nxShadowSize;
    }

    public int getNxStrokeColor() {
        return this.nxStrokeColor;
    }

    public ColorStateList getNxStrokeStateColor() {
        return this.nxStrokeStateColor;
    }

    public float getNxStrokeWidth() {
        return this.nxStrokeWidth;
    }

    public boolean isNxHideBottomShadow() {
        return this.nxHideBottomShadow;
    }

    public boolean isNxHideLeftShadow() {
        return this.nxHideLeftShadow;
    }

    public boolean isNxHideRightShadow() {
        return this.nxHideRightShadow;
    }

    public boolean isNxHideTopShadow() {
        return this.nxHideTopShadow;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent != null) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    @Override // android.view.View
    @SuppressLint({"RestrictedApi"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mClipRectF.set(getBackground().getBounds());
        ShapeAppearancePathProvider.getInstance().calculatePath(this.mShapeAppearanceModel, 0.9f, this.mClipRectF, this.mClipPath);
        canvas.clipPath(this.mClipPath);
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.mColorStateList = colorStateList;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxCardBLCornerRadius(int i) {
        this.nxCardBLCornerRadius = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxCardBRCornerRadius(int i) {
        this.nxCardBRCornerRadius = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxCardCornerRadius(int i) {
        this.nxCardCornerRadius = i;
        this.nxCardBLCornerRadius = i;
        this.nxCardBRCornerRadius = i;
        this.nxCardTLCornerRadius = i;
        this.nxCardTRCornerRadius = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxCardTLCornerRadius(int i) {
        this.nxCardTLCornerRadius = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxCardTRCornerRadius(int i) {
        this.nxCardTRCornerRadius = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxHideBottomShadow(boolean z) {
        this.nxHideBottomShadow = z;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxHideLeftShadow(boolean z) {
        this.nxHideLeftShadow = z;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxHideRightShadow(boolean z) {
        this.nxHideRightShadow = z;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxHideTopShadow(boolean z) {
        this.nxHideTopShadow = z;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxShadowAngle(@IntRange(from = 0, to = 360) int i) {
        this.nxShadowAngle = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxShadowColor(@ColorInt int i) {
        this.nxShadowColor = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxShadowOffset(int i) {
        this.nxShadowOffset = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxShadowSize(int i) {
        this.nxShadowSize = i;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxStrokeColor(int i) {
        this.nxStrokeColor = i;
        setNxStrokeStateColor(ColorStateList.valueOf(i));
    }

    public void setNxStrokeStateColor(ColorStateList colorStateList) {
        this.nxStrokeStateColor = colorStateList;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public void setNxStrokeWidth(float f) {
        this.nxStrokeWidth = f;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }

    public WebCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.nxStrokeWidth = 0.0f;
        this.nxStrokeColor = 0;
        this.nxStrokeStateColor = ColorStateList.valueOf(0);
        this.mClipPath = new Path();
        this.mClipRectF = new RectF();
        this.nxCardCornerRadius = 0;
        this.nxHideLeftShadow = false;
        this.nxHideRightShadow = false;
        this.nxHideTopShadow = false;
        this.nxHideBottomShadow = false;
        this.nxShadowColor = 0;
        this.nxShadowSize = 0;
        this.nxShadowAngle = 0;
        this.nxShadowOffset = 0;
        if (this.mColorStateList == null) {
            this.mColorStateList = ColorStateList.valueOf(Color.parseColor("#F5F5F5"));
        }
        if (this.nxStrokeStateColor == null) {
            this.nxStrokeStateColor = ColorStateList.valueOf(0);
        }
        this.nxStrokeWidth = 0.0f;
        generateShadowModel();
        initDrawable();
        setupDrawable();
    }
}
