package com.oplus.pantaconnect.sdk.logger;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/pantaconnect/sdk/logger/DefaultLogger;", "Lcom/oplus/pantaconnect/sdk/logger/Logger;", "()V", "log", "", "level", "Lcom/oplus/pantaconnect/sdk/logger/Logger$Level;", "tag", "", "msg", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultLogger implements Logger {
    @Override // com.oplus.pantaconnect.sdk.logger.Logger
    public void log(@NotNull Logger.Level level, @NotNull String tag, @NotNull String msg) {
        System.out.println((Object) (tag + ": " + msg));
    }
}
