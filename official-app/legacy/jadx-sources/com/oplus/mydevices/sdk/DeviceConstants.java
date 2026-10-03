package com.oplus.mydevices.sdk;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/mydevices/sdk/DeviceConstants;", "", "()V", "KEY_AUTHORITY", "", "KEY_DEVICE_DATA", "KEY_DEVICE_ID", "KEY_DEVICE_MAC", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class DeviceConstants {
    public static final DeviceConstants INSTANCE = new DeviceConstants();

    @NotNull
    public static final String KEY_AUTHORITY = "authority";

    @NotNull
    public static final String KEY_DEVICE_DATA = "device_data";

    @NotNull
    public static final String KEY_DEVICE_ID = "device_id";

    @NotNull
    public static final String KEY_DEVICE_MAC = "device_mac";

    private DeviceConstants() {
    }
}
