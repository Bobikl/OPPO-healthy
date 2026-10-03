package com.oplus.aiunit.vision;

import java.util.Calendar;

/* JADX INFO: loaded from: classes17.dex */
public class u05 {
    public static int a() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }
}
