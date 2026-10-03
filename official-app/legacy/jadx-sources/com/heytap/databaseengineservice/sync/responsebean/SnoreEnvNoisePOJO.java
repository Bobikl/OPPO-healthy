package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SnoreEnvNoisePOJO;", "", "()V", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "envNoiseDataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/SnoreEnvNoisePOJO$NoiseListBean;", "getEnvNoiseDataList", "()Ljava/util/List;", "setEnvNoiseDataList", "(Ljava/util/List;)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "NoiseListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreEnvNoisePOJO {

    @Nullable
    private String deviceId;
    private long endTimestamp;

    @Nullable
    private List<NoiseListBean> envNoiseDataList;
    private long modifiedTimestamp;
    private long startTimestamp;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SnoreEnvNoisePOJO$NoiseListBean;", "", "()V", "endTimeOffset", "", "getEndTimeOffset", "()I", "setEndTimeOffset", "(I)V", "noiseValue", "getNoiseValue", "setNoiseValue", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoiseListBean {
        private int endTimeOffset;
        private int noiseValue;
        private int startTimeOffset;

        public final int getEndTimeOffset() {
            return this.endTimeOffset;
        }

        public final int getNoiseValue() {
            return this.noiseValue;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        public final void setEndTimeOffset(int i) {
            this.endTimeOffset = i;
        }

        public final void setNoiseValue(int i) {
            this.noiseValue = i;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        @NotNull
        public String toString() {
            return "NoiseListBean(startTimeOffset=" + this.startTimeOffset + ", endTimeOffset=" + this.endTimeOffset + ", noiseValue=" + this.noiseValue + ")";
        }
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final List<NoiseListBean> getEnvNoiseDataList() {
        return this.envNoiseDataList;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setEnvNoiseDataList(@Nullable List<NoiseListBean> list) {
        this.envNoiseDataList = list;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "SnoreEnvNoisePOJO(deviceId=" + this.deviceId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", envNoiseDataList=" + this.envNoiseDataList + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
