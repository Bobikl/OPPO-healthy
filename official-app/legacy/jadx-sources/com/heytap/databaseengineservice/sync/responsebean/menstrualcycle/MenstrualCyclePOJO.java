package com.heytap.databaseengineservice.sync.responsebean.menstrualcycle;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001a¨\u0006%"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/menstrualcycle/MenstrualCyclePOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "closeType", "", "getCloseType", "()I", "setCloseType", "(I)V", "dataClient", "getDataClient", "setDataClient", "display", "getDisplay", "setDisplay", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "updateTimestamp", "getUpdateTimestamp", "setUpdateTimestamp", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenstrualCyclePOJO {

    @Nullable
    private String clientModel;
    private int closeType;

    @Nullable
    private String dataClient;
    private int display;
    private long endTimestamp;
    private long modifiedTimestamp;
    private long startTimestamp;
    private long updateTimestamp;

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    public final int getCloseType() {
        return this.closeType;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDisplay() {
        return this.display;
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

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setCloseType(int i) {
        this.closeType = i;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDisplay(int i) {
        this.display = i;
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

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "MenstrualCyclePOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", closeType=" + this.closeType + ", updateTimestamp=" + this.updateTimestamp + ", display=" + this.display + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
