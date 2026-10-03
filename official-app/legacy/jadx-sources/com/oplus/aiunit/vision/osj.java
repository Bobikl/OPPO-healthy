package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.support.appcompat.R$attr;
import com.support.seekbar.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class osj extends ShapeDrawable {
    public Context a;
    public Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15038c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15039e;
    public int f;
    public int g;
    public int h;

    public osj(Context context) {
        super(new RectShape());
        this.f15038c = "";
        this.d = 144;
        this.a = context;
        this.g = context.getResources().getDimensionPixelOffset(R$dimen.coui_seekbar_popup_text_size_small);
        this.f15039e = context.getResources().getDimensionPixelOffset(R$dimen.coui_seekbar_popup_text_height);
        this.f = context.getResources().getDimensionPixelOffset(R$dimen.coui_seekbar_popup_text_margin_bottom);
        this.h = context.getResources().getDimensionPixelOffset(R$dimen.coui_seekbar_popup_text_padding_end);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(lh2.a(context, R$attr.couiColorPrimaryNeutral));
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setTypeface(Typeface.create("sans-serif-medium", 0));
        if (a()) {
            this.b.setTextAlign(Paint.Align.LEFT);
        } else {
            this.b.setTextAlign(Paint.Align.RIGHT);
        }
        this.b.setStrokeWidth(0.0f);
        getPaint().setColor(0);
    }

    public boolean a() {
        return this.a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        this.b.setTextSize(this.g);
        if (a()) {
            canvas.drawText(this.f15038c, this.h, this.g, this.b);
        } else {
            canvas.drawText(this.f15038c, 144 - this.h, this.g, this.b);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15039e + this.f;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 144;
    }
}
