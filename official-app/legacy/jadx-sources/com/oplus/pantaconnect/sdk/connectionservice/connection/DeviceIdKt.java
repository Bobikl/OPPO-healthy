package com.oplus.pantaconnect.sdk.connectionservice.connection;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DEVICE_ID_LENGTH", "", "isValidDeviceId", "", "", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeviceIdKt {
    private static final int DEVICE_ID_LENGTH = 6;

    public static final boolean isValidDeviceId(@NotNull String str) {
        return ModelIdKt.hexStrToByteArrayOrEmpty(str).length == 6;
    }
}
