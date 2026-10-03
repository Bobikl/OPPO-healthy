package com.oplus.accountsdk.open.core.security;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface DataSafe {
    String decrypt(String str);

    default String decrypt(String str, int i) {
        return decrypt(str);
    }

    String encrypt(String str);

    default String encrypt(String str, int i) {
        return encrypt(str);
    }

    default int getSubVersion() {
        return 0;
    }
}
