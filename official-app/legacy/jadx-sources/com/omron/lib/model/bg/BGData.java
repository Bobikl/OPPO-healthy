package com.omron.lib.model.bg;

import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class BGData {
    private float glucoseConcentration;
    private Meal meal;
    private int sequenceNumber;
    private Calendar time;
    private Unit unit;

    public float getGlucoseConcentration() {
        return this.glucoseConcentration;
    }

    public Meal getMeal() {
        return this.meal;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public Calendar getTime() {
        return this.time;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public void setGlucoseConcentration(float f) {
        this.glucoseConcentration = f;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setTime(Calendar calendar) {
        this.time = calendar;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
