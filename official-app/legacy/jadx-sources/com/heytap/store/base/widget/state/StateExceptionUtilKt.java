package com.heytap.store.base.widget.state;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isOStoreStateNetError", "", "throwable", "", "Widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StateExceptionUtilKt {
    public static final boolean isOStoreStateNetError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof UnknownHostException) {
            return true;
        }
        if (throwable instanceof IOException) {
            return ((throwable instanceof SocketTimeoutException) && (throwable instanceof MalformedJsonException)) ? false : true;
        }
        return false;
    }
}
