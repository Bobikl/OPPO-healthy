package com.heytap.health.insight.data.datasource.net;

import androidx.annotation.Keep;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.sports.coach.tips.CoachTipsHealthUtilKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00063"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/InsightNetConstant;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "TIME_STAMP", "SIGNS_WRIST_TEMPER", "SIGNS_WRIST_TEMPER_BASE", "SIGNS_WRIST_TEMPER_SAFE_UP", "SIGNS_WRIST_TEMPER_Y_DESC", "SIGNS_SLEEP_HR", "SIGNS_SLEEP_HR_BASE", "SIGNS_SLEEP_HR_SAFE_UP", "SIGNS_SLEEP_HR_Y_DESC", "CROSS_SLEEP_SCORE", "CROSS_SLEEP_SCORE_Y_DESC", "CROSS_SLEEP_SCORE_BASE", "CROSS_SLEEP_IN_TS", "CROSS_SLEEP_IN_TS_BASE", "CROSS_SLEEP_IN_TS_Y_DESC", "CROSS_SLEEP_IN_TS_DURATION", "CROSS_STEPS", "CROSS_DEEP_SLEEP_RATE", "CROSS_WAKE_MINUTE", "CROSS_WAKE_COUNT", "CROSS_SPORT_MINUTES", "CROSS_SPORT_HR", "SIGNS_CODE_FEVER_START", "SIGNS_CODE_FEVER_UN_BASE", "SIGNS_CODE_FEVER_INCREMENT", "SIGNS_CODE_FEVER_DECREMENT", "SIGNS_CODE_FEVER_END", "SIGNS_CODE_FEVER_HEALTH", "CROSS_CODE_SLEEP_UN_BASE", "CROSS_CODE_SLEEP_IN_SCORE", "CROSS_CODE_SLEEP_IN_LOW", "CROSS_CODE_SLEEP_IN_HIGH", "CROSS_CODE_STEP_SLEEP_UN_BASE", "CROSS_CODE_STEP_SLEEP_SCORE", "CROSS_CODE_STEP_SLEEP_DEEP", "CROSS_CODE_STEP_SLEEP_WAKE_TIME", "CROSS_CODE_STEP_SLEEP_WAKE_COUNT", "CROSS_CODE_RUN_SLEEP_UN_BASE", "CROSS_CODE_RUN_SLEEP_SCORE_UP", "CROSS_CODE_RUN_SLEEP_SCORE_DOWN", "CROSS_CODE_RUN_SLEEP_DEEP_UP", "CROSS_CODE_RUN_SLEEP_DEEP_DOWN", "CROSS_CODE_SLEEP_HR_UP", "CROSS_CODE_SLEEP_HR_UPS", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum InsightNetConstant {
    TIME_STAMP("timestamp"),
    SIGNS_WRIST_TEMPER("wristTemp"),
    SIGNS_WRIST_TEMPER_BASE("wristTempBase"),
    SIGNS_WRIST_TEMPER_SAFE_UP("wristTempUp"),
    SIGNS_WRIST_TEMPER_Y_DESC("wristTempYDesc"),
    SIGNS_SLEEP_HR("sleepHR"),
    SIGNS_SLEEP_HR_BASE("sleepHrBase"),
    SIGNS_SLEEP_HR_SAFE_UP("sleepHrUp"),
    SIGNS_SLEEP_HR_Y_DESC("sleepHRYDesc"),
    CROSS_SLEEP_SCORE("sleepScore"),
    CROSS_SLEEP_SCORE_Y_DESC("sleepScoreYDesc"),
    CROSS_SLEEP_SCORE_BASE("sleepScoreBase"),
    CROSS_SLEEP_IN_TS("sleepInTs"),
    CROSS_SLEEP_IN_TS_BASE("sleepInBase"),
    CROSS_SLEEP_IN_TS_Y_DESC("sleepInTsYDesc"),
    CROSS_SLEEP_IN_TS_DURATION("sleepTotalTime"),
    CROSS_STEPS("steps"),
    CROSS_DEEP_SLEEP_RATE("deepRate"),
    CROSS_WAKE_MINUTE("wakeMinute"),
    CROSS_WAKE_COUNT("wakeCount"),
    CROSS_SPORT_MINUTES("sportMinutes"),
    CROSS_SPORT_HR(RecordCombinedLineChart.KEY_HEART_RATE),
    SIGNS_CODE_FEVER_START("feverStart"),
    SIGNS_CODE_FEVER_UN_BASE("feverUnBase"),
    SIGNS_CODE_FEVER_INCREMENT("feverIncr"),
    SIGNS_CODE_FEVER_DECREMENT("feverDecr"),
    SIGNS_CODE_FEVER_END("feverEnd"),
    SIGNS_CODE_FEVER_HEALTH("feverHealth"),
    CROSS_CODE_SLEEP_UN_BASE("sleepInUnBase"),
    CROSS_CODE_SLEEP_IN_SCORE("sleepInScore"),
    CROSS_CODE_SLEEP_IN_LOW("sleepInLow"),
    CROSS_CODE_SLEEP_IN_HIGH("sleepInHigh"),
    CROSS_CODE_STEP_SLEEP_UN_BASE("stepSleepUnBase"),
    CROSS_CODE_STEP_SLEEP_SCORE("stepSleepScore"),
    CROSS_CODE_STEP_SLEEP_DEEP("stepSleepDeep"),
    CROSS_CODE_STEP_SLEEP_WAKE_TIME("stepWakeTime"),
    CROSS_CODE_STEP_SLEEP_WAKE_COUNT("stepWakeCount"),
    CROSS_CODE_RUN_SLEEP_UN_BASE("runSleepUnBase"),
    CROSS_CODE_RUN_SLEEP_SCORE_UP(CoachTipsHealthUtilKt.CODE_SLEEP_SCORE_UP),
    CROSS_CODE_RUN_SLEEP_SCORE_DOWN(CoachTipsHealthUtilKt.CODE_SLEEP_SCORE_DOWN),
    CROSS_CODE_RUN_SLEEP_DEEP_UP(CoachTipsHealthUtilKt.CODE_SLEEP_DEEP_UP),
    CROSS_CODE_RUN_SLEEP_DEEP_DOWN(CoachTipsHealthUtilKt.CODE_SLEEP_DEEP_DOWN),
    CROSS_CODE_SLEEP_HR_UP("sleepHr"),
    CROSS_CODE_SLEEP_HR_UPS("sleepHrs");


    @NotNull
    private final String key;

    InsightNetConstant(String str) {
        this.key = str;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
