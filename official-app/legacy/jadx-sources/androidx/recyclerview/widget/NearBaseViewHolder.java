package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class NearBaseViewHolder<T> extends RecyclerView.ViewHolder {
    public NearBaseViewHolder(@NonNull View view) {
        super(view);
    }

    public abstract void bind(T t, int i);
}
