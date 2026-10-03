package com.heytap.health.videosdk.utils;

import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/videosdk/utils/LogHelper;", "", "()V", "logProxySets", "", "Lcom/heytap/health/videosdk/utils/LogProxy;", "addLogProxy", "", "logProxy", "d", "tag", "", "msg", MapSchema.FIELD_NAME_ENTRY, "i", "println", "priority", "", "removeLogProxy", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogHelper {

    @NotNull
    public static final LogHelper INSTANCE = new LogHelper();

    @NotNull
    private static final Set<LogProxy> logProxySets = new LinkedHashSet();

    private LogHelper() {
    }

    private final synchronized void println(int priority, String tag, String msg) {
        Iterator<T> it = logProxySets.iterator();
        while (it.hasNext()) {
            ((LogProxy) it.next()).println(priority, tag, msg);
        }
    }

    public final synchronized void addLogProxy(@NotNull LogProxy logProxy) {
        Intrinsics.checkNotNullParameter(logProxy, "logProxy");
        logProxySets.add(logProxy);
    }

    public final void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        println(3, tag, msg);
    }

    public final void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        println(6, tag, msg);
    }

    public final void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        println(4, tag, msg);
    }

    public final synchronized void removeLogProxy(@NotNull LogProxy logProxy) {
        Intrinsics.checkNotNullParameter(logProxy, "logProxy");
        logProxySets.remove(logProxy);
    }
}
