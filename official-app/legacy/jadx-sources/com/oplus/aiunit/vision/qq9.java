package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.heartrate.measure.entity.HeartMeasureResult;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/qq9;", "", "Landroid/content/Context;", "context", "", "init", "b", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "c", "a", "Lcom/oplus/aiunit/vision/rq9;", "listener", "d", MapSchema.FIELD_NAME_ENTRY, "release", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public interface qq9 {
    void a();

    void b(@NotNull Context context);

    @Nullable
    HeartMeasureResult c();

    void d(@NotNull rq9 listener);

    void e(@NotNull rq9 listener);

    void init(@NotNull Context context);

    void release();
}
