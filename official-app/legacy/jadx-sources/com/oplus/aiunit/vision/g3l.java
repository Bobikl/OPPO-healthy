package com.oplus.aiunit.vision;

import android.content.pm.ApplicationInfo;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCar;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/g3l;", "Lcom/oplus/aiunit/vision/if0;", "", "r5", "support", "hasCar", "firstBind", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "c0", "t8", "N4", "t3", "y", "", "D6", "P2", "voiceassistant_release"}, k = 1, mv = {1, 8, 0})
public interface g3l extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nVoiceAssistantAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceAssistantAbility.kt\ncom/heytap/health/voiceassistant/VoiceAssistantAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,107:1\n37#2,5:108\n37#2,5:113\n37#2,5:118\n37#2,5:123\n37#2,5:128\n37#2,5:133\n37#2,5:138\n37#2,5:143\n*S KotlinDebug\n*F\n+ 1 VoiceAssistantAbility.kt\ncom/heytap/health/voiceassistant/VoiceAssistantAbility$DefaultImpls\n*L\n33#1:108,5\n37#1:113,5\n58#1:118,5\n75#1:123,5\n79#1:128,5\n83#1:133,5\n92#1:138,5\n104#1:143,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static MessageEvent a(@NotNull g3l g3lVar, boolean z, boolean z2, boolean z3) {
            if (g3lVar instanceof DeviceInfo) {
                DeviceBreenoProto$BreenoCar deviceBreenoProto$BreenoCarBuild = DeviceBreenoProto$BreenoCar.newBuilder().setSupport(z).setHasCar(z2).setFirstBind(z3).build();
                return ((DeviceInfo) g3lVar).ea() ? new MessageEvent(270, 13, deviceBreenoProto$BreenoCarBuild.toByteArray()) : new MessageEvent(19, 3, deviceBreenoProto$BreenoCarBuild.toByteArray());
            }
            throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String b(@NotNull g3l g3lVar) {
            if (g3lVar instanceof DeviceInfo) {
                return g3lVar.N4() ? "10061" : "10004";
            }
            throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull g3l g3lVar) {
            ApplicationInfo applicationInfo;
            if (!(g3lVar instanceof DeviceInfo)) {
                throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            try {
                applicationInfo = b78.a().getPackageManager().getApplicationInfo("com.oplus.ovoicemanager.wakeup", 128);
            } catch (Exception e2) {
                a7b.b("VAM", "isPhoneSupportOvs: " + e2.getMessage());
                applicationInfo = null;
            }
            return (applicationInfo != null ? applicationInfo.metaData : null) != null && applicationInfo.metaData.getBoolean("com.oplus.ovoicemanager.wakeup:iot_recognize") && applicationInfo.metaData.getInt("ovs_ovoicemanager_sdk_version", 0) >= 1600;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull g3l g3lVar) {
            if (g3lVar instanceof DeviceInfo) {
                return ((DeviceInfo) g3lVar).K9() && gl4.managerApi.isStubModule();
            }
            throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull g3l g3lVar) {
            if (g3lVar instanceof DeviceInfo) {
                return ((DeviceInfo) g3lVar).fa();
            }
            throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0027  */
        /* JADX WARN: Code duplicated, block: B:16:0x002d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0033  */
        /* JADX WARN: Code duplicated, block: B:21:0x003f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull g3l g3lVar) {
            UserDeviceInfo deviceInfo;
            if (!(g3lVar instanceof DeviceInfo)) {
                throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo2 = (DeviceInfo) g3lVar;
            if (!deviceInfo2.Ra()) {
                if (deviceInfo2.ea()) {
                    UserDeviceInfo deviceInfo3 = deviceInfo2.getDeviceInfo();
                    if (!ugl.e(deviceInfo3 != null ? deviceInfo3.getFirmwareVersion() : null, 60)) {
                        if (!deviceInfo2.ja()) {
                            deviceInfo = deviceInfo2.getDeviceInfo();
                            if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 180)) {
                                if (!deviceInfo2.ka()) {
                                }
                            }
                        } else if (!deviceInfo2.ka()) {
                        }
                    }
                } else if (!deviceInfo2.ja()) {
                    deviceInfo = deviceInfo2.getDeviceInfo();
                    if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 180)) {
                        if (!deviceInfo2.ka()) {
                        }
                    }
                } else if (!deviceInfo2.ka() || deviceInfo2.ca()) {
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull g3l g3lVar) {
            if (g3lVar instanceof DeviceInfo) {
                return ((DeviceInfo) g3lVar).qa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
            }
            throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull g3l g3lVar) {
            if (g3lVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) g3lVar;
                return deviceInfo.fa() || deviceInfo.ea();
            }
            throw new RuntimeException(g3lVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    @NotNull
    String D6();

    boolean N4();

    boolean P2();

    @NotNull
    MessageEvent c0(boolean support, boolean hasCar, boolean firstBind);

    boolean r5();

    boolean t3();

    boolean t8();

    boolean y();
}
