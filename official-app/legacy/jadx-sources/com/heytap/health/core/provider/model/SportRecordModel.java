package com.heytap.health.core.provider.model;

import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.core.provider.SportRecordHelp;
import com.heytap.health.core.provider.adapter.open.SportRecordAdapter;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.wq8;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/core/provider/model/SportRecordModel;", "", "", "clientDataId", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "i", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/lbd;", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "f", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", b2n.g, "Lcom/heytap/health/core/provider/SportRecordHelp;", "a", "Lkotlin/Lazy;", b2n.f, "()Lcom/heytap/health/core/provider/SportRecordHelp;", "sportRecordHelp", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class SportRecordModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy sportRecordHelp = LazyKt__LazyJVMKt.lazy(new Function0<SportRecordHelp>() { // from class: com.heytap.health.core.provider.model.SportRecordModel$sportRecordHelp$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SportRecordHelp invoke() {
            return new SportRecordHelp();
        }
    });

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements d08 {
        public static final a<T, R> INSTANCE = new a<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<OneTimeSport> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            ArrayList arrayList = new ArrayList();
            if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.OneTimeSport>");
                arrayList.addAll((List) obj);
            }
            a7b.f(SportRecordAdapter.TAG, "getLastSportRecord2 code:" + commonBackBean.getErrorCode() + ", size:" + arrayList.size());
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<OneTimeSport> apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a7b.f(SportRecordAdapter.TAG, "getLastSportRecord2 error:" + it.getMessage());
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordModel.kt\ncom/heytap/health/core/provider/model/SportRecordModel$getSportRecordStats$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1855#2,2:124\n*S KotlinDebug\n*F\n+ 1 SportRecordModel.kt\ncom/heytap/health/core/provider/model/SportRecordModel$getSportRecordStats$1\n*L\n113#1:124,2\n*E\n"})
    public static final class c<T, R> implements d08 {
        public static final c<T, R> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<TrackMetadataStat> apply(@Nullable CommonBackBean commonBackBean) {
            ArrayList arrayList = new ArrayList();
            if (commonBackBean != null && commonBackBean.getObj() != null && commonBackBean.getErrorCode() == 0) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (T t : (List) obj) {
                    if (t instanceof TrackMetadataStat) {
                        arrayList.add(t);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("findHistoryStatistic dataList:");
            sb.append(arrayList);
            return arrayList;
        }
    }

    public static /* synthetic */ Object e(SportRecordModel sportRecordModel, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sportRecordModel.d(str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@Nullable String str, @NotNull Continuation<? super String> continuation) throws Throwable {
        SportRecordModel$getLastSportRecord$1 sportRecordModel$getLastSportRecord$1;
        if (continuation instanceof SportRecordModel$getLastSportRecord$1) {
            sportRecordModel$getLastSportRecord$1 = (SportRecordModel$getLastSportRecord$1) continuation;
            int i = sportRecordModel$getLastSportRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportRecordModel$getLastSportRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                sportRecordModel$getLastSportRecord$1 = new SportRecordModel$getLastSportRecord$1(this, continuation);
            }
        } else {
            sportRecordModel$getLastSportRecord$1 = new SportRecordModel$getLastSportRecord$1(this, continuation);
        }
        Object objWithContext = sportRecordModel$getLastSportRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportRecordModel$getLastSportRecord$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("SRProvider");
            SportRecordModel$getLastSportRecord$2 sportRecordModel$getLastSportRecord$2 = new SportRecordModel$getLastSportRecord$2(this, str, null);
            sportRecordModel$getLastSportRecord$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, sportRecordModel$getLastSportRecord$2, sportRecordModel$getLastSportRecord$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun getLastSport…:$str\")\n        str\n    }");
        return objWithContext;
    }

    public final lbd<List<OneTimeSport>> f(String clientDataId) {
        a7b.f(SportRecordAdapter.TAG, "getLastSportRecord start..." + clientDataId);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setDataTable(1004);
        dataReadOption.setSortOrder(1);
        if (clientDataId == null || clientDataId.length() == 0) {
            dataReadOption.setStartTime(0L);
            dataReadOption.setEndTime(System.currentTimeMillis());
            dataReadOption.setCount(1);
        } else {
            dataReadOption.setDataId(clientDataId);
        }
        lbd<List<OneTimeSport>> lbdVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(a.INSTANCE).t0(b.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarT0, "getInstance()\n          …bleListOf()\n            }");
        return lbdVarT0;
    }

    public final SportRecordHelp g() {
        return (SportRecordHelp) this.sportRecordHelp.getValue();
    }

    public final lbd<List<TrackMetadataStat>> h(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getLocalServiceProfile);
        dataReadOption.setReadSportMode(-2);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(1);
        lbd lbdVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(c.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "getInstance()\n          …   dataList\n            }");
        return lbdVarJ0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object i(long j2, long j3, @NotNull Continuation<? super String> continuation) throws Throwable {
        SportRecordModel$getStatList$1 sportRecordModel$getStatList$1;
        if (continuation instanceof SportRecordModel$getStatList$1) {
            sportRecordModel$getStatList$1 = (SportRecordModel$getStatList$1) continuation;
            int i = sportRecordModel$getStatList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportRecordModel$getStatList$1.label = i - Integer.MIN_VALUE;
            } else {
                sportRecordModel$getStatList$1 = new SportRecordModel$getStatList$1(this, continuation);
            }
        } else {
            sportRecordModel$getStatList$1 = new SportRecordModel$getStatList$1(this, continuation);
        }
        Object objWithContext = sportRecordModel$getStatList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportRecordModel$getStatList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("SRProvider");
            SportRecordModel$getStatList$2 sportRecordModel$getStatList$2 = new SportRecordModel$getStatList$2(j3, j2, this, null);
            sportRecordModel$getStatList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, sportRecordModel$getStatList$2, sportRecordModel$getStatList$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun getStatList(…ngth}\")\n        str\n    }");
        return objWithContext;
    }
}
