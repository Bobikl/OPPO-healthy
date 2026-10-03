package com.heytap.nearx.uikit.widget.edittext;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.GravityCompat;
import com.oplus.aiunit.vision.ugc;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearCutoutDrawable extends GradientDrawable {
    private final RectF mCutoutBounds;
    private final Paint mCutoutPaint = new Paint(1);
    private int mSavedLayer;

    public static final class NearCollapseTextHelper {
        private static final boolean DEBUG_DRAW = false;
        private static final float POINT_001 = 0.001f;
        private static final float SCALE_MY = 1.3f;
        private static final String TAG = "COUICollapseTextHelper";
        private boolean mBoundsChanged;
        private final Rect mCollapsedBounds;
        private float mCollapsedDrawX;
        private float mCollapsedDrawY;
        private ColorStateList mCollapsedTextColor;
        private final RectF mCurrentBounds;
        private float mCurrentDrawX;
        private float mCurrentDrawY;
        private float mCurrentTextSize;
        private boolean mDrawTitle;
        private final Rect mExpandedBounds;
        private float mExpandedDrawX;
        private float mExpandedDrawY;
        private float mExpandedFraction;
        private ColorStateList mExpandedTextColor;
        private Bitmap mExpandedTitleTexture;
        private boolean mIsRtl;
        private Interpolator mPositionInterpolator;
        private float mScale;
        private int[] mState;
        private CharSequence mText;
        private final TextPaint mTextPaint;
        private Interpolator mTextSizeInterpolator;
        private CharSequence mTextToDraw;
        private float mTextureAscent;
        private float mTextureDescent;
        private Paint mTexturePaint;
        private final TextPaint mTmpPaint;
        private boolean mUseTexture;
        private final View mView;
        private static final boolean USE_SCALING_TEXTURE = false;
        private static final Paint DEBUG_DRAW_PAINT = null;
        private int mExpandedTextGravity = 16;
        private int mCollapsedTextGravity = 16;
        private float mExpandedTextSize = 30.0f;
        private float mCollapsedTextSize = 30.0f;

        public NearCollapseTextHelper(View view) {
            this.mView = view;
            TextPaint textPaint = new TextPaint(129);
            this.mTextPaint = textPaint;
            this.mTmpPaint = new TextPaint(textPaint);
            this.mCollapsedBounds = new Rect();
            this.mExpandedBounds = new Rect();
            this.mCurrentBounds = new RectF();
        }

        private static int blendColors(int i, int i2, float f) {
            float f2 = 1.0f - f;
            return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
        }

        private void calculateBaseOffsets() {
            float f = this.mCurrentTextSize;
            calculateUsingTextSize(this.mCollapsedTextSize);
            CharSequence charSequence = this.mTextToDraw;
            float fMeasureText = charSequence != null ? this.mTextPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
            int absoluteGravity = GravityCompat.getAbsoluteGravity(this.mCollapsedTextGravity, this.mIsRtl ? 1 : 0);
            int i = absoluteGravity & 112;
            if (i != 48) {
                if (i != 80) {
                    this.mCollapsedDrawY = this.mCollapsedBounds.centerY() + (((this.mTextPaint.descent() - this.mTextPaint.ascent()) / 2.0f) - this.mTextPaint.descent());
                } else {
                    this.mCollapsedDrawY = this.mCollapsedBounds.bottom;
                }
            } else if (Locale.getDefault().getLanguage().equals("my")) {
                this.mCollapsedDrawY = this.mCollapsedBounds.top - (this.mTextPaint.ascent() * 1.3f);
            } else {
                this.mCollapsedDrawY = this.mCollapsedBounds.top - this.mTextPaint.ascent();
            }
            int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i2 == 1) {
                this.mCollapsedDrawX = this.mCollapsedBounds.centerX() - (fMeasureText / 2.0f);
            } else if (i2 != 5) {
                this.mCollapsedDrawX = this.mCollapsedBounds.left;
            } else {
                this.mCollapsedDrawX = this.mCollapsedBounds.right - fMeasureText;
            }
            calculateUsingTextSize(this.mExpandedTextSize);
            CharSequence charSequence2 = this.mTextToDraw;
            float fMeasureText2 = charSequence2 != null ? this.mTextPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
            int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.mExpandedTextGravity, this.mIsRtl ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            if (i3 == 48) {
                this.mExpandedDrawY = this.mExpandedBounds.top - this.mTextPaint.ascent();
            } else if (i3 != 80) {
                this.mExpandedDrawY = this.mExpandedBounds.centerY() + (((this.mTextPaint.getFontMetrics().bottom - this.mTextPaint.getFontMetrics().top) / 2.0f) - this.mTextPaint.getFontMetrics().bottom);
            } else {
                this.mExpandedDrawY = this.mExpandedBounds.bottom;
            }
            int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i4 == 1) {
                this.mExpandedDrawX = this.mExpandedBounds.centerX() - (fMeasureText2 / 2.0f);
            } else if (i4 != 5) {
                this.mExpandedDrawX = this.mExpandedBounds.left;
            } else {
                this.mExpandedDrawX = this.mExpandedBounds.right - fMeasureText2;
            }
            clearTexture();
            setInterpolatedTextSize(f);
        }

        private void calculateCurrentOffsets() {
            calculateOffsets(this.mExpandedFraction);
        }

        private boolean calculateIsRtl(CharSequence charSequence) {
            return isRtlMode();
        }

        private void calculateOffsets(float f) {
            interpolateBounds(f);
            this.mCurrentDrawX = lerp(this.mExpandedDrawX, this.mCollapsedDrawX, f, this.mPositionInterpolator);
            this.mCurrentDrawY = lerp(this.mExpandedDrawY, this.mCollapsedDrawY, f, this.mPositionInterpolator);
            setInterpolatedTextSize(lerp(this.mExpandedTextSize, this.mCollapsedTextSize, f, this.mTextSizeInterpolator));
            if (this.mCollapsedTextColor != this.mExpandedTextColor) {
                this.mTextPaint.setColor(blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f));
            } else {
                this.mTextPaint.setColor(getCurrentCollapsedTextColor());
            }
            this.mView.postInvalidate();
        }

        private void calculateUsingTextSize(float f) {
            float f2;
            boolean z;
            if (this.mText == null) {
                return;
            }
            float fWidth = this.mCollapsedBounds.width();
            float fWidth2 = this.mExpandedBounds.width();
            if (isClose(f, this.mCollapsedTextSize)) {
                f2 = this.mCollapsedTextSize;
                this.mScale = 1.0f;
            } else {
                float f3 = this.mExpandedTextSize;
                if (isClose(f, f3)) {
                    this.mScale = 1.0f;
                } else {
                    this.mScale = f / this.mExpandedTextSize;
                }
                float f4 = this.mCollapsedTextSize / this.mExpandedTextSize;
                fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
                f2 = f3;
            }
            if (fWidth > 0.0f) {
                z = this.mCurrentTextSize != f2 || this.mBoundsChanged;
                this.mCurrentTextSize = f2;
                this.mBoundsChanged = false;
            } else {
                z = false;
            }
            if (this.mTextToDraw == null || z) {
                this.mTextPaint.setTextSize(this.mCurrentTextSize);
                this.mTextPaint.setLinearText(this.mScale != 1.0f);
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.mText, this.mTextPaint, fWidth, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(charSequenceEllipsize, this.mTextToDraw)) {
                    this.mTextToDraw = charSequenceEllipsize;
                }
            }
            this.mIsRtl = isRtlMode();
        }

        private void clearTexture() {
            Bitmap bitmap = this.mExpandedTitleTexture;
            if (bitmap != null) {
                bitmap.recycle();
                this.mExpandedTitleTexture = null;
            }
        }

        private float constrain(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }

        private void ensureExpandedTexture() {
            if (this.mExpandedTitleTexture != null || this.mExpandedBounds.isEmpty() || TextUtils.isEmpty(this.mTextToDraw)) {
                return;
            }
            calculateOffsets(0.0f);
            this.mTextureAscent = this.mTextPaint.ascent();
            this.mTextureDescent = this.mTextPaint.descent();
            TextPaint textPaint = this.mTextPaint;
            CharSequence charSequence = this.mTextToDraw;
            int iRound = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int iRound2 = Math.round(this.mTextureDescent - this.mTextureAscent);
            if (iRound <= 0 || iRound2 <= 0) {
                return;
            }
            this.mExpandedTitleTexture = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mExpandedTitleTexture);
            CharSequence charSequence2 = this.mTextToDraw;
            canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, iRound2 - this.mTextPaint.descent(), this.mTextPaint);
            if (this.mTexturePaint == null) {
                this.mTexturePaint = new Paint(3);
            }
        }

        private int getCurrentExpandedTextColor() {
            int[] iArr = this.mState;
            return iArr != null ? this.mExpandedTextColor.getColorForState(iArr, 0) : this.mExpandedTextColor.getDefaultColor();
        }

        private void getTextPaintCollapsed(TextPaint textPaint) {
            textPaint.setTextSize(this.mCollapsedTextSize);
        }

        private void interpolateBounds(float f) {
            this.mCurrentBounds.left = lerp(this.mExpandedBounds.left, this.mCollapsedBounds.left, f, this.mPositionInterpolator);
            this.mCurrentBounds.top = lerp(this.mExpandedDrawY, this.mCollapsedDrawY, f, this.mPositionInterpolator);
            this.mCurrentBounds.right = lerp(this.mExpandedBounds.right, this.mCollapsedBounds.right, f, this.mPositionInterpolator);
            this.mCurrentBounds.bottom = lerp(this.mExpandedBounds.bottom, this.mCollapsedBounds.bottom, f, this.mPositionInterpolator);
        }

        private static boolean isClose(float f, float f2) {
            return Math.abs(f - f2) < 0.001f;
        }

        private boolean isRtlMode() {
            return this.mView.getLayoutDirection() == 1;
        }

        private static float lerp(float f, float f2, float f3) {
            return f + (f3 * (f2 - f));
        }

        private void onBoundsChanged() {
            this.mDrawTitle = this.mCollapsedBounds.width() > 0 && this.mCollapsedBounds.height() > 0 && this.mExpandedBounds.width() > 0 && this.mExpandedBounds.height() > 0;
        }

        private static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
            return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
        }

        private void setInterpolatedTextSize(float f) {
            calculateUsingTextSize(f);
            boolean z = USE_SCALING_TEXTURE && this.mScale != 1.0f;
            this.mUseTexture = z;
            if (z) {
                ensureExpandedTexture();
            }
            this.mView.postInvalidate();
        }

        public float calculateCollapsedTextWidth() {
            if (this.mText == null) {
                return 0.0f;
            }
            getTextPaintCollapsed(this.mTmpPaint);
            TextPaint textPaint = this.mTmpPaint;
            CharSequence charSequence = this.mText;
            return textPaint.measureText(charSequence, 0, charSequence.length());
        }

        public void draw(Canvas canvas) {
            float fAscent;
            int iSave = canvas.save();
            if (this.mTextToDraw == null || !this.mDrawTitle) {
                canvas.drawText(" ", 0.0f, 0.0f, this.mTextPaint);
            } else {
                float f = this.mCurrentDrawX;
                float f2 = this.mCurrentDrawY;
                boolean z = this.mUseTexture && this.mExpandedTitleTexture != null;
                if (z) {
                    fAscent = this.mTextureAscent * this.mScale;
                } else {
                    fAscent = this.mTextPaint.ascent() * this.mScale;
                    this.mTextPaint.descent();
                }
                if (z) {
                    f2 += fAscent;
                }
                float f3 = f2;
                float f4 = this.mScale;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f, f3);
                }
                if (z) {
                    canvas.drawBitmap(this.mExpandedTitleTexture, f, f3, this.mTexturePaint);
                } else {
                    CharSequence charSequence = this.mTextToDraw;
                    canvas.drawText(charSequence, 0, charSequence.length(), f, f3, this.mTextPaint);
                }
            }
            canvas.restoreToCount(iSave);
        }

        public Rect getCollapsedBounds() {
            return this.mCollapsedBounds;
        }

        public void getCollapsedTextActualBounds(RectF rectF) {
            boolean zCalculateIsRtl = calculateIsRtl(this.mText);
            float fCalculateCollapsedTextWidth = !zCalculateIsRtl ? this.mCollapsedBounds.left : this.mCollapsedBounds.right - calculateCollapsedTextWidth();
            rectF.left = fCalculateCollapsedTextWidth;
            Rect rect = this.mCollapsedBounds;
            rectF.top = rect.top;
            rectF.right = !zCalculateIsRtl ? fCalculateCollapsedTextWidth + calculateCollapsedTextWidth() : rect.right;
            rectF.bottom = this.mCollapsedBounds.top + getCollapsedTextHeight();
        }

        public ColorStateList getCollapsedTextColor() {
            return this.mCollapsedTextColor;
        }

        public int getCollapsedTextGravity() {
            return this.mCollapsedTextGravity;
        }

        public float getCollapsedTextHeight() {
            getTextPaintCollapsed(this.mTmpPaint);
            return Locale.getDefault().getLanguage().equals("my") ? (-this.mTmpPaint.ascent()) * 1.3f : -this.mTmpPaint.ascent();
        }

        public float getCollapsedTextSize() {
            return this.mCollapsedTextSize;
        }

        public int getCurrentCollapsedTextColor() {
            int[] iArr = this.mState;
            return iArr != null ? this.mCollapsedTextColor.getColorForState(iArr, 0) : this.mCollapsedTextColor.getDefaultColor();
        }

        public Rect getExpandedBounds() {
            return this.mExpandedBounds;
        }

        public float getExpandedFraction() {
            return this.mExpandedFraction;
        }

        public ColorStateList getExpandedTextColor() {
            return this.mExpandedTextColor;
        }

        public int getExpandedTextGravity() {
            return this.mExpandedTextGravity;
        }

        public float getExpandedTextSize() {
            return this.mExpandedTextSize;
        }

        public float getExpansionFraction() {
            return this.mExpandedFraction;
        }

        public float getHintHeight() {
            getTextPaintCollapsed(this.mTmpPaint);
            float fDescent = this.mTmpPaint.descent() - this.mTmpPaint.ascent();
            return Locale.getDefault().getLanguage().equals("my") ? fDescent * 1.3f : fDescent;
        }

        public CharSequence getText() {
            return this.mText;
        }

        public final boolean isStateful() {
            ColorStateList colorStateList;
            ColorStateList colorStateList2 = this.mCollapsedTextColor;
            return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.mExpandedTextColor) != null && colorStateList.isStateful());
        }

        public void recalculate() {
            if (this.mView.getHeight() <= 0 || this.mView.getWidth() <= 0) {
                return;
            }
            calculateBaseOffsets();
            calculateCurrentOffsets();
        }

        public void setCollapsedBounds(int i, int i2, int i3, int i4) {
            if (rectEquals(this.mCollapsedBounds, i, i2, i3, i4)) {
                return;
            }
            this.mCollapsedBounds.set(i, i2, i3, i4);
            this.mBoundsChanged = true;
            onBoundsChanged();
            Log.d(TAG, "setCollapsedBounds: " + this.mCollapsedBounds);
        }

        public void setCollapsedTextAppearance(int i, ColorStateList colorStateList) {
            this.mCollapsedTextColor = colorStateList;
            this.mCollapsedTextSize = i;
            recalculate();
        }

        public void setCollapsedTextColor(ColorStateList colorStateList) {
            if (this.mCollapsedTextColor != colorStateList) {
                this.mCollapsedTextColor = colorStateList;
                recalculate();
            }
        }

        public void setCollapsedTextGravity(int i) {
            if (this.mCollapsedTextGravity != i) {
                this.mCollapsedTextGravity = i;
                recalculate();
            }
        }

        public void setCollapsedTextSize(float f) {
            if (this.mCollapsedTextSize != f) {
                this.mCollapsedTextSize = f;
                recalculate();
            }
        }

        public void setExpandedBounds(int i, int i2, int i3, int i4) {
            if (rectEquals(this.mExpandedBounds, i, i2, i3, i4)) {
                return;
            }
            this.mExpandedBounds.set(i, i2, i3, i4);
            this.mBoundsChanged = true;
            onBoundsChanged();
            Log.d(TAG, "setExpandedBounds: " + this.mExpandedBounds);
        }

        public void setExpandedTextColor(ColorStateList colorStateList) {
            if (this.mExpandedTextColor != colorStateList) {
                this.mExpandedTextColor = colorStateList;
                recalculate();
            }
        }

        public void setExpandedTextGravity(int i) {
            if (this.mExpandedTextGravity != i) {
                this.mExpandedTextGravity = i;
                recalculate();
            }
        }

        public void setExpandedTextSize(float f) {
            if (this.mExpandedTextSize != f) {
                this.mExpandedTextSize = f;
                recalculate();
            }
        }

        public void setExpansionFraction(float f) {
            float fConstrain = constrain(f, 0.0f, 1.0f);
            if (fConstrain != this.mExpandedFraction) {
                this.mExpandedFraction = fConstrain;
                calculateCurrentOffsets();
            }
        }

        public void setPositionInterpolator(Interpolator interpolator) {
            this.mPositionInterpolator = interpolator;
            recalculate();
        }

        public final boolean setState(int[] iArr) {
            this.mState = iArr;
            if (!isStateful()) {
                return false;
            }
            recalculate();
            return true;
        }

        public void setText(CharSequence charSequence) {
            if (charSequence == null || !charSequence.equals(this.mText)) {
                this.mText = charSequence;
                this.mTextToDraw = null;
                clearTexture();
                recalculate();
            }
        }

        public void setTextSizeInterpolator(Interpolator interpolator) {
            this.mTextSizeInterpolator = interpolator;
            recalculate();
        }

        public void setTypefaces(Typeface typeface) {
            ugc.a(this.mTextPaint, true);
            ugc.a(this.mTmpPaint, true);
            recalculate();
        }

        private int constrain(int i, int i2, int i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }

        private static float lerp(float f, float f2, float f3, Interpolator interpolator) {
            if (interpolator != null) {
                f3 = interpolator.getInterpolation(f3);
            }
            return lerp(f, f2, f3);
        }
    }

    public NearCutoutDrawable() {
        setPaintStyles();
        this.mCutoutBounds = new RectF();
    }

    private void postDraw(Canvas canvas) {
        if (useHardwareLayer(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.mSavedLayer);
    }

    private void preDraw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (useHardwareLayer(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            saveCanvasLayer(canvas);
        }
    }

    private void saveCanvasLayer(Canvas canvas) {
        this.mSavedLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    private void setPaintStyles() {
        this.mCutoutPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mCutoutPaint.setColor(-1);
        this.mCutoutPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean useHardwareLayer(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        preDraw(canvas);
        super.draw(canvas);
        canvas.drawRect(this.mCutoutBounds, this.mCutoutPaint);
        postDraw(canvas);
    }

    public RectF getCutout() {
        return this.mCutoutBounds;
    }

    public boolean hasCutout() {
        return !this.mCutoutBounds.isEmpty();
    }

    public void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void setCutout(float f, float f2, float f3, float f4) {
        RectF rectF = this.mCutoutBounds;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void setCutout(RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
