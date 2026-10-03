package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SleepRRIntervalPOJO;", "", "()V", "dataClient", "", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "rrIntervalDataList", "", "", "getRrIntervalDataList", "()Ljava/util/List;", "setRrIntervalDataList", "(Ljava/util/List;)V", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepRRIntervalPOJO {

    @Nullable
    private String dataClient;
    private long modifiedTimestamp;

    @Nullable
    private List<Integer> rrIntervalDataList;
    private long startTimestamp;

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final List<Integer> getRrIntervalDataList() {
        return this.rrIntervalDataList;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setRrIntervalDataList(@Nullable List<Integer> list) {
        this.rrIntervalDataList = list;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "SleepRRIntervalPOJO(dataClient=" + this.dataClient + ", startTimestamp=" + this.startTimestamp + ", rrIntervalDataList=" + this.rrIntervalDataList + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
