package com.heytap.health.health.insight;

import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/health/insight/ModuleType;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority", "()I", "INVLAID", HeytapHealthParams.SLEEP, HeytapHealthParams.HEART_RATE, "STEP", "CONSUMPTION", "SNORE", "HRV", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ModuleType {
    INVLAID(-1),
    SLEEP(0),
    HEART_RATE(1),
    STEP(2),
    CONSUMPTION(3),
    SNORE(4),
    HRV(5);

    private final int priority;

    ModuleType(int i) {
        this.priority = i;
    }

    public final int getPriority() {
        return this.priority;
    }
}
