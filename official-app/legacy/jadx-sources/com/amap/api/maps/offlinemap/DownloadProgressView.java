package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.map3d.R$styleable;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadProgressView extends View {
    private String a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f916c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f917e;
    private TextPaint f;
    private TextPaint g;
    private float h;
    private float i;

    public DownloadProgressView(Context context) {
        super(context);
        this.b = SupportMenu.CATEGORY_MASK;
        this.f916c = SupportMenu.CATEGORY_MASK;
        this.d = 0.0f;
        this.f917e = 0.6f;
        a(null, 0);
    }

    private void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getString(0);
        this.b = typedArrayObtainStyledAttributes.getColor(3, this.b);
        this.d = typedArrayObtainStyledAttributes.getDimension(1, this.d);
        this.f916c = typedArrayObtainStyledAttributes.getColor(2, this.f916c);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setFlags(1);
        this.f.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        textPaint2.setStyle(Paint.Style.FILL);
        a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int width = (getWidth() - paddingLeft) - paddingRight;
        int height = (getHeight() - paddingTop) - paddingBottom;
        double d = height * 0.8f;
        float f = width;
        String str = String.valueOf((int) (this.f917e * 100.0f)) + "%";
        canvas.drawRect(new Rect(0, (int) d, (int) (f * this.f917e), height), this.g);
        canvas.drawText(str, (int) (this.f917e * f), (int) (d - 3.0d), this.f);
    }

    public void setProgress(int i) {
        if (i > 100 || i < 0) {
            return;
        }
        this.f917e = i / 100.0f;
        invalidate();
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = SupportMenu.CATEGORY_MASK;
        this.f916c = SupportMenu.CATEGORY_MASK;
        this.d = 0.0f;
        this.f917e = 0.6f;
        a(attributeSet, 0);
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = SupportMenu.CATEGORY_MASK;
        this.f916c = SupportMenu.CATEGORY_MASK;
        this.d = 0.0f;
        this.f917e = 0.6f;
        a(attributeSet, i);
    }

    private void a() {
        this.f.setTextSize(this.d);
        this.f.setColor(this.b);
        this.g.setColor(this.f916c);
        this.h = this.f.measureText(this.a);
        this.i = this.f.getFontMetrics().bottom;
    }
}
