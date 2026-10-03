package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStatus;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\f\u001a\u00020\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0002J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/su4;", "", "", "startTime", "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStatus;", "dataList", "", "c", "endTime", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "", "type", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", "a", "b", "d", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDataProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataProcess.kt\ncom/heytap/health/hrv/model/DataProcess\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n766#2:170\n857#2,2:171\n1855#2,2:173\n1045#2:175\n*S KotlinDebug\n*F\n+ 1 DataProcess.kt\ncom/heytap/health/hrv/model/DataProcess\n*L\n44#1:170\n44#1:171,2\n105#1:173,2\n167#1:175\n*E\n"})
public final class su4 {
    public static final int $stable = 0;

    @NotNull
    public final List<PhysicalMentalAchievement> a(long startTime, long endTime, @NotNull List<PhysicalMentalAchievement> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        de8.Companion companion = de8.INSTANCE;
        LocalDate localDateF = companion.f(startTime);
        long jAbs = (long) (Math.abs(companion.f(endTime).toEpochDay() - localDateF.toEpochDay()) + ((double) 1));
        for (long j2 = 0; j2 < jAbs; j2++) {
            PhysicalMentalAchievement physicalMentalAchievement = new PhysicalMentalAchievement();
            LocalDate localDatePlusDays = localDateF.plusDays(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "startDate.plusDays(i)");
            physicalMentalAchievement.setDate(v05.i(o05.H(localDatePlusDays)));
            arrayList.add(physicalMentalAchievement);
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            for (long j3 = 0; j3 < jAbs; j3++) {
                int i2 = (int) j3;
                if (dataList.get(i).getDate() == ((PhysicalMentalAchievement) arrayList.get(i2)).getDate()) {
                    arrayList.set(i2, dataList.get(i));
                }
            }
        }
        return arrayList;
    }

    public final List<PhysicalMentalStat> b(long startTime, long endTime, List<PhysicalMentalStat> dataList) {
        ArrayList arrayList = new ArrayList();
        de8.Companion companion = de8.INSTANCE;
        LocalDate localDateF = companion.f(startTime);
        long jAbs = (long) (Math.abs(companion.f(endTime).toEpochDay() - localDateF.toEpochDay()) + ((double) 1));
        for (long j2 = 0; j2 < jAbs; j2++) {
            PhysicalMentalStat physicalMentalStat = new PhysicalMentalStat(null, 0, null, null, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215, null);
            LocalDate localDatePlusDays = localDateF.plusDays(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "startDate.plusDays(i)");
            physicalMentalStat.setDate(v05.i(o05.H(localDatePlusDays)));
            arrayList.add(physicalMentalStat);
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            for (long j3 = 0; j3 < jAbs; j3++) {
                int i2 = (int) j3;
                if (dataList.get(i).getDate() == ((PhysicalMentalStat) arrayList.get(i2)).getDate()) {
                    arrayList.set(i2, dataList.get(i));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<PhysicalMentalStatus> c(long startTime, @NotNull List<PhysicalMentalStatus> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        if (dataList.isEmpty()) {
            de8.Companion companion = de8.INSTANCE;
            long j2 = companion.j(companion.f(startTime));
            LocalDate localDatePlusDays = companion.f(startTime).plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "HDateUtil.getLocalDate(startTime).plusDays(1)");
            long j3 = companion.j(localDatePlusDays);
            arrayList.add(new PhysicalMentalStatus(null, j2, null, null, 0, 0, 0, 0, 0, 509, null));
            arrayList.add(new PhysicalMentalStatus(null, j3, null, null, 0, 0, 0, 0, 0, 509, null));
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : dataList) {
            if (((PhysicalMentalStatus) obj).getStress() > 0) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final List<PhysicalMentalStat> d(long startTime, long endTime, List<PhysicalMentalStat> dataList) {
        ArrayList arrayList = new ArrayList();
        de8.Companion companion = de8.INSTANCE;
        LocalDate localDateY = o05.y(companion.f(startTime));
        long totalMonths = Period.between(localDateY, o05.y(companion.f(endTime))).toTotalMonths() + 1;
        for (long j2 = 0; j2 < totalMonths; j2++) {
            PhysicalMentalStat physicalMentalStat = new PhysicalMentalStat(null, 0, null, null, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215, null);
            LocalDate localDatePlusMonths = localDateY.plusMonths(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "startDate.plusMonths(i)");
            physicalMentalStat.setDate(v05.i(o05.H(localDatePlusMonths)));
            arrayList.add(physicalMentalStat);
        }
        for (PhysicalMentalStat physicalMentalStat2 : dataList) {
            physicalMentalStat2.setDate(v05.i(o05.H(o05.y(o05.D(v05.a(physicalMentalStat2.getDate()))))));
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            for (long j3 = 0; j3 < totalMonths; j3++) {
                int i2 = (int) j3;
                if (dataList.get(i).getDate() == ((PhysicalMentalStat) arrayList.get(i2)).getDate()) {
                    arrayList.set(i2, dataList.get(i));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<PhysicalMentalStat> e(long startTime, long endTime, @NotNull List<PhysicalMentalStat> dataList, int type) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return type == 4 ? b(startTime, endTime, dataList) : d(startTime, endTime, dataList);
    }
}
