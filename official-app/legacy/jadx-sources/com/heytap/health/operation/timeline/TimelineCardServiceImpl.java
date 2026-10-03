package com.heytap.health.operation.timeline;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$string;
import com.heytap.health.operations.timeline.ITimelineCardService;
import com.oplus.aiunit.vision.TimelineCardItem;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.ResultKt;
import p010kotlin.Triple;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/operation/TimelineCardService")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineCardServiceImpl;", "Lcom/heytap/health/operations/timeline/ITimelineCardService;", "Landroid/content/Context;", "context", "", "init", "", "dayTimestamp", "", "Lcom/oplus/aiunit/vision/d0k;", "Y", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ExifInterface.LONGITUDE_WEST, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "", "Wa", "Lcom/heytap/health/operation/timeline/TimelineNode;", l9d.BUNDLE_KEY_NODE, "Lkotlin/Triple;", "", "c", "<init>", "()V", "Companion", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineCardServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineCardServiceImpl.kt\ncom/heytap/health/operation/timeline/TimelineCardServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1549#2:230\n1620#2,3:231\n1855#2,2:234\n*S KotlinDebug\n*F\n+ 1 TimelineCardServiceImpl.kt\ncom/heytap/health/operation/timeline/TimelineCardServiceImpl\n*L\n33#1:230\n33#1:231,3\n187#1:234,2\n*E\n"})
public final class TimelineCardServiceImpl implements ITimelineCardService {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeType.values().length];
            try {
                iArr[NodeType.CONTINUOUS_STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NodeType.SEDENTARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NodeType.STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NodeType.CONSUMPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NodeType.WORKOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NodeType.MOVE_ABOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NodeType.DAILY_ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NodeType.SPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NodeType.SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NodeType.HEART_RATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NodeType.BLOOD_OXYGEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NodeType.ECG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NodeType.BLOOD_GLUCOSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NodeType.STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NodeType.RELAX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NodeType.CHECKUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NodeType.MEDAL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:20:0x0055, B:37:0x00dc, B:39:0x00eb, B:34:0x00c4), top: B:57:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a4 -> B:42:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:37:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x014d -> B:50:0x0150). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.heytap.health.operations.timeline.ITimelineCardService
    @org.jetbrains.annotations.Nullable
    public java.lang.Object W(@org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.operation.timeline.TimelineCardServiceImpl.W(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.heytap.health.operations.timeline.ITimelineCardService
    @NotNull
    public String Wa(long startTime, long endTime) {
        String timeStr;
        if (endTime > 0) {
            long jD = n05.INSTANCE.d(System.currentTimeMillis());
            if (startTime >= jD && endTime >= jD) {
                timeStr = o05.M(startTime) + "-" + o05.M(endTime);
            } else if (endTime > jD) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                timeStr = String.format(qtf.l(R$string.home_tl_node_time_range), Arrays.copyOf(new Object[]{o05.M(startTime), o05.M(endTime)}, 2));
                Intrinsics.checkNotNullExpressionValue(timeStr, "format(...)");
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                timeStr = String.format(qtf.l(R$string.home_tl_node_time_range_yesterday), Arrays.copyOf(new Object[]{o05.M(startTime), o05.M(endTime)}, 2));
                Intrinsics.checkNotNullExpressionValue(timeStr, "format(...)");
            }
        } else {
            timeStr = o05.M(startTime);
        }
        Intrinsics.checkNotNullExpressionValue(timeStr, "timeStr");
        return timeStr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.heytap.health.operations.timeline.ITimelineCardService
    @Nullable
    public Object Y(long j2, @NotNull Continuation<? super List<TimelineCardItem>> continuation) {
        TimelineCardServiceImpl$getTimelineCardData$1 timelineCardServiceImpl$getTimelineCardData$1;
        TimelineCardServiceImpl timelineCardServiceImpl = this;
        if (continuation instanceof TimelineCardServiceImpl$getTimelineCardData$1) {
            timelineCardServiceImpl$getTimelineCardData$1 = (TimelineCardServiceImpl$getTimelineCardData$1) continuation;
            int i = timelineCardServiceImpl$getTimelineCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineCardServiceImpl$getTimelineCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineCardServiceImpl$getTimelineCardData$1 = new TimelineCardServiceImpl$getTimelineCardData$1(timelineCardServiceImpl, continuation);
            }
        } else {
            timelineCardServiceImpl$getTimelineCardData$1 = new TimelineCardServiceImpl$getTimelineCardData$1(timelineCardServiceImpl, continuation);
        }
        Object objF = timelineCardServiceImpl$getTimelineCardData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineCardServiceImpl$getTimelineCardData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objF);
            StringBuilder sb = new StringBuilder();
            sb.append("getTimelineCardData dayTimestamp=");
            sb.append(j2);
            TimelineCardVM timelineCardVM = new TimelineCardVM();
            timelineCardServiceImpl$getTimelineCardData$1.L$0 = timelineCardServiceImpl;
            timelineCardServiceImpl$getTimelineCardData$1.label = 1;
            objF = timelineCardVM.F(j2, timelineCardServiceImpl$getTimelineCardData$1);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            timelineCardServiceImpl = (TimelineCardServiceImpl) timelineCardServiceImpl$getTimelineCardData$1.L$0;
            ResultKt.throwOnFailure(objF);
        }
        List<TimelineNode> listTake = CollectionsKt___CollectionsKt.take(((TimelineData) objF).c(), 4);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
        for (TimelineNode timelineNode : listTake) {
            Triple<Integer, Long, Integer> tripleC = timelineCardServiceImpl.c(timelineNode);
            int iIntValue = tripleC.component1().intValue();
            long jLongValue = tripleC.component2().longValue();
            arrayList.add(new TimelineCardItem(timelineNode.getDescStr(), iIntValue, (int) jLongValue, tripleC.component3().intValue(), timelineNode.getStartTime(), timelineNode.getEndTime(), timelineNode.getType() == NodeType.SPORT));
        }
        int size = arrayList.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getTimelineCardData result size=");
        sb2.append(size);
        return arrayList;
    }

    public final Triple<Integer, Long, Integer> c(TimelineNode node) {
        switch (b.$EnumSwitchMapping$0[node.getType().ordinal()]) {
            case 1:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_steps), 4278241363L, Integer.valueOf(R$drawable.operation_tl_his_steps));
            case 2:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_sedentary), 4280804712L, Integer.valueOf(R$drawable.operation_tl_his_sedentary));
            case 3:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_steps), 4278241363L, Integer.valueOf(R$drawable.operation_tl_his_steps));
            case 4:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_calories), 4294924066L, Integer.valueOf(R$drawable.operation_tl_his_calories));
            case 5:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_exercise_duration), 4294947584L, Integer.valueOf(R$drawable.operation_tl_his_exercise_duration));
            case 6:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_activity_count), 4280908287L, Integer.valueOf(R$drawable.operation_tl_his_activity_count));
            case 7:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_daily_activity), 4289049016L, Integer.valueOf(R$drawable.operation_tl_his_daily_activity));
            case 8:
                return new Triple<>(Integer.valueOf(node.getIconRes()), 4280804712L, Integer.valueOf(node.getIconRes()));
            case 9:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_sleep), 4282988029L, Integer.valueOf(R$drawable.operation_tl_his_sleep));
            case 10:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_heart_rate), 4294250080L, Integer.valueOf(R$drawable.operation_tl_his_heart_rate));
            case 11:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_blood_oxygen), 4294250080L, Integer.valueOf(R$drawable.operation_tl_his_blood_oxygen));
            case 12:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_ecg), 4294250080L, Integer.valueOf(R$drawable.operation_tl_his_ecg));
            case 13:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_blood_glucose), 4294250080L, Integer.valueOf(R$drawable.operation_tl_his_blood_glucose));
            case 14:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_stress), 4294938880L, Integer.valueOf(R$drawable.operation_tl_his_stress));
            case 15:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_relax), 4280908287L, Integer.valueOf(R$drawable.operation_tl_his_relax));
            case 16:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_60s), 4294250080L, Integer.valueOf(R$drawable.operation_tl_his_60s));
            case 17:
                return new Triple<>(Integer.valueOf(R$drawable.operation_tl_cur_medal), 4280804712L, Integer.valueOf(R$drawable.operation_tl_his_medal));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
