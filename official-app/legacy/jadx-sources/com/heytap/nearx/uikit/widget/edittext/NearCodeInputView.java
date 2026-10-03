package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.shape.NearShapePath;
import com.oplus.aiunit.vision.thc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearCodeInputView extends RelativeLayout {
    private final int CELL_COUNT;
    private List<CodeItemView> codeViews;
    private List<String> codes;
    private int mCellCount;
    private LinearLayout mCodeViewsContainer;
    private EditText mEditText;
    private boolean mIsEnableSecurity;
    private OnInputListener onInputListener;

    public static class CodeItemView extends View {
        private int mCircleColor;
        private Paint mCirclePaint;
        private int mCircleRadius;
        private boolean mIsEnableSecurity;
        private boolean mIsSelected;
        private String mNumber;
        private TextPaint mNumberTextPaint;
        private Paint mPaint;
        private Path mPath;
        private int mRadius;
        private Paint mStrokePaint;
        private int mTextSize;
        private int strokeWidth;

        public CodeItemView(Context context) {
            super(context);
            this.mTextSize = getResources().getDimensionPixelSize(R$dimen.nx_code_input_cell_text_size);
            this.mRadius = getResources().getDimensionPixelSize(R$dimen.nx_code_input_cell_radius);
            this.strokeWidth = getResources().getDimensionPixelSize(R$dimen.nx_code_input_cell_stroke_width);
            this.mCircleRadius = getResources().getDimensionPixelSize(R$dimen.nx_code_input_cell_security_circle_radius);
            this.mCircleColor = getContext().getResources().getColor(R$color.nx_code_input_security_circle_color);
            this.mNumberTextPaint = new TextPaint();
            this.mPaint = new Paint();
            this.mStrokePaint = new Paint();
            this.mCirclePaint = new Paint();
            this.mPath = new Path();
            this.mNumber = "";
            this.mNumberTextPaint.setTextSize(this.mTextSize);
            this.mNumberTextPaint.setAntiAlias(true);
            this.mNumberTextPaint.setColor(thc.a(getContext(), R$attr.nxColorPrimaryNeutral));
            this.mPaint.setColor(thc.a(getContext(), R$attr.nxColorCardBackground));
            this.mStrokePaint.setColor(thc.a(getContext(), R$attr.nxColorPrimary));
            this.mStrokePaint.setStyle(Paint.Style.STROKE);
            this.mStrokePaint.setStrokeWidth(this.strokeWidth);
            this.mCirclePaint.setColor(this.mCircleColor);
            this.mCirclePaint.setAntiAlias(true);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            int width = getWidth();
            int height = getHeight();
            Path roundRectPath = NearShapePath.getRoundRectPath(this.mPath, new RectF(0.0f, 0.0f, width, height), this.mRadius);
            this.mPath = roundRectPath;
            canvas.drawPath(roundRectPath, this.mPaint);
            if (this.mIsSelected) {
                int i = this.strokeWidth >> 1;
                float f = i;
                Path roundRectPath2 = NearShapePath.getRoundRectPath(this.mPath, new RectF(f, f, width - i, height - i), this.mRadius);
                this.mPath = roundRectPath2;
                canvas.drawPath(roundRectPath2, this.mStrokePaint);
            }
            if (TextUtils.isEmpty(this.mNumber)) {
                return;
            }
            if (this.mIsEnableSecurity) {
                canvas.drawCircle(width / 2, height / 2, this.mCircleRadius, this.mCirclePaint);
                return;
            }
            float fMeasureText = (width / 2) - (this.mNumberTextPaint.measureText(this.mNumber) / 2.0f);
            Paint.FontMetricsInt fontMetricsInt = this.mNumberTextPaint.getFontMetricsInt();
            canvas.drawText(this.mNumber, fMeasureText, (height / 2) - ((fontMetricsInt.descent + fontMetricsInt.ascent) / 2), this.mNumberTextPaint);
        }

        public void setEnableSecurity(boolean z) {
            this.mIsEnableSecurity = z;
        }

        public void setIsSelected(boolean z) {
            this.mIsSelected = z;
        }

        public void setNumber(String str) {
            this.mNumber = str;
        }
    }

    public interface OnInputListener {
        void onInput();

        void onSuccess(String str);
    }

    public NearCodeInputView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBack() {
        if (this.onInputListener == null) {
            return;
        }
        if (this.codes.size() == this.mCellCount) {
            this.onInputListener.onSuccess(getPhoneCode());
        } else {
            this.onInputListener.onInput();
        }
    }

    private void initView(View view) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.nx_code_input_cell_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.nx_code_input_cell_margin_horizontal);
        this.mCodeViewsContainer = (LinearLayout) view.findViewById(R$id.code_container_layout);
        for (int i = 0; i < this.mCellCount; i++) {
            CodeItemView codeItemView = new CodeItemView(getContext());
            codeItemView.setEnableSecurity(this.mIsEnableSecurity);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, -1);
            layoutParams.setMarginStart(dimensionPixelSize2);
            layoutParams.setMarginEnd(dimensionPixelSize2);
            this.mCodeViewsContainer.addView(codeItemView, layoutParams);
            this.codeViews.add(codeItemView);
        }
        this.codeViews.get(0).setIsSelected(true);
        EditText editText = (EditText) view.findViewById(R$id.code_container_edittext);
        this.mEditText = editText;
        editText.requestFocus();
        this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.edittext.NearCodeInputView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable == null || editable.length() <= 0) {
                    return;
                }
                NearCodeInputView.this.mEditText.setText("");
                if (NearCodeInputView.this.codes.size() < NearCodeInputView.this.mCellCount) {
                    String strTrim = editable.toString().trim();
                    if (strTrim.length() > 1) {
                        if (strTrim.length() > NearCodeInputView.this.mCellCount) {
                            strTrim = strTrim.substring(0, NearCodeInputView.this.mCellCount);
                        }
                        List listAsList = Arrays.asList(strTrim.split(""));
                        NearCodeInputView.this.codes = new ArrayList(listAsList);
                    } else {
                        NearCodeInputView.this.codes.add(strTrim);
                    }
                }
                NearCodeInputView.this.updateViewsByCodesChange();
                NearCodeInputView.this.callBack();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearCodeInputView.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                NearCodeInputView nearCodeInputView = NearCodeInputView.this;
                if (!nearCodeInputView.isNotEmpty(nearCodeInputView.codes) || i2 != 67 || keyEvent.getAction() != 0 || NearCodeInputView.this.codes.size() <= 0) {
                    return false;
                }
                NearCodeInputView.this.codes.remove(NearCodeInputView.this.codes.size() - 1);
                NearCodeInputView.this.updateViewsByCodesChange();
                NearCodeInputView.this.callBack();
                return true;
            }
        });
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearCodeInputView.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                CodeItemView codeItemView2 = (CodeItemView) NearCodeInputView.this.codeViews.get(Math.min(NearCodeInputView.this.codes.size(), NearCodeInputView.this.mCellCount - 1));
                codeItemView2.setIsSelected(z);
                codeItemView2.invalidate();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNotEmpty(List<String> list) {
        return !list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateViewsByCodesChange() {
        int size = this.codes.size();
        int i = 0;
        while (i < this.mCellCount) {
            String str = size > i ? this.codes.get(i) : "";
            CodeItemView codeItemView = this.codeViews.get(i);
            codeItemView.setNumber(str);
            int i2 = this.mCellCount;
            if (size == i2 && i == i2 - 1) {
                codeItemView.setIsSelected(true);
            } else {
                codeItemView.setIsSelected(size == i);
            }
            codeItemView.invalidate();
            i++;
        }
    }

    public String getPhoneCode() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.codes.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public void setOnInputListener(OnInputListener onInputListener) {
        this.onInputListener = onInputListener;
    }

    public NearCodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearCodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.CELL_COUNT = 6;
        this.mIsEnableSecurity = false;
        this.codes = new ArrayList();
        this.codeViews = new ArrayList();
        setForceDarkAllowed(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCodeInputView, i, 0);
        this.mCellCount = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearCodeInputView_nxCodeInputCount, 6);
        this.mIsEnableSecurity = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearCodeInputView_nxEnableSecurityInput, false);
        typedArrayObtainStyledAttributes.recycle();
        initView(LayoutInflater.from(context).inflate(R$layout.nx_phone_code_layout, this));
    }
}
