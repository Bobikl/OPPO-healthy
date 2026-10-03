package com.heytap.nearx.uikit.widget.dialog;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
public class NearListDialog implements DialogInterface {
    private ListAdapter mAdapter;
    private NearAlertDialog.Builder mBuilder;
    private Context mContext;
    private int mCustomRes;
    private View mCustomView;
    private NearAlertDialog mDialog;
    private boolean mHasCustom;
    private CharSequence[] mItems;
    private CharSequence mMessage;
    private TextView mMessageView;
    private DialogInterface.OnClickListener mOnClickListener;
    private int[] mTextAppearances;

    public static class Adapter extends BaseAdapter {
        private static final int LAYOUT = R$layout.nx_list_dialog_item;
        private Context mContext;
        private CharSequence[] mItems;
        private int[] mTextAppearances;

        public Adapter(Context context, CharSequence[] charSequenceArr, int[] iArr) {
            this.mContext = context;
            this.mItems = charSequenceArr;
            this.mTextAppearances = iArr;
        }

        private View getViewInternal(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(this.mContext).inflate(LAYOUT, viewGroup, false);
                TextView textView = (TextView) view.findViewById(R.id.text1);
                viewHolder = new ViewHolder();
                viewHolder.mTextView = textView;
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            CharSequence[] charSequenceArr = this.mItems;
            viewHolder.mTextView.setText(getItem(i));
            int[] iArr = this.mTextAppearances;
            if (iArr != null) {
                int i2 = iArr[i];
                if (i2 > 0) {
                    viewHolder.mTextView.setTextAppearance(this.mContext, i2);
                } else {
                    viewHolder.mTextView.setTextAppearance(this.mContext, R$style.NearDefaultDialogItemTextStyle);
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

    public static class ViewHolder {
        TextView mTextView;

        private ViewHolder() {
        }
    }

    public NearListDialog(Context context) {
        this.mContext = context;
        this.mBuilder = new NearAlertDialog.Builder(context);
    }

    private NearAlertDialog create() {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.nx_list_dialog, (ViewGroup) null);
        setupMessage(viewInflate);
        setupCustomPanel(viewInflate);
        if (this.mItems != null || this.mAdapter != null) {
            setupListPanel(viewInflate);
        }
        this.mBuilder.setView(viewInflate);
        return (NearAlertDialog) this.mBuilder.create();
    }

    private ListAdapter getAdapter() {
        ListAdapter listAdapter = this.mAdapter;
        return listAdapter == null ? new Adapter(this.mContext, this.mItems, this.mTextAppearances) : listAdapter;
    }

    private void setupCustomPanel(View view) {
        if (this.mHasCustom) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.custom_panel);
            View view2 = this.mCustomView;
            if (view2 != null) {
                frameLayout.addView(view2);
            } else {
                frameLayout.addView(LayoutInflater.from(this.mContext).inflate(this.mCustomRes, (ViewGroup) null));
            }
        }
    }

    private void setupListPanel(View view) {
        ListView listView = (ListView) view.findViewById(R$id.list_view);
        listView.setAdapter(getAdapter());
        if (this.mOnClickListener != null) {
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearListDialog.2
                @Override // android.widget.AdapterView.OnItemClickListener
                @SensorsDataInstrumented
                public void onItemClick(AdapterView<?> adapterView, View view2, int i, long j2) {
                    NearListDialog.this.mOnClickListener.onClick(NearListDialog.this.mDialog, i);
                    SensorsDataAutoTrackHelper.trackListView(adapterView, view2, i);
                }
            });
        }
    }

    private void setupMessage(View view) {
        TextView textView = (TextView) view.findViewById(R$id.message_view);
        this.mMessageView = textView;
        textView.setText(this.mMessage);
        if (TextUtils.isEmpty(this.mMessage)) {
            this.mMessageView.setVisibility(8);
        } else {
            view.findViewById(R$id.list_divider).setVisibility(4);
            this.mMessageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearListDialog.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (NearListDialog.this.mMessageView.getLineCount() > 1) {
                        NearListDialog.this.mMessageView.setTextAlignment(2);
                    } else {
                        NearListDialog.this.mMessageView.setTextAlignment(4);
                    }
                    NearListDialog.this.mMessageView.setText(NearListDialog.this.mMessageView.getText());
                    NearListDialog.this.mMessageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        NearAlertDialog nearAlertDialog = this.mDialog;
        if (nearAlertDialog != null) {
            nearAlertDialog.cancel();
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        NearAlertDialog nearAlertDialog = this.mDialog;
        if (nearAlertDialog != null) {
            nearAlertDialog.dismiss();
        }
    }

    public NearAlertDialog getDialog() {
        if (this.mDialog == null) {
            this.mDialog = create();
        }
        return this.mDialog;
    }

    public boolean isShowing() {
        NearAlertDialog nearAlertDialog = this.mDialog;
        return nearAlertDialog != null && nearAlertDialog.isShowing();
    }

    public NearListDialog setAdapter(ListAdapter listAdapter) {
        this.mAdapter = listAdapter;
        return this;
    }

    public NearListDialog setCustomView(int i) {
        this.mCustomRes = i;
        this.mHasCustom = true;
        return this;
    }

    public NearListDialog setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
        this.mItems = charSequenceArr;
        this.mTextAppearances = iArr;
        this.mOnClickListener = onClickListener;
        return this;
    }

    public NearListDialog setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        return this;
    }

    public NearListDialog setTitle(CharSequence charSequence) {
        this.mBuilder.setTitle(charSequence);
        return this;
    }

    public void show() {
        if (this.mDialog == null) {
            this.mDialog = create();
        }
        this.mDialog.show();
    }

    public NearListDialog setCustomView(View view) {
        this.mCustomView = view;
        this.mHasCustom = true;
        return this;
    }

    public NearListDialog(Context context, int i) {
        this.mContext = context;
        this.mBuilder = new NearAlertDialog.Builder(context, i);
    }
}
