package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@cdb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/v5e;", "Lcom/oplus/aiunit/vision/jf0;", "", "X7", "K2", "w8", "I7", "w2", "q0", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface v5e extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPairAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/PairAbility$Model$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,134:1\n30#2,5:135\n30#2,5:140\n30#2,5:145\n30#2,5:150\n30#2,5:155\n30#2,5:160\n*S KotlinDebug\n*F\n+ 1 PairAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/PairAbility$Model$DefaultImpls\n*L\n36#1:135,5\n44#1:140,5\n54#1:145,5\n63#1:150,5\n72#1:155,5\n80#1:160,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull v5e v5eVar) {
            if (v5eVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) v5eVar;
                return (!deviceModel.K9() || deviceModel.M9() || deviceModel.O9() || deviceModel.T9()) ? false : true;
            }
            throw new RuntimeException(v5eVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull v5e v5eVar) {
            if (v5eVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) v5eVar;
                return (deviceModel.M9() || deviceModel.F9() || deviceModel.G9() || deviceModel.A9()) ? false : true;
            }
            throw new RuntimeException(v5eVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull v5e v5eVar) {
            if (v5eVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) v5eVar;
                return (deviceModel.K9() && !deviceModel.M9() && (!deviceModel.O9() || deviceModel.ha())) || (deviceModel.I9() && deviceModel.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE)) || deviceModel.k0();
            }
            throw new RuntimeException(v5eVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull v5e v5eVar) {
            if (v5eVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) v5eVar;
                return deviceModel.K9() && !deviceModel.M9() && (!deviceModel.O9() || deviceModel.ha());
            }
            throw new RuntimeException(v5eVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull v5e v5eVar) {
            if (v5eVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) v5eVar;
                return (!deviceModel.K9() || deviceModel.M9() || deviceModel.O9() || deviceModel.T9() || deviceModel.X9()) ? false : true;
            }
            throw new RuntimeException(v5eVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull v5e v5eVar) {
            if (v5eVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) v5eVar;
                return !(!deviceModel.K9() || deviceModel.M9() || deviceModel.O9() || deviceModel.T9()) || (deviceModel.I9() && deviceModel.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(v5eVar + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean I7();

    boolean K2();

    boolean X7();

    boolean q0();

    boolean w2();

    boolean w8();
}
