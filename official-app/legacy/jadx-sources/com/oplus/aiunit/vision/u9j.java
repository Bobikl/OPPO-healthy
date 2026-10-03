package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/u9j;", "", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class u9j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final cfg a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.u9j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/u9j$a;", "", "Lcom/oplus/aiunit/vision/cfg;", "SYNC_DATA_SCHEDULER", "Lcom/oplus/aiunit/vision/cfg;", "a", "()Lcom/oplus/aiunit/vision/cfg;", "getSYNC_DATA_SCHEDULER$annotations", "()V", "<init>", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final cfg a() {
            return u9j.a;
        }
    }

    static {
        cfg cfgVarB = hfg.b(qa2.INSTANCE.b().p("SyncDataIO", 2));
        Intrinsics.checkNotNullExpressionValue(cfgVarB, "from(BusinessDelegate.co…xecutor(\"SyncDataIO\", 2))");
        a = cfgVarB;
    }

    @NotNull
    public static final cfg b() {
        return INSTANCE.a();
    }
}
