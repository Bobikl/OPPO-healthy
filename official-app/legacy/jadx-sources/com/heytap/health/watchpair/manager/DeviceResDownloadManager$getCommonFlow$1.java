package com.heytap.health.watchpair.manager;

import androidx.exifinterface.media.ExifInterface;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.watchpair.manager.DeviceResDownloadManager$getCommonFlow$1", f = "DeviceResDownloadManager.kt", i = {}, l = {HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceResDownloadManager$getCommonFlow$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $executeBlock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceResDownloadManager$getCommonFlow$1(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super DeviceResDownloadManager$getCommonFlow$1> continuation) {
        super(2, continuation);
        this.$executeBlock = function1;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceResDownloadManager$getCommonFlow$1 deviceResDownloadManager$getCommonFlow$1 = new DeviceResDownloadManager$getCommonFlow$1(this.$executeBlock, continuation);
        deviceResDownloadManager$getCommonFlow$1.L$0 = obj;
        return deviceResDownloadManager$getCommonFlow$1;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector2 = flowCollector3;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        flowCollector = (FlowCollector) this.L$0;
        Function1<Continuation<? super T>, Object> function1 = this.$executeBlock;
        this.L$0 = flowCollector;
        this.label = 1;
        obj = function1.invoke(this);
        if (obj == coroutine_suspended) {
            flowCollector2 = flowCollector;
            return coroutine_suspended;
        }
        flowCollector2 = flowCollector;
        this.L$0 = null;
        this.label = 2;
        if (flowCollector2.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceResDownloadManager$getCommonFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
