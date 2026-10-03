package com.coui.appcompat.couiswitch;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.Switch;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.byg;
import com.oplus.aiunit.vision.gf2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.mm2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.rmi;
import com.oplus.aiunit.vision.vi2;
import com.oplus.graphics.OplusOutlineAdapter;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$bool;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$drawable;
import com.support.appcompat.R$raw;
import com.support.appcompat.R$string;
import com.support.appcompat.R$styleable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes13.dex */
public class COUISwitch extends SwitchCompat {
    private static final int ALPHA_VALUE_30 = 1308622847;
    private static final float DEFAULT_STATE_SPRING_BOUNCE = 0.0f;
    private static final float DEFAULT_STATE_SPRING_RESPONSE = 0.3f;
    private static final String TAG = "COUISwitch";
    private int mBarCheckedColor;
    private int mBarCheckedDisabledColor;
    private int mBarHeight;
    private int mBarTrackCurrentColor;
    private int mBarUnCheckedColor;
    private int mBarUncheckedDisabledColor;
    private Drawable mCheckedDrawable;
    private int mCirclePadding;
    private float mCircleScale;
    private float mCircleScaleX;
    private int mCircleTranslation;
    private int mDefaultTranslation;
    private boolean mEnableHapticFeedback;
    private rmi mHoverAnimator;
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
    private d mOnLoadingStateChangedListener;
    private int mOuterCircleCheckedDisabledColor;
    private int mOuterCircleColor;
    private Paint mOuterCirclePaint;
    private RectF mOuterCircleRectF;
    private int mOuterCircleStrokeWidth;
    private int mOuterCircleUnCheckedColor;
    private int mOuterCircleUncheckedDisabledColor;
    private int mOuterCircleWidth;
    private int mPadding;
    private rmi mPressAnimator;
    private boolean mShouldPlaySound;
    private AnimatorSet mStartLoadingAnimator;
    private hm2 mStateEffectBackground;
    private AnimatorSet mStopLoadingAnimator;
    private mm2 mStrokeDrawable;
    private int mStyle;
    private String mSwitchLoadingStr;
    private String mSwitchOffStr;
    private String mSwitchOnStr;
    private final RectF mSwitchRect;
    private AnimatorSet mThemedLoadingAnimator;
    private Drawable mThemedLoadingCheckedBackground;
    private Drawable mThemedLoadingDrawable;
    private Drawable mThemedLoadingUncheckedBackground;
    private AnimatorSet mToggleAnimator;
    private Drawable mUncheckedDrawable;
    private ExecutorService mVibratorExecutor;

