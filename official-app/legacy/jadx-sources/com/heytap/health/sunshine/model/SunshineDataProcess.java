package com.heytap.health.sunshine.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.UserPreference;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v05;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/sunshine/model/SunshineDataProcess;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "dataList", "", "type", "", "d", "(JJLjava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ssoid", "key", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sunshineGoal", "b", "chartStat", "dataStat", "", "f", "c", "<init>", "()V", "Companion", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunshineDataProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunshineDataProcess.kt\ncom/heytap/health/sunshine/model/SunshineDataProcess\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1#2:167\n1855#3,2:168\n*S KotlinDebug\n*F\n+ 1 SunshineDataProcess.kt\ncom/heytap/health/sunshine/model/SunshineDataProcess\n*L\n148#1:168,2\n*E\n"})
public final class SunshineDataProcess {
    public static final int $stable = 0;

    public final List<SunshineStat> b(long startTime, long endTime, List<SunshineStat> dataList, int sunshineGoal) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateD = o05.D(startTime);
        long jAbs = (long) (Math.abs(o05.D(endTime).toEpochDay() - localDateD.toEpochDay()) + ((double) 1));
        for (long j2 = 0; j2 < jAbs; j2++) {
            SunshineStat sunshineStat = new SunshineStat(null, null, null, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8191, null);
            LocalDate localDatePlusDays = localDateD.plusDays(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "startDate.plusDays(i)");
            sunshineStat.setDate(v05.i(o05.H(localDatePlusDays)));
            sunshineStat.setTargetDuration(sunshineGoal);
            arrayList.add(sunshineStat);
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            for (long j3 = 0; j3 < jAbs; j3++) {
                int i2 = (int) j3;
                if (dataList.get(i).getDate() == ((SunshineStat) arrayList.get(i2)).getDate()) {
                    if (((SunshineStat) arrayList.get(i2)).getDataClient().length() == 0) {
                        arrayList.set(i2, dataList.get(i));
                    } else {
                        f((SunshineStat) arrayList.get(i2), dataList.get(i));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<SunshineStat> c(long startTime, long endTime, List<SunshineStat> dataList, int sunshineGoal) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateY = o05.y(o05.D(startTime));
        long totalMonths = Period.between(localDateY, o05.y(o05.D(endTime))).toTotalMonths() + 1;
        for (long j2 = 0; j2 < totalMonths; j2++) {
            SunshineStat sunshineStat = new SunshineStat(null, null, null, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8191, null);
            LocalDate localDatePlusMonths = localDateY.plusMonths(j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "startDate.plusMonths(i)");
            sunshineStat.setDate(v05.i(o05.H(localDatePlusMonths)));
            sunshineStat.setTargetDuration(sunshineGoal);
            arrayList.add(sunshineStat);
        }
        for (SunshineStat sunshineStat2 : dataList) {
            sunshineStat2.setDate(v05.i(o05.H(o05.y(o05.D(v05.a(sunshineStat2.getDate()))))));
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            for (long j3 = 0; j3 < totalMonths; j3++) {
                int i2 = (int) j3;
                if (dataList.get(i).getDate() == ((SunshineStat) arrayList.get(i2)).getDate()) {
                    if (((SunshineStat) arrayList.get(i2)).getDataClient().length() == 0) {
                        arrayList.set(i2, dataList.get(i));
                    } else {
                        f((SunshineStat) arrayList.get(i2), dataList.get(i));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(long j2, long j3, @NotNull List<SunshineStat> list, int i, @NotNull Continuation<? super List<SunshineStat>> continuation) {
        SunshineDataProcess$insertStatEmptyData$1 sunshineDataProcess$insertStatEmptyData$1;
        if (continuation instanceof SunshineDataProcess$insertStatEmptyData$1) {
            sunshineDataProcess$insertStatEmptyData$1 = (SunshineDataProcess$insertStatEmptyData$1) continuation;
            int i2 = sunshineDataProcess$insertStatEmptyData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sunshineDataProcess$insertStatEmptyData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sunshineDataProcess$insertStatEmptyData$1 = new SunshineDataProcess$insertStatEmptyData$1(this, continuation);
            }
        } else {
            sunshineDataProcess$insertStatEmptyData$1 = new SunshineDataProcess$insertStatEmptyData$1(this, continuation);
        }
        Object objE = sunshineDataProcess$insertStatEmptyData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sunshineDataProcess$insertStatEmptyData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objE);
            String ssoid = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            String strName = SportHealthSetting.NAP_SUNSHINEDURATION.name();
            sunshineDataProcess$insertStatEmptyData$1.L$0 = this;
            sunshineDataProcess$insertStatEmptyData$1.L$1 = list;
            sunshineDataProcess$insertStatEmptyData$1.J$0 = j2;
            sunshineDataProcess$insertStatEmptyData$1.J$1 = j3;
            sunshineDataProcess$insertStatEmptyData$1.I$0 = i;
            sunshineDataProcess$insertStatEmptyData$1.label = 1;
            objE = e(ssoid, strName, sunshineDataProcess$insertStatEmptyData$1);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = sunshineDataProcess$insertStatEmptyData$1.I$0;
            j3 = sunshineDataProcess$insertStatEmptyData$1.J$1;
            j2 = sunshineDataProcess$insertStatEmptyData$1.J$0;
            list = (List) sunshineDataProcess$insertStatEmptyData$1.L$1;
            this = (SunshineDataProcess) sunshineDataProcess$insertStatEmptyData$1.L$0;
            ResultKt.throwOnFailure(objE);
        }
        int i4 = Integer.parseInt((String) objE);
        return i == 4 ? this.b(j2, j3, list, i4) : this.c(j2, j3, list, i4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v16, types: [T, java.lang.Object, java.lang.String] */
    public final Object e(String str, String str2, Continuation<? super String> continuation) {
        SunshineDataProcess$sunshineGoalValue$1 sunshineDataProcess$sunshineGoalValue$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof SunshineDataProcess$sunshineGoalValue$1) {
            sunshineDataProcess$sunshineGoalValue$1 = (SunshineDataProcess$sunshineGoalValue$1) continuation;
            int i = sunshineDataProcess$sunshineGoalValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sunshineDataProcess$sunshineGoalValue$1.label = i - Integer.MIN_VALUE;
            } else {
                sunshineDataProcess$sunshineGoalValue$1 = new SunshineDataProcess$sunshineGoalValue$1(this, continuation);
            }
        } else {
            sunshineDataProcess$sunshineGoalValue$1 = new SunshineDataProcess$sunshineGoalValue$1(this, continuation);
        }
        Object obj = sunshineDataProcess$sunshineGoalValue$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sunshineDataProcess$sunshineGoalValue$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "20";
            lbd<CommonBackBean> userPreferenceNew = SportHealthDataAPI.getInstance().getUserPreferenceNew(str, str2, "", true);
            Intrinsics.checkNotNullExpressionValue(userPreferenceNew, "getInstance().getUserPre…New(ssoid, key, \"\", true)");
            sunshineDataProcess$sunshineGoalValue$1.L$0 = objectRef2;
            sunshineDataProcess$sunshineGoalValue$1.label = 1;
            Object objC = RxExtendKt.c(userPreferenceNew, sunshineDataProcess$sunshineGoalValue$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) sunshineDataProcess$sunshineGoalValue$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CommonBackBean commonBackBean = (CommonBackBean) obj;
        if (commonBackBean.getErrorCode() == 0) {
            Object obj2 = commonBackBean.getObj();
            UserPreference userPreference = null;
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (list != null) {
                for (Object obj3 : list) {
                    UserPreference userPreference2 = obj3 instanceof UserPreference ? (UserPreference) obj3 : null;
                    if (userPreference2 != null) {
                        userPreference = userPreference2;
                        break;
                    }
                }
                if (userPreference != null) {
                    ?? value = userPreference.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "userPreference.value");
                    objectRef.element = value;
                }
            }
            a7b.f("SunshineDataProcess", "fetch sunshine goal: " + objectRef.element);
        } else {
            a7b.b("SunshineDataProcess", "fetch sunshine goal failed errorCode: " + commonBackBean.getErrorCode());
        }
        return objectRef.element;
    }

    public final void f(SunshineStat chartStat, SunshineStat dataStat) {
        chartStat.setTotalDuration(RangesKt___RangesKt.coerceAtLeast(dataStat.getTotalDuration(), chartStat.getTotalDuration()));
        if (StringsKt__StringsKt.contains$default((CharSequence) dataStat.getDataClient(), (CharSequence) ":", false, 2, (Object) null)) {
            chartStat.setDataClient(dataStat.getDataClient());
            if (dataStat.getTargetDuration() > 0) {
                chartStat.setTargetDuration(dataStat.getTargetDuration());
            }
        }
        chartStat.setVitaminD(chartStat.getVitaminD() + dataStat.getVitaminD());
        if (chartStat.getVitaminDIngestionTime() < dataStat.getVitaminDIngestionTime()) {
            chartStat.setVitaminDIngestion(dataStat.getVitaminDIngestion());
            chartStat.setVitaminDIngestionTime(dataStat.getVitaminDIngestionTime());
        }
        chartStat.setGoalComplete(RangesKt___RangesKt.coerceAtLeast(dataStat.getGoalComplete(), chartStat.getGoalComplete()));
    }
}
