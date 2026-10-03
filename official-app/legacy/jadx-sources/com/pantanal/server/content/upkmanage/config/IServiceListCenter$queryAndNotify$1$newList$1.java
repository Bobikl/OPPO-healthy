package com.pantanal.server.content.upkmanage.config;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.px9;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.pantanal.server.content.upkmanage.config.IServiceListCenter$queryAndNotify$1$newList$1", f = "IServiceListCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IServiceListCenter$queryAndNotify$1$newList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<Object>>, Object> {
    int label;
    final /* synthetic */ px9<Object> this$0;

    public IServiceListCenter$queryAndNotify$1$newList$1(px9<Object> px9Var, Continuation<? super IServiceListCenter$queryAndNotify$1$newList$1> continuation) {
        super(2, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new IServiceListCenter$queryAndNotify$1$newList$1(null, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        px9.a(null);
        throw null;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Object>> continuation) {
        return ((IServiceListCenter$queryAndNotify$1$newList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
