package com.heytap.health.settings.watch.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.coui.appcompat.picker.COUINumberPicker;
import com.coui.appcompat.picker.COUITimeLimitPicker;
import com.support.picker.R$attr;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class OplusNearTimePicker extends COUITimeLimitPicker {
    public COUINumberPicker E;
    public COUINumberPicker F;

    public OplusNearTimePicker(Context context) {
        this(context, null);
    }

    public COUINumberPicker getPickerHour() {
        return this.E;
    }

    public COUINumberPicker getPickerMinute() {
        return this.F;
    }

    public final void p() {
        this.E = getHourSpinner();
        this.F = getMinuteSpinner();
        this.E.setWrapSelectorWheel(false);
        this.F.setWrapSelectorWheel(false);
    }

    public void q(int i, int i2) {
        this.E.setMinValue(i);
        this.E.setMaxValue(i2);
        this.E.setWrapSelectorWheel(false);
        this.F.setWrapSelectorWheel(false);
    }

    public void r(int i, int i2) {
        this.F.setMinValue(i);
        this.F.setMaxValue(i2);
        this.E.setWrapSelectorWheel(false);
        this.F.setWrapSelectorWheel(false);
    }

    public void setHourFormatter(COUINumberPicker.c cVar) {
        this.E.setFormatter(cVar);
    }

    public void setMinuteFormatter(COUINumberPicker.c cVar) {
        this.F.setFormatter(cVar);
    }

    public void setTimePicker(Calendar calendar) {
        setCurrentHour(Integer.valueOf(calendar.get(11)));
        setCurrentMinute(Integer.valueOf(calendar.get(12)));
    }

    public OplusNearTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiTimePickerStyle);
    }

    public OplusNearTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p();
    }
}
