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
import com.oplus.aiunit.vision.mg8;
import com.oplus.aiunit.vision.og8;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintShapeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final LayoutInflater m;
    public final Context o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6805n = 0;
    public final og8 p = new og8();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f6803j = mg8.j().e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f6804l = mg8.j().f();
    public final int[] i = mg8.j().h();
    public final int[] k = mg8.j().g();

    public static class a extends RecyclerView.ViewHolder {
        public ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f6806j;
        public RelativeLayout k;

        public a(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.hand_shape_out_view);
            this.f6806j = (ImageView) view.findViewById(R$id.hand_shape_in_view);
            this.k = (RelativeLayout) view.findViewById(R$id.layout_hand_paint_shape_root);
        }
    }

    public HandPaintShapeAdapter(Context context) {
        this.o = context;
        this.m = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ig8 ig8Var) {
        og8 og8Var = this.p;
        int[] iArr = this.i;
        int i = this.f6805n;
        ig8Var.p0(og8Var, iArr[i], i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        if (i == this.f6805n) {
            return;
        }
        this.f6805n = i;
        g();
        notifyDataSetChanged();
    }

    public final void g() {
        this.p.d(this.f6803j[this.f6805n] == 1);
        this.p.e(this.f6804l[this.f6805n]);
        this.p.f(this.k[this.f6805n]);
        hg8.a().notifyObserver(new hg8.a() { // from class: com.oplus.aiunit.vision.qg8
            @Override // com.oplus.aiunit.vision.hg8.a
            public final void a(ig8 ig8Var) {
                this.a.f(ig8Var);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        a aVar = (a) viewHolder;
        if (i == this.f6805n) {
            aVar.i.setBackground(this.o.getDrawable(R$drawable.watch_face_handpaint_shape_select));
        } else {
            aVar.i.setBackground(this.o.getDrawable(R$drawable.watch_face_handpaint_shape_no_select));
        }
        aVar.f6806j.setImageResource(this.i[i]);
        aVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pg8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(this.m.inflate(R$layout.watch_face_hand_paint_shape_select, viewGroup, false));
    }
}
