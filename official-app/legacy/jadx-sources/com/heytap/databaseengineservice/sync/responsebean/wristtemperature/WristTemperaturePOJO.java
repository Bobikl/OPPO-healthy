package com.heytap.databaseengineservice.sync.responsebean.wristtemperature;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/wristtemperature/WristTemperaturePOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "wristTemperatures", "", "Lcom/heytap/databaseengineservice/sync/responsebean/wristtemperature/WristTemperaturePOJO$DataListBean;", "getWristTemperatures", "()Ljava/util/List;", "setWristTemperatures", "(Ljava/util/List;)V", "toString", "DataListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WristTemperaturePOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;
    private long endTimestamp;
    private long modifiedTimestamp;
    private long startTimestamp;

    @Nullable
    private List<DataListBean> wristTemperatures;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/wristtemperature/WristTemperaturePOJO$DataListBean;", "", "()V", "baseLineWristTemperature", "", "getBaseLineWristTemperature", "()I", "setBaseLineWristTemperature", "(I)V", "confidence", "getConfidence", "setConfidence", "endTimeOffset", "getEndTimeOffset", "setEndTimeOffset", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "status", "getStatus", "setStatus", "wristTemperature", "getWristTemperature", "setWristTemperature", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataListBean {
        private int baseLineWristTemperature;
        private int confidence;
        private int endTimeOffset;
        private int startTimeOffset;
        private int status;
        private int wristTemperature;

        public final int getBaseLineWristTemperature() {
            return this.baseLineWristTemperature;
        }

        public final int getConfidence() {
            return this.confidence;
        }

        public final int getEndTimeOffset() {
            return this.endTimeOffset;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        public final int getStatus() {
            return this.status;
        }

        public final int getWristTemperature() {
            return this.wristTemperature;
        }

        public final void setBaseLineWristTemperature(int i) {
            this.baseLineWristTemperature = i;
        }

        public final void setConfidence(int i) {
            this.confidence = i;
        }

        public final void setEndTimeOffset(int i) {
            this.endTimeOffset = i;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        public final void setWristTemperature(int i) {
            this.wristTemperature = i;
        }

        @NotNull
        public String toString() {
            return "DataListBean(startTimeOffset=" + this.startTimeOffset + ", endTimeOffset=" + this.endTimeOffset + ", wristTemperature=" + this.wristTemperature + ", baseLineWristTemperature=" + this.baseLineWristTemperature + ", confidence=" + this.confidence + ", status=" + this.status + ")";
        }
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final List<DataListBean> getWristTemperatures() {
        return this.wristTemperatures;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setWristTemperatures(@Nullable List<DataListBean> list) {
        this.wristTemperatures = list;
    }

    @NotNull
    public String toString() {
        return "WristTemperaturePOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", wristTemperatures=" + this.wristTemperatures + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
