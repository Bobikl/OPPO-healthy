package com.heytap.health.hrv.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.hrv.constant.HrvConstant;
import com.heytap.health.hrv.model.StressDetailRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.AnalyzeData;
import com.oplus.aiunit.vision.MenstrualCycleData;
import com.oplus.aiunit.vision.StressDetailData;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.s04;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J,\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ$\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ4\u0010\u0014\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u001a\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020,0#8\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010/R#\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020'018F¢\u0006\u0006\u001a\u0004\b5\u00103R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0007018F¢\u0006\u0006\u001a\u0004\b7\u00103¨\u0006="}, d2 = {"Lcom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM;", "Lcom/heytap/health/base/base/BaseViewModel;", "Lkotlin/Pair;", "", "range", "", "N", "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "dayStatList", "", s04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "dateUnit", acl.KEY_B, "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", "achList", "G", "startTime", "endTime", "C", "datas", "Lcom/oplus/aiunit/vision/o1j;", "M", UserInfo.SEX_FEMALE, "D", ExifInterface.LONGITUDE_EAST, "Ljava/time/LocalDate;", "date", "", "L", "Lcom/heytap/health/hrv/model/StressDetailRepository;", "j", "Lcom/heytap/health/hrv/model/StressDetailRepository;", "mRepository", "Landroidx/lifecycle/MutableLiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/MutableLiveData;", "_viewTimeRange", "Lcom/oplus/aiunit/vision/a20;", LogFieldKey.LEVEL_KEY, "_analyzeDataLD", LogFieldKey.MESSAGE_KEY, "_achievementList", "Lcom/oplus/aiunit/vision/evb;", "n", "J", "()Landroidx/lifecycle/MutableLiveData;", "menstrualLD", "Landroidx/lifecycle/LiveData;", "K", "()Landroidx/lifecycle/LiveData;", "viewTimeRange", "I", "analyzeDataLD", "H", "achievementList", "<init>", "()V", "Companion", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressStatAnalyzeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressStatAnalyzeVM.kt\ncom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n766#2:354\n857#2,2:355\n1855#2,2:357\n1855#2,2:359\n766#2:361\n857#2,2:362\n766#2:364\n857#2,2:365\n766#2:367\n857#2,2:368\n766#2:370\n857#2,2:371\n1549#2:373\n1620#2,3:374\n*S KotlinDebug\n*F\n+ 1 StressStatAnalyzeVM.kt\ncom/heytap/health/hrv/viewmodel/StressStatAnalyzeVM\n*L\n151#1:354\n151#1:355,2\n153#1:357,2\n180#1:359,2\n206#1:361\n206#1:362,2\n254#1:364\n254#1:365,2\n256#1:367\n256#1:368,2\n259#1:370\n259#1:371,2\n261#1:373\n261#1:374,3\n*E\n"})
public final class StressStatAnalyzeVM extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StressDetailRepository mRepository = new StressDetailRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Pair<Long, Long>> _viewTimeRange = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<AnalyzeData> _analyzeDataLD = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Boolean>> _achievementList = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<MenstrualCycleData> menstrualLD = new MutableLiveData<>();
    public static final int $stable = 8;

    public final void B(@NotNull List<PhysicalMentalStat> dayStatList, int startDate, int endDate, int dateUnit) {
        Intrinsics.checkNotNullParameter(dayStatList, "dayStatList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressStatAnalyzeVM$analyze$1(dayStatList, this, dateUnit, startDate, endDate, null), 2, null);
    }

    public final void C(@NotNull List<PhysicalMentalStat> dayStatList, int startDate, int endDate, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(dayStatList, "dayStatList");
        m8b.f("StressStatAnalyzeVM", "analyzeMenstrualCycle start:" + dayStatList.size() + ", startDate:" + startDate + ", endDate:" + endDate + ", startTime:" + startTime + ", endTime:" + endTime);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressStatAnalyzeVM$analyzeMenstrualCycle$1(this, startTime, endTime, dayStatList, startDate, endDate, null), 2, null);
    }

    public final int D(List<PhysicalMentalStat> datas) {
        int avgStress = 0;
        if (datas.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : datas) {
            if (((PhysicalMentalStat) obj).getAvgStress() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            avgStress += ((PhysicalMentalStat) it.next()).getAvgStress();
        }
        return avgStress / arrayList.size();
    }

    public final int E(List<PhysicalMentalStat> datas) {
        Iterator<T> it = datas.iterator();
        int stressReminder = 0;
        while (it.hasNext()) {
            stressReminder += ((PhysicalMentalStat) it.next()).getStressReminder();
        }
        return stressReminder;
    }

    public final Pair<Integer, Integer> F(List<PhysicalMentalStat> datas) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PhysicalMentalStat physicalMentalStat : datas) {
            LocalDate date = LocalDate.parse(String.valueOf(physicalMentalStat.getDate()), DateTimeFormatter.ofPattern("yyyyMMdd"));
            Intrinsics.checkNotNullExpressionValue(date, "date");
            if (L(date)) {
                arrayList2.add(physicalMentalStat);
            } else {
                arrayList.add(physicalMentalStat);
            }
        }
        return new Pair<>(Integer.valueOf(D(arrayList)), Integer.valueOf(D(arrayList2)));
    }

    public final void G(@NotNull List<PhysicalMentalAchievement> achList, int startDate, int endDate) {
        Intrinsics.checkNotNullParameter(achList, "achList");
        int i = o15.i(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = achList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int date = ((PhysicalMentalAchievement) next).getDate();
            if (startDate <= date && date <= endDate) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            PhysicalMentalAchievement physicalMentalAchievement = (PhysicalMentalAchievement) obj;
            if (physicalMentalAchievement.getLevel() == HrvConstant.AchievementLevel.PERFECT.getValue() || physicalMentalAchievement.getLevel() == HrvConstant.AchievementLevel.GOOD.getValue()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((PhysicalMentalAchievement) obj2).getDate() != i || LocalDateTime.now().getHour() >= 22) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Boolean.valueOf(((PhysicalMentalAchievement) it2.next()).getLevel() == HrvConstant.AchievementLevel.PERFECT.getValue()));
        }
        m8b.f("StressStatAnalyzeVM", "countAchievement: " + arrayList4);
        this._achievementList.postValue(arrayList4);
    }

    @NotNull
    public final LiveData<List<Boolean>> H() {
        return this._achievementList;
    }

    @NotNull
    public final LiveData<AnalyzeData> I() {
        return this._analyzeDataLD;
    }

    @NotNull
    public final MutableLiveData<MenstrualCycleData> J() {
        return this.menstrualLD;
    }

    @NotNull
    public final LiveData<Pair<Long, Long>> K() {
        return this._viewTimeRange;
    }

    public final boolean L(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    public final Pair<StressDetailData, StressDetailData> M(List<PhysicalMentalStat> datas) {
        PhysicalMentalStat physicalMentalStat = new PhysicalMentalStat(null, 0, null, null, 0, 0, 0, 0, Integer.MAX_VALUE, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16776959, null);
        PhysicalMentalStat physicalMentalStat2 = new PhysicalMentalStat(null, 0, null, null, 0, 0, 0, 0, 0, 0L, Integer.MIN_VALUE, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16776191, null);
        ArrayList<PhysicalMentalStat> arrayList = new ArrayList();
        for (Object obj : datas) {
            if (((PhysicalMentalStat) obj).getAvgStress() > 0) {
                arrayList.add(obj);
            }
        }
        for (PhysicalMentalStat physicalMentalStat3 : arrayList) {
            if (physicalMentalStat.getMinStress() >= physicalMentalStat3.getMinStress() && physicalMentalStat.getMinStressTimestamp() < physicalMentalStat3.getMinStressTimestamp()) {
                physicalMentalStat = physicalMentalStat3;
            }
            if (physicalMentalStat2.getMaxStress() <= physicalMentalStat3.getMaxStress() && physicalMentalStat2.getMaxStressTimestamp() < physicalMentalStat3.getMaxStressTimestamp()) {
                physicalMentalStat2 = physicalMentalStat3;
            }
        }
        return new Pair<>(new StressDetailData(physicalMentalStat2.getMaxStressTimestamp(), physicalMentalStat2.getMaxStress()), new StressDetailData(physicalMentalStat.getMinStressTimestamp(), physicalMentalStat.getMinStress()));
    }

    public final void N(@NotNull Pair<Long, Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        this._viewTimeRange.postValue(range);
    }
}