package com.heytap.health.core.provider.model;

import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.health.core.provider.adapter.open.StepDetailAdapter;
import com.oplus.aiunit.vision.hp6;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.wq8;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/core/provider/model/StepDetailModel;", "", "", "startTime", "endTime", "groupType", "Lcom/oplus/aiunit/vision/lbd;", "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "c", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", hp6.DETAIL_ENTRY, "Lcom/heytap/health/core/provider/adapter/open/StepDetailAdapter$StepDetailData;", "b", "detail", "a", "<init>", "()V", "Companion", "operations_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepDetailModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDetailModel.kt\ncom/heytap/health/core/provider/model/StepDetailModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1549#2:105\n1620#2,3:106\n*S KotlinDebug\n*F\n+ 1 StepDetailModel.kt\ncom/heytap/health/core/provider/model/StepDetailModel\n*L\n100#1:105\n100#1:106,3\n*E\n"})
public final class StepDetailModel {
    public final StepDetailAdapter.StepDetailData a(SportDataDetail detail) {
        return new StepDetailAdapter.StepDetailData(detail.getStartTimestamp(), detail.getEndTimestamp(), detail.getSteps(), detail.getDistance(), (int) detail.getCalories());
    }

    @NotNull
    public final List<StepDetailAdapter.StepDetailData> b(@NotNull List<? extends SportDataDetail> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        List<? extends SportDataDetail> list = details;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((SportDataDetail) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object c(long j2, long j3, long j4, @NotNull Continuation<? super lbd<List<SportDataDetail>>> continuation) throws Throwable {
        StepDetailModel$getStepDetailData$1 stepDetailModel$getStepDetailData$1;
        if (continuation instanceof StepDetailModel$getStepDetailData$1) {
            stepDetailModel$getStepDetailData$1 = (StepDetailModel$getStepDetailData$1) continuation;
            int i = stepDetailModel$getStepDetailData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepDetailModel$getStepDetailData$1.label = i - Integer.MIN_VALUE;
            } else {
                stepDetailModel$getStepDetailData$1 = new StepDetailModel$getStepDetailData$1(this, continuation);
            }
        } else {
            stepDetailModel$getStepDetailData$1 = new StepDetailModel$getStepDetailData$1(this, continuation);
        }
        Object objWithContext = stepDetailModel$getStepDetailData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepDetailModel$getStepDetailData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("StepDetail");
            StepDetailModel$getStepDetailData$2 stepDetailModel$getStepDetailData$2 = new StepDetailModel$getStepDetailData$2(j2, j3, j4, null);
            stepDetailModel$getStepDetailData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, stepDetailModel$getStepDetailData$2, stepDetailModel$getStepDetailData$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "startTime: Long,\n       …tOf()\n            }\n    }");
        return objWithContext;
    }
}
