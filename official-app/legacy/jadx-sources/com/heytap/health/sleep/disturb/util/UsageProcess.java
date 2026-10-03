package com.heytap.health.sleep.disturb.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.DisturbSleep;
import com.heytap.databaseengine.model.DisturbSleepStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c3e;
import com.oplus.aiunit.vision.enk;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.lw5;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.nw5;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wq8;
import com.oplus.onet.wrapper.ONetAdvertiseSetting;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0010\u0014B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J#\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/sleep/disturb/util/UsageProcess;", "", "", "startTime", "endTime", "", "d", MapSchema.FIELD_NAME_ENTRY, "f", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "it", "", b2n.f, "(Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "mScope", "Lcom/oplus/aiunit/vision/nw5;", "b", "Lcom/oplus/aiunit/vision/nw5;", "disturbRepository", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUsageProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsageProcess.kt\ncom/heytap/health/sleep/disturb/util/UsageProcess\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,175:1\n48#2,4:176\n48#2,4:180\n21#3:184\n23#3:188\n53#3:189\n55#3:193\n50#4:185\n55#4:187\n50#4:190\n55#4:192\n107#5:186\n107#5:191\n*S KotlinDebug\n*F\n+ 1 UsageProcess.kt\ncom/heytap/health/sleep/disturb/util/UsageProcess\n*L\n67#1:176,4\n96#1:180,4\n120#1:184\n120#1:188\n122#1:189\n122#1:193\n120#1:185\n120#1:187\n122#1:190\n122#1:192\n120#1:186\n122#1:191\n*E\n"})
public final class UsageProcess {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope mScope = CoroutineScopeKt.CoroutineScope(new CoroutineName("calculate-sleepStat-data").plus(wq8.INSTANCE.e()));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final nw5 disturbRepository = new nw5();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.sleep.disturb.util.UsageProcess$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/sleep/disturb/util/UsageProcess$a;", "", "Lcom/heytap/health/sleep/disturb/util/UsageProcess;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UsageProcess a() {
            return b.INSTANCE.a();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/sleep/disturb/util/UsageProcess$b;", "", "Lcom/heytap/health/sleep/disturb/util/UsageProcess;", "a", "Lcom/heytap/health/sleep/disturb/util/UsageProcess;", "()Lcom/heytap/health/sleep/disturb/util/UsageProcess;", "sSingle", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final UsageProcess sSingle = new UsageProcess();
        public static final int $stable = 8;

        @NotNull
        public final UsageProcess a() {
            return sSingle;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 UsageProcess.kt\ncom/heytap/health/sleep/disturb/util/UsageProcess\n*L\n1#1,110:1\n68#2,2:111\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            lw5.c("UsageProcess", "details data:" + exception.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 UsageProcess.kt\ncom/heytap/health/sleep/disturb/util/UsageProcess\n*L\n1#1,110:1\n97#2,2:111\n*E\n"})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            lw5.c("UsageProcess", "calculateStatData:" + exception.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e implements FlowCollector<Boolean> {
        public static final e INSTANCE = new e();

        @Nullable
        public final Object a(boolean z, @NotNull Continuation<? super Unit> continuation) {
            lw5.c("UsageProcess", "stat data collect:" + z);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
            return a(bool.booleanValue(), continuation);
        }
    }

