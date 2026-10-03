package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.m7h;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0013\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcoil/size/ViewSizeResolver;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/m7h;", "Lcoil/size/e;", "getSize", "Lcoil/size/c;", "getWidth", "getHeight", "", "paramSize", "viewSize", "paddingSize", "f", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "", "c", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getView", "()Landroid/view/View;", "view", "", "d", "()Z", "subtractPadding", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nViewSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,118:1\n1#2:119\n314#3,11:120\n*S KotlinDebug\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n*L\n42#1:120,11\n*E\n"})
public interface ViewSizeResolver<T extends View> extends m7h {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"coil/size/ViewSizeResolver$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "i", "Z", "isResumed", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean isResumed;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ViewSizeResolver<T> f462j;
        public final /* synthetic */ ViewTreeObserver k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Size> f463l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, CancellableContinuation<? super Size> cancellableContinuation) {
            this.f462j = viewSizeResolver;
            this.k = viewTreeObserver;
            this.f463l = cancellableContinuation;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Size size = this.f462j.getSize();
            if (size != null) {
                this.f462j.c(this.k, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.f463l.resumeWith(Result.m5287constructorimpl(size));
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void c(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    static /* synthetic */ <T extends View> Object e(final ViewSizeResolver<T> viewSizeResolver, Continuation<? super Size> continuation) {
        Size size = viewSizeResolver.getSize();
        if (size != null) {
            return size;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
        final a aVar = new a(viewSizeResolver, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(aVar);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: coil.size.ViewSizeResolver$size$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                this.this$0.c(viewTreeObserver, aVar);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private default c f(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return c.b.INSTANCE;
        }
        int i = paramSize - paddingSize;
        if (i > 0) {
            return coil.size.a.a(i);
        }
        int i2 = viewSize - paddingSize;
        if (i2 > 0) {
            return coil.size.a.a(i2);
        }
        return null;
    }

    private default c getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return f(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), d() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default Size getSize() {
        c height;
        c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    private default c getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return f(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), d() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    @Override // com.oplus.aiunit.vision.m7h
    @Nullable
    default Object a(@NotNull Continuation<? super Size> continuation) {
        return e(this, continuation);
    }

    default boolean d() {
        return true;
    }

    @NotNull
    T getView();
}
