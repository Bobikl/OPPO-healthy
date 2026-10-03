package com.heytap.health.operation.timeline;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.heytap.health.sport.ISportRecordQueryService;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ap6;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineSport;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/sport/ISportRecordQueryService;", "service", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "d", "(Lcom/heytap/health/sport/ISportRecordQueryService;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "()Lcom/heytap/health/sport/ISportRecordQueryService;", "sportService", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineSport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineSport.kt\ncom/heytap/health/operation/timeline/TimelineSport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n766#2:118\n857#2,2:119\n*S KotlinDebug\n*F\n+ 1 TimelineSport.kt\ncom/heytap/health/operation/timeline/TimelineSport\n*L\n115#1:118\n115#1:119,2\n*E\n"})
public final class TimelineSport extends g0k {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        TimelineSport$fetchData$1 timelineSport$fetchData$1;
        ISportRecordQueryService iSportRecordQueryService;
        List list;
        final long j3;
        List list2;
        if (continuation instanceof TimelineSport$fetchData$1) {
            timelineSport$fetchData$1 = (TimelineSport$fetchData$1) continuation;
            int i = timelineSport$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSport$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSport$fetchData$1 = new TimelineSport$fetchData$1(this, continuation);
            }
        } else {
            timelineSport$fetchData$1 = new TimelineSport$fetchData$1(this, continuation);
        }
        Object obj = timelineSport$fetchData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSport$fetchData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            a7b.f("TimelineSport", "get sport nodes, dayTimestamp=" + j2);
            ISportRecordQueryService iSportRecordQueryServiceC = c();
            if (iSportRecordQueryServiceC == null) {
                return new TimelineData(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            timelineSport$fetchData$1.L$0 = iSportRecordQueryServiceC;
            timelineSport$fetchData$1.L$1 = arrayList;
            timelineSport$fetchData$1.L$2 = arrayList2;
            timelineSport$fetchData$1.J$0 = j2;
            timelineSport$fetchData$1.label = 1;
            Object objD = d(iSportRecordQueryServiceC, j2, timelineSport$fetchData$1);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            iSportRecordQueryService = iSportRecordQueryServiceC;
            list = arrayList;
            obj = objD;
            j3 = j2;
            list2 = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = timelineSport$fetchData$1.J$0;
            list2 = (List) timelineSport$fetchData$1.L$2;
            list = (List) timelineSport$fetchData$1.L$1;
            iSportRecordQueryService = (ISportRecordQueryService) timelineSport$fetchData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<TrackMetadataStat> list3 = (List) obj;
        if (list3.isEmpty()) {
            a7b.f("TimelineSport", "sport records empty");
            return new TimelineData(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        }
        Context context = b78.a();
        int iMax = 0;
        for (final TrackMetadataStat trackMetadataStat : list3) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Pair<String, Integer> pairP1 = iSportRecordQueryService.p1(context, trackMetadataStat);
            final String strComponent1 = pairP1.component1();
            int iIntValue = pairP1.component2().intValue();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            iSportRecordQueryService.e3(context, trackMetadataStat, new Function3<String, Double, String, Unit>() { // from class: com.heytap.health.operation.timeline.TimelineSport$fetchData$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str, Double d, String str2) {
                    invoke(str, d.doubleValue(), str2);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object, java.lang.String] */
                public final void invoke(@NotNull String valueStr, double d, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(valueStr, "valueStr");
                    Intrinsics.checkNotNullParameter(str, "str");
                    Ref.ObjectRef<String> objectRef2 = objectRef;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    ?? r0 = String.format(str, Arrays.copyOf(new Object[]{strComponent1, valueStr}, 2));
                    Intrinsics.checkNotNullExpressionValue(r0, "format(...)");
                    objectRef2.element = r0;
                }
            });
            a aVar = new a(NodeType.SPORT, trackMetadataStat.getStartTimestamp(), trackMetadataStat.getEndTimestamp());
            aVar.r(iIntValue);
            aVar.q(R$drawable.operation_timeline_sport_bg);
            String str = (String) objectRef.element;
            if (str == null) {
                str = "";
            }
            aVar.p(str);
            if (iSportRecordQueryService.r8(trackMetadataStat.getSportMode()) == 103) {
                aVar.t(R$string.home_timeline_sticky_fitness);
            } else {
                aVar.t(R$string.home_timeline_sticky_sports);
            }
            aVar.s(new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineSport$fetchData$3
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
                    x0.d().b("/sports/RecordDetailsActivity").withString("EXTRA_KEY_RECORD_SPORT", trackMetadataStat.getClientDataId()).withInt("EXTRA_KEY_MOVEMENT_TYPE", trackMetadataStat.getSportMode()).navigation();
                }
            });
            list.add(aVar);
            iMax = trackMetadataStat.getTotalTime() >= ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL ? Math.max(iMax, 3) : Math.max(iMax, 2);
        }
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineSport$fetchData$tagOnClick$1
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
                x0.d().b("/daily/DailyActivityDetailActivity").withString("date", String.valueOf(o05.B(o05.D(j3)))).navigation();
            }
        };
        if (iMax == 2) {
            list2.add(new zii(iMax, qtf.l(R$string.home_tl_tag_more_active), function0));
        } else if (iMax == 3) {
            list2.add(new zii(iMax, qtf.l(R$string.home_tl_tag_very_active), function0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sport nodes result > ");
        sb.append(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sport tags result > ");
        sb2.append(list2);
        return new TimelineData(list, list2);
    }

    public final ISportRecordQueryService c() {
        Object objNavigation = x0.d().b("/sports/SportRecordQueryService").navigation();
        if (objNavigation instanceof ISportRecordQueryService) {
            return (ISportRecordQueryService) objNavigation;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(ISportRecordQueryService iSportRecordQueryService, long j2, Continuation<? super List<? extends TrackMetadataStat>> continuation) {
        TimelineSport$readDayRecords$1 timelineSport$readDayRecords$1;
        long j3;
        long j4;
        if (continuation instanceof TimelineSport$readDayRecords$1) {
            timelineSport$readDayRecords$1 = (TimelineSport$readDayRecords$1) continuation;
            int i = timelineSport$readDayRecords$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSport$readDayRecords$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSport$readDayRecords$1 = new TimelineSport$readDayRecords$1(this, continuation);
            }
        } else {
            timelineSport$readDayRecords$1 = new TimelineSport$readDayRecords$1(this, continuation);
        }
        TimelineSport$readDayRecords$1 timelineSport$readDayRecords$2 = timelineSport$readDayRecords$1;
        Object objA0 = timelineSport$readDayRecords$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSport$readDayRecords$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA0);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            long jA = j0k.a(j2);
            long jCurrentTimeMillis = n05Var.m(j2, System.currentTimeMillis()) ? System.currentTimeMillis() : jC;
            timelineSport$readDayRecords$2.J$0 = jD;
            timelineSport$readDayRecords$2.J$1 = jC;
            timelineSport$readDayRecords$2.label = 1;
            objA0 = iSportRecordQueryService.a0(-2, jA, jCurrentTimeMillis, 1, 0, 0, timelineSport$readDayRecords$2);
            if (objA0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            j3 = jD;
            j4 = jC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = timelineSport$readDayRecords$2.J$1;
            j3 = timelineSport$readDayRecords$2.J$0;
            ResultKt.throwOnFailure(objA0);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objA0) {
            TrackMetadataStat trackMetadataStat = (TrackMetadataStat) obj;
            if (trackMetadataStat.getEndTimestamp() > j3 && trackMetadataStat.getStartTimestamp() <= j4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
