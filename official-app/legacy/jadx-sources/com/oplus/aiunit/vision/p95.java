package com.oplus.aiunit.vision;

import androidx.core.app.NotificationCompat;
import com.oplus.aiunit.core.data.AIConfig;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\"\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH&¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/p95;", "", "", "onStart", "Lcom/oplus/aiunit/core/data/AIConfig;", "config", MapSchema.FIELD_NAME_ENTRY, "", NotificationCompat.CATEGORY_ERROR, "", "msg", "f", "detectName", "c", b2n.g, "d", "aiunit.sdk.core_release"}, k = 1, mv = {1, 9, 0})
public interface p95 {
    void c(@NotNull String detectName, int err, @Nullable String msg);

    void d(@NotNull String detectName);

    void e(@NotNull AIConfig config);

    void f(@NotNull AIConfig config, int err, @Nullable String msg);

    void h(@NotNull AIConfig config);

    void onStart();
}
