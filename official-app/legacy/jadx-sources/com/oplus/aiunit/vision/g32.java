package com.oplus.aiunit.vision;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class g32 {
    public static int a(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j2));
        int i = calendar.get(11);
        if (c(i, 6, 10)) {
            return 1;
        }
        return c(i, 16, 20) ? 2 : 0;
    }

    public static int b(int i, int i2) {
        if (i > 140 || i2 > 90) {
            return 1;
        }
        return (i < 90 || i2 < 60) ? 2 : 0;
    }

    public static boolean c(int i, int i2, int i3) {
        return Math.min(i, i3) == Math.max(i, i2);
    }
}
