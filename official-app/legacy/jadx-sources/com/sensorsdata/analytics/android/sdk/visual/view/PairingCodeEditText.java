package com.sensorsdata.analytics.android.sdk.visual.view;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class PairingCodeEditText extends EditText implements IPairingCodeInterface, TextWatcher {
    private static final int DEFAULT_CURSOR_DURATION = 400;
    private boolean isCursorShowing;
    private float mBottomLineHeight;
    private int mBottomNormalColor;
    private Paint mBottomNormalPaint;
    private int mBottomSelectedColor;
    private Paint mBottomSelectedPaint;
    private int mCurrentPosition;
    private int mCursorColor;
    private int mCursorDuration;
    private Paint mCursorPaint;
    private Timer mCursorTimer;
    private TimerTask mCursorTimerTask;
    private int mCursorWidth;
    private int mEachRectLength;
    private int mFigures;
    private Paint mNormalBackgroundPaint;
    private int mPairingCodeMargin;
    private int mSelectedBackgroundColor;
    private Paint mSelectedBackgroundPaint;
    private IPairingCodeInterface.OnPairingCodeChangedListener onCodeChangedListener;

    public PairingCodeEditText(Context context) {
        this(context, null);
    }

    private int dp2px(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    private int getColor(int i) {
        return getContext().getResources().getColor(i);
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    private void initAttrs() {
        this.mFigures = 4;
        this.mPairingCodeMargin = dp2px(10);
        this.mBottomSelectedColor = Color.parseColor("#00c48e");
        this.mBottomNormalColor = getColor(R.color.darker_gray);
        this.mBottomLineHeight = dp2px(2);
        this.mSelectedBackgroundColor = getColor(R.color.transparent);
        this.mCursorWidth = dp2px(1);
        this.mCursorColor = Color.parseColor("#00c48e");
        this.mCursorDuration = 400;
        setLayoutDirection(0);
    }

    private void initCursorTimer() {
        this.mCursorTimerTask = new TimerTask() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditText.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                PairingCodeEditText pairingCodeEditText = PairingCodeEditText.this;
                pairingCodeEditText.isCursorShowing = !pairingCodeEditText.isCursorShowing;
                PairingCodeEditText.this.postInvalidate();
            }
        };
        this.mCursorTimer = new Timer();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mSelectedBackgroundPaint = paint;
        paint.setColor(this.mSelectedBackgroundColor);
        Paint paint2 = new Paint();
        this.mNormalBackgroundPaint = paint2;
        paint2.setColor(getColor(R.color.transparent));
        this.mBottomSelectedPaint = new Paint();
        this.mBottomNormalPaint = new Paint();
        this.mBottomSelectedPaint.setColor(this.mBottomSelectedColor);
        this.mBottomNormalPaint.setColor(this.mBottomNormalColor);
        this.mBottomSelectedPaint.setStrokeWidth(this.mBottomLineHeight);
        this.mBottomNormalPaint.setStrokeWidth(this.mBottomLineHeight);
        Paint paint3 = new Paint();
        this.mCursorPaint = paint3;
        paint3.setAntiAlias(true);
        this.mCursorPaint.setColor(this.mCursorColor);
        this.mCursorPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mCursorPaint.setStrokeWidth(this.mCursorWidth);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
        if (getText().length() != this.mFigures) {
            if (getText().length() > this.mFigures) {
                getText().delete(this.mFigures, getText().length());
            }
        } else {
            IPairingCodeInterface.OnPairingCodeChangedListener onPairingCodeChangedListener = this.onCodeChangedListener;
            if (onPairingCodeChangedListener != null) {
                onPairingCodeChangedListener.onInputCompleted(getText());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
    }

    public void clearText() {
        getText().delete(0, getText().length());
    }

    public void hiddenKeyBord() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mCursorTimer.scheduleAtFixedRate(this.mCursorTimerTask, 0L, this.mCursorDuration);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mCursorTimer.cancel();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mCurrentPosition = getText().length();
        int paddingLeft = (this.mEachRectLength - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        for (int i = 0; i < this.mFigures; i++) {
            canvas.save();
            int i2 = (paddingLeft * i) + (this.mPairingCodeMargin * i);
            int i3 = paddingLeft + i2;
            if (i == this.mCurrentPosition) {
                canvas.drawRect(i2, 0.0f, i3, measuredHeight, this.mSelectedBackgroundPaint);
            } else {
                canvas.drawRect(i2, 0.0f, i3, measuredHeight, this.mNormalBackgroundPaint);
            }
            canvas.restore();
        }
        String string = getText().toString();
        for (int i4 = 0; i4 < string.length(); i4++) {
            canvas.save();
            float f = (paddingLeft * i4) + (this.mPairingCodeMargin * i4) + (paddingLeft / 2);
            TextPaint paint = getPaint();
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(getCurrentTextColor());
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f2 = measuredHeight - fontMetrics.bottom;
            float f3 = fontMetrics.top;
            canvas.drawText(String.valueOf(string.charAt(i4)), f, ((f2 + f3) / 2.0f) - f3, paint);
            canvas.restore();
        }
        for (int i5 = 0; i5 < this.mFigures; i5++) {
            canvas.save();
            float f4 = measuredHeight - (this.mBottomLineHeight / 2.0f);
            int i6 = (paddingLeft * i5) + (this.mPairingCodeMargin * i5);
            int i7 = paddingLeft + i6;
            if (i5 < this.mCurrentPosition) {
                canvas.drawLine(i6, f4, i7, f4, this.mBottomSelectedPaint);
            } else {
                canvas.drawLine(i6, f4, i7, f4, this.mBottomNormalPaint);
            }
            canvas.restore();
        }
        boolean zIsCursorVisible = isCursorVisible();
        if (this.isCursorShowing || !zIsCursorVisible || this.mCurrentPosition >= this.mFigures || !hasFocus()) {
            return;
        }
        canvas.save();
        int i8 = (this.mCurrentPosition * (this.mPairingCodeMargin + paddingLeft)) + (paddingLeft / 2);
        int i9 = measuredHeight / 4;
        float f5 = i8;
        canvas.drawLine(f5, i9, f5, measuredHeight - i9, this.mCursorPaint);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            size = getScreenWidth(getContext());
        }
        int i3 = this.mPairingCodeMargin;
        int i4 = this.mFigures;
        this.mEachRectLength = (size - (i3 * (i4 - 1))) / i4;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            size2 = this.mEachRectLength;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
        IPairingCodeInterface.OnPairingCodeChangedListener onPairingCodeChangedListener = this.onCodeChangedListener;
        if (onPairingCodeChangedListener != null) {
            onPairingCodeChangedListener.onPairingCodeChanged(getText(), i, i2, i3);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setBottomLineHeight(int i) {
        this.mBottomLineHeight = i;
        postInvalidate();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setBottomNormalColor(int i) {
        this.mBottomSelectedColor = getColor(i);
        postInvalidate();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setBottomSelectedColor(int i) {
        this.mBottomSelectedColor = getColor(i);
        postInvalidate();
    }

    @Override // android.widget.TextView
    public final void setCursorVisible(boolean z) {
        super.setCursorVisible(z);
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setFigures(int i) {
        this.mFigures = i;
        postInvalidate();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setOnPairingCodeChangedListener(IPairingCodeInterface.OnPairingCodeChangedListener onPairingCodeChangedListener) {
        this.onCodeChangedListener = onPairingCodeChangedListener;
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setPairingCodeMargin(int i) {
        this.mPairingCodeMargin = i;
        postInvalidate();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setSelectedBackgroundColor(int i) {
        this.mSelectedBackgroundColor = getColor(i);
        postInvalidate();
    }

    public void showKeyBoard(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this, 2);
        }
    }

    public PairingCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PairingCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentPosition = 0;
        this.mEachRectLength = 0;
        initAttrs();
        setBackgroundColor(getColor(R.color.transparent));
        initPaint();
        initCursorTimer();
        setFocusableInTouchMode(true);
        setSelection(getText().length());
        requestFocus();
        super.addTextChangedListener(this);
    }
}
