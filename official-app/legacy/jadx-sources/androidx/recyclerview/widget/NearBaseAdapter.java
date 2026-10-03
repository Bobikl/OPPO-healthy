package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.NearBaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class NearBaseAdapter<T, VH extends NearBaseViewHolder<T>> extends RecyclerView.Adapter<VH> {
    protected List<T> mList;
    protected WeakReference<OnItemClickListener<T>> mWeakReference;

    public NearBaseAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        WeakReference<OnItemClickListener<T>> weakReference = this.mWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.mWeakReference.get().onItemClick(i, this.mList.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public List<T> getList() {
        return this.mList;
    }

    public void setList(List<T> list) {
        this.mList = list;
    }

    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        WeakReference<OnItemClickListener<T>> weakReference;
        if (onItemClickListener != null || (weakReference = this.mWeakReference) == null) {
            this.mWeakReference = new WeakReference<>(onItemClickListener);
        } else {
            weakReference.clear();
        }
    }

    public NearBaseAdapter(List<T> list) {
        setList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull VH vh, final int i) {
        vh.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.cgc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
        vh.bind(this.mList.get(i), i);
    }
}
