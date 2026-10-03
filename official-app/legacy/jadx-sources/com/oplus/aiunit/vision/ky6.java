package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ky6;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "HOST_RLS", "b", "RETRY_IP_LIST", "<init>", "()V", "com.heytap.nearx.taphttp-env"}, k = 1, mv = {1, 4, 0})
public final class ky6 {
    public static final ky6 INSTANCE = new ky6();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String HOST_RLS = "https://support.browser." + xo6.b(o04.INSTANCE.a()) + "mobi.com";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String RETRY_IP_LIST = "120.246.123.112,106.3.18.112,111.206.136.5,120.238.145.15,119.147.175.11,157.148.79.10";

    @NotNull
    public final String a() {
        return HOST_RLS;
    }

    @NotNull
    public final String b() {
        return RETRY_IP_LIST;
    }
}
