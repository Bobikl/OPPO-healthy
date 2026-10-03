package com.heytap.nearx.uikit.widget.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.oplus.aiunit.vision.thc;

/* JADX INFO: loaded from: classes18.dex */
public class TextDrawable extends ShapeDrawable {
    private final int WIDTH;
    private int mFontSize;
    private int mMarginBottom;
    private String mText;
    private int mTextHeight;
    private Paint mTextPaint;

    public TextDrawable(Context context) {
        super(new RectShape());
        this.mText = "";
        this.WIDTH = 144;
        this.mFontSize = context.getResources().getDimensionPixelOffset(R$dimen.nx_seekbar_popup_text_size_small);
        this.mTextHeight = context.getResources().getDimensionPixelOffset(R$dimen.nx_seekbar_popup_text_height);
        this.mMarginBottom = context.getResources().getDimensionPixelOffset(R$dimen.nx_seekbar_popup_text_margin_bottom);
        Paint paint = new Paint();
        this.mTextPaint = paint;
        paint.setColor(thc.a(context, R$attr.nxColorPrimaryNeutral));
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setStrokeWidth(0.0f);
        getPaint().setColor(0);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        this.mTextPaint.setTextSize(this.mFontSize);
        canvas.drawText(this.mText, 72.0f, this.mFontSize, this.mTextPaint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mTextHeight + this.mMarginBottom;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 144;
    }

    public void setText(String str) {
        this.mText = str;
    }
}
