package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/tg3;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "m3", "G3", "", "R", "w7", "b0", "r3", "r8", "Inner", "b", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public interface tg3 extends if0, ma5 {
    public static final int ALARM_GRAB_VERSION_ASTRA = 130;
    public static final int ALARM_GRAB_VERSION_BAGEL = 70;
    public static final int ALARM_GRAB_VERSION_SPORT = 10;
    public static final int ALARM_GRAB_VERSION_STAR = 150;
    public static final int ALARM_GRAB_VERSION_STARRIVER = 120;
    public static final int ALARM_GRAB_VERSION_WATCH4 = 220;
    public static final int ALARM_RING_SETTINGS_VERSION = 200;

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String TAG = "ClockAbility";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nClockAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClockAbility.kt\ncom/heytap/wearable/watch/clock/ability/ClockAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,120:1\n30#2,5:121\n30#2,5:126\n37#2,5:131\n37#2,5:136\n37#2,5:141\n37#2,5:146\n37#2,5:151\n*S KotlinDebug\n*F\n+ 1 ClockAbility.kt\ncom/heytap/wearable/watch/clock/ability/ClockAbility$DefaultImpls\n*L\n41#1:121,5\n52#1:126,5\n63#1:131,5\n67#1:136,5\n74#1:141,5\n87#1:146,5\n114#1:151,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceModel) {
                if (((DeviceModel) tg3Var).M9()) {
                    a7b.f("ClockAbility", "[dismissClock] --> old type");
                    return 7;
                }
                a7b.f("ClockAbility", "[dismissClock] --> new type");
                return 22;
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int b(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceModel) {
                if (((DeviceModel) tg3Var).M9()) {
                    a7b.f("ClockAbility", "[snoozeClock] --> old type");
                    return 8;
                }
                a7b.f("ClockAbility", "[snoozeClock] --> new type");
                return 23;
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tg3Var;
                return !deviceInfo.ha() && deviceInfo.O9() && ugl.a(deviceInfo.Ma(), 43);
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean d(@NotNull tg3 tg3Var, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(tg3Var, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tg3Var;
                return ((deviceInfo.ja() || deviceInfo.aa()) && ugl.a(deviceInfo.Ma(), 200)) || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tg3Var;
                return deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja();
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) tg3Var;
                return deviceInfo.ca() || deviceInfo.ka() || (deviceInfo.ja() && !deviceInfo.aa() && ugl.a(deviceInfo.Ma(), 120)) || ((deviceInfo.aa() && ugl.a(deviceInfo.Ma(), 130)) || ((deviceInfo.ia() && !deviceInfo.ba() && ugl.a(deviceInfo.Ma(), 150)) || ((deviceInfo.ba() && !deviceInfo.ga() && ugl.a(deviceInfo.Ma(), 70)) || ((deviceInfo.ga() && ugl.a(deviceInfo.Ma(), 10)) || (deviceInfo.X9() && ugl.a(deviceInfo.Ma(), 220))))));
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull tg3 tg3Var) {
            if (tg3Var instanceof DeviceInfo) {
                return tg3Var.J4(4);
            }
            throw new RuntimeException(tg3Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean i(@NotNull tg3 tg3Var) {
            return ma5.a.b(tg3Var);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.tg3$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/tg3$b;", "", "", "TAG", "Ljava/lang/String;", "", "ALARM_GRAB_VERSION_STARRIVER", "I", "ALARM_GRAB_VERSION_ASTRA", "ALARM_GRAB_VERSION_STAR", "ALARM_GRAB_VERSION_BAGEL", "ALARM_GRAB_VERSION_SPORT", "ALARM_GRAB_VERSION_WATCH4", "ALARM_RING_SETTINGS_VERSION", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int ALARM_GRAB_VERSION_ASTRA = 130;
        public static final int ALARM_GRAB_VERSION_BAGEL = 70;
        public static final int ALARM_GRAB_VERSION_SPORT = 10;
        public static final int ALARM_GRAB_VERSION_STAR = 150;
        public static final int ALARM_GRAB_VERSION_STARRIVER = 120;
        public static final int ALARM_GRAB_VERSION_WATCH4 = 220;
        public static final int ALARM_RING_SETTINGS_VERSION = 200;

        @NotNull
        public static final String TAG = "ClockAbility";
        public static final /* synthetic */ Companion a = new Companion();
    }

    int G3();

    boolean R();

    boolean b0();

    int m3();

    boolean r3();

    boolean r8();

    boolean w7();
}
