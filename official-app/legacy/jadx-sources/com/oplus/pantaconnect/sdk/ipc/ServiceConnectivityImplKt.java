package com.oplus.pantaconnect.sdk.ipc;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"INTERVAL_CHECK_CONNECTING", "", "PACKAGE_FOR_PANTACONNECT", "", "RETRY_TIMES", "", "SERVICE_ACTION", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ServiceConnectivityImplKt {
    private static final long INTERVAL_CHECK_CONNECTING = 2000;

    @NotNull
    public static final String PACKAGE_FOR_PANTACONNECT = "com.heytap.accessory";
    private static final int RETRY_TIMES = 2;

    @NotNull
    private static final String SERVICE_ACTION = "com.oplus.pantaconnect.CoreService";
}
