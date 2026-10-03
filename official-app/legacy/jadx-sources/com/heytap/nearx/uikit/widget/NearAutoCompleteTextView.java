package com.heytap.nearx.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.core.view.ViewCompat;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.edittext.NearCutoutDrawable;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.vhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    private static final int ALPHA_VALUE = 255;
    private static final int BACKGROUND_ANIMATION_DURATION = 250;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 200;
    public static final int MODE_BACKGROUND_LINE = 1;
    public static final int MODE_BACKGROUND_NONE = 0;
    public static final int MODE_BACKGROUND_RECT = 2;
    private static final String TAG = "AutoCompleteTextView";
    private boolean enableTopHint;
    private ViewTreeObserver.OnGlobalLayoutListener listener;
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
    private final NearCutoutDrawable.NearCollapseTextHelper mColorCollapseTextHelper;
    private ColorStateList mDefaultHintTextColor;
    private int mDefaultStrokeColor;
    private int mDisabledColor;
    private int mDrawX;
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
    private Paint mNormalPaint;
    private CharSequence mOriginalHint;
    private Interpolator mPathInterpolator1;
    private Interpolator mPathInterpolator2;
    private int mRectModePaddingMiddle;
    private int mRectModePaddingTop;
    private int mStrokeWidth;
    private int mStrokeWidthFocused;
    private RectF mTmpRectF;
    private int requestPaddingTop;
    private int viewWidth;
    private TextWatcher watcher;

    public NearAutoCompleteTextView(Context context) {
        this(context, null);
    }

    private void animateToExpansionFraction(float f) {
        if (this.mColorCollapseTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.mAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.mPathInterpolator1);
            this.mAnimator.setDuration(200L);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearAutoCompleteTextView.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearAutoCompleteTextView.this.mColorCollapseTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.mAnimator.setFloatValues(this.mColorCollapseTextHelper.getExpansionFraction(), f);
        this.mAnimator.start();
    }

    private void animateToHideBackground() {
        if (this.mAnimator2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mAnimator2 = valueAnimator;
            valueAnimator.setInterpolator(this.mPathInterpolator2);
            this.mAnimator2.setDuration(250L);
            this.mAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearAutoCompleteTextView.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearAutoCompleteTextView.this.mFocusedAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    NearAutoCompleteTextView.this.invalidate();
                }
            });
        }
        this.mAnimator2.setIntValues(255, 0);
        this.mAnimator2.start();
        this.mLineExpanded = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateToShowBackground() {
        if (this.mAnimator1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mAnimator1 = valueAnimator;
            valueAnimator.setInterpolator(this.mPathInterpolator2);
            this.mAnimator1.setDuration(250L);
            this.mAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearAutoCompleteTextView.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearAutoCompleteTextView.this.mDrawX = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    NearAutoCompleteTextView.this.invalidate();
                }
            });
        }
        this.mFocusedAlpha = 255;
        this.mAnimator1.setIntValues(0, this.viewWidth);
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
        invalidate();
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
            return i != 2 ? getPaddingTop() : getBoxBackground().getBounds().top - calculateLabelMarginTop();
        }
        return getBoxBackground().getBounds().top;
    }

    private int calculateLabelMarginTop() {
        return (int) (this.mColorCollapseTextHelper.getCollapsedTextHeight() / 2.0f);
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

    private boolean cutoutEnabled() {
        return this.mHintEnabled && !TextUtils.isEmpty(this.mHint) && (this.mBoxBackground instanceof NearCutoutDrawable);
    }

    private void expandHint(boolean z) {
        if (this.mBoxBackground != null) {
            fjc.a(TAG, "mBoxBackground: " + this.mBoxBackground.getBounds());
        }
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

    private int getModePaddingTop() {
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

    private void initHintMode(Context context, AttributeSet attributeSet, int i) {
        vhc.b(this, false);
        this.mColorCollapseTextHelper.setTextSizeInterpolator(new LinearInterpolator());
        this.mColorCollapseTextHelper.setPositionInterpolator(new LinearInterpolator());
        this.mColorCollapseTextHelper.setCollapsedTextGravity(8388659);
        this.mPathInterpolator1 = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        this.mPathInterpolator2 = new PathInterpolator(0.0f, 0.0f, 0.1f, 1.0f);
        setTextCursorDrawable(R$drawable.nx_cursor_default);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearEditText, i, R$style.NearAutoCompleteTextView);
        this.requestPaddingTop = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearEditText_nxRequestPaddingTop, -1.0f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxHintEnabled, false);
        this.mHintEnabled = z;
        if (z) {
            setBackgroundDrawable(null);
            setTopHint(typedArrayObtainStyledAttributes.getText(R$styleable.NearEditText_android_hint));
            this.mHintAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxHintAnimationEnabled, true);
            this.mRectModePaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearEditText_nxRectModePaddingTop, 0);
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearEditText_nxCornerRadius, 0.0f);
            this.enableTopHint = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxEnableTopHint, true);
            addTextChangedListener(this.watcher);
            this.mBoxCornerRadiusTopStart = dimension;
            this.mBoxCornerRadiusTopEnd = dimension;
            this.mBoxCornerRadiusBottomEnd = dimension;
            this.mBoxCornerRadiusBottomStart = dimension;
            int i2 = R$styleable.NearEditText_nxStrokeColor;
            this.mFocusedStrokeColor = typedArrayObtainStyledAttributes.getColor(i2, -16711936);
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearEditText_nxStrokeWidth, 0);
            this.mStrokeWidth = dimensionPixelOffset;
            this.mStrokeWidthFocused = dimensionPixelOffset;
            this.mLabelCutoutPadding = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_label_cutout_padding);
            this.mLineModePaddingTop = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_line_padding_top);
            this.mLineModePaddingMiddle = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_line_padding_middle);
            this.mRectModePaddingMiddle = context.getResources().getDimensionPixelOffset(R$dimen.nx_text_input_rect_padding_middle);
            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearEditText_nxBackgroundMode, 0);
            setBoxBackgroundMode(i3);
            int i4 = R$styleable.NearEditText_android_textColorHint;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i4);
                this.mFocusedTextColor = colorStateList;
                this.mDefaultHintTextColor = colorStateList;
            }
            this.mDefaultStrokeColor = context.getResources().getColor(R$color.nx_text_input_stroke_color_default);
            this.mDisabledColor = context.getResources().getColor(R$color.nx_text_input_stroke_color_disabled);
            setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearEditText_nxCollapsedTextSize, 0), typedArrayObtainStyledAttributes.getColorStateList(i2));
            if (i3 == 2) {
                this.mColorCollapseTextHelper.setTypefaces(Typeface.create("sans-serif-medium", 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            setFocusableInTouchMode(true);
            setFocusable(true);
            setClickable(true);
            Paint paint = new Paint();
            this.mNormalPaint = paint;
            paint.setColor(this.mDefaultStrokeColor);
            this.mNormalPaint.setStrokeWidth(this.mStrokeWidth);
            Paint paint2 = new Paint();
            this.mFocusedPaint = paint2;
            paint2.setColor(this.mFocusedStrokeColor);
            this.mFocusedPaint.setStrokeWidth(this.mStrokeWidth);
            setEditText();
            getViewTreeObserver().addOnGlobalLayoutListener(this.listener);
        }
    }

    private boolean isRtlMode() {
        return getLayoutDirection() == 1;
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
            this.mFocusedStrokeColor = this.mFocusedTextColor.getColorForState(getDrawableState(), this.mFocusedTextColor.getDefaultColor());
        }
    }

    private void setEditText() {
        onApplyBoxBackgroundMode();
        this.mColorCollapseTextHelper.setExpandedTextSize(getTextSize());
        int gravity = getGravity();
        this.mColorCollapseTextHelper.setCollapsedTextGravity((gravity & ErrorInfo.OC_OPTION_ERROR_DIR) | 48);
        this.mColorCollapseTextHelper.setExpandedTextGravity(gravity);
        if (this.mDefaultHintTextColor == null) {
            this.mDefaultHintTextColor = getHintTextColors();
        }
        if (this.mHintEnabled) {
            setHint((CharSequence) null);
            if (TextUtils.isEmpty(this.mHint)) {
                CharSequence hint = getHint();
                this.mOriginalHint = hint;
                setTopHint(hint);
                setHint((CharSequence) null);
            }
            this.mIsProvidingHint = true;
        }
        updateLabelState(false, true);
        updateModePadding();
    }

    private void updateLineModeBackground() {
        if (this.mBoxBackgroundMode != 1) {
            return;
        }
        if (!isEnabled()) {
            this.mDrawX = 0;
            return;
        }
        if (hasFocus()) {
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
        ViewCompat.setPaddingRelative(this, isRtlMode() ? getPaddingRight() : getPaddingLeft(), modePaddingTop, isRtlMode() ? getPaddingLeft() : getPaddingRight(), getPaddingBottom());
    }

    private void updateTextInputBoxBounds() {
        if (this.mBoxBackgroundMode == 0 || this.mBoxBackground == null || getRight() == 0) {
            return;
        }
        this.mBoxBackground.setBounds(0, getBoundsTop(), getWidth(), getHeight());
        applyBoxAttributes();
    }

    private void updateTextInputBoxState() {
        int i;
        if (this.mBoxBackground == null || (i = this.mBoxBackgroundMode) == 0 || i != 2) {
            return;
        }
        if (!isEnabled()) {
            this.mBoxStrokeColor = this.mDisabledColor;
        } else if (hasFocus()) {
            this.mBoxStrokeColor = this.mFocusedStrokeColor;
        } else {
            this.mBoxStrokeColor = this.mDefaultStrokeColor;
        }
        applyBoxAttributes();
    }

    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((NearCutoutDrawable) this.mBoxBackground).hasCutout();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.mHintEnabled) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.mColorCollapseTextHelper.draw(canvas);
            if (this.mBoxBackground != null && this.mBoxBackgroundMode == 2) {
                if (getScrollX() != 0) {
                    updateTextInputBoxBounds();
                }
                this.mBoxBackground.draw(canvas);
            }
            if (this.mBoxBackgroundMode == 1) {
                float height = getHeight() - ((int) ((((double) this.mStrokeWidthFocused) / 2.0d) + 0.5d));
                canvas.drawLine(0.0f, height, getWidth(), height, this.mNormalPaint);
                this.mFocusedPaint.setAlpha(this.mFocusedAlpha);
                canvas.drawLine(0.0f, height, this.mDrawX, height, this.mFocusedPaint);
            }
            canvas.restoreToCount(iSave);
        }
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mHintEnabled && !this.mInDrawableStateChanged) {
            this.mInDrawableStateChanged = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            updateLabelState(ViewCompat.isLaidOut(this) && isEnabled());
            updateLineModeBackground();
            updateTextInputBoxBounds();
            updateTextInputBoxState();
            NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper = this.mColorCollapseTextHelper;
            if (nearCollapseTextHelper != null ? nearCollapseTextHelper.setState(drawableState) | false : false) {
                invalidate();
            }
            this.mInDrawableStateChanged = false;
        }
    }

    public int getBoxStrokeColor() {
        return this.mFocusedStrokeColor;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
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

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mHintEnabled) {
            if (this.mBoxBackground != null) {
                updateTextInputBoxBounds();
            }
            updateModePadding();
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int width = getWidth() - getCompoundPaddingRight();
            int iCalculateCollapsedTextTopBounds = calculateCollapsedTextTopBounds();
            this.mColorCollapseTextHelper.setExpandedBounds(compoundPaddingLeft, getCompoundPaddingTop(), width, getHeight() - getCompoundPaddingBottom());
            this.mColorCollapseTextHelper.setCollapsedBounds(compoundPaddingLeft, iCalculateCollapsedTextTopBounds, width, getHeight() - getCompoundPaddingBottom());
            this.mColorCollapseTextHelper.recalculate();
            if (!cutoutEnabled() || this.mHintExpanded) {
                return;
            }
            openCutout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.mBoxBackgroundMode) {
            return;
        }
        this.mBoxBackgroundMode = i;
        onApplyBoxBackgroundMode();
    }

    public void setCollapsedTextAppearance(int i, ColorStateList colorStateList) {
        this.mColorCollapseTextHelper.setCollapsedTextAppearance(i, colorStateList);
        this.mFocusedTextColor = this.mColorCollapseTextHelper.getCollapsedTextColor();
        updateLabelState(false);
    }

    public void setDefaultStrokeColor(int i) {
        if (this.mDefaultStrokeColor != i) {
            this.mDefaultStrokeColor = i;
            this.mNormalPaint.setColor(i);
            updateTextInputBoxState();
        }
    }

    public void setFocusedStrokeColor(int i) {
        if (this.mFocusedStrokeColor != i) {
            this.mFocusedStrokeColor = i;
            this.mFocusedPaint.setColor(i);
            updateTextInputBoxState();
        }
    }

    public void setHintColor(ColorStateList colorStateList) {
        this.mDefaultHintTextColor = colorStateList;
        this.mColorCollapseTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setHintEnabled(boolean z) {
        if (z != this.mHintEnabled) {
            this.mHintEnabled = z;
            if (!z) {
                this.mIsProvidingHint = false;
                if (!TextUtils.isEmpty(this.mHint) && TextUtils.isEmpty(getHint())) {
                    setHint(this.mHint);
                }
                setHintInternal(null);
                return;
            }
            CharSequence hint = getHint();
            if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.mHint)) {
                    setTopHint(hint);
                }
                setHint((CharSequence) null);
            }
            this.mIsProvidingHint = true;
        }
    }

    public void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mHint)) {
            return;
        }
        this.mHint = charSequence;
        this.mColorCollapseTextHelper.setText(charSequence);
        if (this.mHintExpanded) {
            return;
        }
        openCutout();
    }

    public void setRequestPaddingTop(int i) {
        this.requestPaddingTop = i;
    }

    public void setTopHint(CharSequence charSequence) {
        if (this.mHintEnabled) {
            setHintInternal(charSequence);
        }
    }

    public void setmHintAnimationEnabled(boolean z) {
        this.mHintAnimationEnabled = z;
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public NearAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.NearAutoCompleteTextViewStyle);
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        boolean zIsEnabled = isEnabled();
        boolean z3 = !TextUtils.isEmpty(getText());
        ColorStateList colorStateList2 = this.mDefaultHintTextColor;
        if (colorStateList2 != null) {
            this.mColorCollapseTextHelper.setCollapsedTextColor(colorStateList2);
            this.mColorCollapseTextHelper.setExpandedTextColor(this.mDefaultHintTextColor);
        }
        if (!zIsEnabled) {
            this.mColorCollapseTextHelper.setCollapsedTextColor(ColorStateList.valueOf(this.mDisabledColor));
            this.mColorCollapseTextHelper.setExpandedTextColor(ColorStateList.valueOf(this.mDisabledColor));
        } else if (hasFocus() && (colorStateList = this.mFocusedTextColor) != null) {
            this.mColorCollapseTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z3 || (isEnabled() && hasFocus())) {
            if (z2 || this.mHintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.mHintExpanded) {
            expandHint(z);
        }
    }

    public NearAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mColorCollapseTextHelper = new NearCutoutDrawable.NearCollapseTextHelper(this);
        this.mStrokeWidth = 3;
        this.mTmpRectF = new RectF();
        this.enableTopHint = false;
        this.requestPaddingTop = -1;
        this.listener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.NearAutoCompleteTextView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NearAutoCompleteTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(NearAutoCompleteTextView.this.listener);
                NearAutoCompleteTextView nearAutoCompleteTextView = NearAutoCompleteTextView.this;
                nearAutoCompleteTextView.viewWidth = nearAutoCompleteTextView.getWidth();
                if (NearAutoCompleteTextView.this.hasFocus()) {
                    NearAutoCompleteTextView.this.animateToShowBackground();
                }
            }
        };
        this.watcher = new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.NearAutoCompleteTextView.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (NearAutoCompleteTextView.this.enableTopHint) {
                    return;
                }
                if (charSequence == null || charSequence.length() <= 0) {
                    NearAutoCompleteTextView.this.mColorCollapseTextHelper.setText(NearAutoCompleteTextView.this.mHint);
                } else {
                    NearAutoCompleteTextView.this.mColorCollapseTextHelper.setText("");
                }
            }
        };
        initHintMode(context, attributeSet, i);
    }
}
