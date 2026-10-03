package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings.bean.e0;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.vision.jrc;
import com.oplus.aiunit.vision.th7;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SportHeartRateViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/e0;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "", "value", "v0", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportHeartRateViewModel extends SHSettingBaseViewModel<e0> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportHeartRateViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
    }

    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super e0> continuation) {
        return h0().B().getSportsHeartRate();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE, SportHealthSetting.HIGH_RATE_VALUE});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v0(boolean z, int i, @NotNull Continuation<? super Boolean> continuation) {
        SportHeartRateViewModel$setSportHeartRateRemind$1 sportHeartRateViewModel$setSportHeartRateRemind$1;
        if (continuation instanceof SportHeartRateViewModel$setSportHeartRateRemind$1) {
            sportHeartRateViewModel$setSportHeartRateRemind$1 = (SportHeartRateViewModel$setSportHeartRateRemind$1) continuation;
            int i2 = sportHeartRateViewModel$setSportHeartRateRemind$1.label;
            if ((i2 & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                sportHeartRateViewModel$setSportHeartRateRemind$1.label = i2 - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                sportHeartRateViewModel$setSportHeartRateRemind$1 = new SportHeartRateViewModel$setSportHeartRateRemind$1(this, continuation);
            }
        } else {
            sportHeartRateViewModel$setSportHeartRateRemind$1 = new SportHeartRateViewModel$setSportHeartRateRemind$1(this, continuation);
        }
        Object objC = sportHeartRateViewModel$setSportHeartRateRemind$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sportHeartRateViewModel$setSportHeartRateRemind$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (SportHeartRateViewModel) sportHeartRateViewModel$setSportHeartRateRemind$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        if (!jrc.c()) {
            th7.l(R.string.settings_device_network_disconnect);
            return Boxing.boxBoolean(false);
        }
        wbg.INSTANCE.K(i);
        SHSettingViewModel sHSettingViewModelH0 = h0();
        SportHealthSetting sportHealthSetting = SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE;
        MutableLiveData<Integer> mutableLiveDataW = sHSettingViewModelH0.w(sportHealthSetting, MapsKt.mapOf(new Pair[]{TuplesKt.to(sportHealthSetting, byk.e(z)), TuplesKt.to(SportHealthSetting.HIGH_RATE_VALUE, byk.o(i))}));
        sportHeartRateViewModel$setSportHeartRateRemind$1.L$0 = this;
        sportHeartRateViewModel$setSportHeartRateRemind$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, sportHeartRateViewModel$setSportHeartRateRemind$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        SportHeartRateViewModel$setSportHeartRateRemind$2 sportHeartRateViewModel$setSportHeartRateRemind$2 = new SportHeartRateViewModel$setSportHeartRateRemind$2(this, null);
        sportHeartRateViewModel$setSportHeartRateRemind$1.L$0 = null;
        sportHeartRateViewModel$setSportHeartRateRemind$1.label = 2;
        objC = this.t0((Integer) objC, sportHeartRateViewModel$setSportHeartRateRemind$2, sportHeartRateViewModel$setSportHeartRateRemind$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}