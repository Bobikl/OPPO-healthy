package com.heytap.health.settings.watch.sporthealthsettings2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings.bean.m;
import com.oplus.aiunit.model.kdi;
import com.oplus.aiunit.model.pag;
import com.oplus.aiunit.vision.em4;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingBTRepository;", "", "Companion", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SHSettingBTRepository {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u001a\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingBTRepository$Companion;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "msg", "Lcom/oplus/aiunit/vision/ln3;", "", "callback", "", "b", "a", "", "switchType", "deviceMac", "deviceModel", "Lcom/heytap/health/base/utils/AsyncResult;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", "c", "", "SH_SETTING_BT_MSG_TIMEOUT", "J", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull SportHealthSetting item, @Nullable MessageEvent msg) {
            Intrinsics.checkNotNullParameter(item, "item");
            b(item, msg, null);
        }

        @JvmStatic
        public final void b(@NotNull SportHealthSetting item, @Nullable MessageEvent msg, @Nullable ln3<Integer> callback) {
            Intrinsics.checkNotNullParameter(item, "item");
            em4 em4Var = wl4.managerApi;
            if (!em4Var.isCurrentConnected()) {
                if (pag.INSTANCE.d(item)) {
                    if (callback != null) {
                        callback.onResult(0);
                    }
                } else if (callback != null) {
                    callback.onResult(1);
                }
                m8b.f("SHS-SettingBTRepository", "Change device setting fail device disconnect");
                return;
            }
            String currentConnectId = em4Var.getCurrentConnectId();
            if (msg != null) {
                BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new SHSettingBTRepository$Companion$changeDeviceSetting$1(currentConnectId, msg, callback, item, null), 3, (Object) null);
                return;
            }
            if (pag.INSTANCE.d(item)) {
                if (callback != null) {
                    callback.onResult(0);
                }
            } else if (callback != null) {
                callback.onResult(3);
            }
            m8b.f("SHS-SettingBTRepository", "Change device setting fail, msg is null setting = " + item.name());
        }

        @NotNull
        public final AsyncResult<m> c(@NotNull String switchType, @NotNull String deviceMac, @NotNull String deviceModel) {
            Intrinsics.checkNotNullParameter(switchType, "switchType");
            Intrinsics.checkNotNullParameter(deviceMac, "deviceMac");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            return new AsyncResult<>(new SHSettingBTRepository$Companion$loadSettingFromDevice$1(deviceMac, switchType, deviceModel));
        }
    }
}