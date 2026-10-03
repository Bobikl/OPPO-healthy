package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturationDataStat;
import com.heytap.health.base.R$string;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002JT\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/lp8;", "", "Lcom/oplus/aiunit/vision/xv8;", "b", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "sleepLastStatList", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "spo2LastDetailList", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturationDataStat;", "spo2LastStatList", "Lcom/heytap/databaseengine/model/HeartRate;", "heartRateLastList", "Lcom/heytap/databaseengine/model/HeartRateDataStat;", "heartRateLastStatList", "Lcom/heytap/health/daily/bean/DailyActivityDayBean;", "dailyActivityDayBean", "Lcom/oplus/aiunit/vision/kp8;", "a", "", "timeMillis", "", "d", "", "c", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class lp8 {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:12:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:14:0x00f5  */
    @NotNull
    public final HealthCardData a(@NotNull List<? extends SleepDataStat> sleepLastStatList, @NotNull List<? extends BloodOxygenSaturation> spo2LastDetailList, @NotNull List<? extends BloodOxygenSaturationDataStat> spo2LastStatList, @NotNull List<? extends HeartRate> heartRateLastList, @NotNull List<? extends HeartRateDataStat> heartRateLastStatList, @NotNull DailyActivityDayBean dailyActivityDayBean) {
        String strY;
        String str;
        String strC;
        boolean z;
        String str2;
        boolean z2;
        String strC2;
        Integer num;
        Integer sleepScore;
        Integer sleepScore2;
        Intrinsics.checkNotNullParameter(sleepLastStatList, "sleepLastStatList");
        Intrinsics.checkNotNullParameter(spo2LastDetailList, "spo2LastDetailList");
        Intrinsics.checkNotNullParameter(spo2LastStatList, "spo2LastStatList");
        Intrinsics.checkNotNullParameter(heartRateLastList, "heartRateLastList");
        Intrinsics.checkNotNullParameter(heartRateLastStatList, "heartRateLastStatList");
        Intrinsics.checkNotNullParameter(dailyActivityDayBean, "dailyActivityDayBean");
        int currentStep = dailyActivityDayBean.getCurrentStep();
        int targetStep = dailyActivityDayBean.getTargetStep();
        StringBuilder sb = new StringBuilder();
        sb.append("s:");
        sb.append(currentStep);
        sb.append(" ,target:");
        sb.append(targetStep);
        Context contextA = b78.a();
        HealthCardData healthCardData = new HealthCardData();
        String string = contextA.getString(R$string.lib_base_main_health_tab);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…lib_base_main_health_tab)");
        healthCardData.X(string);
        String string2 = contextA.getString(com.heytap.health.health.impl.R$string.health_common_no_data);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.health_common_no_data)");
        healthCardData.M(string2);
        String str3 = "";
        if (!sleepLastStatList.isEmpty()) {
            SleepDataStat sleepDataStat = sleepLastStatList.get(sleepLastStatList.size() - 1);
            a7b.f("HealthCardDataTransform", "sleepLastStat:" + sleepDataStat.getDate() + ", checkedSleepScore:" + sleepDataStat.getCheckedSleepScore() + " ,sleepScore:" + sleepDataStat.getSleepScore());
            healthCardData.O((int) sleepDataStat.getTotalSleepTime());
            if (sleepDataStat.getCheckedSleepScore() != null) {
                Integer checkedSleepScore = sleepDataStat.getCheckedSleepScore();
                Intrinsics.checkNotNullExpressionValue(checkedSleepScore, "sleepLastStat.checkedSleepScore");
                if (checkedSleepScore.intValue() > 0) {
                    sleepScore2 = sleepDataStat.getCheckedSleepScore();
                } else {
                    if (sleepDataStat.getSleepScore() != null) {
                        sleepScore = sleepDataStat.getSleepScore();
                        Intrinsics.checkNotNullExpressionValue(sleepScore, "sleepLastStat.sleepScore");
                        if (sleepScore.intValue() > 0) {
                            sleepScore2 = sleepDataStat.getSleepScore();
                        }
                    }
                    num = 0;
                }
                num = sleepScore2;
            } else {
                if (sleepDataStat.getSleepScore() != null) {
                    sleepScore = sleepDataStat.getSleepScore();
                    Intrinsics.checkNotNullExpressionValue(sleepScore, "sleepLastStat.sleepScore");
                    if (sleepScore.intValue() > 0) {
                        sleepScore2 = sleepDataStat.getSleepScore();
                        num = sleepScore2;
                    }
                }
                num = 0;
            }
            mq8 mq8Var = mq8.INSTANCE;
            Integer sleepScore3 = num;
            if (mq8Var.e(System.currentTimeMillis()) == sleepDataStat.getDate()) {
                Intrinsics.checkNotNullExpressionValue(sleepScore3, "sleepScore");
                if (sleepScore3.intValue() > 0) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string3 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_last_sleep_tip);
                    Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…th_screen_last_sleep_tip)");
                    strY = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(sleepScore3), contextA.getString(R$string.lib_base_chart_today)}, 2));
                    Intrinsics.checkNotNullExpressionValue(strY, "format(...)");
                } else if (healthCardData.getSleepTime() < 120) {
                    strY = contextA.getString(R$string.lib_base_chart_today);
                    Intrinsics.checkNotNullExpressionValue(strY, "{\n                    //…_today)\n                }");
                } else {
                    int iCeil = (int) Math.ceil((sleepDataStat.getTotalDeepSleepTime() * 100.0f) / sleepDataStat.getTotalSleepTime());
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String string4 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_deep_percent);
                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…alth_screen_deep_percent)");
                    strY = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(iCeil), contextA.getString(R$string.lib_base_chart_today)}, 2));
                    Intrinsics.checkNotNullExpressionValue(strY, "format(...)");
                }
            } else {
                long jG = mq8Var.g(sleepDataStat.getDate());
                if (d(jG)) {
                    Intrinsics.checkNotNullExpressionValue(sleepScore3, "sleepScore");
                    if (sleepScore3.intValue() > 0) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String string5 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_last_sleep_tip);
                        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…th_screen_last_sleep_tip)");
                        strY = String.format(string5, Arrays.copyOf(new Object[]{String.valueOf(sleepScore3), mq8Var.y(jG, "MMMd")}, 2));
                        Intrinsics.checkNotNullExpressionValue(strY, "format(...)");
                    } else if (healthCardData.getSleepTime() < 120) {
                        strY = mq8Var.y(jG, "MMMd");
                    } else {
                        int iCeil2 = (int) Math.ceil((sleepDataStat.getTotalDeepSleepTime() * 100.0f) / sleepDataStat.getTotalSleepTime());
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        String string6 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_deep_percent);
                        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…alth_screen_deep_percent)");
                        strY = String.format(string6, Arrays.copyOf(new Object[]{String.valueOf(iCeil2), mq8Var.y(jG, "MMMd")}, 2));
                        Intrinsics.checkNotNullExpressionValue(strY, "format(...)");
                    }
                } else {
                    strY = mq8Var.y(jG, "yyyMMMd");
                }
            }
        } else {
            strY = "";
        }
        String string7 = contextA.getString(com.heytap.health.health.impl.R$string.health_sleep);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.health_sleep)");
        healthCardData.P(string7);
        String string8 = contextA.getString(com.heytap.health.health.impl.R$string.health_charts_unit_hour);
        Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.stri….health_charts_unit_hour)");
        healthCardData.K(string8);
        String string9 = contextA.getString(com.heytap.health.health.impl.R$string.health_charts_unit_minute);
        Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.stri…ealth_charts_unit_minute)");
        healthCardData.L(string9);
        healthCardData.N(strY);
        String str4 = "--";
        if (!spo2LastStatList.isEmpty()) {
            BloodOxygenSaturationDataStat bloodOxygenSaturationDataStat = spo2LastStatList.get(spo2LastStatList.size() - 1);
            str = bloodOxygenSaturationDataStat.getMinBloodOxygenSaturation() + "-" + bloodOxygenSaturationDataStat.getMaxBloodOxygenSaturation();
        } else {
            str = "--";
        }
        if (!spo2LastDetailList.isEmpty()) {
            BloodOxygenSaturation bloodOxygenSaturation = spo2LastDetailList.get(spo2LastDetailList.size() - 1);
            mq8 mq8Var2 = mq8.INSTANCE;
            if (mq8Var2.e(System.currentTimeMillis()) == mq8Var2.e(bloodOxygenSaturation.getDataCreatedTimestamp())) {
                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                String string10 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_last_spo2_tip);
                Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.stri…lth_screen_last_spo2_tip)");
                strC = String.format(string10, Arrays.copyOf(new Object[]{String.valueOf(bloodOxygenSaturation.getBloodOxygenSaturationValue()), mq8Var2.y(bloodOxygenSaturation.getDataCreatedTimestamp(), v05.DATE_FORMAT_HOUR)}, 2));
                Intrinsics.checkNotNullExpressionValue(strC, "format(...)");
            } else {
                strC = c(bloodOxygenSaturation.getDataCreatedTimestamp());
            }
            z = false;
        } else {
            str3 = "";
            strC = str3;
            z = true;
        }
        String string11 = contextA.getString(com.heytap.health.bloodoxygen.R$string.health_blood_oxygen);
        Intrinsics.checkNotNullExpressionValue(string11, "context.getString(com.he…ring.health_blood_oxygen)");
        healthCardData.S(string11);
        healthCardData.R(z);
        healthCardData.T("%");
        healthCardData.U(str);
        healthCardData.Q(strC);
        if (!heartRateLastList.isEmpty()) {
            HeartRate heartRate = heartRateLastList.get(heartRateLastList.size() - 1);
            mq8 mq8Var3 = mq8.INSTANCE;
            if (mq8Var3.e(System.currentTimeMillis()) == mq8Var3.e(heartRate.getDataCreatedTimestamp())) {
                StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                String string12 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_last_heart_rate_tip);
                Intrinsics.checkNotNullExpressionValue(string12, "context.getString(R.stri…reen_last_heart_rate_tip)");
                strC2 = String.format(string12, Arrays.copyOf(new Object[]{String.valueOf(heartRate.getHeartRateValue()), mq8Var3.y(heartRate.getDataCreatedTimestamp(), v05.DATE_FORMAT_HOUR)}, 2));
                Intrinsics.checkNotNullExpressionValue(strC2, "format(...)");
            } else {
                strC2 = c(heartRate.getDataCreatedTimestamp());
            }
            str2 = strC2;
            z2 = false;
        } else {
            str2 = str3;
            z2 = true;
        }
        if (!heartRateLastStatList.isEmpty()) {
            HeartRateDataStat heartRateDataStat = heartRateLastStatList.get(heartRateLastStatList.size() - 1);
            str4 = heartRateDataStat.getMinHeartRate() + "-" + heartRateDataStat.getMaxHeartRate();
        }
        String string13 = contextA.getString(com.heytap.health.heartrate.R$string.health_heart_rate);
        Intrinsics.checkNotNullExpressionValue(string13, "context.getString(com.he…string.health_heart_rate)");
        healthCardData.H(string13);
        healthCardData.G(z2);
        healthCardData.J(str4);
        String string14 = contextA.getString(com.heytap.health.health_base.R$string.health_base_heart_rate_state_util);
        Intrinsics.checkNotNullExpressionValue(string14, "context.getString(com.he…se_heart_rate_state_util)");
        healthCardData.I(string14);
        healthCardData.F(str2);
        healthCardData.W(dailyActivityDayBean.getTargetStep());
        healthCardData.V(dailyActivityDayBean.getCurrentStep());
        healthCardData.C(dailyActivityDayBean.getTargetCalorie());
        healthCardData.B(dailyActivityDayBean.getCurrentCalorie());
        healthCardData.E(dailyActivityDayBean.getTargetTime());
        healthCardData.D(dailyActivityDayBean.getCurrentTime());
        healthCardData.A(dailyActivityDayBean.getTargetActive());
        healthCardData.z(dailyActivityDayBean.getCurrentActive());
        return healthCardData;
    }

    @NotNull
    public final HealthUnauthorizedData b() {
        Context contextA = b78.a();
        HealthUnauthorizedData healthUnauthorizedData = new HealthUnauthorizedData();
        String string = contextA.getString(R$string.lib_base_main_health_tab);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…lib_base_main_health_tab)");
        healthUnauthorizedData.f(string);
        String string2 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_cur_day_no_step_tip);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…reen_cur_day_no_step_tip)");
        healthUnauthorizedData.e(string2);
        String string3 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_authorized_guide_tip);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…een_authorized_guide_tip)");
        healthUnauthorizedData.d(string3);
        return healthUnauthorizedData;
    }

    public final String c(long timeMillis) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), zoneIdSystemDefault).toLocalDate().getYear() - LocalDateTime.ofInstant(Instant.ofEpochMilli(timeMillis), zoneIdSystemDefault).toLocalDate().getYear()) != 0 ? mq8.INSTANCE.y(timeMillis, "yyyMMMd") : mq8.INSTANCE.y(timeMillis, "MMMd");
    }

    public final boolean d(long timeMillis) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), zoneIdSystemDefault).toLocalDate().getYear() - LocalDateTime.ofInstant(Instant.ofEpochMilli(timeMillis), zoneIdSystemDefault).toLocalDate().getYear()) == 0;
    }
}
