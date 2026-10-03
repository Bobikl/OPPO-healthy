package com.heytap.health.insight.device;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/heytap/health/insight/device/SingleDimenNotifyId;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "STEP_TRENT_WEEK", "STEP_TRENT_MONTH", "STEP_REACH_GOAL_WEEK", "STEP_REACH_GOAL_MONTH", "STEP_DISTANCE_WEEK", "STEP_DISTANCE_MONTH", "CALORIE_TRENT_WEEK", "CALORIE_TRENT_MONTH", "CALORIE_REACH_GOAL_WEEK", "CALORIE_REACH_GOAL_MONTH", "SLEEP_SCORE_WEEK", "SLEEP_HR_DETAIL", "SLEEP_DURATION_WEEK", "SLEEP_LAW_WEEK", "SNORE_RISK_WEEK", "SNORE_DURATION_WEEK", "SNORE_TIMES_WEEK", "SNORE_DECIBEL_WEEK", "HEART_SLEEP_BASE_MONTH", "HEART_REST_MONTH", "HEART_WALK_MONTH", "HEART_SLEEP_BASE_WEEK", "HEART_REST_WEEK", "HEART_WALK_WEEK", "HRV_WEEK", "HRV_MONTH", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SingleDimenNotifyId {
    STEP_TRENT_WEEK("stepTrentWeek"),
    STEP_TRENT_MONTH("stepTrentMonth"),
    STEP_REACH_GOAL_WEEK("stepReachGoalWeek"),
    STEP_REACH_GOAL_MONTH("stepReachGoalMonth"),
    STEP_DISTANCE_WEEK("stepDistanceWeek"),
    STEP_DISTANCE_MONTH("stepDistanceMonth"),
    CALORIE_TRENT_WEEK("calorieTrentWeek"),
    CALORIE_TRENT_MONTH("calorieTrentMonth"),
    CALORIE_REACH_GOAL_WEEK("calorieReachGoalWeek"),
    CALORIE_REACH_GOAL_MONTH("calorieReachGoalMonth"),
    SLEEP_SCORE_WEEK("sleepScoreWeek"),
    SLEEP_HR_DETAIL("sleepHrDetail"),
    SLEEP_DURATION_WEEK("sleepDurationWeek"),
    SLEEP_LAW_WEEK("sleepLawWeek"),
    SNORE_RISK_WEEK("snoreRiskWeek"),
    SNORE_DURATION_WEEK("snoreDurationWeek"),
    SNORE_TIMES_WEEK("snoreTimesWeek"),
    SNORE_DECIBEL_WEEK("snoreDecibelWeek"),
    HEART_SLEEP_BASE_MONTH("heartSleepBaseMonth"),
    HEART_REST_MONTH("heartRestMonth"),
    HEART_WALK_MONTH("heartWalkMonth"),
    HEART_SLEEP_BASE_WEEK("heartSleepBaseWeek"),
    HEART_REST_WEEK("heartRestWeek"),
    HEART_WALK_WEEK("heartWalkWeek"),
    HRV_WEEK("hrvWeek"),
    HRV_MONTH("hrvMonth");


    @NotNull
    private final String id;

    SingleDimenNotifyId(String str) {
        this.id = str;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
