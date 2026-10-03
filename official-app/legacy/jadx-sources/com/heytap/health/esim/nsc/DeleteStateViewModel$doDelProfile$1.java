package com.heytap.health.esim.nsc;

import com.oplus.aiunit.vision.ixb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.DeleteStateViewModel", f = "NetWorkDealingActivity.kt", i = {0}, l = {ixb.SPO2_DATA}, m = "doDelProfile", n = {"this"}, s = {"L$0"})
public final class DeleteStateViewModel$doDelProfile$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteStateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteStateViewModel$doDelProfile$1(DeleteStateViewModel deleteStateViewModel, Continuation<? super DeleteStateViewModel$doDelProfile$1> continuation) {
        super(continuation);
        this.this$0 = deleteStateViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d0(this);
    }
}
