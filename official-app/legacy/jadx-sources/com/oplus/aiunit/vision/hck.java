package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.internal.ProgressionUtilKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/hck;", "Lcom/github/mikephil/charting/renderer/YAxisRenderer;", "Landroid/graphics/Canvas;", "c", "", "renderGridLines", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class hck extends YAxisRenderer {
    public hck(@Nullable ViewPortHandler viewPortHandler, @Nullable YAxis yAxis, @Nullable Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(@NotNull Canvas c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        if (this.mYAxis.isEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                int iSave = c2.save();
                c2.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                Path path = this.mRenderGridLinesPath;
                path.reset();
                int i = 0;
                int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, transformedPositions.length - 1, 2);
                if (progressionLastElement >= 0) {
                    while (true) {
                        if (i != 0 && i != transformedPositions.length - 2) {
                            c2.drawPath(linePath(path, i, transformedPositions), this.mGridPaint);
                            path.reset();
                        }
                        if (i == progressionLastElement) {
                            break;
                        } else {
                            i += 2;
                        }
                    }
                }
                c2.restoreToCount(iSave);
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                drawZeroLine(c2);
            }
        }
    }
}
