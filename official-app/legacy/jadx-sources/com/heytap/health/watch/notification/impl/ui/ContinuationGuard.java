package com.heytap.health.watch.notification.impl.ui;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/ContinuationGuard;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "", "b", "(Ljava/lang/Object;)V", "a", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;", "continuationRef", "continuation", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class ContinuationGuard<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public volatile CancellableContinuation<? super T> continuationRef;

    public ContinuationGuard(@NotNull CancellableContinuation<? super T> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuationRef = continuation;
        continuation.invokeOnCancellation(new Function1<Throwable, Unit>(this) { // from class: com.heytap.health.watch.notification.impl.ui.ContinuationGuard.1
            final /* synthetic */ ContinuationGuard<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                this.this$0.a();
            }
        });
    }

    public final void a() {
        this.continuationRef = null;
    }

    public final void b(T value) {
        CancellableContinuation<? super T> cancellableContinuation = this.continuationRef;
        if (cancellableContinuation == null) {
            return;
        }
        this.continuationRef = null;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(value));
        }
    }
}
