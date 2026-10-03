package com.heytap.health.settings.watch.aboutwatch.law.opensource.AppOpenSource;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.ya0;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class AppListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static int ITEM_TYPE_CONTENT = 1;
    public static int ITEM_TYPE_DIVIDER;
    public List<ya0> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f5433j;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView i;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
        }
    }

    public interface a {
        void M5(ya0 ya0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ya0 ya0Var, View view) {
        a aVar = this.f5433j;
        if (aVar != null) {
            aVar.M5(ya0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == ITEM_TYPE_CONTENT) {
            final ya0 ya0Var = this.i.get(i);
            viewHolder.i.setText(ya0Var.a().a);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.e(ya0Var, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return i == ITEM_TYPE_DIVIDER ? new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_item_divider_1, viewGroup, false)) : new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_watch_about_watch_item_common, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (lza.a(this.i)) {
            return 0;
        }
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.i.get(i).b();
    }

    public void h(List<ya0> list) {
        this.i = list;
        notifyDataSetChanged();
    }

    public void setonItemClickListener(a aVar) {
        this.f5433j = aVar;
    }
}
