package com.heytap.health.wallet.entrance.repository;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wallet.entrance.repository.DoorIdentifyRepo", f = "DoorIdentifyRepo.kt", i = {0}, l = {147}, m = "getCardInfo", n = {TriggerEvent.EXTRA_UID}, s = {"J$0"})
public final class DoorIdentifyRepo$getCardInfo$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DoorIdentifyRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoorIdentifyRepo$getCardInfo$1(DoorIdentifyRepo doorIdentifyRepo, Continuation<? super DoorIdentifyRepo$getCardInfo$1> continuation) {
        super(continuation);
        this.this$0 = doorIdentifyRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, this);
    }
}
