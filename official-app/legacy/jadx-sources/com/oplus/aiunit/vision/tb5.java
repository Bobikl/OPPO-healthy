package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/tb5;", "Lcom/oplus/aiunit/vision/if0;", "", "kotlin.jvm.PlatformType", "F4", "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
public interface tb5 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceCategoryAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCategoryAbility.kt\ncom/heytap/device/ability/DeviceCategoryAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,107:1\n37#2,5:108\n*S KotlinDebug\n*F\n+ 1 DeviceCategoryAbility.kt\ncom/heytap/device/ability/DeviceCategoryAbility$DefaultImpls\n*L\n27#1:108,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static String a(@NotNull tb5 tb5Var) {
            if (!(tb5Var instanceof DeviceInfo)) {
                throw new RuntimeException(tb5Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) tb5Var;
            if (deviceInfo.ca()) {
                return op5.WATCH_COCO;
            }
            if (deviceInfo.ka()) {
                return op5.WATCH_TAYCAN;
            }
            if (deviceInfo.ea()) {
                return op5.WATCH_COLUMBUS;
            }
            if (deviceInfo.k0()) {
                return op5.WATCH_iWATCH;
            }
            if (deviceInfo.ga()) {
                return op5.WATCH_OPPO_SPORT;
            }
            if (deviceInfo.aa()) {
                return op5.WATCH_ASTRA;
            }
            if (deviceInfo.ja()) {
                return op5.WATCH_STAR_RIVER;
            }
            if (deviceInfo.ba()) {
                return op5.WATCH_BAGEL;
            }
            if (deviceInfo.ia()) {
                return op5.WATCH_STAR;
            }
            if (deviceInfo.Y9()) {
                return op5.WATCH4PRO;
            }
            if (deviceInfo.X9()) {
                return op5.WATCH4;
            }
            if (deviceInfo.ha()) {
                return op5.WATCH3SE;
            }
            if (deviceInfo.U9()) {
                return op5.WATCH3PRO;
            }
            if (deviceInfo.T9()) {
                return op5.WATCH3;
            }
            if (deviceInfo.E9()) {
                return op5.BANDHSB;
            }
            if (deviceInfo.A9()) {
                return op5.BAND;
            }
            if (deviceInfo.fa()) {
                return op5.BAND2;
            }
            if (deviceInfo.O9()) {
                return op5.WATCH2;
            }
            if (deviceInfo.G9()) {
                return op5.REALME_GT;
            }
            return deviceInfo.F9() ? op5.WATCH_GT : op5.WATCH;
        }
    }

    String F4();
}
