package com.heytap.health.wrist_temperature.viewmodel;

import com.oplus.aiunit.vision.r2m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.wrist_temperature.viewmodel.WristStoreViewMode", f = "WristStoreViewMode.kt", i = {}, l = {79}, m = "fetchFirstDataTime", n = {}, s = {})
final class WristStoreViewMode$fetchFirstDataTime$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r2m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WristStoreViewMode$fetchFirstDataTime$1(r2m r2mVar, Continuation<? super WristStoreViewMode$fetchFirstDataTime$1> continuation) {
        super(continuation);
        this.this$0 = r2mVar;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
