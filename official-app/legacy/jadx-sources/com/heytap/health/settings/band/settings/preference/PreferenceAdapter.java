package com.heytap.health.settings.band.settings.preference;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.oplus.aiunit.vision.dqe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class PreferenceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<dqe> f5318j = new ArrayList();

    public class a implements COUISwitch.d {
        public final /* synthetic */ dqe a;

        public a(dqe dqeVar) {
            this.a = dqeVar;
        }

        @Override // com.coui.appcompat.couiswitch.COUISwitch.d
        public void onStartLoading() {
            if (PreferenceAdapter.this.i != null) {
                PreferenceAdapter.this.i.h(this.a.b(), !this.a.e());
            }
        }

        @Override // com.coui.appcompat.couiswitch.COUISwitch.d
        public void onStopLoading() {
        }
    }

    public class b implements COUISwitch.d {
        public final /* synthetic */ dqe a;

        public b(dqe dqeVar) {
            this.a = dqeVar;
        }

        @Override // com.coui.appcompat.couiswitch.COUISwitch.d
        public void onStartLoading() {
            if (PreferenceAdapter.this.i != null) {
                PreferenceAdapter.this.i.h(this.a.b(), !this.a.e());
            }
        }

        @Override // com.coui.appcompat.couiswitch.COUISwitch.d
        public void onStopLoading() {
        }
    }

    public static class c extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f5319j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public COUISwitch f5320l;
        public View m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public LinearLayout f5321n;

        public c(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
            this.f5319j = (TextView) view.findViewById(R$id.tv_des);
            this.k = (TextView) view.findViewById(R$id.tv_value);
            this.f5320l = (COUISwitch) view.findViewById(R$id.cswitch);
            this.m = view.findViewById(R$id.iv_jump_indicator);
            this.f5321n = (LinearLayout) view.findViewById(R$id.ll_container);
        }
    }

    public interface d {
        void h(int i, boolean z);

        void onItemClick(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(dqe dqeVar, View view) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.onItemClick(dqeVar.b());
        }
    }

    public void g(List<dqe> list) {
        this.f5318j.clear();
        this.f5318j.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5318j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f5318j.get(i).b();
    }

    public void h(dqe dqeVar) {
        int size = this.f5318j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.f5318j.get(i).b() == dqeVar.b()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.f5318j.set(i, dqeVar);
            notifyItemChanged(i, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final dqe dqeVar = this.f5318j.get(i);
        c cVar = (c) viewHolder;
        cVar.k.setVisibility(8);
        cVar.m.setVisibility(0);
        if (TextUtils.isEmpty(dqeVar.c())) {
            cVar.i.setVisibility(8);
        } else {
            cVar.i.setVisibility(0);
            cVar.i.setText(dqeVar.c());
        }
        if (TextUtils.isEmpty(dqeVar.a())) {
            cVar.f5319j.setVisibility(8);
        } else {
            cVar.f5319j.setVisibility(0);
            cVar.f5319j.setText(dqeVar.a());
        }
        cVar.f5320l.setLoadingStyle(true);
        if (dqeVar.f()) {
            cVar.m.setVisibility(8);
            if (cVar.f5320l.isLoading()) {
                cVar.f5320l.stopLoading();
            }
            cVar.f5320l.setVisibility(0);
            cVar.f5320l.setOnLoadingStateChangedListener(new a(dqeVar));
            if (dqeVar.e() != cVar.f5320l.isChecked()) {
                cVar.f5320l.setChecked(dqeVar.e());
            }
        } else {
            if (cVar.f5320l.isLoading()) {
                cVar.f5320l.stopLoading();
            }
            cVar.f5320l.setVisibility(8);
        }
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.f(dqeVar, view);
            }
        });
        if (dqeVar.d()) {
            cVar.f5321n.setVisibility(8);
        } else {
            cVar.f5321n.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_sport_health_settings_item_secondery, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        ((c) viewHolder).f5320l.stopLoading();
        super.onViewDetachedFromWindow(viewHolder);
    }

    public void setOnItemClickListener(d dVar) {
        this.i = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        c cVar = (c) viewHolder;
        dqe dqeVar = this.f5318j.get(i);
        cVar.f5320l.setLoadingStyle(true);
        int itemViewType = getItemViewType(i);
        if (itemViewType == -5) {
            if (cVar.f5320l.isLoading()) {
                cVar.f5320l.stopLoading();
            }
            if (dqeVar.e() != cVar.f5320l.isChecked()) {
                cVar.f5320l.setChecked(dqeVar.e());
            }
            cVar.f5320l.setOnLoadingStateChangedListener(new b(dqeVar));
            return;
        }
        if (itemViewType == -3 || itemViewType == -2 || itemViewType == -1) {
            if (TextUtils.isEmpty(dqeVar.a())) {
                cVar.f5319j.setVisibility(8);
            } else {
                cVar.f5319j.setVisibility(0);
                cVar.f5319j.setText(dqeVar.a());
            }
        }
    }
}
