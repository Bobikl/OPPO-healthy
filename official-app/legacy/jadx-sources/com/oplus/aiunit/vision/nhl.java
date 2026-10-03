package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@cdb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/nhl;", "Lcom/oplus/aiunit/vision/jf0;", "", "c5", "o6", "e6", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public interface nhl extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWeChatAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeChatAbility.kt\ncom/heytap/health/devicemanagerimpl/ability/WeChatAbility$Mode$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,128:1\n30#2,5:129\n30#2,5:134\n30#2,5:139\n*S KotlinDebug\n*F\n+ 1 WeChatAbility.kt\ncom/heytap/health/devicemanagerimpl/ability/WeChatAbility$Mode$DefaultImpls\n*L\n35#1:129,5\n43#1:134,5\n51#1:139,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull nhl nhlVar) {
            if (nhlVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) nhlVar;
                return (!deviceModel.K9() || deviceModel.M9() || deviceModel.O9() || deviceModel.T9()) ? false : true;
            }
            throw new RuntimeException(nhlVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull nhl nhlVar) {
            if (nhlVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) nhlVar;
                return deviceModel.T9() || deviceModel.X9() || deviceModel.ea();
            }
            throw new RuntimeException(nhlVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull nhl nhlVar) {
            if (nhlVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) nhlVar;
                return deviceModel.A9() || deviceModel.fa() || deviceModel.E9() || deviceModel.T9() || deviceModel.X9();
            }
            throw new RuntimeException(nhlVar + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean c5();

    boolean e6();

    boolean o6();
}
