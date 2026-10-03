package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/ach;", "", "", SnoreHistoryActivity.CUR_DAY_START_TIME, SnoreHistoryActivity.CUR_DAY_END_TIME, "", "Lcom/oplus/aiunit/vision/ihh;", "sleepFrgBeanList", "Lcom/oplus/aiunit/vision/jkh;", "a", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepDayBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDayBuild.kt\ncom/heytap/health/sleep/day/model/SleepDayBuild\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1855#2:73\n1855#2,2:74\n1856#2:76\n1855#2,2:77\n*S KotlinDebug\n*F\n+ 1 SleepDayBuild.kt\ncom/heytap/health/sleep/day/model/SleepDayBuild\n*L\n48#1:73\n50#1:74,2\n48#1:76\n60#1:77,2\n*E\n"})
public final class ach {
    public static final int $stable = 0;
    public static final long HOUR_TIME = 3600000;

    @NotNull
    public static final String TAG = "SleepDayBuild";

    @Nullable
    public final SleepMainBean a(long curDayStartTime, long curDayEndTime, @NotNull List<? extends ihh> sleepFrgBeanList) {
        Intrinsics.checkNotNullParameter(sleepFrgBeanList, "sleepFrgBeanList");
        if (sleepFrgBeanList.isEmpty()) {
            return null;
        }
        List arrayList = new ArrayList();
        int iN = 0;
        if (sleepFrgBeanList.size() == 1) {
            arrayList.add(sleepFrgBeanList.get(0));
        } else {
            ArrayList<List> arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(sleepFrgBeanList.get(0));
            int size = sleepFrgBeanList.size();
            for (int i = 1; i < size; i++) {
                ihh ihhVar = sleepFrgBeanList.get(i);
                if (ihhVar.j() - sleepFrgBeanList.get(i - 1).d() < 3600000) {
                    arrayList3.add(ihhVar);
                } else {
                    arrayList2.add(arrayList3);
                    arrayList3 = new ArrayList();
                    arrayList3.add(ihhVar);
                }
                if (i == sleepFrgBeanList.size() - 1) {
                    arrayList2.add(arrayList3);
                }
            }
            int i2 = 0;
            for (List list : arrayList2) {
                Iterator it = list.iterator();
                int iN2 = 0;
                while (it.hasNext()) {
                    iN2 += ((ihh) it.next()).n();
                }
                if (iN2 > i2) {
                    arrayList = list;
                    i2 = iN2;
                }
            }
        }
        List list2 = arrayList;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            iN += ((ihh) it2.next()).n();
        }
        if (iN < 120) {
            return null;
        }
        SleepMainBean jkhVar = new SleepMainBean(curDayStartTime, curDayEndTime, list2);
        StringBuilder sb = new StringBuilder();
        sb.append("mainSleep:");
        sb.append(jkhVar);
        z7b.f(TAG, "mainSleep:" + jkhVar);
        return jkhVar;
    }
}
