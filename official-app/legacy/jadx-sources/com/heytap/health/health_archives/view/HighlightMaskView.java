package com.heytap.health.health_archives.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.health_archives.R$color;
import com.heytap.health.health_archives.R$drawable;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.view.HighlightMaskView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.j8k;
import com.oplus.aiunit.vision.si2;
import com.oplus.aiunit.vision.wm2;
import com.oplus.aiunit.vision.xu5;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Q2\u00020\u0001:\u0002RSB'\b\u0007\u0012\u0006\u0010K\u001a\u00020J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L\u0012\b\b\u0002\u0010N\u001a\u00020%¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u001e\u0010\u0016\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0014R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010;\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010=R*\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010D¨\u0006T"}, d2 = {"Lcom/heytap/health/health_archives/view/HighlightMaskView;", "Landroid/widget/FrameLayout;", "", "r", "Lcom/heytap/health/health_archives/view/HighlightMaskView$b;", "highlightConfig", LogFieldKey.MESSAGE_KEY, "t", "", "from", TypedValues.TransitionType.S_TO, "Lkotlin/Function0;", "onEnd", "v", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "highlightConfigList", "", "fadeIn", "o", LogFieldKey.LEVEL_KEY, "onDetachedFromWindow", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "maskPaint", "j", "clearPaint", "Lcom/heytap/health/base/resposiveui/config/NearUIConfig$Status;", "Lcom/heytap/health/base/resposiveui/config/NearUIConfig$Status;", "mScreenStatus", "", "Ljava/util/List;", "mHighlightConfigList", "", "I", "mCurrentHighlightIndex", "Landroid/graphics/RectF;", "n", "Landroid/graphics/RectF;", "cutoutRect", "drawRect", LogFieldKey.PROCESS_NAME_KEY, "Z", "isCircleShape", "q", UserInfo.SEX_FEMALE, "cutoutCornerRadius", "animationDuration", "Landroid/animation/ValueAnimator;", "s", "Landroid/animation/ValueAnimator;", "fadeAnimator", "currentAlpha", "u", "Landroid/widget/FrameLayout;", "skipButton", "Lcom/oplus/aiunit/vision/wm2;", "Lcom/oplus/aiunit/vision/wm2;", "mCOUIToolsTips", "w", "Lkotlin/jvm/functions/Function0;", "getOnDismissListener", "()Lkotlin/jvm/functions/Function0;", "setOnDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "onDismissListener", "x", "getOnSkipClickListener", "setOnSkipClickListener", "onSkipClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class HighlightMaskView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint maskPaint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint clearPaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public NearUIConfig.Status mScreenStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<HighlightConfig> mHighlightConfigList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mCurrentHighlightIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public RectF cutoutRect;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final RectF drawRect;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isCircleShape;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float cutoutCornerRadius;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int animationDuration;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator fadeAnimator;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float currentAlpha;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final FrameLayout skipButton;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public wm2 mCOUIToolsTips;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onDismissListener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onSkipClickListener;

    /* JADX INFO: renamed from: com.heytap.health.health_archives.view.HighlightMaskView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "status", "Lcom/heytap/health/base/resposiveui/config/NearUIConfig$Status;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends Lambda implements Function1<NearUIConfig.Status, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(HighlightMaskView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m((HighlightConfig) this$0.mHighlightConfigList.get(this$0.mCurrentHighlightIndex));
        }

        @Override // p010kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NearUIConfig.Status status) {
            invoke2(status);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NearUIConfig.Status status) {
            if (HighlightMaskView.this.getVisibility() == 8 || status == HighlightMaskView.this.mScreenStatus) {
                return;
            }
            HighlightMaskView highlightMaskView = HighlightMaskView.this;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            highlightMaskView.mScreenStatus = status;
            final HighlightMaskView highlightMaskView2 = HighlightMaskView.this;
            highlightMaskView2.postDelayed(new Runnable() { // from class: com.heytap.health.health_archives.view.b
                @Override // java.lang.Runnable
                public final void run() {
                    HighlightMaskView.AnonymousClass1.invoke$lambda$0(highlightMaskView2);
                }
            }, 300L);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/health_archives/view/HighlightMaskView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_END, "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> i;

        public d(Function0<Unit> function0) {
            this.i = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Function0<Unit> function0 = this.i;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HighlightMaskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void n(View targetView, HighlightMaskView this$0, HighlightConfig highlightConfig) {
        Intrinsics.checkNotNullParameter(targetView, "$targetView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(highlightConfig, "$highlightConfig");
        if (!targetView.isAttachedToWindow()) {
            a7b.m("HighlightMaskView", "Target view detached during layout");
            return;
        }
        int[] iArr = new int[2];
        targetView.getLocationInWindow(iArr);
        float fA = xu5.a(this$0.getContext(), highlightConfig.getShadowOffset());
        float fA2 = xu5.a(this$0.getContext(), highlightConfig.getStrokeWidth()) / 8.0f;
        int i = iArr[0];
        this$0.cutoutRect.set((i + fA) - fA2, (iArr[1] + fA) - fA2, ((i + targetView.getWidth()) - fA) + fA2, ((iArr[1] + targetView.getHeight()) - fA) + fA2);
        this$0.invalidate();
        this$0.t(highlightConfig);
    }

    public static /* synthetic */ void p(HighlightMaskView highlightMaskView, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        highlightMaskView.o(list, z);
    }

    public static final void q(HighlightMaskView this$0, List highlightConfigList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(highlightConfigList, "$highlightConfigList");
        this$0.m((HighlightConfig) CollectionsKt___CollectionsKt.first(highlightConfigList));
    }

    public static final void s(HighlightMaskView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onSkipClickListener;
        if (function0 != null) {
            function0.invoke();
        }
        this$0.l();
        j8k.m(this$0.mCurrentHighlightIndex + 1, 2);
    }

    public static final void u(final HighlightMaskView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.mCurrentHighlightIndex + 1;
        this$0.mCurrentHighlightIndex = i;
        if (i < this$0.mHighlightConfigList.size()) {
            final HighlightConfig highlightConfig = this$0.mHighlightConfigList.get(this$0.mCurrentHighlightIndex);
            if (highlightConfig.a() != null) {
                Function1<Function0<Unit>, Unit> function1A = highlightConfig.a();
                if (function1A != null) {
                    function1A.invoke(new Function0<Unit>() { // from class: com.heytap.health.health_archives.view.HighlightMaskView$showInstructions$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.m(highlightConfig);
                        }
                    });
                }
            } else {
                this$0.m(highlightConfig);
            }
        } else {
            this$0.l();
        }
        j8k.m(this$0.mCurrentHighlightIndex, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void w(HighlightMaskView highlightMaskView, float f, float f2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        highlightMaskView.v(f, f2, function0);
    }

    public static final void x(HighlightMaskView this$0, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.currentAlpha = ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    @Nullable
    public final Function0<Unit> getOnDismissListener() {
        return this.onDismissListener;
    }

    @Nullable
    public final Function0<Unit> getOnSkipClickListener() {
        return this.onSkipClickListener;
    }

    public final void k() {
        ValueAnimator valueAnimator = this.fadeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.fadeAnimator = null;
    }

    public final void l() {
        k();
        wm2 wm2Var = this.mCOUIToolsTips;
        if (wm2Var != null) {
            wm2Var.D();
        }
        this.mHighlightConfigList.clear();
        setVisibility(8);
        this.currentAlpha = 0.0f;
        Function0<Unit> function0 = this.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void m(final HighlightConfig highlightConfig) {
        final View targetView = highlightConfig.getTargetView();
        float radius = highlightConfig.getRadius();
        if (!targetView.isAttachedToWindow()) {
            a7b.m("HighlightMaskView", "Target view is not attached to window");
            return;
        }
        this.cutoutCornerRadius = radius;
        this.isCircleShape = highlightConfig.getIsCircle();
        targetView.post(new Runnable() { // from class: com.oplus.aiunit.vision.p99
            @Override // java.lang.Runnable
            public final void run() {
                HighlightMaskView.n(targetView, this, highlightConfig);
            }
        });
    }

    public final void o(@NotNull final List<HighlightConfig> highlightConfigList, boolean fadeIn) {
        Intrinsics.checkNotNullParameter(highlightConfigList, "highlightConfigList");
        if (highlightConfigList.isEmpty()) {
            a7b.m("HighlightMaskView", "Target view is empty");
            return;
        }
        this.mHighlightConfigList.clear();
        this.mHighlightConfigList.addAll(highlightConfigList);
        if (!fadeIn) {
            setVisibility(0);
            this.currentAlpha = 1.0f;
            invalidate();
        } else {
            if (getVisibility() == 0 && this.currentAlpha > 0.0f) {
                return;
            }
            setVisibility(0);
            w(this, 0.0f, 1.0f, null, 4, null);
        }
        ((HighlightConfig) CollectionsKt___CollectionsKt.first((List) highlightConfigList)).getTargetView().postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.n99
            @Override // java.lang.Runnable
            public final void run() {
                HighlightMaskView.q(this.i, highlightConfigList);
            }
        }, 300L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        this.maskPaint.setColor(getContext().getColor(R$color.health_archives_50_black));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.maskPaint);
        if (this.cutoutRect.isEmpty()) {
            return;
        }
        if (this.isCircleShape) {
            canvas.drawCircle(this.cutoutRect.centerX(), this.cutoutRect.centerY(), Math.min(this.cutoutRect.width(), this.cutoutRect.height()) / 2.0f, this.clearPaint);
        } else {
            this.drawRect.set(this.cutoutRect);
            RectF rectF = this.drawRect;
            if (rectF.left < this.cutoutCornerRadius) {
                rectF.left = 0.0f;
            }
            if (rectF.right > getWidth() - this.cutoutCornerRadius) {
                this.drawRect.right = getWidth();
            }
            RectF rectF2 = this.drawRect;
            if (rectF2.top < this.cutoutCornerRadius) {
                rectF2.top = 0.0f;
            }
            if (rectF2.bottom > getHeight() - this.cutoutCornerRadius) {
                this.drawRect.bottom = getHeight();
            }
            RectF rectF3 = this.drawRect;
            float f = this.cutoutCornerRadius;
            canvas.drawRoundRect(rectF3, f, f, this.clearPaint);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public final void r() {
        ViewGroup.LayoutParams layoutParams = this.skipButton.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, xu5.a(getContext(), 50.0f), xu5.a(getContext(), 16.0f), 0);
        this.skipButton.setLayoutParams(layoutParams2);
        this.skipButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o99
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HighlightMaskView.s(this.i, view);
            }
        });
    }

    public final void setOnDismissListener(@Nullable Function0<Unit> function0) {
        this.onDismissListener = function0;
    }

    public final void setOnSkipClickListener(@Nullable Function0<Unit> function0) {
        this.onSkipClickListener = function0;
    }

    public final void t(HighlightConfig highlightConfig) {
        wm2 wm2Var;
        Spannable tips = highlightConfig.getTips();
        ForegroundColorSpan[] spans = (ForegroundColorSpan[]) tips.getSpans(0, tips.length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "spans");
        for (ForegroundColorSpan foregroundColorSpan : spans) {
            int spanStart = tips.getSpanStart(foregroundColorSpan);
            int spanEnd = tips.getSpanEnd(foregroundColorSpan);
            int spanFlags = tips.getSpanFlags(foregroundColorSpan);
            tips.removeSpan(foregroundColorSpan);
            tips.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.health_archives_90_black)), spanStart, spanEnd, spanFlags);
        }
        si2 si2VarJ = new si2.b().n(highlightConfig.getTitle()).k(R$drawable.health_archives_instruction_icon).l(tips).m(getContext().getString(R$string.health_archives_message_know)).j();
        wm2 wm2Var2 = this.mCOUIToolsTips;
        if ((wm2Var2 != null && wm2Var2.isShowing()) && (wm2Var = this.mCOUIToolsTips) != null) {
            wm2Var.D();
        }
        wm2 wm2Var3 = new wm2(getContext(), si2VarJ);
        TextView textViewI = si2VarJ.i();
        if (textViewI != null) {
            textViewI.setForceDarkAllowed(false);
        }
        wm2Var3.U(false);
        wm2Var3.setOnCloseIconClickListener(new wm2.h() { // from class: com.oplus.aiunit.vision.r99
            @Override // com.oplus.aiunit.vision.wm2.h
            public final void onCloseIconClick() {
                HighlightMaskView.u(this.a);
            }
        });
        wm2Var3.b0(highlightConfig.getTargetView(), highlightConfig.getTipsPosition(), true);
        this.mCOUIToolsTips = wm2Var3;
        j8k.n(this.mCurrentHighlightIndex + 1);
    }

    public final void v(float from, float to, Function0<Unit> onEnd) {
        k();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(from, to);
        valueAnimatorOfFloat.setDuration(this.animationDuration);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.q99
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HighlightMaskView.x(this.i, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new d(onEnd));
        valueAnimatorOfFloat.start();
        this.fadeAnimator = valueAnimatorOfFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HighlightMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HighlightMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HighlightMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.maskPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setDither(true);
        this.clearPaint = paint2;
        this.mScreenStatus = NearUIConfig.Status.UNKNOWN;
        this.mHighlightConfigList = new ArrayList();
        this.cutoutRect = new RectF();
        this.drawRect = new RectF();
        this.cutoutCornerRadius = xu5.a(context, 12.0f);
        this.animationDuration = 100;
        setWillNotDraw(false);
        setLayerType(2, null);
        setVisibility(8);
        this.currentAlpha = 0.0f;
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context).inflate(R$layout.health_archives_highlight_mask_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.btn_skip_guide);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.btn_skip_guide)");
        this.skipButton = (FrameLayout) viewFindViewById;
        r();
        NearUIConfig.Status value = com.heytap.health.base.resposiveui.config.a.m(context).q().getValue();
        this.mScreenStatus = value == null ? NearUIConfig.Status.FOLD : value;
        com.heytap.health.base.resposiveui.config.a.m(context).q().observe((LifecycleOwner) context, new c(new AnonymousClass1()));
    }

    /* JADX INFO: renamed from: com.heytap.health.health_archives.view.HighlightMaskView$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B|\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u001f\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0011\u0012\b\b\u0002\u00104\u001a\u00020\u0007\u0012\b\b\u0002\u00106\u001a\u00020\u0011\u0012+\b\u0002\u0010A\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020908¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u000209\u0018\u000107¢\u0006\u0004\bB\u0010CJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010.\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b-\u0010\u0016R\"\u00104\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00106\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b \u0010\u0014\"\u0004\b5\u0010\u0016RE\u0010A\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020908¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u000209\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010=\u001a\u0004\b\n\u0010>\"\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/heytap/health/health_archives/view/HighlightMaskView$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/view/View;", "a", "Landroid/view/View;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/view/View;", MapSchema.FIELD_NAME_KEY, "(Landroid/view/View;)V", "targetView", "", "b", UserInfo.SEX_FEMALE, "()F", "setRadius", "(F)V", "radius", "c", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Landroid/text/Spannable;", "d", "Landroid/text/Spannable;", "f", "()Landroid/text/Spannable;", "setTips", "(Landroid/text/Spannable;)V", "tips", "I", b2n.f, "()I", "setTipsPosition", "(I)V", "tipsPosition", "setShadowOffset", "shadowOffset", "Z", "i", "()Z", "setCircle", "(Z)V", "isCircle", "setStrokeWidth", "strokeWidth", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "onComplete", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "j", "(Lkotlin/jvm/functions/Function1;)V", "onBeforeHighlight", "<init>", "(Landroid/view/View;FLjava/lang/String;Landroid/text/Spannable;IFZFLkotlin/jvm/functions/Function1;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class HighlightConfig {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public View targetView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public float radius;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public Spannable tips;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public int tipsPosition;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public float shadowOffset;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public boolean isCircle;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public float strokeWidth;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public Function1<? super Function0<Unit>, Unit> onBeforeHighlight;

        public HighlightConfig(@NotNull View targetView, float f, @NotNull String title, @NotNull Spannable tips, int i, float f2, boolean z, float f3, @Nullable Function1<? super Function0<Unit>, Unit> function1) {
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tips, "tips");
            this.targetView = targetView;
            this.radius = f;
            this.title = title;
            this.tips = tips;
            this.tipsPosition = i;
            this.shadowOffset = f2;
            this.isCircle = z;
            this.strokeWidth = f3;
            this.onBeforeHighlight = function1;
        }

        @Nullable
        public final Function1<Function0<Unit>, Unit> a() {
            return this.onBeforeHighlight;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getShadowOffset() {
            return this.shadowOffset;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final View getTargetView() {
            return this.targetView;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightConfig)) {
                return false;
            }
            HighlightConfig highlightConfig = (HighlightConfig) other;
            return Intrinsics.areEqual(this.targetView, highlightConfig.targetView) && Float.compare(this.radius, highlightConfig.radius) == 0 && Intrinsics.areEqual(this.title, highlightConfig.title) && Intrinsics.areEqual(this.tips, highlightConfig.tips) && this.tipsPosition == highlightConfig.tipsPosition && Float.compare(this.shadowOffset, highlightConfig.shadowOffset) == 0 && this.isCircle == highlightConfig.isCircle && Float.compare(this.strokeWidth, highlightConfig.strokeWidth) == 0 && Intrinsics.areEqual(this.onBeforeHighlight, highlightConfig.onBeforeHighlight);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Spannable getTips() {
            return this.tips;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getTipsPosition() {
            return this.tipsPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        public int hashCode() {
            int iHashCode = ((((((((((this.targetView.hashCode() * 31) + Float.hashCode(this.radius)) * 31) + this.title.hashCode()) * 31) + this.tips.hashCode()) * 31) + Integer.hashCode(this.tipsPosition)) * 31) + Float.hashCode(this.shadowOffset)) * 31;
            boolean z = this.isCircle;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int iHashCode2 = (((iHashCode + r1) * 31) + Float.hashCode(this.strokeWidth)) * 31;
            Function1<? super Function0<Unit>, Unit> function1 = this.onBeforeHighlight;
            return iHashCode2 + (function1 == null ? 0 : function1.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsCircle() {
            return this.isCircle;
        }

        public final void j(@Nullable Function1<? super Function0<Unit>, Unit> function1) {
            this.onBeforeHighlight = function1;
        }

        public final void k(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.targetView = view;
        }

        @NotNull
        public String toString() {
            View view = this.targetView;
            float f = this.radius;
            String str = this.title;
            Spannable spannable = this.tips;
            return "HighlightConfig(targetView=" + view + ", radius=" + f + ", title=" + str + ", tips=" + ((Object) spannable) + ", tipsPosition=" + this.tipsPosition + ", shadowOffset=" + this.shadowOffset + ", isCircle=" + this.isCircle + ", strokeWidth=" + this.strokeWidth + ", onBeforeHighlight=" + this.onBeforeHighlight + ")";
        }

        public /* synthetic */ HighlightConfig(View view, float f, String str, Spannable spannable, int i, float f2, boolean z, float f3, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, f, str, spannable, (i2 & 16) != 0 ? 128 : i, (i2 & 32) != 0 ? 0.0f : f2, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? 0.0f : f3, (i2 & 256) != 0 ? null : function1);
        }
    }
}
