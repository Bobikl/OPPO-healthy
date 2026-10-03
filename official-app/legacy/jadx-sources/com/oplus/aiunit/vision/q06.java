package com.oplus.aiunit.vision;

import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class q06 {
    public int a = 1000;
    public long b = 0;

    public boolean a() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.b <= this.a) {
            return true;
        }
        this.b = timeInMillis;
        return false;
    }
}
