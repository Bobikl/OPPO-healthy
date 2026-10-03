package com.heytap.health.sleep.heartrate.day.algorithm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.health.sleephrline.SDKProxy;
import com.health.sleephrline.bean.HrPoint;
import com.health.sleephrline.bean.SleepHrResultBean;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.sleep.heartrate.day.viewmodel.SleepHeartRateTransform;
import com.oplus.aiunit.vision.SleepHeartRateDayBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.f08;
import com.oplus.aiunit.vision.gih;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.mq8;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002\u0017\u0010B\u0007¢\u0006\u0004\b%\u0010&JY\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000523\u0010\u000f\u001a/\u0012%\u0012#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bJ)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess;", "", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "heartRateList", "", "mainSleepStartTime", "mainSleepEndTime", "Lkotlin/Function1;", "Lkotlin/Pair;", "", "Lkotlin/ParameterName;", "name", "pair", "", "queryData", "b", "minTime", "maxTime", "Lcom/oplus/aiunit/vision/bih;", "c", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/health/sleephrline/SDKProxy;", "a", "Lcom/health/sleephrline/SDKProxy;", "sdkProxy", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lcom/oplus/aiunit/vision/gih;", "Lcom/oplus/aiunit/vision/gih;", "repository", "Lcom/heytap/health/sleep/heartrate/day/viewmodel/SleepHeartRateTransform;", "d", "Lkotlin/Lazy;", "()Lcom/heytap/health/sleep/heartrate/day/viewmodel/SleepHeartRateTransform;", "transform", "<init>", "()V", "Companion", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepHeartRateProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepHeartRateProcess.kt\ncom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,124:1\n48#2,4:125\n1855#3,2:129\n37#4,2:131\n*S KotlinDebug\n*F\n+ 1 SleepHeartRateProcess.kt\ncom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess\n*L\n38#1:125,4\n70#1:129,2\n79#1:131,2\n*E\n"})
public final class SleepHeartRateProcess {

