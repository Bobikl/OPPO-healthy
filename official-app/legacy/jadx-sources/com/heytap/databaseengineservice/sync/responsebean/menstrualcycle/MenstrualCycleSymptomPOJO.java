package com.heytap.databaseengineservice.sync.responsebean.menstrualcycle;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006%"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/menstrualcycle/MenstrualCycleSymptomPOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "dataCreatedTimestamp", "", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "display", "", "getDisplay", "()I", "setDisplay", "(I)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "type", "getType", "setType", "updateTimestamp", "getUpdateTimestamp", "setUpdateTimestamp", "value", "getValue", "setValue", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenstrualCycleSymptomPOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;
    private long dataCreatedTimestamp;
    private int display;
    private long modifiedTimestamp;
    private int type;
    private long updateTimestamp;
    private int value;

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "MenstrualCycleSymptomPOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", type=" + this.type + ", value=" + this.value + ", updateTimestamp=" + this.updateTimestamp + ", display=" + this.display + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
