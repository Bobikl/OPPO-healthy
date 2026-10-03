package com.oplus.aiunit.model;

import com.heytap.health.vision.deviceability.DeviceModel;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.vision.reb;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@reb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/ap5;", "Lcom/oplus/aiunit/vision/bg0;", BuildConfig.VERSION_NAME, "F3", "N7", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface ap5 extends bg0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceSettingsAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/DeviceSettingsAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,33:1\n30#2,5:34\n30#2,5:39\n*S KotlinDebug\n*F\n+ 1 DeviceSettingsAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/DeviceSettingsAbility$DefaultImpls\n*L\n26#1:34,5\n30#1:39,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull ap5 ap5Var) {
            if (ap5Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) ap5Var;
                return deviceModel.la() || deviceModel.ga() || deviceModel.ma() || deviceModel.ea();
            }
            throw new RuntimeException(ap5Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull ap5 ap5Var) {
            if (ap5Var instanceof DeviceModel) {
                return !((DeviceModel) ap5Var).k0();
            }
            throw new RuntimeException(ap5Var + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean F3();

    boolean N7();
}