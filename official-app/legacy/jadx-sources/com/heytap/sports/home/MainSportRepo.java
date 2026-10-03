package com.heytap.sports.home;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.ISportHealthDataAPI;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.MetadataUnit;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.um;
import com.oplus.onet.IONetService;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/home/MainSportRepo;", "", "Ljava/time/LocalDate;", "start", TextEntity.ELLIPSIZE_END, "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "c", "(Ljava/time/LocalDate;Ljava/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sportMetadataType", "", "d", "(Ljava/time/LocalDate;Ljava/time/LocalDate;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dataReadType", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/api/ISportHealthDataAPI;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "b", "()Lcom/heytap/databaseengine/api/ISportHealthDataAPI;", "dbApi", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MainSportRepo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy dbApi = LazyKt__LazyJVMKt.lazy(new Function0<ISportHealthDataAPI>() { // from class: com.heytap.sports.home.MainSportRepo$dbApi$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final ISportHealthDataAPI invoke() {
            return SportHealthDataAPI.getInstance();
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull String str, @NotNull Continuation<? super TrackMetadataStat> continuation) {
        MainSportRepo$getBestRecord$1 mainSportRepo$getBestRecord$1;
        if (continuation instanceof MainSportRepo$getBestRecord$1) {
            mainSportRepo$getBestRecord$1 = (MainSportRepo$getBestRecord$1) continuation;
            int i = mainSportRepo$getBestRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSportRepo$getBestRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSportRepo$getBestRecord$1 = new MainSportRepo$getBestRecord$1(this, continuation);
            }
        } else {
            mainSportRepo$getBestRecord$1 = new MainSportRepo$getBestRecord$1(this, continuation);
        }
        Object objC = mainSportRepo$getBestRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainSportRepo$getBestRecord$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOptionV2.setStartTime(0L);
            dataReadOptionV2.setEndTime(System.currentTimeMillis());
            dataReadOptionV2.setDataReadType(str);
            dataReadOptionV2.setReadSportMode(100);
            dataReadOptionV2.setGroupUnitType(8);
            lbd<CommonBackBean> sportHealthData = b().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "dbApi.readSportHealthData(option)");
            mainSportRepo$getBestRecord$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, mainSportRepo$getBestRecord$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "dbApi.readSportHealthData(option).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (commonBackBean.getErrorCode() != 0) {
            return null;
        }
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z) {
            return null;
        }
        Object obj2 = list.get(0);
        if (obj2 instanceof TrackMetadataStat) {
            return (TrackMetadataStat) obj2;
        }
        return null;
    }

    public final ISportHealthDataAPI b() {
        return (ISportHealthDataAPI) this.dbApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, int i, @NotNull Continuation<? super List<? extends TrackMetadataStat>> continuation) {
        MainSportRepo$querySportMetadata$1 mainSportRepo$querySportMetadata$1;
        if (continuation instanceof MainSportRepo$querySportMetadata$1) {
            mainSportRepo$querySportMetadata$1 = (MainSportRepo$querySportMetadata$1) continuation;
            int i2 = mainSportRepo$querySportMetadata$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainSportRepo$querySportMetadata$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mainSportRepo$querySportMetadata$1 = new MainSportRepo$querySportMetadata$1(this, continuation);
            }
        } else {
            mainSportRepo$querySportMetadata$1 = new MainSportRepo$querySportMetadata$1(this, continuation);
        }
        Object objC = mainSportRepo$querySportMetadata$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mainSportRepo$querySportMetadata$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
            dataReadOptionV2.setStartTime(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
            dataReadOptionV2.setEndTime(localDate2.atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            dataReadOptionV2.setReadSportMode(i);
            dataReadOptionV2.setSortOrder(0);
            a7b.f("MainSportRepo", "querySportMetadata start:" + dataReadOptionV2.getStartTime() + " end:" + dataReadOptionV2.getEndTime());
            lbd<CommonBackBean> sportHealthData = b().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "dbApi.readSportHealthData(option)");
            mainSportRepo$querySportMetadata$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, mainSportRepo$querySportMetadata$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "dbApi.readSportHealthData(option).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (commonBackBean.getErrorCode() == 0) {
            Object obj = commonBackBean.getObj();
            List list = obj instanceof List ? (List) obj : null;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
        a7b.b("MainSportRepo", "querySportMetadata error: " + commonBackBean.getErrorCode());
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, int i, int i2, @NotNull Continuation<? super Double> continuation) {
        MainSportRepo$querySportStatMetadata$1 mainSportRepo$querySportStatMetadata$1;
        MetadataUnit metadataUnit;
        if (continuation instanceof MainSportRepo$querySportStatMetadata$1) {
            mainSportRepo$querySportStatMetadata$1 = (MainSportRepo$querySportStatMetadata$1) continuation;
            int i3 = mainSportRepo$querySportStatMetadata$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mainSportRepo$querySportStatMetadata$1.label = i3 - Integer.MIN_VALUE;
            } else {
                mainSportRepo$querySportStatMetadata$1 = new MainSportRepo$querySportStatMetadata$1(this, continuation);
            }
        } else {
            mainSportRepo$querySportStatMetadata$1 = new MainSportRepo$querySportStatMetadata$1(this, continuation);
        }
        Object objC = mainSportRepo$querySportStatMetadata$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = mainSportRepo$querySportStatMetadata$1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
            dataReadOptionV2.setSsoid(um.c().getSsoid());
            dataReadOptionV2.setDataTable(1065);
            dataReadOptionV2.setStartTime(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
            dataReadOptionV2.setEndTime(localDate2.atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            dataReadOptionV2.setReadSportMode(i);
            dataReadOptionV2.setReadConfig(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(Boxing.boxInt(i2), Boxing.boxInt(1))));
            dataReadOptionV2.setGroupUnitType(8);
            dataReadOptionV2.setSortOrder(0);
            a7b.f("MainSportRepo", "querySportStatMetadata start:" + dataReadOptionV2.getStartTime() + " end:" + dataReadOptionV2.getEndTime());
            lbd<CommonBackBean> sportHealthData = b().readSportHealthData(dataReadOptionV2);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "dbApi.readSportHealthData(option)");
            mainSportRepo$querySportStatMetadata$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, mainSportRepo$querySportStatMetadata$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "dbApi.readSportHealthData(option).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        double value = 0.0d;
        if (commonBackBean.getErrorCode() == 0) {
            Object obj = commonBackBean.getObj();
            List list = obj instanceof List ? (List) obj : null;
            if (list != null && (metadataUnit = (MetadataUnit) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
                value = metadataUnit.getValue();
            }
            return Boxing.boxDouble(value);
        }
        a7b.b("MainSportRepo", "querySportStatMetadata error: " + commonBackBean.getErrorCode());
        return Boxing.boxDouble(0.0d);
    }
}
