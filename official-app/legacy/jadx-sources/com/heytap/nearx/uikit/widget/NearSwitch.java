package com.heytap.nearx.uikit.widget;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Switch;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$bool;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$raw;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.alc;
import com.oplus.aiunit.vision.vhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearSwitch extends SwitchCompat {
    private boolean isDrawInner;
    private int mBarCheckedColor;
    private int mBarCheckedDisabledColor;
    private int mBarHeight;
    private int mBarUnCheckedColor;
    private int mBarUncheckedDisabledColor;
    private Drawable mCheckedDrawable;
    private int mCirclePadding;
    private float mCircleScale;
    private float mCircleScaleX;
    private int mCircleTranslation;
    private Context mContext;
    private int mDefaultTranslation;
    private boolean mEnableHapticFeedback;
    private float mInnerCircleAlpha;
    private int mInnerCircleCheckedDisabledColor;
    private int mInnerCircleColor;
    private Paint mInnerCirclePaint;
    private RectF mInnerCircleRectF;
    private int mInnerCircleUncheckedDisabledColor;
    private int mInnerCircleWidth;
    private boolean mIsAttachedToWindow;
    private boolean mIsLoading;
    private boolean mIsLoadingStyle;
    private boolean mIsMeasured;
    private boolean mIsThemedEnabled;
    private float mLoadingAlpha;
    private Drawable mLoadingDrawable;
    private float mLoadingRotation;
    private float mLoadingScale;
    private AccessibilityManager mManager;
    private OnLoadingStateChangedListener mOnLoadingStateChangedListener;
    private int mOuterCircleCheckedDisabledColor;
    private int mOuterCircleColor;
    private Paint mOuterCirclePaint;
    private RectF mOuterCircleRectF;
    private int mOuterCircleStrokeWidth;
    private int mOuterCircleUnCheckedColor;
    private int mOuterCircleUncheckedDisabledColor;
    private int mOuterCircleWidth;
    private int mPadding;
    private boolean mShouldPlaySound;
    private int mSoundIdOff;
    private int mSoundIdOn;
    private alc mSoundUtil;
    private AnimatorSet mStartLoadingAnimator;
    private AnimatorSet mStopLoadingAnimator;
    private int mStyle;
    private String mSwitchLoadingStr;
    private String mSwitchOffStr;
    private String mSwitchOnStr;
    private AnimatorSet mThemedLoadingAnimator;
    private Drawable mThemedLoadingCheckedBackground;
    private Drawable mThemedLoadingDrawable;
    private Drawable mThemedLoadingUncheckedBackground;
    private AnimatorSet mToggleAnimator;
    private Drawable mUncheckedDrawable;

    public interface OnLoadingStateChangedListener {
        void onStartLoading();

        void onStopLoading();
    }

    public NearSwitch(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    private void animateWhenStateChanged(boolean z) {
        int i;
        if (this.mToggleAnimator == null) {
            this.mToggleAnimator = new AnimatorSet();
        }
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        int i2 = this.mCircleTranslation;
        if (isRtlMode()) {
            if (z) {
                i = 0;
            } else {
                i = this.mDefaultTranslation;
            }
        } else if (z) {
            i = this.mDefaultTranslation;
        } else {
            i = 0;
        }
        this.mToggleAnimator.setInterpolator(interpolatorCreate);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "circleScaleX", 1.0f, 1.3f);
        objectAnimatorOfFloat.setDuration(133L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "circleScaleX", 1.3f, 1.0f);
        objectAnimatorOfFloat2.setStartDelay(133L);
        objectAnimatorOfFloat2.setDuration(250L);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "circleTranslation", i2, i);
        objectAnimatorOfInt.setDuration(383L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "innerCircleAlpha", this.mInnerCircleAlpha, z ? 0.0f : 1.0f);
        objectAnimatorOfFloat3.setDuration(100L);
        this.mToggleAnimator.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfInt).with(objectAnimatorOfFloat3);
        this.mToggleAnimator.start();
    }

    private Drawable backgroundDrawable() {
        if (isLoading()) {
            return isChecked() ? this.mThemedLoadingCheckedBackground : this.mThemedLoadingUncheckedBackground;
        }
        return isChecked() ? this.mCheckedDrawable : this.mUncheckedDrawable;
    }

    private void drawInnerCircle(Canvas canvas) {
        canvas.save();
        float f = this.mCircleScale;
        canvas.scale(f, f, this.mOuterCircleRectF.centerX(), this.mOuterCircleRectF.centerY());
        float f2 = this.mInnerCircleWidth / 2.0f;
        this.mInnerCirclePaint.setColor(this.mInnerCircleColor);
        if (!isEnabled()) {
            this.mInnerCirclePaint.setColor(isChecked() ? this.mInnerCircleCheckedDisabledColor : this.mInnerCircleUncheckedDisabledColor);
        }
        float f3 = this.mInnerCircleAlpha;
        if (f3 == 0.0f) {
            this.mInnerCirclePaint.setAlpha((int) (f3 * 255.0f));
        }
        canvas.drawRoundRect(this.mInnerCircleRectF, f2, f2, this.mInnerCirclePaint);
        canvas.restore();
    }

    private void drawLoading(Canvas canvas) {
        if (this.mIsLoading) {
            canvas.save();
            float f = this.mLoadingScale;
            canvas.scale(f, f, this.mOuterCircleRectF.centerX(), this.mOuterCircleRectF.centerY());
            canvas.rotate(this.mLoadingRotation, this.mOuterCircleRectF.centerX(), this.mOuterCircleRectF.centerY());
            Drawable drawable = this.mLoadingDrawable;
            if (drawable != null) {
                RectF rectF = this.mOuterCircleRectF;
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.mLoadingDrawable.setAlpha((int) (this.mLoadingAlpha * 255.0f));
                this.mLoadingDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    private void drawOuterCircle(Canvas canvas) {
        canvas.save();
        float f = this.mCircleScale;
        canvas.scale(f, f, this.mOuterCircleRectF.centerX(), this.mOuterCircleRectF.centerY());
        this.mOuterCirclePaint.setColor(isChecked() ? this.mOuterCircleColor : this.mOuterCircleUnCheckedColor);
        if (!isEnabled()) {
            this.mOuterCirclePaint.setColor(isChecked() ? this.mOuterCircleCheckedDisabledColor : this.mOuterCircleUncheckedDisabledColor);
        }
        float f2 = this.mOuterCircleWidth / 2.0f;
        canvas.drawRoundRect(this.mOuterCircleRectF, f2, f2, this.mOuterCirclePaint);
        canvas.restore();
    }

    private void drawThemedBackground(Canvas canvas) {
        canvas.save();
        Drawable drawableBackgroundDrawable = backgroundDrawable();
        drawableBackgroundDrawable.setAlpha(drawableAlpha());
        int i = this.mPadding;
        int switchMinWidth = getSwitchMinWidth();
        int i2 = this.mPadding;
        drawableBackgroundDrawable.setBounds(i, i, switchMinWidth + i2, this.mBarHeight + i2);
        backgroundDrawable().draw(canvas);
        canvas.restore();
    }

    private void drawThemedLoading(Canvas canvas) {
        if (this.mIsLoading) {
            int width = (getWidth() - this.mOuterCircleWidth) / 2;
            int width2 = (getWidth() + this.mOuterCircleWidth) / 2;
            int height = (getHeight() - this.mOuterCircleWidth) / 2;
            int height2 = (getHeight() + this.mOuterCircleWidth) / 2;
            int width3 = getWidth() / 2;
            int height3 = getHeight() / 2;
            canvas.save();
            canvas.rotate(this.mLoadingRotation, width3, height3);
            this.mThemedLoadingDrawable.setBounds(width, height, width2, height2);
            this.mThemedLoadingDrawable.draw(canvas);
            canvas.restore();
        }
    }

    private int drawableAlpha() {
        return (int) ((isEnabled() ? 1.0f : 0.5f) * 255.0f);
    }

    private void initAnimator() {
        initStartLoadingAnimator();
        initStopLoadingAnimator();
        initThemedLoadingAnimator();
    }

    private void initPaint() {
        this.mOuterCirclePaint = new Paint(1);
        this.mInnerCirclePaint = new Paint(1);
    }

    private void initResValue(Context context) {
        this.mPadding = context.getResources().getDimensionPixelSize(R$dimen.nx_switch_padding);
        alc alcVarA = alc.a();
        this.mSoundUtil = alcVarA;
        this.mSoundIdOn = alcVarA.c(context, R$raw.color_switch_sound_on);
        this.mSoundIdOff = this.mSoundUtil.c(context, R$raw.color_switch_sound_off);
        this.mSwitchOnStr = getResources().getString(R$string.switch_on);
        this.mSwitchOffStr = getResources().getString(R$string.switch_off);
        this.mSwitchLoadingStr = getResources().getString(R$string.switch_loading);
        this.mDefaultTranslation = (getSwitchMinWidth() - (this.mCirclePadding * 2)) - this.mOuterCircleWidth;
    }

    private void initStartLoadingAnimator() {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.mStartLoadingAnimator = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "circleScale", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat.setDuration(433L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "loadingScale", 0.5f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat2.setDuration(550L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "loadingAlpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat3.setDuration(550L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "loadingRotation", 0.0f, 360.0f);
        objectAnimatorOfFloat4.setRepeatCount(-1);
        objectAnimatorOfFloat4.setDuration(800L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        this.mStartLoadingAnimator.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4);
    }

    private void initStopLoadingAnimator() {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.mStopLoadingAnimator = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "loadingAlpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat.setDuration(100L);
        this.mStopLoadingAnimator.play(objectAnimatorOfFloat);
    }

    private void initThemedLoadingAnimator() {
        this.mThemedLoadingAnimator = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "loadingRotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.mThemedLoadingAnimator.play(objectAnimatorOfFloat);
    }

    private boolean isRtlMode() {
        return getLayoutDirection() == 1;
    }

    private void performFeedBack() {
        if (isTactileFeedbackEnabled()) {
            performHapticFeedback(302);
            setTactileFeedbackEnabled(false);
        }
    }

    private void playSoundEffect(boolean z) {
        this.mSoundUtil.d(getContext(), z ? this.mSoundIdOn : this.mSoundIdOff, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    private void setInnerCircleRectF() {
        RectF rectF = this.mOuterCircleRectF;
        float f = rectF.left;
        int i = this.mOuterCircleStrokeWidth;
        this.mInnerCircleRectF.set(f + i, rectF.top + i, rectF.right - i, rectF.bottom - i);
    }

    private void setOuterCircleRectF() {
        float f;
        float f2;
        float f3;
        float switchMinWidth;
        if (isChecked()) {
            if (isRtlMode()) {
                f = this.mCirclePadding + this.mCircleTranslation + this.mPadding;
                f2 = this.mOuterCircleWidth;
                f3 = this.mCircleScaleX;
                switchMinWidth = (f2 * f3) + f;
            } else {
                switchMinWidth = ((getSwitchMinWidth() - this.mCirclePadding) - (this.mDefaultTranslation - this.mCircleTranslation)) + this.mPadding;
                f = switchMinWidth - (this.mOuterCircleWidth * this.mCircleScaleX);
            }
        } else if (isRtlMode()) {
            int switchMinWidth2 = (getSwitchMinWidth() - this.mCirclePadding) - (this.mDefaultTranslation - this.mCircleTranslation);
            int i = this.mPadding;
            float f4 = switchMinWidth2 + i;
            float f5 = i + (f4 - (this.mOuterCircleWidth * this.mCircleScaleX));
            switchMinWidth = f4;
            f = f5;
        } else {
            f = this.mCirclePadding + this.mCircleTranslation + this.mPadding;
            f2 = this.mOuterCircleWidth;
            f3 = this.mCircleScaleX;
            switchMinWidth = (f2 * f3) + f;
        }
        int i2 = this.mBarHeight;
        int i3 = this.mOuterCircleWidth;
        float f6 = ((i2 - i3) / 2.0f) + this.mPadding;
        this.mOuterCircleRectF.set(f, f6, switchMinWidth, i3 + f6);
    }

    public void disableThemed() {
        this.mIsThemedEnabled = false;
    }

    public void enableThemed() {
        this.mIsThemedEnabled = true;
    }

    @Override // android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Switch.class.getName();
    }

    public final int getBarCheckedColor() {
        return this.mBarCheckedColor;
    }

    public final int getBarCheckedDisabledColor() {
        return this.mBarCheckedDisabledColor;
    }

    public final int getBarUnCheckedColor() {
        return this.mBarUnCheckedColor;
    }

    public final int getInnerCircleColor() {
        return this.mInnerCircleColor;
    }

    public final int getOuterCircleColor() {
        return this.mOuterCircleColor;
    }

    public final int getOuterCircleUncheckedColor() {
        return this.mOuterCircleUnCheckedColor;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isTactileFeedbackEnabled() {
        return this.mEnableHapticFeedback;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mIsThemedEnabled) {
            drawThemedBackground(canvas);
            drawThemedLoading(canvas);
            return;
        }
        super.onDraw(canvas);
        setOuterCircleRectF();
        setInnerCircleRectF();
        drawOuterCircle(canvas);
        drawInnerCircle(canvas);
        drawLoading(canvas);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.mIsLoadingStyle) {
            accessibilityNodeInfo.setText(isChecked() ? this.mSwitchOnStr : this.mSwitchOffStr);
        } else {
            accessibilityNodeInfo.setCheckable(false);
            accessibilityNodeInfo.setText(isChecked() ? this.mSwitchOnStr : this.mSwitchOffStr);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int switchMinWidth = getSwitchMinWidth();
        int i3 = this.mPadding;
        setMeasuredDimension(switchMinWidth + (i3 * 2), this.mBarHeight + (i3 * 2));
        if (this.mIsMeasured) {
            return;
        }
        this.mIsMeasured = true;
        if (isRtlMode()) {
            this.mCircleTranslation = isChecked() ? 0 : this.mDefaultTranslation;
        } else {
            this.mCircleTranslation = isChecked() ? this.mDefaultTranslation : 0;
        }
        this.mInnerCircleAlpha = isChecked() ? 0.0f : 1.0f;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.mShouldPlaySound = true;
            this.mEnableHapticFeedback = true;
        }
        if (this.mIsLoadingStyle && motionEvent.getAction() == 1 && isEnabled()) {
            startLoading();
            return false;
        }
        if (this.mIsLoading) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.NearSwitch, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.NearSwitch, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mInnerCircleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxInnerCircleColor, 0);
            this.mInnerCircleUncheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxInnerCircleUncheckedDisabledColor, 0);
            this.mOuterCircleUncheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxOuterCircleUncheckedDisabledColor, 0);
            this.mOuterCircleCheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxOuterCircleCheckedDisabledColor, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setBarCheckedColor(int i) {
        this.mBarCheckedColor = i;
        setBarStateListDrawable();
        invalidate();
    }

    public final void setBarCheckedDisabledColor(int i) {
        this.mBarCheckedDisabledColor = i;
        setBarStateListDrawable();
        invalidate();
    }

    public void setBarStateListDrawable() {
        Drawable drawable = ContextCompat.getDrawable(this.mContext, R$drawable.switch_custom_track_on);
        Drawable drawable2 = ContextCompat.getDrawable(this.mContext, R$drawable.switch_custom_track_off);
        Drawable drawable3 = ContextCompat.getDrawable(this.mContext, R$drawable.switch_custom_track_on_disable);
        Drawable drawable4 = ContextCompat.getDrawable(this.mContext, R$drawable.switch_custom_track_off_disable);
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (this.mBarCheckedColor != 0) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable.mutate();
            gradientDrawable.setColor(this.mBarCheckedColor);
            stateListDrawable.addState(new int[]{R.attr.state_checked, 16842910}, gradientDrawable);
        } else {
            stateListDrawable.addState(new int[]{R.attr.state_checked, 16842910}, drawable);
        }
        if (this.mBarUnCheckedColor != 0) {
            GradientDrawable gradientDrawable2 = (GradientDrawable) drawable2.mutate();
            gradientDrawable2.setColor(this.mBarUnCheckedColor);
            stateListDrawable.addState(new int[]{-16842912, 16842910}, gradientDrawable2);
        } else {
            stateListDrawable.addState(new int[]{-16842912, 16842910}, drawable2);
        }
        if (this.mBarCheckedDisabledColor != 0) {
            GradientDrawable gradientDrawable3 = (GradientDrawable) drawable3.mutate();
            gradientDrawable3.setColor(this.mBarCheckedDisabledColor);
            stateListDrawable.addState(new int[]{-16842910, R.attr.state_checked}, gradientDrawable3);
        } else {
            stateListDrawable.addState(new int[]{-16842910, R.attr.state_checked}, drawable3);
        }
        if (this.mBarUncheckedDisabledColor != 0) {
            GradientDrawable gradientDrawable4 = (GradientDrawable) drawable4.mutate();
            gradientDrawable4.setColor(this.mBarUncheckedDisabledColor);
            stateListDrawable.addState(new int[]{-16842910, -16842912}, gradientDrawable4);
        } else {
            stateListDrawable.addState(new int[]{-16842910, -16842912}, drawable4);
        }
        setTrackDrawable(stateListDrawable);
    }

    public final void setBarUnCheckedColor(int i) {
        this.mBarUnCheckedColor = i;
        setBarStateListDrawable();
        invalidate();
    }

    public final void setBarUncheckedDisabledColor(int i) {
        this.mBarUncheckedDisabledColor = i;
        setBarStateListDrawable();
        invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (z == isChecked()) {
            return;
        }
        super.setChecked(z);
        if (!this.mIsThemedEnabled) {
            z = isChecked();
            AnimatorSet animatorSet = this.mToggleAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.mToggleAnimator.end();
            }
            if (this.mIsAttachedToWindow) {
                animateWhenStateChanged(z);
            } else {
                if (isRtlMode()) {
                    setCircleTranslation(z ? 0 : this.mDefaultTranslation);
                } else {
                    setCircleTranslation(z ? this.mDefaultTranslation : 0);
                }
                setInnerCircleAlpha(z ? 0.0f : 1.0f);
            }
        }
        if (this.mShouldPlaySound) {
            playSoundEffect(z);
            this.mShouldPlaySound = false;
        }
        performFeedBack();
        invalidate();
    }

    public void setCheckedDrawable(Drawable drawable) {
        this.mCheckedDrawable = drawable;
    }

    public void setCircleScale(float f) {
        this.mCircleScale = f;
        invalidate();
    }

    public void setCircleScaleX(float f) {
        this.mCircleScaleX = f;
        invalidate();
    }

    public void setCircleTranslation(int i) {
        this.mCircleTranslation = i;
        invalidate();
    }

    public void setInnerCircleAlpha(float f) {
        this.mInnerCircleAlpha = f;
        invalidate();
    }

    public void setInnerCircleColor(int i) {
        this.mInnerCircleColor = i;
    }

    public void setLoadingAlpha(float f) {
        this.mLoadingAlpha = f;
        invalidate();
    }

    public void setLoadingDrawable(Drawable drawable) {
        this.mLoadingDrawable = drawable;
    }

    public void setLoadingRotation(float f) {
        this.mLoadingRotation = f;
        invalidate();
    }

    public void setLoadingScale(float f) {
        this.mLoadingScale = f;
        invalidate();
    }

    public void setLoadingStyle(boolean z) {
        this.mIsLoadingStyle = z;
    }

    public void setOnLoadingStateChangedListener(OnLoadingStateChangedListener onLoadingStateChangedListener) {
        this.mOnLoadingStateChangedListener = onLoadingStateChangedListener;
    }

    public void setOuterCircleColor(int i) {
        this.mOuterCircleColor = i;
    }

    public void setOuterCircleStrokeWidth(int i) {
        this.mOuterCircleStrokeWidth = i;
    }

    public final void setOuterCircleUncheckedColor(int i) {
        this.mOuterCircleUnCheckedColor = i;
        invalidate();
    }

    public void setShouldPlaySound(boolean z) {
        this.mShouldPlaySound = z;
    }

    public void setTactileFeedbackEnabled(boolean z) {
        this.mEnableHapticFeedback = z;
    }

    public void setThemedLoadingCheckedBackground(Drawable drawable) {
        this.mThemedLoadingCheckedBackground = drawable;
    }

    public void setThemedLoadingUncheckedBackground(Drawable drawable) {
        this.mThemedLoadingUncheckedBackground = drawable;
    }

    public void setUncheckedDrawable(Drawable drawable) {
        this.mUncheckedDrawable = drawable;
    }

    public void startLoading() {
        if (this.mIsLoading) {
            return;
        }
        AccessibilityManager accessibilityManager = this.mManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            announceForAccessibility(this.mSwitchLoadingStr);
        }
        this.mIsLoading = true;
        if (this.mIsThemedEnabled) {
            this.mThemedLoadingAnimator.start();
        } else {
            this.mStartLoadingAnimator.start();
        }
        OnLoadingStateChangedListener onLoadingStateChangedListener = this.mOnLoadingStateChangedListener;
        if (onLoadingStateChangedListener != null) {
            onLoadingStateChangedListener.onStartLoading();
        }
        invalidate();
    }

    public void stopLoading() {
        AccessibilityManager accessibilityManager;
        if (this.mIsLoadingStyle && (accessibilityManager = this.mManager) != null && accessibilityManager.isEnabled()) {
            announceForAccessibility(isChecked() ? this.mSwitchOffStr : this.mSwitchOnStr);
        }
        AnimatorSet animatorSet = this.mStartLoadingAnimator;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.mStartLoadingAnimator.cancel();
        }
        AnimatorSet animatorSet2 = this.mThemedLoadingAnimator;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.mThemedLoadingAnimator.cancel();
        }
        if (this.mIsLoading) {
            if (!this.mIsThemedEnabled) {
                this.mStopLoadingAnimator.start();
            }
            setCircleScale(1.0f);
            this.mIsLoading = false;
            toggle();
            OnLoadingStateChangedListener onLoadingStateChangedListener = this.mOnLoadingStateChangedListener;
            if (onLoadingStateChangedListener != null) {
                onLoadingStateChangedListener.onStopLoading();
            }
        }
    }

    public NearSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxSwitchStyle);
    }

    public NearSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsLoading = false;
        this.mIsLoadingStyle = false;
        this.mToggleAnimator = new AnimatorSet();
        this.mOuterCircleRectF = new RectF();
        this.mInnerCircleRectF = new RectF();
        this.mCircleScaleX = 1.0f;
        this.mCircleScale = 1.0f;
        this.mIsMeasured = false;
        this.mContext = context;
        setSoundEffectsEnabled(false);
        vhc.b(this, false);
        this.mManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.mStyle = attributeSet.getStyleAttribute();
        } else {
            this.mStyle = i;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearSwitch, i, 0);
        this.mLoadingDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSwitch_nxLoadingDrawable);
        this.mThemedLoadingDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSwitch_themedLoadingDrawable);
        this.mThemedLoadingCheckedBackground = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSwitch_themedLoadingCheckedBackground);
        this.mThemedLoadingUncheckedBackground = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSwitch_themedLoadingUncheckedBackground);
        this.mCheckedDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSwitch_themedCheckedDrawable);
        this.mUncheckedDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSwitch_themedUncheckedDrawable);
        this.mBarHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSwitch_nxBarHeight, 0);
        this.mOuterCircleStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSwitch_nxOuterCircleStrokeWidth, 0);
        this.mOuterCircleWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearSwitch_nxOuterCircleWidth, 0);
        this.mInnerCircleWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSwitch_nxInnerCircleWidth, 0);
        this.mCirclePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSwitch_nxCirclePadding, 0);
        this.mInnerCircleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxInnerCircleColor, 0);
        this.mOuterCircleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxOuterCircleColor, 0);
        this.mInnerCircleUncheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxInnerCircleUncheckedDisabledColor, 0);
        this.mOuterCircleUnCheckedColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxOuterCircleUncheckedColor, 0);
        this.mInnerCircleCheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxInnerCircleCheckedDisabledColor, 0);
        this.mOuterCircleUncheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxOuterCircleUncheckedDisabledColor, 0);
        this.mOuterCircleCheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxOuterCircleCheckedDisabledColor, 0);
        this.mBarCheckedColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxBarCheckedColor, 0);
        this.mBarUnCheckedColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxBarUnCheckedColor, 0);
        this.mBarCheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxBarCheckedDisabledColor, 0);
        this.mBarUncheckedDisabledColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSwitch_nxBarUncheckedDisabledColor, 0);
        this.isDrawInner = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearSwitch_nxIsDrawInner, true);
        setBarStateListDrawable();
        typedArrayObtainStyledAttributes.recycle();
        this.mIsThemedEnabled = getContext().getResources().getBoolean(R$bool.nx_switch_theme_enable);
        initAnimator();
        initPaint();
        initResValue(context);
    }

    public void setChecked(boolean z, boolean z2) {
        if (z == isChecked()) {
            return;
        }
        super.setChecked(z);
        if (this.mIsAttachedToWindow && z2) {
            animateWhenStateChanged(z);
        } else {
            if (isRtlMode()) {
                setCircleTranslation(z ? 0 : this.mDefaultTranslation);
            } else {
                setCircleTranslation(z ? this.mDefaultTranslation : 0);
            }
            setInnerCircleAlpha(z ? 0.0f : 1.0f);
        }
        invalidate();
    }
}
