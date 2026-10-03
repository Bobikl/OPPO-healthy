package com.heytap.databaseengineservice.sync.responsebean.bloodsugar;

import androidx.annotation.Keep;
import com.heytap.databaseengine.apiv3.data.Element;
import com.oplus.aiunit.vision.v05;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010B\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u001a\u00109\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R\u001a\u0010<\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010\u0017¨\u0006C"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/bloodsugar/BloodSugarStatPOJO;", "", "()V", Element.ELEMENT_NAME_AVERAGE, "", "getAverage", "()D", "setAverage", "(D)V", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "date", "", "getDate", "()I", "setDate", "(I)V", "deviceActiveTime", "", "getDeviceActiveTime", "()J", "setDeviceActiveTime", "(J)V", "goalAchieved", "getGoalAchieved", "setGoalAchieved", "highCounts", "getHighCounts", "setHighCounts", "highThreshold", "getHighThreshold", "setHighThreshold", "lowCounts", "getLowCounts", "setLowCounts", "lowThreshold", "getLowThreshold", "setLowThreshold", "max", "getMax", "setMax", "min", "getMin", "setMin", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "normalCounts", "getNormalCounts", "setNormalCounts", "normalPercent", "getNormalPercent", "setNormalPercent", "timezone", "getTimezone", "setTimezone", "warningCounts", "getWarningCounts", "setWarningCounts", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BloodSugarStatPOJO {
    private double average;
    private int date;
    private long deviceActiveTime;
    private int goalAchieved;
    private int highCounts;
    private double highThreshold;
    private int lowCounts;
    private double lowThreshold;
    private double max;
    private double min;
    private long modifiedTimestamp;
    private int normalCounts;
    private int normalPercent;

    @NotNull
    private String timezone;
    private int warningCounts;

    @NotNull
    private String dataClient = "";

    @NotNull
    private String clientModel = "";

    public BloodSugarStatPOJO() {
        String strR = v05.r(null);
        Intrinsics.checkNotNullExpressionValue(strR, "getTimeZone(null)");
        this.timezone = strR;
    }

    public final double getAverage() {
        return this.average;
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

    public final long getDeviceActiveTime() {
        return this.deviceActiveTime;
    }

    public final int getGoalAchieved() {
        return this.goalAchieved;
    }

    public final int getHighCounts() {
        return this.highCounts;
    }

    public final double getHighThreshold() {
        return this.highThreshold;
    }

    public final int getLowCounts() {
        return this.lowCounts;
    }

    public final double getLowThreshold() {
        return this.lowThreshold;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getNormalCounts() {
        return this.normalCounts;
    }

    public final int getNormalPercent() {
        return this.normalPercent;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    public final int getWarningCounts() {
        return this.warningCounts;
    }

    public final void setAverage(double d) {
        this.average = d;
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

    public final void setDeviceActiveTime(long j2) {
        this.deviceActiveTime = j2;
    }

    public final void setGoalAchieved(int i) {
        this.goalAchieved = i;
    }

    public final void setHighCounts(int i) {
        this.highCounts = i;
    }

    public final void setHighThreshold(double d) {
        this.highThreshold = d;
    }

    public final void setLowCounts(int i) {
        this.lowCounts = i;
    }

    public final void setLowThreshold(double d) {
        this.lowThreshold = d;
    }

    public final void setMax(double d) {
        this.max = d;
    }

    public final void setMin(double d) {
        this.min = d;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setNormalCounts(int i) {
        this.normalCounts = i;
    }

    public final void setNormalPercent(int i) {
        this.normalPercent = i;
    }

    public final void setTimezone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timezone = str;
    }

    public final void setWarningCounts(int i) {
        this.warningCounts = i;
    }

    @NotNull
    public String toString() {
        return "BloodSugarStatPOJO(dataClient='" + this.dataClient + "', clientModel='" + this.clientModel + "', date=" + this.date + ", timezone='" + this.timezone + "', average=" + this.average + ", min=" + this.min + ", max=" + this.max + ", warningCounts=" + this.warningCounts + ", highCounts=" + this.highCounts + ", normalCounts=" + this.normalCounts + ", lowCounts=" + this.lowCounts + ", normalPercent=" + this.normalPercent + ", lowThreshold=" + this.lowThreshold + ", highThreshold=" + this.highThreshold + ", goalAchieved=" + this.goalAchieved + ", deviceActiveTime=" + this.deviceActiveTime + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
