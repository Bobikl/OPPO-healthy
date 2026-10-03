package com.cloud.sdk.cloudstorage.utils;

import android.os.Build;
import com.cloud.sdk.cloudstorage.common.IDeviceIdCallback;
import com.cloud.sdk.cloudstorage.common.OCloudSdkOptions;
import com.heytap.store.base.core.http.HttpConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/DeviceInfo;", "", "()V", "OS_COUNTRY_REGION_CN", "", "<set-?>", "deviceId", "getDeviceId", "()Ljava/lang/String;", HttpConst.OTA_VERSION, "getOtaVersion", "regionMark", "getRegionMark", "romVersion", "getRomVersion", "sDeviceIdCallback", "Lcom/cloud/sdk/cloudstorage/common/IDeviceIdCallback;", "formatRegion", "srcRegion", "init", "", "options", "Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class DeviceInfo {
    private static final String OS_COUNTRY_REGION_CN = "CN";

    @Nullable
    private static String regionMark;

    @Nullable
    private static String romVersion;
    private static IDeviceIdCallback sDeviceIdCallback;

    @NotNull
    public static final DeviceInfo INSTANCE = new DeviceInfo();

    @NotNull
    private static String otaVersion = "";

    @NotNull
    private static String deviceId = "";

    private DeviceInfo() {
    }

    private final String formatRegion(String srcRegion) {
        return StringsKt__StringsJVMKt.equals("OC", srcRegion, true) ? "CN" : srcRegion;
    }

    @NotNull
    public final String getDeviceId() {
        String deviceId2;
        if (!StringsKt__StringsJVMKt.isBlank(deviceId)) {
            return deviceId;
        }
        IDeviceIdCallback iDeviceIdCallback = sDeviceIdCallback;
        return (iDeviceIdCallback == null || (deviceId2 = iDeviceIdCallback.getDeviceId()) == null) ? "" : deviceId2;
    }

    @NotNull
    public final String getOtaVersion() {
        return otaVersion;
    }

    @Nullable
    public final String getRegionMark() {
        return regionMark;
    }

    @Nullable
    public final String getRomVersion() {
        return romVersion;
    }

    public final void init(@NotNull OCloudSdkOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        regionMark = formatRegion(options.getRegionMark());
        String deviceId2 = options.getDeviceId();
        if (deviceId2 != null) {
            deviceId = deviceId2;
        }
        sDeviceIdCallback = options.getDeviceIdCallback();
        otaVersion = SystemPropertiesGet.INSTANCE.get(options.getContext(), "ro.build.version.ota");
        String romVersion2 = options.getRomVersion();
        romVersion = romVersion2 == null || StringsKt__StringsJVMKt.isBlank(romVersion2) ? Build.VERSION.RELEASE : options.getRomVersion();
    }
}
