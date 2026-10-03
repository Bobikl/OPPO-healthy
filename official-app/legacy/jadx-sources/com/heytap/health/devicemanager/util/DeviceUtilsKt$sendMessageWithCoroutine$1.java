package com.heytap.health.devicemanager.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicemanager.util.DeviceUtilsKt", f = "DeviceUtils.kt", i = {0, 0}, l = {103}, m = "sendMessageWithCoroutine", n = {"parse", "eventTag$delegate"}, s = {"L$0", "L$1"})
public final class DeviceUtilsKt$sendMessageWithCoroutine$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DeviceUtilsKt$sendMessageWithCoroutine$1(Continuation<? super DeviceUtilsKt$sendMessageWithCoroutine$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DeviceUtilsKt.d(null, null, null, null, 0L, 0, this);
    }
}
