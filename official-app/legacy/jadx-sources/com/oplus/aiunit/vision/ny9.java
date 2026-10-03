package com.oplus.aiunit.vision;

import android.view.View;
import com.heytap.health.hrv.ui.chart.BaseChart;
import com.heytap.health.hrv.util.ChartType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ny9;", "", "Lcom/heytap/health/hrv/util/ChartType;", "type", "Landroid/view/View;", "b", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "chart", "", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
public interface ny9 {
    void a(@NotNull BaseChart chart);

    @NotNull
    View b();

    @NotNull
    ChartType type();
}
