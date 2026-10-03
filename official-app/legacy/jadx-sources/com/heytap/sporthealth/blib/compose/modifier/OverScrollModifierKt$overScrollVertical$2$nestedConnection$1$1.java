package com.heytap.sporthealth.blib.compose.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 implements NestedScrollConnection {
    public final float i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Animatable<Float, AnimationVector1D> f7718j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7719l;
    public final /* synthetic */ MutableState<Float> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f7720n;
    public final /* synthetic */ Function1<Float, Unit> o;
    public final /* synthetic */ NestedScrollDispatcher p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Function2<Float, Float, Float> r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;

    /* JADX WARN: Multi-variable type inference failed */
    public OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1(MutableState<Float> mutableState, Function1<? super Float, Unit> function1, Function1<? super Float, Unit> function2, NestedScrollDispatcher nestedScrollDispatcher, boolean z, Function2<? super Float, ? super Float, Float> function3, float f, float f2) {
        this.m = mutableState;
        this.f7720n = function1;
        this.o = function2;
        this.p = nestedScrollDispatcher;
        this.q = z;
        this.r = function3;
        this.s = f;
        this.t = f2;
        this.k = OverScrollModifierKt$overScrollVertical$2.invoke$lambda$3(mutableState);
    }

    @NotNull
    public final Animatable<Float, AnimationVector1D> a() {
        Animatable<Float, AnimationVector1D> animatable = this.f7718j;
        if (animatable != null) {
            return animatable;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastFlingAnimator");
        return null;
    }

    public final float b() {
        return this.k;
    }

    public final void c(@NotNull Animatable<Float, AnimationVector1D> animatable) {
        Intrinsics.checkNotNullParameter(animatable, "<set-?>");
        this.f7718j = animatable;
    }

    public final void d(float f) {
        this.k = f;
        OverScrollModifierKt$overScrollVertical$2.invoke$lambda$4(this.m, f);
        Function1<Float, Unit> function1 = this.f7720n;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
    }

    public final void e(float f) {
        this.f7719l = f;
        Function1<Float, Unit> function1 = this.o;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo319onPostFlingRZ2iAVY(long j2, long j3, @NotNull Continuation<? super Velocity> continuation) {
        OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1;
        long jM4332minusAH228Gc;
        long j4;
        long j5;
        long j6;
        final OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 = this;
        if (continuation instanceof OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1) {
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1 = (OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1) continuation;
            int i = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1 = new OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1(this, continuation);
            }
        } else {
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1 = new OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1(this, continuation);
        }
        OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$1;
        Object objM2901dispatchPostFlingRZ2iAVY = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j5 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$1;
                j4 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$0;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 = (OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1) overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.L$0;
                ResultKt.throwOnFailure(objM2901dispatchPostFlingRZ2iAVY);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$0;
                ResultKt.throwOnFailure(objM2901dispatchPostFlingRZ2iAVY);
            }
            float fFloatValue = ((Number) ((AnimationResult) objM2901dispatchPostFlingRZ2iAVY).getEndState().getVelocity()).floatValue();
            String strM4336toStringimpl = Velocity.m4336toStringimpl(j6);
            float fM4330getYimpl = Velocity.m4330getYimpl(j6) - fFloatValue;
            StringBuilder sb = new StringBuilder();
            sb.append("onPostFling available=");
            sb.append(strM4336toStringimpl);
            sb.append("; offsetY=");
            sb.append(fM4330getYimpl);
            return Velocity.m4320boximpl(VelocityKt.Velocity(0.0f, Velocity.m4330getYimpl(j6) - fFloatValue));
        }
        ResultKt.throwOnFailure(objM2901dispatchPostFlingRZ2iAVY);
        if (overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.q) {
            NestedScrollDispatcher nestedScrollDispatcher = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.p;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.L$0 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$0 = j3;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$1 = j3;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.label = 1;
            objM2901dispatchPostFlingRZ2iAVY = nestedScrollDispatcher.m2901dispatchPostFlingRZ2iAVY(j2, j3, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2);
            if (objM2901dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            j5 = j3;
            j4 = j5;
        } else {
            jM4332minusAH228Gc = j3;
            j4 = jM4332minusAH228Gc;
        }
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.c(AnimatableKt.Animatable$default(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k, 0.0f, 2, null));
        Animatable<Float, AnimationVector1D> animatableA = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.a();
        Float fBoxFloat = Boxing.boxFloat(0.0f);
        SpringSpec springSpecSpring = AnimationSpecKt.spring(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.s, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.t, Boxing.boxFloat(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.i));
        Float fBoxFloat2 = Boxing.boxFloat(Velocity.m4330getYimpl(jM4332minusAH228Gc) * 0.6f);
        final Function2<Float, Float, Float> function2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.r;
        Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$leftVelocity$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2 = this.this$0;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.d(function2.invoke(Float.valueOf(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.b()), Float.valueOf(animateTo.getValue().floatValue() - this.this$0.b())).floatValue());
            }
        };
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.L$0 = null;
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$0 = j4;
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.label = 2;
        objM2901dispatchPostFlingRZ2iAVY = animatableA.animateTo(fBoxFloat, springSpecSpring, fBoxFloat2, function1, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2);
        if (objM2901dispatchPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        j6 = j4;
        float fFloatValue2 = ((Number) ((AnimationResult) objM2901dispatchPostFlingRZ2iAVY).getEndState().getVelocity()).floatValue();
        String strM4336toStringimpl2 = Velocity.m4336toStringimpl(j6);
        float fM4330getYimpl2 = Velocity.m4330getYimpl(j6) - fFloatValue2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPostFling available=");
        sb2.append(strM4336toStringimpl2);
        sb2.append("; offsetY=");
        sb2.append(fM4330getYimpl2);
        return Velocity.m4320boximpl(VelocityKt.Velocity(0.0f, Velocity.m4330getYimpl(j6) - fFloatValue2));
        jM4332minusAH228Gc = Velocity.m4332minusAH228Gc(j5, ((Velocity) objM2901dispatchPostFlingRZ2iAVY).getPackedValue());
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.c(AnimatableKt.Animatable$default(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k, 0.0f, 2, null));
        Animatable<Float, AnimationVector1D> animatableA2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.a();
        Float fBoxFloat3 = Boxing.boxFloat(0.0f);
        SpringSpec springSpecSpring2 = AnimationSpecKt.spring(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.s, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.t, Boxing.boxFloat(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.i));
        Float fBoxFloat4 = Boxing.boxFloat(Velocity.m4330getYimpl(jM4332minusAH228Gc) * 0.6f);
        final Function2<? super Float, ? super Float, Float> function3 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.r;
        Function1<Animatable<Float, AnimationVector1D>, Unit> function4 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$leftVelocity$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2 = this.this$0;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.d(function3.invoke(Float.valueOf(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.b()), Float.valueOf(animateTo.getValue().floatValue() - this.this$0.b())).floatValue());
            }
        };
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.L$0 = null;
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.J$0 = j4;
        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2.label = 2;
        objM2901dispatchPostFlingRZ2iAVY = animatableA2.animateTo(fBoxFloat3, springSpecSpring2, fBoxFloat4, function4, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPostFling$2);
        if (objM2901dispatchPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        j6 = j4;
        float fFloatValue3 = ((Number) ((AnimationResult) objM2901dispatchPostFlingRZ2iAVY).getEndState().getVelocity()).floatValue();
        String strM4336toStringimpl3 = Velocity.m4336toStringimpl(j6);
        float fM4330getYimpl3 = Velocity.m4330getYimpl(j6) - fFloatValue3;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onPostFling available=");
        sb3.append(strM4336toStringimpl3);
        sb3.append("; offsetY=");
        sb3.append(fM4330getYimpl3);
        return Velocity.m4320boximpl(VelocityKt.Velocity(0.0f, Velocity.m4330getYimpl(j6) - fFloatValue3));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo320onPostScrollDzOQY0M(long j2, long j3, int i) {
        long jM1384minusMKHz9U = this.q ? Offset.m1384minusMKHz9U(j3, this.p.m2902dispatchPostScrollDzOQY0M(j2, j3, i)) : j3;
        e(this.f7719l + Offset.m1381getYimpl(j2));
        NestedScrollSource.Companion companion = NestedScrollSource.INSTANCE;
        if (NestedScrollSource.m2908equalsimpl0(i, companion.m2914getFlingWNlRxjI())) {
            d(this.k + Offset.m1381getYimpl(jM1384minusMKHz9U));
        } else {
            d(this.r.invoke(Float.valueOf(this.k), Float.valueOf(Offset.m1381getYimpl(jM1384minusMKHz9U))).floatValue());
        }
        float fM1381getYimpl = NestedScrollSource.m2908equalsimpl0(i, companion.m2914getFlingWNlRxjI()) ? Offset.m1381getYimpl(j3) / 5 : Offset.m1381getYimpl(j3);
        String strM1388toStringimpl = Offset.m1388toStringimpl(j2);
        float f = this.f7719l;
        String strM1388toStringimpl2 = Offset.m1388toStringimpl(j3);
        float fM1381getYimpl2 = Offset.m1381getYimpl(j3);
        StringBuilder sb = new StringBuilder();
        sb.append("onPostScroll consumed=");
        sb.append(strM1388toStringimpl);
        sb.append("; totalOffsetY=");
        sb.append(f);
        sb.append("; available=");
        sb.append(strM1388toStringimpl2);
        sb.append("; offsetY=");
        sb.append(fM1381getYimpl2);
        return OffsetKt.Offset(0.0f, fM1381getYimpl);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo490onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
        OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1;
        long j3;
        long jM4340getZero9UxMQ8M;
        long jM4332minusAH228Gc;
        Ref.FloatRef floatRef;
        boolean z;
        Animatable<Float, AnimationVector1D> animatableAnimatable$default;
        float f;
        Object objAnimateTo;
        Ref.FloatRef floatRef2;
        long j4;
        long j5;
        Ref.FloatRef floatRef3;
        final OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 = this;
        if (continuation instanceof OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1) {
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1 = (OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1) continuation;
            int i = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1 = new OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1, continuation);
            }
        } else {
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1 = new OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1, continuation);
        }
        OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1;
        Object objM2903dispatchPreFlingQWom1Mo = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j3 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 = (OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1) overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0;
                ResultKt.throwOnFailure(objM2903dispatchPreFlingQWom1Mo);
            } else {
                if (i2 == 2) {
                    j3 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0;
                    overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 = (OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1) overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0;
                    ResultKt.throwOnFailure(objM2903dispatchPreFlingQWom1Mo);
                    jM4340getZero9UxMQ8M = ((Velocity) objM2903dispatchPreFlingQWom1Mo).getPackedValue();
                    jM4332minusAH228Gc = Velocity.m4332minusAH228Gc(j3, jM4340getZero9UxMQ8M);
                    floatRef = new Ref.FloatRef();
                    floatRef.element = Velocity.m4330getYimpl(jM4332minusAH228Gc);
                    if (Math.abs(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k) >= overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.i) {
                        if (Math.signum(Velocity.m4330getYimpl(jM4332minusAH228Gc)) == Math.signum(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            animatableAnimatable$default = AnimatableKt.Animatable$default(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k, 0.0f, 2, null);
                            f = floatRef.element;
                            if (f < 0.0f) {
                                Animatable.updateBounds$default(animatableAnimatable$default, Boxing.boxFloat(0.0f), null, 2, null);
                            } else if (f > 0.0f) {
                                Animatable.updateBounds$default(animatableAnimatable$default, null, Boxing.boxFloat(0.0f), 1, null);
                            }
                            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.c(animatableAnimatable$default);
                            Animatable<Float, AnimationVector1D> animatableA = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.a();
                            Float fBoxFloat = Boxing.boxFloat(0.0f);
                            SpringSpec springSpecSpring = AnimationSpecKt.spring(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.s, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.t, Boxing.boxFloat(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.i));
                            Float fBoxFloat2 = Boxing.boxFloat(floatRef.element * 0.6f);
                            final Function2<Float, Float, Float> function2 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.r;
                            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    invoke2(animatable);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2 = this.this$0;
                                    overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.d(function2.invoke(Float.valueOf(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.b()), Float.valueOf(animateTo.getValue().floatValue() - this.this$0.b())).floatValue());
                                }
                            };
                            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0 = floatRef;
                            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$1 = floatRef;
                            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0 = j3;
                            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$1 = jM4340getZero9UxMQ8M;
                            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.label = 3;
                            objAnimateTo = animatableA.animateTo(fBoxFloat, springSpecSpring, fBoxFloat2, function1, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2);
                            if (objAnimateTo == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            floatRef2 = floatRef;
                            j4 = j3;
                            j5 = jM4340getZero9UxMQ8M;
                            objM2903dispatchPreFlingQWom1Mo = objAnimateTo;
                            floatRef3 = floatRef2;
                        }
                    }
                    String strM4336toStringimpl = Velocity.m4336toStringimpl(j3);
                    float fM4330getYimpl = Velocity.m4330getYimpl(j3) - floatRef.element;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onPreFling available=");
                    sb.append(strM4336toStringimpl);
                    sb.append("; offsetY=");
                    sb.append(fM4330getYimpl);
                    return Velocity.m4320boximpl(VelocityKt.Velocity(Velocity.m4329getXimpl(jM4340getZero9UxMQ8M), Velocity.m4330getYimpl(j3) - floatRef.element));
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j5 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$1;
                j4 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0;
                floatRef3 = (Ref.FloatRef) overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$1;
                floatRef2 = (Ref.FloatRef) overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0;
                ResultKt.throwOnFailure(objM2903dispatchPreFlingQWom1Mo);
            }
            floatRef3.element = ((Number) ((AnimationResult) objM2903dispatchPreFlingQWom1Mo).getEndState().getVelocity()).floatValue();
            jM4340getZero9UxMQ8M = j5;
            j3 = j4;
            floatRef = floatRef2;
            String strM4336toStringimpl2 = Velocity.m4336toStringimpl(j3);
            float fM4330getYimpl2 = Velocity.m4330getYimpl(j3) - floatRef.element;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onPreFling available=");
            sb2.append(strM4336toStringimpl2);
            sb2.append("; offsetY=");
            sb2.append(fM4330getYimpl2);
            return Velocity.m4320boximpl(VelocityKt.Velocity(Velocity.m4329getXimpl(jM4340getZero9UxMQ8M), Velocity.m4330getYimpl(j3) - floatRef.element));
        }
        ResultKt.throwOnFailure(objM2903dispatchPreFlingQWom1Mo);
        if (overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.f7718j == null || !a().isRunning()) {
            j3 = j2;
        } else {
            Animatable<Float, AnimationVector1D> animatableA2 = a();
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1;
            j3 = j2;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0 = j3;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.label = 1;
            if (animatableA2.stop(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.q) {
            NestedScrollDispatcher nestedScrollDispatcher = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.p;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0 = j3;
            overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.label = 2;
            objM2903dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m2903dispatchPreFlingQWom1Mo(j3, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2);
            if (objM2903dispatchPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            jM4340getZero9UxMQ8M = ((Velocity) objM2903dispatchPreFlingQWom1Mo).getPackedValue();
        } else {
            jM4340getZero9UxMQ8M = Velocity.INSTANCE.m4340getZero9UxMQ8M();
        }
        jM4332minusAH228Gc = Velocity.m4332minusAH228Gc(j3, jM4340getZero9UxMQ8M);
        floatRef = new Ref.FloatRef();
        floatRef.element = Velocity.m4330getYimpl(jM4332minusAH228Gc);
        if (Math.abs(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k) >= overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.i) {
            if (Math.signum(Velocity.m4330getYimpl(jM4332minusAH228Gc)) == Math.signum(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                animatableAnimatable$default = AnimatableKt.Animatable$default(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.k, 0.0f, 2, null);
                f = floatRef.element;
                if (f < 0.0f) {
                    Animatable.updateBounds$default(animatableAnimatable$default, Boxing.boxFloat(0.0f), null, 2, null);
                } else if (f > 0.0f) {
                    Animatable.updateBounds$default(animatableAnimatable$default, null, Boxing.boxFloat(0.0f), 1, null);
                }
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.c(animatableAnimatable$default);
                Animatable<Float, AnimationVector1D> animatableA3 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.a();
                Float fBoxFloat3 = Boxing.boxFloat(0.0f);
                SpringSpec springSpecSpring2 = AnimationSpecKt.spring(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.s, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.t, Boxing.boxFloat(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.i));
                Float fBoxFloat4 = Boxing.boxFloat(floatRef.element * 0.6f);
                final Function2<? super Float, ? super Float, Float> function3 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1.r;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function4 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2 = this.this$0;
                        overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.d(function3.invoke(Float.valueOf(overScrollModifierKt$overScrollVertical$2$nestedConnection$1$2.b()), Float.valueOf(animateTo.getValue().floatValue() - this.this$0.b())).floatValue());
                    }
                };
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$0 = floatRef;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.L$1 = floatRef;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$0 = j3;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.J$1 = jM4340getZero9UxMQ8M;
                overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2.label = 3;
                objAnimateTo = animatableA3.animateTo(fBoxFloat3, springSpecSpring2, fBoxFloat4, function4, overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$2);
                if (objAnimateTo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef2 = floatRef;
                j4 = j3;
                j5 = jM4340getZero9UxMQ8M;
                objM2903dispatchPreFlingQWom1Mo = objAnimateTo;
                floatRef3 = floatRef2;
                floatRef3.element = ((Number) ((AnimationResult) objM2903dispatchPreFlingQWom1Mo).getEndState().getVelocity()).floatValue();
                jM4340getZero9UxMQ8M = j5;
                j3 = j4;
                floatRef = floatRef2;
            }
        }
        String strM4336toStringimpl3 = Velocity.m4336toStringimpl(j3);
        float fM4330getYimpl3 = Velocity.m4330getYimpl(j3) - floatRef.element;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onPreFling available=");
        sb3.append(strM4336toStringimpl3);
        sb3.append("; offsetY=");
        sb3.append(fM4330getYimpl3);
        return Velocity.m4320boximpl(VelocityKt.Velocity(Velocity.m4329getXimpl(jM4340getZero9UxMQ8M), Velocity.m4330getYimpl(j3) - floatRef.element));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo321onPreScrollOzD1aCk(long j2, int i) {
        if (this.f7718j != null && a().isRunning()) {
            BuildersKt__Builders_commonKt.launch$default(this.p.getCoroutineScope(), null, null, new OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreScroll$2(this, null), 3, null);
        }
        long jM1384minusMKHz9U = this.q ? Offset.m1384minusMKHz9U(j2, this.p.m2904dispatchPreScrollOzD1aCk(j2, i)) : j2;
        boolean z = Math.signum(Offset.m1381getYimpl(jM1384minusMKHz9U)) == Math.signum(this.k);
        if (Math.abs(this.k) <= this.i || z) {
            return Offset.m1384minusMKHz9U(j2, jM1384minusMKHz9U);
        }
        float fM1381getYimpl = this.k + Offset.m1381getYimpl(jM1384minusMKHz9U);
        if (!(Math.signum(this.k) == Math.signum(fM1381getYimpl))) {
            d(0.0f);
            String strM1388toStringimpl = Offset.m1388toStringimpl(j2);
            StringBuilder sb = new StringBuilder();
            sb.append("onPreScroll available=");
            sb.append(strM1388toStringimpl);
            sb.append("; offsetY=");
            sb.append(fM1381getYimpl);
            return OffsetKt.Offset(0.0f, fM1381getYimpl);
        }
        d(this.r.invoke(Float.valueOf(this.k), Float.valueOf(Offset.m1381getYimpl(jM1384minusMKHz9U))).floatValue());
        String strM1388toStringimpl2 = Offset.m1388toStringimpl(j2);
        float fM1381getYimpl2 = Offset.m1381getYimpl(j2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPreScroll available=");
        sb2.append(strM1388toStringimpl2);
        sb2.append("; offsetY=");
        sb2.append(fM1381getYimpl2);
        return OffsetKt.Offset(0.0f, Offset.m1381getYimpl(j2));
    }
}
