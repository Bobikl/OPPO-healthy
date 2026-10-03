package com.heytap.health.devicelog.feedback;

import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicelog.feedback.WaitDevicePackage", f = "LogGetInterceptors.kt", i = {1, 1}, l = {124, 130, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD}, m = "intercept", n = {"chain", "request"}, s = {"L$0", "L$1"})
public final class WaitDevicePackage$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WaitDevicePackage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitDevicePackage$intercept$1(WaitDevicePackage waitDevicePackage, Continuation<? super WaitDevicePackage$intercept$1> continuation) {
        super(continuation);
        this.this$0 = waitDevicePackage;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
