package com.heytap.health.insight.data.datasource.sp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\u0010R\u001e\u0010 \u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR\u001e\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\u0010R\u0016\u0010&\u001a\u00020\u00158\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001e\u00101\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001e\u00104\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u001e\u00107\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001e\u0010:\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R\u001e\u0010=\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R\u001e\u0010@\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0017\"\u0004\bB\u0010\u0019R\u001e\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\u0010R\u001e\u0010F\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0017\"\u0004\bH\u0010\u0019R\u001e\u0010I\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\n\"\u0004\bK\u0010\fR\u001e\u0010L\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\u0010R\u001e\u0010O\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\n\"\u0004\bQ\u0010\fR\u001e\u0010R\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\u0010R\u001e\u0010U\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\n\"\u0004\bW\u0010\fR\u001e\u0010X\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010\u0010¨\u0006["}, d2 = {"Lcom/heytap/health/insight/data/datasource/sp/InsightSpConfig;", "", "()V", "bedTime", "", "getBedTime", "()J", "calorieLastShow", "", "getCalorieLastShow", "()I", "setCalorieLastShow", "(I)V", "calorieLastShowTime", "getCalorieLastShowTime", "setCalorieLastShowTime", "(J)V", "crossAnaLastModifiedTime", "getCrossAnaLastModifiedTime", "setCrossAnaLastModifiedTime", "crossAnaNotifyFreq", "", "getCrossAnaNotifyFreq", "()Ljava/lang/String;", "setCrossAnaNotifyFreq", "(Ljava/lang/String;)V", "hrLastShow", "getHrLastShow", "setHrLastShow", "hrLastShowTime", "getHrLastShowTime", "setHrLastShowTime", "hrvLastShow", "getHrvLastShow", "setHrvLastShow", "hrvLastShowTime", "getHrvLastShowTime", "setHrvLastShowTime", "insightFeedback", "getInsightFeedback", "notifyConsumptionTrend", "", "getNotifyConsumptionTrend", "()Z", "setNotifyConsumptionTrend", "(Z)V", "notifyHeartRateTrend", "getNotifyHeartRateTrend", "setNotifyHeartRateTrend", "notifyPhysicalMentalState", "getNotifyPhysicalMentalState", "setNotifyPhysicalMentalState", "notifySleepTrend", "getNotifySleepTrend", "setNotifySleepTrend", "notifySleepVitalSigns", "getNotifySleepVitalSigns", "setNotifySleepVitalSigns", "notifyStepTrend", "getNotifyStepTrend", "setNotifyStepTrend", "notifyWristTemperature", "getNotifyWristTemperature", "setNotifyWristTemperature", "signsFeverUnBase", "getSignsFeverUnBase", "setSignsFeverUnBase", "signsLastModifiedTime", "getSignsLastModifiedTime", "setSignsLastModifiedTime", "singleDimenNotifyFreq", "getSingleDimenNotifyFreq", "setSingleDimenNotifyFreq", "sleepLastShow", "getSleepLastShow", "setSleepLastShow", "sleepLastShowTime", "getSleepLastShowTime", "setSleepLastShowTime", "snoreLastShow", "getSnoreLastShow", "setSnoreLastShow", "snoreLastShowTime", "getSnoreLastShowTime", "setSnoreLastShowTime", "stepLastShow", "getStepLastShow", "setStepLastShow", "stepLastShowTime", "getStepLastShowTime", "setStepLastShowTime", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InsightSpConfig {
    public static final int $stable = 8;
    private long crossAnaLastModifiedTime;
    private boolean notifyConsumptionTrend;
    private boolean notifyStepTrend;
    private long signsLastModifiedTime;

    @NotNull
    private String singleDimenNotifyFreq = "";

    @NotNull
    private String crossAnaNotifyFreq = "";

    @NotNull
    private String signsFeverUnBase = "";
    private int stepLastShow = -1;
    private long stepLastShowTime = -1;
    private int calorieLastShow = -1;
    private long calorieLastShowTime = -1;
    private int sleepLastShow = -1;
    private long sleepLastShowTime = -1;
    private int snoreLastShow = -1;
    private long snoreLastShowTime = -1;
    private int hrLastShow = -1;
    private long hrLastShowTime = -1;
    private int hrvLastShow = -1;
    private long hrvLastShowTime = -1;

    @NotNull
    private final String insightFeedback = "";
    private final long bedTime = -1;
    private boolean notifyWristTemperature = true;
    private boolean notifySleepVitalSigns = true;
    private boolean notifySleepTrend = true;
    private boolean notifyHeartRateTrend = true;
    private boolean notifyPhysicalMentalState = true;

    public final long getBedTime() {
        return this.bedTime;
    }

    public final int getCalorieLastShow() {
        return this.calorieLastShow;
    }

    public final long getCalorieLastShowTime() {
        return this.calorieLastShowTime;
    }

    public final long getCrossAnaLastModifiedTime() {
        return this.crossAnaLastModifiedTime;
    }

    @NotNull
    public final String getCrossAnaNotifyFreq() {
        return this.crossAnaNotifyFreq;
    }

    public final int getHrLastShow() {
        return this.hrLastShow;
    }

    public final long getHrLastShowTime() {
        return this.hrLastShowTime;
    }

    public final int getHrvLastShow() {
        return this.hrvLastShow;
    }

    public final long getHrvLastShowTime() {
        return this.hrvLastShowTime;
    }

    @NotNull
    public final String getInsightFeedback() {
        return this.insightFeedback;
    }

    public final boolean getNotifyConsumptionTrend() {
        return this.notifyConsumptionTrend;
    }

    public final boolean getNotifyHeartRateTrend() {
        return this.notifyHeartRateTrend;
    }

    public final boolean getNotifyPhysicalMentalState() {
        return this.notifyPhysicalMentalState;
    }

    public final boolean getNotifySleepTrend() {
        return this.notifySleepTrend;
    }

    public final boolean getNotifySleepVitalSigns() {
        return this.notifySleepVitalSigns;
    }

    public final boolean getNotifyStepTrend() {
        return this.notifyStepTrend;
    }

    public final boolean getNotifyWristTemperature() {
        return this.notifyWristTemperature;
    }

    @NotNull
    public final String getSignsFeverUnBase() {
        return this.signsFeverUnBase;
    }

    public final long getSignsLastModifiedTime() {
        return this.signsLastModifiedTime;
    }

    @NotNull
    public final String getSingleDimenNotifyFreq() {
        return this.singleDimenNotifyFreq;
    }

    public final int getSleepLastShow() {
        return this.sleepLastShow;
    }

    public final long getSleepLastShowTime() {
        return this.sleepLastShowTime;
    }

    public final int getSnoreLastShow() {
        return this.snoreLastShow;
    }

    public final long getSnoreLastShowTime() {
        return this.snoreLastShowTime;
    }

    public final int getStepLastShow() {
        return this.stepLastShow;
    }

    public final long getStepLastShowTime() {
        return this.stepLastShowTime;
    }

    public final void setCalorieLastShow(int i) {
        this.calorieLastShow = i;
    }

    public final void setCalorieLastShowTime(long j2) {
        this.calorieLastShowTime = j2;
    }

    public final void setCrossAnaLastModifiedTime(long j2) {
        this.crossAnaLastModifiedTime = j2;
    }

    public final void setCrossAnaNotifyFreq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.crossAnaNotifyFreq = str;
    }

    public final void setHrLastShow(int i) {
        this.hrLastShow = i;
    }

    public final void setHrLastShowTime(long j2) {
        this.hrLastShowTime = j2;
    }

    public final void setHrvLastShow(int i) {
        this.hrvLastShow = i;
    }

    public final void setHrvLastShowTime(long j2) {
        this.hrvLastShowTime = j2;
    }

    public final void setNotifyConsumptionTrend(boolean z) {
        this.notifyConsumptionTrend = z;
    }

    public final void setNotifyHeartRateTrend(boolean z) {
        this.notifyHeartRateTrend = z;
    }

    public final void setNotifyPhysicalMentalState(boolean z) {
        this.notifyPhysicalMentalState = z;
    }

    public final void setNotifySleepTrend(boolean z) {
        this.notifySleepTrend = z;
    }

    public final void setNotifySleepVitalSigns(boolean z) {
        this.notifySleepVitalSigns = z;
    }

    public final void setNotifyStepTrend(boolean z) {
        this.notifyStepTrend = z;
    }

    public final void setNotifyWristTemperature(boolean z) {
        this.notifyWristTemperature = z;
    }

    public final void setSignsFeverUnBase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.signsFeverUnBase = str;
    }

    public final void setSignsLastModifiedTime(long j2) {
        this.signsLastModifiedTime = j2;
    }

    public final void setSingleDimenNotifyFreq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.singleDimenNotifyFreq = str;
    }

    public final void setSleepLastShow(int i) {
        this.sleepLastShow = i;
    }

    public final void setSleepLastShowTime(long j2) {
        this.sleepLastShowTime = j2;
    }

    public final void setSnoreLastShow(int i) {
        this.snoreLastShow = i;
    }

    public final void setSnoreLastShowTime(long j2) {
        this.snoreLastShowTime = j2;
    }

    public final void setStepLastShow(int i) {
        this.stepLastShow = i;
    }

    public final void setStepLastShowTime(long j2) {
        this.stepLastShowTime = j2;
    }
}
