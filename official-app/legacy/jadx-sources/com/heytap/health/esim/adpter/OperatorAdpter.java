package com.heytap.health.esim.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.esim.R$id;
import com.heytap.health.esim.R$layout;
import com.oplus.aiunit.vision.OperatorItemBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class OperatorAdpter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "EsimHealth.OperatorAdpter";
    public List<OperatorItemBean> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f4133j;
    public final a k;

    public interface a {
        void a(View view, OperatorItemBean operatorItemBean);
    }

    public static class b extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f4134j;
        public RelativeLayout k;

        public b(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.operator_tv);
            this.f4134j = (ImageView) view.findViewById(R$id.operator_iv);
            this.k = (RelativeLayout) view.findViewById(R$id.operator_rlyt);
        }
    }

    public static class c extends RecyclerView.ViewHolder {
        public TextView i;

        public c(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.operator_open_title_tv);
        }
    }

    public OperatorAdpter(Context context, a aVar) {
        this.f4133j = context;
        this.k = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(OperatorItemBean operatorItemBean, View view) {
        this.k.a(view, operatorItemBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.i.get(i).getRvItemType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final OperatorItemBean operatorItemBean = this.i.get(i);
        String message = operatorItemBean.getMessage();
        if (viewHolder instanceof c) {
            ((c) viewHolder).i.setText(message);
        } else if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            bVar.i.setText(message);
            bVar.f4134j.setImageResource(operatorItemBean.getIconResId());
            bVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.fnd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.e(operatorItemBean, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateViewHolder viewType = ");
        sb.append(i);
        return 1 == i ? new c(LayoutInflater.from(this.f4133j).inflate(R$layout.operator_title_item, viewGroup, false)) : new b(LayoutInflater.from(this.f4133j).inflate(R$layout.operator_item, viewGroup, false));
    }

    public void setData(List<OperatorItemBean> list) {
        this.i.clear();
        if (list == null) {
            return;
        }
        this.i = list;
    }
}
