package com.heytap.nearx.uikit.widget.edittext;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.thc;
import com.oplus.aiunit.vision.yhc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearInputView extends ConstraintLayout {
    private static final int APPEAR_DURATION = 217;
    private static final int BUTTON_LAYOUT_MORE_PADDING = 3;
    private static final int COUNT_TEXTVIEW_MORE_PADDING = 10;
    private static final int DISAPPEAR_DURATION = 283;
    private static final int MAX_LINE = 5;
    private static final int PASSWORD_STATUES_TYPE_CLOSE = 1;
    private static final int PASSWORD_STATUES_TYPE_OPEN = 0;
    protected View mButtonLayout;
    private ErrorStateChangeCallback mCallback;
    protected TextView mCountTextView;
    private CheckBox mCustomButton;
    private Drawable mCustomIcon;
    OnCustomIconClickListener mCustomIconClickListener;
    private NearEditText mEditText;
    private LinearLayout mEdittextContainer;
    private boolean mEnableError;
    private boolean mEnableInputCount;
    private boolean mEnablePassword;
    private TextView mErrorText;
    private ValueAnimator mHideErrorTextAnimator;
    private CharSequence mHint;
    private int mMaxCount;
    private int mPasswordType;
    private PathInterpolator mPathInterpolator;
    private ValueAnimator mShowErrorTextAnimator;
    private CharSequence mTitle;
    private TextView mTitleTextView;
    private int nxInputType;

    public interface ErrorStateChangeCallback {
        void callback(boolean z);
    }

    public interface OnCustomIconClickListener {
        void onClick(View view);
    }

    public NearInputView(Context context) {
        this(context, null);
    }

    private Drawable getTypedArrayDrawable(TypedArray typedArray, int i) {
        if (typedArray != null) {
            return typedArray.getDrawable(i);
        }
        return null;
    }

    private void handleWithCount() {
        if (!this.mEnableInputCount || this.mMaxCount <= 0) {
            return;
        }
        this.mCountTextView.setVisibility(0);
        this.mCountTextView.setText(this.mEditText.getText().length() + "/" + this.mMaxCount);
        this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int length = editable.length();
                if (length < NearInputView.this.mMaxCount) {
                    NearInputView.this.mCountTextView.setText(length + "/" + NearInputView.this.mMaxCount);
                    NearInputView nearInputView = NearInputView.this;
                    nearInputView.mCountTextView.setTextColor(thc.a(nearInputView.getContext(), R$attr.nxColorHintNeutral));
                } else {
                    NearInputView.this.mCountTextView.setText(NearInputView.this.mMaxCount + "/" + NearInputView.this.mMaxCount);
                    NearInputView nearInputView2 = NearInputView.this;
                    nearInputView2.mCountTextView.setTextColor(thc.a(nearInputView2.getContext(), R$attr.nxColorError));
                    if (length > NearInputView.this.mMaxCount) {
                        NearInputView.this.mEditText.setText(editable.subSequence(0, NearInputView.this.mMaxCount));
                    }
                }
                NearInputView nearInputView3 = NearInputView.this;
                nearInputView3.updateCountTextViewPadding(nearInputView3.hasFocus());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                NearInputView.this.updateCountTextViewPadding(z);
            }
        });
    }

    private void handleWithError() {
        if (this.mEnableError) {
            this.mErrorText.setVisibility(0);
            this.mEditText.addOnErrorStateChangedListener(new NearEditText.OnErrorStateChangedListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.2
                @Override // com.heytap.nearx.uikit.widget.edittext.NearEditText.OnErrorStateChangedListener
                public void onErrorStateChangeAnimationEnd(boolean z) {
                }

                @Override // com.heytap.nearx.uikit.widget.edittext.NearEditText.OnErrorStateChangedListener
                public void onErrorStateChanged(boolean z) {
                    NearInputView.this.mEditText.setSelectAllOnFocus(z);
                    if (z) {
                        NearInputView.this.showErrorMsgAnim();
                    } else {
                        NearInputView.this.hideErrorMsgAnim();
                    }
                    if (NearInputView.this.mCallback != null) {
                        NearInputView.this.mCallback.callback(z);
                    }
                }
            });
        }
    }

    private void handleWithPassword() {
        if (!this.mEnablePassword) {
            setInputType();
            return;
        }
        CheckBox checkBox = (CheckBox) findViewById(R$id.checkbox_password);
        checkBox.setVisibility(0);
        if (this.mPasswordType == 1) {
            checkBox.setChecked(false);
            if (this.nxInputType == 1) {
                this.mEditText.setInputType(18);
            } else {
                this.mEditText.setInputType(129);
            }
        } else {
            checkBox.setChecked(true);
            if (this.nxInputType == 1) {
                this.mEditText.setInputType(2);
            } else {
                this.mEditText.setInputType(145);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            @SensorsDataInstrumented
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    if (NearInputView.this.nxInputType == 1) {
                        NearInputView.this.mEditText.setInputType(2);
                    } else {
                        NearInputView.this.mEditText.setInputType(145);
                    }
                } else if (NearInputView.this.nxInputType == 1) {
                    NearInputView.this.mEditText.setInputType(18);
                } else {
                    NearInputView.this.mEditText.setInputType(129);
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(compoundButton);
            }
        });
    }

    private void handleWithTitle() {
        if (TextUtils.isEmpty(this.mTitle)) {
            return;
        }
        this.mTitleTextView.setText(this.mTitle);
        this.mTitleTextView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideErrorMsgAnim() {
        ValueAnimator valueAnimator = this.mShowErrorTextAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mShowErrorTextAnimator.cancel();
        }
        if (this.mHideErrorTextAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.mHideErrorTextAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(283L).setInterpolator(this.mPathInterpolator);
            this.mHideErrorTextAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearInputView.this.mErrorText.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        if (this.mHideErrorTextAnimator.isStarted()) {
            this.mHideErrorTextAnimator.cancel();
        }
        this.mHideErrorTextAnimator.start();
    }

    private void init() {
        handleWithTitle();
        this.mEditText.setTopHint(this.mHint);
        handleWithCount();
        handleWithPassword();
        handleWithError();
        updatePadding();
        initCustomIcon();
    }

    private void initCustomIcon() {
        CheckBox checkBox;
        if (this.mCustomIcon == null || (checkBox = this.mCustomButton) == null) {
            return;
        }
        checkBox.setVisibility(0);
        this.mCustomButton.setButtonDrawable(this.mCustomIcon);
        this.mCustomButton.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                OnCustomIconClickListener onCustomIconClickListener = NearInputView.this.mCustomIconClickListener;
                if (onCustomIconClickListener != null) {
                    onCustomIconClickListener.onClick(view);
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
    }

    private void setInputType() {
        int i = this.nxInputType;
        if (i != -1) {
            if (i == 0) {
                this.mEditText.setInputType(1);
                return;
            }
            if (i == 1) {
                this.mEditText.setInputType(2);
            } else if (i != 2) {
                this.mEditText.setInputType(0);
            } else {
                this.mEditText.setInputType(18);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showErrorMsgAnim() {
        ValueAnimator valueAnimator = this.mHideErrorTextAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mHideErrorTextAnimator.cancel();
        }
        if (this.mShowErrorTextAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mShowErrorTextAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(217L).setInterpolator(this.mPathInterpolator);
            this.mShowErrorTextAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    NearInputView.this.mErrorText.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        if (this.mShowErrorTextAnimator.isStarted()) {
            this.mShowErrorTextAnimator.cancel();
        }
        this.mShowErrorTextAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCountTextViewPadding(boolean z) {
        int intrinsicWidth = (TextUtils.isEmpty(this.mEditText.getText()) || !z || this.mEditText.getDeleteNormalDrawable() == null) ? 0 : this.mEditText.getDeleteNormalDrawable().getIntrinsicWidth();
        if (this.mEnablePassword) {
            intrinsicWidth += this.mButtonLayout.getWidth();
        }
        TextView textView = this.mCountTextView;
        textView.setPaddingRelative(0, 0, intrinsicWidth, textView.getPaddingBottom());
        Paint paint = new Paint();
        paint.setTextSize(this.mCountTextView.getTextSize());
        int iMeasureText = ((int) paint.measureText((String) this.mCountTextView.getText())) + 8;
        if (!z) {
            NearEditText nearEditText = this.mEditText;
            nearEditText.setPaddingRelative(0, nearEditText.getPaddingTop(), this.mButtonLayout.getWidth() + iMeasureText, this.mEditText.getPaddingBottom());
        } else {
            NearEditText nearEditText2 = this.mEditText;
            nearEditText2.setPaddingRelative(0, nearEditText2.getPaddingTop(), this.mEnablePassword ? this.mButtonLayout.getWidth() : 0, this.mEditText.getPaddingBottom());
            this.mEditText.setCompoundDrawablePadding(iMeasureText);
        }
    }

    private void updatePadding() {
        updatePaddingByHasTitleOrNot();
        updatePaddingByEnablePasswordOrNot();
    }

    private void updatePaddingByEnablePasswordOrNot() {
        if (this.mEnablePassword || this.mCustomIcon != null) {
            this.mEditText.post(new Runnable() { // from class: com.heytap.nearx.uikit.widget.edittext.NearInputView.6
                @Override // java.lang.Runnable
                public void run() {
                    TextView textView = NearInputView.this.mCountTextView;
                    textView.setPaddingRelative(0, 0, textView.getPaddingEnd() + NearInputView.this.mButtonLayout.getWidth(), NearInputView.this.mCountTextView.getPaddingBottom());
                    if (NearInputView.this.mEnablePassword || NearInputView.this.mCustomIcon == null) {
                        NearInputView.this.mEditText.setPaddingRelative(NearInputView.this.mEditText.getPaddingStart(), NearInputView.this.mEditText.getPaddingTop(), NearInputView.this.mEditText.getPaddingEnd() + NearInputView.this.mButtonLayout.getWidth(), NearInputView.this.mEditText.getPaddingBottom());
                    } else {
                        NearInputView.this.mEditText.setPaddingRelative(NearInputView.this.mEditText.getPaddingStart(), NearInputView.this.mEditText.getPaddingTop(), (NearInputView.this.mEditText.getPaddingEnd() + NearInputView.this.mButtonLayout.getWidth()) - NearInputView.this.mCustomButton.getWidth(), NearInputView.this.mEditText.getPaddingBottom());
                    }
                }
            });
        }
    }

    public NearEditText getEditText() {
        return this.mEditText;
    }

    public int getHasTitlePaddingBottomDimen() {
        return R$dimen.nx_input_edit_text_has_title_padding_bottom;
    }

    public CharSequence getHint() {
        return this.mHint;
    }

    public int getLayoutResId() {
        return R$layout.nx_input_view;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public NearEditText instanceNearEditText(Context context, AttributeSet attributeSet) {
        return new NearEditText(context, attributeSet, R$attr.nxInputPreferenceEditTextStyle);
    }

    public void setEnableError(boolean z) {
        if (this.mEnableError != z) {
            this.mEnableError = z;
            handleWithError();
            updatePaddingByHasTitleOrNot();
        }
    }

    public void setEnablePassword(boolean z) {
        if (this.mEnablePassword != z) {
            this.mEnablePassword = z;
            handleWithPassword();
            updatePaddingByEnablePasswordOrNot();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mEditText.setEnabled(z);
        this.mTitleTextView.setEnabled(z);
    }

    public void setErrorStateChangeCallBack(ErrorStateChangeCallback errorStateChangeCallback) {
        this.mCallback = errorStateChangeCallback;
    }

    public void setHint(CharSequence charSequence) {
        this.mHint = charSequence;
        this.mEditText.setTopHint(charSequence);
    }

    public void setMaxCount(int i) {
        this.mMaxCount = i;
        handleWithCount();
    }

    public void setOnCustomIconClickListener(OnCustomIconClickListener onCustomIconClickListener) {
        this.mCustomIconClickListener = onCustomIconClickListener;
    }

    public void setPasswordType(int i) {
        if (this.mPasswordType != i) {
            this.mPasswordType = i;
            handleWithPassword();
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null || charSequence.equals(this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        handleWithTitle();
        updatePaddingByHasTitleOrNot();
    }

    public void showError(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mEditText.setErrorState(false);
        } else {
            this.mEditText.setErrorState(true);
        }
        this.mErrorText.setText(charSequence);
    }

    public void updatePaddingByHasTitleOrNot() {
        int paddingTop = this.mEditText.getPaddingTop();
        int paddingBottom = this.mEditText.getPaddingBottom();
        if (!TextUtils.isEmpty(this.mTitle)) {
            paddingTop = getResources().getDimensionPixelSize(R$dimen.nx_input_edit_text_has_title_padding_top);
            paddingBottom = getResources().getDimensionPixelSize(getHasTitlePaddingBottomDimen());
            if (this.mEnableError) {
                paddingBottom = getResources().getDimensionPixelSize(R$dimen.nx_input_edit_text_error_padding_bottom);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.nx_input_edit_error_text_has_title_padding_bottom);
                TextView textView = this.mErrorText;
                textView.setPaddingRelative(textView.getPaddingStart(), this.mErrorText.getPaddingTop(), this.mErrorText.getPaddingEnd(), dimensionPixelSize);
            }
        } else if (this.mEnableError) {
            paddingBottom = getResources().getDimensionPixelSize(R$dimen.nx_input_edit_text_error_padding_bottom);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.nx_input_edit_error_text_no_title_padding_bottom);
            TextView textView2 = this.mErrorText;
            textView2.setPaddingRelative(textView2.getPaddingStart(), this.mErrorText.getPaddingTop(), this.mErrorText.getPaddingEnd(), dimensionPixelSize2);
        }
        View view = this.mButtonLayout;
        view.setPaddingRelative(view.getPaddingStart(), this.mButtonLayout.getPaddingTop(), this.mButtonLayout.getPaddingEnd(), paddingBottom + 3);
        this.mEditText.setPaddingRelative(0, paddingTop, 0, paddingBottom);
        this.mCountTextView.setPaddingRelative(0, 0, 0, paddingBottom + 10);
    }

    public NearInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPathInterpolator = new yhc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearInputView, i, 0);
        this.mTitle = typedArrayObtainStyledAttributes.getText(R$styleable.NearInputView_nxTitle);
        this.mHint = typedArrayObtainStyledAttributes.getText(R$styleable.NearInputView_nxHint);
        this.mEnablePassword = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearInputView_nxEnablePassword, false);
        this.mPasswordType = typedArrayObtainStyledAttributes.getInt(R$styleable.NearInputView_nxPasswordType, 0);
        this.mEnableError = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearInputView_nxEnableError, false);
        this.mMaxCount = typedArrayObtainStyledAttributes.getInt(R$styleable.NearInputView_nxInputMaxCount, 0);
        this.mEnableInputCount = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearInputView_nxEnableInputCount, false);
        this.nxInputType = typedArrayObtainStyledAttributes.getInt(R$styleable.NearInputView_nxInputType, -1);
        this.mCustomIcon = getTypedArrayDrawable(typedArrayObtainStyledAttributes, R$styleable.NearInputView_nxCustomIcon);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), (ViewGroup) this, true);
        this.mTitleTextView = (TextView) findViewById(R$id.title);
        this.mCountTextView = (TextView) findViewById(R$id.input_count);
        this.mErrorText = (TextView) findViewById(R$id.text_input_error);
        this.mButtonLayout = findViewById(R$id.button_layout);
        this.mEdittextContainer = (LinearLayout) findViewById(R$id.edittext_container);
        this.mCustomButton = (CheckBox) findViewById(R$id.checkbox_custom);
        NearEditText nearEditTextInstanceNearEditText = instanceNearEditText(context, attributeSet);
        this.mEditText = nearEditTextInstanceNearEditText;
        nearEditTextInstanceNearEditText.setMaxLines(5);
        this.mEdittextContainer.addView(this.mEditText, -1, -2);
        init();
    }
}
