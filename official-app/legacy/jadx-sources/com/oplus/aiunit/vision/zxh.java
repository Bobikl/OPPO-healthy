package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengine.model.snore.SnoreResultBean;
import com.heytap.health.core.widget.charts.data.SnoreLevelData;
import com.heytap.health.sleep.snore.bean.SnoreWeekBean;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/zxh;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "osaResultBeanList", "Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "a", "Lcom/heytap/health/core/widget/charts/data/SnoreLevelData;", "b", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class zxh {
    public static final int $stable = 0;

    @NotNull
    public final SnoreWeekBean a(long startTime, long endTime, @NotNull List<OsaResultBean> osaResultBeanList) {
        Intrinsics.checkNotNullParameter(osaResultBeanList, "osaResultBeanList");
        SnoreWeekBean snoreWeekBean = new SnoreWeekBean();
        snoreWeekBean.setEmpty(true);
        int size = osaResultBeanList.size();
        for (int i = 0; i < size; i++) {
            OsaResultBean osaResultBean = osaResultBeanList.get(i);
            int date = osaResultBean.getDate();
            byte osaLevel = osaResultBean.getOsaLevel();
            int version = osaResultBean.getVersion();
            StringBuilder sb = new StringBuilder();
            sb.append("db item data:");
            sb.append(date);
            sb.append(", :");
            sb.append((int) osaLevel);
            sb.append(", :");
            sb.append(version);
            if (osaResultBean.getOsaLevel() >= 0) {
                snoreWeekBean.setEmpty(false);
                break;
            }
        }
        snoreWeekBean.getSnoreLevelDataList().addAll(b(startTime, endTime, osaResultBeanList));
        return snoreWeekBean;
    }

    public final List<SnoreLevelData> b(long startTime, long endTime, List<OsaResultBean> osaResultBeanList) {
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), ZoneId.systemDefault()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long j2 = 86400000;
        int iCeil = ((int) Math.ceil(epochMilli / j2)) + 1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iCeil; i++) {
            long epochMilli2 = localDateTimeAtStartOfDay.plusDays(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            SnoreLevelData snoreLevelData = new SnoreLevelData();
            snoreLevelData.setLevel(-10);
            snoreLevelData.setType(-10);
            snoreLevelData.setSnoreSumTime(0.0f);
            snoreLevelData.setSnoreSumNum(0.0f);
            snoreLevelData.setSnoreMeanDb(0.0f);
            snoreLevelData.setSnoreMaxDb(0.0f);
            snoreLevelData.setTimestamp(epochMilli2);
            arrayList.add(snoreLevelData);
        }
        if (!osaResultBeanList.isEmpty()) {
            for (OsaResultBean osaResultBean : osaResultBeanList) {
                long jA = v05.a(osaResultBean.getDate());
                int iCeil2 = (int) Math.ceil((LocalDateTime.ofInstant(Instant.ofEpochMilli(jA), ZoneId.systemDefault()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / j2);
                SnoreLevelData snoreLevelData2 = new SnoreLevelData();
                snoreLevelData2.setLevel(osaResultBean.getOsaLevel());
                snoreLevelData2.setType(snoreLevelData2.getLevel());
                snoreLevelData2.setTimestamp(jA);
                SnoreResultBean snoreResultBean = osaResultBean.getSnoreResultBean();
                if (snoreResultBean != null) {
                    snoreLevelData2.setSnoreSumTime((snoreResultBean.getSnoreSumTimeMs() / 1000.0f) / 60.0f);
                    snoreLevelData2.setSnoreSumNum(snoreResultBean.getSnoreSumNum());
                    snoreLevelData2.setSnoreMeanDb(snoreResultBean.getSnoreMeanDb());
                    snoreLevelData2.setSnoreMaxDb(snoreResultBean.getSnoreMaxDb());
                } else {
                    snoreLevelData2.setSnoreSumTime(0.0f);
                    snoreLevelData2.setSnoreSumNum(0.0f);
                    snoreLevelData2.setSnoreMeanDb(0.0f);
                    snoreLevelData2.setSnoreMaxDb(0.0f);
                }
                arrayList.set(iCeil2, snoreLevelData2);
            }
        }
        return arrayList;
    }
}
