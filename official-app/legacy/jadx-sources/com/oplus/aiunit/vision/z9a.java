package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/z9a;", "Lcom/oplus/aiunit/vision/if0;", "", UserInfo.SEX_FEMALE, "r6", "n2", "p3", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "Lcom/oplus/aiunit/vision/z9a$b;", "getCurDeviceInfo", "", "version", "isCurDeviceVerLessThan", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface z9a extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInsightAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsightAbility.kt\ncom/heytap/health/insight/device/InsightAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,68:1\n37#2,5:69\n37#2,5:74\n37#2,5:79\n*S KotlinDebug\n*F\n+ 1 InsightAbility.kt\ncom/heytap/health/insight/device/InsightAbility$DefaultImpls\n*L\n14#1:69,5\n19#1:74,5\n37#1:79,5\n*E\n"})
    public static final class a {
        public static DeviceInfo a(z9a z9aVar, UserDeviceInfo userDeviceInfo) {
            String str = "";
            if (userDeviceInfo == null) {
                return new DeviceInfo("", 0);
            }
            String firmwareVersion = userDeviceInfo.getFirmwareVersion();
            Intrinsics.checkNotNullExpressionValue(firmwareVersion, "it.firmwareVersion");
            if (StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion, (CharSequence) "_A.", false, 2, (Object) null)) {
                str = "A";
            } else {
                String firmwareVersion2 = userDeviceInfo.getFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion2, "it.firmwareVersion");
                if (StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion2, (CharSequence) "_C.", false, 2, (Object) null)) {
                    str = "C";
                } else {
                    String firmwareVersion3 = userDeviceInfo.getFirmwareVersion();
                    Intrinsics.checkNotNullExpressionValue(firmwareVersion3, "it.firmwareVersion");
                    if (StringsKt__StringsKt.contains$default((CharSequence) firmwareVersion3, (CharSequence) "_D.", false, 2, (Object) null)) {
                        str = "D";
                    }
                }
            }
            return new DeviceInfo(str, ugl.c(userDeviceInfo.getFirmwareVersion()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(z9a z9aVar, int i) {
            if (!(z9aVar instanceof com.heytap.health.devicemanager.deviceability.DeviceInfo)) {
                throw new RuntimeException(z9aVar + " not is " + com.heytap.health.devicemanager.deviceability.DeviceInfo.class.getCanonicalName());
            }
            com.heytap.health.devicemanager.deviceability.DeviceInfo deviceInfo = (com.heytap.health.devicemanager.deviceability.DeviceInfo) z9aVar;
            if (!deviceInfo.Y9()) {
                return false;
            }
            DeviceInfo deviceInfoA = a(z9aVar, deviceInfo.getDeviceInfo());
            String deviceTag = deviceInfoA.getDeviceTag();
            int iHashCode = deviceTag.hashCode();
            if (iHashCode != 65) {
                if (iHashCode != 67) {
                    if (iHashCode != 68 || !deviceTag.equals("D") || deviceInfoA.getDeviceVersion() >= i) {
                        return false;
                    }
                } else if (!deviceTag.equals("C") || deviceInfoA.getDeviceVersion() >= i) {
                    return false;
                }
            } else if (!deviceTag.equals("A") || deviceInfoA.getDeviceVersion() >= i) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull z9a z9aVar) {
            if (z9aVar instanceof com.heytap.health.devicemanager.deviceability.DeviceInfo) {
                com.heytap.health.devicemanager.deviceability.DeviceInfo deviceInfo = (com.heytap.health.devicemanager.deviceability.DeviceInfo) z9aVar;
                return deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.A9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.F9() || deviceInfo.G9();
            }
            throw new RuntimeException(z9aVar + " not is " + com.heytap.health.devicemanager.deviceability.DeviceInfo.class.getCanonicalName());
        }

        public static boolean d(@NotNull z9a z9aVar) {
            return b(z9aVar, 72);
        }

        public static boolean e(@NotNull z9a z9aVar) {
            return b(z9aVar, 77);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull z9a z9aVar) {
            if (z9aVar instanceof com.heytap.health.devicemanager.deviceability.DeviceInfo) {
                com.heytap.health.devicemanager.deviceability.DeviceInfo deviceInfo = (com.heytap.health.devicemanager.deviceability.DeviceInfo) z9aVar;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.Y9() || deviceInfo.ia() || deviceInfo.ja();
            }
            throw new RuntimeException(z9aVar + " not is " + com.heytap.health.devicemanager.deviceability.DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.z9a$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/z9a$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "deviceTag", "b", "I", "()I", "deviceVersion", "<init>", "(Ljava/lang/String;I)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DeviceInfo {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String deviceTag;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int deviceVersion;

        public DeviceInfo(@NotNull String deviceTag, int i) {
            Intrinsics.checkNotNullParameter(deviceTag, "deviceTag");
            this.deviceTag = deviceTag;
            this.deviceVersion = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeviceTag() {
            return this.deviceTag;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDeviceVersion() {
            return this.deviceVersion;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) other;
            return Intrinsics.areEqual(this.deviceTag, deviceInfo.deviceTag) && this.deviceVersion == deviceInfo.deviceVersion;
        }

        public int hashCode() {
            return (this.deviceTag.hashCode() * 31) + Integer.hashCode(this.deviceVersion);
        }

        @NotNull
        public String toString() {
            return "DeviceInfo(deviceTag=" + this.deviceTag + ", deviceVersion=" + this.deviceVersion + ")";
        }
    }

    boolean F();

    boolean n2();

    boolean p3();

    boolean r6();
}
