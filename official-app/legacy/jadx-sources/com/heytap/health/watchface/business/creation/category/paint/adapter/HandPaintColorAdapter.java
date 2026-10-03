package com.heytap.health.watchface.business.creation.category.paint.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.creation.category.paint.widget.HandPaintColorInView;
import com.heytap.health.watchface.business.creation.category.paint.widget.HandPaintColorPickThumbView;
import com.heytap.health.watchface.business.creation.category.paint.widget.HandPaintColorPickView;
import com.oplus.aiunit.vision.gg8;
import com.oplus.aiunit.vision.hg8;
import com.oplus.aiunit.vision.ja4;
import com.oplus.aiunit.vision.mg8;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintColorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LayoutInflater f6797l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f6798n;
    public int k = -1;
    public final String[] i = mg8.j().d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f6796j = mg8.j().c();

    public static class a extends RecyclerView.ViewHolder {
        public ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HandPaintColorPickThumbView f6799j;
        public RelativeLayout k;

        public a(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.color_pick_out_view);
            this.f6799j = (HandPaintColorPickThumbView) view.findViewById(R$id.aod_hand_paint_color_pick_in_view);
            this.k = (RelativeLayout) view.findViewById(R$id.layout_hand_paint_color_root);
        }
    }

    public static class b extends RecyclerView.ViewHolder {
        public ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HandPaintColorInView f6800j;
        public RelativeLayout k;

        public b(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.aod_hand_paint_color_out_view);
            this.f6800j = (HandPaintColorInView) view.findViewById(R$id.view_hand_paint_color_select);
            this.k = (RelativeLayout) view.findViewById(R$id.layout_hand_paint_color_root);
        }
    }

    public HandPaintColorAdapter(Context context) {
        this.m = 1;
        this.f6798n = context;
        this.f6797l = LayoutInflater.from(context);
        this.m = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i, b bVar, View view) {
        if (i == this.m) {
            return;
        }
        this.m = i;
        bVar.i.setVisibility(0);
        m(false, new String[]{this.i[i], this.f6796j[i]});
        this.k = -1;
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i, int i2) {
        this.m = i;
        this.k = i2;
        m(true, new String[]{ja4.a(i2, true), ja4.a(this.k, true)});
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(final int i, View view) {
        gg8.d().g(this.f6798n, this.k, new HandPaintColorPickView.a() { // from class: com.oplus.aiunit.vision.cg8
            @Override // com.heytap.health.watchface.business.creation.category.paint.widget.HandPaintColorPickView.a
            public final void a(int i2) {
                this.a.k(i, i2);
            }
        });
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.length + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == this.i.length ? 1 : 0;
    }

    public void h() {
        gg8.d().c();
    }

    public final void m(final boolean z, final String[] strArr) {
        hg8.a().notifyObserver(new hg8.a() { // from class: com.oplus.aiunit.vision.dg8
            @Override // com.oplus.aiunit.vision.hg8.a
            public final void a(ig8 ig8Var) {
                ig8Var.i1(z, strArr);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            final b bVar = (b) viewHolder;
            bVar.f6800j.b(Color.parseColor(this.i[i]), Color.parseColor(this.f6796j[i]));
            bVar.i.setVisibility(i == this.m ? 0 : 4);
            bVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ag8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.j(i, bVar, view);
                }
            });
        }
        if (itemViewType == 1) {
            a aVar = (a) viewHolder;
            int i2 = this.k;
            if (i2 == -1) {
                aVar.f6799j.a();
                aVar.i.setVisibility(4);
            } else {
                aVar.f6799j.c(i2, true);
                aVar.i.setVisibility(0);
            }
            aVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bg8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.l(i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return i == 1 ? new a(this.f6797l.inflate(R$layout.watch_face_hand_paint_color_pick, viewGroup, false)) : new b(this.f6797l.inflate(R$layout.watch_face_hand_paint_color_select, viewGroup, false));
    }
}
