package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import com.oplus.aiunit.vision.f9b;
import com.oplus.aiunit.vision.j9b;
import com.oplus.aiunit.vision.k9b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
@Stable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u0016\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "Lcom/oplus/aiunit/vision/k9b;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "b", "(Lcom/oplus/aiunit/vision/k9b;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterations", "speed", "Lcom/oplus/aiunit/vision/j9b;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "d", "(Lcom/oplus/aiunit/vision/k9b;IIFLcom/oplus/aiunit/vision/j9b;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
public interface LottieAnimatable extends LottieAnimationState {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(LottieAnimatable lottieAnimatable, k9b k9bVar, int i, int i2, float f, j9b j9bVar, float f2, boolean z, LottieCancellationBehavior lottieCancellationBehavior, boolean z2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iC = (i3 & 2) != 0 ? lottieAnimatable.c() : i;
            int iA = (i3 & 4) != 0 ? lottieAnimatable.a() : i2;
            float speed = (i3 & 8) != 0 ? lottieAnimatable.getSpeed() : f;
            j9b j9bVarE = (i3 & 16) != 0 ? lottieAnimatable.e() : j9bVar;
            return lottieAnimatable.d(k9bVar, iC, iA, speed, j9bVarE, (i3 & 32) != 0 ? f9b.c(k9bVar, j9bVarE, speed) : f2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior, (i3 & 256) != 0 ? false : z2, continuation);
        }

        public static /* synthetic */ Object b(LottieAnimatable lottieAnimatable, k9b k9bVar, float f, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i2 & 1) != 0) {
                k9bVar = lottieAnimatable.getComposition();
            }
            k9b k9bVar2 = k9bVar;
            if ((i2 & 2) != 0) {
                f = lottieAnimatable.getProgress();
            }
            float f2 = f;
            if ((i2 & 4) != 0) {
                i = lottieAnimatable.c();
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = !(f2 == lottieAnimatable.getProgress());
            }
            return lottieAnimatable.b(k9bVar2, f2, i3, z, continuation);
        }
    }

    @Nullable
    Object b(@Nullable k9b k9bVar, float f, int i, boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object d(@Nullable k9b k9bVar, int i, int i2, float f, @Nullable j9b j9bVar, float f2, boolean z, @NotNull LottieCancellationBehavior lottieCancellationBehavior, boolean z2, @NotNull Continuation<? super Unit> continuation);
}
