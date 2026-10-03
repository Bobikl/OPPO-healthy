package com.heytap.health.insight.service;

import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.insight.service.SingleAxisSyncService", f = "SingleAxisSyncService.kt", i = {0, 0}, l = {ATDataProfile.CMD_BLOOD_OXYGEN_RECORD}, m = "computeLocalSingleAxisCards", n = {"allCards", "moduleLogic"}, s = {"L$0", "L$2"})
public final class SingleAxisSyncService$computeLocalSingleAxisCards$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleAxisSyncService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleAxisSyncService$computeLocalSingleAxisCards$1(SingleAxisSyncService singleAxisSyncService, Continuation<? super SingleAxisSyncService$computeLocalSingleAxisCards$1> continuation) {
        super(continuation);
        this.this$0 = singleAxisSyncService;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
