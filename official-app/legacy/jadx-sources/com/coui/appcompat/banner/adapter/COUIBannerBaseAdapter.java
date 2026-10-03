package com.coui.appcompat.banner.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.coui.appcompat.recyclerview.COUIBaseAdapter;
import com.coui.appcompat.recyclerview.COUIBaseViewHolder;
import com.oplus.aiunit.vision.kf2;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUIBannerBaseAdapter<T, VH extends COUIBaseViewHolder<T>> extends COUIBaseAdapter<T, VH> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1545j = 1;

    @Override // com.coui.appcompat.recyclerview.COUIBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public void onBindViewHolder(@NonNull VH vh, int i) {
        if (isIncreased()) {
            super.onBindViewHolder(vh, getRealPosition(i));
        } else {
            super.onBindViewHolder(vh, i);
        }
    }

    public abstract VH f(View view);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewOnCreateExpandView;
        if (isIncreased()) {
            viewOnCreateExpandView = onCreateNormalView(viewGroup, i);
            if (viewOnCreateExpandView.getLayoutParams() == null || viewOnCreateExpandView.getLayoutParams().width != -1 || viewOnCreateExpandView.getLayoutParams().height != -1) {
                throw new IllegalArgumentException("The width and height of the view must be 'MATCH_PARENT' when onCreateNormalView(parent, viewType) ");
            }
        } else {
            viewOnCreateExpandView = onCreateExpandView(viewGroup, i);
        }
        return (VH) f(viewOnCreateExpandView);
    }

    public int getAdapterType() {
        return this.f1545j;
    }

    @Override // com.coui.appcompat.recyclerview.COUIBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return isIncreased() ? getRealCount() + 2 : super.getItemCount();
    }

    public int getRealCount() {
        List<T> list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getRealPosition(int i) {
        return kf2.a(isIncreased(), i, getRealCount());
    }

    public boolean isIncreased() {
        return getAdapterType() == 0;
    }

    public abstract View onCreateExpandView(ViewGroup viewGroup, int i);

    public abstract View onCreateNormalView(ViewGroup viewGroup, int i);

    public void setAdapterType(int i) {
        this.f1545j = i;
    }
}
