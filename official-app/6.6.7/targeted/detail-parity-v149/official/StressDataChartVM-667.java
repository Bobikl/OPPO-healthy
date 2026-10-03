package com.heytap.health.hrv.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.storemodel.viewmodel.LastTimeViewModel;
import com.heytap.health.hrv.bean.StressDayBean;
import com.heytap.health.hrv.model.StressDetailRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.kh9;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;", "Lcom/heytap/health/health/storemodel/viewmodel/LastTimeViewModel;", "", "ssoid", "", "K", "", "startTime", "endTime", "D", UserInfo.SEX_FEMALE, ExifInterface.LONGITUDE_EAST, "G", "Lcom/heytap/health/hrv/model/StressDetailRepository;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/hrv/model/StressDetailRepository;", "mRepository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "n", "Landroidx/lifecycle/MutableLiveData;", "_todayStat", "Lcom/heytap/health/hrv/bean/StressDayBean;", "o", "_chartData", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/oplus/aiunit/vision/kh9;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "H", "()Lcom/heytap/health/base/livedata/OLiveData;", "cardDataLive", "q", "Ljava/lang/String;", "Landroidx/lifecycle/LiveData;", "J", "()Landroidx/lifecycle/LiveData;", "todayStat", "I", "chartData", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressDataChartVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDataChartVM.kt\ncom/heytap/health/hrv/viewmodel/StressDataChartVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1855#2,2:234\n*S KotlinDebug\n*F\n+ 1 StressDataChartVM.kt\ncom/heytap/health/hrv/viewmodel/StressDataChartVM\n*L\n185#1:234,2\n*E\n"})
public final class StressDataChartVM extends LastTimeViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final StressDetailRepository mRepository = new StressDetailRepository();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<PhysicalMentalStat> _todayStat = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<StressDayBean> _chartData = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<kh9> cardDataLive = new OLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public String ssoid;

    public StressDataChartVM() {
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
        this.ssoid = ssoid;
        y(new StressDetailRepository());
    }

    public final void D(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataChartVM$fetchCardData$1(this, startTime, endTime, null), 2, null);
    }

    public final void E(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataChartVM$fetchDayDetailData$1(this, startTime, endTime, null), 2, null);
    }

    public final void F(long startTime, long endTime) {
        E(startTime, endTime);
        G(startTime, endTime);
    }

    public final void G(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataChartVM$fetchStatData$1(this, startTime, endTime, null), 2, null);
    }

    @NotNull
    public final OLiveData<kh9> H() {
        return this.cardDataLive;
    }

    @NotNull
    public final LiveData<StressDayBean> I() {
        return this._chartData;
    }

    @NotNull
    public final LiveData<PhysicalMentalStat> J() {
        return this._todayStat;
    }

    public final void K(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
    }
}