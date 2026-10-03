package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/wsh;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "HOST_RLS", "<init>", "()V", "com.heytap.nearx.taphttp-env"}, k = 1, mv = {1, 4, 0})
public final class wsh {
    public static final wsh INSTANCE = new wsh();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String HOST_RLS = "https://api-snake." + xo6.b(o04.INSTANCE.c()) + "mobile.com";

    @NotNull
    public final String a() {
        return HOST_RLS;
    }
}
