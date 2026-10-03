package com.heytap.health.device.sportrecord.bean;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.store.apm.PageTrackBean;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001:\u0004]^_`B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\\\u001a\u00020\u001fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010!\"\u0004\b@\u0010#R\u001c\u0010A\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001a\u0010D\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR\u001a\u0010G\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR\u001c\u0010J\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010!\"\u0004\bL\u0010#R\u001a\u0010M\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\bR\u001a\u0010P\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR\u001a\u0010S\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001a\u0010V\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\u001a\u0010Y\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\b¨\u0006a"}, d2 = {"Lcom/heytap/health/device/sportrecord/bean/SportRecordV2;", "", "()V", "achievePercent", "", "getAchievePercent", "()I", "setAchievePercent", "(I)V", "avgFrequency", "getAvgFrequency", "setAvgFrequency", "avgHeartRate", "getAvgHeartRate", "setAvgHeartRate", "avgSpeed", "getAvgSpeed", "setAvgSpeed", "detailData", "Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$DetailData;", "getDetailData", "()Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$DetailData;", "setDetailData", "(Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$DetailData;)V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "extra", "", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "gpsData", "Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$GpsData;", "getGpsData", "()Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$GpsData;", "setGpsData", "(Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$GpsData;)V", "isIWatchRecord", "", "()Z", "setIWatchRecord", "(Z)V", "maxSpeed", "getMaxSpeed", "setMaxSpeed", "recoveryHR", "Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$RecoveryHR;", "getRecoveryHR", "()Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$RecoveryHR;", "setRecoveryHR", "(Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$RecoveryHR;)V", "segmentData", "Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$SegmentData;", "getSegmentData", "()Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$SegmentData;", "setSegmentData", "(Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$SegmentData;)V", "sportId", "getSportId", "setSportId", "sportName", "getSportName", "setSportName", "sportType", "getSportType", "setSportType", "startTime", "getStartTime", "setStartTime", ConnectIdLogic.PARAM_TIMEZONE, "getTimeZone", "setTimeZone", "totalCalories", "getTotalCalories", "setTotalCalories", "totalDistance", "getTotalDistance", "setTotalDistance", "totalHeight", "getTotalHeight", "setTotalHeight", "totalSteps", "getTotalSteps", "setTotalSteps", PageTrackBean.TOTAL_TIME, "getTotalTime", "setTotalTime", "toString", "DetailData", "GpsData", "RecoveryHR", "SegmentData", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SportRecordV2 {
    private int achievePercent;
    private int avgFrequency;
    private int avgHeartRate;
    private int avgSpeed;

    @Nullable
    private DetailData detailData;
    private long endTime;

    @Nullable
    private String extra;

    @Nullable
    private GpsData gpsData;
    private boolean isIWatchRecord;
    private int maxSpeed;

    @Nullable
    private RecoveryHR recoveryHR;

    @Nullable
    private SegmentData segmentData;

    @Nullable
    private String sportId;

    @Nullable
    private String sportName;
    private int sportType;
    private long startTime;

    @Nullable
    private String timeZone;
    private int totalCalories;
    private int totalDistance;
    private int totalHeight;
    private int totalSteps;
    private int totalTime;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\bJ\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010Z\u001a\u00020[H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\b¨\u0006\\"}, d2 = {"Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$DetailData;", "", "()V", "badmintonFreq", "", "getBadmintonFreq", "()[I", "setBadmintonFreq", "([I)V", "climbSpeed", "getClimbSpeed", "setClimbSpeed", "distance", "getDistance", "setDistance", "elevation", "getElevation", "setElevation", "ellipticalFreq", "getEllipticalFreq", "setEllipticalFreq", "fatBurningRate", "getFatBurningRate", "setFatBurningRate", RecordCombinedLineChart.KEY_STEP_CADENCE, "getFrequency", "setFrequency", RecordCombinedLineChart.KEY_HEART_RATE, "getHeartRate", "setHeartRate", "heartRateConf", "getHeartRateConf", "setHeartRateConf", "hrMotionActivityState", "getHrMotionActivityState", "setHrMotionActivityState", "hrMotionGru", "getHrMotionGru", "setHrMotionGru", "hrMotionPower", "getHrMotionPower", "setHrMotionPower", "hrNnConfig", "getHrNnConfig", "setHrNnConfig", "hrPostData", "getHrPostData", "setHrPostData", "pace", "getPace", "setPace", "pace2", "getPace2", "setPace2", "rowingFreq", "getRowingFreq", "setRowingFreq", "runningPower", "getRunningPower", "setRunningPower", "stanceBalance", "getStanceBalance", "setStanceBalance", "stanceTime", "getStanceTime", "setStanceTime", "state", "getState", "setState", "steps", "getSteps", "setSteps", "stride", "getStride", "setStride", "strokeFreq", "getStrokeFreq", "setStrokeFreq", "timestamp", "", "getTimestamp", "()[J", "setTimestamp", "([J)V", "verticalOscillation", "getVerticalOscillation", "setVerticalOscillation", "verticalRatio", "getVerticalRatio", "setVerticalRatio", "toString", "", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DetailData {

        @Nullable
        private int[] badmintonFreq;

        @Nullable
        private int[] climbSpeed;

        @Nullable
        private int[] distance;

        @Nullable
        private int[] elevation;

        @Nullable
        private int[] ellipticalFreq;

        @Nullable
        private int[] fatBurningRate;

        @Nullable
        private int[] frequency;

        @Nullable
        private int[] heartRate;

        @Nullable
        private int[] heartRateConf;

        @Nullable
        private int[] hrMotionActivityState;

        @Nullable
        private int[] hrMotionGru;

        @Nullable
        private int[] hrMotionPower;

        @Nullable
        private int[] hrNnConfig;

        @Nullable
        private int[] hrPostData;

        @Nullable
        private int[] pace;

        @Nullable
        private int[] pace2;

        @Nullable
        private int[] rowingFreq;

        @Nullable
        private int[] runningPower;

        @Nullable
        private int[] stanceBalance;

        @Nullable
        private int[] stanceTime;

        @Nullable
        private int[] state;

        @Nullable
        private int[] steps;

        @Nullable
        private int[] stride;

        @Nullable
        private int[] strokeFreq;

        @Nullable
        private long[] timestamp;

        @Nullable
        private int[] verticalOscillation;

        @Nullable
        private int[] verticalRatio;

        @Nullable
        public final int[] getBadmintonFreq() {
            return this.badmintonFreq;
        }

        @Nullable
        public final int[] getClimbSpeed() {
            return this.climbSpeed;
        }

        @Nullable
        public final int[] getDistance() {
            return this.distance;
        }

        @Nullable
        public final int[] getElevation() {
            return this.elevation;
        }

        @Nullable
        public final int[] getEllipticalFreq() {
            return this.ellipticalFreq;
        }

        @Nullable
        public final int[] getFatBurningRate() {
            return this.fatBurningRate;
        }

        @Nullable
        public final int[] getFrequency() {
            return this.frequency;
        }

        @Nullable
        public final int[] getHeartRate() {
            return this.heartRate;
        }

        @Nullable
        public final int[] getHeartRateConf() {
            return this.heartRateConf;
        }

        @Nullable
        public final int[] getHrMotionActivityState() {
            return this.hrMotionActivityState;
        }

        @Nullable
        public final int[] getHrMotionGru() {
            return this.hrMotionGru;
        }

        @Nullable
        public final int[] getHrMotionPower() {
            return this.hrMotionPower;
        }

        @Nullable
        public final int[] getHrNnConfig() {
            return this.hrNnConfig;
        }

        @Nullable
        public final int[] getHrPostData() {
            return this.hrPostData;
        }

        @Nullable
        public final int[] getPace() {
            return this.pace;
        }

        @Nullable
        public final int[] getPace2() {
            return this.pace2;
        }

        @Nullable
        public final int[] getRowingFreq() {
            return this.rowingFreq;
        }

        @Nullable
        public final int[] getRunningPower() {
            return this.runningPower;
        }

        @Nullable
        public final int[] getStanceBalance() {
            return this.stanceBalance;
        }

        @Nullable
        public final int[] getStanceTime() {
            return this.stanceTime;
        }

        @Nullable
        public final int[] getState() {
            return this.state;
        }

        @Nullable
        public final int[] getSteps() {
            return this.steps;
        }

        @Nullable
        public final int[] getStride() {
            return this.stride;
        }

        @Nullable
        public final int[] getStrokeFreq() {
            return this.strokeFreq;
        }

        @Nullable
        public final long[] getTimestamp() {
            return this.timestamp;
        }

        @Nullable
        public final int[] getVerticalOscillation() {
            return this.verticalOscillation;
        }

        @Nullable
        public final int[] getVerticalRatio() {
            return this.verticalRatio;
        }

        public final void setBadmintonFreq(@Nullable int[] iArr) {
            this.badmintonFreq = iArr;
        }

        public final void setClimbSpeed(@Nullable int[] iArr) {
            this.climbSpeed = iArr;
        }

        public final void setDistance(@Nullable int[] iArr) {
            this.distance = iArr;
        }

        public final void setElevation(@Nullable int[] iArr) {
            this.elevation = iArr;
        }

        public final void setEllipticalFreq(@Nullable int[] iArr) {
            this.ellipticalFreq = iArr;
        }

        public final void setFatBurningRate(@Nullable int[] iArr) {
            this.fatBurningRate = iArr;
        }

        public final void setFrequency(@Nullable int[] iArr) {
            this.frequency = iArr;
        }

        public final void setHeartRate(@Nullable int[] iArr) {
            this.heartRate = iArr;
        }

        public final void setHeartRateConf(@Nullable int[] iArr) {
            this.heartRateConf = iArr;
        }

        public final void setHrMotionActivityState(@Nullable int[] iArr) {
            this.hrMotionActivityState = iArr;
        }

        public final void setHrMotionGru(@Nullable int[] iArr) {
            this.hrMotionGru = iArr;
        }

        public final void setHrMotionPower(@Nullable int[] iArr) {
            this.hrMotionPower = iArr;
        }

        public final void setHrNnConfig(@Nullable int[] iArr) {
            this.hrNnConfig = iArr;
        }

        public final void setHrPostData(@Nullable int[] iArr) {
            this.hrPostData = iArr;
        }

        public final void setPace(@Nullable int[] iArr) {
            this.pace = iArr;
        }

        public final void setPace2(@Nullable int[] iArr) {
            this.pace2 = iArr;
        }

        public final void setRowingFreq(@Nullable int[] iArr) {
            this.rowingFreq = iArr;
        }

        public final void setRunningPower(@Nullable int[] iArr) {
            this.runningPower = iArr;
        }

        public final void setStanceBalance(@Nullable int[] iArr) {
            this.stanceBalance = iArr;
        }

        public final void setStanceTime(@Nullable int[] iArr) {
            this.stanceTime = iArr;
        }

        public final void setState(@Nullable int[] iArr) {
            this.state = iArr;
        }

        public final void setSteps(@Nullable int[] iArr) {
            this.steps = iArr;
        }

        public final void setStride(@Nullable int[] iArr) {
            this.stride = iArr;
        }

        public final void setStrokeFreq(@Nullable int[] iArr) {
            this.strokeFreq = iArr;
        }

        public final void setTimestamp(@Nullable long[] jArr) {
            this.timestamp = jArr;
        }

        public final void setVerticalOscillation(@Nullable int[] iArr) {
            this.verticalOscillation = iArr;
        }

        public final void setVerticalRatio(@Nullable int[] iArr) {
            this.verticalRatio = iArr;
        }

        @NotNull
        public String toString() {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            String string12;
            long[] jArr = this.timestamp;
            String string13 = null;
            if (jArr != null) {
                string = Arrays.toString(jArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            } else {
                string = null;
            }
            int[] iArr = this.state;
            if (iArr != null) {
                string2 = Arrays.toString(iArr);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this)");
            } else {
                string2 = null;
            }
            int[] iArr2 = this.pace;
            if (iArr2 != null) {
                string3 = Arrays.toString(iArr2);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(this)");
            } else {
                string3 = null;
            }
            int[] iArr3 = this.heartRate;
            if (iArr3 != null) {
                string4 = Arrays.toString(iArr3);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(this)");
            } else {
                string4 = null;
            }
            int[] iArr4 = this.frequency;
            if (iArr4 != null) {
                string5 = Arrays.toString(iArr4);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(this)");
            } else {
                string5 = null;
            }
            int[] iArr5 = this.elevation;
            if (iArr5 != null) {
                string6 = Arrays.toString(iArr5);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(this)");
            } else {
                string6 = null;
            }
            int[] iArr6 = this.distance;
            if (iArr6 != null) {
                string7 = Arrays.toString(iArr6);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(this)");
            } else {
                string7 = null;
            }
            int[] iArr7 = this.stride;
            if (iArr7 != null) {
                string8 = Arrays.toString(iArr7);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(this)");
            } else {
                string8 = null;
            }
            int[] iArr8 = this.stanceTime;
            if (iArr8 != null) {
                string9 = Arrays.toString(iArr8);
                Intrinsics.checkNotNullExpressionValue(string9, "toString(this)");
            } else {
                string9 = null;
            }
            int[] iArr9 = this.verticalOscillation;
            if (iArr9 != null) {
                string10 = Arrays.toString(iArr9);
                Intrinsics.checkNotNullExpressionValue(string10, "toString(this)");
            } else {
                string10 = null;
            }
            int[] iArr10 = this.stanceBalance;
            if (iArr10 != null) {
                string11 = Arrays.toString(iArr10);
                Intrinsics.checkNotNullExpressionValue(string11, "toString(this)");
            } else {
                string11 = null;
            }
            int[] iArr11 = this.verticalRatio;
            if (iArr11 != null) {
                string12 = Arrays.toString(iArr11);
                Intrinsics.checkNotNullExpressionValue(string12, "toString(this)");
            } else {
                string12 = null;
            }
            int[] iArr12 = this.runningPower;
            if (iArr12 != null) {
                string13 = Arrays.toString(iArr12);
                Intrinsics.checkNotNullExpressionValue(string13, "toString(this)");
            }
            return "DetailData(timestamp=" + string + ", state=" + string2 + ", pace=" + string3 + ", heartRate=" + string4 + ", frequency=" + string5 + ", elevation=" + string6 + ", distance=" + string7 + ", stride=" + string8 + ", stanceTime=" + string9 + ", verticalOscillation=" + string10 + ", stanceBalance=" + string11 + ", verticalRatio=" + string12 + ", runningPower=" + string13 + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001a\n\u0002\u0010\u0013\n\u0002\b\u0011\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$GpsData;", "", "()V", "accuracyCog", "", "getAccuracyCog", "()[I", "setAccuracyCog", "([I)V", "accuracyPosEast", "getAccuracyPosEast", "setAccuracyPosEast", "accuracyPosNorth", "getAccuracyPosNorth", "setAccuracyPosNorth", "accuracyVelHorizontal", "getAccuracyVelHorizontal", "setAccuracyVelHorizontal", "cog", "getCog", "setCog", "distance", "getDistance", "setDistance", "flagGPS", "getFlagGPS", "setFlagGPS", "heading", "getHeading", "setHeading", "latitude", "", "getLatitude", "()[D", "setLatitude", "([D)V", "longitude", "getLongitude", "setLongitude", "posHeadingFixStatus", "getPosHeadingFixStatus", "setPosHeadingFixStatus", "speed", "getSpeed", "setSpeed", "state", "getState", "setState", "timestamp", "", "getTimestamp", "()[J", "setTimestamp", "([J)V", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GpsData {

        @Nullable
        private int[] accuracyCog;

        @Nullable
        private int[] accuracyPosEast;

        @Nullable
        private int[] accuracyPosNorth;

        @Nullable
        private int[] accuracyVelHorizontal;

        @Nullable
        private int[] cog;

        @Nullable
        private int[] distance;

        @Nullable
        private int[] flagGPS;

        @Nullable
        private int[] heading;

        @Nullable
        private double[] latitude;

        @Nullable
        private double[] longitude;

        @Nullable
        private int[] posHeadingFixStatus;

        @Nullable
        private int[] speed;

        @Nullable
        private int[] state;

        @Nullable
        private long[] timestamp;

        @Nullable
        public final int[] getAccuracyCog() {
            return this.accuracyCog;
        }

        @Nullable
        public final int[] getAccuracyPosEast() {
            return this.accuracyPosEast;
        }

        @Nullable
        public final int[] getAccuracyPosNorth() {
            return this.accuracyPosNorth;
        }

        @Nullable
        public final int[] getAccuracyVelHorizontal() {
            return this.accuracyVelHorizontal;
        }

        @Nullable
        public final int[] getCog() {
            return this.cog;
        }

        @Nullable
        public final int[] getDistance() {
            return this.distance;
        }

        @Nullable
        public final int[] getFlagGPS() {
            return this.flagGPS;
        }

        @Nullable
        public final int[] getHeading() {
            return this.heading;
        }

        @Nullable
        public final double[] getLatitude() {
            return this.latitude;
        }

        @Nullable
        public final double[] getLongitude() {
            return this.longitude;
        }

        @Nullable
        public final int[] getPosHeadingFixStatus() {
            return this.posHeadingFixStatus;
        }

        @Nullable
        public final int[] getSpeed() {
            return this.speed;
        }

        @Nullable
        public final int[] getState() {
            return this.state;
        }

        @Nullable
        public final long[] getTimestamp() {
            return this.timestamp;
        }

        public final void setAccuracyCog(@Nullable int[] iArr) {
            this.accuracyCog = iArr;
        }

        public final void setAccuracyPosEast(@Nullable int[] iArr) {
            this.accuracyPosEast = iArr;
        }

        public final void setAccuracyPosNorth(@Nullable int[] iArr) {
            this.accuracyPosNorth = iArr;
        }

        public final void setAccuracyVelHorizontal(@Nullable int[] iArr) {
            this.accuracyVelHorizontal = iArr;
        }

        public final void setCog(@Nullable int[] iArr) {
            this.cog = iArr;
        }

        public final void setDistance(@Nullable int[] iArr) {
            this.distance = iArr;
        }

        public final void setFlagGPS(@Nullable int[] iArr) {
            this.flagGPS = iArr;
        }

        public final void setHeading(@Nullable int[] iArr) {
            this.heading = iArr;
        }

        public final void setLatitude(@Nullable double[] dArr) {
            this.latitude = dArr;
        }

        public final void setLongitude(@Nullable double[] dArr) {
            this.longitude = dArr;
        }

        public final void setPosHeadingFixStatus(@Nullable int[] iArr) {
            this.posHeadingFixStatus = iArr;
        }

        public final void setSpeed(@Nullable int[] iArr) {
            this.speed = iArr;
        }

        public final void setState(@Nullable int[] iArr) {
            this.state = iArr;
        }

        public final void setTimestamp(@Nullable long[] jArr) {
            this.timestamp = jArr;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$RecoveryHR;", "", "()V", RecordCombinedLineChart.KEY_HEART_RATE, "", "getHeartRate", "()[I", "setHeartRate", "([I)V", "timestamp", "", "getTimestamp", "()[J", "setTimestamp", "([J)V", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RecoveryHR {

        @Nullable
        private int[] heartRate;

        @Nullable
        private long[] timestamp;

        @Nullable
        public final int[] getHeartRate() {
            return this.heartRate;
        }

        @Nullable
        public final long[] getTimestamp() {
            return this.timestamp;
        }

        public final void setHeartRate(@Nullable int[] iArr) {
            this.heartRate = iArr;
        }

        public final void setTimestamp(@Nullable long[] jArr) {
            this.timestamp = jArr;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0003\b\u0080\u0001\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001c\u0010]\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001c\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001c\u0010c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001c\u0010f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001c\u0010i\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001c\u0010l\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001c\u0010r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001c\u0010u\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\u001c\u0010x\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR\u001c\u0010{\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001d\u0010~\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\b¨\u0006\u0086\u0001"}, d2 = {"Lcom/heytap/health/device/sportrecord/bean/SportRecordV2$SegmentData;", "", "()V", "activeDuration", "", "getActiveDuration", "()[I", "setActiveDuration", "([I)V", "avgFreq", "getAvgFreq", "setAvgFreq", "avgHr", "getAvgHr", "setAvgHr", "avgStride", "getAvgStride", "setAvgStride", "avgStrideBs", "getAvgStrideBs", "setAvgStrideBs", "backHand", "getBackHand", "setBackHand", "cal", "getCal", "setCal", "climbing", "getClimbing", "setClimbing", "currentHr", "getCurrentHr", "setCurrentHr", "descent", "getDescent", "setDescent", "distance", "getDistance", "setDistance", "distanceBs", "getDistanceBs", "setDistanceBs", "duration", "getDuration", "setDuration", "endTime", "getEndTime", "setEndTime", "floors", "getFloors", "setFloors", "foreHand", "getForeHand", "setForeHand", "hrConf", "getHrConf", "setHrConf", "interType", "getInterType", "setInterType", "maxFreq", "getMaxFreq", "setMaxFreq", "maxHr", "getMaxHr", "setMaxHr", "maxPace", "getMaxPace", "setMaxPace", "maxPaceBs", "getMaxPaceBs", "setMaxPaceBs", "maxSpeed", "getMaxSpeed", "setMaxSpeed", "maxSpeedBs", "getMaxSpeedBs", "setMaxSpeedBs", "minHr", "getMinHr", "setMinHr", "overHand", "getOverHand", "setOverHand", "pace", "getPace", "setPace", "paceBs", "getPaceBs", "setPaceBs", "repCount", "getRepCount", "setRepCount", "repSpeed", "getRepSpeed", "setRepSpeed", "segType", "getSegType", "setSegType", "seqId", "getSeqId", "setSeqId", "skiDistance", "getSkiDistance", "setSkiDistance", "skiDistanceBs", "getSkiDistanceBs", "setSkiDistanceBs", "speed", "getSpeed", "setSpeed", "speedBs", "getSpeedBs", "setSpeedBs", "startTime", "getStartTime", "setStartTime", "steps", "getSteps", "setSteps", "swimType", "getSwimType", "setSwimType", "swolfValue", "getSwolfValue", "setSwolfValue", "tennisServe", "getTennisServe", "setTennisServe", "underHand", "getUnderHand", "setUnderHand", "toString", "", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SegmentData {

        @Nullable
        private int[] activeDuration;

        @Nullable
        private int[] avgFreq;

        @Nullable
        private int[] avgHr;

        @Nullable
        private int[] avgStride;

        @Nullable
        private int[] avgStrideBs;

        @Nullable
        private int[] backHand;

        @Nullable
        private int[] cal;

        @Nullable
        private int[] climbing;

        @Nullable
        private int[] currentHr;

        @Nullable
        private int[] descent;

        @Nullable
        private int[] distance;

        @Nullable
        private int[] distanceBs;

        @Nullable
        private int[] duration;

        @Nullable
        private int[] endTime;

        @Nullable
        private int[] floors;

        @Nullable
        private int[] foreHand;

        @Nullable
        private int[] hrConf;

        @Nullable
        private int[] interType;

        @Nullable
        private int[] maxFreq;

        @Nullable
        private int[] maxHr;

        @Nullable
        private int[] maxPace;

        @Nullable
        private int[] maxPaceBs;

        @Nullable
        private int[] maxSpeed;

        @Nullable
        private int[] maxSpeedBs;

        @Nullable
        private int[] minHr;

        @Nullable
        private int[] overHand;

        @Nullable
        private int[] pace;

        @Nullable
        private int[] paceBs;

        @Nullable
        private int[] repCount;

        @Nullable
        private int[] repSpeed;

        @Nullable
        private int[] segType;

        @Nullable
        private int[] seqId;

        @Nullable
        private int[] skiDistance;

        @Nullable
        private int[] skiDistanceBs;

        @Nullable
        private int[] speed;

        @Nullable
        private int[] speedBs;

        @Nullable
        private int[] startTime;

        @Nullable
        private int[] steps;

        @Nullable
        private int[] swimType;

        @Nullable
        private int[] swolfValue;

        @Nullable
        private int[] tennisServe;

        @Nullable
        private int[] underHand;

        @Nullable
        public final int[] getActiveDuration() {
            return this.activeDuration;
        }

        @Nullable
        public final int[] getAvgFreq() {
            return this.avgFreq;
        }

        @Nullable
        public final int[] getAvgHr() {
            return this.avgHr;
        }

        @Nullable
        public final int[] getAvgStride() {
            return this.avgStride;
        }

        @Nullable
        public final int[] getAvgStrideBs() {
            return this.avgStrideBs;
        }

        @Nullable
        public final int[] getBackHand() {
            return this.backHand;
        }

        @Nullable
        public final int[] getCal() {
            return this.cal;
        }

        @Nullable
        public final int[] getClimbing() {
            return this.climbing;
        }

        @Nullable
        public final int[] getCurrentHr() {
            return this.currentHr;
        }

        @Nullable
        public final int[] getDescent() {
            return this.descent;
        }

        @Nullable
        public final int[] getDistance() {
            return this.distance;
        }

        @Nullable
        public final int[] getDistanceBs() {
            return this.distanceBs;
        }

        @Nullable
        public final int[] getDuration() {
            return this.duration;
        }

        @Nullable
        public final int[] getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final int[] getFloors() {
            return this.floors;
        }

        @Nullable
        public final int[] getForeHand() {
            return this.foreHand;
        }

        @Nullable
        public final int[] getHrConf() {
            return this.hrConf;
        }

        @Nullable
        public final int[] getInterType() {
            return this.interType;
        }

        @Nullable
        public final int[] getMaxFreq() {
            return this.maxFreq;
        }

        @Nullable
        public final int[] getMaxHr() {
            return this.maxHr;
        }

        @Nullable
        public final int[] getMaxPace() {
            return this.maxPace;
        }

        @Nullable
        public final int[] getMaxPaceBs() {
            return this.maxPaceBs;
        }

        @Nullable
        public final int[] getMaxSpeed() {
            return this.maxSpeed;
        }

        @Nullable
        public final int[] getMaxSpeedBs() {
            return this.maxSpeedBs;
        }

        @Nullable
        public final int[] getMinHr() {
            return this.minHr;
        }

        @Nullable
        public final int[] getOverHand() {
            return this.overHand;
        }

        @Nullable
        public final int[] getPace() {
            return this.pace;
        }

        @Nullable
        public final int[] getPaceBs() {
            return this.paceBs;
        }

        @Nullable
        public final int[] getRepCount() {
            return this.repCount;
        }

        @Nullable
        public final int[] getRepSpeed() {
            return this.repSpeed;
        }

        @Nullable
        public final int[] getSegType() {
            return this.segType;
        }

        @Nullable
        public final int[] getSeqId() {
            return this.seqId;
        }

        @Nullable
        public final int[] getSkiDistance() {
            return this.skiDistance;
        }

        @Nullable
        public final int[] getSkiDistanceBs() {
            return this.skiDistanceBs;
        }

        @Nullable
        public final int[] getSpeed() {
            return this.speed;
        }

        @Nullable
        public final int[] getSpeedBs() {
            return this.speedBs;
        }

        @Nullable
        public final int[] getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final int[] getSteps() {
            return this.steps;
        }

        @Nullable
        public final int[] getSwimType() {
            return this.swimType;
        }

        @Nullable
        public final int[] getSwolfValue() {
            return this.swolfValue;
        }

        @Nullable
        public final int[] getTennisServe() {
            return this.tennisServe;
        }

        @Nullable
        public final int[] getUnderHand() {
            return this.underHand;
        }

        public final void setActiveDuration(@Nullable int[] iArr) {
            this.activeDuration = iArr;
        }

        public final void setAvgFreq(@Nullable int[] iArr) {
            this.avgFreq = iArr;
        }

        public final void setAvgHr(@Nullable int[] iArr) {
            this.avgHr = iArr;
        }

        public final void setAvgStride(@Nullable int[] iArr) {
            this.avgStride = iArr;
        }

        public final void setAvgStrideBs(@Nullable int[] iArr) {
            this.avgStrideBs = iArr;
        }

        public final void setBackHand(@Nullable int[] iArr) {
            this.backHand = iArr;
        }

        public final void setCal(@Nullable int[] iArr) {
            this.cal = iArr;
        }

        public final void setClimbing(@Nullable int[] iArr) {
            this.climbing = iArr;
        }

        public final void setCurrentHr(@Nullable int[] iArr) {
            this.currentHr = iArr;
        }

        public final void setDescent(@Nullable int[] iArr) {
            this.descent = iArr;
        }

        public final void setDistance(@Nullable int[] iArr) {
            this.distance = iArr;
        }

        public final void setDistanceBs(@Nullable int[] iArr) {
            this.distanceBs = iArr;
        }

        public final void setDuration(@Nullable int[] iArr) {
            this.duration = iArr;
        }

        public final void setEndTime(@Nullable int[] iArr) {
            this.endTime = iArr;
        }

        public final void setFloors(@Nullable int[] iArr) {
            this.floors = iArr;
        }

        public final void setForeHand(@Nullable int[] iArr) {
            this.foreHand = iArr;
        }

        public final void setHrConf(@Nullable int[] iArr) {
            this.hrConf = iArr;
        }

        public final void setInterType(@Nullable int[] iArr) {
            this.interType = iArr;
        }

        public final void setMaxFreq(@Nullable int[] iArr) {
            this.maxFreq = iArr;
        }

        public final void setMaxHr(@Nullable int[] iArr) {
            this.maxHr = iArr;
        }

        public final void setMaxPace(@Nullable int[] iArr) {
            this.maxPace = iArr;
        }

        public final void setMaxPaceBs(@Nullable int[] iArr) {
            this.maxPaceBs = iArr;
        }

        public final void setMaxSpeed(@Nullable int[] iArr) {
            this.maxSpeed = iArr;
        }

        public final void setMaxSpeedBs(@Nullable int[] iArr) {
            this.maxSpeedBs = iArr;
        }

        public final void setMinHr(@Nullable int[] iArr) {
            this.minHr = iArr;
        }

        public final void setOverHand(@Nullable int[] iArr) {
            this.overHand = iArr;
        }

        public final void setPace(@Nullable int[] iArr) {
            this.pace = iArr;
        }

        public final void setPaceBs(@Nullable int[] iArr) {
            this.paceBs = iArr;
        }

        public final void setRepCount(@Nullable int[] iArr) {
            this.repCount = iArr;
        }

        public final void setRepSpeed(@Nullable int[] iArr) {
            this.repSpeed = iArr;
        }

        public final void setSegType(@Nullable int[] iArr) {
            this.segType = iArr;
        }

        public final void setSeqId(@Nullable int[] iArr) {
            this.seqId = iArr;
        }

        public final void setSkiDistance(@Nullable int[] iArr) {
            this.skiDistance = iArr;
        }

        public final void setSkiDistanceBs(@Nullable int[] iArr) {
            this.skiDistanceBs = iArr;
        }

        public final void setSpeed(@Nullable int[] iArr) {
            this.speed = iArr;
        }

        public final void setSpeedBs(@Nullable int[] iArr) {
            this.speedBs = iArr;
        }

        public final void setStartTime(@Nullable int[] iArr) {
            this.startTime = iArr;
        }

        public final void setSteps(@Nullable int[] iArr) {
            this.steps = iArr;
        }

        public final void setSwimType(@Nullable int[] iArr) {
            this.swimType = iArr;
        }

        public final void setSwolfValue(@Nullable int[] iArr) {
            this.swolfValue = iArr;
        }

        public final void setTennisServe(@Nullable int[] iArr) {
            this.tennisServe = iArr;
        }

        public final void setUnderHand(@Nullable int[] iArr) {
            this.underHand = iArr;
        }

        @NotNull
        public String toString() {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            String string12;
            String string13;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String string14;
            String string15;
            int[] iArr = this.segType;
            if (iArr != null) {
                string = Arrays.toString(iArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            } else {
                string = null;
            }
            int[] iArr2 = this.interType;
            if (iArr2 != null) {
                string2 = Arrays.toString(iArr2);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this)");
            } else {
                string2 = null;
            }
            int[] iArr3 = this.duration;
            if (iArr3 != null) {
                string3 = Arrays.toString(iArr3);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(this)");
            } else {
                string3 = null;
            }
            int[] iArr4 = this.activeDuration;
            if (iArr4 != null) {
                string4 = Arrays.toString(iArr4);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(this)");
            } else {
                string4 = null;
            }
            int[] iArr5 = this.startTime;
            if (iArr5 != null) {
                string5 = Arrays.toString(iArr5);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(this)");
            } else {
                string5 = null;
            }
            int[] iArr6 = this.endTime;
            if (iArr6 != null) {
                string6 = Arrays.toString(iArr6);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(this)");
            } else {
                string6 = null;
            }
            int[] iArr7 = this.currentHr;
            if (iArr7 != null) {
                string7 = Arrays.toString(iArr7);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(this)");
            } else {
                string7 = null;
            }
            int[] iArr8 = this.hrConf;
            if (iArr8 != null) {
                string8 = Arrays.toString(iArr8);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(this)");
            } else {
                string8 = null;
            }
            int[] iArr9 = this.maxHr;
            if (iArr9 != null) {
                string9 = Arrays.toString(iArr9);
                Intrinsics.checkNotNullExpressionValue(string9, "toString(this)");
            } else {
                string9 = null;
            }
            int[] iArr10 = this.avgHr;
            if (iArr10 != null) {
                string10 = Arrays.toString(iArr10);
                Intrinsics.checkNotNullExpressionValue(string10, "toString(this)");
            } else {
                string10 = null;
            }
            int[] iArr11 = this.minHr;
            if (iArr11 != null) {
                string11 = Arrays.toString(iArr11);
                Intrinsics.checkNotNullExpressionValue(string11, "toString(this)");
            } else {
                string11 = null;
            }
            int[] iArr12 = this.steps;
            if (iArr12 != null) {
                string12 = Arrays.toString(iArr12);
                Intrinsics.checkNotNullExpressionValue(string12, "toString(this)");
            } else {
                string12 = null;
            }
            int[] iArr13 = this.avgFreq;
            if (iArr13 != null) {
                string13 = Arrays.toString(iArr13);
                Intrinsics.checkNotNullExpressionValue(string13, "toString(this)");
            } else {
                string13 = null;
            }
            int[] iArr14 = this.maxFreq;
            if (iArr14 != null) {
                String string16 = Arrays.toString(iArr14);
                Intrinsics.checkNotNullExpressionValue(string16, "toString(this)");
                str = string16;
            } else {
                str = null;
            }
            int[] iArr15 = this.avgStride;
            if (iArr15 != null) {
                String string17 = Arrays.toString(iArr15);
                Intrinsics.checkNotNullExpressionValue(string17, "toString(this)");
                str2 = string17;
            } else {
                str2 = null;
            }
            int[] iArr16 = this.avgStrideBs;
            if (iArr16 != null) {
                String string18 = Arrays.toString(iArr16);
                Intrinsics.checkNotNullExpressionValue(string18, "toString(this)");
                str3 = string18;
            } else {
                str3 = null;
            }
            int[] iArr17 = this.distance;
            if (iArr17 != null) {
                String string19 = Arrays.toString(iArr17);
                Intrinsics.checkNotNullExpressionValue(string19, "toString(this)");
                str4 = string19;
            } else {
                str4 = null;
            }
            int[] iArr18 = this.distanceBs;
            if (iArr18 != null) {
                String string20 = Arrays.toString(iArr18);
                Intrinsics.checkNotNullExpressionValue(string20, "toString(this)");
                str5 = string20;
            } else {
                str5 = null;
            }
            int[] iArr19 = this.skiDistance;
            if (iArr19 != null) {
                String string21 = Arrays.toString(iArr19);
                Intrinsics.checkNotNullExpressionValue(string21, "toString(this)");
                str6 = string21;
            } else {
                str6 = null;
            }
            int[] iArr20 = this.skiDistanceBs;
            if (iArr20 != null) {
                String string22 = Arrays.toString(iArr20);
                Intrinsics.checkNotNullExpressionValue(string22, "toString(this)");
                str7 = string22;
            } else {
                str7 = null;
            }
            int[] iArr21 = this.pace;
            if (iArr21 != null) {
                String string23 = Arrays.toString(iArr21);
                Intrinsics.checkNotNullExpressionValue(string23, "toString(this)");
                str8 = string23;
            } else {
                str8 = null;
            }
            int[] iArr22 = this.paceBs;
            if (iArr22 != null) {
                String string24 = Arrays.toString(iArr22);
                Intrinsics.checkNotNullExpressionValue(string24, "toString(this)");
                str9 = string24;
            } else {
                str9 = null;
            }
            int[] iArr23 = this.maxPace;
            if (iArr23 != null) {
                String string25 = Arrays.toString(iArr23);
                Intrinsics.checkNotNullExpressionValue(string25, "toString(this)");
                str10 = string25;
            } else {
                str10 = null;
            }
            int[] iArr24 = this.maxPaceBs;
            if (iArr24 != null) {
                String string26 = Arrays.toString(iArr24);
                Intrinsics.checkNotNullExpressionValue(string26, "toString(this)");
                str11 = string26;
            } else {
                str11 = null;
            }
            int[] iArr25 = this.speed;
            if (iArr25 != null) {
                String string27 = Arrays.toString(iArr25);
                Intrinsics.checkNotNullExpressionValue(string27, "toString(this)");
                str12 = string27;
            } else {
                str12 = null;
            }
            int[] iArr26 = this.speedBs;
            if (iArr26 != null) {
                String string28 = Arrays.toString(iArr26);
                Intrinsics.checkNotNullExpressionValue(string28, "toString(this)");
                str13 = string28;
            } else {
                str13 = null;
            }
            int[] iArr27 = this.maxSpeed;
            if (iArr27 != null) {
                String string29 = Arrays.toString(iArr27);
                Intrinsics.checkNotNullExpressionValue(string29, "toString(this)");
                str14 = string29;
            } else {
                str14 = null;
            }
            int[] iArr28 = this.maxSpeedBs;
            if (iArr28 != null) {
                String string30 = Arrays.toString(iArr28);
                Intrinsics.checkNotNullExpressionValue(string30, "toString(this)");
                str15 = string30;
            } else {
                str15 = null;
            }
            int[] iArr29 = this.repCount;
            if (iArr29 != null) {
                String string31 = Arrays.toString(iArr29);
                Intrinsics.checkNotNullExpressionValue(string31, "toString(this)");
                str16 = string31;
            } else {
                str16 = null;
            }
            int[] iArr30 = this.repSpeed;
            if (iArr30 != null) {
                String string32 = Arrays.toString(iArr30);
                Intrinsics.checkNotNullExpressionValue(string32, "toString(this)");
                str17 = string32;
            } else {
                str17 = null;
            }
            int[] iArr31 = this.cal;
            if (iArr31 != null) {
                String string33 = Arrays.toString(iArr31);
                Intrinsics.checkNotNullExpressionValue(string33, "toString(this)");
                str18 = string33;
            } else {
                str18 = null;
            }
            int[] iArr32 = this.climbing;
            if (iArr32 != null) {
                String string34 = Arrays.toString(iArr32);
                Intrinsics.checkNotNullExpressionValue(string34, "toString(this)");
                str19 = string34;
            } else {
                str19 = null;
            }
            int[] iArr33 = this.descent;
            if (iArr33 != null) {
                String string35 = Arrays.toString(iArr33);
                Intrinsics.checkNotNullExpressionValue(string35, "toString(this)");
                str20 = string35;
            } else {
                str20 = null;
            }
            int[] iArr34 = this.foreHand;
            if (iArr34 != null) {
                String string36 = Arrays.toString(iArr34);
                Intrinsics.checkNotNullExpressionValue(string36, "toString(this)");
                str21 = string36;
            } else {
                str21 = null;
            }
            int[] iArr35 = this.backHand;
            if (iArr35 != null) {
                String string37 = Arrays.toString(iArr35);
                Intrinsics.checkNotNullExpressionValue(string37, "toString(this)");
                str22 = string37;
            } else {
                str22 = null;
            }
            int[] iArr36 = this.overHand;
            if (iArr36 != null) {
                String string38 = Arrays.toString(iArr36);
                Intrinsics.checkNotNullExpressionValue(string38, "toString(this)");
                str23 = string38;
            } else {
                str23 = null;
            }
            int[] iArr37 = this.underHand;
            if (iArr37 != null) {
                String string39 = Arrays.toString(iArr37);
                Intrinsics.checkNotNullExpressionValue(string39, "toString(this)");
                str24 = string39;
            } else {
                str24 = null;
            }
            int[] iArr38 = this.tennisServe;
            if (iArr38 != null) {
                string14 = Arrays.toString(iArr38);
                Intrinsics.checkNotNullExpressionValue(string14, "toString(this)");
            } else {
                string14 = null;
            }
            int[] iArr39 = this.swimType;
            if (iArr39 != null) {
                string15 = Arrays.toString(iArr39);
                Intrinsics.checkNotNullExpressionValue(string15, "toString(this)");
            } else {
                string15 = null;
            }
            return "SegmentData(segType=" + string + ", interType=" + string2 + ", duration=" + string3 + ", activeDuration=" + string4 + ", startTime=" + string5 + ", endTime=" + string6 + ", currentHr=" + string7 + ", hrConf=" + string8 + ", maxHr=" + string9 + ", avgHr=" + string10 + ", minHr=" + string11 + ", steps=" + string12 + ", avgFreq=" + string13 + ", maxFreq=" + str + ", avgStride=" + str2 + ", avgStrideBs=" + str3 + ", distance=" + str4 + ", distanceBs=" + str5 + ", skiDistance=" + str6 + ", skiDistanceBs=" + str7 + ", pace=" + str8 + ", paceBs=" + str9 + ", maxPace=" + str10 + ", maxPaceBs=" + str11 + ", speed=" + str12 + ", speedBs=" + str13 + ", maxSpeed=" + str14 + ", maxSpeedBs=" + str15 + ", repCount=" + str16 + ", repSpeed=" + str17 + ", cal=" + str18 + ", climbing=" + str19 + ", descent=" + str20 + ", foreHand=" + str21 + ", backHand=" + str22 + ", overHand=" + str23 + ", underHand=" + str24 + ", tennisServe=" + string14 + ", swimType=" + string15 + ")";
        }
    }

    public final int getAchievePercent() {
        return this.achievePercent;
    }

    public final int getAvgFrequency() {
        return this.avgFrequency;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final int getAvgSpeed() {
        return this.avgSpeed;
    }

    @Nullable
    public final DetailData getDetailData() {
        return this.detailData;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final GpsData getGpsData() {
        return this.gpsData;
    }

    public final int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Nullable
    public final RecoveryHR getRecoveryHR() {
        return this.recoveryHR;
    }

    @Nullable
    public final SegmentData getSegmentData() {
        return this.segmentData;
    }

    @Nullable
    public final String getSportId() {
        return this.sportId;
    }

    @Nullable
    public final String getSportName() {
        return this.sportName;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final int getTotalCalories() {
        return this.totalCalories;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalHeight() {
        return this.totalHeight;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    /* JADX INFO: renamed from: isIWatchRecord, reason: from getter */
    public final boolean getIsIWatchRecord() {
        return this.isIWatchRecord;
    }

    public final void setAchievePercent(int i) {
        this.achievePercent = i;
    }

    public final void setAvgFrequency(int i) {
        this.avgFrequency = i;
    }

    public final void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public final void setAvgSpeed(int i) {
        this.avgSpeed = i;
    }

    public final void setDetailData(@Nullable DetailData detailData) {
        this.detailData = detailData;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setGpsData(@Nullable GpsData gpsData) {
        this.gpsData = gpsData;
    }

    public final void setIWatchRecord(boolean z) {
        this.isIWatchRecord = z;
    }

    public final void setMaxSpeed(int i) {
        this.maxSpeed = i;
    }

    public final void setRecoveryHR(@Nullable RecoveryHR recoveryHR) {
        this.recoveryHR = recoveryHR;
    }

    public final void setSegmentData(@Nullable SegmentData segmentData) {
        this.segmentData = segmentData;
    }

    public final void setSportId(@Nullable String str) {
        this.sportId = str;
    }

    public final void setSportName(@Nullable String str) {
        this.sportName = str;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setTimeZone(@Nullable String str) {
        this.timeZone = str;
    }

    public final void setTotalCalories(int i) {
        this.totalCalories = i;
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public final void setTotalHeight(int i) {
        this.totalHeight = i;
    }

    public final void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public final void setTotalTime(int i) {
        this.totalTime = i;
    }

    @NotNull
    public String toString() {
        return "SportRecordV2(sportId=" + this.sportId + ", sportType=" + this.sportType + ", sportName=" + this.sportName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalTime=" + this.totalTime + ", totalCalories=" + this.totalCalories + ", totalHeight=" + this.totalHeight + ", avgHeartRate=" + this.avgHeartRate + ", avgSpeed=" + this.avgSpeed + ", maxSpeed=" + this.maxSpeed + ", avgFrequency=" + this.avgFrequency + ", achievePercent=" + this.achievePercent + ", timeZone=" + this.timeZone + ", gpsData=" + this.gpsData + ", detailData=" + this.detailData + ", extra=" + this.extra + ")";
    }
}