    public class a extends ViewOutlineProvider {
        public final Rect a = new Rect();
        public OplusOutlineAdapter b;

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            this.b = new OplusOutlineAdapter(outline, 1);
            this.a.left = (int) COUISwitch.this.mSwitchRect.left;
            this.a.top = (int) COUISwitch.this.mSwitchRect.top;
            this.a.right = (int) COUISwitch.this.mSwitchRect.right;
            this.a.bottom = (int) COUISwitch.this.mSwitchRect.bottom;
            this.b.setSmoothRoundRect(this.a, (this.a.height() * COUISwitch.this.getScaleY()) / 2.0f);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUISwitch.this.performHapticFeedback(302);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUISwitch.this.performHapticFeedback(302);
        }
    }

    public interface d {
        void onStartLoading();

        void onStopLoading();
    }

    public COUISwitch(Context context) {
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
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(this, "barColor", getBarColor(), z ? this.mBarCheckedColor : this.mBarUnCheckedColor);
        objectAnimatorOfArgb.setDuration(450L);
        this.mToggleAnimator.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfInt).with(objectAnimatorOfFloat3).with(objectAnimatorOfArgb);
        this.mToggleAnimator.start();
    }

    private Drawable backgroundDrawable() {
        if (isLoading()) {
            return isChecked() ? this.mThemedLoadingCheckedBackground : this.mThemedLoadingUncheckedBackground;
        }
        return isChecked() ? this.mCheckedDrawable : this.mUncheckedDrawable;
    }

    private boolean canDrawBar() {
        return true;
    }

    private void configStateEffectAnimator() {
        this.mHoverAnimator = new rmi(this, "hover", 0, lh2.a(getContext(), R$attr.couiColorHover));
        this.mPressAnimator = new rmi(this, "press", 0, lh2.a(getContext(), R$attr.couiColorPress));
        this.mHoverAnimator.l(0.3f);
        this.mHoverAnimator.k(0.0f);
        this.mPressAnimator.l(0.3f);
        this.mPressAnimator.k(0.0f);
    }

    private void drawBar() {
        Drawable trackDrawable;
        if (canDrawBar() && (trackDrawable = getTrackDrawable()) != null) {
            if (isEnabled()) {
                trackDrawable.setTint(ColorUtils.compositeColors(this.mPressAnimator.g(), ColorUtils.compositeColors(this.mHoverAnimator.g(), this.mBarTrackCurrentColor)));
            } else {
                trackDrawable.setTint(isChecked() ? this.mBarCheckedDisabledColor : this.mBarUncheckedDisabledColor);
            }
        }
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

    private int getBarColor() {
        return this.mBarTrackCurrentColor;
    }

    private void initAnimator() {
        initStartLoadingAnimator();
        initStopLoadingAnimator();
        initThemedLoadingAnimator();
    }

    private void initAttr(TypedArray typedArray, Context context) {
        this.mLoadingDrawable = typedArray.getDrawable(R$styleable.COUISwitch_loadingDrawable);
        this.mBarHeight = typedArray.getDimensionPixelSize(R$styleable.COUISwitch_barHeight, 0);
        this.mOuterCircleStrokeWidth = typedArray.getDimensionPixelSize(R$styleable.COUISwitch_outerCircleStrokeWidth, 0);
        this.mOuterCircleWidth = typedArray.getDimensionPixelOffset(R$styleable.COUISwitch_outerCircleWidth, 0);
        this.mInnerCircleWidth = typedArray.getDimensionPixelSize(R$styleable.COUISwitch_innerCircleWidth, 0);
        this.mCirclePadding = typedArray.getDimensionPixelSize(R$styleable.COUISwitch_circlePadding, 0);
        this.mInnerCircleColor = typedArray.getColor(R$styleable.COUISwitch_innerCircleColor, 0);
        this.mOuterCircleColor = typedArray.getColor(R$styleable.COUISwitch_outerCircleColor, 0);
        this.mInnerCircleUncheckedDisabledColor = typedArray.getColor(R$styleable.COUISwitch_innerCircleUncheckedDisabledColor, 0);
        this.mOuterCircleUnCheckedColor = typedArray.getColor(R$styleable.COUISwitch_outerUnCheckedCircleColor, 0);
        this.mInnerCircleCheckedDisabledColor = typedArray.getColor(R$styleable.COUISwitch_innerCircleCheckedDisabledColor, 0);
        this.mOuterCircleUncheckedDisabledColor = typedArray.getColor(R$styleable.COUISwitch_outerCircleUncheckedDisabledColor, 0);
        this.mOuterCircleCheckedDisabledColor = typedArray.getColor(R$styleable.COUISwitch_outerCircleCheckedDisabledColor, 0);
        this.mBarCheckedDisabledColor = typedArray.getColor(R$styleable.COUISwitch_barUncheckedDisabledColor, lh2.a(context, R$attr.couiColorPrimary) & ALPHA_VALUE_30);
        boolean z = getContext().getResources().getBoolean(R$bool.coui_switch_theme_enable);
        this.mIsThemedEnabled = z;
        if (z) {
            this.mThemedLoadingDrawable = typedArray.getDrawable(R$styleable.COUISwitch_themedLoadingDrawable);
            this.mThemedLoadingCheckedBackground = typedArray.getDrawable(R$styleable.COUISwitch_themedLoadingCheckedBackground);
            this.mThemedLoadingUncheckedBackground = typedArray.getDrawable(R$styleable.COUISwitch_themedLoadingUncheckedBackground);
            this.mCheckedDrawable = typedArray.getDrawable(R$styleable.COUISwitch_themedCheckedDrawable);
            this.mUncheckedDrawable = typedArray.getDrawable(R$styleable.COUISwitch_themedUncheckedDrawable);
        }
    }

    private void initOutLine() {
        if (!isOs16() || this.mIsThemedEnabled) {
            return;
        }
        setOutlineProvider(new a());
        setClipToOutline(true);
        byg.b(this);
    }

    private void initPaint() {
        this.mOuterCirclePaint = new Paint(1);
        setPaintShadowLayer();
        this.mInnerCirclePaint = new Paint(1);
    }

    private void initResValue(Context context) {
        this.mPadding = context.getResources().getDimensionPixelSize(R$dimen.coui_switch_padding);
        this.mSwitchOnStr = getResources().getString(R$string.switch_on);
        this.mSwitchOffStr = getResources().getString(R$string.switch_off);
        this.mSwitchLoadingStr = getResources().getString(R$string.switch_loading);
        this.mDefaultTranslation = (getSwitchMinWidth() - (this.mCirclePadding * 2)) - this.mOuterCircleWidth;
        this.mBarCheckedColor = lh2.a(context, R$attr.couiColorPrimary);
        this.mBarUnCheckedColor = lh2.a(context, R$attr.couiColorControls);
        this.mBarTrackCurrentColor = isChecked() ? this.mBarCheckedColor : this.mBarUnCheckedColor;
        this.mBarUncheckedDisabledColor = lh2.a(context, R$attr.couiColorPressBackground);
        setTrackTintMode(PorterDuff.Mode.SRC);
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
        objectAnimatorOfFloat4.setInterpolator(new vi2());
        this.mStartLoadingAnimator.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4);
    }

    private void initStateEffectBackground() {
        Drawable background = getBackground();
        mm2 mm2Var = new mm2(getContext());
        this.mStrokeDrawable = mm2Var;
        RectF rectF = this.mSwitchRect;
        Resources resources = getContext().getResources();
        int i = R$dimen.bar_radius;
        mm2Var.x(rectF, resources.getDimensionPixelOffset(i), getContext().getResources().getDimensionPixelOffset(i));
        Drawable[] drawableArr = new Drawable[2];
        if (background == null) {
            background = new ColorDrawable(0);
        }
        drawableArr[0] = background;
        drawableArr[1] = this.mStrokeDrawable;
        setDefaultFocusHighlightEnabled(false);
        hm2 hm2Var = new hm2(drawableArr);
        this.mStateEffectBackground = hm2Var;
        super.setBackground(hm2Var);
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
        objectAnimatorOfFloat.setInterpolator(new vi2());
        this.mThemedLoadingAnimator.play(objectAnimatorOfFloat);
    }

    private boolean isExecutorShutdown(ExecutorService executorService) {
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return executorService.isShutdown();
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated();
    }

    private boolean isOs16() {
        return byf.a() == 1;
    }

    private boolean isRtlMode() {
        return getLayoutDirection() == 1;
    }

    private void performFeedBack() {
        if (isTactileFeedbackEnabled()) {
            ExecutorService executorService = this.mVibratorExecutor;
            if (executorService == null || isExecutorShutdown(executorService)) {
                this.mVibratorExecutor = Executors.newSingleThreadExecutor();
            }
            try {
                this.mVibratorExecutor.execute(new b());
            } catch (RejectedExecutionException unused) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.mVibratorExecutor = executorServiceNewSingleThreadExecutor;
                try {
                    executorServiceNewSingleThreadExecutor.execute(new c());
                } catch (RejectedExecutionException e2) {
                    Log.e(TAG, "Failed to execute haptic feedback due to executor shutdown.", e2);
                }
            }
            setTactileFeedbackEnabled(false);
        }
    }

    private void playSoundEffect(boolean z) {
        gf2.f(getContext(), z ? R$raw.coui_switch_sound_on : R$raw.coui_switch_sound_off, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    private void setBarColor(int i) {
        this.mBarTrackCurrentColor = i;
        invalidate();
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

    private void setPaintShadowLayer() {
        this.mOuterCirclePaint.setShadowLayer(8.0f, 0.0f, 4.0f, Color.argb(25, 0, 0, 0));
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
        gf2.i(getContext(), R$raw.coui_switch_sound_on, R$raw.coui_switch_sound_off);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        ExecutorService executorService = this.mVibratorExecutor;
        if (executorService == null || isExecutorShutdown(executorService)) {
            return;
        }
        this.mVibratorExecutor.shutdown();
        this.mVibratorExecutor = null;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mIsThemedEnabled) {
            drawThemedBackground(canvas);
            drawThemedLoading(canvas);
            return;
        }
        drawBar();
        setOuterCircleRectF();
        setInnerCircleRectF();
        super.onDraw(canvas);
        drawOuterCircle(canvas);
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

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mSwitchRect.set(0.0f, 0.0f, i, i2);
        if (isOs16()) {
            invalidateOutline();
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isClickable() || isFocusable()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.mPressAnimator.d(10000.0f, true);
            } else if (actionMasked == 1) {
                this.mShouldPlaySound = true;
                this.mEnableHapticFeedback = true;
                this.mPressAnimator.d(0.0f, true);
                if (this.mIsLoadingStyle && isEnabled()) {
                    startLoading();
                    return false;
                }
            } else if (actionMasked == 3) {
                this.mPressAnimator.d(0.0f, true);
            }
        }
        if (this.mIsLoading) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3;
        AnimatorSet animatorSet4;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.mIsThemedEnabled && (animatorSet4 = this.mThemedLoadingAnimator) != null && animatorSet4.isPaused()) {
                this.mThemedLoadingAnimator.resume();
                return;
            } else {
                if (this.mIsThemedEnabled || (animatorSet3 = this.mStartLoadingAnimator) == null || !animatorSet3.isPaused()) {
                    return;
                }
                this.mStartLoadingAnimator.resume();
                return;
            }
        }
        if (this.mIsThemedEnabled && (animatorSet2 = this.mThemedLoadingAnimator) != null && animatorSet2.isRunning()) {
            this.mThemedLoadingAnimator.pause();
        } else {
            if (this.mIsThemedEnabled || (animatorSet = this.mStartLoadingAnimator) == null || !animatorSet.isRunning()) {
                return;
            }
            this.mStartLoadingAnimator.pause();
        }
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUISwitch, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUISwitch, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            initAttr(typedArrayObtainStyledAttributes, getContext());
            typedArrayObtainStyledAttributes.recycle();
            initResValue(getContext());
        }
        rmi rmiVar = this.mPressAnimator;
        if (rmiVar != null) {
            rmiVar.i(lh2.a(getContext(), R$attr.couiColorPress));
        }
        rmi rmiVar2 = this.mHoverAnimator;
        if (rmiVar2 != null) {
            rmiVar2.i(lh2.a(getContext(), R$attr.couiColorHover));
        }
        hm2 hm2Var = this.mStateEffectBackground;
        if (hm2Var != null) {
            hm2Var.h(getContext());
        }
        invalidate();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        hm2 hm2Var = this.mStateEffectBackground;
        if (hm2Var == null) {
            super.setBackground(drawable);
        } else if (drawable == null) {
            hm2Var.j(new ColorDrawable(0));
        } else {
            hm2Var.j(drawable);
        }
    }

    public final void setBarCheckedColor(int i) {
        this.mBarCheckedColor = i;
        if (isChecked()) {
            this.mBarTrackCurrentColor = this.mBarCheckedColor;
        }
        setBarStateListDrawable();
        invalidate();
    }

    public final void setBarCheckedDisabledColor(int i) {
        this.mBarCheckedDisabledColor = i;
        setBarStateListDrawable();
        invalidate();
    }

    public void setBarStateListDrawable() {
        Drawable drawable = ContextCompat.getDrawable(getContext(), R$drawable.switch_custom_track_on);
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), R$drawable.switch_custom_track_off);
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), R$drawable.switch_custom_track_on_disable);
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), R$drawable.switch_custom_track_off_disable);
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
        if (!isChecked()) {
            this.mBarTrackCurrentColor = this.mBarUnCheckedColor;
        }
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
        setChecked(z, true);
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

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.mOuterCirclePaint == null) {
            this.mOuterCirclePaint = new Paint(1);
        }
        if (z) {
            setPaintShadowLayer();
        } else {
            this.mOuterCirclePaint.clearShadowLayer();
        }
    }

    @Override // android.view.View
    public void setHovered(boolean z) {
        super.setHovered(z);
        if (isEnabled()) {
            this.mHoverAnimator.d(z ? 10000.0f : 0.0f, true);
        }
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

    public void setOnLoadingStateChangedListener(d dVar) {
        this.mOnLoadingStateChangedListener = dVar;
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
        d dVar = this.mOnLoadingStateChangedListener;
        if (dVar != null) {
            dVar.onStartLoading();
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
            d dVar = this.mOnLoadingStateChangedListener;
            if (dVar != null) {
                dVar.onStopLoading();
            }
        }
    }

    public COUISwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiSwitchStyle);
    }

    public void setChecked(boolean z, boolean z2) {
        if (z == isChecked()) {
            return;
        }
        super.setChecked(z);
        if (!this.mIsThemedEnabled) {
            z = isChecked();
            AnimatorSet animatorSet = this.mToggleAnimator;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.mToggleAnimator.cancel();
                this.mToggleAnimator.end();
            }
            if (!this.mIsAttachedToWindow || !z2 || getHeight() <= 0 || getWidth() <= 0) {
                if (isRtlMode()) {
                    setCircleTranslation(z ? 0 : this.mDefaultTranslation);
                } else {
                    setCircleTranslation(z ? this.mDefaultTranslation : 0);
                }
                setInnerCircleAlpha(z ? 0.0f : 1.0f);
                setBarColor(z ? this.mBarCheckedColor : this.mBarUnCheckedColor);
            } else {
                animateWhenStateChanged(z);
            }
        }
        if (this.mShouldPlaySound && this.mIsAttachedToWindow) {
            playSoundEffect(z);
            this.mShouldPlaySound = false;
        }
        performFeedBack();
        invalidate();
    }

    public COUISwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSwitchRect = new RectF();
        this.mIsLoading = false;
        this.mIsLoadingStyle = false;
        this.mToggleAnimator = new AnimatorSet();
        this.mOuterCircleRectF = new RectF();
        this.mInnerCircleRectF = new RectF();
        this.mCircleScaleX = 1.0f;
        this.mCircleScale = 1.0f;
        this.mIsMeasured = false;
        setSoundEffectsEnabled(false);
        ph2.c(this, false);
        this.mManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.mStyle = attributeSet.getStyleAttribute();
        } else {
            this.mStyle = i;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUISwitch, i, 0);
        initAttr(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        initAnimator();
        initPaint();
        initResValue(context);
        initStateEffectBackground();
        configStateEffectAnimator();
        initOutLine();
    }
}
