package com.heytap.health.wallet.entrance.autoswitch.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.services.help.Tip;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.j1l;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.xsc;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes18.dex */
public class MapPositionAdapter extends RecyclerView.Adapter<PositionViewHolder> {
    public List<Tip> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f6229j;
    public b k;

    public static class PositionViewHolder extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6230j;
        public HealthButton k;

        public PositionViewHolder(View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tvName);
            this.f6230j = (TextView) view.findViewById(R$id.tvAddress);
            HealthButton healthButton = (HealthButton) view.findViewById(R$id.btnSelect);
            this.k = healthButton;
            j1l.b(healthButton);
        }
    }

    public class a extends xsc {
        public final /* synthetic */ Tip k;

        public a(Tip tip) {
            this.k = tip;
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
            if (MapPositionAdapter.this.k != null) {
                MapPositionAdapter.this.k.a(this.k);
            }
        }
    }

    public interface b {
        void a(Tip tip);
    }

    public MapPositionAdapter(Context context) {
        this.f6229j = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Tip tip) {
        t6b.a("Location item getAddress = " + tip.getAddress());
        if (tip.getAddress().isEmpty() || tip.getPoint() == null) {
            return;
        }
        this.i.add(tip);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull PositionViewHolder positionViewHolder, int i) {
        if (drk.e(this.i) || this.i.get(i) == null) {
            return;
        }
        Tip tip = this.i.get(i);
        positionViewHolder.i.setText(tip.getName());
        if (TextUtils.isEmpty(tip.getAddress())) {
            positionViewHolder.f6230j.setVisibility(8);
        } else {
            positionViewHolder.f6230j.setText(tip.getAddress());
            positionViewHolder.f6230j.setVisibility(0);
        }
        positionViewHolder.k.setOnClickListener(new a(tip));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (drk.e(this.i)) {
            return 0;
        }
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public PositionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PositionViewHolder(LayoutInflater.from(this.f6229j).inflate(R$layout.item_map_position, viewGroup, false));
    }

    public void i(List<Tip> list) {
        this.i.clear();
        if (!drk.e(list)) {
            list.forEach(new Consumer() { // from class: com.oplus.aiunit.vision.lfb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.i.f((Tip) obj);
                }
            });
            t6b.a("Location item mList = " + this.i);
        }
        notifyDataSetChanged();
    }

    public void setOnSelectListener(b bVar) {
        this.k = bVar;
    }
}
