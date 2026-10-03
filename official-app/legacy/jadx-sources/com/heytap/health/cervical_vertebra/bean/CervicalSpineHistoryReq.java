package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CervicalSpineHistoryReq;", "", "()V", "endTime", "", "getEndTime", "()I", "setEndTime", "(I)V", "startTime", "getStartTime", "setStartTime", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CervicalSpineHistoryReq {
    private int endTime;
    private int startTime;

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    @NotNull
    public String toString() {
        return "CervicalSpineHistoryReq(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