    @NotNull
    public static final String TAG = "SleepHeartRateProcess";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public SDKProxy sdkProxy = new SDKProxy();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler handler = new d(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gih repository = new gih(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy transform = LazyKt__LazyJVMKt.lazy(new Function0<SleepHeartRateTransform>() { // from class: com.heytap.health.sleep.heartrate.day.algorithm.SleepHeartRateProcess$transform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SleepHeartRateTransform invoke() {
            return new SleepHeartRateTransform();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.sleep.heartrate.day.algorithm.SleepHeartRateProcess$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess$a;", "", "Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepHeartRateProcess a() {
            return b.INSTANCE.a();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess$b;", "", "Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess;", "a", "Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess;", "()Lcom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess;", "sSingle", "<init>", "()V", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final SleepHeartRateProcess sSingle = new SleepHeartRateProcess();
        public static final int $stable = 8;

        @NotNull
        public final SleepHeartRateProcess a() {
            return sSingle;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayStat;", "sleepDayStatList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "Lcom/heytap/databaseengine/model/HeartRate;", "heartRateList", "Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "sleepHRStatList", "Lcom/oplus/aiunit/vision/bih;", "b", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class c<T1, T2, T3, T4, R> implements f08 {
        public final /* synthetic */ long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f5777c;

        public c(long j2, long j3) {
            this.b = j2;
            this.f5777c = j3;
        }

        @Override // com.oplus.aiunit.vision.f08
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<SleepHeartRateDayBean> a(@NotNull List<SleepDayStat> sleepDayStatList, @NotNull List<SleepIndex> sleepIndexList, @NotNull List<HeartRate> heartRateList, @NotNull List<SleepHeartRateStat> sleepHRStatList) {
            Intrinsics.checkNotNullParameter(sleepDayStatList, "sleepDayStatList");
            Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
            Intrinsics.checkNotNullParameter(heartRateList, "heartRateList");
            Intrinsics.checkNotNullParameter(sleepHRStatList, "sleepHRStatList");
            return SleepHeartRateProcess.this.d().a(this.b, this.f5777c, sleepDayStatList, sleepIndexList, heartRateList, sleepHRStatList);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SleepHeartRateProcess.kt\ncom/heytap/health/sleep/heartrate/day/algorithm/SleepHeartRateProcess\n*L\n1#1,110:1\n39#2,3:111\n*E\n"})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.b(SleepHeartRateProcess.TAG, "catch exception: " + exception.getMessage());
            a7b.b(SleepHeartRateProcess.TAG, "catch exception: " + a7b.e(exception));
        }
    }

    public final void b(@NotNull List<TimeStampedData> heartRateList, long mainSleepStartTime, long mainSleepEndTime, @NotNull Function1<? super Pair<? extends List<TimeStampedData>, Integer>, Unit> queryData) {
        int type;
        HrPoint[] fittingLineList;
        Intrinsics.checkNotNullParameter(heartRateList, "heartRateList");
        Intrinsics.checkNotNullParameter(queryData, "queryData");
        if (heartRateList.isEmpty()) {
            a7b.f(TAG, "list isEmpty");
            return;
        }
        if (mainSleepStartTime >= mainSleepEndTime) {
            a7b.f(TAG, "time error");
            return;
        }
        long j2 = 60000;
        long j3 = (mainSleepEndTime - mainSleepStartTime) / j2;
        ArrayList arrayList = new ArrayList();
        for (TimeStampedData timeStampedData : heartRateList) {
            long timestamp = (timeStampedData.getTimestamp() - mainSleepStartTime) / j2;
            HrPoint hrPoint = new HrPoint();
            hrPoint.setX((int) timestamp);
            hrPoint.setY(timeStampedData.getY());
            arrayList.add(hrPoint);
        }
        a7b.f(TAG, "calculate :" + arrayList.size() + " ,mainSleepLength:" + j3);
        SDKProxy sDKProxy = this.sdkProxy;
        SleepHrResultBean sleepHrResultBeanCalculate = sDKProxy != null ? sDKProxy.calculate((HrPoint[]) arrayList.toArray(new HrPoint[0]), arrayList.size(), (int) j3) : null;
        if (sleepHrResultBeanCalculate != null) {
            a7b.f(TAG, "result:" + sleepHrResultBeanCalculate);
            type = sleepHrResultBeanCalculate.getType();
        } else {
            type = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        if (sleepHrResultBeanCalculate != null && (fittingLineList = sleepHrResultBeanCalculate.getFittingLineList()) != null) {
            for (HrPoint hrPoint2 : fittingLineList) {
                arrayList2.add(new TimeStampedData(((long) (hrPoint2.getX() * 60000)) + mainSleepStartTime, (float) hrPoint2.getY()));
            }
        }
        queryData.invoke(new Pair(arrayList2, Integer.valueOf(type)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object c(long j2, long j3, @NotNull Continuation<? super List<SleepHeartRateDayBean>> continuation) {
        SleepHeartRateProcess$getSleepHeartRateDayList$1 sleepHeartRateProcess$getSleepHeartRateDayList$1;
        if (continuation instanceof SleepHeartRateProcess$getSleepHeartRateDayList$1) {
            sleepHeartRateProcess$getSleepHeartRateDayList$1 = (SleepHeartRateProcess$getSleepHeartRateDayList$1) continuation;
            int i = sleepHeartRateProcess$getSleepHeartRateDayList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepHeartRateProcess$getSleepHeartRateDayList$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepHeartRateProcess$getSleepHeartRateDayList$1 = new SleepHeartRateProcess$getSleepHeartRateDayList$1(this, continuation);
            }
        } else {
            sleepHeartRateProcess$getSleepHeartRateDayList$1 = new SleepHeartRateProcess$getSleepHeartRateDayList$1(this, continuation);
        }
        Object objC = sleepHeartRateProcess$getSleepHeartRateDayList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepHeartRateProcess$getSleepHeartRateDayList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            mq8 mq8Var = mq8.INSTANCE;
            long jO = mq8Var.o(j2);
            long jN = mq8Var.n(mq8Var.c(j3));
            SleepHeartRateProcess$getSleepHeartRateDayList$1 sleepHeartRateProcess$getSleepHeartRateDayList$2 = sleepHeartRateProcess$getSleepHeartRateDayList$1;
            lbd lbdVarM1 = lbd.m1(this.repository.c(j2, j3), this.repository.a(j2, j3), this.repository.b(jO, jN - 1), this.repository.d(j2, j3), new c(jO, jN));
            Intrinsics.checkNotNullExpressionValue(lbdVarM1, "suspend fun getSleepHear…      return result\n    }");
            sleepHeartRateProcess$getSleepHeartRateDayList$2.label = 1;
            objC = RxExtendKt.c(lbdVarM1, sleepHeartRateProcess$getSleepHeartRateDayList$2);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "suspend fun getSleepHear…      return result\n    }");
        return (List) objC;
    }

    public final SleepHeartRateTransform d() {
        return (SleepHeartRateTransform) this.transform.getValue();
    }
}
