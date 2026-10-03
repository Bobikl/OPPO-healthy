package com.oplus.aiunit.vision;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\bB\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/vdg;", "", "Landroid/graphics/Matrix;", "startMatrix", "endMatrix", "Lkotlin/Function1;", "", "onMatrixChanged", "b", "<init>", "()V", "Companion", "a", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vdg {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/vdg$b;", "Landroid/animation/TypeEvaluator;", "Landroid/graphics/Matrix;", "", "fraction", "startValue", "endValue", "b", "a", "", "[F", "startArray", "endArray", "c", "tempArray", "d", "Landroid/graphics/Matrix;", "tempMatrix", "realStartMatrix", "realEndMatrix", "<init>", "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final float[] startArray;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final float[] endArray;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public float[] tempArray;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public Matrix tempMatrix;

        public b(@NotNull Matrix realStartMatrix, @NotNull Matrix realEndMatrix) {
            Intrinsics.checkNotNullParameter(realStartMatrix, "realStartMatrix");
            Intrinsics.checkNotNullParameter(realEndMatrix, "realEndMatrix");
            float[] fArr = new float[9];
            this.startArray = fArr;
            float[] fArr2 = new float[9];
            this.endArray = fArr2;
            this.tempArray = new float[9];
            this.tempMatrix = new Matrix();
            realStartMatrix.getValues(fArr);
            realEndMatrix.getValues(fArr2);
            a7b.f("ScaleMatrixAnimator", "MatrixEvaluator startArray:" + fArr + ", " + fArr2);
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.tempArray = fArrCopyOf;
        }

        public final float a(float startValue, float endValue, float fraction) {
            return startValue + ((endValue - startValue) * fraction);
        }

        @Override // android.animation.TypeEvaluator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float fraction, @NotNull Matrix startValue, @NotNull Matrix endValue) {
            Intrinsics.checkNotNullParameter(startValue, "startValue");
            Intrinsics.checkNotNullParameter(endValue, "endValue");
            this.tempArray[2] = a(this.startArray[2], this.endArray[2], fraction);
            this.tempArray[5] = a(this.startArray[5], this.endArray[5], fraction);
            this.tempArray[0] = a(this.startArray[0], this.endArray[0], fraction);
            this.tempArray[4] = a(this.startArray[4], this.endArray[4], fraction);
            this.tempMatrix.setValues(this.tempArray);
            return this.tempMatrix;
        }
    }

    public static final void c(Function1 onMatrixChanged, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(onMatrixChanged, "$onMatrixChanged");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type android.graphics.Matrix");
        onMatrixChanged.invoke((Matrix) animatedValue);
    }

    public final void b(@NotNull Matrix startMatrix, @NotNull Matrix endMatrix, @NotNull final Function1<? super Matrix, Unit> onMatrixChanged) {
        Intrinsics.checkNotNullParameter(startMatrix, "startMatrix");
        Intrinsics.checkNotNullParameter(endMatrix, "endMatrix");
        Intrinsics.checkNotNullParameter(onMatrixChanged, "onMatrixChanged");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(220L);
        valueAnimator.setValues(PropertyValuesHolder.ofObject("matrixChanged", new b(startMatrix, endMatrix), startMatrix, endMatrix));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.udg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                vdg.c(onMatrixChanged, valueAnimator2);
            }
        });
        valueAnimator.start();
    }
}
