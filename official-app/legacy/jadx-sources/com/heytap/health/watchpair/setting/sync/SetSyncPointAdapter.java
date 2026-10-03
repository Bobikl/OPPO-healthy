package com.heytap.health.watchpair.setting.sync;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchpair.R$drawable;
import com.heytap.health.watchpair.R$layout;
import com.oplus.aiunit.vision.qe0;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SetSyncPointAdapter extends RecyclerView.Adapter<PointHolder> {
    public List<Boolean> i;

    public static class PointHolder extends RecyclerView.ViewHolder {
        public PointHolder(@NonNull View view) {
            super(view);
            qe0.G(view, false);
        }
    }

    public SetSyncPointAdapter(List<Boolean> list) {
        this.i = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull PointHolder pointHolder, int i) {
        pointHolder.itemView.setBackgroundResource(this.i.get(i).booleanValue() ? R$drawable.sync_point_select : R$drawable.sync_point_unselect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PointHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PointHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_sync_point, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }
}