    public final void d(long startTime, long endTime) {
        Ref.LongRef longRef = new Ref.LongRef();
        mq8 mq8Var = mq8.INSTANCE;
        longRef.element = mq8Var.o(startTime);
        long jN = mq8Var.n(endTime);
        if (longRef.element >= jN) {
            lw5.c("UsageProcess", "calculate parameter error!");
            return;
        }
        if (!c3e.j()) {
            lw5.c("UsageProcess", "calculate no usage permission");
            return;
        }
        long jC = c3e.c();
        long jA = v9g.w().A("disturb_data_sync_time");
        lw5.c("UsageProcess", "authorizeTime:" + jC + " ,lastSyncEndTime:" + jA);
        if (longRef.element < jC) {
            longRef.element = jC;
        }
        if (longRef.element < jA) {
            longRef.element = jA;
        }
        long j2 = longRef.element;
        lw5.c("UsageProcess", "calculate startTime:" + j2 + " ,:" + mq8Var.y(j2, "yyy-MMM-dd HH:mm") + ",endTime:" + jN + " ,:" + mq8Var.y(jN, "yyy-MMM-dd HH:mm"));
        BuildersKt__Builders_commonKt.launch$default(this.mScope, wq8.INSTANCE.e().plus(new c(CoroutineExceptionHandler.INSTANCE)), null, new UsageProcess$calculate$2(longRef, jN, this, startTime, endTime, null), 2, null);
    }

