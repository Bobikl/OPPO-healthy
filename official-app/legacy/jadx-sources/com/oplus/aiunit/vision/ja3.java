package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ja3 implements nlk {
    public static final List<rzj> a = Arrays.asList(rzj.a("MIDNIGHT_AVOID", qzj.b(0, 30), vfa.a(1.2d)), rzj.a("MORNING_PEAK", qzj.b(600, weg.WINDOW_MORNING_PEAK_END), vfa.a(1.2d)), rzj.a("EVENING_PEAK", qzj.b(1020, weg.WINDOW_EVENING_PEAK_END), vfa.a(1.3d)), rzj.a("AFTERNOON", qzj.b(840, 960), vfa.a(0.95d)), rzj.a("NIGHT_VALLEY", qzj.b(weg.WINDOW_NIGHT_START, weg.WINDOW_NIGHT_END), vfa.a(0.75d)));

    public static String c() {
        int iF = f();
        for (rzj rzjVar : a) {
            if (rzjVar.b.a(iF)) {
                return weg.b(rzjVar.b.a) + "-" + weg.b(rzjVar.b.b) + " " + e(rzjVar.a) + "x";
            }
        }
        return "baseline 1.0x";
    }

    public static double e(String str) {
        if (str == null) {
            return 1.0d;
        }
        switch (str) {
            case "NIGHT_VALLEY":
                return 0.75d;
            case "AFTERNOON":
                return 0.95d;
            case "MORNING_PEAK":
                return 1.2d;
            case "EVENING_PEAK":
                return 1.3d;
            case "MIDNIGHT_AVOID":
                return 1.2d;
            default:
                return 1.0d;
        }
    }

    public static int f() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    @Override // com.oplus.aiunit.vision.nlk
    public long a(Context context, long j2) {
        long j3 = j2 > 0 ? j2 : 180000L;
        int iF = f();
        String strB = weg.b(iF);
        for (rzj rzjVar : a) {
            if (rzjVar.b.a(iF)) {
                long jMax = Math.max(nlk.MIN_DELAY_MS, rzjVar.f16414c.b(j3));
                String str = rzjVar.a;
                z6b.q("ChinaTimeWindowPolicy", b("MATCH", strB, str, j3, d(str), jMax));
                return jMax;
            }
        }
        z6b.q("ChinaTimeWindowPolicy", b("DEFAULT", strB, "BASELINE", j3, 1.0d, j3));
        return Math.max(nlk.MIN_DELAY_MS, j3);
    }

    public final String b(String str, String str2, String str3, long j2, double d, long j3) {
        return String.format("[%s] time=%s, window=%s, base=%s, scale=%.2f, result=%s", str, str2, str3, weg.a(j2), Double.valueOf(d), weg.a(j3));
    }

    public final double d(String str) {
        if (str == null) {
            return 1.0d;
        }
        switch (str) {
            case "NIGHT_VALLEY":
                return 0.75d;
            case "AFTERNOON":
                return 0.95d;
            case "MORNING_PEAK":
                return 1.2d;
            case "EVENING_PEAK":
                return 1.3d;
            case "MIDNIGHT_AVOID":
                return 1.2d;
            default:
                return 1.0d;
        }
    }
}
