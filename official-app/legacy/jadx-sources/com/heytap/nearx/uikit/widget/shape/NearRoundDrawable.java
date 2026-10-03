package com.heytap.nearx.uikit.widget.shape;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class NearRoundDrawable extends Drawable {
    private NearRoundDrawableState drawableState;
    private Paint fillPaint;
    private Path fillPath;
    private boolean pathDirty;
    private RectF rectF;
    private Paint strokePaint;
    private Path strokePath;

    @Nullable
    private PorterDuffColorFilter strokeTintFilter;

    @Nullable
    private PorterDuffColorFilter tintFilter;

    public NearRoundDrawable() {
        this(new NearRoundDrawableState());
    }

    private void calculatePath() {
        this.fillPath = NearShapePath.getRoundRectPath(this.fillPath, getBoundsAsRectF(), this.drawableState.radius);
    }

    private void calculateStrokePath() {
        this.strokePath = NearShapePath.getRoundRectPath(this.strokePath, getBoundsAsRectF(), this.drawableState.radius);
    }

    @NonNull
    private PorterDuffColorFilter calculateTintFilter(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private boolean hasFill() {
        Paint paint = this.fillPaint;
        return ((paint == null || paint.getColor() == 0) && this.tintFilter == null) ? false : true;
    }

    private boolean hasStroke() {
        Paint paint = this.strokePaint;
        return ((paint == null || paint.getStrokeWidth() <= 0.0f || this.strokePaint.getColor() == 0) && this.strokeTintFilter == null) ? false : true;
    }

    private static int modulateAlpha(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.drawableState.fillColor == null || color2 == (colorForState2 = this.drawableState.fillColor.getColorForState(iArr, (color2 = this.fillPaint.getColor())))) {
            z = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z = true;
        }
        if (this.drawableState.strokeColor == null || color == (colorForState = this.drawableState.strokeColor.getColorForState(iArr, (color = this.strokePaint.getColor())))) {
            return z;
        }
        this.strokePaint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fillPaint.setColorFilter(this.tintFilter);
        int alpha = this.fillPaint.getAlpha();
        this.fillPaint.setAlpha(modulateAlpha(alpha, this.drawableState.alpha));
        this.strokePaint.setStrokeWidth(this.drawableState.strokeWidth);
        this.strokePaint.setColorFilter(this.strokeTintFilter);
        int alpha2 = this.strokePaint.getAlpha();
        this.strokePaint.setAlpha(modulateAlpha(alpha2, this.drawableState.alpha));
        if (this.pathDirty) {
            calculateStrokePath();
            calculatePath();
            this.pathDirty = false;
        }
        if (hasFill()) {
            canvas.drawPath(this.fillPath, this.fillPaint);
        }
        if (hasStroke()) {
            canvas.drawPath(this.strokePath, this.strokePaint);
        }
        this.fillPaint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha2);
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        this.rectF.set(getBounds());
        return this.rectF;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public ColorStateList getFillColor() {
        return this.drawableState.fillColor;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void invalidateIgnoreCalculate() {
        this.pathDirty = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.pathDirty = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.drawableState.tintList) != null && colorStateList.isStateful()) || (((colorStateList2 = this.drawableState.strokeTintList) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.drawableState.strokeColor) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.drawableState.fillColor) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.drawableState = new NearRoundDrawableState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zUpdateColorsForState = updateColorsForState(iArr);
        if (zUpdateColorsForState) {
            invalidateSelf();
        }
        return zUpdateColorsForState;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        NearRoundDrawableState nearRoundDrawableState = this.drawableState;
        if (nearRoundDrawableState.alpha != i) {
            nearRoundDrawableState.alpha = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        NearRoundDrawableState nearRoundDrawableState = this.drawableState;
        if (nearRoundDrawableState.colorFilter != colorFilter) {
            nearRoundDrawableState.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setFillColor(ColorStateList colorStateList) {
        NearRoundDrawableState nearRoundDrawableState = this.drawableState;
        if (nearRoundDrawableState.fillColor != colorStateList) {
            nearRoundDrawableState.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setRadius(float f) {
        this.drawableState.radius = f;
    }

    public void setStroke(float f, @ColorInt int i) {
        setStroke(f, ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        NearRoundDrawableState nearRoundDrawableState = this.drawableState;
        nearRoundDrawableState.tintList = colorStateList;
        PorterDuffColorFilter porterDuffColorFilterCalculateTintFilter = calculateTintFilter(colorStateList, nearRoundDrawableState.tintMode);
        this.strokeTintFilter = porterDuffColorFilterCalculateTintFilter;
        this.tintFilter = porterDuffColorFilterCalculateTintFilter;
        invalidateIgnoreCalculate();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        NearRoundDrawableState nearRoundDrawableState = this.drawableState;
        nearRoundDrawableState.tintMode = mode;
        PorterDuffColorFilter porterDuffColorFilterCalculateTintFilter = calculateTintFilter(nearRoundDrawableState.tintList, mode);
        this.strokeTintFilter = porterDuffColorFilterCalculateTintFilter;
        this.tintFilter = porterDuffColorFilterCalculateTintFilter;
        invalidateIgnoreCalculate();
    }

    public NearRoundDrawable(@NonNull NearRoundDrawableState nearRoundDrawableState) {
        this.fillPaint = new Paint(1);
        this.strokePaint = new Paint(1);
        this.rectF = new RectF();
        this.fillPath = new Path();
        this.strokePath = new Path();
        this.drawableState = nearRoundDrawableState;
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.strokePaint.setStyle(Paint.Style.STROKE);
    }

    public void setStroke(float f, ColorStateList colorStateList) {
        NearRoundDrawableState nearRoundDrawableState = this.drawableState;
        if (nearRoundDrawableState.strokeWidth == f && nearRoundDrawableState.strokeColor == colorStateList) {
            return;
        }
        nearRoundDrawableState.strokeWidth = f;
        nearRoundDrawableState.strokeColor = colorStateList;
        if (onStateChange(getState())) {
            return;
        }
        invalidateSelf();
    }

    public void setFillColor(@ColorInt int i) {
        setFillColor(ColorStateList.valueOf(i));
    }

    public static final class NearRoundDrawableState extends Drawable.ConstantState {
        public int alpha;

        @Nullable
        public ColorFilter colorFilter;

        @Nullable
        public ColorStateList fillColor;
        public float radius;

        @Nullable
        public ColorStateList strokeColor;

        @Nullable
        public ColorStateList strokeTintList;
        public float strokeWidth;

        @Nullable
        public ColorStateList tintList;

        @Nullable
        public PorterDuff.Mode tintMode;

        public NearRoundDrawableState() {
            this.colorFilter = null;
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.alpha = 255;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            NearRoundDrawable nearRoundDrawable = new NearRoundDrawable(this);
            nearRoundDrawable.pathDirty = true;
            return nearRoundDrawable;
        }

        public NearRoundDrawableState(NearRoundDrawableState nearRoundDrawableState) {
            this.colorFilter = null;
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.alpha = 255;
            this.colorFilter = nearRoundDrawableState.colorFilter;
            this.fillColor = nearRoundDrawableState.fillColor;
            this.strokeColor = nearRoundDrawableState.strokeColor;
            this.strokeTintList = nearRoundDrawableState.strokeTintList;
            this.tintList = nearRoundDrawableState.tintList;
            this.strokeWidth = nearRoundDrawableState.strokeWidth;
            this.radius = nearRoundDrawableState.radius;
        }
    }
}
