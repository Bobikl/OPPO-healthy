package com.heytap.nearx.uikit.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$plurals;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.oplus.aiunit.vision.eic;
import com.oplus.aiunit.vision.i85;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 U2\u00020\u0001:\u0001UB'\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u00020\u0002¢\u0006\u0004\bS\u0010TJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J0\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\u0005H\u0014R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010#R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010#R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010#R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010#R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00102R\u0018\u0010;\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010@\u001a\u00020-2\u0006\u0010?\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010/\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010J\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010M\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010I¨\u0006V"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearHintRedDot;", "Landroid/view/View;", "", "oldNum", "newNum", "", "executeWidthAnim", "executeAlphaAnim", "cancelAnim", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", ParserTag.TAG_TEXT_SIZE, "radius", "measuredDimension", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "Landroid/graphics/Canvas;", "canvas", "onDraw", "setLaidOut", "getIsLaidOut", "num", "changePointNumber", "isShow", "executeScaleAnim", "onDetachedFromWindow", "mPointMode", "I", "mPointNumber", "Lcom/oplus/aiunit/vision/eic;", "mNearHintRedDotDelegate", "Lcom/oplus/aiunit/vision/eic;", "Landroid/graphics/RectF;", "mRectF", "Landroid/graphics/RectF;", "redDotWidth", "redDotHeight", "", "mRedDotDescription", "Ljava/lang/String;", "mRedDotWithNumberDescriptionId", "mIsLaidOut", "Z", "mTempPointNumber", "mTextPaintAlpha", "mIsExecutingAlphaAnim", "Landroid/animation/ValueAnimator;", "mWidthAnim", "Landroid/animation/ValueAnimator;", "mTempWidth", "mIsExecutingWidthAnim", "mAlphaAnim", "Landroid/graphics/drawable/Drawable;", "mStrokeBackground", "Landroid/graphics/drawable/Drawable;", "text", "pointText", "getPointText", "()Ljava/lang/String;", "setPointText", "(Ljava/lang/String;)V", "mode", "getPointMode", "()I", "setPointMode", "(I)V", "pointMode", "getPointNumber", "setPointNumber", "pointNumber", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class NearHintRedDot extends View {
    public static final int CONSTANT_VALUE_1000 = 1000;
    public static final int CONSTANT_VALUE_3 = 3;
    public static final int CONSTANT_VALUE_4 = 4;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_ALPHA_VALUE = 255;
    public static final int MIN_ALPHA_VALUE = 0;
    public static final int NO_POINT_MODE = 0;
    public static final long NUM_CHANGE_ALPHA_ANIM_DURATION = 150;
    public static final long NUM_CHANGE_WIDTH_ANIM_DURATION = 517;

    @NotNull
    private static final Interpolator NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR;
    public static final int POINT_NAVI_WITH_NUM = 3;
    public static final int POINT_ONLY_MODE = 1;
    public static final int POINT_ONLY_MODE_STROKE = 4;
    public static final int POINT_WITH_NUM_MODE = 2;
    public static final int RED_POINT_ANIM_DURATION = 520;
    public static final int TYPE_BIG_RECT_RADIUS = 2;
    public static final int TYPE_SMALL_RECT_RADIUS = 1;

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private ValueAnimator mAlphaAnim;
    private boolean mIsExecutingAlphaAnim;
    private boolean mIsExecutingWidthAnim;
    private boolean mIsLaidOut;

    @NotNull
    private final eic mNearHintRedDotDelegate;
    private int mPointMode;
    private int mPointNumber;

    @NotNull
    private final RectF mRectF;

    @Nullable
    private String mRedDotDescription;
    private int mRedDotWithNumberDescriptionId;

    @Nullable
    private Drawable mStrokeBackground;
    private int mTempPointNumber;
    private int mTempWidth;
    private int mTextPaintAlpha;

    @Nullable
    private ValueAnimator mWidthAnim;

    @NotNull
    private String pointText;
    private int radius;
    private int redDotHeight;
    private int redDotWidth;
    private int textSize;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearHintRedDot$Companion;", "", "()V", "CONSTANT_VALUE_1000", "", "CONSTANT_VALUE_3", "CONSTANT_VALUE_4", "MAX_ALPHA_VALUE", "MIN_ALPHA_VALUE", "NO_POINT_MODE", "NUM_CHANGE_ALPHA_ANIM_DURATION", "", "NUM_CHANGE_WIDTH_ANIM_DURATION", "NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR", "Landroid/view/animation/Interpolator;", "getNUM_CHANGE_WIDTH_ANIM_INTERPOLATOR", "()Landroid/view/animation/Interpolator;", "POINT_NAVI_WITH_NUM", "POINT_ONLY_MODE", "POINT_ONLY_MODE_STROKE", "POINT_WITH_NUM_MODE", "RED_POINT_ANIM_DURATION", "TYPE_BIG_RECT_RADIUS", "TYPE_SMALL_RECT_RADIUS", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Interpolator getNUM_CHANGE_WIDTH_ANIM_INTERPOLATOR() {
            return NearHintRedDot.NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR;
        }
    }

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(0.3f, 0f, 0.1f, 1f)");
        NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR = interpolatorCreate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearHintRedDot(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void cancelAnim() {
        ValueAnimator valueAnimator = this.mWidthAnim;
        if (valueAnimator != null) {
            Intrinsics.checkNotNull(valueAnimator);
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.mWidthAnim;
                Intrinsics.checkNotNull(valueAnimator2);
                valueAnimator2.end();
            }
        }
        ValueAnimator valueAnimator3 = this.mAlphaAnim;
        if (valueAnimator3 != null) {
            Intrinsics.checkNotNull(valueAnimator3);
            if (valueAnimator3.isRunning()) {
                ValueAnimator valueAnimator4 = this.mAlphaAnim;
                Intrinsics.checkNotNull(valueAnimator4);
                valueAnimator4.end();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeAlphaAnim() {
        if (this.mAlphaAnim == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            this.mAlphaAnim = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setDuration(150L);
            }
            ValueAnimator valueAnimator = this.mAlphaAnim;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.dic
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        NearHintRedDot.m4674executeAlphaAnim$lambda1(this.i, valueAnimator2);
                    }
                });
            }
            ValueAnimator valueAnimator2 = this.mAlphaAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearHintRedDot.executeAlphaAnim.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NotNull Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        NearHintRedDot.this.mIsExecutingAlphaAnim = false;
                        NearHintRedDot nearHintRedDot = NearHintRedDot.this;
                        nearHintRedDot.mPointNumber = nearHintRedDot.mTempPointNumber;
                        NearHintRedDot.this.mTempPointNumber = 0;
                        NearHintRedDot nearHintRedDot2 = NearHintRedDot.this;
                        nearHintRedDot2.setPointNumber(nearHintRedDot2.mPointNumber);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        NearHintRedDot.this.mIsExecutingAlphaAnim = false;
                        NearHintRedDot nearHintRedDot = NearHintRedDot.this;
                        nearHintRedDot.mPointNumber = nearHintRedDot.mTempPointNumber;
                        NearHintRedDot.this.mTempPointNumber = 0;
                        NearHintRedDot nearHintRedDot2 = NearHintRedDot.this;
                        nearHintRedDot2.setPointNumber(nearHintRedDot2.mPointNumber);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NotNull Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        NearHintRedDot.this.mIsExecutingAlphaAnim = true;
                    }
                });
            }
        }
        ValueAnimator valueAnimator3 = this.mAlphaAnim;
        Intrinsics.checkNotNull(valueAnimator3);
        valueAnimator3.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeAlphaAnim$lambda-1, reason: not valid java name */
    public static final void m4674executeAlphaAnim$lambda1(NearHintRedDot this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        this$0.mTextPaintAlpha = ((Integer) animatedValue).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeScaleAnim$lambda-2, reason: not valid java name */
    public static final void m4675executeScaleAnim$lambda2(NearHintRedDot this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (this$0.getVisibility() != 8) {
            this$0.setScaleX(fFloatValue);
            this$0.setScaleY(fFloatValue);
            this$0.invalidate();
        }
    }

    private final void executeWidthAnim(int oldNum, int newNum) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mNearHintRedDotDelegate.d(this.mPointMode, String.valueOf(oldNum)), this.mNearHintRedDotDelegate.d(this.mPointMode, String.valueOf(newNum)));
        this.mWidthAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(517L);
        }
        ValueAnimator valueAnimator = this.mWidthAnim;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR);
        }
        ValueAnimator valueAnimator2 = this.mWidthAnim;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.cic
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    NearHintRedDot.m4676executeWidthAnim$lambda0(this.i, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.mWidthAnim;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearHintRedDot.executeWidthAnim.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    NearHintRedDot.this.mIsExecutingWidthAnim = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    NearHintRedDot.this.mIsExecutingWidthAnim = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    NearHintRedDot.this.mIsExecutingWidthAnim = true;
                    NearHintRedDot.this.executeAlphaAnim();
                }
            });
        }
        ValueAnimator valueAnimator4 = this.mWidthAnim;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeWidthAnim$lambda-0, reason: not valid java name */
    public static final void m4676executeWidthAnim$lambda0(NearHintRedDot this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        this$0.mTempWidth = ((Integer) animatedValue).intValue();
        this$0.requestLayout();
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

    public final void changePointNumber(int num) {
        int i;
        if (getVisibility() == 8 || (i = this.mPointMode) == 0 || i == 1 || i == 4 || this.mPointNumber == num || num <= 0) {
            return;
        }
        cancelAnim();
        if (!this.mIsLaidOut) {
            setPointNumber(num);
        } else {
            this.mTempPointNumber = num;
            executeWidthAnim(this.mPointNumber, num);
        }
    }

    public void executeScaleAnim(final boolean isShow) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(isShow ? 0.0f : 1.0f, isShow ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(520L);
        valueAnimatorOfFloat.setInterpolator(NUM_CHANGE_WIDTH_ANIM_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.bic
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearHintRedDot.m4675executeScaleAnim$lambda2(this.i, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.NearHintRedDot.executeScaleAnim.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (isShow) {
                    return;
                }
                this.setPointMode(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (isShow) {
                    return;
                }
                this.setPointMode(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (isShow) {
                    this.requestLayout();
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: getIsLaidOut, reason: from getter */
    public final boolean getMIsLaidOut() {
        return this.mIsLaidOut;
    }

    /* JADX INFO: renamed from: getPointMode, reason: from getter */
    public final int getMPointMode() {
        return this.mPointMode;
    }

    /* JADX INFO: renamed from: getPointNumber, reason: from getter */
    public final int getMPointNumber() {
        return this.mPointNumber;
    }

    @NotNull
    public final String getPointText() {
        return this.pointText;
    }

    public final void measuredDimension(int textSize, int radius) {
        this.textSize = textSize;
        this.radius = radius;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        cancelAnim();
        super.onDetachedFromWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.mRectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.mRectF.bottom = getHeight();
        if (this.mIsExecutingAlphaAnim && ((i = this.mPointNumber) < 1000 || this.mTempPointNumber < 1000)) {
            eic eicVar = this.mNearHintRedDotDelegate;
            int i2 = this.mTextPaintAlpha;
            eicVar.h(canvas, i, i2, this.mTempPointNumber, 255 - i2, this.mRectF);
        } else {
            int i3 = this.textSize;
            if (i3 == 0 && this.radius == 0) {
                this.mNearHintRedDotDelegate.e(canvas, this.mPointMode, this.pointText, this.mRectF);
            } else {
                this.mNearHintRedDotDelegate.c(canvas, this.mPointMode, this.pointText, this.mRectF, i3, this.radius);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mIsLaidOut = true;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iD;
        int i;
        if (this.mIsExecutingWidthAnim) {
            iD = this.mTempWidth;
        } else {
            iD = this.redDotWidth;
            if (iD == 0 || this.redDotHeight == 0) {
                iD = this.mNearHintRedDotDelegate.d(this.mPointMode, this.pointText);
            }
        }
        if (this.redDotWidth == 0 || (i = this.redDotHeight) == 0) {
            setMeasuredDimension(iD, this.mNearHintRedDotDelegate.g(this.mPointMode, this.pointText));
        } else {
            setMeasuredDimension(iD, i);
        }
    }

    public final void setLaidOut() {
        this.mIsLaidOut = true;
    }

    public final void setPointMode(int i) {
        if (this.mPointMode != i) {
            this.mPointMode = i;
            if (i == 4) {
                setBackground(this.mStrokeBackground);
            }
            requestLayout();
            int i2 = this.mPointMode;
            if (i2 == 1 || i2 == 4) {
                setContentDescription(this.mRedDotDescription);
            } else if (i2 == 0) {
                setContentDescription("");
            }
        }
    }

    public final void setPointNumber(int i) {
        this.mPointNumber = i;
        setPointText(i != 0 ? String.valueOf(i) : "");
        if (i > 0) {
            Resources resources = getResources();
            int i2 = this.mRedDotWithNumberDescriptionId;
            int i3 = this.mPointNumber;
            setContentDescription(Intrinsics.stringPlus(",", resources.getQuantityString(i2, i3, Integer.valueOf(i3))));
        }
    }

    public final void setPointText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.pointText = text;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearHintRedDot(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearHintRedDot(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTextPaintAlpha = 255;
        this.pointText = "";
        Object objF = i85.f();
        Intrinsics.checkNotNullExpressionValue(objF, "createNearHintRedDotDelegateDelegate()");
        eic eicVar = (eic) objF;
        this.mNearHintRedDotDelegate = eicVar;
        int[] NearHintRedDot = R$styleable.NearHintRedDot;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NearHintRedDot, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…rHintRedDot, defStyle, 0)");
        this.mPointMode = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearHintRedDot_nxHintRedPointMode, 0);
        this.mPointNumber = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearHintRedDot_nxHintRedPointNum, 0);
        int i2 = R$styleable.NearHintRedDot_nxHintRedPointText;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            setPointText(String.valueOf(typedArrayObtainStyledAttributes.getString(i2)));
        }
        Intrinsics.checkNotNullExpressionValue(NearHintRedDot, "NearHintRedDot");
        eicVar.b(context, attributeSet, NearHintRedDot, i, 0);
        this.mRedDotDescription = getResources().getString(R$string.nx_red_dot_description);
        this.mRedDotWithNumberDescriptionId = R$plurals.nx_red_dot_with_number_description;
        Drawable drawable = context.getResources().getDrawable(R$drawable.nx_red_dot_stroke_circle);
        this.mStrokeBackground = drawable;
        if (this.mPointMode == 4) {
            setBackground(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mRectF = new RectF();
        this._$_findViewCache = new LinkedHashMap();
    }

    public final void measuredDimension(int width, int height, int textSize, int radius) {
        this.redDotWidth = width;
        this.redDotHeight = height;
        measuredDimension(textSize, radius);
    }

    public /* synthetic */ NearHintRedDot(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearHintRedDotStyle : i);
    }
}
