package com.heytap.nearx.uikit.widget.edittext;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.heytap.nearx.uikit.R$dimen;
import com.oplus.aiunit.vision.yhc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearErrorEditTextHelper {
    private static final int DELAY_MASK_ANIMATOR = 80;
    private static final int DURATION_HINT_ANIMATOR = 217;
    private static final int DURATION_MASK_ANIMATOR = 133;
    private static final int MAX_COLOR_VALUE = 255;
    private static final float SELECTION_MASK_ALPHA_MAX = 0.3f;
    private static final Rect tmpRect = new Rect();
    private boolean mAnimating;
    private NearCutoutDrawable mBoxBackground;
    private ColorStateList mCollapsedTextColor;
    private final EditText mEditText;
    private int mErrorColor;
    private Paint mErrorPaint;
    private boolean mErrorState;
    private AnimatorSet mErrorTrueAnimatorSet;
    private ColorStateList mExpandedTextColor;
    private float mHintColorChangeProgress;
    private boolean mIsFocusedAtAnimateBeginning;
    private final NearCutoutDrawable.NearCollapseTextHelper mNearCollapseTextHelper;
    private ArrayList<NearEditText.OnErrorStateChangedListener> mOnErrorStateChangedListeners;
    private int mOriginalHighlightColor;
    private ColorStateList mOriginalTextColors;
    private float mSelectionMaskAlpha;
    private Paint mSelectionMaskPaint;
    private float mSingleNearEditTextHeight;
    private int mStrokeWidth;
    private float mTextShakeOffset;
    private float mTextWidth;

    public static class ShakeInterpolator implements Interpolator {
        private static final int[] DURATIONS;
        private static final float[] OFFSETS = {0.0f, -1.0f, 0.5f, -0.5f, 0.0f};
        static final int TOTAL_DURATION = 450;
        private static final float[] progresses;
        private final Interpolator mBetweenInterpolator;

        static {
            int[] iArr = {83, 133, 117, 117};
            DURATIONS = iArr;
            progresses = new float[iArr.length + 1];
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = DURATIONS;
                if (i >= iArr2.length) {
                    return;
                }
                i2 += iArr2[i];
                i++;
                progresses[i] = i2 / 450.0f;
            }
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = 1;
            while (true) {
                float[] fArr = progresses;
                if (i >= fArr.length) {
                    return 0.0f;
                }
                float f2 = fArr[i];
                if (f <= f2) {
                    int i2 = i - 1;
                    float f3 = fArr[i2];
                    float interpolation = this.mBetweenInterpolator.getInterpolation((f - f3) / (f2 - f3));
                    float[] fArr2 = OFFSETS;
                    return (fArr2[i2] * (1.0f - interpolation)) + (fArr2[i] * interpolation);
                }
                i++;
            }
        }

        private ShakeInterpolator() {
            this.mBetweenInterpolator = new yhc();
        }
    }

    public NearErrorEditTextHelper(@NonNull EditText editText) {
        this.mEditText = editText;
        NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper = new NearCutoutDrawable.NearCollapseTextHelper(editText);
        this.mNearCollapseTextHelper = nearCollapseTextHelper;
        nearCollapseTextHelper.setTextSizeInterpolator(new LinearInterpolator());
        nearCollapseTextHelper.setPositionInterpolator(new LinearInterpolator());
        nearCollapseTextHelper.setCollapsedTextGravity(8388659);
    }

    private void cancelAnimation() {
        if (this.mErrorTrueAnimatorSet.isStarted()) {
            this.mErrorTrueAnimatorSet.cancel();
        }
    }

    private Layout.Alignment getAlignment() {
        switch (this.mEditText.getTextAlignment()) {
            case 1:
                int gravity = this.mEditText.getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
                if (gravity == 1) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (gravity == 3) {
                    return isRtlMode() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                }
                if (gravity == 5) {
                    return isRtlMode() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
                if (gravity != 8388611 && gravity == 8388613) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
                return Layout.Alignment.ALIGN_NORMAL;
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 4:
                return Layout.Alignment.ALIGN_CENTER;
            case 5:
                return Layout.Alignment.ALIGN_NORMAL;
            case 6:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    private CharSequence getFullText() {
        return !isPassword() ? this.mEditText.getText() : getMaskChars();
    }

    private int getGradientColor(int i, int i2, float f) {
        if (f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = 1.0f - f;
        int iAlpha = (int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f));
        int iRed = (int) ((Color.red(i) * f2) + (Color.red(i2) * f));
        int iGreen = (int) ((Color.green(i) * f2) + (Color.green(i2) * f));
        int iBlue = (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f));
        if (iAlpha > 255) {
            iAlpha = 255;
        }
        if (iRed > 255) {
            iRed = 255;
        }
        if (iGreen > 255) {
            iGreen = 255;
        }
        if (iBlue > 255) {
            iBlue = 255;
        }
        return Color.argb(iAlpha, iRed, iGreen, iBlue);
    }

    private CharSequence getMaskChars() {
        TransformationMethod transformationMethod = this.mEditText.getTransformationMethod();
        return transformationMethod != null ? transformationMethod.getTransformation(this.mEditText.getText(), this.mEditText) : this.mEditText.getText();
    }

    private int getSelectionMaskColor(float f) {
        return Color.argb((int) (f * 255.0f), Color.red(this.mErrorColor), Color.green(this.mErrorColor), Color.blue(this.mErrorColor));
    }

    private void initAnimator() {
        float dimension = this.mEditText.getResources().getDimension(R$dimen.nx_edit_text_shake_amplitude);
        yhc yhcVar = new yhc();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(yhcVar);
        valueAnimatorOfFloat.setDuration(217L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearErrorEditTextHelper.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearErrorEditTextHelper.this.mHintColorChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, dimension);
        valueAnimatorOfFloat2.setInterpolator(new ShakeInterpolator());
        valueAnimatorOfFloat2.setDuration(450L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearErrorEditTextHelper.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (NearErrorEditTextHelper.this.mIsFocusedAtAnimateBeginning) {
                    NearErrorEditTextHelper.this.mTextShakeOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                }
                NearErrorEditTextHelper.this.mEditText.invalidate();
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 0.3f);
        valueAnimatorOfFloat3.setInterpolator(yhcVar);
        valueAnimatorOfFloat3.setDuration(133L);
        valueAnimatorOfFloat3.setStartDelay(80L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearErrorEditTextHelper.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (NearErrorEditTextHelper.this.mIsFocusedAtAnimateBeginning) {
                    NearErrorEditTextHelper.this.mSelectionMaskAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.mErrorTrueAnimatorSet = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        this.mErrorTrueAnimatorSet.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearErrorEditTextHelper.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearErrorEditTextHelper.this.setErrorStateEnd(true, true, true);
                NearErrorEditTextHelper.this.performOnErrorStateChangeAnimationEnd(true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                NearErrorEditTextHelper.this.mEditText.setSelection(NearErrorEditTextHelper.this.mEditText.length());
                if (NearErrorEditTextHelper.this.mSingleNearEditTextHeight <= 0.0f) {
                    NearErrorEditTextHelper.this.mEditText.post(new Runnable() { // from class: com.heytap.nearx.uikit.widget.edittext.NearErrorEditTextHelper.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            NearErrorEditTextHelper nearErrorEditTextHelper = NearErrorEditTextHelper.this;
                            nearErrorEditTextHelper.mSingleNearEditTextHeight = nearErrorEditTextHelper.mEditText.getHeight();
                        }
                    });
                }
            }
        });
    }

    private boolean isPassword() {
        return (this.mEditText.getInputType() & 128) == 128 || (this.mEditText.getInputType() & 16) == 16;
    }

    private boolean isRtlMode() {
        return this.mEditText.getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performOnErrorStateChangeAnimationEnd(boolean z) {
        if (this.mOnErrorStateChangedListeners != null) {
            for (int i = 0; i < this.mOnErrorStateChangedListeners.size(); i++) {
                this.mOnErrorStateChangedListeners.get(i).onErrorStateChangeAnimationEnd(z);
            }
        }
    }

    private void performOnErrorStateChanged(boolean z) {
        if (this.mOnErrorStateChangedListeners != null) {
            for (int i = 0; i < this.mOnErrorStateChangedListeners.size(); i++) {
                this.mOnErrorStateChangedListeners.get(i).onErrorStateChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorStateEnd(boolean z, boolean z2, boolean z3) {
        this.mAnimating = false;
        if (!z) {
            this.mEditText.setTextColor(this.mOriginalTextColors);
            this.mEditText.setHighlightColor(this.mOriginalHighlightColor);
            return;
        }
        if (z2) {
            this.mEditText.setTextColor(this.mOriginalTextColors);
        }
        this.mEditText.setHighlightColor(getSelectionMaskColor(0.3f));
        if (z3) {
            EditText editText = this.mEditText;
            editText.setSelection(0, editText.getText().length());
        }
    }

    private void setErrorStateWithAnimation(boolean z, boolean z2) {
        if (!z) {
            cancelAnimation();
            setErrorStateEnd(false, false, z2);
            return;
        }
        cancelAnimation();
        this.mEditText.setTextColor(0);
        this.mEditText.setHighlightColor(0);
        this.mHintColorChangeProgress = 0.0f;
        this.mTextShakeOffset = 0.0f;
        this.mSelectionMaskAlpha = 0.0f;
        this.mAnimating = true;
        this.mIsFocusedAtAnimateBeginning = this.mEditText.isFocused();
        this.mErrorTrueAnimatorSet.start();
    }

    private void setErrorStateWithoutAnimation(boolean z, boolean z2) {
        if (!z) {
            setErrorStateEnd(false, false, z2);
            return;
        }
        this.mHintColorChangeProgress = 1.0f;
        this.mTextShakeOffset = 0.0f;
        this.mSelectionMaskAlpha = 0.0f;
        setErrorStateEnd(true, false, z2);
    }

    public void addOnErrorStateChangedListener(NearEditText.OnErrorStateChangedListener onErrorStateChangedListener) {
        if (this.mOnErrorStateChangedListeners == null) {
            this.mOnErrorStateChangedListeners = new ArrayList<>();
        }
        if (this.mOnErrorStateChangedListeners.contains(onErrorStateChangedListener)) {
            return;
        }
        this.mOnErrorStateChangedListeners.add(onErrorStateChangedListener);
    }

    public void drawCollapseText(Canvas canvas, NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper) {
        this.mNearCollapseTextHelper.setCollapsedTextColor(ColorStateList.valueOf(getGradientColor(this.mCollapsedTextColor.getDefaultColor(), this.mErrorColor, this.mHintColorChangeProgress)));
        this.mNearCollapseTextHelper.setExpandedTextColor(ColorStateList.valueOf(getGradientColor(this.mExpandedTextColor.getDefaultColor(), this.mErrorColor, this.mHintColorChangeProgress)));
        this.mNearCollapseTextHelper.setExpansionFraction(nearCollapseTextHelper.getExpandedFraction());
        this.mNearCollapseTextHelper.draw(canvas);
    }

    public void drawModeBackgroundLine(Canvas canvas, int i, int i2, int i3, Paint paint, Paint paint2) {
        this.mErrorPaint.setColor(getGradientColor(paint.getColor(), this.mErrorColor, this.mHintColorChangeProgress));
        float f = i;
        canvas.drawLine(0.0f, f, i2, f, this.mErrorPaint);
        this.mErrorPaint.setColor(getGradientColor(paint2.getColor(), this.mErrorColor, this.mHintColorChangeProgress));
        canvas.drawLine(0.0f, f, i3, f, this.mErrorPaint);
    }

    public void drawModeBackgroundRect(Canvas canvas, GradientDrawable gradientDrawable, int i) {
        this.mBoxBackground.setBounds(gradientDrawable.getBounds());
        if (gradientDrawable instanceof NearCutoutDrawable) {
            this.mBoxBackground.setCutout(((NearCutoutDrawable) gradientDrawable).getCutout());
        }
        this.mBoxBackground.setStroke(this.mStrokeWidth, getGradientColor(i, this.mErrorColor, this.mHintColorChangeProgress));
        this.mBoxBackground.draw(canvas);
    }

    public void drawableStateChanged(int[] iArr) {
        this.mNearCollapseTextHelper.setState(iArr);
    }

    public void init(int i, int i2, int i3, float[] fArr, NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper) {
        this.mOriginalTextColors = this.mEditText.getTextColors();
        this.mOriginalHighlightColor = this.mEditText.getHighlightColor();
        this.mErrorColor = i;
        this.mStrokeWidth = i2;
        if (i3 == 2) {
            this.mNearCollapseTextHelper.setTypefaces(Typeface.create("sans-serif-medium", 0));
        }
        this.mNearCollapseTextHelper.setExpandedTextSize(nearCollapseTextHelper.getExpandedTextSize());
        this.mNearCollapseTextHelper.setCollapsedTextGravity(nearCollapseTextHelper.getCollapsedTextGravity());
        this.mNearCollapseTextHelper.setExpandedTextGravity(nearCollapseTextHelper.getExpandedTextGravity());
        NearCutoutDrawable nearCutoutDrawable = new NearCutoutDrawable();
        this.mBoxBackground = nearCutoutDrawable;
        nearCutoutDrawable.setCornerRadii(fArr);
        Paint paint = new Paint();
        this.mErrorPaint = paint;
        paint.setStrokeWidth(this.mStrokeWidth);
        this.mSelectionMaskPaint = new Paint();
        initAnimator();
        this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.edittext.NearErrorEditTextHelper.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                NearErrorEditTextHelper.this.setErrorState(false, false, false);
                Editable text = NearErrorEditTextHelper.this.mEditText.getText();
                int length = text.length();
                NearErrorEditTextHelper nearErrorEditTextHelper = NearErrorEditTextHelper.this;
                nearErrorEditTextHelper.mTextWidth = nearErrorEditTextHelper.mEditText.getPaint().measureText(text, 0, length);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                if (NearErrorEditTextHelper.this.mSingleNearEditTextHeight <= 0.0f) {
                    NearErrorEditTextHelper nearErrorEditTextHelper = NearErrorEditTextHelper.this;
                    nearErrorEditTextHelper.mSingleNearEditTextHeight = nearErrorEditTextHelper.mEditText.getHeight();
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        setHintInternal(nearCollapseTextHelper);
        updateLabelState(nearCollapseTextHelper);
    }

    public boolean isErrorState() {
        return this.mErrorState;
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.mAnimating && this.mErrorState) {
            int iSave = canvas.save();
            if (isRtlMode()) {
                canvas.translate(-this.mTextShakeOffset, 0.0f);
            } else {
                canvas.translate(this.mTextShakeOffset, 0.0f);
            }
            int compoundPaddingStart = this.mEditText.getCompoundPaddingStart();
            int compoundPaddingEnd = this.mEditText.getCompoundPaddingEnd();
            int width = this.mEditText.getWidth();
            int i = width - compoundPaddingEnd;
            int i2 = i - compoundPaddingStart;
            float x = i + this.mEditText.getX() + this.mEditText.getScrollX();
            float f3 = i2;
            float scrollX = (this.mTextWidth - this.mEditText.getScrollX()) - f3;
            EditText editText = this.mEditText;
            Rect rect = tmpRect;
            editText.getLineBounds(0, rect);
            int iSave2 = canvas.save();
            if (isRtlMode()) {
                canvas.translate(compoundPaddingEnd, rect.top);
            } else {
                canvas.translate(compoundPaddingStart, rect.top);
            }
            int iSave3 = canvas.save();
            if (this.mEditText.getBottom() - this.mEditText.getTop() == this.mSingleNearEditTextHeight && this.mTextWidth > f3) {
                if (isRtlMode()) {
                    canvas.clipRect(this.mEditText.getScrollX() + i2, 0.0f, this.mEditText.getScrollX(), this.mSingleNearEditTextHeight);
                } else {
                    canvas.translate(-scrollX, 0.0f);
                    canvas.clipRect(this.mEditText.getScrollX(), 0.0f, x, this.mSingleNearEditTextHeight);
                }
            }
            Layout layout = this.mEditText.getLayout();
            layout.getPaint().setColor(this.mOriginalTextColors.getDefaultColor());
            layout.draw(canvas);
            canvas.restoreToCount(iSave3);
            canvas.restoreToCount(iSave2);
            Layout.Alignment alignment = getAlignment();
            this.mSelectionMaskPaint.setColor(getSelectionMaskColor(this.mSelectionMaskAlpha));
            if ((alignment != Layout.Alignment.ALIGN_NORMAL || isRtlMode()) && (!(alignment == Layout.Alignment.ALIGN_OPPOSITE && isRtlMode()) && (!(alignment == Layout.Alignment.ALIGN_NORMAL && isRtlMode()) && (alignment != Layout.Alignment.ALIGN_OPPOSITE || isRtlMode())))) {
                float f4 = ((compoundPaddingStart + width) - compoundPaddingEnd) / 2.0f;
                float f5 = this.mTextWidth;
                float f6 = f4 - (f5 / 2.0f);
                f = f6;
                f2 = f6 + f5;
            } else {
                f = compoundPaddingStart;
                f2 = f;
            }
            canvas.drawRect(f, rect.top, f2, rect.bottom, this.mSelectionMaskPaint);
            canvas.restoreToCount(iSave);
        }
    }

    public void onLayout(NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper) {
        Rect expandedBounds = nearCollapseTextHelper.getExpandedBounds();
        Rect collapsedBounds = nearCollapseTextHelper.getCollapsedBounds();
        this.mNearCollapseTextHelper.setExpandedBounds(expandedBounds.left, expandedBounds.top, expandedBounds.right, expandedBounds.bottom);
        this.mNearCollapseTextHelper.setCollapsedBounds(collapsedBounds.left, collapsedBounds.top, collapsedBounds.right, collapsedBounds.bottom);
        this.mNearCollapseTextHelper.recalculate();
    }

    public void removeOnErrorStateChangedListener(@Nullable NearEditText.OnErrorStateChangedListener onErrorStateChangedListener) {
        ArrayList<NearEditText.OnErrorStateChangedListener> arrayList = this.mOnErrorStateChangedListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(onErrorStateChangedListener);
    }

    public void setCollapsedTextAppearance(int i, ColorStateList colorStateList) {
        this.mNearCollapseTextHelper.setCollapsedTextAppearance(i, colorStateList);
    }

    public void setErrorColor(int i) {
        this.mErrorColor = i;
    }

    public void setErrorState(boolean z) {
        setErrorState(z, true);
    }

    public void setHintInternal(NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper) {
        this.mNearCollapseTextHelper.setText(nearCollapseTextHelper.getText());
    }

    public void updateLabelState(NearCutoutDrawable.NearCollapseTextHelper nearCollapseTextHelper) {
        this.mCollapsedTextColor = nearCollapseTextHelper.getCollapsedTextColor();
        this.mExpandedTextColor = nearCollapseTextHelper.getExpandedTextColor();
        this.mNearCollapseTextHelper.setCollapsedTextColor(this.mCollapsedTextColor);
        this.mNearCollapseTextHelper.setExpandedTextColor(this.mExpandedTextColor);
    }

    private void setErrorState(boolean z, boolean z2) {
        setErrorState(z, z2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorState(boolean z, boolean z2, boolean z3) {
        if (this.mErrorState == z) {
            return;
        }
        this.mErrorState = z;
        performOnErrorStateChanged(z);
        if (z2) {
            setErrorStateWithAnimation(z, z3);
        } else {
            setErrorStateWithoutAnimation(z, z3);
        }
    }
}
