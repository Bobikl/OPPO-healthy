package com.heytap.health.core.provider.model;

import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.health.core.provider.adapter.open.HeartRateStatAdapter;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/core/provider/model/HeartRateStatModel;", "", "Lcom/heytap/health/core/provider/adapter/open/HeartRateStatAdapter$HeartRateStatData;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "Lcom/oplus/aiunit/vision/lbd;", "", "Lcom/heytap/databaseengine/model/HeartRateDataStat;", "d", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "stats", "c", "stat", "b", "<init>", "()V", "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeartRateStatModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateStatModel.kt\ncom/heytap/health/core/provider/model/HeartRateStatModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 HeartRateStatModel.kt\ncom/heytap/health/core/provider/model/HeartRateStatModel\n*L\n99#1:104\n99#1:105,3\n*E\n"})
public final class HeartRateStatModel {
    public final HeartRateStatAdapter.HeartRateStatData b(HeartRateDataStat stat) {
        return new HeartRateStatAdapter.HeartRateStatData(stat.getDate(), stat.getAverageHeartRate(), stat.getMaxHeartRate(), stat.getMinHeartRate(), stat.getWalkAvgHeartRate(), stat.getRestHeartRate(), stat.getSleepBaseHeartRate());
    }

    @NotNull
    public final List<HeartRateStatAdapter.HeartRateStatData> c(@NotNull List<? extends HeartRateDataStat> stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        List<? extends HeartRateDataStat> list = stats;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((HeartRateDataStat) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(long j2, long j3, @NotNull Continuation<? super lbd<List<HeartRateDataStat>>> continuation) throws Throwable {
        HeartRateStatModel$getHeartRateStatData$1 heartRateStatModel$getHeartRateStatData$1;
        if (continuation instanceof HeartRateStatModel$getHeartRateStatData$1) {
            heartRateStatModel$getHeartRateStatData$1 = (HeartRateStatModel$getHeartRateStatData$1) continuation;
            int i = heartRateStatModel$getHeartRateStatData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                heartRateStatModel$getHeartRateStatData$1.label = i - Integer.MIN_VALUE;
            } else {
                heartRateStatModel$getHeartRateStatData$1 = new HeartRateStatModel$getHeartRateStatData$1(this, continuation);
            }
        } else {
            heartRateStatModel$getHeartRateStatData$1 = new HeartRateStatModel$getHeartRateStatData$1(this, continuation);
        }
        Object objWithContext = heartRateStatModel$getHeartRateStatData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = heartRateStatModel$getHeartRateStatData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("HRStat");
            HeartRateStatModel$getHeartRateStatData$2 heartRateStatModel$getHeartRateStatData$2 = new HeartRateStatModel$getHeartRateStatData$2(j2, j3, null);
            heartRateStatModel$getHeartRateStatData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, heartRateStatModel$getHeartRateStatData$2, heartRateStatModel$getHeartRateStatData$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "startTime: Long, endTime…              }\n        }");
        return objWithContext;
    }

    @Nullable
    public final Object e(@NotNull Continuation<? super HeartRateStatAdapter.HeartRateStatData> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.b("HRStat"), new HeartRateStatModel$getTodayHeartRateStat$2(this, null), continuation);
    }
}
