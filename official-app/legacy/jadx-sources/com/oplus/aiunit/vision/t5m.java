package com.oplus.aiunit.vision;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes12.dex */
public interface t5m extends Comparable {
    void A(int i);

    void B(int i);

    void C(int i);

    void D(int i);

    int getDay();

    int getHour();

    int getMinute();

    int getMonth();

    int getSecond();

    TimeZone getTimeZone();

    int getYear();

    boolean s();

    void setTimeZone(TimeZone timeZone);

    boolean t();

    int u();

    boolean v();

    void w(int i);

    Calendar x();

    void y(int i);

    void z(int i);
}
