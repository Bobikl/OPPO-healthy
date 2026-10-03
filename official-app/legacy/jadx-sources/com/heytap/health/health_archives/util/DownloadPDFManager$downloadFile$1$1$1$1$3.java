package com.heytap.health.health_archives.util;

import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.health_archives.util.DownloadPDFManager$downloadFile$1$1$1$1$3", f = "DownloadPDFManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DownloadPDFManager$downloadFile$1$1$1$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Long, Long, Unit> $onProgress;
    final /* synthetic */ long $totalBytes;
    final /* synthetic */ Ref.LongRef $totalBytesRead;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DownloadPDFManager$downloadFile$1$1$1$1$3(Function2<? super Long, ? super Long, Unit> function2, Ref.LongRef longRef, long j2, Continuation<? super DownloadPDFManager$downloadFile$1$1$1$1$3> continuation) {
        super(2, continuation);
        this.$onProgress = function2;
        this.$totalBytesRead = longRef;
        this.$totalBytes = j2;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DownloadPDFManager$downloadFile$1$1$1$1$3(this.$onProgress, this.$totalBytesRead, this.$totalBytes, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onProgress.invoke(Boxing.boxLong(this.$totalBytesRead.element), Boxing.boxLong(this.$totalBytes));
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DownloadPDFManager$downloadFile$1$1$1$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
