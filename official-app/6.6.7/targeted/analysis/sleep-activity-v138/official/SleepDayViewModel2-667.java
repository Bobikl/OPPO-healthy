package com.heytap.health.sleep.day.viewmodel;

import android.text.format.DateFormat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.core.provider.adapter.open.SleepDataAdapter;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.model.SleepDayDataRepository2;
import com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.ich;
import com.oplus.aiunit.vision.lch;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.neh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qfh;
import com.oplus.aiunit.vision.zr8;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\bF\u0010GJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010*0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030*028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030*028\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u00107R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020B028\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u00107¨\u0006I"}, d2 = {"Lcom/heytap/health/sleep/day/viewmodel/SleepDayViewModel2;", "Lcom/heytap/health/base/base/BaseViewModel;", "", BloodGlucoseWarningActivity.SSOID, "", "S", "", "startTime", "endTime", "", "isFromFamily", "R", "N", "C", "J", "K", "Lcom/heytap/health/sleep/day/model/SleepDayDataRepository2;", "j", "Lkotlin/Lazy;", "Q", "()Lcom/heytap/health/sleep/day/model/SleepDayDataRepository2;", "sleepDayDataRepository", "Lcom/oplus/aiunit/vision/qfh;", MapSchema.FIELD_NAME_KEY, SecureGcmConstants.MESSAGE_KEY, "()Lcom/oplus/aiunit/vision/qfh;", "sleepDataTransform", "Lcom/oplus/aiunit/vision/neh;", LogFieldKey.LEVEL_KEY, "M", "()Lcom/oplus/aiunit/vision/neh;", "sleepCalibrationTransform", "Lcom/oplus/aiunit/vision/lch;", LogFieldKey.MESSAGE_KEY, "L", "()Lcom/oplus/aiunit/vision/lch;", "sleepAssembleTransform", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/reactivex/rxjava3/disposables/a;", "n", "Ljava/util/concurrent/atomic/AtomicReference;", "fetchLastDataTimeDisposable", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "o", "prefetchStatsAfterLastFetch", "Lkotlinx/coroutines/Job;", LogFieldKey.PROCESS_NAME_KEY, "Lkotlinx/coroutines/Job;", "onlySleepDayJob", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "q", "Lcom/heytap/health/base/livedata/OLiveData;", "H", "()Lcom/heytap/health/base/livedata/OLiveData;", "observableSleepDayListData", "r", "G", "observableSleepDataStatList", "s", ExifInterface.LONGITUDE_EAST, "observableLastDataTime", "t", "I", "observableSleepDayListData2", "Lcom/oplus/aiunit/vision/ich;", "u", UserInfo.SEX_FEMALE, "observableSleepAssembleBean", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDayViewModel2 extends BaseViewModel {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Job onlySleepDayJob;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy sleepDayDataRepository = LazyKt__LazyJVMKt.lazy(new Function0<SleepDayDataRepository2>() { // from class: com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2$sleepDayDataRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SleepDayDataRepository2 invoke() {
            return new SleepDayDataRepository2();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepDataTransform = LazyKt__LazyJVMKt.lazy(new Function0<qfh>() { // from class: com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2$sleepDataTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final qfh invoke() {
            return new qfh();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy sleepCalibrationTransform = LazyKt__LazyJVMKt.lazy(new Function0<neh>() { // from class: com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2$sleepCalibrationTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final neh invoke() {
            return new neh();
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepAssembleTransform = LazyKt__LazyJVMKt.lazy(new Function0<lch>() { // from class: com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2$sleepAssembleTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final lch invoke() {
            return new lch();
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<a> fetchLastDataTimeDisposable = new AtomicReference<>(null);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<List<SleepDataStat>> prefetchStatsAfterLastFetch = new AtomicReference<>(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<SleepDayBean>> observableSleepDayListData = new OLiveData<>();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<SleepDataStat>> observableSleepDataStatList = new OLiveData<>();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<Long> observableLastDataTime = new OLiveData<>();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<SleepDayBean>> observableSleepDayListData2 = new OLiveData<>();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<ich> observableSleepAssembleBean = new OLiveData<>();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jc\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/sleep/day/viewmodel/SleepDayViewModel2$Companion;", "", "", BloodGlucoseWarningActivity.SSOID, "", "startTime", "endTime", "", "isFromFamily", "skipUserProfile", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "prefetchedSleepStatList", "skipPhoneSleep", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "a", "(Ljava/lang/String;JJZZLjava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "TIME_OUT", "J", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Object a(@Nullable String str, long j2, long j3, boolean z, boolean z2, @Nullable List<SleepDataStat> list, boolean z3, @NotNull Continuation<? super List<SleepDayBean>> continuation) {
            return CoroutineScopeKt.coroutineScope(new SleepDayViewModel2$Companion$getSleepDayData$2(str, j2, j3, z3, z2, z, list, null), continuation);
        }
    }

    public static final void D(SleepDayViewModel2 this$0, List stats) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stats, "stats");
        List list = stats;
        if (!list.isEmpty()) {
            this$0.prefetchStatsAfterLastFetch.set(new ArrayList(list));
            this$0.observableLastDataTime.postValue(Long.valueOf(pr8.INSTANCE.g(((SleepDataStat) stats.get(0)).getDate())));
        } else {
            this$0.prefetchStatsAfterLastFetch.set(null);
            this$0.observableLastDataTime.postValue(Long.MIN_VALUE);
        }
    }

    public static final void O(SleepDayViewModel2 this$0, List value) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(value, "value");
        this$0.observableSleepDataStatList.postValue(value);
    }

    public final void C() {
        a andSet = this.fetchLastDataTimeDisposable.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
        a aVarA = Q().Z().a(new b24() { // from class: com.oplus.aiunit.vision.sjh
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                SleepDayViewModel2.D(this.i, (List) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarA, "sleepDayDataRepository.f…         }\n            })");
        this.fetchLastDataTimeDisposable.set(aVarA);
        u(aVarA);
    }

    @NotNull
    public final OLiveData<Long> E() {
        return this.observableLastDataTime;
    }

    @NotNull
    public final OLiveData<ich> F() {
        return this.observableSleepAssembleBean;
    }

    @NotNull
    public final OLiveData<List<SleepDataStat>> G() {
        return this.observableSleepDataStatList;
    }

    @NotNull
    public final OLiveData<List<SleepDayBean>> H() {
        return this.observableSleepDayListData;
    }

    @NotNull
    public final OLiveData<List<SleepDayBean>> I() {
        return this.observableSleepDayListData2;
    }

    public final void J(long startTime, long endTime) {
        Job job = this.onlySleepDayJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.onlySleepDayJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), zr8.INSTANCE.b(SleepDataAdapter.GET_SLEEP_DATA_ITEM), null, new SleepDayViewModel2$getOnlySleepDayData$1(this, startTime, endTime, null), 2, null);
    }

    public final void K(long startTime, long endTime) {
        pr8 pr8Var = pr8.INSTANCE;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), zr8.INSTANCE.b(SleepDataAdapter.GET_SLEEP_DATA_ITEM), null, new SleepDayViewModel2$getSleepAssembleData$1(this, pr8Var.c(pr8Var.B(startTime, 1L)), pr8Var.b(endTime), startTime, endTime, null), 2, null);
    }

    public final lch L() {
        return (lch) this.sleepAssembleTransform.getValue();
    }

    public final neh M() {
        return (neh) this.sleepCalibrationTransform.getValue();
    }

    public final void N(long startTime, long endTime) {
        m8b.f("SleepDayViewModel2", "getSleepDataStatList startTime:" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", startTime)) + " ,endTime:" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", endTime)));
        a aVarA = Q().s0(startTime, endTime).a(new b24() { // from class: com.oplus.aiunit.vision.rjh
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                SleepDayViewModel2.O(this.i, (List) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarA, "sleepDayDataRepository.f…lue(value)\n            })");
        u(aVarA);
    }

    public final qfh P() {
        return (qfh) this.sleepDataTransform.getValue();
    }

    public final SleepDayDataRepository2 Q() {
        return (SleepDayDataRepository2) this.sleepDayDataRepository.getValue();
    }

    public final void R(long startTime, long endTime, boolean isFromFamily) {
        pr8 pr8Var = pr8.INSTANCE;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), zr8.INSTANCE.b(SleepDataAdapter.GET_SLEEP_DATA_ITEM), null, new SleepDayViewModel2$getSleepDayList$1(this, pr8Var.c(pr8Var.B(startTime, 1L)), pr8Var.b(endTime), startTime, endTime, isFromFamily, pr8Var.c(startTime), null), 2, null);
    }

    public final void S(@NotNull String ssoId) {
        Intrinsics.checkNotNullParameter(ssoId, "ssoId");
        Q().g1(ssoId);
    }
}