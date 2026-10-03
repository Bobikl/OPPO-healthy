package com.heytap.databaseengineservice.sync.responsebean.snore;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaSummarize;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010E\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\"\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001a\u0010B\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000e¨\u0006F"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/snore/SnoreOsaSumPOJO;", "", "()V", DBSnoreOsaSummarize.AI, "", "getAi", "()D", "setAi", "(D)V", "audioStates", "", "getAudioStates", "()I", "setAudioStates", "(I)V", "dataClient", "", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "dataCreatedTimestamp", "", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "meanRespRate", "getMeanRespRate", "setMeanRespRate", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "recordEndTimestamp", "getRecordEndTimestamp", "setRecordEndTimestamp", "recordStartTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", DBSnoreOsaSummarize.REI, "getRei", "setRei", "resultCode", "getResultCode", "setResultCode", "silencedRatio", "getSilencedRatio", "setSilencedRatio", "silencedTime", "getSilencedTime", "setSilencedTime", "snoreFeats", "", "getSnoreFeats", "()Ljava/util/List;", "setSnoreFeats", "(Ljava/util/List;)V", "snoreFreq", "getSnoreFreq", "setSnoreFreq", "snoreNum", "getSnoreNum", "setSnoreNum", "totalSignalLen", "getTotalSignalLen", "setTotalSignalLen", "validSignalLen", "getValidSignalLen", "setValidSignalLen", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreOsaSumPOJO {
    private double ai;
    private int audioStates;

    @Nullable
    private String dataClient;
    private long dataCreatedTimestamp;
    private double meanRespRate;
    private long modifiedTimestamp;
    private long recordEndTimestamp;
    private long recordStartTimestamp;
    private double rei;
    private int resultCode;
    private int silencedRatio;
    private int silencedTime;

    @Nullable
    private List<Double> snoreFeats;
    private double snoreFreq;
    private int snoreNum;
    private int totalSignalLen;
    private int validSignalLen;

    public final double getAi() {
        return this.ai;
    }

    public final int getAudioStates() {
        return this.audioStates;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final double getMeanRespRate() {
        return this.meanRespRate;
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

    public final double getRei() {
        return this.rei;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getSilencedRatio() {
        return this.silencedRatio;
    }

    public final int getSilencedTime() {
        return this.silencedTime;
    }

    @Nullable
    public final List<Double> getSnoreFeats() {
        return this.snoreFeats;
    }

    public final double getSnoreFreq() {
        return this.snoreFreq;
    }

    public final int getSnoreNum() {
        return this.snoreNum;
    }

    public final int getTotalSignalLen() {
        return this.totalSignalLen;
    }

    public final int getValidSignalLen() {
        return this.validSignalLen;
    }

    public final void setAi(double d) {
        this.ai = d;
    }

    public final void setAudioStates(int i) {
        this.audioStates = i;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setMeanRespRate(double d) {
        this.meanRespRate = d;
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

    public final void setRei(double d) {
        this.rei = d;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setSilencedRatio(int i) {
        this.silencedRatio = i;
    }

    public final void setSilencedTime(int i) {
        this.silencedTime = i;
    }

    public final void setSnoreFeats(@Nullable List<Double> list) {
        this.snoreFeats = list;
    }

    public final void setSnoreFreq(double d) {
        this.snoreFreq = d;
    }

    public final void setSnoreNum(int i) {
        this.snoreNum = i;
    }

    public final void setTotalSignalLen(int i) {
        this.totalSignalLen = i;
    }

    public final void setValidSignalLen(int i) {
        this.validSignalLen = i;
    }

    @NotNull
    public String toString() {
        return "SnoreOsaSumPOJO(dataClient=" + this.dataClient + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", resultCode=" + this.resultCode + ", ai=" + this.ai + ", rei=" + this.rei + ", snoreNum=" + this.snoreNum + ", validSignalLen=" + this.validSignalLen + ", snoreFreq=" + this.snoreFreq + ", totalSignalLen=" + this.totalSignalLen + ", meanRespRate=" + this.meanRespRate + ", snoreFeats=" + this.snoreFeats + ", silencedRatio=" + this.silencedRatio + ", silencedTime=" + this.silencedTime + ", audioStates=" + this.audioStates + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
