package com.coui.appcompat.panel;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$drawable;
import com.support.dialog.R$id;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBottomSheetChoiceListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private HashSet<Integer> mCheckBoxStates;
    private int mCheckedItem;
    private Context mContext;
    private boolean mIsMultiChoice;
    private CharSequence[] mItems;
    private int mLayoutResId;
    private OnItemClickListener mOnItemClickListener;
    private CharSequence[] mSummaries;

    public interface OnItemClickListener {
        void onItemClick(View view, int i, int i2);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        COUICheckBox checkBox;
        TextView itemText;
        View mLayout;
        RadioButton radioButton;
        TextView summaryText;

        public ViewHolder(View view) {
            super(view);
            this.itemText = (TextView) view.findViewById(R.id.text1);
            this.summaryText = (TextView) view.findViewById(R$id.summary_text2);
            if (COUIBottomSheetChoiceListAdapter.this.mIsMultiChoice) {
                this.checkBox = (COUICheckBox) view.findViewById(R$id.checkbox);
            } else {
                this.radioButton = (RadioButton) view.findViewById(R$id.radio_button);
            }
            view.setBackground(COUIBottomSheetChoiceListAdapter.this.mContext.getDrawable(R$drawable.coui_list_selector_background));
            this.mLayout = view;
        }
    }

    public COUIBottomSheetChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int i2, boolean[] zArr, boolean z) {
        this.mCheckedItem = -1;
        this.mContext = context;
        this.mLayoutResId = i;
        this.mItems = charSequenceArr;
        this.mSummaries = charSequenceArr2;
        this.mIsMultiChoice = z;
        this.mCheckBoxStates = new HashSet<>();
        this.mCheckedItem = i2;
        if (zArr != null) {
            initCheckboxStates(zArr);
        }
    }

    private void initCheckboxStates(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                this.mCheckBoxStates.add(Integer.valueOf(i));
            }
        }
    }

    public CharSequence getItem(int i) {
        CharSequence[] charSequenceArr = this.mItems;
        if (charSequenceArr == null || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        CharSequence[] charSequenceArr = this.mItems;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public CharSequence getSummary(int i) {
        CharSequence[] charSequenceArr = this.mSummaries;
        if (charSequenceArr == null || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        if (this.mIsMultiChoice) {
            viewHolder.checkBox.setState(this.mCheckBoxStates.contains(Integer.valueOf(i)) ? 2 : 0);
        } else {
            viewHolder.radioButton.setChecked(this.mCheckedItem == i);
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
        if (this.mOnItemClickListener != null) {
            viewHolder.mLayout.setOnClickListener(new View.OnClickListener() { // from class: com.coui.appcompat.panel.COUIBottomSheetChoiceListAdapter.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    int i2;
                    if (COUIBottomSheetChoiceListAdapter.this.mIsMultiChoice) {
                        if (viewHolder.checkBox.getState() != 2) {
                            COUIBottomSheetChoiceListAdapter.this.mCheckBoxStates.add(Integer.valueOf(i));
                        } else {
                            COUIBottomSheetChoiceListAdapter.this.mCheckBoxStates.remove(Integer.valueOf(i));
                        }
                        i2 = COUIBottomSheetChoiceListAdapter.this.mCheckBoxStates.contains(Integer.valueOf(i)) ? 2 : 0;
                        viewHolder.checkBox.setState(i2);
                    } else {
                        if (i == COUIBottomSheetChoiceListAdapter.this.mCheckedItem) {
                            COUIBottomSheetChoiceListAdapter.this.mOnItemClickListener.onItemClick(view, i, 0);
                            SensorsDataAutoTrackHelper.trackViewOnClick(view);
                            return;
                        }
                        boolean zIsChecked = viewHolder.radioButton.isChecked();
                        i2 = !zIsChecked ? 1 : 0;
                        viewHolder.radioButton.setChecked(!zIsChecked);
                        COUIBottomSheetChoiceListAdapter cOUIBottomSheetChoiceListAdapter = COUIBottomSheetChoiceListAdapter.this;
                        cOUIBottomSheetChoiceListAdapter.notifyItemChanged(cOUIBottomSheetChoiceListAdapter.mCheckedItem);
                        COUIBottomSheetChoiceListAdapter.this.mCheckedItem = i;
                    }
                    COUIBottomSheetChoiceListAdapter.this.mOnItemClickListener.onItemClick(view, i, i2);
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.mContext).inflate(this.mLayoutResId, viewGroup, false));
    }

    public COUIBottomSheetChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int i2) {
        this(context, i, charSequenceArr, charSequenceArr2, i2, null, false);
    }
}
