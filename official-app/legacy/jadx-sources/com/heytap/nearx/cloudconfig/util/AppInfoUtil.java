package com.heytap.nearx.cloudconfig.util;

import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/cloudconfig/util/AppInfoUtil;", "", "()V", "FBE", "", "RO_CRYPTO_TYPE", "isFBEVersion", "", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class AppInfoUtil {
    private static final String FBE = "file";
    public static final AppInfoUtil INSTANCE = new AppInfoUtil();
    private static final String RO_CRYPTO_TYPE = "ro.crypto.type";

    private AppInfoUtil() {
    }

    public final boolean isFBEVersion() {
        return Intrinsics.areEqual("file", SystemProperty.INSTANCE.get(RO_CRYPTO_TYPE));
    }
}
