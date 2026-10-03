package com.oplus.aiunit.vision;

import java.time.Clock;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/iyj;", "", "", "b", "", "a", "Ljava/lang/Object;", "clock", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class iyj {
    public static final iyj INSTANCE = new iyj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static Object clock;

    public final long a() {
        Object obj = clock;
        if (obj == null || !(obj instanceof Clock)) {
            b();
            return System.currentTimeMillis();
        }
        Intrinsics.checkNotNull(obj);
        if (obj != null) {
            return ((Clock) obj).millis();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.time.Clock");
    }

    public final void b() {
        if (clock == null) {
            synchronized (iyj.class) {
                clock = Clock.systemDefaultZone();
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
