package com.heytap.msp.okipc.client.exception;

import com.heytap.msp.okipc.exception.IPCClientException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class ServiceNotFoundException extends IPCClientException {
    public ServiceNotFoundException(@Nullable String str) {
        super(str, null);
    }

    public ServiceNotFoundException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}
