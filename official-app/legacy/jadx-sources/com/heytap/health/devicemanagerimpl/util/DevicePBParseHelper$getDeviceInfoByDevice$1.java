package com.heytap.health.devicemanagerimpl.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicemanagerimpl.util.DevicePBParseHelper", f = "DevicePBParseHelper.kt", i = {0, 0}, l = {27, 35}, m = "getDeviceInfoByDevice", n = {"mac", "block"}, s = {"L$0", "L$1"})
public final class DevicePBParseHelper$getDeviceInfoByDevice$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DevicePBParseHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePBParseHelper$getDeviceInfoByDevice$1(DevicePBParseHelper devicePBParseHelper, Continuation<? super DevicePBParseHelper$getDeviceInfoByDevice$1> continuation) {
        super(continuation);
        this.this$0 = devicePBParseHelper;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
