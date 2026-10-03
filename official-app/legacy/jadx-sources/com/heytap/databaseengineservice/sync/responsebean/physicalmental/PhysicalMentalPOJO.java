package com.heytap.databaseengineservice.sync.responsebean.physicalmental;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/physicalmental/PhysicalMentalPOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "dataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/physicalmental/PhysicalMentalPOJO$DataListBean;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "toString", "DataListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhysicalMentalPOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;

    @Nullable
    private List<DataListBean> dataList;
    private long endTimestamp;
    private long modifiedTimestamp;
    private long startTimestamp;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/physicalmental/PhysicalMentalPOJO$DataListBean;", "", "()V", "display", "", "getDisplay", "()I", "setDisplay", "(I)V", "hrv", "getHrv", "setHrv", "startTimeOffset", "getStartTimeOffset", "setStartTimeOffset", "stress", "getStress", "()Ljava/lang/Integer;", "setStress", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "stressState", "getStressState", "setStressState", "type", "getType", "setType", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataListBean {
        private int display;
        private int hrv;
        private int startTimeOffset;

        @Nullable
        private Integer stress;

        @Nullable
        private Integer stressState;
        private int type;

        public final int getDisplay() {
            return this.display;
        }

        public final int getHrv() {
            return this.hrv;
        }

        public final int getStartTimeOffset() {
            return this.startTimeOffset;
        }

        @Nullable
        public final Integer getStress() {
            return this.stress;
        }

        @Nullable
        public final Integer getStressState() {
            return this.stressState;
        }

        public final int getType() {
            return this.type;
        }

        public final void setDisplay(int i) {
            this.display = i;
        }

        public final void setHrv(int i) {
            this.hrv = i;
        }

        public final void setStartTimeOffset(int i) {
            this.startTimeOffset = i;
        }

        public final void setStress(@Nullable Integer num) {
            this.stress = num;
        }

        public final void setStressState(@Nullable Integer num) {
            this.stressState = num;
        }

        public final void setType(int i) {
            this.type = i;
        }

        @NotNull
        public String toString() {
            return "DataListBean(startTimeOffset=" + this.startTimeOffset + ", hrv=" + this.hrv + ", type=" + this.type + ", stress=" + this.stress + ", stressState=" + this.stressState + ", display=" + this.display + ")";
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

    @Nullable
    public final List<DataListBean> getDataList() {
        return this.dataList;
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

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDataList(@Nullable List<DataListBean> list) {
        this.dataList = list;
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

    @NotNull
    public String toString() {
        return "PhysicalMentalPOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataList=" + this.dataList + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
