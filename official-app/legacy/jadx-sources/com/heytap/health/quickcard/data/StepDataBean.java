package com.heytap.health.quickcard.data;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/quickcard/data/StepDataBean;", "", "()V", "chartList", "", "Lcom/heytap/health/quickcard/data/StepDataBean$StepDataStat;", "getChartList", "()Ljava/util/List;", "highestStepStat", "Lcom/heytap/health/quickcard/data/StepDataBean$HighestStepStat;", "getHighestStepStat", "()Lcom/heytap/health/quickcard/data/StepDataBean$HighestStepStat;", "setHighestStepStat", "(Lcom/heytap/health/quickcard/data/StepDataBean$HighestStepStat;)V", "stepsGoal", "", "getStepsGoal", "()I", "setStepsGoal", "(I)V", "totalSteps", "getTotalSteps", "setTotalSteps", "toString", "", "HighestStepStat", "StepDataStat", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StepDataBean {

    @NotNull
    private final List<StepDataStat> chartList = new ArrayList();

    @Nullable
    private HighestStepStat highestStepStat;
    private int stepsGoal;
    private int totalSteps;

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\b\u0010(\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006)"}, d2 = {"Lcom/heytap/health/quickcard/data/StepDataBean$HighestStepStat;", "", "date", "", "totalSteps", "", "totalDistance", "totalDistanceStr", "", "totalCalories", "totalCaloriesStr", "(JIILjava/lang/String;JLjava/lang/String;)V", "getDate", "()J", "getTotalCalories", "setTotalCalories", "(J)V", "getTotalCaloriesStr", "()Ljava/lang/String;", "setTotalCaloriesStr", "(Ljava/lang/String;)V", "getTotalDistance", "()I", "setTotalDistance", "(I)V", "getTotalDistanceStr", "setTotalDistanceStr", "getTotalSteps", "setTotalSteps", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HighestStepStat {
        private final long date;
        private long totalCalories;

        @NotNull
        private String totalCaloriesStr;
        private int totalDistance;

        @NotNull
        private String totalDistanceStr;
        private int totalSteps;

        public HighestStepStat() {
            this(0L, 0, 0, null, 0L, null, 63, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTotalSteps() {
            return this.totalSteps;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTotalDistance() {
            return this.totalDistance;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTotalDistanceStr() {
            return this.totalDistanceStr;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getTotalCalories() {
            return this.totalCalories;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTotalCaloriesStr() {
            return this.totalCaloriesStr;
        }

        @NotNull
        public final HighestStepStat copy(long date, int totalSteps, int totalDistance, @NotNull String totalDistanceStr, long totalCalories, @NotNull String totalCaloriesStr) {
            Intrinsics.checkNotNullParameter(totalDistanceStr, "totalDistanceStr");
            Intrinsics.checkNotNullParameter(totalCaloriesStr, "totalCaloriesStr");
            return new HighestStepStat(date, totalSteps, totalDistance, totalDistanceStr, totalCalories, totalCaloriesStr);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighestStepStat)) {
                return false;
            }
            HighestStepStat highestStepStat = (HighestStepStat) other;
            return this.date == highestStepStat.date && this.totalSteps == highestStepStat.totalSteps && this.totalDistance == highestStepStat.totalDistance && Intrinsics.areEqual(this.totalDistanceStr, highestStepStat.totalDistanceStr) && this.totalCalories == highestStepStat.totalCalories && Intrinsics.areEqual(this.totalCaloriesStr, highestStepStat.totalCaloriesStr);
        }

        public final long getDate() {
            return this.date;
        }

        public final long getTotalCalories() {
            return this.totalCalories;
        }

        @NotNull
        public final String getTotalCaloriesStr() {
            return this.totalCaloriesStr;
        }

        public final int getTotalDistance() {
            return this.totalDistance;
        }

        @NotNull
        public final String getTotalDistanceStr() {
            return this.totalDistanceStr;
        }

        public final int getTotalSteps() {
            return this.totalSteps;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.date) * 31) + Integer.hashCode(this.totalSteps)) * 31) + Integer.hashCode(this.totalDistance)) * 31) + this.totalDistanceStr.hashCode()) * 31) + Long.hashCode(this.totalCalories)) * 31) + this.totalCaloriesStr.hashCode();
        }

        public final void setTotalCalories(long j2) {
            this.totalCalories = j2;
        }

        public final void setTotalCaloriesStr(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.totalCaloriesStr = str;
        }

        public final void setTotalDistance(int i) {
            this.totalDistance = i;
        }

        public final void setTotalDistanceStr(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.totalDistanceStr = str;
        }

        public final void setTotalSteps(int i) {
            this.totalSteps = i;
        }

        @NotNull
        public String toString() {
            return "HighestStepStat(date=" + this.date + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalDistanceStr='" + this.totalDistanceStr + "', totalCalories=" + this.totalCalories + ", totalCaloriesStr='" + this.totalCaloriesStr + "')";
        }

        public HighestStepStat(long j2, int i, int i2, @NotNull String totalDistanceStr, long j3, @NotNull String totalCaloriesStr) {
            Intrinsics.checkNotNullParameter(totalDistanceStr, "totalDistanceStr");
            Intrinsics.checkNotNullParameter(totalCaloriesStr, "totalCaloriesStr");
            this.date = j2;
            this.totalSteps = i;
            this.totalDistance = i2;
            this.totalDistanceStr = totalDistanceStr;
            this.totalCalories = j3;
            this.totalCaloriesStr = totalCaloriesStr;
        }

        public /* synthetic */ HighestStepStat(long j2, int i, int i2, String str, long j3, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0L : j2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? 0L : j3, (i3 & 32) != 0 ? "" : str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\b\u0010/\u001a\u00020\bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00060"}, d2 = {"Lcom/heytap/health/quickcard/data/StepDataBean$StepDataStat;", "", "date", "", "totalSteps", "", "totalDistance", "totalDistanceStr", "", "totalCalories", "totalCaloriesStr", "walkAvgHeartRate", "walkAvgHeartRateStr", "(JIILjava/lang/String;JLjava/lang/String;ILjava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "getTotalCalories", "setTotalCalories", "getTotalCaloriesStr", "()Ljava/lang/String;", "setTotalCaloriesStr", "(Ljava/lang/String;)V", "getTotalDistance", "()I", "setTotalDistance", "(I)V", "getTotalDistanceStr", "setTotalDistanceStr", "getTotalSteps", "setTotalSteps", "getWalkAvgHeartRate", "getWalkAvgHeartRateStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StepDataStat {
        private long date;
        private long totalCalories;

        @NotNull
        private String totalCaloriesStr;
        private int totalDistance;

        @NotNull
        private String totalDistanceStr;
        private int totalSteps;
        private final int walkAvgHeartRate;

        @NotNull
        private final String walkAvgHeartRateStr;

        public StepDataStat() {
            this(0L, 0, 0, null, 0L, null, 0, null, 255, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTotalSteps() {
            return this.totalSteps;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTotalDistance() {
            return this.totalDistance;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTotalDistanceStr() {
            return this.totalDistanceStr;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getTotalCalories() {
            return this.totalCalories;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTotalCaloriesStr() {
            return this.totalCaloriesStr;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getWalkAvgHeartRate() {
            return this.walkAvgHeartRate;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getWalkAvgHeartRateStr() {
            return this.walkAvgHeartRateStr;
        }

        @NotNull
        public final StepDataStat copy(long date, int totalSteps, int totalDistance, @NotNull String totalDistanceStr, long totalCalories, @NotNull String totalCaloriesStr, int walkAvgHeartRate, @NotNull String walkAvgHeartRateStr) {
            Intrinsics.checkNotNullParameter(totalDistanceStr, "totalDistanceStr");
            Intrinsics.checkNotNullParameter(totalCaloriesStr, "totalCaloriesStr");
            Intrinsics.checkNotNullParameter(walkAvgHeartRateStr, "walkAvgHeartRateStr");
            return new StepDataStat(date, totalSteps, totalDistance, totalDistanceStr, totalCalories, totalCaloriesStr, walkAvgHeartRate, walkAvgHeartRateStr);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepDataStat)) {
                return false;
            }
            StepDataStat stepDataStat = (StepDataStat) other;
            return this.date == stepDataStat.date && this.totalSteps == stepDataStat.totalSteps && this.totalDistance == stepDataStat.totalDistance && Intrinsics.areEqual(this.totalDistanceStr, stepDataStat.totalDistanceStr) && this.totalCalories == stepDataStat.totalCalories && Intrinsics.areEqual(this.totalCaloriesStr, stepDataStat.totalCaloriesStr) && this.walkAvgHeartRate == stepDataStat.walkAvgHeartRate && Intrinsics.areEqual(this.walkAvgHeartRateStr, stepDataStat.walkAvgHeartRateStr);
        }

        public final long getDate() {
            return this.date;
        }

        public final long getTotalCalories() {
            return this.totalCalories;
        }

        @NotNull
        public final String getTotalCaloriesStr() {
            return this.totalCaloriesStr;
        }

        public final int getTotalDistance() {
            return this.totalDistance;
        }

        @NotNull
        public final String getTotalDistanceStr() {
            return this.totalDistanceStr;
        }

        public final int getTotalSteps() {
            return this.totalSteps;
        }

        public final int getWalkAvgHeartRate() {
            return this.walkAvgHeartRate;
        }

        @NotNull
        public final String getWalkAvgHeartRateStr() {
            return this.walkAvgHeartRateStr;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.date) * 31) + Integer.hashCode(this.totalSteps)) * 31) + Integer.hashCode(this.totalDistance)) * 31) + this.totalDistanceStr.hashCode()) * 31) + Long.hashCode(this.totalCalories)) * 31) + this.totalCaloriesStr.hashCode()) * 31) + Integer.hashCode(this.walkAvgHeartRate)) * 31) + this.walkAvgHeartRateStr.hashCode();
        }

        public final void setDate(long j2) {
            this.date = j2;
        }

        public final void setTotalCalories(long j2) {
            this.totalCalories = j2;
        }

        public final void setTotalCaloriesStr(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.totalCaloriesStr = str;
        }

        public final void setTotalDistance(int i) {
            this.totalDistance = i;
        }

        public final void setTotalDistanceStr(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.totalDistanceStr = str;
        }

        public final void setTotalSteps(int i) {
            this.totalSteps = i;
        }

        @NotNull
        public String toString() {
            return "StepDataStat(date=" + this.date + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalDistanceStr='" + this.totalDistanceStr + "', totalCalories=" + this.totalCalories + ", totalCaloriesStr='" + this.totalCaloriesStr + "', walkAvgHeartRate=" + this.walkAvgHeartRate + ", walkAvgHeartRateStr='" + this.walkAvgHeartRateStr + "')";
        }

        public StepDataStat(long j2, int i, int i2, @NotNull String totalDistanceStr, long j3, @NotNull String totalCaloriesStr, int i3, @NotNull String walkAvgHeartRateStr) {
            Intrinsics.checkNotNullParameter(totalDistanceStr, "totalDistanceStr");
            Intrinsics.checkNotNullParameter(totalCaloriesStr, "totalCaloriesStr");
            Intrinsics.checkNotNullParameter(walkAvgHeartRateStr, "walkAvgHeartRateStr");
            this.date = j2;
            this.totalSteps = i;
            this.totalDistance = i2;
            this.totalDistanceStr = totalDistanceStr;
            this.totalCalories = j3;
            this.totalCaloriesStr = totalCaloriesStr;
            this.walkAvgHeartRate = i3;
            this.walkAvgHeartRateStr = walkAvgHeartRateStr;
        }

        public /* synthetic */ StepDataStat(long j2, int i, int i2, String str, long j3, String str2, int i3, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? "" : str, (i4 & 16) == 0 ? j3 : 0L, (i4 & 32) != 0 ? "" : str2, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) == 0 ? str3 : "");
        }
    }

    @NotNull
    public final List<StepDataStat> getChartList() {
        return this.chartList;
    }

    @Nullable
    public final HighestStepStat getHighestStepStat() {
        return this.highestStepStat;
    }

    public final int getStepsGoal() {
        return this.stepsGoal;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final void setHighestStepStat(@Nullable HighestStepStat highestStepStat) {
        this.highestStepStat = highestStepStat;
    }

    public final void setStepsGoal(int i) {
        this.stepsGoal = i;
    }

    public final void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    @NotNull
    public String toString() {
        return "StepDataBean(totalSteps=" + this.totalSteps + ", stepsGoal=" + this.stepsGoal + ", highestStepStat=" + this.highestStepStat + ", chartList=" + this.chartList + ")";
    }
}
