package com.heytap.device.sleep;

import com.heytap.device.data.api.Holiday;
import com.heytap.device.data.api.HolidayListData;
import com.heytap.device.sleep.SleepRestRepository;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.asc;
import com.oplus.aiunit.vision.ash;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.hii;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.uxf;
import com.oplus.aiunit.vision.vd5;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u0003J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005J(\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0002J\u0016\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0002R\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/heytap/device/sleep/SleepRestRepository;", kq5.NOT_SET, kq5.NOT_SET, "Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "oldRestList", "Lcom/oplus/aiunit/vision/asc;", "m", kq5.NOT_SET, "restList", "d", "sleepRest", "c", "g", "n", "newRest", kq5.NOT_SET, "maxCount", "j", "rest", kq5.NOT_SET, "i", "timeNow", "findNextWeek", "e", "Lcom/heytap/device/data/api/Holiday;", "l", "holidayList", kq5.NOT_SET, "o", kq5.NOT_SET, "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "TAG", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepRestRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRestRepository.kt\ncom/heytap/device/sleep/SleepRestRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n766#2:412\n857#2,2:413\n2333#2,14:415\n766#2:429\n857#2,2:430\n1045#2:432\n1855#2,2:433\n1855#2,2:435\n1855#2,2:437\n1855#2,2:439\n1477#2:441\n1502#2,3:442\n1505#2,3:452\n1855#2,2:455\n766#2:457\n857#2,2:458\n1855#2,2:460\n766#2:462\n857#2,2:463\n1549#2:465\n1620#2,2:466\n1622#2:469\n372#3,7:445\n1#4:468\n*S KotlinDebug\n*F\n+ 1 SleepRestRepository.kt\ncom/heytap/device/sleep/SleepRestRepository\n*L\n38#1:412\n38#1:413,2\n38#1:415,14\n45#1:429\n45#1:430,2\n45#1:432\n79#1:433,2\n93#1:435,2\n105#1:437,2\n194#1:439,2\n222#1:441\n222#1:442,3\n222#1:452,3\n225#1:455,2\n249#1:457\n249#1:458,2\n249#1:460,2\n331#1:462\n331#1:463,2\n331#1:465\n331#1:466,2\n331#1:469\n222#1:445,7\n*E\n"})
public final class SleepRestRepository {

