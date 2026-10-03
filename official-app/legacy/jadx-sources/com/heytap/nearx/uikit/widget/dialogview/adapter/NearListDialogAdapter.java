package com.heytap.nearx.uikit.widget.dialogview.adapter;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;

/* JADX INFO: loaded from: classes18.dex */
public class NearListDialogAdapter extends BaseAdapter {
    private final int LAYOUT = R$layout.nx_list_dialog_item;
    private Context mContext;
    private CharSequence[] mItems;
    private int[] mTextAppearances;

    public class ViewHolder {
        TextView mTextView;

        public ViewHolder() {
        }
    }

    public NearListDialogAdapter(Context context, CharSequence[] charSequenceArr, int[] iArr) {
        this.mContext = context;
        this.mItems = charSequenceArr;
        this.mTextAppearances = iArr;
    }

    private View getViewInternal(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(this.LAYOUT, viewGroup, false);
            TextView textView = (TextView) view.findViewById(R.id.text1);
            viewHolder = new ViewHolder();
            viewHolder.mTextView = textView;
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.mTextView.setText(getItem(i));
        int[] iArr = this.mTextAppearances;
        if (iArr != null) {
            int i2 = iArr[i];
            if (i2 > 0) {
                viewHolder.mTextView.setTextAppearance(this.mContext, i2);
            } else {
                viewHolder.mTextView.setTextAppearance(this.mContext, R$style.UikitDefaultDialogItemTextStyle);
            }
        }
        return view;
    }

    private void resetPadding(int i, View view) {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_item_padding_offset);
        int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_item_padding_top);
        int dimensionPixelSize3 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_item_padding_left);
        int dimensionPixelSize4 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_item_padding_bottom);
        int dimensionPixelSize5 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_item_padding_right);
        int dimensionPixelSize6 = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_item_min_height);
        if (getCount() > 1) {
            if (i == getCount() - 1) {
                view.setPadding(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize5, dimensionPixelSize4 + dimensionPixelSize);
                view.setMinimumHeight(dimensionPixelSize6 + dimensionPixelSize);
            } else {
                view.setPadding(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize5, dimensionPixelSize4);
                view.setMinimumHeight(dimensionPixelSize6);
            }
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

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInternal = getViewInternal(i, view, viewGroup);
        resetPadding(i, viewInternal);
        return viewInternal;
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
