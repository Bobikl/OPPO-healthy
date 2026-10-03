package com.heytap.health.operation.timeline;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayFrgData;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayStat;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.operation.R$string;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.health.sleep.snore.SnoreWebViewActivity;
import com.oplus.aiunit.vision.TimelineData;
import com.oplus.aiunit.vision.arh;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ebe;
import com.oplus.aiunit.vision.enj;
import com.oplus.aiunit.vision.g0k;
import com.oplus.aiunit.vision.i1i;
import com.oplus.aiunit.vision.j0k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.qqh;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.x05;
import com.oplus.onet.IONetService;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0006J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineSleep;", "Lcom/oplus/aiunit/vision/g0k;", "", "dayTimestamp", "Lcom/oplus/aiunit/vision/f0k;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "snoreResult", "Lcom/heytap/databaseengine/model/UserInfo;", ebe.KEY_USER_INFO, "", "totalSleepTime", "", "Lcom/oplus/aiunit/vision/enj;", UTraceSQLiteHelperKt.COL_TAGS, "", "f", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayFrgData;", "i", "j", b2n.f, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/arh;", "Lkotlin/Lazy;", b2n.g, "()Lcom/oplus/aiunit/vision/arh;", "sleepTransform", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TimelineSleep extends g0k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepTransform = LazyKt__LazyJVMKt.lazy(new Function0<arh>() { // from class: com.heytap.health.operation.timeline.TimelineSleep$sleepTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final arh invoke() {
            return new arh();
        }
    });
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.g0k
    @Nullable
    public Object a(long j2, @NotNull Continuation<? super TimelineData> continuation) {
        return CoroutineScopeKt.coroutineScope(new TimelineSleep$fetchData$2(j2, this, null), continuation);
    }

    public final void f(List<? extends OsaResultBean> snoreResult, UserInfo userInfo, int totalSleepTime, final long dayTimestamp, List<enj> tags) {
        int years = TextUtils.isEmpty(userInfo != null ? userInfo.getBirthday() : null) ? 28 : LocalDateTime.ofInstant(Instant.ofEpochMilli(x05.i(userInfo != null ? userInfo.getBirthday() : null, "yyyy-MM-dd")), ZoneId.systemDefault()).toLocalDate().until((ChronoLocalDate) LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toLocalDate()).getYears();
        if (totalSleepTime >= 240) {
            SleepDayBean sleepDayBean = new SleepDayBean();
            sleepDayBean.setAge(years);
            sleepDayBean.setTotalSleepTime(totalSleepTime);
            if (h().b(sleepDayBean) >= 0) {
                tags.add(new qqh(new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineSleep$fetchTags$1
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
                        x0.d().b("/sleep/SleepHistoryActivity").withString("date", String.valueOf(o05.B(o05.D(dayTimestamp)))).navigation();
                    }
                }));
            }
        }
        boolean z = false;
        byte osaLevel = 0;
        byte osaLevel2 = 0;
        for (OsaResultBean osaResultBean : snoreResult) {
            if (osaResultBean.getVersion() == 1) {
                if (osaResultBean.getOsaLevel() > osaLevel2) {
                    osaLevel2 = osaResultBean.getOsaLevel();
                }
                z = true;
            } else if (osaResultBean.getOsaLevel() > osaLevel) {
                osaLevel = osaResultBean.getOsaLevel();
            }
        }
        if (z) {
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineSleep$fetchTags$apneaRiskOnClick$1
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
                    String dayStr = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(dayTimestamp));
                    SnoreWebViewActivity.a aVar = SnoreWebViewActivity.Companion;
                    Context contextP = op.n().p();
                    if (contextP == null) {
                        contextP = b78.a();
                    }
                    Intrinsics.checkNotNullExpressionValue(contextP, "ActivityUtils.getInstanc…ionHolder.getAppContext()");
                    Intrinsics.checkNotNullExpressionValue(dayStr, "dayStr");
                    aVar.b(contextP, dayStr);
                }
            };
            if (osaLevel2 == 1) {
                tags.add(new i1i(qtf.l(R$string.operation_tl_tag_apnea_risk_low), function0));
                return;
            } else if (osaLevel2 == 2) {
                tags.add(new i1i(qtf.l(R$string.operation_tl_tag_apnea_risk_medium), function0));
                return;
            } else {
                if (osaLevel2 != 3) {
                    return;
                }
                tags.add(new i1i(qtf.l(R$string.operation_tl_tag_apnea_risk_high), function0));
                return;
            }
        }
        Function0<Unit> function1 = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineSleep$fetchTags$snoreOnClick$1
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
                mq8 mq8Var = mq8.INSTANCE;
                long jN = mq8Var.n(System.currentTimeMillis());
                SnoreHistoryActivity.Companion companion = SnoreHistoryActivity.INSTANCE;
                Context contextP = op.n().p();
                if (contextP == null) {
                    contextP = b78.a();
                }
                Intrinsics.checkNotNullExpressionValue(contextP, "ActivityUtils.getInstanc…ionHolder.getAppContext()");
                companion.b(contextP, 1546257600000L, jN, mq8Var.o(dayTimestamp), mq8Var.n(dayTimestamp));
            }
        };
        if (osaLevel == 1) {
            tags.add(new i1i(qtf.l(R$string.home_tl_tag_snore_low), function1));
        } else if (osaLevel == 2) {
            tags.add(new i1i(qtf.l(R$string.home_tl_tag_snore_medium), function1));
        } else {
            if (osaLevel != 3) {
                return;
            }
            tags.add(new i1i(qtf.l(R$string.home_tl_tag_snore_high), function1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Continuation<? super UserInfo> continuation) {
        TimelineSleep$fetchUserInfo$1 timelineSleep$fetchUserInfo$1;
        if (continuation instanceof TimelineSleep$fetchUserInfo$1) {
            timelineSleep$fetchUserInfo$1 = (TimelineSleep$fetchUserInfo$1) continuation;
            int i = timelineSleep$fetchUserInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSleep$fetchUserInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSleep$fetchUserInfo$1 = new TimelineSleep$fetchUserInfo$1(this, continuation);
            }
        } else {
            timelineSleep$fetchUserInfo$1 = new TimelineSleep$fetchUserInfo$1(this, continuation);
        }
        Object objC = timelineSleep$fetchUserInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSleep$fetchUserInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            lbd<CommonBackBean> userInfo = SportHealthDataAPI.getInstance().getUserInfo(um.c().getSsoid());
            Intrinsics.checkNotNullExpressionValue(userInfo, "getInstance().getUserInfo(ssoid)");
            timelineSleep$fetchUserInfo$1.label = 1;
            objC = RxExtendKt.c(userInfo, timelineSleep$fetchUserInfo$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().getUserInfo(ssoid).awaitOnce()");
        List<Object> listB = j0k.b((CommonBackBean) objC);
        if (!(!listB.isEmpty())) {
            return null;
        }
        Object obj = listB.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.databaseengine.model.UserInfo");
        return (UserInfo) obj;
    }

    public final arh h() {
        return (arh) this.sleepTransform.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j2, Continuation<? super List<SleepDayFrgData>> continuation) {
        TimelineSleep$queryDaySleepStat$1 timelineSleep$queryDaySleepStat$1;
        if (continuation instanceof TimelineSleep$queryDaySleepStat$1) {
            timelineSleep$queryDaySleepStat$1 = (TimelineSleep$queryDaySleepStat$1) continuation;
            int i = timelineSleep$queryDaySleepStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSleep$queryDaySleepStat$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSleep$queryDaySleepStat$1 = new TimelineSleep$queryDaySleepStat$1(this, continuation);
            }
        } else {
            timelineSleep$queryDaySleepStat$1 = new TimelineSleep$queryDaySleepStat$1(this, continuation);
        }
        Object objC = timelineSleep$queryDaySleepStat$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSleep$queryDaySleepStat$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_setPassiveCallbackState);
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            dataReadOption.setCount(1);
            dataReadOption.setSortOrder(1);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineSleep$queryDaySleepStat$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineSleep$queryDaySleepStat$1);
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
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.sleepdaystat.SleepDayStat>");
        return listB.isEmpty() ^ true ? ((SleepDayStat) listB.get(0)).getSleepDayFrgDataList() : CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j2, Continuation<? super List<? extends OsaResultBean>> continuation) {
        TimelineSleep$querySnoreOsaResult$1 timelineSleep$querySnoreOsaResult$1;
        if (continuation instanceof TimelineSleep$querySnoreOsaResult$1) {
            timelineSleep$querySnoreOsaResult$1 = (TimelineSleep$querySnoreOsaResult$1) continuation;
            int i = timelineSleep$querySnoreOsaResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timelineSleep$querySnoreOsaResult$1.label = i - Integer.MIN_VALUE;
            } else {
                timelineSleep$querySnoreOsaResult$1 = new TimelineSleep$querySnoreOsaResult$1(this, continuation);
            }
        } else {
            timelineSleep$querySnoreOsaResult$1 = new TimelineSleep$querySnoreOsaResult$1(this, continuation);
        }
        Object objC = timelineSleep$querySnoreOsaResult$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timelineSleep$querySnoreOsaResult$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOption dataReadOption = new DataReadOption();
            n05 n05Var = n05.INSTANCE;
            long jD = n05Var.d(j2);
            long jC = n05Var.c(j2);
            dataReadOption.setSsoid(um.c().getSsoid());
            dataReadOption.setDataTable(1030);
            dataReadOption.setDataReadType("osa_incomplete_result");
            dataReadOption.setStartTime(jD);
            dataReadOption.setEndTime(jC);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(readOption)");
            timelineSleep$querySnoreOsaResult$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, timelineSleep$querySnoreOsaResult$1);
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
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.snore.OsaResultBean>");
        return listB;
    }
}
