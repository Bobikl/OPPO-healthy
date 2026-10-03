package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u000b\u0010\t\u001a\u00020\b8BX\u0082\u0004¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/mhl;", "Lcom/oplus/aiunit/vision/nhl;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "a3", "M", "S7", "", "BAND_SUPPORT_WE_CHAT_PAY_SUPPORT_VERSION", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public interface mhl extends nhl, if0, ma5 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWeChatAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeChatAbility.kt\ncom/heytap/health/devicemanagerimpl/ability/WeChatAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,128:1\n37#2,5:129\n37#2,5:134\n37#2,5:139\n*S KotlinDebug\n*F\n+ 1 WeChatAbility.kt\ncom/heytap/health/devicemanagerimpl/ability/WeChatAbility$Info$DefaultImpls\n*L\n66#1:129,5\n94#1:134,5\n112#1:139,5\n*E\n"})
    public static final class a {
        public static int a(mhl mhlVar) {
            return 984;
        }

        public static boolean b(@NotNull mhl mhlVar, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(mhlVar, appIds);
        }

        public static boolean c(@NotNull mhl mhlVar) {
            return ma5.a.b(mhlVar);
        }

        public static boolean d(@NotNull mhl mhlVar) {
            return nhl.a.a(mhlVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull mhl mhlVar) {
            if (!(mhlVar instanceof DeviceInfo)) {
                throw new RuntimeException(mhlVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) mhlVar;
            if (!mhlVar.e6()) {
                return false;
            }
            if (deviceInfo.X9()) {
                return deviceInfo.Sa(175);
            }
            if (deviceInfo.ba()) {
                return deviceInfo.Sa(20);
            }
            if (deviceInfo.ia()) {
                return deviceInfo.Sa(91);
            }
            return true;
        }

        public static boolean f(@NotNull mhl mhlVar) {
            return nhl.a.b(mhlVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull mhl mhlVar) {
            if (mhlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) mhlVar;
                if (!mhlVar.o6()) {
                    return false;
                }
                if (deviceInfo.T9()) {
                    return deviceInfo.Sa(77);
                }
                return (deviceInfo.X9() && deviceInfo.Sa(175)) ? false : true;
            }
            throw new RuntimeException(mhlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean h(@NotNull mhl mhlVar) {
            return nhl.a.c(mhlVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull mhl mhlVar) {
            if (!(mhlVar instanceof DeviceInfo)) {
                throw new RuntimeException(mhlVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) mhlVar;
            if (!mhlVar.c5()) {
                return false;
            }
            if (deviceInfo.A9()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (ugl.b(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null) < a(mhlVar)) {
                    return false;
                }
            } else if (deviceInfo.T9()) {
                return mhlVar.M();
            }
            return true;
        }
    }

    boolean M();

    boolean S7();

    boolean a3();
}
