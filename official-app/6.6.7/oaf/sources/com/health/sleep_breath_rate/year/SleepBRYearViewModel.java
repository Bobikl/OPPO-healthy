package com.health.sleep_breath_rate.year;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.oplus.aiunit.vision.adh;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qdh;
import com.oplus.aiunit.vision.wdh;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/health/sleep_breath_rate/year/SleepBRYearViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "ssoId", "", "z", "", "startTime", "endTime", "chartVisibleTime", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/oplus/aiunit/vision/adh;", "w", "j", "Lcom/heytap/health/base/livedata/OLiveData;", "x", "()Lcom/heytap/health/base/livedata/OLiveData;", "setChartObservable", "(Lcom/heytap/health/base/livedata/OLiveData;)V", "chartObservable", "Lcom/oplus/aiunit/vision/qdh;", "k", "Lcom/oplus/aiunit/vision/qdh;", "weekDataRepository", "Lcom/oplus/aiunit/vision/wdh;", "l", "Lkotlin/Lazy;", "y", "()Lcom/oplus/aiunit/vision/wdh;", "transform", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRYearViewModel extends BaseViewModel {
    public static final int $stable = 8;

    @NotNull
    public OLiveData<adh> j = new OLiveData<>();

    @NotNull
    public final qdh k = new qdh(null, 1, null);

    @NotNull
    public final Lazy l = LazyKt.lazy(new Function0<wdh>() { // from class: com.health.sleep_breath_rate.year.SleepBRYearViewModel$transform$2
        @NotNull
        public final wdh invoke() {
            return new wdh();
        }
    });

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "it", "Lcom/oplus/aiunit/vision/adh;", "a", "(Ljava/util/List;)Lcom/oplus/aiunit/vision/adh;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements g18 {
        public final /* synthetic */ long j;

        public a(long j) {
            this.j = j;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final adh apply(@NotNull List<BreathRateStat> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return SleepBRYearViewModel.this.y().a(list, this.j);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/oplus/aiunit/vision/adh;", "a", "(Ljava/lang/Throwable;)Lcom/oplus/aiunit/vision/adh;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements g18 {
        public static final b<T, R> INSTANCE = new b<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final adh apply(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            m8b.f("SleepBRWeekViewModel", "fetchSleepBRStatData error:" + th.getMessage());
            return new adh(new ArrayList(), true, 0L, 0L);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/adh;", "it", "", "a", "(Lcom/oplus/aiunit/vision/adh;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements b24 {
        public c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull adh adhVar) {
            Intrinsics.checkNotNullParameter(adhVar, "it");
            SleepBRYearViewModel.this.x().postValue(adhVar);
        }
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final OLiveData<adh> w(long startTime, long endTime, long chartVisibleTime) {
        io.reactivex.rxjava3.disposables.a aVarA = this.k.a(startTime, endTime, 6).j0(new a(chartVisibleTime)).t0(b.INSTANCE).a(new c());
        Intrinsics.checkNotNullExpressionValue(aVarA, "@SuppressLint(\"CheckResu…urn chartObservable\n    }");
        u(aVarA);
        return this.j;
    }

    @NotNull
    public final OLiveData<adh> x() {
        return this.j;
    }

    public final wdh y() {
        return (wdh) this.l.getValue();
    }

    public final void z(@Nullable String ssoId) {
        qdh qdhVar = this.k;
        if (ssoId == null) {
            ssoId = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoId, "getAccountManager().ssoid");
        }
        qdhVar.b(ssoId);
    }
}
