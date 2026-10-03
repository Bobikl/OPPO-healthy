package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.weather.module.WeatherModule;
import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/yjl;", "Lcom/oplus/aiunit/vision/if0;", "", "str", "B8", "", "R6", "", "a8", "w6", "f5", "l6", "q", Node.I_TAG, "p8", "V5", "P7", "J6", "u", "language", "u1", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public interface yjl extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWeatherAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherAbility.kt\ncom/heytap/weather/ability/WeatherAbility$DeviceInfo$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,131:1\n30#2,5:132\n30#2,5:137\n37#2,5:142\n30#2,5:147\n37#2,5:152\n37#2,5:157\n37#2,5:162\n37#2,5:167\n37#2,5:172\n37#2,5:177\n37#2,5:182\n37#2,5:187\n37#2,5:192\n37#2,5:197\n*S KotlinDebug\n*F\n+ 1 WeatherAbility.kt\ncom/heytap/weather/ability/WeatherAbility$DeviceInfo$DefaultImpls\n*L\n33#1:132,5\n42#1:137,5\n54#1:142,5\n61#1:147,5\n65#1:152,5\n69#1:157,5\n73#1:162,5\n77#1:167,5\n94#1:172,5\n98#1:177,5\n102#1:182,5\n109#1:187,5\n116#1:192,5\n127#1:197,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static String a(@NotNull yjl yjlVar, @Nullable String str) {
            if (yjlVar instanceof DeviceModel) {
                return ((DeviceModel) yjlVar).F9() ? j1j.d(str, 32) : str;
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                if (deviceInfo.A9() || deviceInfo.F9()) {
                    return 16;
                }
                return (deviceInfo.fa() || deviceInfo.E9() || deviceInfo.ea()) ? 17 : 0;
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int c(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) yjlVar;
                if (deviceModel.fa() || deviceModel.E9()) {
                    return v9g.x(WeatherModule.SP_NAME).z("KEY_WEATHER_UNIT", 0);
                }
                return 0;
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return deviceInfo.A9() || deviceInfo.fa() || deviceInfo.E9();
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                return ((DeviceInfo) yjlVar).ea();
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                return ((DeviceInfo) yjlVar).F9();
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return deviceInfo.M9() && deviceInfo.Oa();
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return (deviceInfo.ja() && deviceInfo.Sa(240)) || (deviceInfo.ka() && deviceInfo.Sa(130)) || (deviceInfo.ca() && deviceInfo.Sa(130));
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceModel) {
                return ((DeviceModel) yjlVar).A9();
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull yjl yjlVar, @Nullable String str) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return (deviceInfo.K9() && !deviceInfo.Oa() && Intrinsics.areEqual(str, fml.INSTANCE.e())) ? false : true;
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.A9() || deviceInfo.fa() || deviceInfo.F9() || (deviceInfo.T9() && deviceInfo.Pa())) ? false : true;
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                return ((DeviceInfo) yjlVar).qa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE);
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean m(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return deviceInfo.T9() || deviceInfo.ha();
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean n(@NotNull yjl yjlVar) {
            if (yjlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) yjlVar;
                return (deviceInfo.M9() || deviceInfo.O9() || deviceInfo.A9() || deviceInfo.fa() || deviceInfo.F9() || deviceInfo.E9() || deviceInfo.T9()) ? false : true;
            }
            throw new RuntimeException(yjlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    @Nullable
    String B8(@Nullable String str);

    boolean J6();

    boolean P7();

    int R1();

    int R6();

    boolean V5();

    boolean a8();

    boolean f5();

    boolean l6();

    boolean p8();

    boolean q();

    boolean u();

    boolean u1(@Nullable String language);

    boolean w6();
}
