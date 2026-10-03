package com.heytap.health.oobe.repo;

import com.oplus.aiunit.vision.oei;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oobe.repo.OOBENetSource", f = "OOBENetSource.kt", i = {}, l = {oei.TAI_CHI}, m = "updateVirtualAccount", n = {}, s = {})
public final class OOBENetSource$updateVirtualAccount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OOBENetSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OOBENetSource$updateVirtualAccount$1(OOBENetSource oOBENetSource, Continuation<? super OOBENetSource$updateVirtualAccount$1> continuation) {
        super(continuation);
        this.this$0 = oOBENetSource;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(null, this);
    }
}
