package com.oplus.phonenoareainquire;

import com.oplus.aiunit.vision.gqe;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/oplus/aiunit/vision/gqe$a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.phonenoareainquire.PhoneNoInquireProviderTransaction$querySingleNumber$1$numberInfoJob$1", f = "PhoneNoInquireProviderTransaction.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneNoInquireProviderTransaction$querySingleNumber$1$numberInfoJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super gqe.NumberInfo>, Object> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ PhoneNoInquireProvider $provider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNoInquireProviderTransaction$querySingleNumber$1$numberInfoJob$1(PhoneNoInquireProvider phoneNoInquireProvider, String str, Continuation<? super PhoneNoInquireProviderTransaction$querySingleNumber$1$numberInfoJob$1> continuation) {
        super(2, continuation);
        this.$provider = phoneNoInquireProvider;
        this.$phoneNumber = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PhoneNoInquireProviderTransaction$querySingleNumber$1$numberInfoJob$1(this.$provider, this.$phoneNumber, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        gqe.NumberInfo numberInfo = this.$provider.getNumberInfo(this.$phoneNumber);
        if (numberInfo == null) {
            return null;
        }
        return numberInfo;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super gqe.NumberInfo> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
