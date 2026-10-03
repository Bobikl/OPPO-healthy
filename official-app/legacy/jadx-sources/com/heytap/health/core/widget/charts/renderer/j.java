package com.heytap.health.core.widget.charts.renderer;

import android.graphics.Canvas;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0014¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/core/widget/charts/renderer/j;", "Lcom/heytap/health/core/widget/charts/renderer/BaseYAxisRenderer;", "Landroid/graphics/Canvas;", "c", "", "renderAxisLine", "", "fixedPosition", "", "positions", TypedValues.CycleType.S_WAVE_OFFSET, "drawYLabels", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class j extends BaseYAxisRenderer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull ViewPortHandler viewPortHandler, @NotNull YAxis yAxis, @NotNull Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
    }

    @Override // com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(@NotNull Canvas c2, float fixedPosition, @NotNull float[] positions, float offset) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(positions, "positions");
        int i = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0;
        int i2 = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        f(i2 - i, offset);
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, "A");
        while (i < i2) {
            int i3 = (i * 2) + 1;
            float f = positions[i3] + this.f3824c[i];
            if (!h(f - fCalcTextHeight, f)) {
                String formattedLabel = this.mYAxis.getFormattedLabel(i);
                this.mAxisLabelPaint.setAntiAlias(true);
                c2.drawText(formattedLabel, fixedPosition, positions[i3] + this.f3824c[i], this.mAxisLabelPaint);
            }
            i++;
        }
    }

    @Override // com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(@Nullable Canvas c2) {
        this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
        this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
        this.mAxisLinePaint.setPathEffect(this.mYAxis.getAxisLineDashPathEffect());
        if (this.mYAxis.getAxisDependency() == YAxis.AxisDependency.LEFT) {
            Intrinsics.checkNotNull(c2);
            c2.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
        } else {
            Intrinsics.checkNotNull(c2);
            c2.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
        }
    }
}
