package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017¨\u0006."}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/CervicalSpinePOJO;", "", "()V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "goodSeconds", "", "getGoodSeconds", "()I", "setGoodSeconds", "(I)V", "heavySeconds", "getHeavySeconds", "setHeavySeconds", "lowHeadPercent", "getLowHeadPercent", "setLowHeadPercent", "lowHeadSeconds", "getLowHeadSeconds", "setLowHeadSeconds", "mildSeconds", "getMildSeconds", "setMildSeconds", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "wearSeconds", "getWearSeconds", "setWearSeconds", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CervicalSpinePOJO {

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;
    private long endTimestamp;
    private int goodSeconds;
    private int heavySeconds;
    private int lowHeadPercent;
    private int lowHeadSeconds;
    private int mildSeconds;
    private long modifiedTimestamp;
    private long startTimestamp;
    private int wearSeconds;

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    public final int getLowHeadPercent() {
        return this.lowHeadPercent;
    }

    public final int getLowHeadSeconds() {
        return this.lowHeadSeconds;
    }

    public final int getMildSeconds() {
        return this.mildSeconds;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getWearSeconds() {
        return this.wearSeconds;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setGoodSeconds(int i) {
        this.goodSeconds = i;
    }

    public final void setHeavySeconds(int i) {
        this.heavySeconds = i;
    }

    public final void setLowHeadPercent(int i) {
        this.lowHeadPercent = i;
    }

    public final void setLowHeadSeconds(int i) {
        this.lowHeadSeconds = i;
    }

    public final void setMildSeconds(int i) {
        this.mildSeconds = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setWearSeconds(int i) {
        this.wearSeconds = i;
    }

    @NotNull
    public String toString() {
        return "CervicalSpinePOJO(startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", lowHeadSeconds=" + this.lowHeadSeconds + ", wearSeconds=" + this.wearSeconds + ", goodSeconds=" + this.goodSeconds + ", mildSeconds=" + this.mildSeconds + ", heavySeconds=" + this.heavySeconds + ", lowHeadPercent=" + this.lowHeadPercent + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
