package com.heytap.health.settings.band.settings.about;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.device_settings.impl.R$string;
import com.oplus.aiunit.vision.n2;

/* JADX INFO: loaded from: classes17.dex */
public class AboutBandAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n2 f5311j;

    public static class a extends RecyclerView.ViewHolder {
        public final TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f5312j;
        public final ImageView k;

        public a(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
            this.f5312j = (TextView) view.findViewById(R$id.tv_desc);
            this.k = (ImageView) view.findViewById(R$id.img_arrow);
        }
    }

    public interface b {
        void b0(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        b bVar = this.i;
        if (bVar != null) {
            bVar.b0(i);
        }
    }

    public void e(n2 n2Var) {
        this.f5311j = n2Var;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        a aVar = (a) viewHolder;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            aVar.i.setText(R$string.band_about_sn);
            n2 n2Var = this.f5311j;
            if (n2Var != null && n2Var.b() != null) {
                aVar.f5312j.setText(this.f5311j.b());
            }
            aVar.k.setVisibility(8);
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            aVar.i.setText(R$string.band_about_law);
            aVar.f5312j.setVisibility(8);
            aVar.k.setVisibility(0);
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.m2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.lambda$onBindViewHolder$0(i, view);
                }
            });
            return;
        }
        aVar.i.setText(R$string.band_about_mac);
        n2 n2Var2 = this.f5311j;
        if (n2Var2 != null && n2Var2.a() != null) {
            aVar.f5312j.setText(this.f5311j.a());
        }
        aVar.k.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_about_item_comment, viewGroup, false));
    }

    public void setOnLawItemClickListener(b bVar) {
        this.i = bVar;
    }
}
