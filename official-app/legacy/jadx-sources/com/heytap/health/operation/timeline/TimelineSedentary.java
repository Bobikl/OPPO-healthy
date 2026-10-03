package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.Sedentary;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.health_base.R$string;
import com.heytap.health.operation.R$drawable;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0002J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\nH\u0002J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineSedentary;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/Sedentary;", "detailList", "", "startMin", "endMin", "targetMin", "", "Lcom/heytap/health/operation/timeline/TimelineNode;", "nodes", "dayEndTime", "", "c", "startTime", "endTime", "continuousTime", MapSchema.FIELD_NAME_ENTRY, "minute", "", "d", "f", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineSedentary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineSedentary.kt\ncom/heytap/health/operation/timeline/TimelineSedentary\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n766#2:192\n857#2,2:193\n1655#2,8:195\n*S KotlinDebug\n*F\n+ 1 TimelineSedentary.kt\ncom/heytap/health/operation/timeline/TimelineSedentary\n*L\n29#1:192\n29#1:193,2\n30#1:195,8\n*E\n"})
public final class TimelineSedentary extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineSedentary$fetchData$1 timelineSedentary$fetchData$1;
        TimelineSedentary timelineSedentary;
        List<TimelineNode> list;
        List list2;
        if (continuation instanceof TimelineSedentary$fetchData$1) {
            timelineSedentary$fetchData$1 = (TimelineSedentary$fetchData$1) continuation;
            int i = timelineSedentary$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSedentary$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSedentary$fetchData$1 = new TimelineSedentary$fetchData$1(this, continuation);
            }
        } else {
            timelineSedentary$fetchData$1 = new TimelineSedentary$fetchData$1(this, continuation);
        }
        Object obj = timelineSedentary$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSedentary$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            timelineSedentary$fetchData$1.L$0 = this;
            timelineSedentary$fetchData$1.L$1 = arrayList;
            timelineSedentary$fetchData$1.L$2 = arrayList2;
            timelineSedentary$fetchData$1.J$0 = j2;
            timelineSedentary$fetchData$1.label = 1;
            Object objF = f(j2, timelineSedentary$fetchData$1);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
            timelineSedentary = this;
            list = arrayList;
            obj = objF;
            list2 = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = timelineSedentary$fetchData$1.J$0;
            list2 = (List) timelineSedentary$fetchData$1.L$2;
            list = (List) timelineSedentary$fetchData$1.L$1;
            TimelineSedentary timelineSedentary2 = (TimelineSedentary) timelineSedentary$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
            timelineSedentary = timelineSedentary2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (((Sedentary) obj2).getValue() == 1) {
                arrayList3.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (hashSet.add(Boxing.boxLong(((Sedentary) obj3).getStartTimestamp()))) {
                arrayList4.add(obj3);
            }
        }
        a7b.f("TimelineSedentary", "dayDetailList.size=" + arrayList4.size());
        SedentaryConfig sedentaryConfigC = TLConfig.INSTANCE.c();
        n05 n05Var = n05.INSTANCE;
        timelineSedentary.c(arrayList4, sedentaryConfigC.getStartMinute(), sedentaryConfigC.getEndMinute(), sedentaryConfigC.getKeepTimeLeast(), list, n05Var.m(j2, System.currentTimeMillis()) ? System.currentTimeMillis() : n05Var.c(j2));
        if (!list.isEmpty()) {
            list2.add(new SedentaryTag());
        }
        return new TimelineData(list, list2);
    }

    public final void c(@NotNull List<Sedentary> detailList, int startMin, int endMin, int targetMin, @NotNull List<TimelineNode> nodes, long dayEndTime) {
        Intrinsics.checkNotNullParameter(detailList, "detailList");
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Sedentary sedentary = (Sedentary) CollectionsKt___CollectionsKt.firstOrNull((List) detailList);
        Sedentary sedentary2 = (Sedentary) CollectionsKt___CollectionsKt.firstOrNull((List) detailList);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(detailList);
        if (lastIndex < 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            Sedentary sedentary3 = detailList.get(i);
            if (i > 0) {
                if (sedentary3.getStartTimestamp() - (sedentary2 != null ? sedentary2.getStartTimestamp() : 0L) <= 60000) {
                    i2++;
                    if (i2 >= startMin && i == CollectionsKt__CollectionsKt.getLastIndex(detailList) && dayEndTime - sedentary3.getEndTimestamp() >= endMin * 60000 && i2 > targetMin) {
                        nodes.add(e(sedentary != null ? sedentary.getStartTimestamp() : 0L, sedentary3.getEndTimestamp() - 1, i2));
                    }
                } else {
                    if (sedentary2 == null || sedentary3.getStartTimestamp() - sedentary2.getStartTimestamp() <= endMin * 60000) {
                        if (i2 >= startMin) {
                            int i3 = i2 + 1;
                            if (i == CollectionsKt__CollectionsKt.getLastIndex(detailList) && System.currentTimeMillis() - sedentary3.getEndTimestamp() >= endMin * 60000) {
                                nodes.add(e(sedentary != null ? sedentary.getStartTimestamp() : 0L, sedentary3.getEndTimestamp() - 1, i3));
                            }
                            i2 = i3;
                        }
                    } else if (i2 > targetMin) {
                        nodes.add(e(sedentary != null ? sedentary.getStartTimestamp() : 0L, sedentary2.getEndTimestamp() - 1, i2));
                    }
                    sedentary = sedentary3;
                    i2 = 1;
                }
            } else {
                sedentary = sedentary3;
                i2 = 1;
            }
            if (i == lastIndex) {
                return;
            }
            i++;
            sedentary2 = sedentary3;
        }
    }

    public final String d(int minute) {
        if (minute < 60) {
            return qtf.o(R$string.health_base_minute, String.valueOf(minute));
        }
        int i = minute / 60;
        int i2 = minute % 60;
        return i2 <= 0 ? qtf.o(R$string.health_base_time_hour, String.valueOf(i)) : qtf.p(R$string.health_base_hour_minute, String.valueOf(i), String.valueOf(i2));
    }

    public final TimelineNode e(long startTime, long endTime, int continuousTime) {
        a aVar = new a(NodeType.SEDENTARY, startTime, endTime);
        aVar.r(R$drawable.operation_timeline_sedentary);
        aVar.q(R$drawable.operation_timeline_sedentary_bg);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(com.heytap.health.operation.R$string.home_timeline_sedentary_state_time), Arrays.copyOf(new Object[]{d(continuousTime)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        aVar.p(str);
        aVar.t(com.heytap.health.operation.R$string.home_timeline_sticky_sedentary);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j2, Continuation<? super List<Sedentary>> continuation) {
        TimelineSedentary$queryDayDetail$1 timelineSedentary$queryDayDetail$1;
        if (continuation instanceof TimelineSedentary$queryDayDetail$1) {
            timelineSedentary$queryDayDetail$1 = (TimelineSedentary$queryDayDetail$1) continuation;
            int i = timelineSedentary$queryDayDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSedentary$queryDayDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSedentary$queryDayDetail$1 = new TimelineSedentary$queryDayDetail$1(this, continuation);
            }
        } else {
            timelineSedentary$queryDayDetail$1 = new TimelineSedentary$queryDayDetail$1(this, continuation);
        }
        Object objC = timelineSedentary$queryDayDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSedentary$queryDayDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("TimelineSedentary", "queryDayDetail start, dayTimestamp=" + j2);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            if (n05Var.m(j2, System.currentTimeMillis())) {
                jC = System.currentTimeMillis();
            }
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setDataTable(1069);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            timelineSedentary$queryDayDetail$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineSedentary$queryDayDetail$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        a7b.f("TimelineSedentary", "queryDayDetail end");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.Sedentary>");
        return listB;
    }
}
