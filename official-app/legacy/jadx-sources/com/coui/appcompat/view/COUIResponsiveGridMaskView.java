package com.coui.appcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ViewUtils;
import com.coui.component.responsiveui.ResponsiveUIModel;
import com.coui.component.responsiveui.layoutgrid.MarginType;
import com.oplus.aiunit.vision.lh2;
import com.support.responsiveui.R$color;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class COUIResponsiveGridMaskView extends View {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f2155j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2156l;
    public MarginType m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f2157n;
    public final Rect o;
    public final Paint p;
    public final Paint q;
    public ResponsiveUIModel r;
    public Context s;

    public COUIResponsiveGridMaskView(Context context) {
        super(context);
        this.i = 0;
        this.k = 0;
        this.f2156l = 0;
        this.m = MarginType.MARGIN_SMALL;
        this.f2157n = new Rect();
        this.o = new Rect();
        this.p = new Paint();
        this.q = new Paint();
        a(context);
    }

    public final void a(Context context) {
        this.s = context;
        this.r = new ResponsiveUIModel(context, 0, 0);
        b();
        this.p.setColor(lh2.h(context, R$color.responsive_ui_column_hint_margin));
        this.q.setColor(lh2.h(context, R$color.responsive_ui_column_hint_column));
    }

    public final void b() {
        this.r.chooseMargin(this.m);
        this.i = this.r.columnCount();
        this.f2155j = this.r.columnWidth();
        this.k = this.r.gutter();
        this.f2156l = this.r.margin();
        int i = 0;
        for (int i2 : this.f2155j) {
            Log.d("COUIResponsiveGridMaskView", "requestLatestGridParams: " + i2);
            i += i2;
        }
        Log.d("COUIResponsiveGridMaskView", "requestLatestGridParams: \ngetMeasureWidth() = " + getMeasuredWidth() + "\nmMargin = " + this.f2156l + "\nmGutter = " + this.k + "\nmColumnWidth = " + Arrays.toString(this.f2155j) + "\nmColumnCount = " + this.i + "\nsum(columnWidth) = " + i + "\ntotal = (mMargin * 2) + (mColumnWidth * mColumnCount) + (mGutter * (mColumnCount - 1)) = " + ((this.f2156l * 2) + i + (this.k * (this.i - 1))));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (ViewUtils.isLayoutRtl(this)) {
            int measuredWidth = getMeasuredWidth();
            Log.d("COUIResponsiveGridMaskView", "onDraw: total" + getMeasuredWidth());
            this.f2157n.set(measuredWidth, 0, measuredWidth - ((int) (((float) this.f2156l) + 0.0f)), getHeight());
            canvas.drawRect(this.f2157n, this.p);
            Log.d("COUIResponsiveGridMaskView", "onDraw: right margin:0.0 - " + (this.f2156l + 0.0f));
            float f = ((float) this.f2156l) + 0.0f;
            int i = 0;
            while (i < this.i) {
                this.o.set(measuredWidth - ((int) f), 0, measuredWidth - ((int) (this.f2155j[i] + f)), getHeight());
                canvas.drawRect(this.o, this.q);
                Log.d("COUIResponsiveGridMaskView", "onDraw: column:" + f + " - " + (this.f2155j[i] + f));
                if (i != this.i - 1) {
                    Log.d("COUIResponsiveGridMaskView", "onDraw: gap:" + (this.f2155j[i] + f) + " - " + (this.f2155j[i] + f + this.k));
                }
                f += this.f2155j[i] + (i == this.i + (-1) ? 0 : this.k);
                i++;
            }
            this.f2157n.set(measuredWidth - ((int) f), 0, measuredWidth - ((int) (this.f2156l + f)), getHeight());
            canvas.drawRect(this.f2157n, this.p);
            Log.d("COUIResponsiveGridMaskView", "onDraw: left margin:" + f + " - " + (this.f2156l + f));
            return;
        }
        Log.d("COUIResponsiveGridMaskView", "onDraw: total width: " + getMeasuredWidth());
        this.f2157n.set(0, 0, (int) (((float) this.f2156l) + 0.0f), getHeight());
        canvas.drawRect(this.f2157n, this.p);
        Log.d("COUIResponsiveGridMaskView", "onDraw: left margin: 0.0 - " + (this.f2156l + 0.0f) + " width: " + this.f2156l);
        float f2 = ((float) this.f2156l) + 0.0f;
        int i2 = 0;
        while (i2 < this.i) {
            this.o.set((int) f2, 0, (int) (this.f2155j[i2] + f2), getHeight());
            canvas.drawRect(this.o, this.q);
            Log.d("COUIResponsiveGridMaskView", "onDraw: column " + i2 + " :" + f2 + " - " + (this.f2155j[i2] + f2) + " width: " + this.f2155j[i2]);
            if (i2 != this.i - 1) {
                Log.d("COUIResponsiveGridMaskView", "onDraw: gap " + i2 + " :" + (this.f2155j[i2] + f2) + " - " + (this.f2155j[i2] + f2 + this.k) + " width: " + this.k);
            }
            f2 += this.f2155j[i2] + (i2 == this.i + (-1) ? 0 : this.k);
            i2++;
        }
        this.f2157n.set((int) f2, 0, (int) (this.f2156l + f2), getHeight());
        canvas.drawRect(this.f2157n, this.p);
        Log.d("COUIResponsiveGridMaskView", "onDraw: right margin:" + f2 + " - " + (this.f2156l + f2) + " width:" + this.f2156l);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.r.rebuild(getMeasuredWidth(), getMeasuredHeight());
        b();
    }

    public void setMarginType(MarginType marginType) {
        this.m = marginType;
    }

    public COUIResponsiveGridMaskView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.k = 0;
        this.f2156l = 0;
        this.m = MarginType.MARGIN_SMALL;
        this.f2157n = new Rect();
        this.o = new Rect();
        this.p = new Paint();
        this.q = new Paint();
        a(context);
    }

    public COUIResponsiveGridMaskView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.k = 0;
        this.f2156l = 0;
        this.m = MarginType.MARGIN_SMALL;
        this.f2157n = new Rect();
        this.o = new Rect();
        this.p = new Paint();
        this.q = new Paint();
        a(context);
    }
}
