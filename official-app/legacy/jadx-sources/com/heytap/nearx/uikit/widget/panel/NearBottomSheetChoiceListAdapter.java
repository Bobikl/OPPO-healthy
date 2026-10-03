package com.heytap.nearx.uikit.widget.panel;

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
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.internal.widget.InnerCheckBox;
import com.heytap.nearx.uikit.widget.NearCheckBox;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.HashSet;

/* JADX INFO: loaded from: classes18.dex */
class NearBottomSheetChoiceListAdapter extends RecyclerView.Adapter<ViewHolder> {
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
        NearCheckBox checkBox;
        TextView itemText;
        View mLayout;
        RadioButton radioButton;
        TextView summaryText;

        public ViewHolder(View view) {
            super(view);
            this.itemText = (TextView) view.findViewById(R.id.text1);
            this.summaryText = (TextView) view.findViewById(R$id.summary_text2);
            if (NearBottomSheetChoiceListAdapter.this.mIsMultiChoice) {
                this.checkBox = (NearCheckBox) view.findViewById(R$id.checkbox);
            } else {
                this.radioButton = (RadioButton) view.findViewById(R$id.radio_button);
            }
            view.setBackground(NearBottomSheetChoiceListAdapter.this.mContext.getDrawable(R$drawable.nx_list_selector_background));
            this.mLayout = view;
        }
    }

    public NearBottomSheetChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int i2, boolean[] zArr, boolean z) {
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
            viewHolder.checkBox.setState(this.mCheckBoxStates.contains(Integer.valueOf(i)) ? InnerCheckBox.INSTANCE.a() : InnerCheckBox.INSTANCE.b());
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
            viewHolder.mLayout.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.panel.NearBottomSheetChoiceListAdapter.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v12, types: [int] */
                /* JADX WARN: Type inference failed for: r0v29 */
                /* JADX WARN: Type inference failed for: r0v9 */
                /* JADX WARN: Type inference failed for: r1v5, types: [com.heytap.nearx.uikit.widget.panel.NearBottomSheetChoiceListAdapter$OnItemClickListener] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    ?? r0;
                    if (NearBottomSheetChoiceListAdapter.this.mIsMultiChoice) {
                        int state = viewHolder.checkBox.getState();
                        InnerCheckBox.Companion companion = InnerCheckBox.INSTANCE;
                        if (state != companion.a()) {
                            NearBottomSheetChoiceListAdapter.this.mCheckBoxStates.add(Integer.valueOf(i));
                        } else {
                            NearBottomSheetChoiceListAdapter.this.mCheckBoxStates.remove(Integer.valueOf(i));
                        }
                        int iA = NearBottomSheetChoiceListAdapter.this.mCheckBoxStates.contains(Integer.valueOf(i)) ? companion.a() : companion.b();
                        viewHolder.checkBox.setState(iA == true ? 1 : 0);
                        r0 = iA;
                    } else {
                        if (i == NearBottomSheetChoiceListAdapter.this.mCheckedItem) {
                            NearBottomSheetChoiceListAdapter.this.mOnItemClickListener.onItemClick(view, i, 0);
                            SensorsDataAutoTrackHelper.trackViewOnClick(view);
                            return;
                        }
                        boolean zIsChecked = viewHolder.radioButton.isChecked();
                        boolean z = !zIsChecked;
                        viewHolder.radioButton.setChecked(!zIsChecked);
                        NearBottomSheetChoiceListAdapter nearBottomSheetChoiceListAdapter = NearBottomSheetChoiceListAdapter.this;
                        nearBottomSheetChoiceListAdapter.notifyItemChanged(nearBottomSheetChoiceListAdapter.mCheckedItem);
                        NearBottomSheetChoiceListAdapter.this.mCheckedItem = i;
                        r0 = z;
                    }
                    NearBottomSheetChoiceListAdapter.this.mOnItemClickListener.onItemClick(view, i, r0);
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

    public NearBottomSheetChoiceListAdapter(Context context, int i, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, int i2) {
        this(context, i, charSequenceArr, charSequenceArr2, i2, null, false);
    }
}
