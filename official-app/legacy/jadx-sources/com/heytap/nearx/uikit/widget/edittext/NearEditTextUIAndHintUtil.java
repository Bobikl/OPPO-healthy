package com.heytap.nearx.uikit.widget.edittext;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.plc;

/* JADX INFO: loaded from: classes18.dex */
public class NearEditTextUIAndHintUtil {
    private static final int ALPHA_VALUE = 255;
    private static final long BACKGROUND_ANIMATION_DURATION = 250;
    private static final long LABEL_SCALE_ANIMATION_DURATION = 200;
    private static final int MODE_BACKGROUND_LINE = 1;
    private static final int MODE_BACKGROUND_NONE = 0;
    public static final int MODE_BACKGROUND_RECT = 2;
    private int defaultFocusedStrokeColor;
    private boolean jumpStateChanged;
    private ValueAnimator mAnimator;
    private ValueAnimator mAnimator1;
    private ValueAnimator mAnimator2;
    private GradientDrawable mBoxBackground;
    private int mBoxBackgroundMode;
    private float mBoxCornerRadiusBottomEnd;
    private float mBoxCornerRadiusBottomStart;
    private float mBoxCornerRadiusTopEnd;
    private float mBoxCornerRadiusTopStart;
    private int mBoxStrokeColor;
    private NearCutoutDrawable.NearCollapseTextHelper mColorCollapseTextHelper;
    private NearEditText mColorEditText;
    private ColorStateList mDefaultHintTextColor;
    private int mDefaultStrokeColor;
    private int mDisabledColor;
    private Paint mDisabledPaint;
    private float mDrawX;
    private Paint mEmptyTextPaint;
    private int mErrorColor;
    private NearErrorEditTextHelper mErrorStateHelper;
    private int mFocusedAlpha;
    private Paint mFocusedPaint;
    private int mFocusedStrokeColor;
    private ColorStateList mFocusedTextColor;
    private CharSequence mHint;
    private boolean mHintAnimationEnabled;
    private boolean mHintEnabled;
    private boolean mHintExpanded;
    private boolean mInDrawableStateChanged;
    private boolean mIsProvidingHint;
    private int mLabelCutoutPadding;
    private boolean mLineExpanded;
    private int mLineModePaddingMiddle;
    private int mLineModePaddingTop;
    private int mLinePadding;
    private Paint mNormalPaint;
    private CharSequence mOriginalHint;
    private Interpolator mPathInterpolator1;
    private Interpolator mPathInterpolator2;
    private int mRectModePaddingMiddle;
    private int mRectModePaddingTop;
    private int mStrokeWidthFocused;
    private TextPaint mTextPaint;
    private int mStrokeWidth = 2;
    private int mFocusStrokeWidth = 4;
    private RectF mTmpRectF = new RectF();
    private boolean mEnableTopHint = true;
    private int labelScaleAnimationDuration = 0;
    private int backgroundAnimationDuration = 0;
    private int requestPaddingTop = -1;
    private boolean mIsEllipsize = false;
    private String mInputText = "";
    private int mClickSelectionPosition = 0;
    private int linePadding = 0;
    private View.OnLayoutChangeListener layoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearEditTextUIAndHintUtil.4
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NearEditTextUIAndHintUtil.this.mEnableTopHint) {
                return;
            }
            if (NearEditTextUIAndHintUtil.this.mColorEditText.getText() == null || NearEditTextUIAndHintUtil.this.mColorEditText.getText().length() <= 0) {
                NearEditTextUIAndHintUtil.this.mColorCollapseTextHelper.setText(NearEditTextUIAndHintUtil.this.mHint);
            } else {
                NearEditTextUIAndHintUtil.this.mColorCollapseTextHelper.setText("");
            }
        }
    };

    public NearEditTextUIAndHintUtil(NearEditText nearEditText, AttributeSet attributeSet, int i, boolean z, int i2) {
        this.mColorEditText = nearEditText;
        this.mColorCollapseTextHelper = new NearCutoutDrawable.NearCollapseTextHelper(this.mColorEditText);
        this.defaultFocusedStrokeColor = i2;
        this.mErrorStateHelper = new NearErrorEditTextHelper(this.mColorEditText);
        try {
            initHintMode(nearEditText.getContext(), attributeSet, i);
        } catch (Exception e2) {
            fjc.b("NearEditTextUIAndHintUtil", "initMode error:" + e2.toString());
        }
        setEnableTopHint(z);
    }

    private void animateToExpansionFraction(float f) {
        if (this.mColorCollapseTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.mAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.mPathInterpolator1);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearEditTextUIAndHintUtil.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearEditTextUIAndHintUtil.this.mColorCollapseTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.mAnimator.setDuration(200L);
        this.mAnimator.setFloatValues(this.mColorCollapseTextHelper.getExpansionFraction(), f);
        this.mAnimator.start();
    }

    private void animateToHideBackground() {
        if (this.mAnimator2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mAnimator2 = valueAnimator;
            valueAnimator.setInterpolator(this.mPathInterpolator2);
            this.mAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearEditTextUIAndHintUtil.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearEditTextUIAndHintUtil.this.mFocusedAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    NearEditTextUIAndHintUtil.this.mColorEditText.invalidate();
                }
            });
        }
        this.mAnimator2.setDuration(BACKGROUND_ANIMATION_DURATION);
        this.mAnimator2.setIntValues(255, 0);
        this.mAnimator2.start();
        this.mLineExpanded = false;
    }

    private void animateToShowBackground() {
        if (this.mAnimator1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mAnimator1 = valueAnimator;
            valueAnimator.setInterpolator(this.mPathInterpolator2);
            this.mAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearEditTextUIAndHintUtil.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearEditTextUIAndHintUtil.this.mDrawX = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    NearEditTextUIAndHintUtil.this.mColorEditText.invalidate();
                }
            });
        }
        this.mAnimator1.setDuration(BACKGROUND_ANIMATION_DURATION);
        this.mFocusedAlpha = 255;
        this.mAnimator1.setFloatValues(0.0f, 1.0f);
        this.mAnimator1.start();
        this.mLineExpanded = true;
    }

    private void applyBoxAttributes() {
        int i;
        if (this.mBoxBackground == null) {
            return;
        }
        setBoxAttributes();
        int i2 = this.mStrokeWidth;
        if (i2 > -1 && (i = this.mBoxStrokeColor) != 0) {
            this.mBoxBackground.setStroke(i2, i);
        }
        this.mBoxBackground.setCornerRadii(getCornerRadiiAsArray());
        this.mColorEditText.invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f = rectF.left;
        int i = this.mLabelCutoutPadding;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    private void assignBoxBackgroundByMode() {
        int i = this.mBoxBackgroundMode;
        if (i == 0) {
            this.mBoxBackground = null;
            return;
        }
        if (i == 2 && this.mHintEnabled && !(this.mBoxBackground instanceof NearCutoutDrawable)) {
            this.mBoxBackground = new NearCutoutDrawable();
        } else if (this.mBoxBackground == null) {
            this.mBoxBackground = new GradientDrawable();
        }
    }

    private int calculateCollapsedTextTopBounds() {
        int i = this.mBoxBackgroundMode;
        if (i != 1) {
            return i != 2 ? this.mColorEditText.getPaddingTop() : getBoxBackground().getBounds().top - getLabelMarginTop();
        }
        return getBoxBackground().getBounds().top;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((NearCutoutDrawable) this.mBoxBackground).removeCutout();
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mAnimator.cancel();
        }
        if (z && this.mHintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.mColorCollapseTextHelper.setExpansionFraction(1.0f);
        }
        this.mHintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mAnimator.cancel();
        }
        if (z && this.mHintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.mColorCollapseTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((NearCutoutDrawable) this.mBoxBackground).hasCutout()) {
            closeCutout();
        }
        this.mHintExpanded = true;
    }

    private int getBoundsTop() {
        int i = this.mBoxBackgroundMode;
        if (i == 1) {
            return this.mLineModePaddingTop;
        }
        if (i != 2) {
            return 0;
        }
        return (int) (this.mColorCollapseTextHelper.getCollapsedTextHeight() / 2.0f);
    }

    private Drawable getBoxBackground() {
        int i = this.mBoxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.mBoxBackground;
        }
        return null;
    }

    private float[] getCornerRadiiAsArray() {
        float f = this.mBoxCornerRadiusTopEnd;
        float f2 = this.mBoxCornerRadiusTopStart;
        float f3 = this.mBoxCornerRadiusBottomStart;
        float f4 = this.mBoxCornerRadiusBottomEnd;
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    private void initHintMode(Context context, AttributeSet attributeSet, int i) {
        this.mColorCollapseTextHelper.setTextSizeInterpolator(new LinearInterpolator());
        this.mColorCollapseTextHelper.setPositionInterpolator(new LinearInterpolator());
        this.mColorCollapseTextHelper.setCollapsedTextGravity(8388659);
        this.mPathInterpolator1 = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        this.mPathInterpolator2 = new PathInterpolator(0.0f, 0.0f, 0.1f, 1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearEditText, i, R$style.NX_Widget_EditText_HintAnim_Line);
        this.requestPaddingTop = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearEditText_nxRequestPaddingTop, -1.0f);
        this.mHintEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxHintEnabled, false);
        setTopHint(typedArrayObtainStyledAttributes.getText(R$styleable.NearEditText_android_hint));
        if (this.mHintEnabled) {
            this.mHintAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxHintAnimationEnabled, true);
        }
        this.mRectModePaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearEditText_nxRectModePaddingTop, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearEditText_nxCornerRadius, 0.0f);
        this.mBoxCornerRadiusTopStart = dimension;
        this.mBoxCornerRadiusTopEnd = dimension;
        this.mBoxCornerRadiusBottomEnd = dimension;
        this.mBoxCornerRadiusBottomStart = dimension;
        this.mFocusedStrokeColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxStrokeColor, this.defaultFocusedStrokeColor);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearEditText_nxStrokeWidth, 0);
        this.mLinePadding = context.getResources().getDimensionPixelOffset(R$dimen.nx_textinput_line_padding);
        this.mStrokeWidthFocused = this.mStrokeWidth;
        if (this.mHintEnabled) {
            this.mLabelCutoutPadding = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_label_cutout_padding);
            this.mLineModePaddingTop = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_line_padding_top);
            this.mLineModePaddingMiddle = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_line_padding_middle);
        }
        this.mFocusStrokeWidth = 4;
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearEditText_nxBackgroundMode, 0);
        setBoxBackgroundMode(i2);
        if (this.mBoxBackgroundMode != 0) {
            this.mColorEditText.setBackgroundDrawable(null);
        }
        int i3 = R$styleable.NearEditText_android_textColorHint;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i3);
            this.mFocusedTextColor = colorStateList;
            this.mDefaultHintTextColor = colorStateList;
        }
        this.mDefaultStrokeColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxDefaultStrokeColor, 0);
        this.mDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxDisabledStrokeColor, 0);
        setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearEditText_nxCollapsedTextSize, 0), typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearEditText_nxCollapsedTextColor));
        if (i2 == 2) {
            this.mColorCollapseTextHelper.setTypefaces(Typeface.create("sans-serif-medium", 0));
        }
        this.mErrorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxEditTextErrorColor, context.getResources().getColor(R$color.nx_error_color_default));
        typedArrayObtainStyledAttributes.recycle();
        this.mEmptyTextPaint = new Paint();
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setTextSize(context.getResources().getDimensionPixelSize(R$dimen.nx_edittext_text_size));
        Paint paint = new Paint();
        this.mNormalPaint = paint;
        paint.setColor(this.mDefaultStrokeColor);
        this.mNormalPaint.setStrokeWidth(this.mStrokeWidth);
        Paint paint2 = new Paint();
        this.mDisabledPaint = paint2;
        paint2.setColor(this.mDisabledColor);
        this.mDisabledPaint.setStrokeWidth(this.mStrokeWidth);
        Paint paint3 = new Paint();
        this.mFocusedPaint = paint3;
        paint3.setColor(this.mFocusedStrokeColor);
        this.mFocusedPaint.setStrokeWidth(this.mFocusStrokeWidth);
        setEditText();
        this.mErrorStateHelper.init(this.mErrorColor, this.mFocusStrokeWidth, this.mBoxBackgroundMode, getCornerRadiiAsArray(), this.mColorCollapseTextHelper);
    }

    private boolean isRtlMode() {
        return this.mColorEditText.getLayoutDirection() == 1;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateTextInputBoxBounds();
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.mTmpRectF;
            this.mColorCollapseTextHelper.getCollapsedTextActualBounds(rectF);
            applyCutoutPadding(rectF);
            ((NearCutoutDrawable) this.mBoxBackground).setCutout(rectF);
        }
    }

    private void setBoxAttributes() {
        int i = this.mBoxBackgroundMode;
        if (i == 1) {
            this.mStrokeWidth = 0;
        } else if (i == 2 && this.mFocusedStrokeColor == 0) {
            this.mFocusedStrokeColor = this.mFocusedTextColor.getColorForState(this.mColorEditText.getDrawableState(), this.mFocusedTextColor.getDefaultColor());
        }
    }

    private void setEditText() {
        onApplyBoxBackgroundMode();
        this.mColorCollapseTextHelper.setExpandedTextSize(this.mColorEditText.getTextSize());
        int gravity = this.mColorEditText.getGravity();
        this.mColorCollapseTextHelper.setCollapsedTextGravity((gravity & ErrorInfo.OC_OPTION_ERROR_DIR) | 48);
        this.mColorCollapseTextHelper.setExpandedTextGravity(gravity);
        if (this.mDefaultHintTextColor == null) {
            this.mDefaultHintTextColor = this.mColorEditText.getHintTextColors();
        }
        this.mColorEditText.setHint(this.mHintEnabled ? null : "");
        if (TextUtils.isEmpty(this.mHint)) {
            CharSequence topHint = getTopHint();
            this.mOriginalHint = topHint;
            this.mColorEditText.setTopHint(topHint);
            this.mColorEditText.setHint(this.mHintEnabled ? null : "");
        }
        this.mIsProvidingHint = true;
        updateLabelState(false, true);
        if (this.mHintEnabled) {
            updateModePadding();
        }
    }

    private void setEllipsize() {
        if (this.mColorEditText.isFocused()) {
            if (this.mIsEllipsize) {
                this.mColorEditText.setText(this.mInputText);
                this.mColorEditText.setSelection(this.mClickSelectionPosition);
            }
            this.mIsEllipsize = false;
            return;
        }
        if (this.mTextPaint.measureText(String.valueOf(this.mColorEditText.getText())) <= this.mColorEditText.getWidth() || this.mIsEllipsize) {
            return;
        }
        String strValueOf = String.valueOf(this.mColorEditText.getText());
        this.mInputText = strValueOf;
        this.mColorEditText.setNearEditTextNoEllipsisText(strValueOf);
        NearEditText nearEditText = this.mColorEditText;
        nearEditText.setText(TextUtils.ellipsize(nearEditText.getText(), this.mTextPaint, this.mColorEditText.getWidth(), TextUtils.TruncateAt.END));
        this.mIsEllipsize = true;
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mHint)) {
            return;
        }
        this.mHint = charSequence;
        this.mColorCollapseTextHelper.setText(charSequence);
        if (!this.mHintExpanded) {
            openCutout();
        }
        NearErrorEditTextHelper nearErrorEditTextHelper = this.mErrorStateHelper;
        if (nearErrorEditTextHelper != null) {
            nearErrorEditTextHelper.setHintInternal(this.mColorCollapseTextHelper);
        }
    }

    private void updateLineModeBackground() {
        if (this.mBoxBackgroundMode != 1) {
            return;
        }
        if (!this.mColorEditText.isEnabled()) {
            this.mDrawX = 0.0f;
            return;
        }
        if (this.mColorEditText.hasFocus()) {
            if (this.mLineExpanded) {
                return;
            }
            animateToShowBackground();
        } else if (this.mLineExpanded) {
            animateToHideBackground();
        }
    }

    private void updateModePadding() {
        int modePaddingTop = this.requestPaddingTop;
        if (modePaddingTop == -1) {
            modePaddingTop = getModePaddingTop();
        }
        int paddingRight = isRtlMode() ? this.mColorEditText.getPaddingRight() : this.mColorEditText.getPaddingLeft();
        int paddingLeft = isRtlMode() ? this.mColorEditText.getPaddingLeft() : this.mColorEditText.getPaddingRight();
        NearEditText nearEditText = this.mColorEditText;
        ViewCompat.setPaddingRelative(nearEditText, paddingRight, modePaddingTop, paddingLeft, nearEditText.getPaddingBottom());
    }

    private void updateTextInputBoxBounds() {
        if (this.mBoxBackgroundMode == 0 || this.mBoxBackground == null || this.mColorEditText.getRight() == 0) {
            return;
        }
        this.mBoxBackground.setBounds(0, getBoundsTop(), this.mColorEditText.getWidth(), this.mColorEditText.getHeight());
        applyBoxAttributes();
    }

    private void updateTextInputBoxState() {
        int i;
        if (this.mBoxBackground == null || (i = this.mBoxBackgroundMode) == 0 || i != 2) {
            return;
        }
        if (!this.mColorEditText.isEnabled()) {
            this.mBoxStrokeColor = this.mDisabledColor;
        } else if (this.mColorEditText.hasFocus()) {
            this.mBoxStrokeColor = this.mFocusedStrokeColor;
        } else {
            this.mBoxStrokeColor = this.mDefaultStrokeColor;
        }
        applyBoxAttributes();
    }

    public boolean cutoutEnabled() {
        return this.mHintEnabled && !TextUtils.isEmpty(this.mHint) && (this.mBoxBackground instanceof NearCutoutDrawable);
    }

    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((NearCutoutDrawable) this.mBoxBackground).hasCutout();
    }

    public void draw(Canvas canvas) {
        if (this.mColorEditText.getMaxLines() < 2) {
            setEllipsize();
        }
        if (this.mColorEditText.getHintTextColors() != this.mDefaultHintTextColor) {
            updateLabelState(false);
        }
        int iSave = canvas.save();
        canvas.translate(this.mColorEditText.getScrollX(), this.mColorEditText.getScrollY());
        if (!this.mHintEnabled && this.mColorEditText.getText().length() != 0) {
            canvas.drawText(" ", 0.0f, 0.0f, this.mEmptyTextPaint);
        } else if (this.mErrorStateHelper.isErrorState()) {
            this.mErrorStateHelper.drawCollapseText(canvas, this.mColorCollapseTextHelper);
        } else {
            this.mColorCollapseTextHelper.draw(canvas);
        }
        if (this.mBoxBackground != null && this.mBoxBackgroundMode == 2) {
            if (this.mColorEditText.getScrollX() != 0) {
                updateTextInputBoxBounds();
            }
            if (this.mErrorStateHelper.isErrorState()) {
                this.mErrorStateHelper.drawModeBackgroundRect(canvas, this.mBoxBackground, this.mBoxStrokeColor);
            } else {
                this.mBoxBackground.draw(canvas);
            }
        }
        if (this.mBoxBackgroundMode == 1) {
            int height = (this.mColorEditText.getHeight() - ((int) ((((double) this.mStrokeWidthFocused) / 2.0d) + 0.5d))) - (this.mColorEditText.getPaddingBottom() - this.mLinePadding > 0 ? this.mColorEditText.getPaddingBottom() - this.mLinePadding : 0);
            this.mFocusedPaint.setAlpha(this.mFocusedAlpha);
            if (!this.mColorEditText.isEnabled()) {
                float f = height;
                canvas.drawLine(0.0f, f, this.mColorEditText.getWidth(), f, this.mDisabledPaint);
            } else if (this.mErrorStateHelper.isErrorState()) {
                this.mErrorStateHelper.drawModeBackgroundLine(canvas, height, this.mColorEditText.getWidth(), (int) (this.mDrawX * this.mColorEditText.getWidth()), this.mNormalPaint, this.mFocusedPaint);
            } else {
                float f2 = height;
                canvas.drawLine(0.0f, f2, this.mColorEditText.getWidth(), f2, this.mNormalPaint);
                canvas.drawLine(0.0f, f2, this.mColorEditText.getWidth() * this.mDrawX, f2, this.mFocusedPaint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    public void drawableStateChanged() {
        boolean state;
        if (this.mInDrawableStateChanged) {
            return;
        }
        this.mInDrawableStateChanged = true;
        this.mColorEditText.superDrawableStateChanged();
        int[] drawableState = this.mColorEditText.getDrawableState();
        if (this.mHintExpanded) {
            updateLabelState(ViewCompat.isLaidOut(this.mColorEditText) && this.mColorEditText.isEnabled());
        } else {
            updateLabelState(false);
        }
        updateLineModeBackground();
        if (this.mHintEnabled) {
            updateTextInputBoxBounds();
            updateTextInputBoxState();
            NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper = this.mColorCollapseTextHelper;
            if (nearCollapseTextHelper != null) {
                state = nearCollapseTextHelper.setState(drawableState) | false;
                this.mErrorStateHelper.drawableStateChanged(drawableState);
            } else {
                state = false;
            }
        } else {
            state = false;
        }
        if (state) {
            this.mColorEditText.invalidate();
        }
        this.mInDrawableStateChanged = false;
    }

    public Rect getBackgroundRect() {
        int i = this.mBoxBackgroundMode;
        if (i == 1 || i == 2) {
            return getBoxBackground().getBounds();
        }
        return null;
    }

    public int getBoxStrokeColor() {
        return this.mFocusedStrokeColor;
    }

    public NearErrorEditTextHelper getErrorStateHelper() {
        return this.mErrorStateHelper;
    }

    public boolean getIsEllipsize() {
        return this.mIsEllipsize;
    }

    public int getLabelMarginTop() {
        if (this.mHintEnabled) {
            return (int) (this.mColorCollapseTextHelper.getCollapsedTextHeight() / 2.0f);
        }
        return 0;
    }

    public int getModePaddingTop() {
        int hintHeight;
        int collapsedTextHeight;
        int i = this.mBoxBackgroundMode;
        if (i == 1) {
            hintHeight = this.mLineModePaddingTop + ((int) this.mColorCollapseTextHelper.getHintHeight());
            collapsedTextHeight = this.mLineModePaddingMiddle;
        } else {
            if (i != 2) {
                return 0;
            }
            hintHeight = this.mRectModePaddingTop;
            collapsedTextHeight = (int) (this.mColorCollapseTextHelper.getCollapsedTextHeight() / 2.0f);
        }
        return hintHeight + collapsedTextHeight;
    }

    public CharSequence getTopHint() {
        if (this.mHintEnabled) {
            return this.mHint;
        }
        return null;
    }

    public boolean isHintEnabled() {
        return this.mHintEnabled;
    }

    public boolean isProvidingHint() {
        return this.mIsProvidingHint;
    }

    public boolean ismHintAnimationEnabled() {
        return this.mHintAnimationEnabled;
    }

    public void onDraw(Canvas canvas) {
        this.mErrorStateHelper.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mBoxBackground != null) {
            updateTextInputBoxBounds();
        }
        if (this.mHintEnabled) {
            updateModePadding();
        }
        int compoundPaddingLeft = this.mColorEditText.getCompoundPaddingLeft();
        int width = this.mColorEditText.getWidth() - this.mColorEditText.getCompoundPaddingRight();
        int iCalculateCollapsedTextTopBounds = calculateCollapsedTextTopBounds();
        this.mColorCollapseTextHelper.setExpandedBounds(compoundPaddingLeft, this.mColorEditText.getCompoundPaddingTop(), width, this.mColorEditText.getHeight() - this.mColorEditText.getCompoundPaddingBottom());
        this.mColorCollapseTextHelper.setCollapsedBounds(compoundPaddingLeft, iCalculateCollapsedTextTopBounds, width, this.mColorEditText.getHeight() - this.mColorEditText.getCompoundPaddingBottom());
        this.mColorCollapseTextHelper.recalculate();
        if (cutoutEnabled() && !this.mHintExpanded) {
            openCutout();
        }
        this.mErrorStateHelper.onLayout(this.mColorCollapseTextHelper);
    }

    public void refresh() {
        TypedArray typedArrayObtainStyledAttributes;
        int refreshStyle = this.mColorEditText.getRefreshStyle();
        Context context = this.mColorEditText.getContext();
        String resourceTypeName = context.getResources().getResourceTypeName(refreshStyle);
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R$styleable.NearEditText, refreshStyle, 0);
        } else if (!Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            return;
        } else {
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R$styleable.NearEditText, 0, refreshStyle);
        }
        int i = R$styleable.NearEditText_android_textColorHint;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i);
            this.mFocusedTextColor = colorStateList;
            this.mDefaultHintTextColor = colorStateList;
            if (colorStateList == null) {
                this.mDefaultHintTextColor = this.mColorEditText.getHintTextColors();
            }
        }
        this.mErrorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxEditTextErrorColor, context.getResources().getColor(R$color.nx_error_color_default));
        this.mFocusedStrokeColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxStrokeColor, plc.b(context, R$attr.nxColorPrimary, 0));
        this.mDefaultStrokeColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxDefaultStrokeColor, 0);
        this.mDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearEditText_nxDisabledStrokeColor, 0);
        this.mErrorStateHelper.setErrorColor(this.mErrorColor);
        this.mNormalPaint.setColor(this.mDefaultStrokeColor);
        this.mDisabledPaint.setColor(this.mDisabledColor);
        this.mFocusedPaint.setColor(this.mFocusedStrokeColor);
        updateTextInputBoxState();
        typedArrayObtainStyledAttributes.recycle();
        this.mColorEditText.invalidate();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.mBoxBackgroundMode) {
            return;
        }
        this.mBoxBackgroundMode = i;
        onApplyBoxBackgroundMode();
    }

    public void setBoxStrokeColor(int i) {
        if (this.mFocusedStrokeColor != i) {
            this.mFocusedStrokeColor = i;
            this.mFocusedPaint.setColor(i);
            updateTextInputBoxState();
        }
    }

    public void setClickSelectionPosition(int i) {
        this.mClickSelectionPosition = i;
    }

    public void setCollapsedTextAppearance(int i, ColorStateList colorStateList) {
        this.mColorCollapseTextHelper.setCollapsedTextAppearance(i, colorStateList);
        this.mFocusedTextColor = this.mColorCollapseTextHelper.getCollapsedTextColor();
        updateLabelState(false);
        this.mErrorStateHelper.setCollapsedTextAppearance(i, colorStateList);
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        this.mColorCollapseTextHelper.setCollapsedTextColor(colorStateList);
        this.mFocusedTextColor = this.mColorCollapseTextHelper.getCollapsedTextColor();
    }

    public void setDefaultStrokeColor(int i) {
        if (this.mDefaultStrokeColor != i) {
            this.mDefaultStrokeColor = i;
            this.mNormalPaint.setColor(i);
            updateTextInputBoxState();
        }
    }

    public void setDisabledStrokeColor(int i) {
        if (this.mDisabledColor != i) {
            this.mDisabledColor = i;
            this.mDisabledPaint.setColor(i);
            updateTextInputBoxState();
        }
    }

    public void setEditTextErrorColor(int i) {
        if (i != this.mErrorColor) {
            this.mErrorColor = i;
            this.mErrorStateHelper.setErrorColor(i);
            this.mColorEditText.invalidate();
        }
    }

    public void setEnableTopHint(boolean z) {
        this.mEnableTopHint = z;
        this.labelScaleAnimationDuration = 200;
        this.backgroundAnimationDuration = 250;
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        this.mDefaultHintTextColor = colorStateList;
        this.mColorCollapseTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTextSizeAndColor() {
        this.mColorCollapseTextHelper.setExpandedTextSize(this.mColorEditText.getTextSize());
        this.mDefaultHintTextColor = this.mColorEditText.getHintTextColors();
        this.mColorCollapseTextHelper.setExpandedTextColor(this.mColorEditText.getHintTextColors());
    }

    public void setFocusStrokeWidth(int i) {
        this.mFocusStrokeWidth = i;
        this.mFocusedPaint.setStrokeWidth(i);
        setEditText();
    }

    public void setFocusedPaint(Paint paint) {
        this.mFocusedPaint = paint;
    }

    public void setFocusedStrokeColor(int i) {
        if (this.mFocusedStrokeColor != i) {
            this.mFocusedStrokeColor = i;
            this.mFocusedPaint.setColor(i);
            updateTextInputBoxState();
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.mHintEnabled) {
            this.mHintEnabled = z;
            if (!z) {
                this.mIsProvidingHint = false;
                if (!TextUtils.isEmpty(this.mHint) && TextUtils.isEmpty(getTopHint())) {
                    this.mColorEditText.setHint(this.mHint);
                }
                setHintInternal(null);
                return;
            }
            CharSequence topHint = getTopHint();
            if (!TextUtils.isEmpty(topHint)) {
                if (TextUtils.isEmpty(this.mHint)) {
                    this.mColorEditText.setTopHint(topHint);
                }
                this.mColorEditText.setHint((CharSequence) null);
            }
            this.mIsProvidingHint = true;
        }
    }

    public void setJumpStateChanged(boolean z) {
        this.jumpStateChanged = z;
    }

    public void setLineModePaddingTop(int i) {
        this.mLineModePaddingTop = i;
    }

    public void setLinePadding(int i) {
        this.linePadding = i;
    }

    public void setNormalPaint(Paint paint) {
        this.mNormalPaint = paint;
    }

    public void setRequestPaddingTop(int i) {
        this.requestPaddingTop = i;
    }

    public void setTopHint(CharSequence charSequence) {
        setHintInternal(charSequence);
    }

    public void setUnFocusStrokeWidth(int i) {
        this.mStrokeWidth = i;
        this.mNormalPaint.setStrokeWidth(i);
        setEditText();
    }

    public void setmHintAnimationEnabled(boolean z) {
        this.mHintAnimationEnabled = z;
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        boolean zIsEnabled = this.mColorEditText.isEnabled();
        boolean z3 = !TextUtils.isEmpty(this.mColorEditText.getText());
        if (this.mDefaultHintTextColor != null) {
            this.mDefaultHintTextColor = this.mColorEditText.getHintTextColors();
            this.mColorCollapseTextHelper.setCollapsedTextColor(this.mFocusedTextColor);
            this.mColorCollapseTextHelper.setExpandedTextColor(this.mDefaultHintTextColor);
        }
        if (!zIsEnabled) {
            this.mColorCollapseTextHelper.setCollapsedTextColor(ColorStateList.valueOf(this.mDisabledColor));
            this.mColorCollapseTextHelper.setExpandedTextColor(ColorStateList.valueOf(this.mDisabledColor));
        } else if (this.mColorEditText.hasFocus() && (colorStateList = this.mFocusedTextColor) != null) {
            this.mColorCollapseTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z3 || (this.mColorEditText.isEnabled() && this.mColorEditText.hasFocus())) {
            if (z2 || this.mHintExpanded) {
                collapseHint(z);
            }
        } else if ((z2 || !this.mHintExpanded) && isHintEnabled()) {
            expandHint(z);
        }
        NearErrorEditTextHelper nearErrorEditTextHelper = this.mErrorStateHelper;
        if (nearErrorEditTextHelper != null) {
            nearErrorEditTextHelper.updateLabelState(this.mColorCollapseTextHelper);
        }
    }
}
