package com.heytap.health.sunshine.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.sunshine.SunshineDetail;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.sunshine.constant.VitaminLevel;
import com.heytap.health.sunshine.model.SunshineRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.AnalyzeData;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.v05;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J,\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u0016\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J#\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u0016\u0010\u001b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u001c\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R#\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020%0(8F¢\u0006\u0006\u001a\u0004\b,\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM;", "Lcom/heytap/health/base/base/BaseViewModel;", "Lkotlin/Pair;", "", "range", "", SecureGcmConstants.MESSAGE_KEY, "", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "dayStatList", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "dateUnit", ExifInterface.LONGITUDE_EAST, "datas", UserInfo.SEX_FEMALE, "stat", "", "O", "J", "Lcom/heytap/health/sunshine/constant/VitaminLevel;", "G", "I", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mostLikeTime", "L", "K", "H", "Lcom/heytap/health/sunshine/model/SunshineRepository;", "j", "Lcom/heytap/health/sunshine/model/SunshineRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/MutableLiveData;", "_viewTimeRange", "Lcom/oplus/aiunit/vision/p10;", LogFieldKey.LEVEL_KEY, "_analyzeDataLD", "Landroidx/lifecycle/LiveData;", "N", "()Landroidx/lifecycle/LiveData;", "viewTimeRange", "M", "analyzeDataLD", "<init>", "()V", "Companion", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunshineStatAnalyzeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunshineStatAnalyzeVM.kt\ncom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,299:1\n766#2:300\n857#2,2:301\n1549#2:303\n1620#2,3:304\n766#2:308\n857#2,2:309\n1774#2,4:311\n766#2:315\n857#2,2:316\n1549#2:318\n1620#2,3:319\n1855#2,2:322\n1855#2,2:331\n1#3:307\n526#4:324\n511#4,6:325\n215#5,2:333\n*S KotlinDebug\n*F\n+ 1 SunshineStatAnalyzeVM.kt\ncom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM\n*L\n146#1:300\n146#1:301,2\n152#1:303\n152#1:304,3\n175#1:308\n175#1:309,2\n177#1:311,4\n192#1:315\n192#1:316,2\n201#1:318\n201#1:319,3\n228#1:322,2\n277#1:331,2\n237#1:324\n237#1:325,6\n286#1:333,2\n*E\n"})
public final class SunshineStatAnalyzeVM extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SunshineRepository repository = new SunshineRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Pair<Long, Long>> _viewTimeRange = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<AnalyzeData> _analyzeDataLD = new MutableLiveData<>();
    public static final int $stable = 8;

    public final void E(@NotNull List<SunshineStat> dayStatList, int startDate, int endDate, int dateUnit) {
        Intrinsics.checkNotNullParameter(dayStatList, "dayStatList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SunshineStatAnalyzeVM$analyze$1(dayStatList, this, startDate, endDate, dateUnit, null), 2, null);
    }

    public final int F(List<SunshineStat> datas) {
        if (datas.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : datas) {
            if (O((SunshineStat) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((SunshineStat) it.next()).getTotalDuration()));
        }
        return (int) Math.ceil(CollectionsKt___CollectionsKt.averageOfInt(arrayList2));
    }

    public final VitaminLevel G(List<SunshineStat> datas) {
        if (datas.isEmpty()) {
            return VitaminLevel.NONE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : datas) {
            if (((SunshineStat) obj).getVitaminD() >= 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return VitaminLevel.NONE;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((SunshineStat) it.next()).getVitaminD()));
        }
        int iAverageOfInt = (int) CollectionsKt___CollectionsKt.averageOfInt(arrayList2);
        if (iAverageOfInt < 30) {
            return VitaminLevel.LOW;
        }
        return iAverageOfInt < 80 ? VitaminLevel.MIDDLE : VitaminLevel.ENOUGH;
    }

    public final int H(List<SunshineStat> datas) {
        if (datas.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SunshineStat sunshineStat : datas) {
            int monthValue = LocalDate.parse(String.valueOf(sunshineStat.getDate()), DateTimeFormatter.ofPattern("yyyyMMdd")).getMonthValue();
            linkedHashMap.put(Integer.valueOf(monthValue), Integer.valueOf(((Number) linkedHashMap.getOrDefault(Integer.valueOf(monthValue), 0)).intValue() + sunshineStat.getTotalDuration()));
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue2 > i2 || (iIntValue2 == i2 && (i == Integer.MIN_VALUE || iIntValue < i))) {
                i2 = iIntValue2;
                i = iIntValue;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(int i, int i2, Continuation<? super Integer> continuation) {
        SunshineStatAnalyzeVM$calMostLikeTime$1 sunshineStatAnalyzeVM$calMostLikeTime$1;
        if (continuation instanceof SunshineStatAnalyzeVM$calMostLikeTime$1) {
            sunshineStatAnalyzeVM$calMostLikeTime$1 = (SunshineStatAnalyzeVM$calMostLikeTime$1) continuation;
            int i3 = sunshineStatAnalyzeVM$calMostLikeTime$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sunshineStatAnalyzeVM$calMostLikeTime$1.label = i3 - Integer.MIN_VALUE;
            } else {
                sunshineStatAnalyzeVM$calMostLikeTime$1 = new SunshineStatAnalyzeVM$calMostLikeTime$1(this, continuation);
            }
        } else {
            sunshineStatAnalyzeVM$calMostLikeTime$1 = new SunshineStatAnalyzeVM$calMostLikeTime$1(this, continuation);
        }
        SunshineStatAnalyzeVM$calMostLikeTime$1 sunshineStatAnalyzeVM$calMostLikeTime$2 = sunshineStatAnalyzeVM$calMostLikeTime$1;
        Object objE = sunshineStatAnalyzeVM$calMostLikeTime$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = sunshineStatAnalyzeVM$calMostLikeTime$2.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objE);
            long jA = v05.a(i);
            long jA2 = (v05.a(i2) + ((long) 86400000)) - 1;
            SunshineRepository sunshineRepository = this.repository;
            sunshineStatAnalyzeVM$calMostLikeTime$2.label = 1;
            objE = sunshineRepository.e(3, jA, jA2, sunshineStatAnalyzeVM$calMostLikeTime$2);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objE);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SunshineDetail sunshineDetail : (List) objE) {
            int hour = o05.E(sunshineDetail.getDataCreatedTimestamp()).getHour();
            if (hour >= 0 && hour < 24) {
                linkedHashMap.put(Boxing.boxInt(hour), Boxing.boxInt(((Number) linkedHashMap.getOrDefault(Boxing.boxInt(hour), Boxing.boxInt(0))).intValue() + sunshineDetail.getSunBathing()));
            }
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.maxOrNull((Iterable) linkedHashMap.values());
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 0) {
            return Boxing.boxInt(Integer.MIN_VALUE);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getValue()).intValue() == iIntValue) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Integer num2 = (Integer) CollectionsKt___CollectionsKt.minOrNull((Iterable) linkedHashMap2.keySet());
        return Boxing.boxInt(num2 != null ? num2.intValue() : Integer.MIN_VALUE);
    }

    public final int J(List<SunshineStat> datas) {
        ArrayList<SunshineStat> arrayList = new ArrayList();
        Iterator<T> it = datas.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((SunshineStat) next).getSsoid().length() > 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (SunshineStat sunshineStat : arrayList) {
            if ((sunshineStat.getTotalDuration() >= sunshineStat.getTargetDuration()) && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final int K(List<SunshineStat> datas) {
        int totalDuration = 0;
        if (!datas.isEmpty()) {
            Iterator<T> it = datas.iterator();
            while (it.hasNext()) {
                totalDuration += ((SunshineStat) it.next()).getTotalDuration();
            }
        }
        return totalDuration;
    }

    public final int L(int mostLikeTime) {
        if (mostLikeTime >= 0 && mostLikeTime < 11) {
            return 1;
        }
        if (11 <= mostLikeTime && mostLikeTime < 14) {
            return 2;
        }
        if (14 <= mostLikeTime && mostLikeTime < 16) {
            return 3;
        }
        return 16 <= mostLikeTime && mostLikeTime < 24 ? 4 : 0;
    }

    @NotNull
    public final LiveData<AnalyzeData> M() {
        return this._analyzeDataLD;
    }

    @NotNull
    public final LiveData<Pair<Long, Long>> N() {
        return this._viewTimeRange;
    }

    public final boolean O(SunshineStat stat) {
        return (stat.getSsoid().length() > 0) && (stat.getTotalDuration() > 0 || stat.getVitaminDIngestion() <= 0);
    }

    public final void P(@NotNull Pair<Long, Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this._viewTimeRange.postValue(range);
    }
}
