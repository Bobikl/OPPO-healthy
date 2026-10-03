package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings.bean.u;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.model.QuietHeartRateSetting;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.vision.jrc;
import com.oplus.aiunit.vision.th7;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0002R\u001a\u0010\u0017\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/QuietHRSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/wbf;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "heartRateType", "enable", "value", "y0", "(IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v0", "w", "I", "w0", "()I", "TYPE_HEART_RATE_HIGH", "x", "x0", "TYPE_HEART_RATE_LOW", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class QuietHRSettingViewModel extends SHSettingBaseViewModel<QuietHeartRateSetting> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final int TYPE_HEART_RATE_HIGH;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final int TYPE_HEART_RATE_LOW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuietHRSettingViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
        this.TYPE_HEART_RATE_HIGH = 1;
        this.TYPE_HEART_RATE_LOW = 2;
    }

    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super QuietHeartRateSetting> continuation) {
        return v0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt.linkedSetOf(new SportHealthSetting[]{SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE, SportHealthSetting.QUIET_RATE_VALUE, SportHealthSetting.QUIET_RATE_LOW_VALUE});
    }

    public final QuietHeartRateSetting v0() {
        u quietHeartRate = h0().B().getQuietHeartRate();
        return new QuietHeartRateSetting(quietHeartRate.getQuietRateNotificationEnable(), quietHeartRate.getQuietHeartRateValue(), quietHeartRate.getQuietHeartRateLowValue());
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final int getTYPE_HEART_RATE_HIGH() {
        return this.TYPE_HEART_RATE_HIGH;
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final int getTYPE_HEART_RATE_LOW() {
        return this.TYPE_HEART_RATE_LOW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y0(int i, boolean z, int i2, @NotNull Continuation<? super Boolean> continuation) {
        QuietHRSettingViewModel$setQuietRateRemind$1 quietHRSettingViewModel$setQuietRateRemind$1;
        if (continuation instanceof QuietHRSettingViewModel$setQuietRateRemind$1) {
            quietHRSettingViewModel$setQuietRateRemind$1 = (QuietHRSettingViewModel$setQuietRateRemind$1) continuation;
            int i3 = quietHRSettingViewModel$setQuietRateRemind$1.label;
            if ((i3 & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                quietHRSettingViewModel$setQuietRateRemind$1.label = i3 - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                quietHRSettingViewModel$setQuietRateRemind$1 = new QuietHRSettingViewModel$setQuietRateRemind$1(this, continuation);
            }
        } else {
            quietHRSettingViewModel$setQuietRateRemind$1 = new QuietHRSettingViewModel$setQuietRateRemind$1(this, continuation);
        }
        Object objC = quietHRSettingViewModel$setQuietRateRemind$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = quietHRSettingViewModel$setQuietRateRemind$1.label;
        if (i4 != 0) {
            if (i4 == 1) {
                this = (QuietHRSettingViewModel) quietHRSettingViewModel$setQuietRateRemind$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i4 != 2) {
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
        if (i == this.TYPE_HEART_RATE_HIGH) {
            wbg.INSTANCE.P(i2);
        } else {
            wbg.INSTANCE.Q(i2);
        }
        HashMap map = new HashMap();
        SportHealthSetting sportHealthSetting = SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE;
        String strE = byk.e(z);
        Intrinsics.checkNotNullExpressionValue(strE, "boolToString(enable)");
        map.put(sportHealthSetting, strE);
        if (i == this.TYPE_HEART_RATE_HIGH) {
            SportHealthSetting sportHealthSetting2 = SportHealthSetting.QUIET_RATE_VALUE;
            String strO = byk.o(i2);
            Intrinsics.checkNotNullExpressionValue(strO, "intToString(value)");
            map.put(sportHealthSetting2, strO);
            SportHealthSetting sportHealthSetting3 = SportHealthSetting.QUIET_RATE_LOW_VALUE;
            String strO2 = byk.o(h0().B().getQuietHeartRate().getQuietHeartRateLowValue());
            Intrinsics.checkNotNullExpressionValue(strO2, "intToString(settingViewM…e.quietHeartRateLowValue)");
            map.put(sportHealthSetting3, strO2);
        } else {
            SportHealthSetting sportHealthSetting4 = SportHealthSetting.QUIET_RATE_LOW_VALUE;
            String strO3 = byk.o(i2);
            Intrinsics.checkNotNullExpressionValue(strO3, "intToString(value)");
            map.put(sportHealthSetting4, strO3);
            SportHealthSetting sportHealthSetting5 = SportHealthSetting.QUIET_RATE_VALUE;
            String strO4 = byk.o(h0().B().getQuietHeartRate().getQuietHeartRateValue());
            Intrinsics.checkNotNullExpressionValue(strO4, "intToString(settingViewM…Rate.quietHeartRateValue)");
            map.put(sportHealthSetting5, strO4);
        }
        MutableLiveData<Integer> mutableLiveDataW = h0().w(sportHealthSetting, map);
        quietHRSettingViewModel$setQuietRateRemind$1.L$0 = this;
        quietHRSettingViewModel$setQuietRateRemind$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataW, quietHRSettingViewModel$setQuietRateRemind$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        quietHRSettingViewModel$setQuietRateRemind$1.L$0 = null;
        quietHRSettingViewModel$setQuietRateRemind$1.label = 2;
        objC = this.s0((Integer) objC, quietHRSettingViewModel$setQuietRateRemind$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}