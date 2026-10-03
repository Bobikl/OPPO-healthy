package com.heytap.health.step.card.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.step.R$color;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;
import com.oplus.aiunit.vision.qe0;

/* JADX INFO: loaded from: classes18.dex */
public class CalendarHeaderAdapter extends RecyclerView.Adapter<a> {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f5953j;

    public class a extends RecyclerView.ViewHolder {
        public TextView i;

        public a(View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.calendar_day);
        }
    }

    public CalendarHeaderAdapter(Context context, String[] strArr) {
        this.i = context;
        this.f5953j = strArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        if (qe0.y(this.i)) {
            aVar.i.setTextColor(this.i.getColor(R$color.step_card_calendar_header_text_color_night));
        } else {
            aVar.i.setTextColor(this.i.getColor(R$color.step_card_calendar_header_text_color));
        }
        aVar.i.setText(this.f5953j[i]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.i).inflate(R$layout.step_fragment_step_card_calendar_header_recycle_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5953j.length;
    }
}
