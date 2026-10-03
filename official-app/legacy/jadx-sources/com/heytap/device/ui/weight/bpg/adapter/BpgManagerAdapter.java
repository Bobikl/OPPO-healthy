package com.heytap.device.ui.weight.bpg.adapter;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.device.R$id;
import com.heytap.device.R$layout;
import com.heytap.health.base.base.BaseApplication;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class BpgManagerAdapter extends RecyclerView.Adapter<b> {
    public List<a> i = new ArrayList();

    public static class a {
        public String a;

        @IdRes
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ColorRes
        public int f3041c = R.color.black;
        public View.OnClickListener d;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.f3041c;
        }

        public String c() {
            return this.a;
        }

        public a d(View.OnClickListener onClickListener) {
            this.d = onClickListener;
            return this;
        }

        public a e(int i) {
            this.f3041c = i;
            return this;
        }
    }

    public static class b extends RecyclerView.ViewHolder {
        public final TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImageView f3042j;

        public b(@NonNull View view) {
            super(view);
            this.f3042j = (ImageView) view.findViewById(R$id.iv_bpg_item_manager_img);
            this.i = (TextView) view.findViewById(R$id.tv_bpg_item_manager_value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(b bVar, View view) {
        View.OnClickListener onClickListener = this.i.get(bVar.getLayoutPosition()).d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void f(List<a> list) {
        List<a> list2 = this.i;
        if (list2 != list) {
            list2.clear();
            this.i.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i) {
        a aVar = this.i.get(i);
        bVar.f3042j.setImageResource(aVar.a());
        bVar.i.setText(aVar.c());
        bVar.i.setTextColor(ContextCompat.getColor(BaseApplication.a(), aVar.b()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final b bVar = new b(LayoutInflater.from(BaseApplication.a()).inflate(R$layout.device_bpg_item_manager, viewGroup, false));
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.x32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.e(bVar, view);
            }
        });
        return bVar;
    }
}
