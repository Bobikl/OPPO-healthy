package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0006R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R \u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/e5;", "T", "Lcom/oplus/aiunit/vision/hw9;", "value", "", "j", "(Ljava/lang/Object;)V", "f", "Lkotlin/Function0;", "cb", "b", "Landroid/animation/ObjectAnimator;", "g", "endValue", "e", "(Ljava/lang/Object;)Lcom/oplus/aiunit/vision/e5;", "Lcom/oplus/aiunit/vision/f9e;", "a", "Lcom/oplus/aiunit/vision/f9e;", "getParam", "()Lcom/oplus/aiunit/vision/f9e;", "param", "Lcom/oplus/aiunit/vision/t0a;", "Lcom/oplus/aiunit/vision/t0a;", "getUpdate", "()Lcom/oplus/aiunit/vision/t0a;", "update", "c", "Landroid/animation/ObjectAnimator;", "objectAnimator", "d", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "i", "Lkotlin/jvm/functions/Function0;", "startCb", "endCb", "<init>", "(Lcom/oplus/aiunit/vision/f9e;Lcom/oplus/aiunit/vision/t0a;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public abstract class e5<T> implements hw9<T> {

    @NotNull
    public final Param<T> a;

    @NotNull
    public final t0a b;

    @Nullable
    public ObjectAnimator c;
    public T d;

    @Nullable
    public Function0<Unit> e;

    @Nullable
    public Function0<Unit> f;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/e5$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_START, ParserTag.TAG_ON_ANIMATION_END, "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ e5<T> i;

        public a(e5<T> e5Var) {
            this.i = e5Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Function0 function0 = this.i.f;
            if (function0 != null) {
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Function0 function0 = this.i.e;
            if (function0 != null) {
            }
        }
    }

    public e5(@NotNull Param<T> param, @NotNull t0a t0aVar) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(t0aVar, "update");
        this.a = param;
        this.b = t0aVar;
        this.d = param.a();
    }

    @Override // com.oplus.aiunit.vision.hw9
    public void b(@NotNull Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.f = cb;
    }

    @NotNull
    public e5<T> e(T endValue) {
        if (this.c != null) {
            f();
        }
        ObjectAnimator objectAnimatorA = a(endValue);
        this.c = objectAnimatorA;
        if (objectAnimatorA != null) {
            objectAnimatorA.addListener(new a(this));
        }
        return this;
    }

    public void f() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.c;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.c = null;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public ObjectAnimator getC() {
        return this.c;
    }

    public T h() {
        return this.d;
    }

    public void i(T t) {
        this.d = t;
    }

    public void j(T value) {
        if (Intrinsics.areEqual(h(), value)) {
            return;
        }
        i(value);
        t0a t0aVar = this.b;
        String name = this.a.getName();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
        t0aVar.a(name, value);
    }
}
