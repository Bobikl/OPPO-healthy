package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000b\u0010\u000b\u001a\u00020\n8BX\u0082\u0004¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/j9i;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "I0", "Y2", "b1", "m6", "Q1", "u4", "", "TAG", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public interface j9i extends if0, ma5 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportAbility.kt\ncom/heytap/sports/ability/SportAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n37#2,2:167\n40#2,2:170\n37#2,5:172\n37#2,5:177\n37#2,5:182\n37#2,5:187\n37#2,5:192\n37#2,5:197\n37#2,5:202\n37#2,5:207\n37#2,5:212\n1#3:169\n*S KotlinDebug\n*F\n+ 1 SportAbility.kt\ncom/heytap/sports/ability/SportAbility$DefaultImpls\n*L\n31#1:167,2\n31#1:170,2\n82#1:172,5\n88#1:177,5\n101#1:182,5\n108#1:187,5\n116#1:192,5\n139#1:197,5\n143#1:202,5\n153#1:207,5\n162#1:212,5\n*E\n"})
    public static final class a {
        public static boolean a(@NotNull j9i j9iVar, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(j9iVar, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull j9i j9iVar) {
            if (j9iVar instanceof DeviceInfo) {
                return j9iVar.J4(18);
            }
            throw new RuntimeException(j9iVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean c(@NotNull j9i j9iVar) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull j9i j9iVar) {
            if (j9iVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) j9iVar;
                return (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) || (deviceInfo.I9() && deviceInfo.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(j9iVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull j9i j9iVar) {
            if (!(j9iVar instanceof DeviceInfo)) {
                throw new RuntimeException(j9iVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) j9iVar;
            if (!deviceInfo.Na()) {
                return false;
            }
            if (deviceInfo.T9()) {
                if (!deviceInfo.Pa()) {
                    return false;
                }
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (!ugl.e(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, 90)) {
                    return false;
                }
            } else {
                if (!deviceInfo.X9() && !deviceInfo.ia() && !deviceInfo.ba() && !deviceInfo.ga()) {
                    if (j9iVar.I0()) {
                        return j9iVar.J4(11);
                    }
                    return false;
                }
                if (!deviceInfo.Pa() || !j9iVar.J4(11)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull j9i j9iVar) {
            if (j9iVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) j9iVar;
                return (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE)) || (deviceInfo.ja() && deviceInfo.Sa(240)) || (deviceInfo.aa() && deviceInfo.Sa(240));
            }
            throw new RuntimeException(j9iVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull j9i j9iVar) {
            if (j9iVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) j9iVar;
                return (deviceInfo.ka() && deviceInfo.Sa(180)) || (deviceInfo.ca() && deviceInfo.Sa(180));
            }
            throw new RuntimeException(j9iVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean h(@NotNull j9i j9iVar) {
            return ma5.a.b(j9iVar);
        }
    }

    boolean I0();

    boolean Q1();

    boolean Y2();

    boolean b1();

    boolean m6();

    boolean u4();
}