    @NotNull
    public static final SleepRestRepository INSTANCE = new SleepRestRepository();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "SleepRestRepository";

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", kq5.NOT_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SleepRestRepository.kt\ncom/heytap/device/sleep/SleepRestRepository\n*L\n1#1,328:1\n45#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((asc) t).p()), Integer.valueOf(((asc) t2).p()));
        }
    }

    public static /* synthetic */ int f(SleepRestRepository sleepRestRepository, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return sleepRestRepository.e(i, list, z);
    }

    public static final boolean k(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @NotNull
    public final List<asc> c(@NotNull SleepSettingBean.SleepRest sleepRest) {
        Intrinsics.checkNotNullParameter(sleepRest, "sleepRest");
        List<Integer> dayOfWeekList = sleepRest.getDayOfWeekList();
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(dayOfWeekList, "dayOfWeekList");
        for (Integer num : dayOfWeekList) {
            Integer numValueOf = sleepRest.getWakeUpTime() <= sleepRest.getBedTime() ? Integer.valueOf(num.intValue() - 1) : num;
            int bedTime = sleepRest.getBedTime();
            int wakeUpTime = sleepRest.getWakeUpTime();
            Intrinsics.checkNotNullExpressionValue(numValueOf, "startDay");
            int iIntValue = numValueOf.intValue();
            Intrinsics.checkNotNullExpressionValue(num, "endDay");
            arrayList.add(new asc(bedTime, wakeUpTime, iIntValue, num.intValue(), sleepRest.getCreateTime(), sleepRest.getExcludeHoliday()));
        }
        return arrayList;
    }

    @NotNull
    public final List<asc> d(@NotNull List<? extends SleepSettingBean.SleepRest> restList) {
        Intrinsics.checkNotNullParameter(restList, "restList");
        if (restList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = restList.iterator();
        while (it.hasNext()) {
            arrayList.addAll(INSTANCE.c((SleepSettingBean.SleepRest) it.next()));
        }
        return arrayList;
    }

    public final int e(int timeNow, List<asc> restList, boolean findNextWeek) {
        int size = restList.size();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iB = restList.get(i3).b(timeNow, findNextWeek);
            if (iB > 0 && (i2 == 0 || iB < i2)) {
                i = i3;
                i2 = iB;
            }
        }
        return i;
    }

    @Nullable
    public final asc g(@NotNull List<asc> restList) {
        Intrinsics.checkNotNullParameter(restList, "restList");
        if (restList.isEmpty()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendar.get(7) - 1;
        int i4 = ((i3 != 0 ? i3 : 7) << 16) | (i << 8) | i2;
        int iF = f(this, i4, restList, false, 4, null);
        if (iF < 0) {
            iF = e(i4, restList, true);
        }
        if (iF >= 0) {
            return restList.get(iF);
        }
        return null;
    }

    @NotNull
    public final String h() {
        return TAG;
    }

    public final boolean i(@NotNull asc rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        List<Holiday> listL = l();
        if (listL.isEmpty()) {
            return false;
        }
        int iA = rest.a();
        int iW = rest.w();
        boolean zT = rest.t();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((Holiday) obj).isHoliday()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntDate = ((Holiday) it.next()).intDate();
            StringBuilder sb = new StringBuilder();
            sb.append("Rest startDate=");
            sb.append(iA);
            sb.append("  endDate=");
            sb.append(iW);
            sb.append("  holidayDate=");
            sb.append(iIntDate);
            if (zT) {
                if (iA <= iIntDate && iIntDate <= iW) {
                    return true;
                }
            } else if (iIntDate == iW) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<Integer> j(@NotNull List<? extends SleepSettingBean.SleepRest> restList, @NotNull final SleepSettingBean.SleepRest newRest, int maxCount) {
        Intrinsics.checkNotNullParameter(restList, "restList");
        Intrinsics.checkNotNullParameter(newRest, "newRest");
        List<? extends SleepSettingBean.SleepRest> mutableList = CollectionsKt.toMutableList(restList);
        final Function1<SleepSettingBean.SleepRest, Boolean> function1 = new Function1<SleepSettingBean.SleepRest, Boolean>() { // from class: com.heytap.device.sleep.SleepRestRepository$isRestCountMoreThan$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean invoke(@NotNull SleepSettingBean.SleepRest sleepRest) {
                Intrinsics.checkNotNullParameter(sleepRest, "it");
                m8b.f(SleepRestRepository.INSTANCE.h(), "It createTime=" + sleepRest.getCreateTime() + "  New createTime=" + newRest.getCreateTime());
                return Boolean.valueOf(sleepRest.getCreateTime() == newRest.getCreateTime());
            }
        };
        mutableList.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.oqh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SleepRestRepository.k(function1, obj);
            }
        });
        List<asc> listD = d(mutableList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listD) {
            Integer numValueOf = Integer.valueOf(((asc) obj).q());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        List<asc> listC = c(newRest);
        ArrayList arrayList2 = new ArrayList();
        for (asc ascVar : listC) {
            List list = (List) linkedHashMap.get(Integer.valueOf(ascVar.q()));
            if (list != null && list.size() >= maxCount) {
                arrayList2.add(Integer.valueOf(ascVar.q()));
            }
        }
        return arrayList2;
    }

    public final List<Holiday> l() {
        String strD = fdg.w().D(vd5.SP_KEY_HOLIDAYS);
        if (strD == null || strD.length() == 0) {
            return CollectionsKt.emptyList();
        }
        HolidayListData holidayListDataA = HolidayListData.INSTANCE.a(strD);
        if ((holidayListDataA != null ? holidayListDataA.getConfig() : null) == null) {
            return CollectionsKt.emptyList();
        }
        List<Holiday> config = holidayListDataA.getConfig();
        Intrinsics.checkNotNull(config);
        return config;
    }

    @NotNull
    public final List<asc> m(@NotNull List<SleepSettingBean.SleepRest> oldRestList) {
        Object next;
        Intrinsics.checkNotNullParameter(oldRestList, "oldRestList");
        List<asc> listC = new uxf().c(d(oldRestList));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (((asc) next2).i() == 0) {
                arrayList.add(next2);
            }
        }
        Iterator it2 = arrayList.iterator();
        asc ascVar = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iO = ((asc) next).o();
                do {
                    Object next3 = it2.next();
                    int iO2 = ((asc) next3).o();
                    if (iO > iO2) {
                        next = next3;
                        iO = iO2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        asc ascVar2 = (asc) next;
        if (ascVar2 == null) {
            return listC;
        }
        listC.remove(ascVar2);
        List<asc> list = listC;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((asc) obj).q() == 7) {
                arrayList2.add(obj);
            }
        }
        List mutableList = CollectionsKt.toMutableList(CollectionsKt.sortedWith(CollectionsKt.toList(arrayList2), new a()));
        if (mutableList.isEmpty()) {
            return listC;
        }
        List list2 = mutableList;
        listC.removeAll(list2);
        Iterator it3 = mutableList.iterator();
        while (it3.hasNext()) {
            asc ascVar3 = (asc) it3.next();
            if (ascVar != null) {
                it3.remove();
            } else if (ascVar3.p() >= ascVar2.h()) {
                it3.remove();
                ascVar = new asc(ascVar3.h(), ascVar2.p(), ascVar3.i(), ascVar2.q(), 0L, 0, 48, (DefaultConstructorMarker) null);
            }
        }
        listC.addAll(list2);
        if (ascVar != null) {
            listC.add(ascVar);
        } else {
            listC.add(ascVar2);
        }
        for (asc ascVar4 : list) {
            if (ascVar4.i() == 0) {
                ascVar4.v(7);
            }
        }
        return listC;
    }

    @NotNull
    public final List<asc> n(@NotNull List<asc> restList) {
        Intrinsics.checkNotNullParameter(restList, "restList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (asc ascVar : restList) {
            int iQ = ascVar.q();
            asc ascVar2 = (asc) linkedHashMap.get(Integer.valueOf(iQ));
            if (ascVar2 == null) {
                linkedHashMap.put(Integer.valueOf(iQ), ascVar);
            } else if (ascVar2.d() < ascVar.d()) {
                linkedHashMap.put(Integer.valueOf(iQ), ascVar);
            } else if (ascVar2.d() == ascVar.d() && ascVar.h() < ascVar2.h()) {
                linkedHashMap.put(Integer.valueOf(iQ), ascVar);
            }
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    public final void o(List<Holiday> holidayList) {
        Object obj;
        if (!qr0.w().z()) {
            m8b.f(TAG, "Send holiday cancel, device not connect");
            return;
        }
        if (!ash.f()) {
            m8b.f(TAG, "Send holiday cancel, device not support");
            return;
        }
        if (holidayList.isEmpty()) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : holidayList) {
                if (((Holiday) obj2).isHoliday()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String date = ((Holiday) it.next()).getDate();
                arrayList2.add(date != null ? Integer.valueOf(Integer.parseInt(date)) : null);
            }
            MessageEvent messageEvent = new MessageEvent(5, hii.STEPPER, FitnessProto.LegalHolidays.newBuilder().addAllData(CollectionsKt.toList(arrayList2)).build().toByteArray());
            m8b.f(TAG, "Send holiday to device");
            obj = Result.constructor-impl(Boolean.valueOf(wl4.devicePrimary.b.b(messageEvent)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return;
        }
        m8b.b(TAG, "Send legal holiday to device fail=" + th2.getMessage());
    }
}