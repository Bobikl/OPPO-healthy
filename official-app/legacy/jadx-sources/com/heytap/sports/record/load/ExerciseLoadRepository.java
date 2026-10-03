package com.heytap.sports.record.load;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.model.exerciseload.ExerciseIntensity;
import com.heytap.databaseengine.model.exerciseload.ExerciseLoad;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.um;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/record/load/ExerciseLoadRepository;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "d", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "count", "Lcom/heytap/databaseengine/model/exerciseload/ExerciseLoad;", "b", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", t04.DEVICE_UNIQUE_ID, "Lcom/heytap/databaseengine/model/exerciseload/ExerciseIntensity;", "a", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExerciseLoadRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseLoadRepository.kt\ncom/heytap/sports/record/load/ExerciseLoadRepository\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n155#2:96\n800#3,11:97\n800#3,11:108\n800#3,11:119\n*S KotlinDebug\n*F\n+ 1 ExerciseLoadRepository.kt\ncom/heytap/sports/record/load/ExerciseLoadRepository\n*L\n40#1:96\n40#1:97,11\n63#1:108,11\n88#1:119,11\n*E\n"})
public final class ExerciseLoadRepository {
    public static final int $stable = 0;

    public static /* synthetic */ Object c(ExerciseLoadRepository exerciseLoadRepository, long j2, long j3, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return exerciseLoadRepository.b(j2, j3, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(long j2, long j3, @Nullable String str, @NotNull Continuation<? super List<ExerciseIntensity>> continuation) {
        ExerciseLoadRepository$queryExerciseIntensity$1 exerciseLoadRepository$queryExerciseIntensity$1;
        if (continuation instanceof ExerciseLoadRepository$queryExerciseIntensity$1) {
            exerciseLoadRepository$queryExerciseIntensity$1 = (ExerciseLoadRepository$queryExerciseIntensity$1) continuation;
            int i = exerciseLoadRepository$queryExerciseIntensity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exerciseLoadRepository$queryExerciseIntensity$1.label = i - Integer.MIN_VALUE;
            } else {
                exerciseLoadRepository$queryExerciseIntensity$1 = new ExerciseLoadRepository$queryExerciseIntensity$1(this, continuation);
            }
        } else {
            exerciseLoadRepository$queryExerciseIntensity$1 = new ExerciseLoadRepository$queryExerciseIntensity$1(this, continuation);
        }
        Object objC = exerciseLoadRepository$queryExerciseIntensity$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = exerciseLoadRepository$queryExerciseIntensity$1.label;
        ArrayList arrayList = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("ExerciseLoadRepository", "sportRecord:" + j2 + "-" + j3 + "-" + gdb.a(str));
            if (str == null) {
                return null;
            }
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(1079);
            dataReadOptionV2.setStartTime(j2);
            dataReadOptionV2.setEndTime(j3);
            dataReadOptionV2.setDeviceUniqueId(str);
            dataReadOptionV2.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(optionV2)");
            exerciseLoadRepository$queryExerciseIntensity$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, exerciseLoadRepository$queryExerciseIntensity$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…ata(optionV2).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        a7b.f("ExerciseLoadRepository", "queryExerciseIntensity errCode:" + commonBackBean.getErrorCode() + " " + (list != null ? Boxing.boxInt(list.size()) : null));
        if (commonBackBean.getErrorCode() == 0 && list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ExerciseIntensity) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(long j2, long j3, int i, @NotNull Continuation<? super List<ExerciseLoad>> continuation) {
        ExerciseLoadRepository$queryExerciseLoads$1 exerciseLoadRepository$queryExerciseLoads$1;
        if (continuation instanceof ExerciseLoadRepository$queryExerciseLoads$1) {
            exerciseLoadRepository$queryExerciseLoads$1 = (ExerciseLoadRepository$queryExerciseLoads$1) continuation;
            int i2 = exerciseLoadRepository$queryExerciseLoads$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exerciseLoadRepository$queryExerciseLoads$1.label = i2 - Integer.MIN_VALUE;
            } else {
                exerciseLoadRepository$queryExerciseLoads$1 = new ExerciseLoadRepository$queryExerciseLoads$1(this, continuation);
            }
        } else {
            exerciseLoadRepository$queryExerciseLoads$1 = new ExerciseLoadRepository$queryExerciseLoads$1(this, continuation);
        }
        Object objC = exerciseLoadRepository$queryExerciseLoads$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = exerciseLoadRepository$queryExerciseLoads$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(1078);
            dataReadOptionV2.setStartTime(j2);
            dataReadOptionV2.setEndTime(j3);
            dataReadOptionV2.setGroupUnitType(4);
            dataReadOptionV2.setSortOrder(0);
            dataReadOptionV2.setCount(i);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(optionV2)");
            exerciseLoadRepository$queryExerciseLoads$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, exerciseLoadRepository$queryExerciseLoads$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…ata(optionV2).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        a7b.f("ExerciseLoadRepository", "queryExerciseLoads errCode(" + commonBackBean.getErrorCode() + ") size(" + (list != null ? Boxing.boxInt(list.size()) : null) + ")");
        if (commonBackBean.getErrorCode() == 0 && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ExerciseLoad) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(long j2, long j3, @NotNull Continuation<? super List<? extends TrackMetadataStat>> continuation) {
        ExerciseLoadRepository$querySportRecords$1 exerciseLoadRepository$querySportRecords$1;
        ArrayList arrayList;
        if (continuation instanceof ExerciseLoadRepository$querySportRecords$1) {
            exerciseLoadRepository$querySportRecords$1 = (ExerciseLoadRepository$querySportRecords$1) continuation;
            int i = exerciseLoadRepository$querySportRecords$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exerciseLoadRepository$querySportRecords$1.label = i - Integer.MIN_VALUE;
            } else {
                exerciseLoadRepository$querySportRecords$1 = new ExerciseLoadRepository$querySportRecords$1(this, continuation);
            }
        } else {
            exerciseLoadRepository$querySportRecords$1 = new ExerciseLoadRepository$querySportRecords$1(this, continuation);
        }
        Object objC = exerciseLoadRepository$querySportRecords$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = exerciseLoadRepository$querySportRecords$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("ExerciseLoadRepository", "querySportRecords " + o05.E(j2) + " " + o05.E(j3));
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setStartTime(j2);
            dataReadOption.setEndTime(j3);
            dataReadOption.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(option)");
            exerciseLoadRepository$querySportRecords$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, exerciseLoadRepository$querySportRecords$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…hData(option).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        a7b.f("ExerciseLoadRepository", "querySportRecords code(" + commonBackBean.getErrorCode() + ")");
        Object obj = null;
        if (commonBackBean.getErrorCode() == 0) {
            Object obj2 = commonBackBean.getObj();
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            List list = (List) obj2;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof TrackMetadataStat) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                arrayList = null;
            }
            a7b.f("ExerciseLoadRepository", "querySportRecords size(" + (arrayList != null ? Boxing.boxInt(arrayList.size()) : null) + ")");
            obj = arrayList;
        }
        return obj == null ? CollectionsKt__CollectionsKt.emptyList() : obj;
    }
}
