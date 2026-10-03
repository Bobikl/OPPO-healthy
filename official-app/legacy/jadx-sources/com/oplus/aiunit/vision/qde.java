package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.print.PrintAttributes;
import android.view.View;
import com.github.mikephil.charting.data.Entry;
import com.heytap.health.core.widget.charts.EcgLineChart;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class qde {
    public static Bitmap a(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static void b(View view, PdfDocument pdfDocument, int i) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapA = a(view);
        int heightMils = (PrintAttributes.MediaSize.ISO_A4.getHeightMils() * 72) / 1000;
        int widthMils = (PrintAttributes.MediaSize.ISO_A4.getWidthMils() * 72) / 1000;
        float fMin = Math.min(heightMils / bitmapA.getWidth(), widthMils / bitmapA.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin);
        Paint paint = new Paint(1);
        PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(heightMils, widthMils, i).create());
        pageStartPage.getCanvas().drawBitmap(bitmapA, matrix, paint);
        pdfDocument.finishPage(pageStartPage);
        aa6.a("PdfUtil", "finish a pdfDocument page end");
    }

    public static void c(int i, ArrayList<Entry> arrayList, float f, List<EcgLineChart> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            EcgLineChart ecgLineChart = list.get(i2);
            ecgLineChart.setStyle(true);
            ecgLineChart.setXAxisMinimum(f);
            f += 10.0f;
            ecgLineChart.setXAxisMaximum(f);
            ecgLineChart.setYAxisMinimum(-2.5f);
            ecgLineChart.setYAxisMaximum(2.5f);
            ecgLineChart.d(false);
            ecgLineChart.k(0.0f, 0.0f, 50.0f, 0.0f);
            ecgLineChart.setEcgGain(i);
            if (i2 == 0) {
                ecgLineChart.j(true);
            }
            ecgLineChart.setData(arrayList);
        }
    }
}
