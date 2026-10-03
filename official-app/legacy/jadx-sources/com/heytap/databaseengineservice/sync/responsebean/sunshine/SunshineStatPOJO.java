package com.heytap.databaseengineservice.sync.responsebean.sunshine;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/SunshineStatPOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", hp6.DETAIL_ENTRY, "", "Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/SunshineStatPOJO$DataListBean;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "toString", "DataListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SunshineStatPOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;

    @Nullable
    private List<DataListBean> details;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/SunshineStatPOJO$DataListBean;", "", "()V", "avgVD", "", "getAvgVD", "()I", "setAvgVD", "(I)V", "date", "getDate", "setDate", "goalComplete", "getGoalComplete", "setGoalComplete", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "targetDuration", "getTargetDuration", "setTargetDuration", "totalDuration", "getTotalDuration", "setTotalDuration", "vitaminD", "getVitaminD", "setVitaminD", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataListBean {
        private int avgVD;
        private int date;
        private int goalComplete;
        private long modifiedTimestamp;
        private int targetDuration;
        private int totalDuration;
        private int vitaminD;

        public final int getAvgVD() {
            return this.avgVD;
        }

        public final int getDate() {
            return this.date;
        }

        public final int getGoalComplete() {
            return this.goalComplete;
        }

        public final long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public final int getTargetDuration() {
            return this.targetDuration;
        }

        public final int getTotalDuration() {
            return this.totalDuration;
        }

        public final int getVitaminD() {
            return this.vitaminD;
        }

        public final void setAvgVD(int i) {
            this.avgVD = i;
        }

        public final void setDate(int i) {
            this.date = i;
        }

        public final void setGoalComplete(int i) {
            this.goalComplete = i;
        }

        public final void setModifiedTimestamp(long j2) {
            this.modifiedTimestamp = j2;
        }

        public final void setTargetDuration(int i) {
            this.targetDuration = i;
        }

        public final void setTotalDuration(int i) {
            this.totalDuration = i;
        }

        public final void setVitaminD(int i) {
            this.vitaminD = i;
        }

        @NotNull
        public String toString() {
            return "DataListBean(totalDuration=" + this.totalDuration + ", targetDuration=" + this.targetDuration + ", vitaminD=" + this.vitaminD + ", avgVD=" + this.avgVD + ", goalComplete=" + this.goalComplete + ", modifiedTimestamp=" + this.modifiedTimestamp + ", date=" + this.date + ")";
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
        return "SunshineStatPOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", details=" + this.details + ")";
    }
}
