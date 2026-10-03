package com.heytap.databaseengineservice.sync.responsebean.sunshine;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/SunshineDetailPOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", hp6.DETAIL_ENTRY, "", "Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/SunshineDetailPOJO$DataListBean;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "toString", "DataListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SunshineDetailPOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;

    @Nullable
    private List<DataListBean> details;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/SunshineDetailPOJO$DataListBean;", "", "()V", "display", "", "getDisplay", "()I", "setDisplay", "(I)V", "lightIntensity", "getLightIntensity", "()Ljava/lang/Integer;", "setLightIntensity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "sunBathing", "getSunBathing", "setSunBathing", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataListBean {
        private int display;

        @Nullable
        private Integer lightIntensity;
        private long modifiedTimestamp;
        private long startTimestamp;

        @Nullable
        private Integer sunBathing;

        public final int getDisplay() {
            return this.display;
        }

        @Nullable
        public final Integer getLightIntensity() {
            return this.lightIntensity;
        }

        public final long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public final long getStartTimestamp() {
            return this.startTimestamp;
        }

        @Nullable
        public final Integer getSunBathing() {
            return this.sunBathing;
        }

        public final void setDisplay(int i) {
            this.display = i;
        }

        public final void setLightIntensity(@Nullable Integer num) {
            this.lightIntensity = num;
        }

        public final void setModifiedTimestamp(long j2) {
            this.modifiedTimestamp = j2;
        }

        public final void setStartTimestamp(long j2) {
            this.startTimestamp = j2;
        }

        public final void setSunBathing(@Nullable Integer num) {
            this.sunBathing = num;
        }

        @NotNull
        public String toString() {
            return "DataListBean(sunBathing=" + this.sunBathing + ", lightIntensity=" + this.lightIntensity + ", startTimestamp=" + this.startTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + ", display=" + this.display + ")";
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
    public final List<DataListBean> getDetails() {
        return this.details;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDetails(@Nullable List<DataListBean> list) {
        this.details = list;
    }

    @NotNull
    public String toString() {
        return "SunshineDetailPOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", details=" + this.details + ")";
    }
}
