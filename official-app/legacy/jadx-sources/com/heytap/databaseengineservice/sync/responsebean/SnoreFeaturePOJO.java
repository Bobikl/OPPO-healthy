package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e¨\u0006$"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SnoreFeaturePOJO;", "", "()V", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "featureDataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/SnoreFeaturePOJO$FeatureListBean;", "getFeatureDataList", "()Ljava/util/List;", "setFeatureDataList", "(Ljava/util/List;)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "recordEndTimestamp", "getRecordEndTimestamp", "setRecordEndTimestamp", "recordStartTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "FeatureListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreFeaturePOJO {

    @Nullable
    private String deviceId;
    private long endTimestamp;

    @Nullable
    private List<FeatureListBean> featureDataList;
    private long modifiedTimestamp;
    private long recordEndTimestamp;
    private long recordStartTimestamp;
    private long startTimestamp;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SnoreFeaturePOJO$FeatureListBean;", "", "()V", "endTimeOffset", "", "getEndTimeOffset", "()I", "setEndTimeOffset", "(I)V", "snoreFeatureList", "", "", "getSnoreFeatureList", "()Ljava/util/List;", "setSnoreFeatureList", "(Ljava/util/List;)V", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FeatureListBean {
        private int endTimeOffset;

        @Nullable
        private List<Double> snoreFeatureList;
        private int startTimeOffset;

        public final int getEndTimeOffset() {
            return this.endTimeOffset;
        }

        @Nullable
        public final List<Double> getSnoreFeatureList() {
            return this.snoreFeatureList;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        public final void setEndTimeOffset(int i) {
            this.endTimeOffset = i;
        }

        public final void setSnoreFeatureList(@Nullable List<Double> list) {
            this.snoreFeatureList = list;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        @NotNull
        public String toString() {
            return "FeatureListBean(startTimeOffset=" + this.startTimeOffset + ", endTimeOffset=" + this.endTimeOffset + ", snoreFeatureList=" + this.snoreFeatureList + ")";
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
    public final List<FeatureListBean> getFeatureDataList() {
        return this.featureDataList;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public final long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
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

    public final void setFeatureDataList(@Nullable List<FeatureListBean> list) {
        this.featureDataList = list;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setRecordEndTimestamp(long j2) {
        this.recordEndTimestamp = j2;
    }

    public final void setRecordStartTimestamp(long j2) {
        this.recordStartTimestamp = j2;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "SnoreFeaturePOJO(deviceId=" + this.deviceId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", featureDataList=" + this.featureDataList + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
