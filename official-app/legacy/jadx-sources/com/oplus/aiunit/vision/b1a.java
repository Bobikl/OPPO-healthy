package com.oplus.aiunit.vision;

import com.heytap.health.watchpair.view.WatchView;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0004H&¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/b1a;", "", "Lcom/heytap/health/watchpair/view/WatchView;", "watchView", "", "b", "f", "", "enable", b2n.f, "Ljava/lang/Runnable;", "callback", "c", "action", MapSchema.FIELD_NAME_ENTRY, "d", "a", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public interface b1a {
    void a();

    void b(@NotNull WatchView watchView);

    void c(@Nullable Runnable callback, @NotNull WatchView watchView);

    void d(@NotNull WatchView watchView);

    void e(@NotNull WatchView watchView, @NotNull Runnable action);

    void f(@NotNull WatchView watchView);

    void g(boolean enable, @NotNull WatchView watchView);
}
