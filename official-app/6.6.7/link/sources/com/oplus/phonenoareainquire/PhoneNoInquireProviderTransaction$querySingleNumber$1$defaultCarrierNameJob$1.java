package com.oplus.phonenoareainquire;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.phonenoareainquire.PhoneNoInquireProviderTransaction$querySingleNumber$1$defaultCarrierNameJob$1", f = "PhoneNoInquireProviderTransaction.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneNoInquireProviderTransaction$querySingleNumber$1$defaultCarrierNameJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $countryIso;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ PhoneNoInquireProvider $provider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNoInquireProviderTransaction$querySingleNumber$1$defaultCarrierNameJob$1(PhoneNoInquireProvider phoneNoInquireProvider, String str, String str2, Continuation<? super PhoneNoInquireProviderTransaction$querySingleNumber$1$defaultCarrierNameJob$1> continuation) {
        super(2, continuation);
        this.$provider = phoneNoInquireProvider;
        this.$phoneNumber = str;
        this.$countryIso = str2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PhoneNoInquireProviderTransaction$querySingleNumber$1$defaultCarrierNameJob$1(this.$provider, this.$phoneNumber, this.$countryIso, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String carrierForNumber = this.$provider.getCarrierForNumber(this.$phoneNumber, this.$countryIso);
        if (carrierForNumber == null) {
            return null;
        }
        return carrierForNumber;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
