package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class NearEditTextTheme {
    private Context context;
    private EditText editText;

    public int getDefaultFocusedStrokeColor(@NotNull Context context) {
        return context.getResources().getColor(R$color.nx_edit_text_color_focused);
    }

    public void otherInit(NearEditText nearEditText, AttributeSet attributeSet, int i) {
        this.editText = nearEditText;
        Context context = nearEditText.getContext();
        this.context = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearEditText, i, 0);
        int i2 = R$styleable.NearEditText_nxHintColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxHintEnabled, false);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearEditText_nxEnableTopHint, true);
            if (!z || z2) {
                return;
            }
            nearEditText.setHintTextColor(typedArrayObtainStyledAttributes.getColorStateList(i2));
            if (nearEditText.getUiAndHintUtil() != null) {
                nearEditText.setHint(nearEditText.getUiAndHintUtil().getTopHint());
            }
            nearEditText.setTopHint("");
        }
    }

    public void resetErrorStatus() {
    }

    public void resetUI(boolean z) {
    }

    public void setCursorDrawableRes() {
        this.editText.setTextCursorDrawable(R$drawable.nx_cursor_default);
    }

    public void setEnabled(boolean z) {
    }

    public void setErrorStatus() {
    }

    public void setFocusedStrokeColor(int i) {
    }
}
