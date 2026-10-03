package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;

/* JADX INFO: loaded from: classes18.dex */
public class rti {
    public static double a(double d) {
        double d2;
        double d3 = Double.parseDouble(v9g.w().E("user_metric_weight", "60000")) / 1000.0d;
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d <= 10.0d) {
            d2 = 2.0d;
        } else if (d <= 15.0d) {
            d2 = 3.0d;
        } else if (d <= 20.0d) {
            d2 = 5.0d;
        } else {
            d2 = d <= 25.0d ? 7.0d : 9.0d;
        }
        return (d3 * d2) / 3600.0d;
    }

    public static double b(int i) {
        double d;
        double d2;
        if (i < 150) {
            d = i;
            d2 = 0.48d;
        } else {
            if (i >= 150 && i < 166) {
                double d3 = i;
                return d3 * ((0.0025d * d3) + 0.145d);
            }
            if (i < 166 || i >= 185) {
                return 110.0d;
            }
            d = i;
            d2 = 0.56d;
        }
        return d * d2;
    }

    public static double c(int i, int i2, int i3, long j2, int i4, double d) {
        double d2;
        double dF = f(i, i2, j2, i4);
        if (i4 == 2) {
            d2 = i3;
        } else if (i4 == 3) {
            dF = i3;
            d2 = 0.1d;
        } else {
            if (i4 == 5) {
                return 0.04d * (d / 10.0d) * ((double) i3);
            }
            if (i4 != 7) {
                return (dF * ((double) i3)) / 2.0d;
            }
            dF *= (double) i3;
            d2 = 2.6d;
        }
        return dF * d2;
    }

    public static double d(long j2, int i, double d) {
        return c(2, Integer.parseInt(v9g.w().E("user_metric_height", UserInfo.HEIGHT_DEFAULT)) / 10, Integer.parseInt(v9g.w().E("user_metric_weight", "60000")) / 1000, j2, i, d);
    }

    public static double e(double d, int i, double d2) {
        double d3 = Double.parseDouble(v9g.w().E("user_metric_weight", "60000")) / 1000.0d;
        if (i != 2) {
            if (i == 3) {
                return 0.1d * d3;
            }
            if (i == 5) {
                return 0.04d * (d2 / 10.0d) * d3;
            }
            if (i == 7) {
                return d * d3 * 2.6d;
            }
            if (i != 10) {
                return (d * d3) / 2.0d;
            }
        }
        return d * d3;
    }

    public static double f(int i, int i2, long j2, int i3) {
        return (((i3 == 10 || i3 == 2) ? b(i2) : ((double) i2) * 0.42d) * j2) / 100000.0d;
    }

    public static double g(long j2, int i) {
        return f(2, Integer.parseInt(v9g.w().E("user_metric_height", UserInfo.HEIGHT_DEFAULT)) / 10, j2, i);
    }

    public static int h(int i) {
        if (i == 1) {
            return 6;
        }
        if (i != 6) {
            return i != 7 ? 0 : 2;
        }
        return 1;
    }
}
