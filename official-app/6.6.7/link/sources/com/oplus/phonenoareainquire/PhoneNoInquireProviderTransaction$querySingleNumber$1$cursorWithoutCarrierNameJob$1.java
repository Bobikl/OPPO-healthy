package com.oplus.phonenoareainquire;

import android.database.Cursor;
import android.database.MatrixCursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/database/Cursor;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.phonenoareainquire.PhoneNoInquireProviderTransaction$querySingleNumber$1$cursorWithoutCarrierNameJob$1", f = "PhoneNoInquireProviderTransaction.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneNoInquireProviderTransaction$querySingleNumber$1$cursorWithoutCarrierNameJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Cursor>, Object> {
    final /* synthetic */ String $countryIso;
    final /* synthetic */ MatrixCursor $defaultRes;
    final /* synthetic */ boolean $isDomesticSim;
    final /* synthetic */ boolean $isForceQueryDomestic;
    final /* synthetic */ boolean $isRoam;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ PhoneNoInquireProvider $provider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNoInquireProviderTransaction$querySingleNumber$1$cursorWithoutCarrierNameJob$1(PhoneNoInquireProvider phoneNoInquireProvider, String str, String str2, boolean z, boolean z2, boolean z3, MatrixCursor matrixCursor, Continuation<? super PhoneNoInquireProviderTransaction$querySingleNumber$1$cursorWithoutCarrierNameJob$1> continuation) {
        super(2, continuation);
        this.$provider = phoneNoInquireProvider;
        this.$phoneNumber = str;
        this.$countryIso = str2;
        this.$isForceQueryDomestic = z;
        this.$isRoam = z2;
        this.$isDomesticSim = z3;
        this.$defaultRes = matrixCursor;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PhoneNoInquireProviderTransaction$querySingleNumber$1$cursorWithoutCarrierNameJob$1(this.$provider, this.$phoneNumber, this.$countryIso, this.$isForceQueryDomestic, this.$isRoam, this.$isDomesticSim, this.$defaultRes, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Cursor attributionCursor = this.$provider.getAttributionCursor(this.$phoneNumber, this.$countryIso, Boxing.boxBoolean(this.$isForceQueryDomestic), this.$isRoam, this.$isDomesticSim);
        return attributionCursor == null ? this.$defaultRes : attributionCursor;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Cursor> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
