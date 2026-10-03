package com.oplus.aiunit.vision;

import com.google.android.material.timepicker.TimeModel;
import com.heytap.sports.R$string;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nji {
    public static final double DISTANCE_OF_HALF_MARATHON = 21.0975d;
    public static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]*\\.?[0-9]+");

    public static Double a(float f) {
        return Double.valueOf(Double.parseDouble(String.valueOf(f)));
    }

    public static String b(String str) {
        try {
            double d = Double.parseDouble(str);
            if (fji.I()) {
                if (d > 62.5d) {
                    return "62.50";
                }
            } else if (d > 99.99d) {
                return "99.99";
            }
            return lzc.a(2, d);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("数字转换异常：");
            sb.append(e2.getMessage());
            return str;
        }
    }

    public static String c(double d) {
        if (d >= 999.9d) {
            return lzc.a(0, 999.9000244140625d);
        }
        return d >= 100.0d ? lzc.a(1, d) : lzc.a(2, d);
    }

    public static String d(double d, double d2) {
        if (d >= 999.9d) {
            return lzc.b(0, 999.9000244140625d, d2);
        }
        return d >= 100.0d ? lzc.b(1, d, d2) : lzc.b(2, d, d2);
    }

    public static String e(double d) {
        return lzc.a(1, d);
    }

    public static String f(double d) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        if (d >= 21.0975d) {
            numberFormat.setMinimumFractionDigits(4);
            numberFormat.setMaximumFractionDigits(4);
        } else {
            numberFormat.setMinimumFractionDigits(2);
            numberFormat.setMaximumFractionDigits(2);
        }
        return numberFormat.format(d);
    }

    public static String g(int i) {
        int i2 = i / 10;
        if (fji.I()) {
            if (i2 < 35) {
                return "35\"";
            }
            if (i2 > 540) {
                return "9'00\"";
            }
        } else {
            if (i2 < 40) {
                return "40\"";
            }
            if (i2 > 600) {
                return "10'00\"";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2 / 60);
        sb.append("'");
        int i3 = i2 % 60;
        if (i3 >= 10) {
            sb.append(i3);
            sb.append("\"");
        } else {
            sb.append("0");
            sb.append(i3);
            sb.append("\"");
        }
        return sb.toString();
    }

    public static String h(Double d) {
        return String.format(Locale.getDefault(), "%#.2f", d);
    }

    public static String i(int i) {
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
    }

    public static String j(int i, int i2) {
        return String.format("%0" + i2 + "d", Integer.valueOf(i));
    }

    public static double k(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (fji.I()) {
            if (d > 160.0d) {
                return 160.0d;
            }
        } else if (d > 255.0d) {
            return 255.0d;
        }
        return d;
    }

    public static double l(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (fji.I()) {
            if (d > 62.5d) {
                return 62.5d;
            }
        } else if (d > 99.9d) {
            return 99.9d;
        }
        return d;
    }

    public static String m(double d) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setMinimumFractionDigits(1);
        return numberFormat.format(d);
    }

    public static String n(float f) {
        return m(Double.parseDouble(String.valueOf(f)));
    }

    public static String o(double d) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        return numberFormat.format(d);
    }

    public static String p(int i) {
        String strJ = j(i % 60, 2);
        int i2 = i / 60;
        String strJ2 = j(i2 % 60, 2);
        return j(i2 / 60, 2) + ":" + strJ2 + ":" + strJ;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[PHI: r0
  0x0031: PHI (r0v9 int) = (r0v2 int), (r0v10 int) binds: [B:15:0x002f, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static String q(int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append("seconds:");
        sb.append(i);
        if (fji.I()) {
            i2 = 180;
            if (i < 180 && i > 0) {
                i = i2;
            } else if (i > 3600 || i <= 0) {
                return b78.a().getString(R$string.sports_pace_none);
            }
        } else {
            i2 = 120;
            if (i < 120 && i > 0) {
                i = i2;
            } else if (i > 3000 || i <= 0) {
                return b78.a().getString(R$string.sports_pace_none);
            }
        }
        return String.format(Locale.getDefault(), "%1$d'%2$02d\"", Long.valueOf(i / 60), Long.valueOf(i % 60));
    }

    public static String r(int i) {
        String strJ = j(i % 60, 2);
        int i2 = i / 60;
        String strJ2 = j(i2 % 60, 2);
        int i3 = i2 / 60;
        if (i3 % 60 == 0) {
            return strJ2 + ":" + strJ;
        }
        return String.valueOf(i3) + ":" + strJ2 + ":" + strJ;
    }

    public static String s(long j2) {
        if (j2 <= 0) {
            return b78.a().getString(R$string.sports_pace_none);
        }
        long jA = hq8.a(j2);
        return String.format(Locale.getDefault(), "%1$d'%2$02d\"", Long.valueOf(jA / 60), Long.valueOf(jA % 60));
    }

    public static String t(long j2) {
        double d = j2;
        return d < 0.005d ? "0.00" : u(fji.b(Double.valueOf(d / 1000.0d)).doubleValue());
    }

    public static String u(double d) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        numberFormat.setGroupingUsed(false);
        if (d < 100.0d) {
            numberFormat.setMinimumFractionDigits(2);
            numberFormat.setMaximumFractionDigits(2);
            return numberFormat.format(d);
        }
        if (d < 100.0d || d >= 1000.0d) {
            numberFormat.setMinimumFractionDigits(0);
            numberFormat.setMaximumFractionDigits(0);
            return numberFormat.format(d);
        }
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setMaximumFractionDigits(1);
        return numberFormat.format(d);
    }
}
