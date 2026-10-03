package com.oplus.aiunit.tools.odinheader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.CountDownLatch;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class OdinHeaderTools$getProp$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CountDownLatch $locker;
    final /* synthetic */ Process $process;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdinHeaderTools$getProp$1$1(Process process, CountDownLatch countDownLatch) {
        super(0);
        this.$process = process;
        this.$locker = countDownLatch;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new BufferedReader(new InputStreamReader(this.$process.getErrorStream()));
        this.$locker.countDown();
    }
}
