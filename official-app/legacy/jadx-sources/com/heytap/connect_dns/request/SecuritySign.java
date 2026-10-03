package com.heytap.connect_dns.request;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/connect_dns/request/SecuritySign;", "", "", "SECURITY_HEADER_VALUE", "Ljava/lang/String;", "getSECURITY_HEADER_VALUE", "()Ljava/lang/String;", "SECURITY_HEADER_KEY", "getSECURITY_HEADER_KEY", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class SecuritySign {

    @NotNull
    public static final SecuritySign INSTANCE = new SecuritySign();

    @NotNull
    private static final String SECURITY_HEADER_KEY = "Accept-Security";

    @NotNull
    private static final String SECURITY_HEADER_VALUE = "v1";

    private SecuritySign() {
    }

    @NotNull
    public final String getSECURITY_HEADER_KEY() {
        return SECURITY_HEADER_KEY;
    }

    @NotNull
    public final String getSECURITY_HEADER_VALUE() {
        return SECURITY_HEADER_VALUE;
    }
}
