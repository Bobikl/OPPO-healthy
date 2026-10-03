package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/og7;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "H", com.alipay.sdk.m.x.c.d, "Inner", "b", "fitness_impl_release"}, k = 1, mv = {1, 8, 0})
public interface og7 extends if0, ma5 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String VERSION_RX_SUPPORT = "W301CN_11_A.45";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFitAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitAbility.kt\ncom/heytap/sporthealth/fit/business/ability/FitAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n37#2,2:62\n40#2,2:65\n37#2,5:67\n1#3:64\n*S KotlinDebug\n*F\n+ 1 FitAbility.kt\ncom/heytap/sporthealth/fit/business/ability/FitAbility$DefaultImpls\n*L\n30#1:62,2\n30#1:65,2\n56#1:67,5\n*E\n"})
    public static final class a {
        public static boolean a(@NotNull og7 og7Var, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(og7Var, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull og7 og7Var) {
            String firmwareVersion;
            if (!(og7Var instanceof DeviceInfo)) {
                throw new RuntimeException(og7Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) og7Var;
            if (!deviceInfo.C0() || !deviceInfo.Na() || deviceInfo.Ra()) {
                return false;
            }
            if (deviceInfo.Oa()) {
                return og7Var.v2();
            }
            if (!deviceInfo.G9()) {
                if (!deviceInfo.F9()) {
                    return og7Var.J4(11);
                }
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (deviceInfo2 == null || (firmwareVersion = deviceInfo2.getFirmwareVersion()) == null) {
                    return false;
                }
                Intrinsics.checkNotNullExpressionValue(firmwareVersion, "firmwareVersion");
                if (firmwareVersion.compareTo("W301CN_11_A.45") < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean c(@NotNull og7 og7Var) {
            return ma5.a.b(og7Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull og7 og7Var) {
            if (og7Var instanceof DeviceInfo) {
                return ((DeviceInfo) og7Var).oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE);
            }
            throw new RuntimeException(og7Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.og7$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/og7$b;", "", "", "VERSION_RX_SUPPORT", "Ljava/lang/String;", "<init>", "()V", "fitness_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String VERSION_RX_SUPPORT = "W301CN_11_A.45";
        public static final /* synthetic */ Companion a = new Companion();
    }

    boolean H();

    boolean v2();
}
