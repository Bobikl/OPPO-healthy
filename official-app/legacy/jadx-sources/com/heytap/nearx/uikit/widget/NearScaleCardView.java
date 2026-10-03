package com.heytap.nearx.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import androidx.cardview.widget.CardView;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.widget.NearScaleCardView;
import com.oplus.aiunit.vision.t50;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\u001a\u0010\u001c\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0012\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearScaleCardView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAnimationPressValue", "", "mPressAnimationRecorder", "Landroid/animation/ValueAnimator;", "pressFeedbackInterpolator", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "animateNormal", "", "view", "Landroid/view/View;", "pressValue", "animatePress", "pressAnimationRecorder", "cancelRecorder", "generatePressAnimation", "Landroid/view/animation/ScaleAnimation;", "target", "generatePressAnimationRecord", "generateResumeAnimation", "animationStartValue", "getGuaranteedAnimationValue", "initRecorder", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NearScaleCardView extends CardView {
    private static final float BIG_CARD_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.07f;
    private static final int DEFAULT_FLOATING_BUTTON_HEIGHT = 156;
    private static final float DEFAULT_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.1f;
    private static final long DEFAULT_PRESS_FEEDBACK_ANIMATION_DURATION = 200;
    private static final float DEFAULT_PRESS_FEEDBACK_ANIMATION_END_VALUE = 0.9f;
    private static final float DEFAULT_PRESS_FEEDBACK_ANIMATION_START_VALUE = 1.0f;
    private static final int DEFAULT_TARGET_GUARANTEED_VALUE_THRESHOLD_HEIGHT = 600;
    private static final float SMALL_CARD_GUARANTEE_VALUE_THRESHOLD_PERCENTAGE = 0.35f;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private float mAnimationPressValue;

    @Nullable
    private ValueAnimator mPressAnimationRecorder;
    private final Interpolator pressFeedbackInterpolator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearScaleCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m4686_init_$lambda0(NearScaleCardView this$0, View v, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Integer numValueOf = motionEvent == null ? null : Integer.valueOf(motionEvent.getAction());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this$0.cancelRecorder();
            this$0.initRecorder();
            Intrinsics.checkNotNullExpressionValue(v, "v");
            this$0.animatePress(v, this$0.mPressAnimationRecorder);
        } else {
            boolean z = true;
            if ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 3)) {
                z = false;
            }
            if (z) {
                this$0.cancelRecorder();
                Intrinsics.checkNotNullExpressionValue(v, "v");
                this$0.animateNormal(v, this$0.mAnimationPressValue);
            }
        }
        return false;
    }

    private final void animateNormal(View view, float pressValue) {
        view.clearAnimation();
        view.startAnimation(generateResumeAnimation(view, pressValue));
    }

    private final void animatePress(View view, final ValueAnimator pressAnimationRecorder) {
        view.clearAnimation();
        ScaleAnimation scaleAnimationGeneratePressAnimation = generatePressAnimation(view);
        scaleAnimationGeneratePressAnimation.setAnimationListener(new t50() { // from class: com.heytap.nearx.uikit.widget.NearScaleCardView.animatePress.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ValueAnimator valueAnimator = pressAnimationRecorder;
                if (valueAnimator == null) {
                    return;
                }
                valueAnimator.start();
            }
        });
        view.startAnimation(scaleAnimationGeneratePressAnimation);
    }

    private final void cancelRecorder() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.mPressAnimationRecorder;
        if (valueAnimator2 != null) {
            Intrinsics.checkNotNull(valueAnimator2);
            if (!valueAnimator2.isRunning() || (valueAnimator = this.mPressAnimationRecorder) == null) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    private final ScaleAnimation generatePressAnimation(View target) {
        if (target == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.".toString());
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, target.getWidth() / 2.0f, target.getHeight() / 2.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(this.pressFeedbackInterpolator);
        return scaleAnimation;
    }

    private final ValueAnimator generatePressAnimationRecord() {
        ValueAnimator pressAnimationRecord = ValueAnimator.ofFloat(1.0f, 0.9f);
        pressAnimationRecord.setDuration(200L);
        pressAnimationRecord.setInterpolator(this.pressFeedbackInterpolator);
        Intrinsics.checkNotNullExpressionValue(pressAnimationRecord, "pressAnimationRecord");
        return pressAnimationRecord;
    }

    private final ScaleAnimation generateResumeAnimation(View target, float animationStartValue) {
        if (target == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.".toString());
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(animationStartValue, 1.0f, animationStartValue, 1.0f, target.getWidth() / 2.0f, target.getHeight() / 2.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(this.pressFeedbackInterpolator);
        return scaleAnimation;
    }

    private final float getGuaranteedAnimationValue(View target) {
        if (target == null) {
            throw new IllegalArgumentException("The given view is empty. Please provide a valid view.".toString());
        }
        if (target.getHeight() >= 600) {
            return 0.993f;
        }
        return target.getHeight() >= 156 ? 0.965f : 0.99f;
    }

    private final void initRecorder() {
        final float guaranteedAnimationValue = getGuaranteedAnimationValue(this);
        ValueAnimator valueAnimatorGeneratePressAnimationRecord = generatePressAnimationRecord();
        this.mPressAnimationRecorder = valueAnimatorGeneratePressAnimationRecord;
        if (valueAnimatorGeneratePressAnimationRecord == null) {
            return;
        }
        valueAnimatorGeneratePressAnimationRecord.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ukc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearScaleCardView.m4687initRecorder$lambda1(this.i, guaranteedAnimationValue, valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initRecorder$lambda-1, reason: not valid java name */
    public static final void m4687initRecorder$lambda1(NearScaleCardView this$0, float f, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.mAnimationPressValue = fFloatValue;
        if (fFloatValue >= f) {
            this$0.mAnimationPressValue = f;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearScaleCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearScaleCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pressFeedbackInterpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f);
        this.mAnimationPressValue = 1.0f;
        setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.tkc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NearScaleCardView.m4686_init_$lambda0(this.i, view, motionEvent);
            }
        });
        this._$_findViewCache = new LinkedHashMap();
    }

    public /* synthetic */ NearScaleCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
