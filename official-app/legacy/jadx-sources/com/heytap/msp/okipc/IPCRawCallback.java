package com.heytap.msp.okipc;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface IPCRawCallback {
    void onFailure(@NotNull IPCRawCall iPCRawCall, @NotNull Throwable th);

    void onResponse(@NotNull IPCRawCall iPCRawCall, @NotNull e eVar);
}
