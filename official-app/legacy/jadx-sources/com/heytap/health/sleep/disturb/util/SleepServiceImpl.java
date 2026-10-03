package com.heytap.health.sleep.disturb.util;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.health.sleep.SleepService;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.model.SleepDayDataRepository2;
import com.oplus.aiunit.vision.SeedlingCardSleepData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.mq8;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/sleep/SleepService")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0002J/\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/sleep/disturb/util/SleepServiceImpl;", "Lcom/heytap/health/health/sleep/SleepService;", "Landroid/content/Context;", "context", "", "init", "Lcom/heytap/health/base/utils/AsyncResult;", "Lcom/oplus/aiunit/vision/uqg;", "Z4", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "", "j8", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "seedlingSleepData", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDayBean", "l3", "(Lcom/oplus/aiunit/vision/uqg;Lcom/heytap/health/sleep/bean/SleepDayBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexMap", "q6", "Q6", "<init>", "()V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepServiceImpl.kt\ncom/heytap/health/sleep/disturb/util/SleepServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,349:1\n1194#2,2:350\n1222#2,4:352\n*S KotlinDebug\n*F\n+ 1 SleepServiceImpl.kt\ncom/heytap/health/sleep/disturb/util/SleepServiceImpl\n*L\n343#1:350,2\n343#1:352,4\n*E\n"})
public final class SleepServiceImpl implements SleepService {
    public static final int $stable = 0;
    public static final int CHART_TYPE_HAS_DATA = 1;
    public static final int CHART_TYPE_NO_DATA = 0;

    @NotNull
    public static final String TAG = "SleepServiceImpl";
    public static final int TYPE_AWAKE = 4;
    public static final int TYPE_DEEP_SLEEP = 1;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_EYE_MOVEMENT = 3;
    public static final int TYPE_LIGHT_SLEEP = 2;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object Q6(long j2, long j3, Continuation<? super Map<Integer, ? extends SleepIndex>> continuation) {
        SleepServiceImpl$querySleepIndexMap$1 sleepServiceImpl$querySleepIndexMap$1;
        if (continuation instanceof SleepServiceImpl$querySleepIndexMap$1) {
            sleepServiceImpl$querySleepIndexMap$1 = (SleepServiceImpl$querySleepIndexMap$1) continuation;
            int i = sleepServiceImpl$querySleepIndexMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepServiceImpl$querySleepIndexMap$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepServiceImpl$querySleepIndexMap$1 = new SleepServiceImpl$querySleepIndexMap$1(this, continuation);
            }
        } else {
            sleepServiceImpl$querySleepIndexMap$1 = new SleepServiceImpl$querySleepIndexMap$1(this, continuation);
        }
        Object objC = sleepServiceImpl$querySleepIndexMap$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepServiceImpl$querySleepIndexMap$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                lbd lbdVarW0 = SleepDayDataRepository2.w0(new SleepDayDataRepository2(), j2, j3, null, 4, null);
                sleepServiceImpl$querySleepIndexMap$1.label = 1;
                objC = RxExtendKt.c(lbdVarW0, sleepServiceImpl$querySleepIndexMap$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "repository.fetchSleepInd…ime, endTime).awaitOnce()");
            List list = (List) objC;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(Boxing.boxInt(mq8.INSTANCE.e(((SleepIndex) obj).getDataTimestamp())), obj);
            }
            return linkedHashMap;
        } catch (Exception e2) {
            a7b.c(TAG, "querySleepIndexMap exception: " + e2.getMessage(), e2);
            return MapsKt__MapsKt.emptyMap();
        }
    }

    @Override // com.heytap.health.health.sleep.SleepService
    @Nullable
    public Object Z4(@NotNull Continuation<? super AsyncResult<SeedlingCardSleepData>> continuation) {
        return new AsyncResult(new SleepServiceImpl$getSeedlingCardSleepData$2(this));
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.health.sleep.SleepService
    @Nullable
    public Object j8(long j2, long j3, @NotNull Continuation<? super AsyncResult<List<SeedlingCardSleepData>>> continuation) {
        return new AsyncResult(new SleepServiceImpl$getSeedlingCardSleepDataList$2(j2, j3, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l3(SeedlingCardSleepData seedlingCardSleepData, SleepDayBean sleepDayBean, Continuation<? super Unit> continuation) {
        SleepServiceImpl$fillNewFields$1 sleepServiceImpl$fillNewFields$1;
        int i;
        if (continuation instanceof SleepServiceImpl$fillNewFields$1) {
            sleepServiceImpl$fillNewFields$1 = (SleepServiceImpl$fillNewFields$1) continuation;
            int i2 = sleepServiceImpl$fillNewFields$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sleepServiceImpl$fillNewFields$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sleepServiceImpl$fillNewFields$1 = new SleepServiceImpl$fillNewFields$1(this, continuation);
            }
        } else {
            sleepServiceImpl$fillNewFields$1 = new SleepServiceImpl$fillNewFields$1(this, continuation);
        }
        SleepServiceImpl$fillNewFields$1 sleepServiceImpl$fillNewFields$2 = sleepServiceImpl$fillNewFields$1;
        Object objQ6 = sleepServiceImpl$fillNewFields$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sleepServiceImpl$fillNewFields$2.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objQ6);
                mq8 mq8Var = mq8.INSTANCE;
                seedlingCardSleepData.v(mq8Var.e(sleepDayBean.getTimestamp()));
                seedlingCardSleepData.x(sleepDayBean.getScore());
                int date = seedlingCardSleepData.getDate();
                long timestamp = sleepDayBean.getTimestamp();
                long jO = mq8Var.o(timestamp);
                long jN = mq8Var.n(timestamp);
                sleepServiceImpl$fillNewFields$2.L$0 = seedlingCardSleepData;
                sleepServiceImpl$fillNewFields$2.I$0 = date;
                sleepServiceImpl$fillNewFields$2.label = 1;
                objQ6 = Q6(jO, jN, sleepServiceImpl$fillNewFields$2);
                if (objQ6 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = date;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = sleepServiceImpl$fillNewFields$2.I$0;
                seedlingCardSleepData = (SeedlingCardSleepData) sleepServiceImpl$fillNewFields$2.L$0;
                ResultKt.throwOnFailure(objQ6);
            }
            SleepIndex sleepIndex = (SleepIndex) ((Map) objQ6).get(Boxing.boxInt(i));
            if (sleepIndex != null) {
                Integer sleepHeartRateRangeLow = sleepIndex.getSleepHeartRateRangeLow();
                if (sleepHeartRateRangeLow != null) {
                    seedlingCardSleepData.A(sleepHeartRateRangeLow.intValue());
                }
                Integer sleepHeartRateRangeHigh = sleepIndex.getSleepHeartRateRangeHigh();
                if (sleepHeartRateRangeHigh != null) {
                    seedlingCardSleepData.z(sleepHeartRateRangeHigh.intValue());
                }
                Integer avgSleepHeartRate = sleepIndex.getAvgSleepHeartRate();
                if (avgSleepHeartRate != null) {
                    seedlingCardSleepData.r(avgSleepHeartRate.intValue());
                }
                Integer avgSleepBreathRangeLow = sleepIndex.getAvgSleepBreathRangeLow();
                if (avgSleepBreathRangeLow != null) {
                    seedlingCardSleepData.t(avgSleepBreathRangeLow.intValue());
                }
                Integer avgSleepBreathRangeHigh = sleepIndex.getAvgSleepBreathRangeHigh();
                if (avgSleepBreathRangeHigh != null) {
                    seedlingCardSleepData.s(avgSleepBreathRangeHigh.intValue());
                }
            }
        } catch (Exception e2) {
            a7b.c(TAG, "fillNewFields error: " + e2.getMessage(), e2);
        }
        return Unit.INSTANCE;
    }

    public final void q6(SeedlingCardSleepData seedlingSleepData, SleepDayBean sleepDayBean, Map<Integer, ? extends SleepIndex> sleepIndexMap) {
        try {
            seedlingSleepData.v(mq8.INSTANCE.e(sleepDayBean.getTimestamp()));
            seedlingSleepData.x(sleepDayBean.getScore());
            SleepIndex sleepIndex = sleepIndexMap.get(Integer.valueOf(seedlingSleepData.getDate()));
            if (sleepIndex != null) {
                Integer sleepHeartRateRangeLow = sleepIndex.getSleepHeartRateRangeLow();
                if (sleepHeartRateRangeLow != null) {
                    seedlingSleepData.A(sleepHeartRateRangeLow.intValue());
                }
                Integer sleepHeartRateRangeHigh = sleepIndex.getSleepHeartRateRangeHigh();
                if (sleepHeartRateRangeHigh != null) {
                    seedlingSleepData.z(sleepHeartRateRangeHigh.intValue());
                }
                Integer avgSleepHeartRate = sleepIndex.getAvgSleepHeartRate();
                if (avgSleepHeartRate != null) {
                    seedlingSleepData.r(avgSleepHeartRate.intValue());
                }
                Integer avgSleepBreathRangeLow = sleepIndex.getAvgSleepBreathRangeLow();
                if (avgSleepBreathRangeLow != null) {
                    seedlingSleepData.t(avgSleepBreathRangeLow.intValue());
                }
                Integer avgSleepBreathRangeHigh = sleepIndex.getAvgSleepBreathRangeHigh();
                if (avgSleepBreathRangeHigh != null) {
                    seedlingSleepData.s(avgSleepBreathRangeHigh.intValue());
                }
            }
        } catch (Exception e2) {
            a7b.c(TAG, "fillNewFields error: " + e2.getMessage(), e2);
        }
    }
}
