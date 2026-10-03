package com.heytap.nearx.uikit.widget.dialogview.adapter;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public class SummaryAdapter extends BaseAdapter {
    private static final int LAYOUT = R$layout.nx_alert_dialog_summary_item;
    private Context mContext;
    private boolean mHasMessage;
    private boolean mHasTitle;
    private CharSequence[] mItems;
    private CharSequence[] mSummaries;
    private int[] mTextColor;

    public SummaryAdapter(Context context, boolean z, boolean z2, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int[] iArr) {
        this.mHasTitle = z;
        this.mHasMessage = z2;
        this.mContext = context;
        this.mItems = charSequenceArr;
        this.mSummaries = charSequenceArr2;
        this.mTextColor = iArr;
    }

    private void resetPadding(int i, View view) {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_item_padding_offset);
        int paddingTop = view.getPaddingTop();
        int paddingLeft = view.getPaddingLeft();
        int paddingBottom = view.getPaddingBottom();
        int paddingRight = view.getPaddingRight();
        if (getCount() <= 1) {
            if (getCount() == 1) {
                if (this.mHasTitle || this.mHasMessage) {
                    view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom + dimensionPixelSize);
                    view.setMinimumHeight(view.getMinimumHeight() + dimensionPixelSize);
                    return;
                } else {
                    int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_first_item_padding_top_offset);
                    view.setPadding(paddingLeft, paddingTop + dimensionPixelSize2, paddingRight, paddingBottom + dimensionPixelSize);
                    view.setMinimumHeight(view.getMinimumHeight() + dimensionPixelSize + dimensionPixelSize2);
                    return;
                }
            }
            return;
        }
        if (i == getCount() - 1) {
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom + dimensionPixelSize);
            view.setMinimumHeight(view.getMinimumHeight() + dimensionPixelSize);
        } else {
            if (this.mHasTitle || this.mHasMessage) {
                return;
            }
            if (i != 0) {
                view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                return;
            }
            int dimensionPixelSize3 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_first_item_padding_top_offset);
            view.setPadding(paddingLeft, paddingTop + dimensionPixelSize3, paddingRight, paddingBottom);
            view.setMinimumHeight(view.getMinimumHeight() + dimensionPixelSize3);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.mItems;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public CharSequence getSummary(int i) {
        CharSequence[] charSequenceArr = this.mSummaries;
        if (charSequenceArr != null && i < charSequenceArr.length) {
            return charSequenceArr[i];
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(LAYOUT, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.summary_text2);
        CharSequence item = getItem(i);
        CharSequence summary = getSummary(i);
        textView.setText(item);
        if (TextUtils.isEmpty(summary)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(summary);
        }
        resetPadding(i, viewInflate);
        int[] iArr = this.mTextColor;
        if (iArr != null && i >= 0 && i < iArr.length) {
            textView.setTextColor(iArr[i]);
        }
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public CharSequence getItem(int i) {
        CharSequence[] charSequenceArr = this.mItems;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }
}
