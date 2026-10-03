package com.heytap.health.wallet.bus.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.bus.R$id;
import com.heytap.health.wallet.bus.R$layout;
import com.heytap.health.wallet.bus.model.BusTag;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.yu5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class BusTagAdapter extends RecyclerView.Adapter<a> {
    public List<BusTag.CardTagBean> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f6202j;

    public static class TagViewHolder extends a {
        public TextView i;

        public TagViewHolder(View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_name);
        }
    }

    public static class a extends RecyclerView.ViewHolder {
        public a(View view) {
            super(view);
        }
    }

    public BusTagAdapter(Context context) {
        this.f6202j = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        if (drk.e(this.i) || this.i.get(i) == null) {
            return;
        }
        String text = this.i.get(i).getText();
        String text_color = this.i.get(i).getText_color();
        String border_color = this.i.get(i).getBorder_color();
        t6b.a("BusTagAdapter, name: " + text + " text_color: " + text_color + "  border_color: " + border_color);
        if (TextUtils.isEmpty(text)) {
            return;
        }
        TagViewHolder tagViewHolder = (TagViewHolder) aVar;
        tagViewHolder.i.setText(text);
        if (!TextUtils.isEmpty(text_color)) {
            tagViewHolder.i.setTextColor(Color.parseColor(text_color));
        }
        Drawable background = tagViewHolder.i.getBackground();
        if (!(background instanceof GradientDrawable) || TextUtils.isEmpty(border_color)) {
            return;
        }
        ((GradientDrawable) background).setStroke(yu5.a(this.f6202j, 0.67f), Color.parseColor(border_color));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new TagViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_bus_tag, viewGroup, false));
    }

    public void f(List<BusTag.CardTagBean> list) {
        this.i.clear();
        if (!drk.e(list)) {
            this.i.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (drk.e(this.i)) {
            return 0;
        }
        return this.i.size();
    }
}
