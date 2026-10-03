package com.heytap.nearx.uikit.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.widget.picker.NearDatePicker;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class NearCalendarYearView extends FrameLayout {
    private static final int ITEM_LAYOUT = R$layout.nx_year_label_text_view;
    private OnYearSelectedListener mOnYearSelectedListener;
    private NearDatePicker mPicker;

    public interface OnYearSelectedListener {
        void onYearChanged(NearCalendarYearView nearCalendarYearView, int i, int i2, int i3);
    }

    public NearCalendarYearView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxDatePickerStyle);
    }

    public void setCurrentYear() {
        OnYearSelectedListener onYearSelectedListener = this.mOnYearSelectedListener;
        if (onYearSelectedListener != null) {
            onYearSelectedListener.onYearChanged(this, this.mPicker.getYear(), this.mPicker.getMonth(), this.mPicker.getDayOfMonth());
        }
    }

    public void setDate(Calendar calendar) {
        this.mPicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public void setOnYearSelectedListener(OnYearSelectedListener onYearSelectedListener) {
        this.mOnYearSelectedListener = onYearSelectedListener;
    }

    public void setRange(Calendar calendar, Calendar calendar2) {
        this.mPicker.setMinDate(calendar.getTimeInMillis());
        this.mPicker.setMaxDate(calendar2.getTimeInMillis());
    }

    public NearCalendarYearView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearCalendarYearView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(ITEM_LAYOUT, (ViewGroup) this, true);
        NearDatePicker nearDatePicker = (NearDatePicker) findViewById(R$id.year_picker);
        this.mPicker = nearDatePicker;
        nearDatePicker.setOnDateChangedListener(new NearDatePicker.OnDateChangedListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarYearView.1
            @Override // com.heytap.nearx.uikit.widget.picker.NearDatePicker.OnDateChangedListener
            public void onDateChanged(NearDatePicker nearDatePicker2, int i3, int i4, int i5) {
                NearCalendarYearView.this.setCurrentYear();
            }
        });
    }
}
