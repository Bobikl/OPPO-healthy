package com.heytap.msp.okipc.client.exception;

import com.heytap.msp.okipc.exception.IPCClientException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class ProviderNotFoundException extends IPCClientException {
    public ProviderNotFoundException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public ProviderNotFoundException(@Nullable String str) {
        this(str, null);
    }
}
