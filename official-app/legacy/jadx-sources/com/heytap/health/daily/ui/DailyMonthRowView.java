package com.heytap.health.daily.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.nq4;
import java.time.LocalDate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class DailyMonthRowView extends LinearLayout {
    public static int m = 19;
    public nq4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f3854j;
    public ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<DailyView> f3855l;

    public DailyMonthRowView(Context context, nq4 nq4Var, ViewGroup viewGroup) {
        super(context);
        this.f3855l = new ArrayList<>();
        this.i = nq4Var;
        this.f3854j = context;
        this.k = viewGroup;
        c();
        b();
    }

    public void b() {
        float measuredWidth = (this.k.getMeasuredWidth() - ejg.a(this.f3854j, m * 2)) / 7.0f;
        int iA = ejg.a(this.f3854j, 6.0f);
        for (DailyView dailyView : this.f3855l) {
            dailyView.setLayoutParams(new ViewGroup.LayoutParams((int) measuredWidth, (int) (measuredWidth + measuredWidth + ejg.a(this.f3854j, 22.0f))));
            dailyView.setPadding(iA, 0, iA, 0);
            addView(dailyView);
        }
    }

    public void c() {
        for (int i = 0; i < 7; i++) {
            this.f3855l.add(this.i.a(this));
        }
    }

    public void e(LocalDate localDate, LocalDate localDate2) {
        for (final DailyView dailyView : this.f3855l) {
            dailyView.s = localDate;
            if (localDate.getMonthValue() == localDate2.getMonthValue()) {
                dailyView.setVisibility(0);
                dailyView.e();
                dailyView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rr4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dailyView.a();
                    }
                });
            } else {
                dailyView.setVisibility(4);
            }
            this.i.c(dailyView, localDate);
            localDate = localDate.plusDays(1L);
        }
    }
}
