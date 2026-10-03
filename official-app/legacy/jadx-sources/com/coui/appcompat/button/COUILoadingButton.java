package com.coui.appcompat.button;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.R;
import com.oplus.aiunit.vision.vi2;
import com.support.appcompat.R$styleable;
import com.support.button.R$dimen;
import com.support.button.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class COUILoadingButton extends COUIButton {
    public static final int DEFAULT_STATE = 0;
    public static final int LOADING_STATE = 1;
    public int d0;
    public String e0;
    public String f0;
    public final String g0;
    public final Rect h0;
    public final float i0;
    public final float j0;
    public final float k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public AnimatorSet p0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (COUILoadingButton.this.d0 != 1 || charSequence.toString().equals("")) {
                return;
            }
            COUILoadingButton.this.e0 = charSequence.toString();
            COUILoadingButton.this.setText("");
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUILoadingButton.this.m0 = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUILoadingButton.this.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUILoadingButton.this.n0 = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUILoadingButton.this.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUILoadingButton.this.o0 = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            COUILoadingButton.this.invalidate();
        }
    }

    public class e extends AnimatorListenerAdapter {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                COUILoadingButton.this.p0.start();
            }
        }

        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (COUILoadingButton.this.p0 == null || COUILoadingButton.this.d0 != 1) {
                return;
            }
            COUILoadingButton.this.post(new a());
        }
    }

    public interface f {
    }

    public COUILoadingButton(Context context) {
        this(context, null);
    }

    public final boolean D() {
        return getLayoutDirection() == 1;
    }

    public void E() {
        if (this.d0 == 1) {
            this.d0 = 0;
            setText(this.e0);
            this.p0.cancel();
            this.m0 = 51;
            this.n0 = 51;
            this.o0 = 51;
        }
    }

    public void F() {
        if (this.p0 == null) {
            initTextChangeListener();
            initAnim();
        }
        if (this.d0 == 0) {
            this.d0 = 1;
            setText("");
            this.p0.start();
        }
    }

    public final void drawClipDot(Canvas canvas, float f2, float f3, float f4, float f5, TextPaint textPaint, int i) {
        textPaint.setAlpha(i);
        int iSave = canvas.save();
        canvas.clipRect(f2, 0.0f, f3, getHeight());
        canvas.drawText(this.g0, f4, f5, textPaint);
        canvas.restoreToCount(iSave);
    }

    public final void drawLoadingCircles(Canvas canvas, TextPaint textPaint) {
        int i;
        int i2;
        int i3 = this.n0;
        if (D()) {
            i = this.o0;
            i2 = this.m0;
        } else {
            i = this.m0;
            i2 = this.o0;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredWidth = ((getMeasuredWidth() - this.k0) / 2.0f) + this.i0;
        textPaint.setAlpha(i);
        canvas.drawCircle(measuredWidth, measuredHeight, this.i0, textPaint);
        float f2 = measuredWidth + (this.i0 * 2.0f) + this.j0;
        textPaint.setAlpha(i3);
        canvas.drawCircle(f2, measuredHeight, this.i0, textPaint);
        float f3 = f2 + (this.i0 * 2.0f) + this.j0;
        textPaint.setAlpha(i2);
        canvas.drawCircle(f3, measuredHeight, this.i0, textPaint);
    }

    public final ValueAnimator getAlphaAnimator(float f2, float f3, long j2, long j3, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setStartDelay(j3);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfFloat;
    }

    public int getButtonState() {
        return this.d0;
    }

    public String getLoadingText() {
        return this.f0;
    }

    public boolean getShowLoadingText() {
        return this.l0;
    }

    public final void initAnim() {
        b bVar = new b();
        ValueAnimator alphaAnimator = getAlphaAnimator(51.0f, 127.5f, 133L, 0L, bVar);
        ValueAnimator alphaAnimator2 = getAlphaAnimator(127.5f, 255.0f, 67L, 133L, bVar);
        ValueAnimator alphaAnimator3 = getAlphaAnimator(255.0f, 127.5f, 67L, 467L, bVar);
        ValueAnimator alphaAnimator4 = getAlphaAnimator(127.5f, 51.0f, 133L, 533L, bVar);
        c cVar = new c();
        ValueAnimator alphaAnimator5 = getAlphaAnimator(51.0f, 127.5f, 133L, 333L, cVar);
        ValueAnimator alphaAnimator6 = getAlphaAnimator(127.5f, 255.0f, 67L, 466L, cVar);
        ValueAnimator alphaAnimator7 = getAlphaAnimator(255.0f, 127.5f, 67L, 800L, cVar);
        ValueAnimator alphaAnimator8 = getAlphaAnimator(127.5f, 51.0f, 133L, 866L, cVar);
        d dVar = new d();
        ValueAnimator alphaAnimator9 = getAlphaAnimator(51.0f, 127.5f, 133L, 666L, dVar);
        ValueAnimator alphaAnimator10 = getAlphaAnimator(127.5f, 255.0f, 67L, 799L, dVar);
        ValueAnimator alphaAnimator11 = getAlphaAnimator(255.0f, 127.5f, 67L, 1133L, dVar);
        ValueAnimator alphaAnimator12 = getAlphaAnimator(127.5f, 51.0f, 133L, 1199L, dVar);
        AnimatorSet animatorSet = new AnimatorSet();
        this.p0 = animatorSet;
        animatorSet.playTogether(alphaAnimator, alphaAnimator2, alphaAnimator3, alphaAnimator4, alphaAnimator5, alphaAnimator6, alphaAnimator7, alphaAnimator8, alphaAnimator9, alphaAnimator10, alphaAnimator11, alphaAnimator12);
        this.p0.setInterpolator(new vi2());
        this.p0.addListener(new e());
    }

    public final void initTextChangeListener() {
        addTextChangedListener(new a());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        AnimatorSet animatorSet;
        super.onAttachedToWindow();
        if (this.d0 != 1 || (animatorSet = this.p0) == null || animatorSet.isRunning()) {
            return;
        }
        this.p0.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d0 == 1) {
            this.p0.cancel();
        }
    }

    @Override // com.coui.appcompat.button.COUIButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float measuredWidth;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.d0 != 1 || getPaint() == null) {
            return;
        }
        TextPaint paint = getPaint();
        int alpha = paint.getAlpha();
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.l0) {
            float fMeasureText = paint.measureText(this.f0);
            float fMeasureText2 = paint.measureText(this.g0);
            if (fMeasureText + fMeasureText2 > (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) {
                drawLoadingCircles(canvas, paint);
            } else {
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float measuredHeight = (((getMeasuredHeight() + (fontMetrics.bottom - fontMetrics.top)) / 2.0f) - fontMetrics.bottom) - ((getPaddingBottom() - getPaddingTop()) / 2);
                int i3 = this.n0;
                if (D()) {
                    measuredWidth = (((getMeasuredWidth() - fMeasureText) - fMeasureText2) / 2.0f) + fMeasureText2;
                    float measuredWidth2 = ((getMeasuredWidth() - fMeasureText) - fMeasureText2) / 2.0f;
                    i = this.o0;
                    i2 = this.m0;
                    f2 = measuredWidth2;
                } else {
                    measuredWidth = ((getMeasuredWidth() - fMeasureText) - fMeasureText2) / 2.0f;
                    f2 = fMeasureText + measuredWidth;
                    i = this.m0;
                    i2 = this.o0;
                }
                canvas.drawText(this.f0, measuredWidth - ((getPaddingEnd() - getPaddingStart()) / 2), measuredHeight, paint);
                paint.getTextBounds(this.g0, 0, 1, this.h0);
                float f3 = f2;
                drawClipDot(canvas, f2, this.h0.right + f2, f3, measuredHeight, paint, i);
                Rect rect = this.h0;
                float f4 = rect.right + f2;
                paint.getTextBounds(this.g0, 0, 2, rect);
                drawClipDot(canvas, f4, this.h0.right + f2, f3, measuredHeight, paint, i3);
                drawClipDot(canvas, this.h0.right + f2, f2 + fMeasureText2, f3, measuredHeight, paint, i2);
            }
        } else {
            drawLoadingCircles(canvas, paint);
        }
        paint.setAlpha(alpha);
        canvas.restoreToCount(iSave);
    }

    public void setLoadingText(String str) {
        if (str == null || !this.l0) {
            return;
        }
        this.f0 = str;
    }

    public void setOnLoadingStateChangeListener(f fVar) {
    }

    public void setOriginalText(String str) {
        this.e0 = str;
    }

    public void setShowLoadingText(boolean z) {
        this.l0 = z;
    }

    public COUILoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public COUILoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d0 = 0;
        this.f0 = "";
        this.h0 = new Rect();
        this.m0 = 51;
        this.n0 = 51;
        this.o0 = 51;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIButton, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIButton_isShowLoadingText, false);
        this.l0 = z;
        if (z) {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUIButton_loadingText);
            this.f0 = string;
            if (string == null) {
                this.f0 = "";
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.e0 = getText().toString();
        this.g0 = context.getString(R$string.loading_button_dots);
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_loading_btn_circle_radius);
        this.i0 = dimensionPixelOffset;
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.coui_loading_btn_circle_spacing);
        this.j0 = dimensionPixelOffset2;
        this.k0 = (dimensionPixelOffset * 6.0f) + (dimensionPixelOffset2 * 2.0f);
    }
}
