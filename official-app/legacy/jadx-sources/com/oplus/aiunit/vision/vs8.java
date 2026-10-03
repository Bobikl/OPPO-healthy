package com.oplus.aiunit.vision;

import com.heytap.health.push.util.ReportNotificationPermissionSwitchHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H&R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/vs8;", "", "", "ignoreCache", "", "a", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "atomicBooleanInit", "<init>", "()V", "push_base_release"}, k = 1, mv = {1, 8, 0})
public abstract class vs8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean atomicBooleanInit = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public final void a(boolean ignoreCache) {
        boolean z;
        ReportNotificationPermissionSwitchHelper.INSTANCE.i();
        boolean zCompareAndSet = this.atomicBooleanInit.compareAndSet(false, true);
        boolean zB = ilj.b();
        xs8.Companion companion = xs8.INSTANCE;
        xs8 xs8VarA = companion.a();
        if (!StringsKt__StringsJVMKt.equals$default(xs8VarA != null ? xs8VarA.i() : null, "register_failure", false, 2, null)) {
            xs8 xs8VarA2 = companion.a();
            Long lValueOf = xs8VarA2 != null ? Long.valueOf(xs8VarA2.j()) : null;
            Intrinsics.checkNotNull(lValueOf);
            z = lValueOf.longValue() >= 7 || ignoreCache;
        }
        a7b.f("HealthPushManager", "initPush(), isInit=" + zCompareAndSet + ", hasNotifyPer=" + zB + ", needReGetId=" + z);
        if (zCompareAndSet && zB && z) {
            b();
        }
    }

    public abstract void b();
}
