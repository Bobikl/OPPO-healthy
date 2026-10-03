package com.heytap.nearx.cloudconfig.api;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"NETWORK_UNKNOWN", "", "getNETWORK_UNKNOWN", "()Ljava/lang/String;", "NETWORK_WIFI", "getNETWORK_WIFI", "com.heytap.nearx.cloudconfig"}, k = 2, mv = {1, 1, 16})
public final class IConfigStateListenerKt {

    @NotNull
    private static final String NETWORK_UNKNOWN = "UNKNOWN";

    @NotNull
    private static final String NETWORK_WIFI = "WIFI";

    @NotNull
    public static final String getNETWORK_UNKNOWN() {
        return NETWORK_UNKNOWN;
    }

    @NotNull
    public static final String getNETWORK_WIFI() {
        return NETWORK_WIFI;
    }
}
