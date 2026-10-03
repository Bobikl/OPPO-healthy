package com.oplus.aiunit.vision;

import com.heytap.health.heartrate.measure.entity.HeartMeasureResult;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/tq9;", "", "", "Z", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "output", "G", "", "progress", "Y3", ClickApiEntity.TIME, "A5", "q2", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public interface tq9 {
    void A5(int time);

    void G(@NotNull HeartMeasureResult output);

    void Y3(@NotNull HeartMeasureResult output, int progress);

    void Z();

    void q2(@NotNull HeartMeasureResult output);
}
