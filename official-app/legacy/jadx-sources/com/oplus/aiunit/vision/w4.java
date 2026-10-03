package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0006R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R \u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/w4;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/av9;", "value", "", "j", "(Ljava/lang/Object;)V", "f", "Lkotlin/Function0;", oea.CALLBACK, "b", "Landroid/animation/ObjectAnimator;", b2n.f, "endValue", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/Object;)Lcom/oplus/aiunit/vision/w4;", "Lcom/oplus/aiunit/vision/g7e;", "a", "Lcom/oplus/aiunit/vision/g7e;", "getParam", "()Lcom/oplus/aiunit/vision/g7e;", RnConstant.KEY_INIT_OPTIONS, "Lcom/oplus/aiunit/vision/mz9;", "Lcom/oplus/aiunit/vision/mz9;", "getUpdate", "()Lcom/oplus/aiunit/vision/mz9;", a8i.UPDATE, "c", "Landroid/animation/ObjectAnimator;", "objectAnimator", "d", "Ljava/lang/Object;", b2n.g, "()Ljava/lang/Object;", "i", "Lkotlin/jvm/functions/Function0;", "startCb", "endCb", "<init>", "(Lcom/oplus/aiunit/vision/g7e;Lcom/oplus/aiunit/vision/mz9;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public abstract class w4<T> implements av9<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Param<T> param;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final mz9 update;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ObjectAnimator objectAnimator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public T value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> startCb;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> endCb;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/w4$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_START, ParserTag.TAG_ON_ANIMATION_END, "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ w4<T> i;

        public a(w4<T> w4Var) {
            this.i = w4Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Function0 function0 = this.i.endCb;
            if (function0 != null) {
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Function0 function0 = this.i.startCb;
            if (function0 != null) {
            }
        }
    }

    public w4(@NotNull Param<T> param, @NotNull mz9 update) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(update, "update");
        this.param = param;
        this.update = update;
        this.value = param.a();
    }

    @Override // com.oplus.aiunit.vision.av9
    public void b(@NotNull Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.endCb = cb;
    }

    @NotNull
    public w4<T> e(T endValue) {
        if (this.objectAnimator != null) {
            f();
        }
        ObjectAnimator objectAnimatorA = a(endValue);
        this.objectAnimator = objectAnimatorA;
        if (objectAnimatorA != null) {
            objectAnimatorA.addListener(new a(this));
        }
        return this;
    }

    public void f() {
        ObjectAnimator objectAnimator = this.objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.objectAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.objectAnimator = null;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public ObjectAnimator getObjectAnimator() {
        return this.objectAnimator;
    }

    public T h() {
        return this.value;
    }

    public void i(T t) {
        this.value = t;
    }

    public void j(T value) {
        if (Intrinsics.areEqual(h(), value)) {
            return;
        }
        i(value);
        mz9 mz9Var = this.update;
        String name = this.param.getName();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
        mz9Var.a(name, value);
    }
}
