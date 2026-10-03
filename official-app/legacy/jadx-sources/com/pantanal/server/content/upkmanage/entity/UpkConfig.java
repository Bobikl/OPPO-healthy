package com.pantanal.server.content.upkmanage.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkConfig;", "", "Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime;", "runtime", "Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime;", "getRuntime", "()Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime;", "<init>", "()V", "Companion", "a", "Runtime", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class UpkConfig {

    @NotNull
    private static final String CAR = "car";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DESKTOP = "desktop";

    @NotNull
    private static final String NOTIFICATION = "notification";

    @Nullable
    private final Runtime runtime;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime;", "", "()V", "supportHardware", "Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware;", "getSupportHardware", "()Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware;", "SupportHardware", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Runtime {

        @SerializedName("support-hardware")
        @Nullable
        private final SupportHardware supportHardware;

        @Keep
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware;", "", "()V", "device", "", "Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware$Device;", "getDevice", "()[Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware$Device;", "[Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware$Device;", "Device", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class SupportHardware {

            @Nullable
            private final Device[] device;

            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$Runtime$SupportHardware$Device;", "", "()V", "type", "", "getType", "()Ljava/lang/String;", "useTemplate", "getUseTemplate", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Device {

                @Nullable
                private final String type;

                @SerializedName("use-template")
                @Nullable
                private final String useTemplate;

                @Nullable
                public final String getType() {
                    return this.type;
                }

                @Nullable
                public final String getUseTemplate() {
                    return this.useTemplate;
                }
            }

            @Nullable
            public final Device[] getDevice() {
                return this.device;
            }
        }

        @Nullable
        public final SupportHardware getSupportHardware() {
            return this.supportHardware;
        }
    }

    /* JADX INFO: renamed from: com.pantanal.server.content.upkmanage.entity.UpkConfig$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkConfig$a;", "", "Lcom/pantanal/server/content/upkmanage/entity/UpkConfig;", "upkConfig", "", "a", "", "CAR", "Ljava/lang/String;", "DESKTOP", "NOTIFICATION", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:63:0x0096  */
        public final int a(@Nullable UpkConfig upkConfig) {
            Runtime.SupportHardware supportHardware;
            Runtime.SupportHardware.Device[] device;
            Runtime.SupportHardware.Device device2;
            boolean z;
            Runtime.SupportHardware supportHardware2;
            Runtime.SupportHardware.Device[] device3;
            boolean z2;
            if (upkConfig == null) {
                return -1;
            }
            Runtime runtime = upkConfig.getRuntime();
            Runtime.SupportHardware.Device device4 = null;
            if (runtime == null || (supportHardware = runtime.getSupportHardware()) == null || (device = supportHardware.getDevice()) == null) {
                device2 = null;
                break;
            }
            int length = device.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    device2 = null;
                    break;
                }
                device2 = device[i];
                String type = device2.getType();
                if (type != null && StringsKt__StringsJVMKt.equals(type, "car", true)) {
                    String useTemplate = device2.getUseTemplate();
                    if (useTemplate != null && StringsKt__StringsKt.contains((CharSequence) useTemplate, (CharSequence) UpkConfig.DESKTOP, true)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (device2 != null) {
                return 0;
            }
            Runtime runtime2 = upkConfig.getRuntime();
            if (runtime2 != null && (supportHardware2 = runtime2.getSupportHardware()) != null && (device3 = supportHardware2.getDevice()) != null) {
                for (Runtime.SupportHardware.Device device5 : device3) {
                    String type2 = device5.getType();
                    if (type2 != null && StringsKt__StringsJVMKt.equals(type2, "car", true)) {
                        String useTemplate2 = device5.getUseTemplate();
                        if (useTemplate2 != null && StringsKt__StringsKt.contains((CharSequence) useTemplate2, (CharSequence) "notification", true)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        device4 = device5;
                        break;
                    }
                }
            }
            return device4 != null ? 1 : -1;
        }
    }

    @Nullable
    public final Runtime getRuntime() {
        return this.runtime;
    }
}
