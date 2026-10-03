package com.heytap.health.step.card.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.heytap.health.step.R$layout;
import com.heytap.health.step.card.data.StepCardBean;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

/* JADX INFO: loaded from: classes18.dex */
public class CalendarMonthViewAdapter extends StepCardCalendarBaseAdapter {
    public DayOfWeek k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5956l;

    public CalendarMonthViewAdapter(Context context, StepCardBean stepCardBean) {
        super(context, stepCardBean);
        this.f5956l = 0;
        this.k = this.f5957j.getFirstDateOfMonth().with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return (this.k.getValue() - 1) + this.f5957j.getFirstDateOfMonth().lengthOfMonth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f5956l;
    }

    public final int i(int i) {
        if (i < this.f5957j.getDayPunchStatus().length) {
            return this.f5957j.getDayPunchStatus()[i];
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull StepCardCalendarBaseAdapter.Holder holder, int i) {
        if (i < this.k.getValue() - 1) {
            holder.i.setVisibility(8);
            holder.f5958j.setVisibility(8);
            return;
        }
        holder.i.setVisibility(0);
        int value = (i - this.k.getValue()) + 1;
        if (e(this.f5957j.getAllDay()[value])) {
            holder.f5958j.setVisibility(0);
        } else {
            holder.f5958j.setVisibility(4);
        }
        holder.i.setText(String.valueOf(value + 1));
        if (d(this.f5957j.getAllDay()[value]) || (e(this.f5957j.getAllDay()[value]) && this.f5957j.getDayPunchStatus()[value] == 0)) {
            f(holder.i);
        } else if (i(value) == 0) {
            h(holder.i);
        } else {
            g(holder.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public StepCardCalendarBaseAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new StepCardCalendarBaseAdapter.Holder(this.f5956l == 0 ? LayoutInflater.from(this.i).inflate(R$layout.step_fragment_step_card_calendar_item, viewGroup, false) : LayoutInflater.from(this.i).inflate(R$layout.step_fragment_step_card_calendar_item_resize, viewGroup, false));
    }

    public void l(int i) {
        this.f5956l = i;
    }

    public void m(StepCardBean stepCardBean) {
        this.f5957j = stepCardBean;
        notifyDataSetChanged();
    }

    public void n(int i, int i2) {
        if (i >= this.f5957j.getDayPunchStatus().length) {
            return;
        }
        int[] dayPunchStatus = this.f5957j.getDayPunchStatus();
        if (i2 <= 0) {
            i2 = 0;
        }
        dayPunchStatus[i] = i2;
        notifyItemChanged((i + this.k.getValue()) - 1);
    }
}
