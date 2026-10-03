package com.heytap.health.network.api.p001switch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.network.api.switch.SwitchNetManager", f = "SwitchNetManager.kt", i = {}, l = {62}, m = "queryGlobalConfig", n = {}, s = {})
public final class SwitchNetManager$queryGlobalConfig$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwitchNetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchNetManager$queryGlobalConfig$3(SwitchNetManager switchNetManager, Continuation<? super SwitchNetManager$queryGlobalConfig$3> continuation) {
        super(continuation);
        this.this$0 = switchNetManager;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, this);
    }
}
