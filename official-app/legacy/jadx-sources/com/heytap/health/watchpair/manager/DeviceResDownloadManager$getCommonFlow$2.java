package com.heytap.health.watchpair.manager;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.FlowCollector;
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
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.functions.Function4;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.watchpair.manager.DeviceResDownloadManager$getCommonFlow$2", f = "DeviceResDownloadManager.kt", i = {0}, l = {423}, m = "invokeSuspend", n = {"retryCount"}, s = {"J$0"})
public final class DeviceResDownloadManager$getCommonFlow$2<T> extends SuspendLambda implements Function4<FlowCollector<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Function3<Throwable, Long, Continuation<? super Unit>, Object> $retryBlock;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceResDownloadManager$getCommonFlow$2(Function3<? super Throwable, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super DeviceResDownloadManager$getCommonFlow$2> continuation) {
        super(4, continuation);
        this.$retryBlock = function3;
    }

    @Override // p010kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l2, Continuation<? super Boolean> continuation) {
        return invoke((FlowCollector) obj, th, l2.longValue(), continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long j2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            long j3 = this.J$0 + 1;
            Function3<Throwable, Long, Continuation<? super Unit>, Object> function3 = this.$retryBlock;
            Long lBoxLong = Boxing.boxLong(j3);
            this.J$0 = j3;
            this.label = 1;
            if (function3.invoke(th, lBoxLong, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(j2 <= 2);
    }

    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @NotNull Throwable th, long j2, @Nullable Continuation<? super Boolean> continuation) {
        DeviceResDownloadManager$getCommonFlow$2 deviceResDownloadManager$getCommonFlow$2 = new DeviceResDownloadManager$getCommonFlow$2(this.$retryBlock, continuation);
        deviceResDownloadManager$getCommonFlow$2.L$0 = th;
        deviceResDownloadManager$getCommonFlow$2.J$0 = j2;
        return deviceResDownloadManager$getCommonFlow$2.invokeSuspend(Unit.INSTANCE);
    }
}
