package com.heytap.databaseengineservice.sync.responsebean.snore;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e¨\u0006$"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/snore/SnoreOsaModelPOJO;", "", "()V", "dataClient", "", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modelDataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/snore/SnoreOsaModelPOJO$OsaModelListBean;", "getModelDataList", "()Ljava/util/List;", "setModelDataList", "(Ljava/util/List;)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "recordEndTimestamp", "getRecordEndTimestamp", "setRecordEndTimestamp", "recordStartTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "OsaModelListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreOsaModelPOJO {

    @Nullable
    private String dataClient;
    private long endTimestamp;

    @Nullable
    private List<OsaModelListBean> modelDataList;
    private long modifiedTimestamp;
    private long recordEndTimestamp;
    private long recordStartTimestamp;
    private long startTimestamp;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/snore/SnoreOsaModelPOJO$OsaModelListBean;", "", "()V", "curFrameSnoreNum", "", "getCurFrameSnoreNum", "()I", "setCurFrameSnoreNum", "(I)V", "features", "", "", "getFeatures", "()Ljava/util/List;", "setFeatures", "(Ljava/util/List;)V", "lastFrameSnoreNum", "getLastFrameSnoreNum", "setLastFrameSnoreNum", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "totalSignalLen", "getTotalSignalLen", "setTotalSignalLen", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OsaModelListBean {
        private int curFrameSnoreNum;

        @Nullable
        private List<Double> features;
        private int lastFrameSnoreNum;
        private int startTimeOffset;
        private int totalSignalLen;

        public final int getCurFrameSnoreNum() {
            return this.curFrameSnoreNum;
        }

        @Nullable
        public final List<Double> getFeatures() {
            return this.features;
        }

        public final int getLastFrameSnoreNum() {
            return this.lastFrameSnoreNum;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        public final int getTotalSignalLen() {
            return this.totalSignalLen;
        }

        public final void setCurFrameSnoreNum(int i) {
            this.curFrameSnoreNum = i;
        }

        public final void setFeatures(@Nullable List<Double> list) {
            this.features = list;
        }

        public final void setLastFrameSnoreNum(int i) {
            this.lastFrameSnoreNum = i;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        public final void setTotalSignalLen(int i) {
            this.totalSignalLen = i;
        }

        @NotNull
        public String toString() {
            return "OsaModelListBean(startTimeOffset=" + this.startTimeOffset + ", totalSignalLen=" + this.totalSignalLen + ", curFrameSnoreNum=" + this.curFrameSnoreNum + ", lastFrameSnoreNum=" + this.lastFrameSnoreNum + ", features=" + this.features + ")";
        }
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final List<OsaModelListBean> getModelDataList() {
        return this.modelDataList;
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

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setModelDataList(@Nullable List<OsaModelListBean> list) {
        this.modelDataList = list;
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
        return "SnoreOsaModelPOJO(dataClient=" + this.dataClient + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", modelDataList=" + this.modelDataList + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
