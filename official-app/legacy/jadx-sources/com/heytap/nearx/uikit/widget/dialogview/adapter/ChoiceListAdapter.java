package com.heytap.nearx.uikit.widget.dialogview.adapter;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.internal.widget.InnerCheckBox;
import com.heytap.nearx.uikit.widget.NearCheckBox;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class ChoiceListAdapter extends BaseAdapter {
    private boolean[] mCheckBoxStates;
    private Context mContext;
    private boolean[] mDisableStatus;
    private boolean mIsMultiChoice;
    private CharSequence[] mItems;
    private int mLayoutResId;
    private MultiChoiceItemClickListener mMultiChoiceItemClickListener;
    private CharSequence[] mSummaries;

    public interface MultiChoiceItemClickListener {
        void onClick(int i, boolean z);
    }

    public static class ViewHolder {
        NearCheckBox checkBox;
        TextView itemText;
        RadioButton radioButton;
        FrameLayout radioLayout;
        TextView summaryText;
        LinearLayout textLayout;
    }

    public ChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, boolean z) {
        this(context, i, charSequenceArr, charSequenceArr2, zArr, null, z);
    }

    private void initCheckboxStates(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            boolean[] zArr2 = this.mCheckBoxStates;
            if (i >= zArr2.length) {
                return;
            }
            zArr2[i] = zArr[i];
        }
    }

    private void initCheckboxStatesDisable(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            boolean[] zArr2 = this.mDisableStatus;
            if (i >= zArr2.length) {
                return;
            }
            zArr2[i] = zArr[i];
        }
    }

    private void setPaddingBottom(View view, int i) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public boolean[] getCheckBoxStates() {
        return this.mCheckBoxStates;
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

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public MultiChoiceItemClickListener getMultiChoiceItemClickListener() {
        return this.mMultiChoiceItemClickListener;
    }

    public CharSequence getSummary(int i) {
        CharSequence[] charSequenceArr = this.mSummaries;
        if (charSequenceArr != null && i < charSequenceArr.length) {
            return charSequenceArr[i];
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            viewInflate = LayoutInflater.from(this.mContext).inflate(this.mLayoutResId, viewGroup, false);
            viewHolder.textLayout = (LinearLayout) viewInflate.findViewById(R$id.text_layout);
            viewHolder.itemText = (TextView) viewInflate.findViewById(R.id.text1);
            viewHolder.summaryText = (TextView) viewInflate.findViewById(R$id.summary_text2);
            if (this.mIsMultiChoice) {
                viewHolder.checkBox = (NearCheckBox) viewInflate.findViewById(R$id.checkbox);
            } else {
                viewHolder.radioLayout = (FrameLayout) viewInflate.findViewById(R$id.radio_layout);
                viewHolder.radioButton = (RadioButton) viewInflate.findViewById(R$id.radio_button);
            }
            if (this.mDisableStatus[i]) {
                viewHolder.itemText.setEnabled(false);
                viewHolder.summaryText.setEnabled(false);
                if (this.mIsMultiChoice) {
                    viewHolder.checkBox.setEnabled(false);
                } else {
                    viewHolder.radioButton.setEnabled(false);
                }
                viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.adapter.ChoiceListAdapter.1
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
            viewInflate.setTag(viewHolder);
        } else {
            viewInflate = view;
            viewHolder = (ViewHolder) view.getTag();
        }
        if (this.mIsMultiChoice) {
            viewHolder.checkBox.setState(this.mCheckBoxStates[i] ? InnerCheckBox.INSTANCE.a() : InnerCheckBox.INSTANCE.b());
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.adapter.ChoiceListAdapter.2
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view2) {
                    View viewFindViewById = view2.findViewById(R$id.checkbox);
                    if (viewFindViewById instanceof NearCheckBox) {
                        NearCheckBox nearCheckBox = (NearCheckBox) viewFindViewById;
                        int state = nearCheckBox.getState();
                        InnerCheckBox.Companion companion = InnerCheckBox.INSTANCE;
                        if (state == companion.a()) {
                            nearCheckBox.setState(companion.b());
                            ChoiceListAdapter.this.mCheckBoxStates[i] = false;
                        } else {
                            nearCheckBox.setState(companion.a());
                            ChoiceListAdapter.this.mCheckBoxStates[i] = true;
                        }
                        if (ChoiceListAdapter.this.mMultiChoiceItemClickListener != null) {
                            ChoiceListAdapter.this.mMultiChoiceItemClickListener.onClick(i, nearCheckBox.getState() == companion.a());
                        }
                    } else if (viewFindViewById instanceof CheckBox) {
                        CheckBox checkBox = (CheckBox) viewFindViewById;
                        checkBox.setChecked(!checkBox.isChecked());
                        if (ChoiceListAdapter.this.mMultiChoiceItemClickListener != null) {
                            ChoiceListAdapter.this.mMultiChoiceItemClickListener.onClick(i, checkBox.isChecked());
                        }
                    }
                    SensorsDataAutoTrackHelper.trackViewOnClick(view2);
                }
            });
        } else {
            viewHolder.radioButton.setChecked(this.mCheckBoxStates[i]);
        }
        CharSequence item = getItem(i);
        CharSequence summary = getSummary(i);
        viewHolder.itemText.setText(item);
        if (TextUtils.isEmpty(summary)) {
            viewHolder.summaryText.setVisibility(8);
        } else {
            viewHolder.summaryText.setVisibility(0);
            viewHolder.summaryText.setText(summary);
        }
        if (!this.mIsMultiChoice && this.mLayoutResId == R$layout.nx_select_dialog_singlechoice) {
            int dimensionPixelOffset = i == getCount() - 1 ? this.mContext.getResources().getDimensionPixelOffset(R$dimen.alert_dialog_single_list_last_item_padding_bottom) : 0;
            setPaddingBottom(viewHolder.textLayout, dimensionPixelOffset);
            setPaddingBottom(viewHolder.radioLayout, dimensionPixelOffset);
        }
        return viewInflate;
    }

    public void setCheckboxState(int i, int i2, @NonNull ListView listView) {
        View childAt;
        NearCheckBox nearCheckBox;
        int firstVisiblePosition = i2 - listView.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || (childAt = listView.getChildAt(firstVisiblePosition)) == null) {
            return;
        }
        ViewHolder viewHolder = (ViewHolder) childAt.getTag();
        if (!this.mIsMultiChoice || (nearCheckBox = viewHolder.checkBox) == null) {
            return;
        }
        nearCheckBox.setState(i);
        this.mCheckBoxStates[i2] = i == InnerCheckBox.INSTANCE.a();
    }

    public void setMultiChoiceItemClickListener(MultiChoiceItemClickListener multiChoiceItemClickListener) {
        this.mMultiChoiceItemClickListener = multiChoiceItemClickListener;
    }

    public ChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, boolean[] zArr, boolean[] zArr2, boolean z) {
        this.mContext = context;
        this.mLayoutResId = i;
        this.mItems = charSequenceArr;
        this.mSummaries = charSequenceArr2;
        this.mIsMultiChoice = z;
        this.mCheckBoxStates = new boolean[charSequenceArr.length];
        if (zArr != null) {
            initCheckboxStates(zArr);
        }
        this.mDisableStatus = new boolean[this.mItems.length];
        if (zArr2 != null) {
            initCheckboxStatesDisable(zArr2);
        }
    }

    @Override // android.widget.Adapter
    public CharSequence getItem(int i) {
        CharSequence[] charSequenceArr = this.mItems;
        if (charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[i];
    }

    public ChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this(context, i, charSequenceArr, charSequenceArr2, null, false);
    }
}
