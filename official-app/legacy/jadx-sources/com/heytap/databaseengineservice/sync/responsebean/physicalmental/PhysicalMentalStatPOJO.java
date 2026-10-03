package com.heytap.databaseengineservice.sync.responsebean.physicalmental;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010Z\u001a\u00020\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\u001a\u0010Q\u001a\u00020@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010B\"\u0004\bS\u0010DR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001e\u0010W\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bX\u0010\u000b\"\u0004\bY\u0010\r¨\u0006["}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/physicalmental/PhysicalMentalStatPOJO;", "", "()V", "avgHrv", "", "getAvgHrv", "()I", "setAvgHrv", "(I)V", "avgRestingHeartRate", "getAvgRestingHeartRate", "()Ljava/lang/Integer;", "setAvgRestingHeartRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "avgSleepHrv", "getAvgSleepHrv", "setAvgSleepHrv", "avgStress", "getAvgStress", "setAvgStress", "baseHrv", "getBaseHrv", "setBaseHrv", "baseLineHigh", "getBaseLineHigh", "setBaseLineHigh", "baseLineLow", "getBaseLineLow", "setBaseLineLow", "baseLineMiddle", "getBaseLineMiddle", "setBaseLineMiddle", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "date", "getDate", "setDate", "display", "getDisplay", "setDisplay", "hrvReasonableRangeHigh", "getHrvReasonableRangeHigh", "setHrvReasonableRangeHigh", "hrvReasonableRangeLow", "getHrvReasonableRangeLow", "setHrvReasonableRangeLow", "maxHrv", "getMaxHrv", "setMaxHrv", "maxSleepHrv", "getMaxSleepHrv", "setMaxSleepHrv", "maxStress", "getMaxStress", "setMaxStress", "maxStressTimestamp", "", "getMaxStressTimestamp", "()J", "setMaxStressTimestamp", "(J)V", "minHrv", "getMinHrv", "setMinHrv", "minSleepHrv", "getMinSleepHrv", "setMinSleepHrv", "minStress", "getMinStress", "setMinStress", "minStressTimestamp", "getMinStressTimestamp", "setMinStressTimestamp", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "stressReminder", "getStressReminder", "setStressReminder", "stressState", "getStressState", "setStressState", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhysicalMentalStatPOJO {
    private int avgHrv;

    @Nullable
    private Integer avgRestingHeartRate;
    private int avgSleepHrv;
    private int avgStress;
    private int baseHrv;
    private int baseLineHigh;
    private int baseLineLow;
    private int baseLineMiddle;
    private int date;
    private int display;
    private int hrvReasonableRangeHigh;
    private int hrvReasonableRangeLow;
    private int maxHrv;
    private int maxSleepHrv;
    private int maxStress;
    private long maxStressTimestamp;
    private int minHrv;
    private int minSleepHrv;
    private int minStress;
    private long minStressTimestamp;
    private long modifiedTimestamp;
    private int stressReminder;

    @Nullable
    private Integer stressState;

    @NotNull
    private String dataClient = "";

    @NotNull
    private String clientModel = "";

    public final int getAvgHrv() {
        return this.avgHrv;
    }

    @Nullable
    public final Integer getAvgRestingHeartRate() {
        return this.avgRestingHeartRate;
    }

    public final int getAvgSleepHrv() {
        return this.avgSleepHrv;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final int getBaseHrv() {
        return this.baseHrv;
    }

    public final int getBaseLineHigh() {
        return this.baseLineHigh;
    }

    public final int getBaseLineLow() {
        return this.baseLineLow;
    }

    public final int getBaseLineMiddle() {
        return this.baseLineMiddle;
    }

    @NotNull
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final int getHrvReasonableRangeHigh() {
        return this.hrvReasonableRangeHigh;
    }

    public final int getHrvReasonableRangeLow() {
        return this.hrvReasonableRangeLow;
    }

    public final int getMaxHrv() {
        return this.maxHrv;
    }

    public final int getMaxSleepHrv() {
        return this.maxSleepHrv;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final long getMaxStressTimestamp() {
        return this.maxStressTimestamp;
    }

    public final int getMinHrv() {
        return this.minHrv;
    }

    public final int getMinSleepHrv() {
        return this.minSleepHrv;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    public final long getMinStressTimestamp() {
        return this.minStressTimestamp;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getStressReminder() {
        return this.stressReminder;
    }

    @Nullable
    public final Integer getStressState() {
        return this.stressState;
    }

    public final void setAvgHrv(int i) {
        this.avgHrv = i;
    }

    public final void setAvgRestingHeartRate(@Nullable Integer num) {
        this.avgRestingHeartRate = num;
    }

    public final void setAvgSleepHrv(int i) {
        this.avgSleepHrv = i;
    }

    public final void setAvgStress(int i) {
        this.avgStress = i;
    }

    public final void setBaseHrv(int i) {
        this.baseHrv = i;
    }

    public final void setBaseLineHigh(int i) {
        this.baseLineHigh = i;
    }

    public final void setBaseLineLow(int i) {
        this.baseLineLow = i;
    }

    public final void setBaseLineMiddle(int i) {
        this.baseLineMiddle = i;
    }

    public final void setClientModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setHrvReasonableRangeHigh(int i) {
        this.hrvReasonableRangeHigh = i;
    }

    public final void setHrvReasonableRangeLow(int i) {
        this.hrvReasonableRangeLow = i;
    }

    public final void setMaxHrv(int i) {
        this.maxHrv = i;
    }

    public final void setMaxSleepHrv(int i) {
        this.maxSleepHrv = i;
    }

    public final void setMaxStress(int i) {
        this.maxStress = i;
    }

    public final void setMaxStressTimestamp(long j2) {
        this.maxStressTimestamp = j2;
    }

    public final void setMinHrv(int i) {
        this.minHrv = i;
    }

    public final void setMinSleepHrv(int i) {
        this.minSleepHrv = i;
    }

    public final void setMinStress(int i) {
        this.minStress = i;
    }

    public final void setMinStressTimestamp(long j2) {
        this.minStressTimestamp = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setStressReminder(int i) {
        this.stressReminder = i;
    }

    public final void setStressState(@Nullable Integer num) {
        this.stressState = num;
    }

    @NotNull
    public String toString() {
        return "PhysicalMentalStatPOJO(dataClient='" + this.dataClient + "', clientModel='" + this.clientModel + "', date=" + this.date + ", avgHrv=" + this.avgHrv + ", minHrv=" + this.minHrv + ", maxHrv=" + this.maxHrv + ", avgStress=" + this.avgStress + ", minStress=" + this.minStress + ", minStressTimestamp=" + this.minStressTimestamp + ", maxStress=" + this.maxStress + ", maxStressTimestamp=" + this.maxStressTimestamp + ", stressState=" + this.stressState + ", baseLineLow=" + this.baseLineLow + ", baseLineMiddle=" + this.baseLineMiddle + ", baseLineHigh=" + this.baseLineHigh + ", baseHrv=" + this.baseHrv + ", avgSleepHrv=" + this.avgSleepHrv + ", minSleepHrv=" + this.minSleepHrv + ", maxSleepHrv=" + this.maxSleepHrv + ", hrvReasonableRangeLow=" + this.hrvReasonableRangeLow + ", hrvReasonableRangeHigh=" + this.hrvReasonableRangeHigh + ", avgRestingHeartRate=" + this.avgRestingHeartRate + ", stressReminder=" + this.stressReminder + ", display=" + this.display + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
