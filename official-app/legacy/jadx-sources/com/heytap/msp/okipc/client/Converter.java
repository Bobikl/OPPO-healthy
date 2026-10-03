package com.heytap.msp.okipc.client;

import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public interface Converter<F, T> {
    @Nullable
    T convert(F f) throws IOException;
}
