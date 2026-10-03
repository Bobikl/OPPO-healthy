package com.heytap.store.base.core.view.search;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.protobuf.IconDetails;
import com.heytap.store.base.core.util.NullObjectUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchHotWordAdapter extends RecyclerView.Adapter<MViewHolder> {
    private List<IconDetails> mList;

    public static class MViewHolder extends RecyclerView.ViewHolder {
        private TextView mHotTag;
        private TextView mTextView;

        public MViewHolder(@NonNull View view) {
            super(view);
            this.mTextView = (TextView) view.findViewById(R.id.tv_message);
            this.mHotTag = (TextView) view.findViewById(R.id.tv_tag);
        }

        public void setTextColor(int i) {
            this.mTextView.setTextColor(this.itemView.getResources().getColor(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList != null ? Integer.MAX_VALUE : 0;
    }

    public IconDetails getItemData(int i) {
        if (NullObjectUtil.isNullOrEmpty(this.mList)) {
            return null;
        }
        List<IconDetails> list = this.mList;
        return list.get(i % list.size());
    }

    public void setList(List<IconDetails> list) {
        if (list == null) {
            return;
        }
        if (this.mList == null) {
            this.mList = new ArrayList();
        }
        int size = list.size();
        this.mList.clear();
        notifyItemRangeRemoved(0, size);
        this.mList.addAll(list);
        notifyItemRangeInserted(0, list.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull MViewHolder mViewHolder, int i) {
        List<IconDetails> list = this.mList;
        if (list == null || list.size() <= 0) {
            return;
        }
        List<IconDetails> list2 = this.mList;
        IconDetails iconDetails = list2.get(i % list2.size());
        mViewHolder.mTextView.setText(iconDetails.title);
        mViewHolder.itemView.setTag(iconDetails.link);
        if (NullObjectUtil.isNullOrEmpty(iconDetails.labelDetailss)) {
            mViewHolder.mHotTag.setVisibility(4);
        } else if (TextUtils.isEmpty(iconDetails.labelDetailss.get(0).name)) {
            mViewHolder.mHotTag.setVisibility(4);
        } else {
            mViewHolder.mHotTag.setVisibility(0);
            mViewHolder.mHotTag.setText(iconDetails.labelDetailss.get(0).name);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MViewHolder(View.inflate(viewGroup.getContext(), R.layout.pf_core_base_hot_word_item, null));
    }
}
