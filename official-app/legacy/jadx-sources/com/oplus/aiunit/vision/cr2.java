package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class cr2 {
    public static final int BYDAY_FR = 8;
    public static final int BYDAY_MO = 4;
    public static final int BYDAY_SA = 9;
    public static final int BYDAY_SU = 10;
    public static final int BYDAY_TH = 7;
    public static final int BYDAY_TU = 5;
    public static final int BYDAY_WE = 6;
    public static final int FREQ_DAILY = 3;
    public static final int FREQ_MONTHLY = 1;
    public static final int FREQ_WEEKLY = 2;
    public static final int FREQ_YEARLY = 0;
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10206c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10207e;
    public final String f;
    public final String g;
    public final String h;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10208c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f10209e;
        public String f;
        public String g;
        public String h;

        public cr2 i() {
            return new cr2(this);
        }

        public a j(String str) {
            this.f10209e = str;
            return this;
        }

        public a k(String str) {
            this.f = str;
            return this;
        }

        public a l(String str) {
            this.g = str;
            return this;
        }

        public a m(String str) {
            this.h = str;
            return this;
        }

        public a n(String str) {
            this.b = str;
            return this;
        }

        public a o(String str) {
            this.a = str;
            return this;
        }

        public a p(String str) {
            this.d = str;
            return this;
        }

        public a q(String str) {
            this.f10208c = str;
            return this;
        }
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(c(this.a))) {
            e(sb, "FREQ=", c(this.a), ";");
        }
        if (!TextUtils.isEmpty(this.b)) {
            e(sb, "COUNT=", this.b, ";");
        }
        if (!TextUtils.isEmpty(this.f10206c)) {
            e(sb, "UNTIL=", this.f10206c, ";");
        }
        if (!TextUtils.isEmpty(this.d)) {
            e(sb, "INTERVAL=", this.d, ";");
        }
        if (!TextUtils.isEmpty(b(this.f10207e))) {
            e(sb, "BYDAY=", b(this.f10207e), ";");
        }
        if (!TextUtils.isEmpty(this.f)) {
            e(sb, "BYMONTH=", this.f, ";");
        }
        if (!TextUtils.isEmpty(this.g)) {
            e(sb, "BYMONTHDAY=", this.g, ";");
        }
        if (!TextUtils.isEmpty(this.h)) {
            e(sb, "BYYEARDAY=", this.h, ";");
        }
        return sb.toString();
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.contains(",")) {
            return d(str);
        }
        String[] strArrSplit = str.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            String strD = d(str2);
            if (!TextUtils.isEmpty(strD)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(",");
                }
                sb.append(strD);
            }
        }
        return sb.toString();
    }

    public final String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                int i = Integer.parseInt(str);
                if (i == 0) {
                    return "YEARLY";
                }
                if (i == 1) {
                    return "MONTHLY";
                }
                if (i != 2) {
                    return i != 3 ? "" : "DAILY";
                }
                return "WEEKLY";
            } catch (NumberFormatException unused) {
                a7b.f("CalendarRRule", "freq NumberFormatException:" + str);
            }
        }
        return "";
    }

    public final String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                switch (Integer.parseInt(str)) {
                    case 4:
                        return "MO";
                    case 5:
                        return apj.Thread_Type_Thread_Utils;
                    case 6:
                        return "WE";
                    case 7:
                        return alf.TH;
                    case 8:
                        return "FR";
                    case 9:
                        return alf.SA;
                    case 10:
                        return "SU";
                    default:
                        return "";
                }
            } catch (NumberFormatException unused) {
                a7b.f("CalendarRRule", "byDay NumberFormatException:" + str);
            }
        }
        return "";
    }

    public final void e(StringBuilder sb, String... strArr) {
        for (String str : strArr) {
            sb.append(str);
        }
    }

    public cr2(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.f10206c = aVar.f10208c;
        this.d = aVar.d;
        this.f10207e = aVar.f10209e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
    }
}
