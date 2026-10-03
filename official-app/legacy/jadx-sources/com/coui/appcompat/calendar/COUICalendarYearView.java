package com.coui.appcompat.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.coui.appcompat.picker.COUIDatePicker;
import com.support.calendar.R$id;
import com.support.calendar.R$layout;
import com.support.picker.R$attr;
import com.support.picker.R$style;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class COUICalendarYearView extends FrameLayout {
    public static final int k = R$layout.coui_year_label_text_view;
    public b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIDatePicker f1630j;

    public class a implements COUIDatePicker.e {
        public a() {
        }

        @Override // com.coui.appcompat.picker.COUIDatePicker.e
        public void a(COUIDatePicker cOUIDatePicker, int i, int i2, int i3) {
            COUICalendarYearView.this.a();
        }
    }

    public interface b {
        void a(COUICalendarYearView cOUICalendarYearView, int i, int i2, int i3);
    }

    public COUICalendarYearView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiDatePickerStyle);
    }

    public void a() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(this, this.f1630j.getYear(), this.f1630j.getMonth(), this.f1630j.getDayOfMonth());
        }
    }

    public void b(Calendar calendar, Calendar calendar2) {
        this.f1630j.setMinDate(calendar.getTimeInMillis());
        this.f1630j.setMaxDate(calendar2.getTimeInMillis());
    }

    public void setDate(Calendar calendar) {
        this.f1630j.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public void setOnYearSelectedListener(b bVar) {
        this.i = bVar;
    }

    public COUICalendarYearView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.DatePickerStyle);
    }

    public COUICalendarYearView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(k, (ViewGroup) this, true);
        COUIDatePicker cOUIDatePicker = (COUIDatePicker) findViewById(R$id.year_picker);
        this.f1630j = cOUIDatePicker;
        cOUIDatePicker.setOnDateChangedListener(new a());
    }
}
