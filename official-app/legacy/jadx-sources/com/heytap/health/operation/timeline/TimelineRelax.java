package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.relax.Relax;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineRelax;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "duration", "", "d", "", "Lcom/heytap/databaseengine/model/relax/Relax;", "c", "relax", MapSchema.FIELD_NAME_ENTRY, "type", "f", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineRelax.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineRelax.kt\ncom/heytap/health/operation/timeline/TimelineRelax\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n766#2:109\n857#2,2:110\n*S KotlinDebug\n*F\n+ 1 TimelineRelax.kt\ncom/heytap/health/operation/timeline/TimelineRelax\n*L\n94#1:109\n94#1:110,2\n*E\n"})
public final class TimelineRelax extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(final long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineRelax$fetchData$1 timelineRelax$fetchData$1;
        List arrayList;
        Object objC;
        if (continuation instanceof TimelineRelax$fetchData$1) {
            timelineRelax$fetchData$1 = (TimelineRelax$fetchData$1) continuation;
            int i = timelineRelax$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineRelax$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineRelax$fetchData$1 = new TimelineRelax$fetchData$1(this, continuation);
            }
        } else {
            timelineRelax$fetchData$1 = new TimelineRelax$fetchData$1(this, continuation);
        }
        Object obj = timelineRelax$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineRelax$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            timelineRelax$fetchData$1.L$0 = this;
            timelineRelax$fetchData$1.L$1 = arrayList;
            timelineRelax$fetchData$1.J$0 = j2;
            timelineRelax$fetchData$1.label = 1;
            objC = c(j2, timelineRelax$fetchData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = timelineRelax$fetchData$1.J$0;
            List list = (List) timelineRelax$fetchData$1.L$1;
            TimelineRelax timelineRelax = (TimelineRelax) timelineRelax$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
            arrayList = list;
            this = timelineRelax;
            objC = obj;
        }
        for (Relax relax : (List) objC) {
            a aVar = new a(NodeType.RELAX, relax.getStartTimestamp(), this.e(relax));
            aVar.r(R$drawable.operation_timeline_relax);
            aVar.q(R$drawable.operation_timeline_relax_bg);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(this.f(relax.getType()), Arrays.copyOf(new Object[]{this.d(relax.getRelaxDuration())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            aVar.p(str);
            aVar.t(R$string.home_timeline_sticky_relax);
            aVar.s(new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineRelax$fetchData$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    x0.d().b("/relax/RelaxActivity").withString("date", String.valueOf(o05.B(o05.D(j2)))).navigation();
                }
            });
            arrayList.add(aVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("stress nodes result > ");
        sb.append(arrayList);
        return new TimelineData(arrayList, CollectionsKt__CollectionsKt.emptyList());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j2, Continuation<? super List<? extends Relax>> continuation) {
        TimelineRelax$fetchRelaxDetail$1 timelineRelax$fetchRelaxDetail$1;
        long jC;
        long j3;
        if (continuation instanceof TimelineRelax$fetchRelaxDetail$1) {
            timelineRelax$fetchRelaxDetail$1 = (TimelineRelax$fetchRelaxDetail$1) continuation;
            int i = timelineRelax$fetchRelaxDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineRelax$fetchRelaxDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineRelax$fetchRelaxDetail$1 = new TimelineRelax$fetchRelaxDetail$1(this, continuation);
            }
        } else {
            timelineRelax$fetchRelaxDetail$1 = new TimelineRelax$fetchRelaxDetail$1(this, continuation);
        }
        Object objC = timelineRelax$fetchRelaxDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineRelax$fetchRelaxDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            jC = n05Var.c(j2);
            long jA = j0k.a(j2);
            long jCurrentTimeMillis = n05Var.m(j2, System.currentTimeMillis()) ? System.currentTimeMillis() : jC;
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(1024);
            dataReadOption.setStartTime(jA);
            dataReadOption.setEndTime(jCurrentTimeMillis);
            dataReadOption.setSortOrder(1);
            dataReadOption.setIsParse(2);
            dataReadOption.setReadHealthDataType(-2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineRelax$fetchRelaxDetail$1.L$0 = this;
            timelineRelax$fetchRelaxDetail$1.J$0 = jD;
            timelineRelax$fetchRelaxDetail$1.J$1 = jC;
            timelineRelax$fetchRelaxDetail$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineRelax$fetchRelaxDetail$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            j3 = jD;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = timelineRelax$fetchRelaxDetail$1.J$1;
            j3 = timelineRelax$fetchRelaxDetail$1.J$0;
            TimelineRelax timelineRelax = (TimelineRelax) timelineRelax$fetchRelaxDetail$1.L$0;
            ResultKt.throwOnFailure(objC);
            jC = j4;
            this = timelineRelax;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…a(readOption).awaitOnce()");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.relax.Relax>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            Relax relax = (Relax) obj;
            if (this.e(relax) > j3 && relax.getStartTimestamp() <= jC) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String d(int duration) {
        if (duration <= 0) {
            String string = b78.a().getString(com.heytap.health.relax.R$string.health_relax_total_minute_empty);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …relax_total_minute_empty)");
            return string;
        }
        BigDecimal bigDecimal = new BigDecimal(60);
        BigDecimal bigDecimalDivide = new BigDecimal(duration).divide(bigDecimal, 0, RoundingMode.HALF_UP);
        if (bigDecimalDivide.compareTo(bigDecimal) < 0) {
            String string2 = b78.a().getString(com.heytap.health.health_base.R$string.health_base_minute_noblank, bigDecimalDivide.toString());
            Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…tring()\n                )");
            return string2;
        }
        String string3 = b78.a().getString(com.heytap.health.relax.R$string.health_relax_total_hour, bigDecimalDivide.divide(bigDecimal, 1, RoundingMode.HALF_UP).toString());
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …al_hour, hour.toString())");
        return string3;
    }

    public final long e(Relax relax) {
        return relax.getStartTimestamp() + ((long) (relax.getRelaxDuration() * 1000));
    }

    public final String f(int type) {
        if (type != 1) {
            return type != 2 ? "" : qtf.l(R$string.home_tl_relax_meditation);
        }
        return qtf.l(R$string.home_tl_relax_breath);
    }
}
