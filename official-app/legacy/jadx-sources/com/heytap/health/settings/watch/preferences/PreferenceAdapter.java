package com.heytap.health.settings.watch.preferences;

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
import com.oplus.aiunit.vision.cqe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class PreferenceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<cqe> f5450j;

    public class a implements COUISwitch.d {
        public final /* synthetic */ cqe a;

        public a(cqe cqeVar) {
            this.a = cqeVar;
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
        public final /* synthetic */ cqe a;

        public b(cqe cqeVar) {
            this.a = cqeVar;
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
        public TextView f5451j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public COUISwitch f5452l;
        public View m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public LinearLayout f5453n;

        public c(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
            this.f5451j = (TextView) view.findViewById(R$id.tv_des);
            this.k = (TextView) view.findViewById(R$id.tv_value);
            this.f5452l = (COUISwitch) view.findViewById(R$id.cswitch);
            this.m = view.findViewById(R$id.iv_jump_indicator);
            this.f5453n = (LinearLayout) view.findViewById(R$id.ll_container);
        }
    }

    public interface d {
        void h(int i, boolean z);

        void onItemClick(int i);
    }

    public PreferenceAdapter(List<cqe> list) {
        new ArrayList();
        this.f5450j = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(cqe cqeVar, View view) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.onItemClick(cqeVar.b());
        }
    }

    public void g(cqe cqeVar) {
        int size = this.f5450j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.f5450j.get(i).b() == cqeVar.b()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.f5450j.set(i, cqeVar);
            notifyItemChanged(i, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5450j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final cqe cqeVar = this.f5450j.get(i);
        c cVar = (c) viewHolder;
        cVar.k.setVisibility(8);
        cVar.m.setVisibility(0);
        if (TextUtils.isEmpty(cqeVar.c())) {
            cVar.i.setVisibility(8);
        } else {
            cVar.i.setVisibility(0);
            cVar.i.setText(cqeVar.c());
        }
        if (TextUtils.isEmpty(cqeVar.a())) {
            cVar.f5451j.setVisibility(8);
        } else {
            cVar.f5451j.setVisibility(0);
            cVar.f5451j.setText(cqeVar.a());
        }
        cVar.f5452l.setLoadingStyle(true);
        if (cqeVar.f()) {
            cVar.m.setVisibility(8);
            if (cVar.f5452l.isLoading()) {
                cVar.f5452l.stopLoading();
            }
            cVar.f5452l.setVisibility(0);
            cVar.f5452l.setOnLoadingStateChangedListener(new a(cqeVar));
            if (cqeVar.e() != cVar.f5452l.isChecked()) {
                cVar.f5452l.setChecked(cqeVar.e());
            }
        } else {
            if (cVar.f5452l.isLoading()) {
                cVar.f5452l.stopLoading();
            }
            cVar.f5452l.setVisibility(8);
        }
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.aqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.f(cqeVar, view);
            }
        });
        if (cqeVar.d()) {
            cVar.f5453n.setVisibility(8);
        } else {
            cVar.f5453n.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_sport_health_settings_item_secondery, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        ((c) viewHolder).f5452l.stopLoading();
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
        cqe cqeVar = this.f5450j.get(i);
        if (getItemViewType(i) == 3) {
            cVar.f5452l.setLoadingStyle(true);
            if (cVar.f5452l.isLoading()) {
                cVar.f5452l.stopLoading();
            }
            if (cqeVar.e() != cVar.f5452l.isChecked()) {
                cVar.f5452l.setChecked(cqeVar.e());
            }
            cVar.f5452l.setOnLoadingStateChangedListener(new b(cqeVar));
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }
}
