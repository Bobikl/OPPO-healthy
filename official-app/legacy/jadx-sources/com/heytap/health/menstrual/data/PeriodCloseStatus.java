package com.heytap.health.menstrual.data;

import com.oplus.aiunit.vision.d04;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/menstrual/data/PeriodCloseStatus;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "AUTO_CLOSE", d04.CARD_STATUS_OPENING, "MANUAL_CLOSE", "PREDICT", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PeriodCloseStatus {
    AUTO_CLOSE(1),
    OPENING(0),
    MANUAL_CLOSE(2),
    PREDICT(-1);

    private final int status;

    PeriodCloseStatus(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }
}
