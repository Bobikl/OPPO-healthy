package com.heytap.health.sunshine.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.health.storemodel.viewmodel.LastTimeViewModel;
import com.heytap.health.sunshine.constant.SunshineConstant;
import com.heytap.health.sunshine.model.SunshineRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.h15;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/heytap/health/sunshine/viewmodel/SunshineStatChartVM;", "Lcom/heytap/health/health/storemodel/viewmodel/LastTimeViewModel;", "", "ssoid", "", "H", "C", "", "intakeIU", "", "timestampMillis", "G", "D", ExifInterface.LONGITUDE_EAST, "Lcom/heytap/health/sunshine/model/SunshineRepository;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/sunshine/model/SunshineRepository;", "mRepository", "n", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "o", "Landroidx/lifecycle/MutableLiveData;", "_dayStatList", LogFieldKey.PROCESS_NAME_KEY, "_monthStatList", "Landroidx/lifecycle/LiveData;", UserInfo.SEX_FEMALE, "()Landroidx/lifecycle/LiveData;", "dayStatList", "<init>", "()V", "Companion", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class SunshineStatChartVM extends LastTimeViewModel {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final SunshineRepository mRepository;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String ssoid;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<SunshineStat>> _dayStatList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<SunshineStat>> _monthStatList;
    public static final int $stable = 8;

    public SunshineStatChartVM() {
        SunshineRepository sunshineRepository = new SunshineRepository();
        this.mRepository = sunshineRepository;
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
        this.ssoid = ssoid;
        y(sunshineRepository);
        this._dayStatList = new MutableLiveData<>();
        this._monthStatList = new MutableLiveData<>();
    }

    public final void C() {
        D();
        E();
    }

    public final void D() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SunshineStatChartVM$fetchDayData$1(this, h15.x(SunshineConstant.INSTANCE.a()), System.currentTimeMillis(), null), 2, null);
    }

    public final void E() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SunshineStatChartVM$fetchMonthData$1(this, h15.x(SunshineConstant.INSTANCE.a()), System.currentTimeMillis(), null), 2, null);
    }

    @NotNull
    public final LiveData<List<SunshineStat>> F() {
        return this._dayStatList;
    }

    public final void G(int intakeIU, long timestampMillis) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SunshineStatChartVM$saveVitaminDIntakeRecord$1(this, intakeIU, timestampMillis, null), 2, null);
    }

    public final void H(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.mRepository.j(ssoid);
    }
}