package com.coui.appcompat.scanview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.coui.appcompat.scanview.PressFeedbackHelper;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0002\u0011\nB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/coui/appcompat/scanview/PressFeedbackHelper;", "", "", "isPressed", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "onAnimEnd", "c", "b", "", "scaleValue", b2n.f, "Lcom/coui/appcompat/scanview/PressFeedbackHelper$b;", "f", "Landroid/view/animation/PathInterpolator;", "a", "Landroid/view/animation/PathInterpolator;", "downPathInterpolator", "upPathInterpolator", "Landroid/animation/ObjectAnimator;", "Landroid/animation/ObjectAnimator;", "scaleAnimator", "d", UserInfo.SEX_FEMALE, "currentScale", MapSchema.FIELD_NAME_ENTRY, "Z", "isNeedToDelayCancelScaleAnim", "<init>", "()V", "Companion", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPressFeedbackHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressFeedbackHelper.kt\ncom/coui/appcompat/scanview/PressFeedbackHelper\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,168:1\n31#2:169\n94#2,14:170\n*S KotlinDebug\n*F\n+ 1 PressFeedbackHelper.kt\ncom/coui/appcompat/scanview/PressFeedbackHelper\n*L\n72#1:169\n72#1:170,14\n*E\n"})
public final class PressFeedbackHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long DOWN_ANIMATION_TIME = 200;
    public static final long UP_ANIMATION_TIME = 340;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PathInterpolator downPathInterpolator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PathInterpolator upPathInterpolator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ObjectAnimator scaleAnimator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float currentScale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isNeedToDelayCancelScaleAnim;

    /* JADX INFO: renamed from: com.coui.appcompat.scanview.PressFeedbackHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/coui/appcompat/scanview/PressFeedbackHelper$a;", "", "Landroid/view/animation/PathInterpolator;", "b", "a", "", "ANIM_DOWN_PATH_X1", UserInfo.SEX_FEMALE, "ANIM_DOWN_PATH_X2", "ANIM_DOWN_PATH_Y1", "ANIM_DOWN_PATH_Y2", "ANIM_UP_PATH_X1", "ANIM_UP_PATH_X2", "ANIM_UP_PATH_Y1", "ANIM_UP_PATH_Y2", "", "DOWN_ANIMATION_TIME", "J", "SCALE_ANIM_VALUE_MAX", "SCALE_ANIM_VALUE_MIN", "SCALE_INIT_VALUE", "UP_ANIMATION_TIME", "<init>", "()V", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PathInterpolator a() {
            return new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
        }

        @NotNull
        public final PathInterpolator b() {
            return new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.coui.appcompat.scanview.PressFeedbackHelper$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\n\u0010\u001c¨\u0006 "}, d2 = {"Lcom/coui/appcompat/scanview/PressFeedbackHelper$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "d", "()F", "scaleXStart", "b", "c", "scaleXEnd", "f", "scaleYStart", MapSchema.FIELD_NAME_ENTRY, "scaleYEnd", "Landroid/view/animation/PathInterpolator;", "Landroid/view/animation/PathInterpolator;", "()Landroid/view/animation/PathInterpolator;", ParserTag.TAG_INTERPOLATOR, "", "J", "()J", "duration", "<init>", "(FFFFLandroid/view/animation/PathInterpolator;J)V", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ScaleAnimParam {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final float scaleXStart;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float scaleXEnd;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final float scaleYStart;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final float scaleYEnd;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PathInterpolator interpolator;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final long duration;

        public ScaleAnimParam(float f, float f2, float f3, float f4, @NotNull PathInterpolator interpolator, long j2) {
            Intrinsics.checkNotNullParameter(interpolator, "interpolator");
            this.scaleXStart = f;
            this.scaleXEnd = f2;
            this.scaleYStart = f3;
            this.scaleYEnd = f4;
            this.interpolator = interpolator;
            this.duration = j2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final PathInterpolator getInterpolator() {
            return this.interpolator;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getScaleXEnd() {
            return this.scaleXEnd;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getScaleXStart() {
            return this.scaleXStart;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getScaleYEnd() {
            return this.scaleYEnd;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScaleAnimParam)) {
                return false;
            }
            ScaleAnimParam scaleAnimParam = (ScaleAnimParam) other;
            return Float.compare(this.scaleXStart, scaleAnimParam.scaleXStart) == 0 && Float.compare(this.scaleXEnd, scaleAnimParam.scaleXEnd) == 0 && Float.compare(this.scaleYStart, scaleAnimParam.scaleYStart) == 0 && Float.compare(this.scaleYEnd, scaleAnimParam.scaleYEnd) == 0 && Intrinsics.areEqual(this.interpolator, scaleAnimParam.interpolator) && this.duration == scaleAnimParam.duration;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getScaleYStart() {
            return this.scaleYStart;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.scaleXStart) * 31) + Float.hashCode(this.scaleXEnd)) * 31) + Float.hashCode(this.scaleYStart)) * 31) + Float.hashCode(this.scaleYEnd)) * 31) + this.interpolator.hashCode()) * 31) + Long.hashCode(this.duration);
        }

        @NotNull
        public String toString() {
            return "ScaleAnimParam(scaleXStart=" + this.scaleXStart + ", scaleXEnd=" + this.scaleXEnd + ", scaleYStart=" + this.scaleYStart + ", scaleYEnd=" + this.scaleYEnd + ", interpolator=" + this.interpolator + ", duration=" + this.duration + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_START, "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 PressFeedbackHelper.kt\ncom/coui/appcompat/scanview/PressFeedbackHelper\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,127:1\n98#2:128\n72#3:129\n97#4:130\n96#5:131\n*E\n"})
    public static final class c implements Animator.AnimatorListener {
        public final /* synthetic */ Function0 i;

        public c(Function0 function0) {
            this.i = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.i.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    public PressFeedbackHelper() {
        Companion companion = INSTANCE;
        this.downPathInterpolator = companion.a();
        this.upPathInterpolator = companion.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(PressFeedbackHelper pressFeedbackHelper, boolean z, View view, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.coui.appcompat.scanview.PressFeedbackHelper$executeScaleAnimator$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        pressFeedbackHelper.c(z, view, function0);
    }

    public static final void e(PressFeedbackHelper this$0, boolean z, View view, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue("scaleX");
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.currentScale = ((Float) animatedValue).floatValue();
        if (!this$0.isNeedToDelayCancelScaleAnim || !z || animator.getCurrentPlayTime() <= animator.getDuration() * 0.4f) {
            this$0.g(this$0.currentScale, view);
        } else {
            animator.cancel();
            d(this$0, false, view, null, 4, null);
        }
    }

    public final void b(boolean isPressed) {
        ObjectAnimator objectAnimator = this.scaleAnimator;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        boolean z = !isPressed && ((float) objectAnimator.getCurrentPlayTime()) < ((float) objectAnimator.getDuration()) * 0.4f;
        this.isNeedToDelayCancelScaleAnim = z;
        if (z) {
            return;
        }
        objectAnimator.cancel();
    }

    public final void c(final boolean isPressed, @NotNull final View view, @NotNull Function0<Unit> onAnimEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAnimEnd, "onAnimEnd");
        this.isNeedToDelayCancelScaleAnim = false;
        b(isPressed);
        if (this.isNeedToDelayCancelScaleAnim) {
            return;
        }
        ScaleAnimParam scaleAnimParamF = f(isPressed);
        ObjectAnimator executeScaleAnimator$lambda$2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleAnimParamF.getScaleXStart(), scaleAnimParamF.getScaleXEnd()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, scaleAnimParamF.getScaleYStart(), scaleAnimParamF.getScaleYEnd()));
        this.scaleAnimator = executeScaleAnimator$lambda$2;
        executeScaleAnimator$lambda$2.setInterpolator(scaleAnimParamF.getInterpolator());
        executeScaleAnimator$lambda$2.setDuration(scaleAnimParamF.getDuration());
        executeScaleAnimator$lambda$2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.bte
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PressFeedbackHelper.e(this.i, isPressed, view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(executeScaleAnimator$lambda$2, "executeScaleAnimator$lambda$2");
        executeScaleAnimator$lambda$2.addListener(new c(onAnimEnd));
        executeScaleAnimator$lambda$2.start();
    }

    public final ScaleAnimParam f(boolean isPressed) {
        if (isPressed) {
            return new ScaleAnimParam(1.0f, 0.92f, 1.0f, 0.92f, this.downPathInterpolator, 200L);
        }
        float f = this.currentScale;
        return new ScaleAnimParam(f, 1.0f, f, 1.0f, this.upPathInterpolator, 340L);
    }

    public final void g(float scaleValue, View view) {
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0.92f, RangesKt___RangesKt.coerceAtMost(1.0f, scaleValue));
        view.setScaleX(fCoerceAtLeast);
        view.setScaleY(fCoerceAtLeast);
        view.invalidate();
    }
}
