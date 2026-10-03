package com.heytap.health.bandface.watchface.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.bandface.R$styleable;

/* JADX INFO: loaded from: classes15.dex */
public class BandRoundLayout extends FrameLayout {
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3137j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f3138l;

    public BandRoundLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas) {
        this.f3138l.reset();
        this.f3138l.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.i, Path.Direction.CW);
        this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Path path = new Path();
        path.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        path.op(this.f3138l, Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.k);
        canvas.clipPath(this.f3138l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        super.dispatchDraw(canvas);
        a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3138l.reset();
        RectF rectF = new RectF();
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        rectF.right = getPaddingRight();
        rectF.bottom = getPaddingBottom();
        this.f3138l.addRoundRect(rectF, this.i, Path.Direction.CW);
    }

    public BandRoundLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BandRoundLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = new float[8];
        this.i = fArr;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BandRoundLayout);
            this.f3137j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BandRoundLayout_band_round_radius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        float f = this.f3137j;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        Paint paint = new Paint();
        this.k = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        this.f3138l = new Path();
    }
}
