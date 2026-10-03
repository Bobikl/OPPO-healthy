package com.heytap.nearx.uikit.widget.poplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class RoundFrameLayout extends FrameLayout {
    private Paint mPaint;
    private Path mPath;
    private float mRadius;
    private RectF mRectF;

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    private void dispatchDraw27(Canvas canvas) {
        canvas.saveLayer(this.mRectF, null, 31);
        super.dispatchDraw(canvas);
        canvas.drawPath(genPath(), this.mPaint);
        canvas.restore();
    }

    private void dispatchDraw28(Canvas canvas) {
        canvas.save();
        canvas.clipPath(genPath());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    private Path genPath() {
        this.mPath.reset();
        Path path = this.mPath;
        RectF rectF = this.mRectF;
        float f = this.mRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.mPath;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        dispatchDraw28(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mRectF.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    public void setRadius(float f) {
        this.mRadius = f;
        postInvalidate();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundFrameLayout);
        this.mRadius = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_rfRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.mPath = new Path();
        this.mPaint = new Paint(1);
        this.mRectF = new RectF();
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
