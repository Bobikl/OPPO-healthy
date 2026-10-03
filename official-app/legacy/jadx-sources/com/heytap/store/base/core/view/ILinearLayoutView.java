package com.heytap.store.base.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.store.base.core.R;

/* JADX INFO: loaded from: classes3.dex */
public class ILinearLayoutView extends LinearLayout {
    private ImageView dialogBtn;
    private TextView dialogTxt;

    public ILinearLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pf_core_base_share_item_view, this);
        this.dialogBtn = (ImageView) viewInflate.findViewById(R.id.dialog_btn);
        this.dialogTxt = (TextView) viewInflate.findViewById(R.id.dialog_txt);
    }

    public void setImageBtnBg(int i) {
        this.dialogBtn.setBackgroundResource(i);
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setTextColor(int i) {
        this.dialogTxt.setTextColor(i);
    }

    public void setTextMarginImg(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i;
        this.dialogTxt.setLayoutParams(layoutParams);
    }

    public void setTextView(String str) {
        this.dialogTxt.setText(str);
    }

    public ILinearLayoutView(Context context) {
        super(context);
        init(context);
    }
}
