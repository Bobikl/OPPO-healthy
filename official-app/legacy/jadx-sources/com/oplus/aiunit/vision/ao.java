package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.health.hrv.service.SkipDay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ao;", "", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "Lcom/heytap/health/hrv/service/SkipDay;", "skipDayList", "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", "dataList", "a", "<init>", "()V", "Companion", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAchievementTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AchievementTransform.kt\ncom/heytap/health/hrv/model/AchievementTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1855#2,2:47\n1855#2,2:49\n*S KotlinDebug\n*F\n+ 1 AchievementTransform.kt\ncom/heytap/health/hrv/model/AchievementTransform\n*L\n28#1:47,2\n34#1:49,2\n*E\n"})
public final class ao {
    public static final int $stable = 0;

    @NotNull
    public final List<SkipDay> a(int startDate, int endDate, @NotNull List<SkipDay> skipDayList, @NotNull List<PhysicalMentalAchievement> dataList) {
        Intrinsics.checkNotNullParameter(skipDayList, "skipDayList");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        HashMap map = new HashMap();
        for (SkipDay skipDay : skipDayList) {
            if (!map.containsKey(Integer.valueOf(skipDay.getDate()))) {
                map.put(Integer.valueOf(skipDay.getDate()), skipDay);
            }
        }
        for (PhysicalMentalAchievement physicalMentalAchievement : dataList) {
            int date = physicalMentalAchievement.getDate();
            if (sz4.g(physicalMentalAchievement) && date >= startDate && date <= endDate && !map.containsKey(Integer.valueOf(date))) {
                map.put(Integer.valueOf(date), new SkipDay(date, physicalMentalAchievement.getTodaySkipReason()));
            }
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "skipList.values");
        arrayList.addAll(collectionValues);
        return arrayList;
    }
}
