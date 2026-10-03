package com.heytap.health.watchface.business.creation.category.paint.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.oplus.aiunit.vision.hg8;
import com.oplus.aiunit.vision.ig8;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintLineAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public LayoutInflater i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6801j = 0;

    public static class a extends RecyclerView.ViewHolder {
        public ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f6802j;
        public RelativeLayout k;

        public a(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.hand_select_out_view);
            this.f6802j = (ImageView) view.findViewById(R$id.hand_select_in_view);
            this.k = (RelativeLayout) view.findViewById(R$id.layout_hand_paint_line_root);
        }
    }

    public HandPaintLineAdapter(Context context) {
        this.i = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ig8 ig8Var) {
        ig8Var.A0(this.f6801j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, a aVar, View view) {
        if (i == this.f6801j) {
            return;
        }
        this.f6801j = i;
        aVar.i.setVisibility(0);
        h();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    public final void h() {
        hg8.a().notifyObserver(new hg8.a() { // from class: com.oplus.aiunit.vision.lg8
            @Override // com.oplus.aiunit.vision.hg8.a
            public final void a(ig8 ig8Var) {
                this.a.f(ig8Var);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        final a aVar = (a) viewHolder;
        aVar.i.setVisibility(i == this.f6801j ? 0 : 8);
        if (i == 0) {
            aVar.f6802j.setImageResource(R$drawable.watch_face_hand_paint_line_silk);
        } else if (i == 1) {
            aVar.f6802j.setImageResource(R$drawable.watch_face_hand_paint_line_texture);
        }
        aVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.kg8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.g(i, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(this.i.inflate(R$layout.watch_face_hand_paint_line_item, viewGroup, false));
    }
}
