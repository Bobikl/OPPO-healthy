package com.coui.appcompat.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.coui.appcompat.button.COUIButton;

/* JADX INFO: loaded from: classes13.dex */
class COUITwoTextButton extends COUIButton {
    public TextPaint d0;
    public TextPaint e0;
    public float f0;
    public float g0;
    public String h0;
    public String i0;

    public COUITwoTextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h0 = "";
        this.i0 = "";
    }

    public void A(CharSequence charSequence) {
        this.i0 = (String) charSequence;
    }

    public void B(float f) {
        this.f0 = f;
    }

    public void C(CharSequence charSequence) {
        this.h0 = (String) charSequence;
    }

    public void D(float f) {
        this.g0 = f;
    }

    @Override // com.coui.appcompat.button.COUIButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d0 == null) {
            this.d0 = new TextPaint(getPaint());
        }
        if (this.e0 == null) {
            this.e0 = new TextPaint(getPaint());
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        x(canvas, this.h0, this.d0, this.g0);
        x(canvas, this.i0, this.e0, this.f0);
        canvas.restoreToCount(iSave);
    }

    public final void x(Canvas canvas, String str, TextPaint textPaint, float f) {
        int width = getWidth();
        String str2 = (String) TextUtils.ellipsize(str, textPaint, (width - getPaddingStart()) - getPaddingEnd(), TextUtils.TruncateAt.END);
        float fMeasureText = ((width - textPaint.measureText(str2)) / 2.0f) - ((getPaddingEnd() - getPaddingStart()) / 2.0f);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float measuredHeight = (((getMeasuredHeight() + (fontMetrics.bottom - fontMetrics.top)) / 2.0f) - fontMetrics.bottom) - ((getPaddingBottom() - getPaddingTop()) / 2.0f);
        textPaint.setAlpha((int) (f * 255.0f));
        canvas.drawText(str2, fMeasureText, measuredHeight, textPaint);
    }

    public float y() {
        return this.f0;
    }

    public float z() {
        return this.g0;
    }
}
