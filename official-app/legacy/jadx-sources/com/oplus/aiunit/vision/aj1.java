package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/aj1;", "", "Lcom/oplus/aiunit/vision/o78;", "a", "gluCardBean", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "bloodSugarList", "b", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class aj1 {
    @NotNull
    public final o78 a() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d()).toLocalDate().atStartOfDay();
        long epochMilli = localDateTimeAtStartOfDay.atZone(mq8Var.d()).toInstant().toEpochMilli();
        long epochMilli2 = LocalDateTime.of(localDateTimeAtStartOfDay.plusDays(1L).toLocalDate(), LocalTime.MIN).atZone(mq8Var.d()).toInstant().toEpochMilli();
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(epochMilli);
        timeStampedData.setY(-10.0f);
        o78 o78Var = new o78();
        o78Var.e().add(timeStampedData);
        o78Var.h(epochMilli);
        o78Var.g(epochMilli2);
        o78Var.k(true);
        return o78Var;
    }

    @NotNull
    public final o78 b(@NotNull o78 gluCardBean, @NotNull List<? extends BloodSugar> bloodSugarList) {
        Intrinsics.checkNotNullParameter(gluCardBean, "gluCardBean");
        Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
        if (bloodSugarList.isEmpty()) {
            return a();
        }
        o78 o78Var = new o78();
        o78Var.j(gluCardBean.getLastBloodSugarStat());
        o78Var.h(gluCardBean.getChartStartTime());
        o78Var.g(gluCardBean.getChartEndTime());
        o78Var.k(gluCardBean.getIsNoData());
        for (BloodSugar bloodSugar : bloodSugarList) {
            Double value = bloodSugar.getValue();
            if (value != null) {
                double dDoubleValue = value.doubleValue();
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(bloodSugar.getDataCreatedTimestamp());
                timeStampedData.setY((float) dDoubleValue);
                timeStampedData.setHeartRateType(bloodSugar.getType());
                o78Var.e().add(timeStampedData);
            }
        }
        o78Var.i(bloodSugarList.get(bloodSugarList.size() - 1));
        return o78Var;
    }
}
