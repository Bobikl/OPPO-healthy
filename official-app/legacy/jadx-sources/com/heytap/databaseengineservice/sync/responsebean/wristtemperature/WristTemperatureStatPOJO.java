package com.heytap.databaseengineservice.sync.responsebean.wristtemperature;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\b¨\u00061"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/wristtemperature/WristTemperatureStatPOJO;", "", "()V", DBWristTemperatureStat.ACTIONS, "", "getActions", "()I", "setActions", "(I)V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "confidence", "getConfidence", "setConfidence", "dataClient", "getDataClient", "setDataClient", "date", "getDate", "setDate", "dateBaseLineWristTemperature", "getDateBaseLineWristTemperature", "setDateBaseLineWristTemperature", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", DBWristTemperatureStat.SYMPTOMS, "getSymptoms", "setSymptoms", "temperatureDownRange", "getTemperatureDownRange", "setTemperatureDownRange", "temperatureUpRange", "getTemperatureUpRange", "setTemperatureUpRange", "updateTimestamp", "getUpdateTimestamp", "setUpdateTimestamp", "wristTemperature", "getWristTemperature", "setWristTemperature", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WristTemperatureStatPOJO {
    private int actions;

    @Nullable
    private String clientModel;
    private int confidence;

    @Nullable
    private String dataClient;
    private int date;
    private int dateBaseLineWristTemperature;
    private long modifiedTimestamp;
    private int symptoms;
    private int temperatureDownRange;
    private int temperatureUpRange;
    private long updateTimestamp;
    private int wristTemperature;

    public final int getActions() {
        return this.actions;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDateBaseLineWristTemperature() {
        return this.dateBaseLineWristTemperature;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getSymptoms() {
        return this.symptoms;
    }

    public final int getTemperatureDownRange() {
        return this.temperatureDownRange;
    }

    public final int getTemperatureUpRange() {
        return this.temperatureUpRange;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int getWristTemperature() {
        return this.wristTemperature;
    }

    public final void setActions(int i) {
        this.actions = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setConfidence(int i) {
        this.confidence = i;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDateBaseLineWristTemperature(int i) {
        this.dateBaseLineWristTemperature = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSymptoms(int i) {
        this.symptoms = i;
    }

    public final void setTemperatureDownRange(int i) {
        this.temperatureDownRange = i;
    }

    public final void setTemperatureUpRange(int i) {
        this.temperatureUpRange = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setWristTemperature(int i) {
        this.wristTemperature = i;
    }

    @NotNull
    public String toString() {
        return "WristTemperatureStatPOJO(dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", dateBaseLineWristTemperature=" + this.dateBaseLineWristTemperature + ", date=" + this.date + ", wristTemperature=" + this.wristTemperature + ", confidence=" + this.confidence + ", symptoms=" + this.symptoms + ", actions=" + this.actions + ", temperatureUpRange=" + this.temperatureUpRange + ", temperatureDownRange=" + this.temperatureDownRange + ", updateTimestamp=" + this.updateTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
