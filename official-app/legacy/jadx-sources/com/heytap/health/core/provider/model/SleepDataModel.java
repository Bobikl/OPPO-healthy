package com.heytap.health.core.provider.model;

import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.core.provider.adapter.open.SleepDataAdapter;
import com.heytap.health.health.sleep.SleepService;
import com.oplus.aiunit.vision.SeedlingCardSleepData;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/core/provider/model/SleepDataModel;", "", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "", "Lcom/heytap/health/core/provider/adapter/open/SleepDataAdapter$SleepData;", b2n.f, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/base/utils/AsyncResult;", MapSchema.FIELD_NAME_ENTRY, "target", "Lcom/oplus/aiunit/vision/uqg;", "source", "", "d", "a", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/health/sleep/SleepService;", "b", "Lcom/heytap/health/health/sleep/SleepService;", "sleepService", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDataModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "SleepDataModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SleepService sleepService;

    public SleepDataModel() {
        Object objNavigation = x0.d().b("/sleep/SleepService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.sleep.SleepService");
        this.sleepService = (SleepService) objNavigation;
    }

    public final void d(SleepDataAdapter.SleepData target, SeedlingCardSleepData source) {
        target.setDate(source.getDate());
        target.setCode(source.getCode());
        target.setSupportMobilePhoneSleep(source.getSupportMobilePhoneSleep());
        target.setStartSleepTime(source.getStartSleepTime());
        target.setEndSleepTime(source.getEndSleepTime());
        target.setTotalSleepTime(source.getTotalSleepTime());
        target.setTotalWakeTime(source.getTotalWakeTime());
        target.setTotalDeepSleepTime(source.getTotalDeepSleepTime());
        target.setTotalLightlySleepTime(source.getTotalLightlySleepTime());
        target.setTotalREMSleepTime(source.getTotalREMSleepTime());
        target.setScore(source.getScore());
        target.setHrRangeLow(source.getSleepHeartRateRangeLow());
        target.setHrRangeHigh(source.getSleepHeartRateRangeHigh());
        target.setAvgHr(source.getAvgHr());
        target.setAvgBreathRangeLow(source.getAvgSleepBreathRangeLow());
        target.setAvgBreathRangeHigh(source.getAvgSleepBreathRangeHigh());
        target.setSleepData(source.getSleepData());
    }

    public final AsyncResult<SleepDataAdapter.SleepData> e() {
        return new AsyncResult<>(new SleepDataModel$getSeedlingCardSleepData$1(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@NotNull Continuation<? super String> continuation) throws Throwable {
        SleepDataModel$getSleepData$1 sleepDataModel$getSleepData$1;
        if (continuation instanceof SleepDataModel$getSleepData$1) {
            sleepDataModel$getSleepData$1 = (SleepDataModel$getSleepData$1) continuation;
            int i = sleepDataModel$getSleepData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepDataModel$getSleepData$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepDataModel$getSleepData$1 = new SleepDataModel$getSleepData$1(this, continuation);
            }
        } else {
            sleepDataModel$getSleepData$1 = new SleepDataModel$getSleepData$1(this, continuation);
        }
        Object objWithContext = sleepDataModel$getSleepData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepDataModel$getSleepData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("sleepAdapter");
            SleepDataModel$getSleepData$2 sleepDataModel$getSleepData$2 = new SleepDataModel$getSleepData$2(this, null);
            sleepDataModel$getSleepData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, sleepDataModel$getSleepData$2, sleepDataModel$getSleepData$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun getSleepData…lt\")\n        result\n    }");
        return objWithContext;
    }

    @Nullable
    public final Object g(long j2, long j3, @NotNull Continuation<? super List<SleepDataAdapter.SleepData>> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.b("sleepAdapter"), new SleepDataModel$getSleepDataList$2(this, j2, j3, null), continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }
}
