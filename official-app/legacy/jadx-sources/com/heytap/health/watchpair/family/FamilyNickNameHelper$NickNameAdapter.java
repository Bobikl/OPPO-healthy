package com.heytap.health.watchpair.family;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.e57;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FamilyNickNameHelper$NickNameAdapter extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<e57> f7160j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7161l;
    public int m;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView i;

        @SuppressLint({"ObsoleteSdkInt"})
        public ViewHolder(@NonNull View view, int i) {
            super(view);
            view.setForceDarkAllowed(false);
            this.i = (TextView) view.findViewById(i);
        }
    }

    public interface a {
        void onItemClick(int i);
    }

    public FamilyNickNameHelper$NickNameAdapter(Context context, List<e57> list, int i, int i2, a aVar) {
        this.i = context;
        this.f7160j = list;
        this.f7161l = i;
        this.m = i2;
        this.k = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        e57 e57Var = this.f7160j.get(i);
        viewHolder.i.setText(e57Var.a);
        viewHolder.i.setSelected(e57Var.b);
        viewHolder.itemView.setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.i).inflate(this.f7161l, viewGroup, false);
        viewInflate.setOnClickListener(this);
        return new ViewHolder(viewInflate, this.m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<e57> list = this.f7160j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.onItemClick(((Integer) view.getTag()).intValue());
        }
    }
}
