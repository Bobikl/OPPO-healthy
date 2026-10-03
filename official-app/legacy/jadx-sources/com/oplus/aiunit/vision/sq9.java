package com.oplus.aiunit.vision;

import android.content.Context;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/sq9;", "", "Landroid/content/Context;", "context", "", "init", "b", MapSchema.FIELD_NAME_ENTRY, "a", "Lcom/oplus/aiunit/vision/tq9;", "listener", "d", "c", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public interface sq9 {
    void a();

    void b(@NotNull Context context);

    void c(@NotNull tq9 listener);

    void d(@NotNull tq9 listener);

    void e();

    void init(@NotNull Context context);
}
