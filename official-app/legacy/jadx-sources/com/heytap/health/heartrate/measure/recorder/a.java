package com.heytap.health.heartrate.measure.recorder;

import com.heytap.health.heartrate.measure.entity.HeartMeasureResult;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/heytap/health/heartrate/measure/recorder/a;", "", "", "D", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "output", "a", "Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl$UpdateState;", "state", "c", "b", "release", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public interface a {
    void D();

    void a(@NotNull HeartMeasureResult output);

    @NotNull
    HeartMeasureResult b();

    void c(@NotNull HeartMeasureResult output, @NotNull MeasureRecorderImpl.UpdateState state);

    void release();
}
