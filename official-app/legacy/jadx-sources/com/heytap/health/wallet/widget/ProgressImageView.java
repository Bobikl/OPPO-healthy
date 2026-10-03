package com.heytap.health.wallet.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.oplus.aiunit.vision.t6b;
import com.oppo.lib.common.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
public class ProgressImageView extends CircleNetworkImageView {
    public float o;
    public boolean p;
    public Paint q;
    public Paint r;
    public Rect s;
    public float t;
    public float u;
    public Path v;
    public boolean w;
    public float x;
    public float[] y;
    public int z;

    public ProgressImageView(Context context) {
        super(context);
        this.p = false;
        this.y = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.z = 0;
        init();
    }

    public int getProgress() {
        return this.z;
    }

    public final void init() {
        Paint paint = new Paint();
        this.q = paint;
        paint.setColor(-1);
        this.q.setAlpha(77);
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(-12303292);
        this.r.setTextSize(25.0f);
        this.s = new Rect();
        this.v = new Path();
        this.x = getResources().getDimension(R$dimen.card_corner_radius);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p) {
            return;
        }
        this.t = getWidth() * this.o;
        this.u = getHeight();
        float width = getWidth();
        if (!this.w) {
            float[] fArr = this.y;
            float f = this.x;
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            fArr[4] = f;
            fArr[5] = f;
            fArr[6] = f;
            fArr[7] = f;
            this.v.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.y, Path.Direction.CW);
            this.w = true;
        }
        canvas.save();
        canvas.clipPath(this.v);
        canvas.drawRect(this.t, this.u, width, 0.0f, this.q);
        canvas.restore();
    }

    public void setPer(float f) {
        this.o = f;
        t6b.d("ProgressImage", "per:" + f);
        postInvalidate();
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        this.z = i;
        setPer(i / 100.0f);
    }

    public ProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = false;
        this.y = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.z = 0;
        init();
    }

    public ProgressImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = false;
        this.y = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.z = 0;
        init();
    }
}
