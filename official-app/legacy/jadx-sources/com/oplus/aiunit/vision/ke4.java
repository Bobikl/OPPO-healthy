package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ke4;", "Lcom/oplus/aiunit/vision/gw8;", "Landroid/graphics/Canvas;", "c", "", "renderGridLines", "renderAxisLine", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class ke4 extends gw8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke4(@NotNull ViewPortHandler viewPortHandler, @NotNull XAxis xAxis, @NotNull Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
    }

    @Override // com.oplus.aiunit.vision.gw8, com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(@NotNull Canvas c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
            c2.drawLine(this.mViewPortHandler.contentLeft() - this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight() + this.mViewPortHandler.offsetRight(), this.mViewPortHandler.contentTop(), this.mAxisLinePaint);
            c2.drawLine(this.mViewPortHandler.contentLeft() - this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.contentBottom(), this.mViewPortHandler.contentRight() + this.mViewPortHandler.offsetRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
        }
    }

    @Override // com.oplus.aiunit.vision.gw8, com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(@NotNull Canvas c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = c2.save();
            c2.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i2 = i / 2;
                float f = fArr2[i2];
                int i3 = i2 + 1;
                float f2 = (f + (i3 >= fArr2.length ? 0.0f : fArr2[i3])) / 2;
                fArr[i] = f2;
                fArr[i + 1] = f2;
            }
            this.mTrans.pointValuesToPixel(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                drawGridLine(c2, fArr[i4], fArr[i4 + 1], path);
            }
            c2.restoreToCount(iSave);
        }
    }
}
