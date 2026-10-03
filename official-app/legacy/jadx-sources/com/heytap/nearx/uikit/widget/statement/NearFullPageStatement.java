package com.heytap.nearx.uikit.widget.statement;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearButton;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.nlc;
import com.oplus.aiunit.vision.ugc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearFullPageStatement extends LinearLayout {
    private TextView mAppStatement;
    private NearButton mBottomButton;
    private Context mContext;
    private TextView mExitButton;
    private LayoutInflater mLayoutInflater;
    private OnButtonClickListener mOnButtonClickListener;
    private com.heytap.nearx.uikit.widget.NearMaxHeightScrollView mScrollText;
    private int mStyle;
    private TextView mTitle;

    public interface OnButtonClickListener {
        void onBottomButtonClick();

        void onExitButtonClick();
    }

    public NearFullPageStatement(Context context) {
        this(context, null);
    }

    private void init() {
        LayoutInflater layoutInflater = (LayoutInflater) this.mContext.getSystemService("layout_inflater");
        this.mLayoutInflater = layoutInflater;
        View viewInflate = layoutInflater.inflate(R$layout.nx_color_full_page_statement, this);
        this.mAppStatement = (TextView) viewInflate.findViewById(R$id.txt_statement);
        this.mBottomButton = (NearButton) viewInflate.findViewById(R$id.btn_confirm);
        this.mScrollText = (com.heytap.nearx.uikit.widget.NearMaxHeightScrollView) viewInflate.findViewById(R$id.scroll_text);
        this.mExitButton = (TextView) viewInflate.findViewById(R$id.txt_exit);
        this.mTitle = (TextView) viewInflate.findViewById(R$id.txt_title);
        ugc.b(this.mAppStatement, 2);
        ugc.b(this.mExitButton, 4);
        this.mBottomButton.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.statement.NearFullPageStatement.1
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (NearFullPageStatement.this.mOnButtonClickListener != null) {
                    NearFullPageStatement.this.mOnButtonClickListener.onBottomButtonClick();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        this.mExitButton.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.statement.NearFullPageStatement.2
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (NearFullPageStatement.this.mOnButtonClickListener != null) {
                    NearFullPageStatement.this.mOnButtonClickListener.onExitButtonClick();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        nlc.a(this.mExitButton);
    }

    public TextView getAppStatement() {
        return this.mAppStatement;
    }

    public TextView getAppStatementView() {
        return this.mAppStatement;
    }

    public com.heytap.nearx.uikit.widget.NearMaxHeightScrollView getScrollTextView() {
        return this.mScrollText;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.mBottomButton.getLayoutParams().width = getContext().createConfigurationContext(configuration).getResources().getDimensionPixelOffset(R$dimen.nx_full_page_statement_button_width);
        super.onConfigurationChanged(configuration);
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearFullPageStatement, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearFullPageStatement, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mExitButton.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFullPageStatement_nxFullPageStatementTextButtonColor, 0));
            this.mAppStatement.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFullPageStatement_nxFullPageStatementTextColor, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setAppStatement(CharSequence charSequence) {
        this.mAppStatement.setText(charSequence);
    }

    public void setAppStatementTextColor(int i) {
        this.mAppStatement.setTextColor(i);
    }

    public void setButtonDisableColor(int i) {
        this.mBottomButton.setButtonDisableColor(i);
    }

    public void setButtonDrawableColor(int i) {
        this.mBottomButton.setButtonDrawableColor(i);
    }

    public void setButtonListener(OnButtonClickListener onButtonClickListener) {
        this.mOnButtonClickListener = onButtonClickListener;
    }

    public void setButtonText(CharSequence charSequence) {
        this.mBottomButton.setText(charSequence);
    }

    public void setExitButtonText(CharSequence charSequence) {
        this.mExitButton.setText(charSequence);
    }

    public void setExitTextColor(int i) {
        this.mExitButton.setTextColor(i);
    }

    public void setStatementMaxHeight(int i) {
        this.mScrollText.setMaxHeight(i);
    }

    public void setTitleText(CharSequence charSequence) {
        this.mTitle.setText(charSequence);
    }

    public NearFullPageStatement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxFullPageStatementStyle);
    }

    public void setAppStatement(String str) {
        this.mAppStatement.setText(str);
    }

    public NearFullPageStatement(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public void setAppStatement(SpannableString spannableString) {
        this.mAppStatement.setText(spannableString);
    }

    public NearFullPageStatement(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mContext = context;
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.mStyle = attributeSet.getStyleAttribute();
        } else {
            this.mStyle = i;
        }
        init();
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, R$styleable.NearFullPageStatement, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.NearFullPageStatement_nxExitButtonText);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.NearFullPageStatement_nxBottomButtonText);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.NearFullPageStatement_nxFullPageStatementTitleText);
        this.mAppStatement.setText(typedArrayObtainStyledAttributes.getString(R$styleable.NearFullPageStatement_nxAppStatement));
        this.mExitButton.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFullPageStatement_nxFullPageStatementTextButtonColor, 0));
        this.mAppStatement.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NearFullPageStatement_nxFullPageStatementTextColor, 0));
        if (string2 != null) {
            this.mBottomButton.setText(string2);
        }
        if (string != null) {
            this.mExitButton.setText(string);
        }
        if (string3 != null) {
            this.mTitle.setText(string3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
