package com.heytap.databaseengineservice.sync.responsebean.newsleep;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepAdvice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006\""}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/newsleep/SleepAdvicePOJO;", "", "()V", DBSleepAdvice.BEDTIME, "", "getBedtime", "()I", "setBedtime", "(I)V", DBSleepAdvice.BURDEN, "getBurden", "setBurden", "dataClient", "", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "dataCreatedTimestamp", "", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "duration", "getDuration", "setDuration", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "outBedtime", "getOutBedtime", "setOutBedtime", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepAdvicePOJO {
    private int bedtime;
    private int burden;

    @Nullable
    private String dataClient;
    private long dataCreatedTimestamp;
    private int duration;
    private long modifiedTimestamp;
    private int outBedtime;

    public final int getBedtime() {
        return this.bedtime;
    }

    public final int getBurden() {
        return this.burden;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getOutBedtime() {
        return this.outBedtime;
    }

    public final void setBedtime(int i) {
        this.bedtime = i;
    }

    public final void setBurden(int i) {
        this.burden = i;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOutBedtime(int i) {
        this.outBedtime = i;
    }

    @NotNull
    public String toString() {
        return "SleepAdvicePOJO(dataClient=" + this.dataClient + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", bedtime=" + this.bedtime + ", outBedtime=" + this.outBedtime + ", duration=" + this.duration + ", burden=" + this.burden + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
