package com.heytap.sports.home.frag.badminton;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.MetadataUnit;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.oplus.aiunit.vision.wq8;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/heytap/sports/home/frag/badminton/BadmintonHomeRepo;", "", "", "startTime", "endTime", "Lkotlin/Pair;", "", "c", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "Lkotlin/collections/ArrayList;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadmintonHomeRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadmintonHomeRepo.kt\ncom/heytap/sports/home/frag/badminton/BadmintonHomeRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,188:1\n1855#2,2:189\n*S KotlinDebug\n*F\n+ 1 BadmintonHomeRepo.kt\ncom/heytap/sports/home/frag/badminton/BadmintonHomeRepo\n*L\n60#1:189,2\n*E\n"})
public final class BadmintonHomeRepo {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Continuation<? super List<MetadataUnit>> continuation) throws Throwable {
        BadmintonHomeRepo$getLatestAdvanceRecord$1 badmintonHomeRepo$getLatestAdvanceRecord$1;
        if (continuation instanceof BadmintonHomeRepo$getLatestAdvanceRecord$1) {
            badmintonHomeRepo$getLatestAdvanceRecord$1 = (BadmintonHomeRepo$getLatestAdvanceRecord$1) continuation;
            int i = badmintonHomeRepo$getLatestAdvanceRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                badmintonHomeRepo$getLatestAdvanceRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                badmintonHomeRepo$getLatestAdvanceRecord$1 = new BadmintonHomeRepo$getLatestAdvanceRecord$1(this, continuation);
            }
        } else {
            badmintonHomeRepo$getLatestAdvanceRecord$1 = new BadmintonHomeRepo$getLatestAdvanceRecord$1(this, continuation);
        }
        Object objWithContext = badmintonHomeRepo$getLatestAdvanceRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = badmintonHomeRepo$getLatestAdvanceRecord$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("BadmintonHom");
            BadmintonHomeRepo$getLatestAdvanceRecord$dataList$1 badmintonHomeRepo$getLatestAdvanceRecord$dataList$1 = new BadmintonHomeRepo$getLatestAdvanceRecord$dataList$1(null);
            badmintonHomeRepo$getLatestAdvanceRecord$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, badmintonHomeRepo$getLatestAdvanceRecord$dataList$1, badmintonHomeRepo$getLatestAdvanceRecord$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return (List) objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Continuation<? super ArrayList<TrackMetadataStat>> continuation) throws Throwable {
        BadmintonHomeRepo$getLatestRecord$1 badmintonHomeRepo$getLatestRecord$1;
        if (continuation instanceof BadmintonHomeRepo$getLatestRecord$1) {
            badmintonHomeRepo$getLatestRecord$1 = (BadmintonHomeRepo$getLatestRecord$1) continuation;
            int i = badmintonHomeRepo$getLatestRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                badmintonHomeRepo$getLatestRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                badmintonHomeRepo$getLatestRecord$1 = new BadmintonHomeRepo$getLatestRecord$1(this, continuation);
            }
        } else {
            badmintonHomeRepo$getLatestRecord$1 = new BadmintonHomeRepo$getLatestRecord$1(this, continuation);
        }
        Object objWithContext = badmintonHomeRepo$getLatestRecord$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = badmintonHomeRepo$getLatestRecord$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("BadmintonHom");
            BadmintonHomeRepo$getLatestRecord$dataList$1 badmintonHomeRepo$getLatestRecord$dataList$1 = new BadmintonHomeRepo$getLatestRecord$dataList$1(null);
            badmintonHomeRepo$getLatestRecord$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, badmintonHomeRepo$getLatestRecord$dataList$1, badmintonHomeRepo$getLatestRecord$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(HealthDispat…) }.awaitOnce()\n        }");
        ArrayList arrayList = (ArrayList) objWithContext;
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList2.add(arrayList.get(0));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(long j2, long j3, @NotNull Continuation<? super Pair<Integer, Integer>> continuation) throws Throwable {
        BadmintonHomeRepo$queryTotalStatByTimeRange$1 badmintonHomeRepo$queryTotalStatByTimeRange$1;
        if (continuation instanceof BadmintonHomeRepo$queryTotalStatByTimeRange$1) {
            badmintonHomeRepo$queryTotalStatByTimeRange$1 = (BadmintonHomeRepo$queryTotalStatByTimeRange$1) continuation;
            int i = badmintonHomeRepo$queryTotalStatByTimeRange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                badmintonHomeRepo$queryTotalStatByTimeRange$1.label = i - Integer.MIN_VALUE;
            } else {
                badmintonHomeRepo$queryTotalStatByTimeRange$1 = new BadmintonHomeRepo$queryTotalStatByTimeRange$1(this, continuation);
            }
        } else {
            badmintonHomeRepo$queryTotalStatByTimeRange$1 = new BadmintonHomeRepo$queryTotalStatByTimeRange$1(this, continuation);
        }
        Object objWithContext = badmintonHomeRepo$queryTotalStatByTimeRange$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = badmintonHomeRepo$queryTotalStatByTimeRange$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("BadmintonHom");
            BadmintonHomeRepo$queryTotalStatByTimeRange$dataList$1 badmintonHomeRepo$queryTotalStatByTimeRange$dataList$1 = new BadmintonHomeRepo$queryTotalStatByTimeRange$dataList$1(j2, j3, null);
            badmintonHomeRepo$queryTotalStatByTimeRange$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, badmintonHomeRepo$queryTotalStatByTimeRange$dataList$1, badmintonHomeRepo$queryTotalStatByTimeRange$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "startTime: Long, endTime…) }.awaitOnce()\n        }");
        int value = 0;
        int value2 = 0;
        for (MetadataUnit metadataUnit : (ArrayList) objWithContext) {
            int type = metadataUnit.getType();
            if (type == 600028) {
                value2 = (int) metadataUnit.getValue();
            } else if (type == 600030) {
                value = (int) metadataUnit.getValue();
            }
        }
        return TuplesKt.to(Boxing.boxInt(value), Boxing.boxInt(value2));
    }
}
