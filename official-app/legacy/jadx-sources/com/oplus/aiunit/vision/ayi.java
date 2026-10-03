package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@cdb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ayi;", "Lcom/oplus/aiunit/vision/jf0;", "", "c", "stress_release"}, k = 1, mv = {1, 8, 0})
public interface ayi extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStressDeviceAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDeviceAbility.kt\ncom/heytap/health/stress/util/StressDeviceAbility$Model$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,31:1\n30#2,5:32\n*S KotlinDebug\n*F\n+ 1 StressDeviceAbility.kt\ncom/heytap/health/stress/util/StressDeviceAbility$Model$DefaultImpls\n*L\n26#1:32,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull ayi ayiVar) {
            if (ayiVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) ayiVar;
                return (deviceModel.K9() && deviceModel.oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) || (deviceModel.I9() && deviceModel.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(ayiVar + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean c();
}
