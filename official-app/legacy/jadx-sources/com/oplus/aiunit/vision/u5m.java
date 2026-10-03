package com.oplus.aiunit.vision;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes12.dex */
public class u5m implements t5m {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17312j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17313l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17314n;
    public TimeZone o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;

    public u5m() {
        this.i = 0;
        this.f17312j = 0;
        this.k = 0;
        this.f17313l = 0;
        this.m = 0;
        this.f17314n = 0;
        this.o = null;
        this.q = false;
        this.r = false;
        this.s = false;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void A(int i) {
        this.f17313l = Math.min(Math.abs(i), 23);
        this.r = true;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void B(int i) {
        this.m = Math.min(Math.abs(i), 59);
        this.r = true;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void C(int i) {
        this.i = Math.min(Math.abs(i), 9999);
        this.q = true;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void D(int i) {
        this.f17314n = Math.min(Math.abs(i), 59);
        this.r = true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        t5m t5mVar = (t5m) obj;
        long timeInMillis = x().getTimeInMillis() - t5mVar.x().getTimeInMillis();
        return (int) Math.signum(timeInMillis != 0 ? timeInMillis : this.p - t5mVar.u());
    }

    public String d() {
        return yw9.c(this);
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int getDay() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int getHour() {
        return this.f17313l;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int getMinute() {
        return this.m;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int getMonth() {
        return this.f17312j;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int getSecond() {
        return this.f17314n;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public TimeZone getTimeZone() {
        return this.o;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int getYear() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public boolean s() {
        return this.r;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void setTimeZone(TimeZone timeZone) {
        this.o = timeZone;
        this.r = true;
        this.s = true;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public boolean t() {
        return this.q;
    }

    public String toString() {
        return d();
    }

    @Override // com.oplus.aiunit.vision.t5m
    public int u() {
        return this.p;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public boolean v() {
        return this.s;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void w(int i) {
        if (i < 1) {
            this.k = 1;
        } else if (i > 31) {
            this.k = 31;
        } else {
            this.k = i;
        }
        this.q = true;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public Calendar x() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        if (this.s) {
            gregorianCalendar.setTimeZone(this.o);
        }
        gregorianCalendar.set(1, this.i);
        gregorianCalendar.set(2, this.f17312j - 1);
        gregorianCalendar.set(5, this.k);
        gregorianCalendar.set(11, this.f17313l);
        gregorianCalendar.set(12, this.m);
        gregorianCalendar.set(13, this.f17314n);
        gregorianCalendar.set(14, this.p / 1000000);
        return gregorianCalendar;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void y(int i) {
        this.p = i;
        this.r = true;
    }

    @Override // com.oplus.aiunit.vision.t5m
    public void z(int i) {
        if (i < 1) {
            this.f17312j = 1;
        } else if (i > 12) {
            this.f17312j = 12;
        } else {
            this.f17312j = i;
        }
        this.q = true;
    }

    public u5m(Calendar calendar) {
        this.i = 0;
        this.f17312j = 0;
        this.k = 0;
        this.f17313l = 0;
        this.m = 0;
        this.f17314n = 0;
        this.o = null;
        this.q = false;
        this.r = false;
        this.s = false;
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.i = gregorianCalendar.get(1);
        this.f17312j = gregorianCalendar.get(2) + 1;
        this.k = gregorianCalendar.get(5);
        this.f17313l = gregorianCalendar.get(11);
        this.m = gregorianCalendar.get(12);
        this.f17314n = gregorianCalendar.get(13);
        this.p = gregorianCalendar.get(14) * 1000000;
        this.o = gregorianCalendar.getTimeZone();
        this.s = true;
        this.r = true;
        this.q = true;
    }
}
