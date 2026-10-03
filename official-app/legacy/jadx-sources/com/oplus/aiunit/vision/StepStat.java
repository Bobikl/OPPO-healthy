package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hti, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bP\u0010QJÃ\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010%\u001a\u0004\b/\u0010'\"\u0004\b6\u0010)R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b2\u0010<\"\u0004\b=\u0010>R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b*\u0010'\"\u0004\bB\u0010)R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'\"\u0004\bE\u0010)R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\bC\u0010'\"\u0004\bF\u0010)R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001f\u001a\u0004\b5\u0010!\"\u0004\bG\u0010#R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010%\u001a\u0004\b?\u0010'\"\u0004\bM\u0010)R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010%\u001a\u0004\b:\u0010'\"\u0004\bN\u0010)R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010%\u001a\u0004\b7\u0010'\"\u0004\bO\u0010)¨\u0006R"}, d2 = {"Lcom/oplus/aiunit/vision/hti;", "", "", SpeechConstant.KEY_TTS_TIMESTAMP, "", "step", "averageStep", "monthAverageStep", "totalStepValidDays", "stepGoal", "calorie", "calorieGoal", "", "distance", "validDistanceDay", "altitude", "validAltitudeDay", "stepAverageHeartRate", "duration", "", "checkInDates", "reachGoalDays", "minStepFreq", "maxStepFreq", "a", "", "toString", "hashCode", "other", "", "equals", "J", "n", "()J", "setTimeStamp", "(J)V", "b", "I", MapSchema.FIELD_NAME_KEY, "()I", "z", "(I)V", "c", "d", "s", "getMonthAverageStep", "setMonthAverageStep", MapSchema.FIELD_NAME_ENTRY, "o", "C", "f", LogFieldKey.MESSAGE_KEY, c8l.KEY_B, b2n.f, "t", b2n.g, "getCalorieGoal", "setCalorieGoal", "i", UserInfo.SEX_FEMALE, "()F", "u", "(F)V", "j", "q", ExifInterface.LONGITUDE_EAST, "r", LogFieldKey.LEVEL_KEY, LogFieldKey.PROCESS_NAME_KEY, "D", "A", "v", "Ljava/util/List;", "getCheckInDates", "()Ljava/util/List;", "setCheckInDates", "(Ljava/util/List;)V", "y", "x", "w", "<init>", "(JIIIIIIIFIIIIJLjava/util/List;III)V", "sport_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StepStat {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int step;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int averageStep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int monthAverageStep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int totalStepValidDays;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int stepGoal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int calorie;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public int calorieGoal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public float distance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public int validDistanceDay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public int altitude;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public int validAltitudeDay;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public int stepAverageHeartRate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public long duration;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    public List<Long> checkInDates;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    public int reachGoalDays;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    public int minStepFreq;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    public int maxStepFreq;

    public StepStat() {
        this(0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0L, null, 0, 0, 0, 262143, null);
    }

    public final void A(int i) {
        this.stepAverageHeartRate = i;
    }

    public final void B(int i) {
        this.stepGoal = i;
    }

    public final void C(int i) {
        this.totalStepValidDays = i;
    }

    public final void D(int i) {
        this.validAltitudeDay = i;
    }

    public final void E(int i) {
        this.validDistanceDay = i;
    }

    @NotNull
    public final StepStat a(long timeStamp, int step, int averageStep, int monthAverageStep, int totalStepValidDays, int stepGoal, int calorie, int calorieGoal, float distance, int validDistanceDay, int altitude, int validAltitudeDay, int stepAverageHeartRate, long duration, @NotNull List<Long> checkInDates, int reachGoalDays, int minStepFreq, int maxStepFreq) {
        Intrinsics.checkNotNullParameter(checkInDates, "checkInDates");
        return new StepStat(timeStamp, step, averageStep, monthAverageStep, totalStepValidDays, stepGoal, calorie, calorieGoal, distance, validDistanceDay, altitude, validAltitudeDay, stepAverageHeartRate, duration, checkInDates, reachGoalDays, minStepFreq, maxStepFreq);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAverageStep() {
        return this.averageStep;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepStat)) {
            return false;
        }
        StepStat stepStat = (StepStat) other;
        return this.timeStamp == stepStat.timeStamp && this.step == stepStat.step && this.averageStep == stepStat.averageStep && this.monthAverageStep == stepStat.monthAverageStep && this.totalStepValidDays == stepStat.totalStepValidDays && this.stepGoal == stepStat.stepGoal && this.calorie == stepStat.calorie && this.calorieGoal == stepStat.calorieGoal && Float.compare(this.distance, stepStat.distance) == 0 && this.validDistanceDay == stepStat.validDistanceDay && this.altitude == stepStat.altitude && this.validAltitudeDay == stepStat.validAltitudeDay && this.stepAverageHeartRate == stepStat.stepAverageHeartRate && this.duration == stepStat.duration && Intrinsics.areEqual(this.checkInDates, stepStat.checkInDates) && this.reachGoalDays == stepStat.reachGoalDays && this.minStepFreq == stepStat.minStepFreq && this.maxStepFreq == stepStat.maxStepFreq;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxStepFreq() {
        return this.maxStepFreq;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Long.hashCode(this.timeStamp) * 31) + Integer.hashCode(this.step)) * 31) + Integer.hashCode(this.averageStep)) * 31) + Integer.hashCode(this.monthAverageStep)) * 31) + Integer.hashCode(this.totalStepValidDays)) * 31) + Integer.hashCode(this.stepGoal)) * 31) + Integer.hashCode(this.calorie)) * 31) + Integer.hashCode(this.calorieGoal)) * 31) + Float.hashCode(this.distance)) * 31) + Integer.hashCode(this.validDistanceDay)) * 31) + Integer.hashCode(this.altitude)) * 31) + Integer.hashCode(this.validAltitudeDay)) * 31) + Integer.hashCode(this.stepAverageHeartRate)) * 31) + Long.hashCode(this.duration)) * 31) + this.checkInDates.hashCode()) * 31) + Integer.hashCode(this.reachGoalDays)) * 31) + Integer.hashCode(this.minStepFreq)) * 31) + Integer.hashCode(this.maxStepFreq);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinStepFreq() {
        return this.minStepFreq;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getReachGoalDays() {
        return this.reachGoalDays;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStepAverageHeartRate() {
        return this.stepAverageHeartRate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getStepGoal() {
        return this.stepGoal;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getTotalStepValidDays() {
        return this.totalStepValidDays;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getValidAltitudeDay() {
        return this.validAltitudeDay;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getValidDistanceDay() {
        return this.validDistanceDay;
    }

    public final void r(int i) {
        this.altitude = i;
    }

    public final void s(int i) {
        this.averageStep = i;
    }

    public final void t(int i) {
        this.calorie = i;
    }

    @NotNull
    public String toString() {
        return "StepStat(timeStamp=" + this.timeStamp + ", step=" + this.step + ", averageStep=" + this.averageStep + ", monthAverageStep=" + this.monthAverageStep + ", totalStepValidDays=" + this.totalStepValidDays + ", stepGoal=" + this.stepGoal + ", calorie=" + this.calorie + ", calorieGoal=" + this.calorieGoal + ", distance=" + this.distance + ", validDistanceDay=" + this.validDistanceDay + ", altitude=" + this.altitude + ", validAltitudeDay=" + this.validAltitudeDay + ", stepAverageHeartRate=" + this.stepAverageHeartRate + ", duration=" + this.duration + ", checkInDates=" + this.checkInDates + ", reachGoalDays=" + this.reachGoalDays + ", minStepFreq=" + this.minStepFreq + ", maxStepFreq=" + this.maxStepFreq + ")";
    }

    public final void u(float f) {
        this.distance = f;
    }

    public final void v(long j2) {
        this.duration = j2;
    }

    public final void w(int i) {
        this.maxStepFreq = i;
    }

    public final void x(int i) {
        this.minStepFreq = i;
    }

    public final void y(int i) {
        this.reachGoalDays = i;
    }

    public final void z(int i) {
        this.step = i;
    }

    public StepStat(long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, int i10, int i11, long j3, @NotNull List<Long> checkInDates, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(checkInDates, "checkInDates");
        this.timeStamp = j2;
        this.step = i;
        this.averageStep = i2;
        this.monthAverageStep = i3;
        this.totalStepValidDays = i4;
        this.stepGoal = i5;
        this.calorie = i6;
        this.calorieGoal = i7;
        this.distance = f;
        this.validDistanceDay = i8;
        this.altitude = i9;
        this.validAltitudeDay = i10;
        this.stepAverageHeartRate = i11;
        this.duration = j3;
        this.checkInDates = checkInDates;
        this.reachGoalDays = i12;
        this.minStepFreq = i13;
        this.maxStepFreq = i14;
    }

    public /* synthetic */ StepStat(long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, int i10, int i11, long j3, List list, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0L : j2, (i15 & 2) != 0 ? 0 : i, (i15 & 4) != 0 ? 0 : i2, (i15 & 8) != 0 ? 0 : i3, (i15 & 16) != 0 ? 0 : i4, (i15 & 32) != 0 ? -1 : i5, (i15 & 64) != 0 ? 0 : i6, (i15 & 128) != 0 ? -1 : i7, (i15 & 256) != 0 ? 0.0f : f, (i15 & 512) != 0 ? 0 : i8, (i15 & 1024) != 0 ? 0 : i9, (i15 & 2048) != 0 ? 0 : i10, (i15 & 4096) == 0 ? i11 : -1, (i15 & 8192) != 0 ? -1L : j3, (i15 & 16384) != 0 ? new ArrayList() : list, (i15 & 32768) != 0 ? 0 : i12, (i15 & 65536) != 0 ? 0 : i13, (i15 & 131072) != 0 ? 0 : i14);
    }
}
