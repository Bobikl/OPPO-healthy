package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.thc;

/* JADX INFO: loaded from: classes18.dex */
public class NearCardMultiInputView extends ConstraintLayout {
    private static final int MAX_LINE = 5;
    private TextView mCountTextView;
    private NearEditText mEditText;
    private LinearLayout mEdittextContainer;
    private boolean mEnableInputCount;
    private CharSequence mHint;
    private int mMaxCount;

    public NearCardMultiInputView(Context context) {
        this(context, null);
    }

    private void handleWithCount() {
        if (!this.mEnableInputCount || this.mMaxCount <= 0) {
            this.mCountTextView.setVisibility(8);
            return;
        }
        this.mCountTextView.setVisibility(0);
        this.mCountTextView.setText(this.mEditText.getText().length() + "/" + this.mMaxCount);
        this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.edittext.NearCardMultiInputView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int length = editable.length();
                if (length < NearCardMultiInputView.this.mMaxCount) {
                    NearCardMultiInputView.this.mCountTextView.setText(length + "/" + NearCardMultiInputView.this.mMaxCount);
                    NearCardMultiInputView.this.mCountTextView.setTextColor(thc.a(NearCardMultiInputView.this.getContext(), R$attr.nxColorHintNeutral));
                    return;
                }
                NearCardMultiInputView.this.mCountTextView.setText(NearCardMultiInputView.this.mMaxCount + "/" + NearCardMultiInputView.this.mMaxCount);
                NearCardMultiInputView.this.mCountTextView.setTextColor(thc.a(NearCardMultiInputView.this.getContext(), R$attr.nxColorError));
                if (length > NearCardMultiInputView.this.mMaxCount) {
                    NearCardMultiInputView.this.mEditText.setText(editable.subSequence(0, NearCardMultiInputView.this.mMaxCount));
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

    private void init() {
        this.mEditText.setTopHint(this.mHint);
        handleWithCount();
    }

    public NearEditText getEditText() {
        return this.mEditText;
    }

    public CharSequence getHint() {
        return this.mHint;
    }

    public int getLayoutResId() {
        return R$layout.nx_multi_input_card_view;
    }

    public NearEditText instanceNearEditText(Context context, AttributeSet attributeSet) {
        return new NearEditText(context, attributeSet, R$attr.nxCardMultiInputEditTextStyle);
    }

    public void setHint(CharSequence charSequence) {
        this.mHint = charSequence;
        this.mEditText.setTopHint(charSequence);
    }

    public void setMaxCount(int i) {
        this.mMaxCount = i;
        handleWithCount();
    }

    public NearCardMultiInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearCardMultiInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearInputView, i, 0);
        this.mHint = typedArrayObtainStyledAttributes.getText(R$styleable.NearInputView_nxHint);
        this.mMaxCount = typedArrayObtainStyledAttributes.getInt(R$styleable.NearInputView_nxInputMaxCount, 0);
        this.mEnableInputCount = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearInputView_nxEnableInputCount, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), (ViewGroup) this, true);
        this.mEdittextContainer = (LinearLayout) findViewById(R$id.edittext_container);
        NearEditText nearEditTextInstanceNearEditText = instanceNearEditText(context, attributeSet);
        this.mEditText = nearEditTextInstanceNearEditText;
        nearEditTextInstanceNearEditText.setMaxLines(5);
        this.mEdittextContainer.addView(this.mEditText, -1, -2);
        this.mCountTextView = (TextView) findViewById(R$id.input_count);
        init();
    }
}
