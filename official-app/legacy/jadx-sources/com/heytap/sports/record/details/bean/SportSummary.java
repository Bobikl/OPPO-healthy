package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.store.apm.PageTrackBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\bj\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B«\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0002\u0010*J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u000eHÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\u0006HÆ\u0003J\t\u0010]\u001a\u00020\u0006HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\t\u0010g\u001a\u00020\u0006HÆ\u0003J\t\u0010h\u001a\u00020\u0006HÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\u0006HÆ\u0003J\t\u0010p\u001a\u00020\u0006HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0006HÆ\u0003J\t\u0010s\u001a\u00020\u0006HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00060\fHÆ\u0003J\t\u0010v\u001a\u00020\u000eHÆ\u0003J÷\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\u0006HÆ\u0001J\u0013\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020\u0006HÖ\u0001J\t\u0010|\u001a\u00020}HÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010(\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0011\u0010)\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010.R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0011\u0010&\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010>R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bP\u0010,R\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010.R\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010.¨\u0006~"}, d2 = {"Lcom/heytap/sports/record/details/bean/SportSummary;", "", "startTimestamp", "", PageTrackBean.TOTAL_TIME, RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "totalCalories", "totalDistance", "totalSteps", "dynamicsCalories", "dateHrZone", "", "vo2max", "", "maxHeartRate", "avgHeartRate", "avgPace", "bestPace", "aerobicScore", "recoveryTime", "avgStepRate", "bestStepRate", "avgStride", "bestStride", "avgStance", "avgBalance", "avgVertical", "avgVerticalRatio", "fatBurning", "avgFatBurningRate", "sugarConsumption", "sugarConsumptionRate", "fatBurningRatio", "totalClimb", "maxElevation", "warnUpHrmLower", "warnUpHrmUpper", "reducingFatHrmUpper", "staminaHrmUpper", "anaerobicHrmUpper", "limitHrmUpper", "(JJIJIIJLjava/util/List;FIIIIFIIIIIIIIIIIIIIIIIIIIII)V", "getAerobicScore", "()F", "getAnaerobicHrmUpper", "()I", "getAvgBalance", "getAvgFatBurningRate", "getAvgHeartRate", "getAvgPace", "getAvgStance", "getAvgStepRate", "getAvgStride", "getAvgVertical", "getAvgVerticalRatio", "getBestPace", "getBestStepRate", "getBestStride", "getDateHrZone", "()Ljava/util/List;", "getDynamicsCalories", "()J", "getFatBurning", "getFatBurningRatio", "getLimitHrmUpper", "getMaxElevation", "getMaxHeartRate", "getRecoveryTime", "getReducingFatHrmUpper", "getSportMode", "getStaminaHrmUpper", "getStartTimestamp", "getSugarConsumption", "getSugarConsumptionRate", "getTotalCalories", "getTotalClimb", "getTotalDistance", "getTotalSteps", "getTotalTime", "getVo2max", "getWarnUpHrmLower", "getWarnUpHrmUpper", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportSummary {
    public static final int $stable = 8;
    private final float aerobicScore;
    private final int anaerobicHrmUpper;
    private final int avgBalance;
    private final int avgFatBurningRate;
    private final int avgHeartRate;
    private final int avgPace;
    private final int avgStance;
    private final int avgStepRate;
    private final int avgStride;
    private final int avgVertical;
    private final int avgVerticalRatio;
    private final int bestPace;
    private final int bestStepRate;
    private final int bestStride;

    @NotNull
    private final List<Integer> dateHrZone;
    private final long dynamicsCalories;
    private final int fatBurning;
    private final int fatBurningRatio;
    private final int limitHrmUpper;
    private final int maxElevation;
    private final int maxHeartRate;
    private final int recoveryTime;
    private final int reducingFatHrmUpper;
    private final int sportMode;
    private final int staminaHrmUpper;
    private final long startTimestamp;
    private final int sugarConsumption;
    private final int sugarConsumptionRate;
    private final long totalCalories;
    private final int totalClimb;
    private final int totalDistance;
    private final int totalSteps;
    private final long totalTime;
    private final float vo2max;
    private final int warnUpHrmLower;
    private final int warnUpHrmUpper;

    public SportSummary(long j2, long j3, int i, long j4, int i2, int i3, long j5, @NotNull List<Integer> dateHrZone, float f, int i4, int i5, int i6, int i7, float f2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        Intrinsics.checkNotNullParameter(dateHrZone, "dateHrZone");
        this.startTimestamp = j2;
        this.totalTime = j3;
        this.sportMode = i;
        this.totalCalories = j4;
        this.totalDistance = i2;
        this.totalSteps = i3;
        this.dynamicsCalories = j5;
        this.dateHrZone = dateHrZone;
        this.vo2max = f;
        this.maxHeartRate = i4;
        this.avgHeartRate = i5;
        this.avgPace = i6;
        this.bestPace = i7;
        this.aerobicScore = f2;
        this.recoveryTime = i8;
        this.avgStepRate = i9;
        this.bestStepRate = i10;
        this.avgStride = i11;
        this.bestStride = i12;
        this.avgStance = i13;
        this.avgBalance = i14;
        this.avgVertical = i15;
        this.avgVerticalRatio = i16;
        this.fatBurning = i17;
        this.avgFatBurningRate = i18;
        this.sugarConsumption = i19;
        this.sugarConsumptionRate = i20;
        this.fatBurningRatio = i21;
        this.totalClimb = i22;
        this.maxElevation = i23;
        this.warnUpHrmLower = i24;
        this.warnUpHrmUpper = i25;
        this.reducingFatHrmUpper = i26;
        this.staminaHrmUpper = i27;
        this.anaerobicHrmUpper = i28;
        this.limitHrmUpper = i29;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAvgPace() {
        return this.avgPace;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getBestPace() {
        return this.bestPace;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getAerobicScore() {
        return this.aerobicScore;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getRecoveryTime() {
        return this.recoveryTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getAvgStepRate() {
        return this.avgStepRate;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getBestStepRate() {
        return this.bestStepRate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getAvgStride() {
        return this.avgStride;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getBestStride() {
        return this.bestStride;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalTime() {
        return this.totalTime;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getAvgStance() {
        return this.avgStance;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getAvgBalance() {
        return this.avgBalance;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getAvgVertical() {
        return this.avgVertical;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getAvgVerticalRatio() {
        return this.avgVerticalRatio;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getFatBurning() {
        return this.fatBurning;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getAvgFatBurningRate() {
        return this.avgFatBurningRate;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getSugarConsumption() {
        return this.sugarConsumption;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getSugarConsumptionRate() {
        return this.sugarConsumptionRate;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getFatBurningRatio() {
        return this.fatBurningRatio;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getTotalClimb() {
        return this.totalClimb;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getMaxElevation() {
        return this.maxElevation;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getWarnUpHrmLower() {
        return this.warnUpHrmLower;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getWarnUpHrmUpper() {
        return this.warnUpHrmUpper;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final int getReducingFatHrmUpper() {
        return this.reducingFatHrmUpper;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final int getStaminaHrmUpper() {
        return this.staminaHrmUpper;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getAnaerobicHrmUpper() {
        return this.anaerobicHrmUpper;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getLimitHrmUpper() {
        return this.limitHrmUpper;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalCalories() {
        return this.totalCalories;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getDynamicsCalories() {
        return this.dynamicsCalories;
    }

    @NotNull
    public final List<Integer> component8() {
        return this.dateHrZone;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getVo2max() {
        return this.vo2max;
    }

    @NotNull
    public final SportSummary copy(long startTimestamp, long totalTime, int sportMode, long totalCalories, int totalDistance, int totalSteps, long dynamicsCalories, @NotNull List<Integer> dateHrZone, float vo2max, int maxHeartRate, int avgHeartRate, int avgPace, int bestPace, float aerobicScore, int recoveryTime, int avgStepRate, int bestStepRate, int avgStride, int bestStride, int avgStance, int avgBalance, int avgVertical, int avgVerticalRatio, int fatBurning, int avgFatBurningRate, int sugarConsumption, int sugarConsumptionRate, int fatBurningRatio, int totalClimb, int maxElevation, int warnUpHrmLower, int warnUpHrmUpper, int reducingFatHrmUpper, int staminaHrmUpper, int anaerobicHrmUpper, int limitHrmUpper) {
        Intrinsics.checkNotNullParameter(dateHrZone, "dateHrZone");
        return new SportSummary(startTimestamp, totalTime, sportMode, totalCalories, totalDistance, totalSteps, dynamicsCalories, dateHrZone, vo2max, maxHeartRate, avgHeartRate, avgPace, bestPace, aerobicScore, recoveryTime, avgStepRate, bestStepRate, avgStride, bestStride, avgStance, avgBalance, avgVertical, avgVerticalRatio, fatBurning, avgFatBurningRate, sugarConsumption, sugarConsumptionRate, fatBurningRatio, totalClimb, maxElevation, warnUpHrmLower, warnUpHrmUpper, reducingFatHrmUpper, staminaHrmUpper, anaerobicHrmUpper, limitHrmUpper);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportSummary)) {
            return false;
        }
        SportSummary sportSummary = (SportSummary) other;
        return this.startTimestamp == sportSummary.startTimestamp && this.totalTime == sportSummary.totalTime && this.sportMode == sportSummary.sportMode && this.totalCalories == sportSummary.totalCalories && this.totalDistance == sportSummary.totalDistance && this.totalSteps == sportSummary.totalSteps && this.dynamicsCalories == sportSummary.dynamicsCalories && Intrinsics.areEqual(this.dateHrZone, sportSummary.dateHrZone) && Float.compare(this.vo2max, sportSummary.vo2max) == 0 && this.maxHeartRate == sportSummary.maxHeartRate && this.avgHeartRate == sportSummary.avgHeartRate && this.avgPace == sportSummary.avgPace && this.bestPace == sportSummary.bestPace && Float.compare(this.aerobicScore, sportSummary.aerobicScore) == 0 && this.recoveryTime == sportSummary.recoveryTime && this.avgStepRate == sportSummary.avgStepRate && this.bestStepRate == sportSummary.bestStepRate && this.avgStride == sportSummary.avgStride && this.bestStride == sportSummary.bestStride && this.avgStance == sportSummary.avgStance && this.avgBalance == sportSummary.avgBalance && this.avgVertical == sportSummary.avgVertical && this.avgVerticalRatio == sportSummary.avgVerticalRatio && this.fatBurning == sportSummary.fatBurning && this.avgFatBurningRate == sportSummary.avgFatBurningRate && this.sugarConsumption == sportSummary.sugarConsumption && this.sugarConsumptionRate == sportSummary.sugarConsumptionRate && this.fatBurningRatio == sportSummary.fatBurningRatio && this.totalClimb == sportSummary.totalClimb && this.maxElevation == sportSummary.maxElevation && this.warnUpHrmLower == sportSummary.warnUpHrmLower && this.warnUpHrmUpper == sportSummary.warnUpHrmUpper && this.reducingFatHrmUpper == sportSummary.reducingFatHrmUpper && this.staminaHrmUpper == sportSummary.staminaHrmUpper && this.anaerobicHrmUpper == sportSummary.anaerobicHrmUpper && this.limitHrmUpper == sportSummary.limitHrmUpper;
    }

    public final float getAerobicScore() {
        return this.aerobicScore;
    }

    public final int getAnaerobicHrmUpper() {
        return this.anaerobicHrmUpper;
    }

    public final int getAvgBalance() {
        return this.avgBalance;
    }

    public final int getAvgFatBurningRate() {
        return this.avgFatBurningRate;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final int getAvgPace() {
        return this.avgPace;
    }

    public final int getAvgStance() {
        return this.avgStance;
    }

    public final int getAvgStepRate() {
        return this.avgStepRate;
    }

    public final int getAvgStride() {
        return this.avgStride;
    }

    public final int getAvgVertical() {
        return this.avgVertical;
    }

    public final int getAvgVerticalRatio() {
        return this.avgVerticalRatio;
    }

    public final int getBestPace() {
        return this.bestPace;
    }

    public final int getBestStepRate() {
        return this.bestStepRate;
    }

    public final int getBestStride() {
        return this.bestStride;
    }

    @NotNull
    public final List<Integer> getDateHrZone() {
        return this.dateHrZone;
    }

    public final long getDynamicsCalories() {
        return this.dynamicsCalories;
    }

    public final int getFatBurning() {
        return this.fatBurning;
    }

    public final int getFatBurningRatio() {
        return this.fatBurningRatio;
    }

    public final int getLimitHrmUpper() {
        return this.limitHrmUpper;
    }

    public final int getMaxElevation() {
        return this.maxElevation;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getRecoveryTime() {
        return this.recoveryTime;
    }

    public final int getReducingFatHrmUpper() {
        return this.reducingFatHrmUpper;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public final int getStaminaHrmUpper() {
        return this.staminaHrmUpper;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getSugarConsumption() {
        return this.sugarConsumption;
    }

    public final int getSugarConsumptionRate() {
        return this.sugarConsumptionRate;
    }

    public final long getTotalCalories() {
        return this.totalCalories;
    }

    public final int getTotalClimb() {
        return this.totalClimb;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final float getVo2max() {
        return this.vo2max;
    }

    public final int getWarnUpHrmLower() {
        return this.warnUpHrmLower;
    }

    public final int getWarnUpHrmUpper() {
        return this.warnUpHrmUpper;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.startTimestamp) * 31) + Long.hashCode(this.totalTime)) * 31) + Integer.hashCode(this.sportMode)) * 31) + Long.hashCode(this.totalCalories)) * 31) + Integer.hashCode(this.totalDistance)) * 31) + Integer.hashCode(this.totalSteps)) * 31) + Long.hashCode(this.dynamicsCalories)) * 31) + this.dateHrZone.hashCode()) * 31) + Float.hashCode(this.vo2max)) * 31) + Integer.hashCode(this.maxHeartRate)) * 31) + Integer.hashCode(this.avgHeartRate)) * 31) + Integer.hashCode(this.avgPace)) * 31) + Integer.hashCode(this.bestPace)) * 31) + Float.hashCode(this.aerobicScore)) * 31) + Integer.hashCode(this.recoveryTime)) * 31) + Integer.hashCode(this.avgStepRate)) * 31) + Integer.hashCode(this.bestStepRate)) * 31) + Integer.hashCode(this.avgStride)) * 31) + Integer.hashCode(this.bestStride)) * 31) + Integer.hashCode(this.avgStance)) * 31) + Integer.hashCode(this.avgBalance)) * 31) + Integer.hashCode(this.avgVertical)) * 31) + Integer.hashCode(this.avgVerticalRatio)) * 31) + Integer.hashCode(this.fatBurning)) * 31) + Integer.hashCode(this.avgFatBurningRate)) * 31) + Integer.hashCode(this.sugarConsumption)) * 31) + Integer.hashCode(this.sugarConsumptionRate)) * 31) + Integer.hashCode(this.fatBurningRatio)) * 31) + Integer.hashCode(this.totalClimb)) * 31) + Integer.hashCode(this.maxElevation)) * 31) + Integer.hashCode(this.warnUpHrmLower)) * 31) + Integer.hashCode(this.warnUpHrmUpper)) * 31) + Integer.hashCode(this.reducingFatHrmUpper)) * 31) + Integer.hashCode(this.staminaHrmUpper)) * 31) + Integer.hashCode(this.anaerobicHrmUpper)) * 31) + Integer.hashCode(this.limitHrmUpper);
    }

    @NotNull
    public String toString() {
        return "SportSummary(startTimestamp=" + this.startTimestamp + ", totalTime=" + this.totalTime + ", sportMode=" + this.sportMode + ", totalCalories=" + this.totalCalories + ", totalDistance=" + this.totalDistance + ", totalSteps=" + this.totalSteps + ", dynamicsCalories=" + this.dynamicsCalories + ", dateHrZone=" + this.dateHrZone + ", vo2max=" + this.vo2max + ", maxHeartRate=" + this.maxHeartRate + ", avgHeartRate=" + this.avgHeartRate + ", avgPace=" + this.avgPace + ", bestPace=" + this.bestPace + ", aerobicScore=" + this.aerobicScore + ", recoveryTime=" + this.recoveryTime + ", avgStepRate=" + this.avgStepRate + ", bestStepRate=" + this.bestStepRate + ", avgStride=" + this.avgStride + ", bestStride=" + this.bestStride + ", avgStance=" + this.avgStance + ", avgBalance=" + this.avgBalance + ", avgVertical=" + this.avgVertical + ", avgVerticalRatio=" + this.avgVerticalRatio + ", fatBurning=" + this.fatBurning + ", avgFatBurningRate=" + this.avgFatBurningRate + ", sugarConsumption=" + this.sugarConsumption + ", sugarConsumptionRate=" + this.sugarConsumptionRate + ", fatBurningRatio=" + this.fatBurningRatio + ", totalClimb=" + this.totalClimb + ", maxElevation=" + this.maxElevation + ", warnUpHrmLower=" + this.warnUpHrmLower + ", warnUpHrmUpper=" + this.warnUpHrmUpper + ", reducingFatHrmUpper=" + this.reducingFatHrmUpper + ", staminaHrmUpper=" + this.staminaHrmUpper + ", anaerobicHrmUpper=" + this.anaerobicHrmUpper + ", limitHrmUpper=" + this.limitHrmUpper + ")";
    }
}
