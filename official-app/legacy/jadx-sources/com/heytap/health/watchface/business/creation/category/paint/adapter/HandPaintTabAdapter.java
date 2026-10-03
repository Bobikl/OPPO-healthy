package com.heytap.health.watchface.business.creation.category.paint.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.creation.category.paint.widget.HandPaintColorInView;
import com.oplus.aiunit.vision.hg8;
import com.oplus.aiunit.vision.ig8;
import com.oplus.aiunit.vision.mg8;
import com.oplus.aiunit.vision.og8;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintTabAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ig8 {
    public static final int COUNT_FRAGMENTS = 3;
    public static final int POSITION_COLOR = 0;
    public static final int POSITION_LINE = 1;
    public static final int POSITION_SHAPE = 2;
    public final LayoutInflater i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f6807j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f6808l;
    public int m;

    public interface a {
        void G6(int i);
    }

    public static class b extends RecyclerView.ViewHolder {
        public ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f6809j;
        public HandPaintColorInView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public TextView f6810l;
        public View m;

        public b(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.iv_hand_paint_tab_selected_bg);
            this.f6809j = (ImageView) view.findViewById(R$id.iv_hand_paint_tab_select);
            this.k = (HandPaintColorInView) view.findViewById(R$id.view_hand_paint_color_select);
            this.m = view.findViewById(R$id.layout_hand_paint_tab_root);
            TextView textView = (TextView) view.findViewById(R$id.tv_title);
            this.f6810l = textView;
            textView.setSelected(true);
        }
    }

    public HandPaintTabAdapter(Context context, int i) {
        this.f6808l = null;
        this.m = 0;
        this.i = LayoutInflater.from(context);
        this.k = i;
        this.m = mg8.j().h()[0];
        this.f6808l = mg8.j().a();
        hg8.a().b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(int i, b bVar, View view) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        bVar.i.setVisibility(0);
        a aVar = this.f6807j;
        if (aVar != null) {
            aVar.G6(i);
        }
        notifyDataSetChanged();
    }

    @Override // com.oplus.aiunit.vision.ig8
    public void A0(int i) {
    }

    public void e() {
        hg8.a().c(this);
    }

    public void g(a aVar) {
        this.f6807j = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 3;
    }

    @Override // com.oplus.aiunit.vision.ig8
    public void i1(boolean z, String[] strArr) {
        this.f6808l = strArr;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        final b bVar = (b) viewHolder;
        bVar.i.setVisibility(i == this.k ? 0 : 8);
        if (i == 0) {
            bVar.f6809j.setImageResource(0);
            String[] strArr = this.f6808l;
            if (strArr == null || strArr.length <= 1) {
                bVar.k.setVisibility(8);
            } else {
                bVar.k.b(Color.parseColor(strArr[0]), Color.parseColor(this.f6808l[1]));
                bVar.k.setVisibility(0);
            }
            bVar.f6810l.setText(R$string.watch_face_paint_color);
        } else if (i == 1) {
            bVar.f6809j.setImageResource(R$drawable.watch_face_hand_paint_line);
            bVar.k.setVisibility(8);
            bVar.f6810l.setText(R$string.watch_face_paint_brush);
        } else {
            int i2 = this.m;
            if (i2 != 0) {
                bVar.f6809j.setImageResource(i2);
            }
            bVar.k.setVisibility(8);
            bVar.f6810l.setText(R$string.watch_face_paint_shape);
        }
        bVar.m.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rg8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.f(i, bVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(this.i.inflate(R$layout.watch_face_hand_paint_tab_select, viewGroup, false));
    }

    @Override // com.oplus.aiunit.vision.ig8
    public void p0(og8 og8Var, int i, int i2) {
        this.m = i;
        notifyDataSetChanged();
    }
}
