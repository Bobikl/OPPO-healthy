package com.heytap.health.sleep.week.viewmodel;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.newsleep.SleepAdvice;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.week.model.SleepWeekLawTransform;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.be1;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.gih;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mfh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.wuh;
import com.oplus.aiunit.vision.yuh;
import com.oplus.aiunit.vision.zeh;
import com.oplus.aiunit.vision.zuh;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007J$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010.\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00103\u001a\b\u0012\u0004\u0012\u00020/0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R(\u00108\u001a\b\u0012\u0004\u0012\u0002040&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010)\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R(\u0010=\u001a\b\u0012\u0004\u0012\u0002090&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-¨\u0006B"}, d2 = {"Lcom/heytap/health/sleep/week/viewmodel/SleepWeekViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "ssoid", "", UserInfo.SEX_FEMALE, "", "startTime", "endTime", "", "sortOrder", "y", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "sleepDataStatList", "x", "z", "Lcom/oplus/aiunit/vision/yuh;", "j", "Lkotlin/Lazy;", ExifInterface.LONGITUDE_EAST, "()Lcom/oplus/aiunit/vision/yuh;", "sleepWeekDataRepository", "Lcom/oplus/aiunit/vision/gih;", MapSchema.FIELD_NAME_KEY, "C", "()Lcom/oplus/aiunit/vision/gih;", "sleepDayDataRepository", "Lcom/oplus/aiunit/vision/zuh;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/zuh;", "transform", "Lcom/heytap/health/sleep/week/model/SleepWeekLawTransform;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/sleep/week/model/SleepWeekLawTransform;", "sleepWeekLawTransform", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/oplus/aiunit/vision/zeh;", "n", "Lcom/heytap/health/base/livedata/OLiveData;", "A", "()Lcom/heytap/health/base/livedata/OLiveData;", "setChartObservable", "(Lcom/heytap/health/base/livedata/OLiveData;)V", "chartObservable", "Lcom/oplus/aiunit/vision/mfh;", "o", acl.KEY_B, "setSleepAverageDataObservable", "sleepAverageDataObservable", "Lcom/oplus/aiunit/vision/wuh;", LogFieldKey.PROCESS_NAME_KEY, "D", "setSleepWeekCardDataObservable", "sleepWeekCardDataObservable", "", "q", "getSleepRCBeanObservable", "setSleepRCBeanObservable", "sleepRCBeanObservable", "<init>", "()V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepWeekViewModel extends BaseViewModel {

    @NotNull
    public static final String TAG = "SleepWeekViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy sleepWeekDataRepository = LazyKt__LazyJVMKt.lazy(new Function0<yuh>() { // from class: com.heytap.health.sleep.week.viewmodel.SleepWeekViewModel$sleepWeekDataRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final yuh invoke() {
            return new yuh(null, 1, 0 == true ? 1 : 0);
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepDayDataRepository = LazyKt__LazyJVMKt.lazy(new Function0<gih>() { // from class: com.heytap.health.sleep.week.viewmodel.SleepWeekViewModel$sleepDayDataRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final gih invoke() {
            return new gih();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public zuh transform = new zuh();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public SleepWeekLawTransform sleepWeekLawTransform = new SleepWeekLawTransform();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public OLiveData<zeh> chartObservable = new OLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public OLiveData<mfh> sleepAverageDataObservable = new OLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public OLiveData<wuh> sleepWeekCardDataObservable = new OLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public OLiveData<Object> sleepRCBeanObservable = new OLiveData<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/SleepDataStat;", "it", "Lcom/oplus/aiunit/vision/zeh;", "a", "(Ljava/util/List;)Lcom/oplus/aiunit/vision/zeh;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements g18 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zeh apply(@NotNull List<SleepDataStat> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int size = it.size();
            StringBuilder sb = new StringBuilder();
            sb.append("map:");
            sb.append(size);
            return SleepWeekViewModel.this.transform.a(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/oplus/aiunit/vision/zeh;", "a", "(Ljava/lang/Throwable;)Lcom/oplus/aiunit/vision/zeh;"}, k = 3, mv = {1, 8, 0})
    public static final class c<T, R> implements g18 {
        public static final c<T, R> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zeh apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            m8b.f(SleepWeekViewModel.TAG, "fetchSleepHistoryStatData error:" + it.getMessage());
            return new zeh(new ArrayList(), true, 0L, 0L);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/zeh;", "it", "", "a", "(Lcom/oplus/aiunit/vision/zeh;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements b24 {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.b24
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull zeh it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SleepWeekViewModel.this.A().postValue(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDayBeanList", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "sleepAdviceList", "Lcom/oplus/aiunit/vision/wuh;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/oplus/aiunit/vision/wuh;"}, k = 3, mv = {1, 8, 0})
    public static final class e<T1, T2, R> implements be1 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f6966j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f6967l;
        public final /* synthetic */ long m;

        public e(long j2, long j3, long j4, long j5) {
            this.f6966j = j2;
            this.k = j3;
            this.f6967l = j4;
            this.m = j5;
        }

        @Override // com.oplus.aiunit.vision.be1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wuh apply(@NotNull List<SleepDayBean> sleepDayBeanList, @NotNull List<SleepAdvice> sleepAdviceList) {
            Intrinsics.checkNotNullParameter(sleepDayBeanList, "sleepDayBeanList");
            Intrinsics.checkNotNullParameter(sleepAdviceList, "sleepAdviceList");
            int size = sleepDayBeanList.size();
            StringBuilder sb = new StringBuilder();
            sb.append("fetchSleepLawData map:");
            sb.append(size);
            return SleepWeekViewModel.this.sleepWeekLawTransform.b(this.f6966j, this.k, this.f6967l, this.m, sleepDayBeanList, sleepAdviceList);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/oplus/aiunit/vision/wuh;", "a", "(Ljava/lang/Throwable;)Lcom/oplus/aiunit/vision/wuh;"}, k = 3, mv = {1, 8, 0})
    public static final class f<T, R> implements g18 {
        public static final f<T, R> INSTANCE = new f<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wuh apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            m8b.f(SleepWeekViewModel.TAG, "fetchSleepLawData error:" + it.getMessage());
            return new wuh();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/wuh;", "it", "", "a", "(Lcom/oplus/aiunit/vision/wuh;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g<T> implements b24 {
        public g() {
        }

        @Override // com.oplus.aiunit.vision.b24
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull wuh it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SleepWeekViewModel.this.D().postValue(it);
        }
    }

    @NotNull
    public final OLiveData<zeh> A() {
        return this.chartObservable;
    }

    @NotNull
    public final OLiveData<mfh> B() {
        return this.sleepAverageDataObservable;
    }

    public final gih C() {
        return (gih) this.sleepDayDataRepository.getValue();
    }

    @NotNull
    public final OLiveData<wuh> D() {
        return this.sleepWeekCardDataObservable;
    }

    public final yuh E() {
        return (yuh) this.sleepWeekDataRepository.getValue();
    }

    public final void F(@Nullable String ssoid) {
        yuh yuhVarE = E();
        if (ssoid == null) {
            ssoid = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
        }
        yuhVarE.c(ssoid);
    }

    public final void x(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<? extends SleepDataStat> sleepDataStatList) {
        Intrinsics.checkNotNullParameter(sleepDataStatList, "sleepDataStatList");
        this.sleepAverageDataObservable.postValue(this.transform.e(chartLowestVisibleTime, chartHighestVisibleTime, sleepDataStatList));
    }

    @SuppressLint({"CheckResult"})
    public final void y(long startTime, long endTime, int sortOrder) {
        E().a(4, startTime, endTime, sortOrder).j0(new b()).t0(c.INSTANCE).a(new d());
    }

    @SuppressLint({"CheckResult"})
    public final void z(long chartLowestVisibleTime, long chartHighestVisibleTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(7L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(8L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long epochMilli3 = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartHighestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(7L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        pr8 pr8Var = pr8.INSTANCE;
        a aVarA = ddd.j1(C().z(pr8Var.o(epochMilli), pr8Var.o(chartHighestVisibleTime), 0, false), E().b(epochMilli2, chartHighestVisibleTime), new e(epochMilli, epochMilli3, chartLowestVisibleTime, chartHighestVisibleTime)).t0(f.INSTANCE).a(new g());
        Intrinsics.checkNotNullExpressionValue(aVarA, "@SuppressLint(\"CheckResu…posable(disposable)\n    }");
        u(aVarA);
    }
}