package com.health.sleep_breath_rate.day.viewmodel;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.BreathRate;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.bdh;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.edh;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.h18;
import com.oplus.aiunit.vision.jdh;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\""}, d2 = {"Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "A", "", "startTime", "endTime", "Lcom/heytap/health/base/livedata/OLiveData;", "", "Lcom/oplus/aiunit/vision/bdh;", "z", "Lcom/oplus/aiunit/vision/jdh;", "j", "Lcom/oplus/aiunit/vision/jdh;", "repository", "Lcom/oplus/aiunit/vision/edh;", "k", "Lkotlin/Lazy;", "y", "()Lcom/oplus/aiunit/vision/edh;", "transform", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "l", "Lcom/heytap/health/base/livedata/OLiveData;", "x", "()Lcom/heytap/health/base/livedata/OLiveData;", "sleepDayStatListObservable", "m", "w", "dataListObservable", "<init>", "()V", "Companion", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRDayViewModel extends BaseViewModel {

    @NotNull
    public final jdh j = new jdh(null, 1, null);

    @NotNull
    public final Lazy k = LazyKt.lazy(new Function0<edh>() { // from class: com.health.sleep_breath_rate.day.viewmodel.SleepBRDayViewModel$transform$2
        @NotNull
        public final edh invoke() {
            return new edh();
        }
    });

    @NotNull
    public final OLiveData<List<BreathRateStat>> l = new OLiveData<>();

    @NotNull
    public final OLiveData<List<bdh>> m = new OLiveData<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "Lcom/heytap/databaseengine/model/BreathRate;", "breathRateList", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayStat;", "sleepDayStatList", "Lcom/oplus/aiunit/vision/bdh;", "b", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T1, T2, T3, R> implements h18 {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public b(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<bdh> a(@NotNull List<BreathRateStat> list, @NotNull List<BreathRate> list2, @NotNull List<SleepDayStat> list3) {
            Intrinsics.checkNotNullParameter(list, "breathRateStatList");
            Intrinsics.checkNotNullParameter(list2, "breathRateList");
            Intrinsics.checkNotNullParameter(list3, "sleepDayStatList");
            return SleepBRDayViewModel.this.y().f(list2, list, list3, this.b, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/oplus/aiunit/vision/bdh;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements b24 {
        public c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull List<bdh> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            SleepBRDayViewModel.this.w().postValue(list);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T, R> implements g18 {
        public static final d<T, R> INSTANCE = new d<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<BreathRateStat> apply(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            m8b.f("SleepBRDayViewModel", "getSleepHeartRateStatList error:" + th.getMessage());
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements b24 {
        public e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull List<BreathRateStat> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            SleepBRDayViewModel.this.x().postValue(list);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void A() {
        this.j.b(1546272000000L, System.currentTimeMillis()).t0(d.INSTANCE).a(new e());
    }

    @NotNull
    public final OLiveData<List<bdh>> w() {
        return this.m;
    }

    @NotNull
    public final OLiveData<List<BreathRateStat>> x() {
        return this.l;
    }

    public final edh y() {
        return (edh) this.k.getValue();
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final OLiveData<List<bdh>> z(long startTime, long endTime) {
        pr8 pr8Var = pr8.INSTANCE;
        long jC = pr8Var.c(startTime);
        long jB = pr8Var.b(endTime);
        ddd.k1(this.j.b(jC, jB), this.j.a(startTime, endTime - 1000), this.j.c(jC, jB), new b(startTime, endTime)).a(new c());
        return this.m;
    }
}
