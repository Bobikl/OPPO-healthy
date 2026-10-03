package com.heytap.health.device.log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.device.log.DeviceFileRepo", f = "DeviceFileRepo.kt", i = {0, 0}, l = {132}, m = "requestFileWithProgress", n = {"this", "index"}, s = {"L$0", "I$0"})
public final class DeviceFileRepo$requestFileWithProgress$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceFileRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFileRepo$requestFileWithProgress$1(DeviceFileRepo deviceFileRepo, Continuation<? super DeviceFileRepo$requestFileWithProgress$1> continuation) {
        super(continuation);
        this.this$0 = deviceFileRepo;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, 0, this);
    }
}
