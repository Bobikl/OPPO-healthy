package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public class NearCardSingleInputView extends NearInputView {
    public NearCardSingleInputView(Context context) {
        super(context);
    }

    @Override // com.heytap.nearx.uikit.widget.edittext.NearInputView
    public int getLayoutResId() {
        return R$layout.nx_single_input_card_view;
    }

    @Override // com.heytap.nearx.uikit.widget.edittext.NearInputView
    public NearEditText instanceNearEditText(Context context, AttributeSet attributeSet) {
        return new NearEditText(context, attributeSet, R$attr.nxCardSingleInputEditTextStyle);
    }

    @Override // com.heytap.nearx.uikit.widget.edittext.NearInputView
    public void updatePaddingByHasTitleOrNot() {
        int paddingTop;
        int paddingBottom;
        NearEditText editText = getEditText();
        if (TextUtils.isEmpty(getTitle())) {
            paddingTop = editText.getPaddingTop();
            paddingBottom = editText.getPaddingBottom();
        } else {
            paddingTop = getResources().getDimensionPixelSize(R$dimen.nx_single_input_edit_text_has_title_padding_top);
            paddingBottom = getResources().getDimensionPixelSize(R$dimen.nx_single_input_edit_text_has_title_padding_bottom);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.nx_single_input_edit_text_has_title_button_padding_bottom);
            View view = this.mButtonLayout;
            int i = paddingBottom - dimensionPixelSize;
            view.setPaddingRelative(view.getPaddingStart(), this.mButtonLayout.getPaddingTop(), this.mButtonLayout.getPaddingEnd(), i);
            this.mCountTextView.setPaddingRelative(0, 0, 0, i);
        }
        editText.setPaddingRelative(0, paddingTop, 0, paddingBottom);
    }

    public NearCardSingleInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearCardSingleInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
