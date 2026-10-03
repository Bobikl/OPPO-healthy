package com.heytap.databaseengineservice.sync.responsebean.sunshine;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.sunshine.DBVitamin;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/VitaminPOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", hp6.DETAIL_ENTRY, "", "Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/VitaminPOJO$DataListBean;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "toString", "DataListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VitaminPOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;

    @Nullable
    private List<DataListBean> details;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sunshine/VitaminPOJO$DataListBean;", "", "()V", DBVitamin.DOSAGE, "", "getDosage", "()I", "setDosage", "(I)V", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "source", "getSource", "setSource", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "vitaminNameCode", "getVitaminNameCode", "setVitaminNameCode", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DataListBean {
        private int dosage;
        private long modifiedTimestamp;
        private int source;
        private long startTimestamp;
        private int vitaminNameCode;

        public final int getDosage() {
            return this.dosage;
        }

        public final long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public final int getSource() {
            return this.source;
        }

        public final long getStartTimestamp() {
            return this.startTimestamp;
        }

        public final int getVitaminNameCode() {
            return this.vitaminNameCode;
        }

        public final void setDosage(int i) {
            this.dosage = i;
        }

        public final void setModifiedTimestamp(long j2) {
            this.modifiedTimestamp = j2;
        }

        public final void setSource(int i) {
            this.source = i;
        }

        public final void setStartTimestamp(long j2) {
            this.startTimestamp = j2;
        }

        public final void setVitaminNameCode(int i) {
            this.vitaminNameCode = i;
        }

        @NotNull
        public String toString() {
            return "DataListBean(vitaminNameCode=" + this.vitaminNameCode + ", dosage=" + this.dosage + ", source=" + this.source + ", modifiedTimestamp=" + this.modifiedTimestamp + ", startTimestamp=" + this.startTimestamp + ")";
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
        return "VitaminPOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", details=" + this.details + ")";
    }
}