    public final void e(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(this.mScope, wq8.INSTANCE.e().plus(new d(CoroutineExceptionHandler.INSTANCE)), null, new UsageProcess$calculateStatData$2(this, startTime, endTime, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j2, long j3, Continuation<? super Unit> continuation) {
        UsageProcess$calculateStatData2$1 usageProcess$calculateStatData2$1;
        if (continuation instanceof UsageProcess$calculateStatData2$1) {
            usageProcess$calculateStatData2$1 = (UsageProcess$calculateStatData2$1) continuation;
            int i = usageProcess$calculateStatData2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                usageProcess$calculateStatData2$1.label = i - Integer.MIN_VALUE;
            } else {
                usageProcess$calculateStatData2$1 = new UsageProcess$calculateStatData2$1(this, continuation);
            }
        } else {
            usageProcess$calculateStatData2$1 = new UsageProcess$calculateStatData2$1(this, continuation);
        }
        Object objC = usageProcess$calculateStatData2$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = usageProcess$calculateStatData2$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (UsageProcess) usageProcess$calculateStatData2$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        lw5.c("UsageProcess", "calculateStatData");
        mq8 mq8Var = mq8.INSTANCE;
        long jO = mq8Var.o(j2);
        long jN = mq8Var.n(j3);
        if (jO >= jN) {
            lw5.c("UsageProcess", "calculateStatData parameter error!");
            return Unit.INSTANCE;
        }
        if (!c3e.j()) {
            lw5.c("UsageProcess", "calculateStatData no usage permission");
            return Unit.INSTANCE;
        }
        lbd<List<SleepMainData>> lbdVarF = this.disturbRepository.f(jO, jN);
        usageProcess$calculateStatData2$1.L$0 = this;
        usageProcess$calculateStatData2$1.label = 1;
        objC = RxExtendKt.c(lbdVarF, usageProcess$calculateStatData2$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "disturbRepository.fetchS…sleepEndTime).awaitOnce()");
        final Flow flowAsFlow = FlowKt.asFlow((List) objC);
        final Flow<SleepMainData> flow = new Flow<SleepMainData>() { // from class: com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$filter$1

            /* JADX INFO: renamed from: com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UsageProcess.kt\ncom/heytap/health/sleep/disturb/util/UsageProcess\n*L\n1#1,222:1\n22#2:223\n23#2:225\n121#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector i;

                /* JADX INFO: renamed from: com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$filter$1$2", f = "UsageProcess.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.i = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.i;
                        if (((SleepMainData) obj).getTotalSleepTime() > 0) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super SleepMainData> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        Flow flowM6848catch = FlowKt.m6848catch(new Flow<Boolean>() { // from class: com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$map$1

            /* JADX INFO: renamed from: com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UsageProcess.kt\ncom/heytap/health/sleep/disturb/util/UsageProcess\n*L\n1#1,222:1\n54#2:223\n123#3,9:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ UsageProcess f5752j;

                /* JADX INFO: renamed from: com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.heytap.health.sleep.disturb.util.UsageProcess$calculateStatData2$$inlined$map$1$2", f = "UsageProcess.kt", i = {0, 0, 1, 1, 1, 2}, l = {oei.TAI_CHI, 229, 230, 223}, m = "emit", n = {"this", "it", "this", "it", "result", "result"}, s = {"L$0", "L$2", "L$0", "L$2", "Z$0", "Z$0"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    boolean Z$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, UsageProcess usageProcess) {
                    this.i = flowCollector;
                    this.f5752j = usageProcess;
                }

                /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
                /* JADX WARN: Code duplicated, block: B:37:0x00ce A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object objG;
                    SleepMainData sleepMainData;
                    FlowCollector flowCollector;
                    boolean zBooleanValue;
                    AnonymousClass2<T> anonymousClass2;
                    boolean z;
                    FlowCollector flowCollector2;
                    SleepMainData sleepMainData2;
                    UsageProcess usageProcess;
                    Boolean boolBoxBoolean;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            SleepMainData sleepMainData3 = (SleepMainData) anonymousClass1.L$2;
                            flowCollector = (FlowCollector) anonymousClass1.L$1;
                            AnonymousClass2<T> anonymousClass3 = (AnonymousClass2) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            sleepMainData = sleepMainData3;
                            this = anonymousClass3;
                            objG = obj2;
                        } else if (i2 == 2) {
                            z = anonymousClass1.Z$0;
                            sleepMainData2 = (SleepMainData) anonymousClass1.L$2;
                            flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                            anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            usageProcess = anonymousClass2.f5752j;
                            anonymousClass1.L$0 = flowCollector2;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.Z$0 = z;
                            anonymousClass1.label = 3;
                            if (usageProcess.g(sleepMainData2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flowCollector = flowCollector2;
                            zBooleanValue = z;
                            boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.label = 4;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i2 == 3) {
                            z = anonymousClass1.Z$0;
                            flowCollector = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            zBooleanValue = z;
                            boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.label = 4;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector3 = this.i;
                    SleepMainData sleepMainData4 = (SleepMainData) obj;
                    UsageProcess usageProcess2 = this.f5752j;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = flowCollector3;
                    anonymousClass1.L$2 = sleepMainData4;
                    anonymousClass1.label = 1;
                    objG = usageProcess2.g(sleepMainData4, anonymousClass1);
                    if (objG == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sleepMainData = sleepMainData4;
                    flowCollector = flowCollector3;
                    zBooleanValue = ((Boolean) objG).booleanValue();
                    if (!zBooleanValue) {
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = flowCollector;
                        anonymousClass1.L$2 = sleepMainData;
                        anonymousClass1.Z$0 = zBooleanValue;
                        anonymousClass1.label = 2;
                        if (DelayKt.delay(5000L, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass2 = this;
                        z = zBooleanValue;
                        flowCollector2 = flowCollector;
                        sleepMainData2 = sleepMainData;
                        usageProcess = anonymousClass2.f5752j;
                        anonymousClass1.L$0 = flowCollector2;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.Z$0 = z;
                        anonymousClass1.label = 3;
                        if (usageProcess.g(sleepMainData2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowCollector = flowCollector2;
                        zBooleanValue = z;
                    }
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 4;
                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UsageProcess$calculateStatData2$4(null));
        e eVar = e.INSTANCE;
        usageProcess$calculateStatData2$1.L$0 = null;
        usageProcess$calculateStatData2$1.label = 2;
        if (flowM6848catch.collect(eVar, usageProcess$calculateStatData2$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(SleepMainData sleepMainData, Continuation<? super Boolean> continuation) {
        UsageProcess$processDayStatData$1 usageProcess$processDayStatData$1;
        long sleepInTime;
        long sleepOutTime;
        long jO;
        SleepMainData sleepMainData2;
        UsageProcess usageProcess = this;
        if (continuation instanceof UsageProcess$processDayStatData$1) {
            usageProcess$processDayStatData$1 = (UsageProcess$processDayStatData$1) continuation;
            int i = usageProcess$processDayStatData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                usageProcess$processDayStatData$1.label = i - Integer.MIN_VALUE;
            } else {
                usageProcess$processDayStatData$1 = new UsageProcess$processDayStatData$1(usageProcess, continuation);
            }
        } else {
            usageProcess$processDayStatData$1 = new UsageProcess$processDayStatData$1(usageProcess, continuation);
        }
        Object objC = usageProcess$processDayStatData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = usageProcess$processDayStatData$1.label;
        String str = "UsageProcess";
        if (i2 != 0) {
            if (i2 == 1) {
                jO = usageProcess$processDayStatData$1.J$2;
                sleepOutTime = usageProcess$processDayStatData$1.J$1;
                sleepInTime = usageProcess$processDayStatData$1.J$0;
                SleepMainData sleepMainData3 = (SleepMainData) usageProcess$processDayStatData$1.L$1;
                UsageProcess usageProcess2 = (UsageProcess) usageProcess$processDayStatData$1.L$0;
                ResultKt.throwOnFailure(objC);
                sleepMainData2 = sleepMainData3;
                usageProcess = usageProcess2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
                str = "UsageProcess";
            }
            Intrinsics.checkNotNullExpressionValue(objC, "disturbRepository.insert…leepStatList).awaitOnce()");
            boolean zBooleanValue = ((Boolean) objC).booleanValue();
            lw5.c(str, "save stat data:" + zBooleanValue);
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(objC);
        lw5.c("UsageProcess", "processDayStatData date:" + sleepMainData.getDate());
        sleepInTime = sleepMainData.getSleepInTime();
        sleepOutTime = sleepMainData.getSleepOutTime();
        mq8 mq8Var = mq8.INSTANCE;
        jO = mq8Var.o(mq8Var.g(sleepMainData.getDate()));
        long j2 = (sleepInTime - (sleepInTime % ((long) 1800000))) - ((long) ONetAdvertiseSetting.LIMITED_ADVETISING_MAX_MILLIS);
        if (j2 >= jO) {
            jO = j2;
        }
        lbd<List<DisturbSleep>> lbdVarD = usageProcess.disturbRepository.d(jO, sleepOutTime);
        usageProcess$processDayStatData$1.L$0 = usageProcess;
        sleepMainData2 = sleepMainData;
        usageProcess$processDayStatData$1.L$1 = sleepMainData2;
        usageProcess$processDayStatData$1.J$0 = sleepInTime;
        usageProcess$processDayStatData$1.J$1 = sleepOutTime;
        usageProcess$processDayStatData$1.J$2 = jO;
        usageProcess$processDayStatData$1.label = 1;
        objC = RxExtendKt.c(lbdVarD, usageProcess$processDayStatData$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        long j3 = sleepInTime;
        long j4 = sleepOutTime;
        long j5 = jO;
        Intrinsics.checkNotNullExpressionValue(objC, "disturbRepository.fetchD…sleepOutTime).awaitOnce()");
        lw5.c(str, "sleepInTime:" + j3 + " ,sleepOutTime:" + j4 + " ,finalStartTime:" + j5);
        List<DisturbSleepStat> listJ = enk.j((List) objC, j5, j4, sleepMainData2.getDate());
        if (!lza.b(listJ, 1)) {
            return Boxing.boxBoolean(false);
        }
        lbd<Boolean> lbdVarH = usageProcess.disturbRepository.h(listJ);
        usageProcess$processDayStatData$1.L$0 = null;
        usageProcess$processDayStatData$1.L$1 = null;
        usageProcess$processDayStatData$1.label = 2;
        objC = RxExtendKt.c(lbdVarH, usageProcess$processDayStatData$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "disturbRepository.insert…leepStatList).awaitOnce()");
        boolean zBooleanValue2 = ((Boolean) objC).booleanValue();
        lw5.c(str, "save stat data:" + zBooleanValue2);
        return Boxing.boxBoolean(zBooleanValue2);
    }
}
