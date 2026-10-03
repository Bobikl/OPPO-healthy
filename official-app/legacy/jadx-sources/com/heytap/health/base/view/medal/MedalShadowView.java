package com.heytap.health.base.view.medal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.base.R$drawable;
import com.heytap.health.base.R$styleable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes15.dex */
public class MedalShadowView extends View {
    public Bitmap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f3325j;
    public Paint k;

    public MedalShadowView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.i;
        if (bitmap == null || this.f3325j == null) {
            a7b.f("MedalShadowView", "medal bitmap is null");
            return;
        }
        int width = bitmap.getWidth();
        int height = this.i.getHeight();
        int width2 = this.f3325j.getWidth();
        int height2 = this.f3325j.getHeight();
        if (width <= 0 || height <= 0) {
            a7b.f("MedalShadowView", "medal bitmap width and height must be > 0");
            return;
        }
        if (width2 <= 0 || height2 <= 0) {
            a7b.f("MedalShadowView", "shadow bitmap width and height must be > 0");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a7b.f("MedalShadowView", "start time:" + jCurrentTimeMillis + "\r\n width:" + getWidth() + "\t height:" + getHeight() + " \t bitmapMedal width:" + width + "\t bitmapMedal height:" + height);
        canvas.save();
        float width3 = ((float) getWidth()) / ((float) width2);
        StringBuilder sb = new StringBuilder();
        sb.append("shadow widthRatio:");
        sb.append(width3);
        a7b.f("MedalShadowView", sb.toString());
        Matrix matrix = new Matrix();
        matrix.postScale(width3, width3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f3325j, 0, 0, width2, height2, matrix, true);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, (float) ((getHeight() - bitmapCreateBitmap.getHeight()) - ejg.a(getContext(), 7.0f)), this.k);
        canvas.restore();
        canvas.save();
        float width4 = getWidth() / width;
        a7b.f("MedalShadowView", "bitmapMedal widthRatio:" + width4);
        Matrix matrix2 = new Matrix();
        matrix2.postScale(width4, width4);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.i, 0, 0, width, height, matrix2, true);
        canvas.clipRect(new RectF(0.0f, 0.0f, getWidth(), getHeight() - bitmapCreateBitmap.getHeight()));
        canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, this.k);
        canvas.restore();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        a7b.f("MedalShadowView", "endTime:" + jCurrentTimeMillis2 + "\t -->cost time:" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setDrawableMedal(Drawable drawable) {
        this.i = ((BitmapDrawable) drawable).getBitmap();
        invalidate();
    }

    public MedalShadowView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public MedalShadowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public MedalShadowView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Paint();
        setDrawableMedal(context.getDrawable(R$drawable.lib_base_medal_bitmap));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_MedalShadowViewTheme);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.lib_base_MedalShadowViewTheme_shadow);
        typedArrayObtainStyledAttributes.recycle();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        if (bitmapDrawable == null) {
            a7b.f("MedalShadowView", "shadow bitmap is null");
        } else {
            this.f3325j = bitmapDrawable.getBitmap();
        }
    }
}
