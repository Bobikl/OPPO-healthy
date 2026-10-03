package com.heytap.msp.okipc.client;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public interface Callback<T> {
    void onFailure(@NotNull ICall<T> iCall, @NotNull Throwable th);

    void onResponse(@NotNull ICall<T> iCall, @Nullable e<T> eVar);
}
