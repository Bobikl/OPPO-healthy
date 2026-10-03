package com.heytap.health.operation.timeline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportRecord;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScopeKt;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b(\u0010)J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0002J&\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0002J&\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0002J&\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0002J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J$\u0010\"\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001d\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0006J!\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0006J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0006J!\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineDailyActivity;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "dayDetailList", "Lcom/heytap/databaseengine/model/SportRecord;", "sportRecords", "", "Lcom/heytap/health/operation/timeline/TimelineNode;", "nodes", "", LogFieldKey.LEVEL_KEY, "startTime", "endTime", "", "continuousSteps", "o", "", ParserTag.TAG_PERCENT, "Lkotlin/Function0;", ParserTag.TAG_ONCLICK, "r", "n", "t", "q", "detailTime", "statTime", "s", "excludeSportStepList", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/databaseengine/model/SportDataStat;", "v", "u", LogFieldKey.PROCESS_NAME_KEY, LogFieldKey.MESSAGE_KEY, "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineDailyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineDailyActivity.kt\ncom/heytap/health/operation/timeline/TimelineDailyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,587:1\n2624#2,3:588\n*S KotlinDebug\n*F\n+ 1 TimelineDailyActivity.kt\ncom/heytap/health/operation/timeline/TimelineDailyActivity\n*L\n354#1:588,3\n*E\n"})
public final class TimelineDailyActivity extends g0k {
    public static final int $stable = 0;
    public static final int MINUTE_MILLS = 60000;

    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        return CoroutineScopeKt.coroutineScope(new TimelineDailyActivity$fetchData$2(j2, this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    public final void k(List<? extends SportDataDetail> excludeSportStepList, List<TimelineNode> nodes) {
        int i;
        int steps;
        ContinuousStepConfig continuousStepConfigB = TLConfig.INSTANCE.b();
        a7b.f("TimelineDailyActivity", "continuous step config=" + continuousStepConfigB);
        int stepsAMinLeast = continuousStepConfigB.getStepsAMinLeast();
        int stepsTotalLeast = continuousStepConfigB.getStepsTotalLeast();
        int startMin = continuousStepConfigB.getStartMin();
        int endMin = continuousStepConfigB.getEndMin() * 60000;
        SportDataDetail sportDataDetail = null;
        int i2 = 0;
        SportDataDetail sportDataDetail2 = null;
        int steps2 = 0;
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(excludeSportStepList); -1 < lastIndex; lastIndex--) {
            SportDataDetail sportDataDetail3 = excludeSportStepList.get(lastIndex);
            if (lastIndex >= CollectionsKt__CollectionsKt.getLastIndex(excludeSportStepList)) {
                int i3 = steps2;
                if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                    steps2 = sportDataDetail3.getSteps();
                    sportDataDetail = sportDataDetail3;
                    sportDataDetail2 = sportDataDetail;
                    i2 = 1;
                } else {
                    steps2 = i3;
                }
            } else if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                if (sportDataDetail3.getStartTimestamp() - (sportDataDetail != null ? sportDataDetail.getStartTimestamp() : 0L) <= 60000) {
                    i2++;
                    steps2 += sportDataDetail3.getSteps();
                    if (i2 >= startMin && lastIndex == 0 && System.currentTimeMillis() - sportDataDetail3.getStartTimestamp() >= endMin + 60000 && steps2 > stepsTotalLeast) {
                        nodes.add(o(sportDataDetail2 != null ? sportDataDetail2.getStartTimestamp() : 0L, sportDataDetail3.getEndTimestamp() - 1, steps2));
                    }
                    sportDataDetail = sportDataDetail3;
                } else if (sportDataDetail != null || sportDataDetail3.getStartTimestamp() - sportDataDetail.getStartTimestamp() <= endMin) {
                    i = steps2;
                    if (i2 >= startMin) {
                        if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                            i2++;
                            steps = i + sportDataDetail3.getSteps();
                            sportDataDetail = sportDataDetail3;
                        } else {
                            steps = i;
                        }
                        if (lastIndex == 0 && sportDataDetail != null && System.currentTimeMillis() - sportDataDetail.getStartTimestamp() >= endMin + 60000 && steps > stepsTotalLeast) {
                            nodes.add(o(sportDataDetail2 != null ? sportDataDetail2.getStartTimestamp() : 0L, sportDataDetail.getEndTimestamp() - 1, steps));
                        }
                        steps2 = steps;
                    } else if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                        steps2 = sportDataDetail3.getSteps();
                        sportDataDetail = sportDataDetail3;
                        sportDataDetail2 = sportDataDetail;
                        i2 = 1;
                    } else {
                        i2 = 0;
                        sportDataDetail2 = null;
                        steps2 = 0;
                    }
                } else {
                    if (i2 >= startMin && steps2 > stepsTotalLeast) {
                        nodes.add(o(sportDataDetail2 != null ? sportDataDetail2.getStartTimestamp() : 0L, sportDataDetail.getEndTimestamp() - 1, steps2));
                    }
                    if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                        steps2 = sportDataDetail3.getSteps();
                        sportDataDetail = sportDataDetail3;
                        sportDataDetail2 = sportDataDetail;
                        i2 = 1;
                    } else {
                        i2 = 0;
                        sportDataDetail2 = null;
                        steps2 = 0;
                    }
                }
            } else if (sportDataDetail != null) {
                i = steps2;
                if (i2 >= startMin) {
                    if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                        i2++;
                        steps = i + sportDataDetail3.getSteps();
                        sportDataDetail = sportDataDetail3;
                    } else {
                        steps = i;
                    }
                    if (lastIndex == 0) {
                        nodes.add(o(sportDataDetail2 != null ? sportDataDetail2.getStartTimestamp() : 0L, sportDataDetail.getEndTimestamp() - 1, steps));
                    }
                    steps2 = steps;
                } else if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                    steps2 = sportDataDetail3.getSteps();
                    sportDataDetail = sportDataDetail3;
                    sportDataDetail2 = sportDataDetail;
                    i2 = 1;
                } else {
                    i2 = 0;
                    sportDataDetail2 = null;
                    steps2 = 0;
                }
            } else {
                i = steps2;
                if (i2 >= startMin) {
                    if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                        i2++;
                        steps = i + sportDataDetail3.getSteps();
                        sportDataDetail = sportDataDetail3;
                    } else {
                        steps = i;
                    }
                    if (lastIndex == 0) {
                        nodes.add(o(sportDataDetail2 != null ? sportDataDetail2.getStartTimestamp() : 0L, sportDataDetail.getEndTimestamp() - 1, steps));
                    }
                    steps2 = steps;
                } else if (sportDataDetail3.getSteps() > stepsAMinLeast) {
                    steps2 = sportDataDetail3.getSteps();
                    sportDataDetail = sportDataDetail3;
                    sportDataDetail2 = sportDataDetail;
                    i2 = 1;
                } else {
                    i2 = 0;
                    sportDataDetail2 = null;
                    steps2 = 0;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    public final void l(@NotNull List<? extends SportDataDetail> dayDetailList, @NotNull List<? extends SportRecord> sportRecords, @NotNull List<TimelineNode> nodes) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(dayDetailList, "dayDetailList");
        Intrinsics.checkNotNullParameter(sportRecords, "sportRecords");
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < dayDetailList.size()) {
            SportDataDetail sportDataDetail = dayDetailList.get(i);
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                List<? extends SportRecord> list = sportRecords;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        SportRecord sportRecord = (SportRecord) it.next();
                        long startTime = sportRecord.getStartTime();
                        long endTime = sportRecord.getEndTime();
                        SportDataDetail sportDataDetail2 = sportDataDetail;
                        long startTimestamp = sportDataDetail2.getStartTimestamp();
                        if (startTime <= startTimestamp && startTimestamp <= endTime) {
                            z = true;
                        } else {
                            long startTime2 = sportRecord.getStartTime();
                            long endTime2 = sportRecord.getEndTime();
                            long endTimestamp = sportDataDetail2.getEndTimestamp();
                            if (startTime2 <= endTimestamp && endTimestamp <= endTime2) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                if (!z2) {
                    break;
                }
                arrayList2.add(sportDataDetail);
                i++;
                if (i >= dayDetailList.size()) {
                    break;
                } else {
                    sportDataDetail = dayDetailList.get(i);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(arrayList2);
            }
            i++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k((List) it2.next(), nodes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(long j2, Continuation<? super List<? extends SportRecord>> continuation) {
        TimelineDailyActivity$fetchSportRecords$1 timelineDailyActivity$fetchSportRecords$1;
        if (continuation instanceof TimelineDailyActivity$fetchSportRecords$1) {
            timelineDailyActivity$fetchSportRecords$1 = (TimelineDailyActivity$fetchSportRecords$1) continuation;
            int i = timelineDailyActivity$fetchSportRecords$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineDailyActivity$fetchSportRecords$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineDailyActivity$fetchSportRecords$1 = new TimelineDailyActivity$fetchSportRecords$1(this, continuation);
            }
        } else {
            timelineDailyActivity$fetchSportRecords$1 = new TimelineDailyActivity$fetchSportRecords$1(this, continuation);
        }
        Object objC = timelineDailyActivity$fetchSportRecords$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineDailyActivity$fetchSportRecords$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
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
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setDataTable(1003);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineDailyActivity$fetchSportRecords$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineDailyActivity$fetchSportRecords$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…a(readOption).awaitOnce()");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportRecord>");
        return listB;
    }

    public final TimelineNode n(long startTime, String percent, Function0<Unit> onClick) {
        a aVar = new a(NodeType.CONSUMPTION, startTime, 0L, 4, null);
        aVar.r(R$drawable.operation_timeline_consumption);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(R$string.home_tl_consumption_goal), Arrays.copyOf(new Object[]{percent}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        aVar.p(str);
        aVar.t(R$string.home_timeline_sticky_consumption);
        aVar.s(onClick);
        return aVar;
    }

    public final TimelineNode o(final long startTime, long endTime, int continuousSteps) {
        a aVar = new a(NodeType.CONTINUOUS_STEP, startTime, endTime);
        aVar.r(R$drawable.operation_timeline_step);
        aVar.q(R$drawable.operation_timeline_step_bg);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(R$string.home_tl_continuous_step), Arrays.copyOf(new Object[]{Integer.valueOf(continuousSteps)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        aVar.p(str);
        aVar.t(R$string.home_timeline_sticky_continuous_step);
        aVar.s(new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineDailyActivity$getContinuousNode$1
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
                x0.d().b("/step/StepHistoryActivity").withString("date", String.valueOf(o05.B(o05.D(startTime)))).navigation();
            }
        });
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(long j2, Continuation<? super List<? extends SportDataDetail>> continuation) {
        TimelineDailyActivity$getMoveAboutDetails$1 timelineDailyActivity$getMoveAboutDetails$1;
        if (continuation instanceof TimelineDailyActivity$getMoveAboutDetails$1) {
            timelineDailyActivity$getMoveAboutDetails$1 = (TimelineDailyActivity$getMoveAboutDetails$1) continuation;
            int i = timelineDailyActivity$getMoveAboutDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineDailyActivity$getMoveAboutDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineDailyActivity$getMoveAboutDetails$1 = new TimelineDailyActivity$getMoveAboutDetails$1(this, continuation);
            }
        } else {
            timelineDailyActivity$getMoveAboutDetails$1 = new TimelineDailyActivity$getMoveAboutDetails$1(this, continuation);
        }
        Object objC = timelineDailyActivity$getMoveAboutDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineDailyActivity$getMoveAboutDetails$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setDataTable(1001);
            dataReadOption.setGroupUnitType(3);
            dataReadOption.setReadSportMode(-3);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            timelineDailyActivity$getMoveAboutDetails$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineDailyActivity$getMoveAboutDetails$1);
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
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportDataDetail>");
        return listB;
    }

    public final TimelineNode q(long startTime, String percent, Function0<Unit> onClick) {
        a aVar = new a(NodeType.MOVE_ABOUT, startTime, 0L, 4, null);
        aVar.r(R$drawable.operation_timeline_moveabout);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(R$string.home_tl_moveabout_goal), Arrays.copyOf(new Object[]{percent}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        aVar.p(str);
        aVar.t(R$string.home_timeline_sticky_moveabout);
        aVar.s(onClick);
        return aVar;
    }

    public final TimelineNode r(long startTime, String percent, Function0<Unit> onClick) {
        a aVar = new a(NodeType.STEP, startTime, 0L, 4, null);
        aVar.r(R$drawable.operation_timeline_step);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(R$string.home_tl_step_goal), Arrays.copyOf(new Object[]{percent}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        aVar.p(str);
        aVar.t(R$string.home_timeline_sticky_step_dot);
        aVar.s(onClick);
        return aVar;
    }

    public final long s(long detailTime, long statTime) {
        if (detailTime > 0 && statTime > 0) {
            return Math.min(detailTime, statTime);
        }
        if (detailTime > 0) {
            return detailTime;
        }
        if (statTime > 0) {
            return statTime;
        }
        return 0L;
    }

    public final TimelineNode t(long startTime, String percent, Function0<Unit> onClick) {
        a aVar = new a(NodeType.WORKOUT, startTime, 0L, 4, null);
        aVar.r(R$drawable.operation_timeline_workout);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(R$string.home_tl_workout_goal), Arrays.copyOf(new Object[]{percent}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        aVar.p(str);
        aVar.t(R$string.home_timeline_sticky_workout_minutes);
        aVar.s(onClick);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(long j2, Continuation<? super List<? extends SportDataDetail>> continuation) {
        TimelineDailyActivity$queryDayDetail$1 timelineDailyActivity$queryDayDetail$1;
        if (continuation instanceof TimelineDailyActivity$queryDayDetail$1) {
            timelineDailyActivity$queryDayDetail$1 = (TimelineDailyActivity$queryDayDetail$1) continuation;
            int i = timelineDailyActivity$queryDayDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineDailyActivity$queryDayDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineDailyActivity$queryDayDetail$1 = new TimelineDailyActivity$queryDayDetail$1(this, continuation);
            }
        } else {
            timelineDailyActivity$queryDayDetail$1 = new TimelineDailyActivity$queryDayDetail$1(this, continuation);
        }
        Object objC = timelineDailyActivity$queryDayDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineDailyActivity$queryDayDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("TimelineDailyActivity", "queryDayDetail start, dayTimestamp=" + j2);
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
            dataReadOption.setDataTable(1001);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            timelineDailyActivity$queryDayDetail$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineDailyActivity$queryDayDetail$1);
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
        a7b.f("TimelineDailyActivity", "queryDayDetail end");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportDataDetail>");
        return listB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(long j2, Continuation<? super SportDataStat> continuation) {
        TimelineDailyActivity$queryDayStat$1 timelineDailyActivity$queryDayStat$1;
        if (continuation instanceof TimelineDailyActivity$queryDayStat$1) {
            timelineDailyActivity$queryDayStat$1 = (TimelineDailyActivity$queryDayStat$1) continuation;
            int i = timelineDailyActivity$queryDayStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineDailyActivity$queryDayStat$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineDailyActivity$queryDayStat$1 = new TimelineDailyActivity$queryDayStat$1(this, continuation);
            }
        } else {
            timelineDailyActivity$queryDayStat$1 = new TimelineDailyActivity$queryDayStat$1(this, continuation);
        }
        Object objC = timelineDailyActivity$queryDayStat$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineDailyActivity$queryDayStat$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("TimelineDailyActivity", "queryDayStat start, dayTimestamp=" + j2);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setDataTable(1002);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setAggregateType(108);
            dataReadOption.setIsParse(2);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            timelineDailyActivity$queryDayStat$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineDailyActivity$queryDayStat$1);
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
        List<Object> listB = j0k.b((CommonBackBean) objC);
        a7b.f("TimelineDailyActivity", "queryDayStat end");
        if (!(!listB.isEmpty())) {
            return null;
        }
        Object obj = listB.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.databaseengine.model.SportDataStat");
        return (SportDataStat) obj;
    }
}
