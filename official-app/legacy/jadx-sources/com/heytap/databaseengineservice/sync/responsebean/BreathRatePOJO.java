package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020\u0011H\u0016R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006'"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/BreathRatePOJO;", "", "()V", "dataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/BreathRatePOJO$BreathRateListBean;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "deviceType", "", "getDeviceType", "()I", "setDeviceType", "(I)V", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "updated", "getUpdated", "setUpdated", "toString", "BreathRateListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BreathRatePOJO {

    @Nullable
    private List<BreathRateListBean> dataList;
    private int deviceType;

    @Nullable
    private String deviceUniqueId;
    private long endTimestamp;
    private long modifiedTimestamp;
    private long startTimestamp;
    private int updated;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/BreathRatePOJO$BreathRateListBean;", "", "()V", "display", "", "getDisplay", "()I", "setDisplay", "(I)V", "respiratoryRate", "getRespiratoryRate", "setRespiratoryRate", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BreathRateListBean {
        private int display;
        private int respiratoryRate;
        private int startTimeOffset;

        public final int getDisplay() {
            return this.display;
        }

        public final int getRespiratoryRate() {
            return this.respiratoryRate;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        public final void setDisplay(int i) {
            this.display = i;
        }

        public final void setRespiratoryRate(int i) {
            this.respiratoryRate = i;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        @NotNull
        public String toString() {
            return "BreathRateListBean(startTimeOffset=" + this.startTimeOffset + ", respiratoryRate=" + this.respiratoryRate + ", display=" + this.display + ")";
        }
    }

    @Nullable
    public final List<BreathRateListBean> getDataList() {
        return this.dataList;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

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

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final void setDataList(@Nullable List<BreathRateListBean> list) {
        this.dataList = list;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
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

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @NotNull
    public String toString() {
        return "BreathRatePOJO(deviceType=" + this.deviceType + ", deviceUniqueId=" + this.deviceUniqueId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataList=" + this.dataList + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
