package com.heytap.health.settings.watch.schoolmode.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.oplus.aiunit.vision.upl;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WeekdaySettingAdapter extends RecyclerView.Adapter<b> {
    public List<upl> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f5482j;

    public interface a {
        void T(int i);
    }

    public static class b extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f5483j;

        public b(@NonNull View view) {
            super(view);
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f5483j = (TextView) view.findViewById(R$id.tv_weekday);
        }
    }

    public WeekdaySettingAdapter(List<upl> list) {
        this.i = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        a aVar = this.f5482j;
        if (aVar != null) {
            aVar.T(i);
        }
    }

    public upl e(int i) {
        List<upl> list = this.i;
        if (list != null && i < list.size()) {
            return this.i.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, final int i) {
        upl uplVar = this.i.get(i);
        bVar.f5483j.setText(uplVar.a());
        bVar.i.setState(uplVar.b() ? 2 : 0);
        bVar.i.setClickable(false);
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_item_weekday_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<upl> list = this.i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void h(List<upl> list) {
        this.i.clear();
        this.i.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(a aVar) {
        this.f5482j = aVar;
    }
}
