package com.heytap.nearx.uikit.widget.edittext;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes18.dex */
public class NearEditTextLimitedWordsUtil {
    private final NearEditText mColorEditText;
    private Paint mWordsCountPaint = new Paint();
    private int wordCount = 0;
    private int MaxWords = 50;

    public NearEditTextLimitedWordsUtil(NearEditText nearEditText, AttributeSet attributeSet, int i, int i2) {
        nearEditText.setGravity(51);
        nearEditText.setPadding(nearEditText.getPaddingLeft(), nearEditText.getPaddingTop(), nearEditText.getPaddingRight(), (int) (nearEditText.getPaddingBottom() + TypedValue.applyDimension(1, 6.0f, nearEditText.getResources().getDisplayMetrics())));
        this.mColorEditText = nearEditText;
        this.mWordsCountPaint.setTextSize(TypedValue.applyDimension(2, 12.0f, nearEditText.getResources().getDisplayMetrics()));
        this.mWordsCountPaint.setColor(i2);
        initTextChangeListener();
        nearEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.MaxWords)});
        setMaxWords(i);
        if (attributeSet == null) {
            nearEditText.setTextSize(16.0f);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = nearEditText.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize});
        nearEditText.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) TypedValue.applyDimension(2, 16.0f, nearEditText.getResources().getDisplayMetrics())));
        typedArrayObtainStyledAttributes.recycle();
    }

    private String getCountHintText() {
        return "" + this.wordCount + "/" + getMaxWords();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCountHintTextWidth() {
        return (int) this.mWordsCountPaint.measureText(getCountHintText());
    }

    private void initTextChangeListener() {
        this.mColorEditText.addTextChangedListener(new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.edittext.NearEditTextLimitedWordsUtil.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    NearEditTextLimitedWordsUtil.this.wordCount = editable.toString().length();
                    NearEditTextLimitedWordsUtil.this.updateWordsHint();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWordsHint() {
        this.mColorEditText.post(new Runnable() { // from class: com.heytap.nearx.uikit.widget.edittext.NearEditTextLimitedWordsUtil.2
            @Override // java.lang.Runnable
            public void run() {
                Layout layout = NearEditTextLimitedWordsUtil.this.mColorEditText.getLayout();
                int lineCount = NearEditTextLimitedWordsUtil.this.mColorEditText.getLineCount();
                if (layout.getLineWidth(lineCount - 1) >= ((((double) NearEditTextLimitedWordsUtil.this.mColorEditText.getWidth()) - (((double) NearEditTextLimitedWordsUtil.this.getCountHintTextWidth()) * 1.5d)) - ((double) NearEditTextLimitedWordsUtil.this.mColorEditText.getPaddingStart())) - ((double) NearEditTextLimitedWordsUtil.this.mColorEditText.getPaddingEnd())) {
                    NearEditTextLimitedWordsUtil.this.mColorEditText.setLines(lineCount + 1);
                } else {
                    NearEditTextLimitedWordsUtil.this.mColorEditText.setLines(lineCount);
                }
            }
        });
    }

    public void draw(Canvas canvas) {
        if (this.mColorEditText.getLayoutDirection() == 1) {
            canvas.drawText(getCountHintText(), this.mColorEditText.getPaddingEnd(), ((this.mColorEditText.getHeight() - this.mColorEditText.getPaddingBottom()) - (this.mColorEditText.getTextSize() / 2.0f)) + (this.mWordsCountPaint.getTextSize() / 2.0f), this.mWordsCountPaint);
        } else {
            canvas.drawText(getCountHintText(), (this.mColorEditText.getWidth() - getCountHintTextWidth()) - this.mColorEditText.getPaddingEnd(), ((this.mColorEditText.getHeight() - this.mColorEditText.getPaddingBottom()) - (this.mColorEditText.getTextSize() / 2.0f)) + (this.mWordsCountPaint.getTextSize() / 2.0f), this.mWordsCountPaint);
        }
    }

    public int getMaxWords() {
        return this.MaxWords;
    }

    public void setLimitedWordsTextColor(int i) {
        this.mWordsCountPaint.setColor(i);
    }

    public void setMaxWords(int i) {
        this.MaxWords = i;
        this.mColorEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.MaxWords)});
    }
}
