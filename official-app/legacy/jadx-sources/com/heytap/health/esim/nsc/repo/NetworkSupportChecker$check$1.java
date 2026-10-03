package com.heytap.health.esim.nsc.repo;

import com.garmin.fit.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.esim.nsc.repo.NetworkSupportChecker", f = "NetworkSupportChecker.kt", i = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5}, l = {74, 88, 96, 107, 127, 131, i.O2ToxicityFieldNum, 168}, m = "check", n = {"this", "mac", "this", "mac", "this", "this", "mac", "this", "mac", "supportResult"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
public final class NetworkSupportChecker$check$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkSupportChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkSupportChecker$check$1(NetworkSupportChecker networkSupportChecker, Continuation<? super NetworkSupportChecker$check$1> continuation) {
        super(continuation);
        this.this$0 = networkSupportChecker;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
