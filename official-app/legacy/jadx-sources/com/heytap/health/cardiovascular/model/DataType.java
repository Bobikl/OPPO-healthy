package com.heytap.health.cardiovascular.model;

import com.oplus.aiunit.vision.c8l;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cardiovascular/model/DataType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "INSLEEP", c8l.KEY_SCORE, "STEP", "DEEP_SLEEP_RATE", "WAKE_DURATION", "WAKE_TIMES", "SPORTS", "SLEEP_HR", "WRIST_TEMPER", "SLEEP_DURATION", "SPORTS_HR", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum DataType {
    INSLEEP(0),
    SCORE(1),
    STEP(2),
    DEEP_SLEEP_RATE(3),
    WAKE_DURATION(4),
    WAKE_TIMES(5),
    SPORTS(6),
    SLEEP_HR(7),
    WRIST_TEMPER(8),
    SLEEP_DURATION(9),
    SPORTS_HR(10);

    private final int type;

    DataType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
