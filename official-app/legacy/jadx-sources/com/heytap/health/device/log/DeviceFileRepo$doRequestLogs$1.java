package com.heytap.health.device.log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.device.log.DeviceFileRepo", f = "DeviceFileRepo.kt", i = {0, 0, 1, 1, 1}, l = {82, 102}, m = "doRequestLogs", n = {"this", "fileUri", "this", "fileUri", "index$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
public final class DeviceFileRepo$doRequestLogs$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceFileRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFileRepo$doRequestLogs$1(DeviceFileRepo deviceFileRepo, Continuation<? super DeviceFileRepo$doRequestLogs$1> continuation) {
        super(continuation);
        this.this$0 = deviceFileRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(0, null, null, null, this);
    }
}
