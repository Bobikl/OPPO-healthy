package com.heytap.health.step.card.calendar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.health.step.R$color;
import com.heytap.health.step.R$drawable;
import com.heytap.health.step.R$id;
import com.heytap.health.step.card.data.StepCardBean;
import com.oplus.aiunit.vision.qe0;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes18.dex */
public abstract class StepCardCalendarBaseAdapter extends RecyclerView.Adapter<Holder> {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public StepCardBean f5957j;

    public class Holder extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f5958j;
        public LottieAnimationView k;

        public Holder(View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.calendar_date);
            this.f5958j = (ImageView) view.findViewById(R$id.current_day_flag_ig);
            this.k = (LottieAnimationView) view.findViewById(R$id.fire_animation);
        }

        public LottieAnimationView a() {
            return this.k;
        }
    }

    public StepCardCalendarBaseAdapter(Context context, StepCardBean stepCardBean) {
        this.i = context;
        this.f5957j = stepCardBean;
    }

    public boolean d(LocalDate localDate) {
        return localDate.isAfter(LocalDate.now());
    }

    public boolean e(LocalDate localDate) {
        return LocalDate.now().isEqual(localDate);
    }

    public void f(TextView textView) {
        if (qe0.y(this.i)) {
            textView.setTextColor(this.i.getResources().getColor(R$color.step_card_calendar_item_text_future_color_night, null));
            textView.setBackground(ContextCompat.getDrawable(this.i, R$drawable.step_card_calendar_item_bg_unpunched_night));
        } else {
            textView.setTextColor(this.i.getResources().getColor(R$color.step_card_calendar_item_text_future_color, null));
            textView.setBackground(ContextCompat.getDrawable(this.i, R$drawable.step_card_calendar_item_bg_unpunched));
        }
    }

    public void g(TextView textView) {
        if (qe0.y(this.i)) {
            textView.setTextColor(this.i.getResources().getColor(R$color.step_card_calendar_item_text_punched_past_color_night, null));
            textView.setBackground(ContextCompat.getDrawable(this.i, R$drawable.step_card_calendar_item_bg_punched_night));
        } else {
            textView.setTextColor(this.i.getResources().getColor(R$color.step_card_calendar_item_text_punched_past_color, null));
            textView.setBackground(ContextCompat.getDrawable(this.i, R$drawable.step_card_calendar_item_bg_punched));
        }
    }

    public void h(TextView textView) {
        if (qe0.y(this.i)) {
            textView.setTextColor(this.i.getResources().getColor(R$color.step_card_calendar_item_text_unpunched_past_color_night, null));
            textView.setBackground(ContextCompat.getDrawable(this.i, R$drawable.step_card_calendar_item_bg_unpunched_night));
        } else {
            textView.setTextColor(this.i.getResources().getColor(R$color.step_card_calendar_item_text_unpunched_past_color, null));
            textView.setBackground(ContextCompat.getDrawable(this.i, R$drawable.step_card_calendar_item_bg_unpunched));
        }
    }
}
