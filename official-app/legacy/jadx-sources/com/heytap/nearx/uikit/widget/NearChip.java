package com.heytap.nearx.uikit.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.chip.Chip;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.vhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearChip extends Chip {
    private static final int BACKGROUND_COLOR_STATE_SIZE = 2;
    private static final int COLOR_ANIMATION_DURATION = 200;
    private static final float DEFAULT_SCALE_MIN_PERCENT = 0.8f;
    private static final float DEFAULT_SCALE_MIN_VALUE = 0.9f;
    private static final int PRESS_FEEDBACK_ANIMATION_DURATION = 200;
    private static final int RELEASE_FEEDBACK_ANIMATION_DURATION = 340;
    private static final int STATE_CHECKED = 1;
    private static final int STATE_DISABLED = 2;
    private static final int STATE_UNCHECKED = 0;
    private static final int TEXT_COLOR_STATE_SIZE = 3;
    private boolean mAnimEnable;
    private ValueAnimator mBackgroundColorAnimator;
    private int[][] mBackgroundColorStates;
    private int[] mBackgroundColors;
    private int mBgColorAnimCurVal;
    private int mBgColorAnimEndVal;
    private int mCheckedBackgroundColor;
    private int mCheckedTextColor;
    private Interpolator mColorAnimationInterpolator;
    private Context mContext;
    private float mCurrentScale;
    private int mDisabledTextColor;
    private boolean mIsNeedToDelayCancelScaleAnim;
    private int[] mLocation;
    private Interpolator mScaleAnimationInterpolator;
    private ValueAnimator mScaleAnimator;
    private int mStyle;
    private ValueAnimator mTextColorAnimator;
    private int[][] mTextColorStates;
    private int[] mTextColors;
    private int mTxColorAnimCurVal;
    private int mTxColorAnimEndVal;
    private int mUncheckedBackgroundColor;
    private int mUncheckedTextColor;
    private static final int[] CHIP_STATE_CHECKED = {R.attr.state_checked, 16842910};
    private static final int[] CHIP_STATE_UNCHECKED = {-16842912, 16842910};
    private static final int[] CHIP_STATE_DISABLED = {-16842910};

    public NearChip(Context context) {
        this(context, null);
    }

    private void cancelAnimator(boolean z) {
        ValueAnimator valueAnimator = this.mScaleAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            boolean z2 = !z && ((float) this.mScaleAnimator.getCurrentPlayTime()) < ((float) this.mScaleAnimator.getDuration()) * 0.8f;
            this.mIsNeedToDelayCancelScaleAnim = z2;
            if (!z2) {
                this.mScaleAnimator.cancel();
            }
        }
        ValueAnimator valueAnimator2 = this.mBackgroundColorAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && z) {
            this.mBackgroundColorAnimator.cancel();
        }
        ValueAnimator valueAnimator3 = this.mTextColorAnimator;
        if (valueAnimator3 != null && valueAnimator3.isRunning() && z) {
            this.mTextColorAnimator.cancel();
        }
    }

    private void executeBackgroundColorAnimator(final boolean z) {
        ValueAnimator valueAnimator = this.mBackgroundColorAnimator;
        if (valueAnimator == null) {
            this.mBackgroundColorAnimator = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.mBgColorAnimCurVal), Integer.valueOf(this.mBgColorAnimEndVal));
        } else {
            valueAnimator.setIntValues(this.mBgColorAnimCurVal, this.mBgColorAnimEndVal);
        }
        this.mBackgroundColorAnimator.setInterpolator(this.mColorAnimationInterpolator);
        this.mBackgroundColorAnimator.setDuration(200L);
        this.mBackgroundColorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearChip.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NearChip.this.mBgColorAnimCurVal = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                NearChip.this.mBackgroundColors[!z ? 1 : 0] = NearChip.this.mBgColorAnimCurVal;
                NearChip.this.setChipBackgroundColor(new ColorStateList(NearChip.this.mBackgroundColorStates, NearChip.this.mBackgroundColors));
            }
        });
        this.mBackgroundColorAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearChip.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (NearChip.this.mBgColorAnimCurVal == NearChip.this.mUncheckedBackgroundColor || NearChip.this.mBgColorAnimCurVal == NearChip.this.mCheckedBackgroundColor) {
                    NearChip.this.resetBackgroundColor();
                }
            }
        });
        this.mBackgroundColorAnimator.start();
    }

    private void executeColorAnimation(MotionEvent motionEvent, boolean z) {
        int i;
        getLocationOnScreen(this.mLocation);
        boolean z2 = motionEvent.getRawX() > ((float) this.mLocation[0]) && motionEvent.getRawX() < ((float) (this.mLocation[0] + getWidth())) && motionEvent.getRawY() > ((float) this.mLocation[1]) && motionEvent.getRawY() < ((float) (this.mLocation[1] + getHeight()));
        int i2 = this.mBgColorAnimCurVal;
        int i3 = this.mCheckedBackgroundColor;
        boolean z3 = i2 == i3 || i2 == this.mUncheckedBackgroundColor || (i = this.mTxColorAnimCurVal) == this.mCheckedTextColor || i == this.mUncheckedTextColor;
        if (!z2) {
            if (z3) {
                return;
            }
            if (z) {
                this.mBgColorAnimEndVal = i3;
                this.mTxColorAnimEndVal = this.mCheckedTextColor;
            } else {
                this.mBgColorAnimEndVal = this.mUncheckedBackgroundColor;
                this.mTxColorAnimEndVal = this.mUncheckedTextColor;
            }
            executeBackgroundColorAnimator(!z);
            executeTextColorAnimator(!z);
            return;
        }
        if (z3) {
            if (z) {
                this.mBgColorAnimCurVal = i3;
                this.mBgColorAnimEndVal = this.mUncheckedBackgroundColor;
                this.mTxColorAnimCurVal = this.mCheckedTextColor;
                this.mTxColorAnimEndVal = this.mUncheckedTextColor;
            } else {
                this.mBgColorAnimCurVal = this.mUncheckedBackgroundColor;
                this.mBgColorAnimEndVal = i3;
                this.mTxColorAnimCurVal = this.mUncheckedTextColor;
                this.mTxColorAnimEndVal = this.mCheckedTextColor;
            }
        } else if (z) {
            this.mBgColorAnimEndVal = this.mUncheckedBackgroundColor;
            this.mTxColorAnimEndVal = this.mUncheckedTextColor;
        } else {
            this.mBgColorAnimEndVal = i3;
            this.mTxColorAnimEndVal = this.mCheckedTextColor;
        }
        executeBackgroundColorAnimator(z);
        executeTextColorAnimator(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeScaleAnimator(final boolean z) {
        this.mIsNeedToDelayCancelScaleAnim = false;
        cancelAnimator(z);
        if (this.mIsNeedToDelayCancelScaleAnim) {
            return;
        }
        ValueAnimator valueAnimator = this.mScaleAnimator;
        if (valueAnimator == null) {
            float[] fArr = new float[2];
            fArr[0] = z ? 1.0f : this.mCurrentScale;
            fArr[1] = z ? 0.9f : 1.0f;
            this.mScaleAnimator = ValueAnimator.ofFloat(fArr);
        } else {
            float[] fArr2 = new float[2];
            fArr2[0] = z ? 1.0f : this.mCurrentScale;
            fArr2[1] = z ? 0.9f : 1.0f;
            valueAnimator.setFloatValues(fArr2);
        }
        this.mScaleAnimator.setInterpolator(this.mScaleAnimationInterpolator);
        this.mScaleAnimator.setDuration(z ? 200L : 340L);
        this.mScaleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearChip.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NearChip.this.mCurrentScale = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (NearChip.this.mIsNeedToDelayCancelScaleAnim && z && valueAnimator2.getCurrentPlayTime() > valueAnimator2.getDuration() * 0.8f) {
                    valueAnimator2.cancel();
                    NearChip.this.executeScaleAnimator(false);
                } else {
                    NearChip nearChip = NearChip.this;
                    nearChip.setScale(nearChip.mCurrentScale);
                }
            }
        });
        this.mScaleAnimator.start();
    }

    private void executeTextColorAnimator(final boolean z) {
        ValueAnimator valueAnimator = this.mTextColorAnimator;
        if (valueAnimator == null) {
            this.mTextColorAnimator = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.mTxColorAnimCurVal), Integer.valueOf(this.mTxColorAnimEndVal));
        } else {
            valueAnimator.setIntValues(this.mTxColorAnimCurVal, this.mTxColorAnimEndVal);
        }
        this.mTextColorAnimator.setInterpolator(this.mColorAnimationInterpolator);
        this.mTextColorAnimator.setDuration(200L);
        this.mTextColorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.NearChip.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NearChip.this.mTxColorAnimCurVal = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                NearChip.this.mTextColors[!z ? 1 : 0] = NearChip.this.mTxColorAnimCurVal;
                NearChip.this.setTextColor(new ColorStateList(NearChip.this.mTextColorStates, NearChip.this.mTextColors));
            }
        });
        this.mTextColorAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearChip.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (NearChip.this.mTxColorAnimCurVal == NearChip.this.mUncheckedTextColor || NearChip.this.mTxColorAnimCurVal == NearChip.this.mCheckedTextColor) {
                    NearChip.this.resetTextColor();
                }
            }
        });
        this.mTextColorAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetBackgroundColor() {
        if (this.mBackgroundColorStates == null) {
            this.mBackgroundColorStates = new int[2][];
        }
        if (this.mBackgroundColors == null) {
            this.mBackgroundColors = new int[this.mBackgroundColorStates.length];
        }
        int[][] iArr = this.mBackgroundColorStates;
        iArr[0] = CHIP_STATE_UNCHECKED;
        iArr[1] = CHIP_STATE_CHECKED;
        int[] iArr2 = this.mBackgroundColors;
        iArr2[0] = this.mUncheckedBackgroundColor;
        iArr2[1] = this.mCheckedBackgroundColor;
        setChipBackgroundColor(new ColorStateList(this.mBackgroundColorStates, this.mBackgroundColors));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTextColor() {
        if (this.mTextColorStates == null) {
            this.mTextColorStates = new int[3][];
        }
        if (this.mTextColors == null) {
            this.mTextColors = new int[this.mTextColorStates.length];
        }
        int[][] iArr = this.mTextColorStates;
        iArr[0] = CHIP_STATE_UNCHECKED;
        iArr[1] = CHIP_STATE_CHECKED;
        iArr[2] = CHIP_STATE_DISABLED;
        int[] iArr2 = this.mTextColors;
        iArr2[0] = this.mUncheckedTextColor;
        iArr2[1] = this.mCheckedTextColor;
        iArr2[2] = this.mDisabledTextColor;
        setTextColor(new ColorStateList(this.mTextColorStates, this.mTextColors));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f) {
        float fMax = Math.max(0.9f, Math.min(1.0f, f));
        setScaleX(fMax);
        setScaleY(fMax);
        invalidate();
    }

    @Override // com.google.android.material.chip.Chip, android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean zIsChecked = isChecked();
        if (isEnabled() && this.mAnimEnable) {
            int action = motionEvent.getAction();
            if (action == 0) {
                executeScaleAnimator(true);
            } else if (action == 1 || action == 3) {
                if (isCheckable()) {
                    executeColorAnimation(motionEvent, zIsChecked);
                }
                executeScaleAnimator(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckedBackgroundColor(int i) {
        if (i != this.mCheckedBackgroundColor) {
            this.mCheckedBackgroundColor = i;
            resetBackgroundColor();
        }
    }

    public void setCheckedTextColor(int i) {
        if (i != this.mCheckedTextColor) {
            this.mCheckedTextColor = i;
            resetTextColor();
        }
    }

    public void setDisabledTextColor(int i) {
        if (i != this.mDisabledTextColor) {
            this.mDisabledTextColor = i;
            resetTextColor();
        }
    }

    public void setUncheckedBackgroundColor(int i) {
        if (i != this.mUncheckedBackgroundColor) {
            this.mUncheckedBackgroundColor = i;
            resetBackgroundColor();
        }
    }

    public void setUncheckedTextColor(int i) {
        if (i != this.mUncheckedTextColor) {
            this.mUncheckedTextColor = i;
            resetTextColor();
        }
    }

    public NearChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxChipStyle);
    }

    public NearChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentScale = 1.0f;
        this.mLocation = new int[2];
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.mStyle = attributeSet.getStyleAttribute();
        } else {
            this.mStyle = i;
        }
        this.mContext = context;
        vhc.b(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearChip, i, 0);
        this.mAnimEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearChip_nxChipAnimationEnable, true);
        this.mCheckedBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearChip_nxCheckedBackgroundColor, getResources().getColor(R$color.nx_chip_checked_background_color));
        this.mUncheckedBackgroundColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearChip_nxUncheckedBackgroundColor, getResources().getColor(R$color.nx_chip_unchecked_background_color));
        this.mCheckedTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearChip_nxCheckedTextColor, getResources().getColor(R$color.nx_chip_checked_text_color));
        this.mUncheckedTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearChip_nxUncheckedTextColor, getResources().getColor(R$color.nx_chip_unchecked_text_color_choice));
        this.mDisabledTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearChip_nxDisabledTextColor, getResources().getColor(R$color.nx_chip_disabled_text_color));
        typedArrayObtainStyledAttributes.recycle();
        if (this.mAnimEnable) {
            this.mScaleAnimationInterpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
            if (isCheckable()) {
                resetBackgroundColor();
                resetTextColor();
                this.mBgColorAnimCurVal = isChecked() ? this.mCheckedBackgroundColor : this.mUncheckedBackgroundColor;
                this.mTxColorAnimCurVal = isChecked() ? this.mCheckedTextColor : this.mUncheckedTextColor;
                this.mColorAnimationInterpolator = PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f);
            }
        }
    }
}
