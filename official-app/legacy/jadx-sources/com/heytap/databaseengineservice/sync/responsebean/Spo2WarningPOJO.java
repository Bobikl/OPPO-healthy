package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/Spo2WarningPOJO;", "", "()V", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "spo2ValueHighest", "", "getSpo2ValueHighest", "()I", "setSpo2ValueHighest", "(I)V", "spo2ValueLowest", "getSpo2ValueLowest", "setSpo2ValueLowest", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Spo2WarningPOJO {

    @Nullable
    private String deviceUniqueId;
    private long endTimestamp;
    private long modifiedTimestamp;
    private int spo2ValueHighest;
    private int spo2ValueLowest;
    private long startTimestamp;

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getSpo2ValueHighest() {
        return this.spo2ValueHighest;
    }

    public final int getSpo2ValueLowest() {
        return this.spo2ValueLowest;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setDeviceUniqueId(@Nullable String str) {
        this.deviceUniqueId = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSpo2ValueHighest(int i) {
        this.spo2ValueHighest = i;
    }

    public final void setSpo2ValueLowest(int i) {
        this.spo2ValueLowest = i;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "Spo2WarningPOJO(deviceUniqueId=" + this.deviceUniqueId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", spo2ValueLowest=" + this.spo2ValueLowest + ", spo2ValueHighest=" + this.spo2ValueHighest + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
