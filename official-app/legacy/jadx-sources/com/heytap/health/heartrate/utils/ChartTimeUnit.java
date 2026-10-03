package com.heytap.health.heartrate.utils;

import com.oplus.aiunit.vision.t13;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/heartrate/utils/ChartTimeUnit;", "", "timeUnit", "", "(Ljava/lang/String;II)V", "getTimeUnit", "()I", t13.WEEK, t13.MONTH, t13.YEAR, t13.DAY, "heartrate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ChartTimeUnit {
    WEEK(0),
    MONTH(1),
    YEAR(2),
    DAY(3);

    private final int timeUnit;

    ChartTimeUnit(int i) {
        this.timeUnit = i;
    }

    public final int getTimeUnit() {
        return this.timeUnit;
    }
}
