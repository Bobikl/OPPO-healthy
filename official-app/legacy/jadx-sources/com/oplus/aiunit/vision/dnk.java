package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/dnk;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "dataList", "a", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUsageDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsageDataTransform.kt\ncom/heytap/health/sleep/disturb/model/UsageDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1855#2,2:40\n*S KotlinDebug\n*F\n+ 1 UsageDataTransform.kt\ncom/heytap/health/sleep/disturb/model/UsageDataTransform\n*L\n31#1:40,2\n*E\n"})
public final class dnk {
    public static final int $stable = 0;

    @NotNull
    public final List<SleepMainData> a(long startTime, long endTime, @NotNull List<SleepMainData> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d());
        long jM = mq8Var.m(endTime, startTime);
        lw5.a("UsageDataTransform", "daysNum:" + jM);
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= jM) {
            while (true) {
                LocalDateTime localDateTimePlusDays = localDateTimeOfInstant.plusDays(j2);
                mq8 mq8Var2 = mq8.INSTANCE;
                long epochMilli = localDateTimePlusDays.atZone(mq8Var2.d()).toInstant().toEpochMilli();
                SleepMainData sleepMainData = new SleepMainData();
                sleepMainData.setDate(mq8Var2.e(epochMilli));
                arrayList.add(sleepMainData);
                if (j2 == jM) {
                    break;
                }
                j2++;
            }
        }
        for (SleepMainData sleepMainData2 : dataList) {
            mq8 mq8Var3 = mq8.INSTANCE;
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(mq8Var3.g(sleepMainData2.getDate())), mq8Var3.d()).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), sleepMainData2);
        }
        return arrayList;
    }
}
