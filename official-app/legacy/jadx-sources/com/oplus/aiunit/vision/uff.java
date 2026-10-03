package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/uff;", "Lcom/oplus/aiunit/vision/if0;", "", "o4", "R2", "B6", "O0", "Z2", "recommend_release"}, k = 1, mv = {1, 8, 0})
public interface uff extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecommendStateAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendStateAbility.kt\ncom/heytap/sports/recommend/ability/RecommendStateAbility$Model$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,55:1\n37#2,5:56\n30#2,5:61\n37#2,5:66\n37#2,5:71\n37#2,5:76\n*S KotlinDebug\n*F\n+ 1 RecommendStateAbility.kt\ncom/heytap/sports/recommend/ability/RecommendStateAbility$Model$DefaultImpls\n*L\n28#1:56,5\n34#1:61,5\n39#1:66,5\n46#1:71,5\n51#1:76,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull uff uffVar) {
            if (uffVar instanceof DeviceInfo) {
                return !((DeviceInfo) uffVar).ja();
            }
            throw new RuntimeException(uffVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull uff uffVar) {
            if (uffVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) uffVar;
                return (deviceModel.K9() && deviceModel.oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) || (deviceModel.I9() && deviceModel.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(uffVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull uff uffVar) {
            if (uffVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) uffVar;
                return (deviceInfo.ka() && deviceInfo.Sa(180)) || (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE));
            }
            throw new RuntimeException(uffVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull uff uffVar) {
            if (uffVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) uffVar;
                return (deviceInfo.ja() && deviceInfo.Sa(240)) || (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE)) || (deviceInfo.I9() && deviceInfo.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(uffVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull uff uffVar) {
            if (uffVar instanceof DeviceInfo) {
                return !((DeviceInfo) uffVar).aa();
            }
            throw new RuntimeException(uffVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean B6();

    boolean O0();

    boolean R2();

    boolean Z2();

    boolean o4();
}
