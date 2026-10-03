package com.heytap.health.oobe.setups.pair.legals;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.oobe.setups.pair.legals.AppVersion", f = "AppVersion.kt", i = {0, 0, 1}, l = {21, 32}, m = "trial", n = {"this", "t", "this"}, s = {"L$0", "L$1", "L$0"})
public final class AppVersion$trial$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppVersion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersion$trial$1(AppVersion appVersion, Continuation<? super AppVersion$trial$1> continuation) {
        super(continuation);
        this.this$0 = appVersion;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
