package com.heytap.health.watchface.business.creation.category.paint.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$styleable;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintColorPickThumbView extends View {
    public static final int[] p = {-1229250, -243, -13842644, -13052202, -14211083, -252164, -1229250};
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6812j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6813l;
    public Paint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f6814n;
    public boolean o;

    public HandPaintColorPickThumbView(Context context) {
        super(context);
        this.o = false;
        b(null, 0);
    }

    public void a() {
        this.o = false;
        invalidate();
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.WatchFaceColorPickThumbView, i, 0);
        Resources resources = getContext().getResources();
        try {
            try {
                int i2 = R$styleable.WatchFaceColorPickThumbView_thumb_center_color_radius;
                int i3 = R$dimen.watch_face_margin_8;
                this.f6812j = typedArrayObtainStyledAttributes.getDimensionPixelSize(i2, resources.getDimensionPixelSize(i3));
                this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WatchFaceColorPickThumbView_thumb_out_color_radius, resources.getDimensionPixelSize(R$dimen.watch_face_radius_18));
                this.f6813l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WatchFaceColorPickThumbView_thumb_color_wheel_thickness, resources.getDimensionPixelSize(i3));
            } catch (Exception e2) {
                ltl.b("HandPaintColorPickThumbView", "[init] --> " + e2.getMessage());
            }
            typedArrayObtainStyledAttributes.recycle();
            this.k -= this.f6813l / 2;
            Paint paint = new Paint(1);
            this.m = paint;
            paint.setStyle(Paint.Style.FILL);
            this.m.setColor(this.i);
            Paint paint2 = new Paint(1);
            this.f6814n = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f6814n.setStrokeWidth(this.f6813l);
            this.f6814n.setShader(new SweepGradient(0.0f, 0.0f, p, (float[]) null));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(int i, boolean z) {
        this.i = i;
        this.m.setColor(i);
        this.o = z;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        canvas.drawCircle(0.0f, 0.0f, this.k, this.f6814n);
        if (this.o) {
            canvas.drawCircle(0.0f, 0.0f, this.f6812j, this.m);
        }
        canvas.restore();
    }

    public HandPaintColorPickThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = false;
        b(attributeSet, 0);
    }

    public HandPaintColorPickThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = false;
        b(attributeSet, i);
    }
}
