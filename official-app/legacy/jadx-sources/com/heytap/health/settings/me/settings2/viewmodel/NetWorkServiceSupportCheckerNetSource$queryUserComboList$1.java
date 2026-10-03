package com.heytap.health.settings.me.settings2.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.me.settings2.viewmodel.NetWorkServiceSupportCheckerNetSource", f = "NetWorkServiceSupportCheckerNetSource.kt", i = {}, l = {32}, m = "queryUserComboList", n = {}, s = {})
public final class NetWorkServiceSupportCheckerNetSource$queryUserComboList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetWorkServiceSupportCheckerNetSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetWorkServiceSupportCheckerNetSource$queryUserComboList$1(NetWorkServiceSupportCheckerNetSource netWorkServiceSupportCheckerNetSource, Continuation<? super NetWorkServiceSupportCheckerNetSource$queryUserComboList$1> continuation) {
        super(continuation);
        this.this$0 = netWorkServiceSupportCheckerNetSource;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
