package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.usercenter.trace.rumtime.AutoTraceNew;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u001a\u0010\n\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ip0;", "", "Landroid/content/Context;", "context", "", "", "baseMap", "", "a", "map", "b", "Lcom/platform/usercenter/trace/rumtime/AutoTraceNew;", "Lcom/platform/usercenter/trace/rumtime/AutoTraceNew;", "autoTraceNew", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasInit", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class ip0 {

    @Nullable
    public static volatile AutoTraceNew a;

    @NotNull
    public static final ip0 INSTANCE = new ip0();

    @NotNull
    public static AtomicBoolean b = new AtomicBoolean(false);

    public final void a(@Nullable Context context, @Nullable Map<String, String> baseMap) {
        if (b.compareAndSet(false, true)) {
            a = ude.a(context != null ? context.getApplicationContext() : null, baseMap);
        }
    }

    public final void b(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        AutoTraceNew autoTraceNew = a;
        if (autoTraceNew != null) {
            autoTraceNew.upload(map);
        }
    }
}
