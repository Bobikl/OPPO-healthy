package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SedentaryPOJO;", "", "()V", "dataClient", "", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modelDataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/SedentaryPOJO$SedentaryData;", "getModelDataList", "()Ljava/util/List;", "setModelDataList", "(Ljava/util/List;)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "SedentaryData", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SedentaryPOJO {

    @NotNull
    private String dataClient = "";
    private long endTimestamp;
    public List<SedentaryData> modelDataList;
    private long modifiedTimestamp;
    private long startTimestamp;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SedentaryPOJO$SedentaryData;", "", "()V", "endTimeOffset", "", "getEndTimeOffset", "()I", "setEndTimeOffset", "(I)V", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SedentaryData {
        private int endTimeOffset;
        private int startTimeOffset;

        public final int getEndTimeOffset() {
            return this.endTimeOffset;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        public final void setEndTimeOffset(int i) {
            this.endTimeOffset = i;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        @NotNull
        public String toString() {
            return "SedentaryData(startTimeOffset=" + this.startTimeOffset + ", endTimeOffset=" + this.endTimeOffset + ")";
        }
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final List<SedentaryData> getModelDataList() {
        List<SedentaryData> list = this.modelDataList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modelDataList");
        return null;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setModelDataList(@NotNull List<SedentaryData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.modelDataList = list;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "SedentaryPOJO(dataClient='" + this.dataClient + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", modelDataList=" + getModelDataList() + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
