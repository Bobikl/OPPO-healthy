package com.heytap.webview.extension.utils;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/webview/extension/utils/Closer;", "", "()V", "close", "", "stream", "Ljava/io/Closeable;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Closer {

    @NotNull
    public static final Closer INSTANCE = new Closer();

    private Closer() {
    }

    public final void close(@Nullable Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (Exception unused) {
            }
        }
    }
}
