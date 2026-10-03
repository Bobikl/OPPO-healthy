package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.sports.home.compose.SportsKeepListComposeKt;
import com.support.dialog.R$id;
import com.support.dialog.R$layout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class mi2 extends RecyclerView.Adapter<a> {
    public final List<ni2> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f14075j;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14076l = 0;
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14077n = 16;
    public int o = SportsKeepListComposeKt.IMG_DEFAULT_WIDTH;

    public static class a extends RecyclerView.ViewHolder {
        public final ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f14078j;
        public final TextView k;

        public a(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.pager_item_im);
            this.f14078j = (TextView) view.findViewById(R$id.guide_tips_title);
            this.k = (TextView) view.findViewById(R$id.guide_tips_description);
        }
    }

    public mi2(@NonNull Context context, @NonNull List<ni2> list) {
        this.f14075j = context;
        this.i = new ArrayList(list);
    }

    public final int d(int i) {
        return Math.round(this.f14075j.getResources().getDisplayMetrics().density * i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        ni2 ni2Var = this.i.get(i);
        if (ni2Var.b() != 0) {
            aVar.i.setImageResource(ni2Var.b());
            aVar.i.setVisibility(0);
        } else {
            aVar.i.setVisibility(8);
        }
        aVar.f14078j.setText(ni2Var.c());
        aVar.k.setText(ni2Var.a());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.i.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(this.k, this.f14076l, this.m, this.f14077n);
            marginLayoutParams.height = d(this.o);
            aVar.i.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.coui_guide_page_item, viewGroup, false));
    }

    public void g(int i) {
        this.o = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    public void h(int i, int i2, int i3, int i4) {
        this.k = i;
        this.f14076l = i2;
        this.m = i3;
        this.f14077n = i4;
        notifyDataSetChanged();
    }
}
