package com.coui.appcompat.edittext;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.support.input.R$attr;
import com.support.input.R$dimen;
import com.support.input.R$layout;
import com.support.input.R$style;

/* JADX INFO: loaded from: classes13.dex */
public class COUICardSingleInputView extends COUIInputView {
    public COUICardSingleInputView(Context context) {
        super(context);
    }

    @Override // com.coui.appcompat.edittext.COUIInputView
    public int getEdittextPaddingBottom() {
        return !TextUtils.isEmpty(this.q) ? getResources().getDimensionPixelSize(R$dimen.coui_input_preference_single_title_padding_bottom) : (int) getResources().getDimension(com.support.appcompat.R$dimen.coui_input_edit_text_no_title_padding_bottom);
    }

    @Override // com.coui.appcompat.edittext.COUIInputView
    public int getLayoutResId() {
        return R$layout.coui_single_input_card_view;
    }

    @Override // com.coui.appcompat.edittext.COUIInputView
    public int getTitlePaddingTop() {
        return !TextUtils.isEmpty(this.q) ? getResources().getDimensionPixelSize(R$dimen.coui_input_preference_single_title_padding_top) : getResources().getDimensionPixelSize(R$dimen.coui_input_preference_title_padding_top);
    }

    @Override // com.coui.appcompat.edittext.COUIInputView
    public COUIEditText s(Context context, AttributeSet attributeSet) {
        context.getTheme().applyStyle(R$style.COUICardSingleInputViewStyle, true);
        COUIEditText cOUIEditText = new COUIEditText(context, attributeSet, R$attr.couiCardSingleInputEditTextStyle);
        cOUIEditText.setShowDeleteIcon(false);
        cOUIEditText.setVerticalScrollBarEnabled(false);
        return cOUIEditText;
    }

    @Override // com.coui.appcompat.edittext.COUIInputView
    public boolean v() {
        return true;
    }

    public COUICardSingleInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public COUICardSingleInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
