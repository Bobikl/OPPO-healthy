package com.heytap.health.daily.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.bean.DailyActivityDetailBean;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.q04;
import com.oplus.aiunit.vision.vq4;
import com.oplus.aiunit.vision.zr8;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bJ \u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bJ\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/heytap/health/daily/viewmodel/DailyActivityDetailViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "ssoid", "", "y", "Ljava/time/LocalDate;", "date", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "detailBeanMutableLiveData", "C", "Lcom/heytap/health/daily/bean/DailyActivityDayBean;", "dayData", acl.KEY_B, "", "z", "Lcom/oplus/aiunit/vision/vq4;", "j", "Lcom/oplus/aiunit/vision/vq4;", "mRepository", "", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/MutableLiveData;", "stepSportModeData", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "x", "()I", "A", "(I)V", "<init>", "()V", "ChartType", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class DailyActivityDetailViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final vq4 mRepository = new vq4();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final MutableLiveData<Integer> stepSportModeData = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/daily/viewmodel/DailyActivityDetailViewModel$ChartType;", "", "(Ljava/lang/String;I)V", "CALORIE", "STEP", q04.CARD_STATUS_ACTIVE, "TIME", "daily_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ChartType {
        CALORIE,
        STEP,
        ACTIVE,
        TIME
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "value", "", "a", "(Lcom/heytap/health/daily/bean/DailyActivityDetailBean;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements b24 {
        public final /* synthetic */ MutableLiveData<DailyActivityDetailBean> i;

        public a(MutableLiveData<DailyActivityDetailBean> mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.b24
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@Nullable DailyActivityDetailBean dailyActivityDetailBean) {
            this.i.postValue(dailyActivityDetailBean);
        }
    }

    public final void A(int i) {
        fdg.w().S("daily_step_sport_mode", i);
        this.stepSportModeData.postValue(Integer.valueOf(i));
    }

    public final void B(@Nullable LocalDate date, @NotNull MutableLiveData<DailyActivityDayBean> dayData) {
        Intrinsics.checkNotNullParameter(dayData, "dayData");
        if (date == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), zr8.INSTANCE.e(), null, new DailyActivityDetailViewModel$updateDayStat$1(this, date, dayData, null), 2, null);
    }

    public final void C(@Nullable LocalDate date, @NotNull MutableLiveData<DailyActivityDetailBean> detailBeanMutableLiveData) {
        Intrinsics.checkNotNullParameter(detailBeanMutableLiveData, "detailBeanMutableLiveData");
        if (date == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.a aVarA = this.mRepository.i(date, x()).a(new a(detailBeanMutableLiveData));
        Intrinsics.checkNotNullExpressionValue(aVarA, "detailBeanMutableLiveDat…          )\n            }");
        u(aVarA);
    }

    public final int x() {
        return fdg.w().z("daily_step_sport_mode", -2);
    }

    public final void y(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.mRepository.l(ssoid);
    }

    public final boolean z(LocalDate date) {
        if (date == null) {
            return false;
        }
        return !(Intrinsics.areEqual(this.mRepository.k(), cn.c().getSsoid()) ^ true) && (fdg.w().z("daily_step_sport_mode", -2) == -2) && Intrinsics.areEqual(date, LocalDate.now());
    }
}