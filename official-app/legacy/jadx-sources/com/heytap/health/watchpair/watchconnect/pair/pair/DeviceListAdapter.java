package com.heytap.health.watchpair.watchconnect.pair.pair;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchpair.R$id;
import com.heytap.health.watchpair.R$layout;
import com.oplus.aiunit.vision.d6e;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceListAdapter extends RecyclerView.Adapter<b> {
    public List<d6e> i = new LinkedList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f7198j;

    public interface a {
        void a(View view, int i);
    }

    public class b extends RecyclerView.ViewHolder {
        public TextView i;

        public b(View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.device_name);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rj5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.i.b(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (DeviceListAdapter.this.f7198j != null) {
                DeviceListAdapter.this.f7198j.a(view, getLayoutPosition());
            }
        }
    }

    public void e() {
        this.i.clear();
        notifyDataSetChanged();
    }

    public d6e f(int i) {
        List<d6e> list = this.i;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.i.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i) {
        d6e d6eVar = this.i.get(i);
        StringBuilder sb = new StringBuilder();
        sb.append("device list show name ");
        sb.append(d6eVar.b());
        bVar.i.setText(d6eVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<d6e> list = this.i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.decice_list_item, viewGroup, false));
    }

    public void i(a aVar) {
        this.f7198j = aVar;
    }

    public void j(Set<d6e> set) {
        this.i.clear();
        if (set != null) {
            this.i.addAll(set);
            StringBuilder sb = new StringBuilder();
            sb.append(" data:");
            sb.append(set.toString());
        }
        notifyDataSetChanged();
    }
}
