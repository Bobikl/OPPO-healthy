package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.TrackMetaData;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.base.text.GsonUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes15.dex */
public class fji {
    public static final Integer MEASURE_UNIT_METRIC = 0;
    public static final Integer MEASURE_UNIT_BRITISH = 1;

    public static double A(double d) {
        return Math.floor((d * 0.621371192d) * 100.0d) / 100.0d;
    }

    public static int B(int i) {
        return (int) (Math.floor((((double) i) * 0.621371192d) * 100.0d) / 100.0d);
    }

    public static int C(TrackMetaData trackMetaData) {
        if (trackMetaData == null) {
            return -1;
        }
        return E(trackMetaData.getRunExtra(), trackMetaData.getAvgPace(), trackMetaData.getTotalTime());
    }

    public static int D(TrackMetadataStat trackMetadataStat) {
        if (trackMetadataStat == null) {
            return -1;
        }
        return E(trackMetadataStat.getRunExtra(), trackMetadataStat.getAvgPace(), trackMetadataStat.getTotalTime());
    }

    public static int E(String str, int i, long j2) {
        if (!I()) {
            return i;
        }
        RunExtra runExtra = (RunExtra) GsonUtil.a(str, RunExtra.class);
        if (runExtra == null || runExtra.getBsTotalDistance() <= 0) {
            return (int) z(i);
        }
        return (int) ((j2 / 1000.0f) / (runExtra.getBsTotalDistance() / 10000.0f));
    }

    public static int F(int i) {
        return I() ? (int) (((((long) i) * 100000000) / 10936133) / 10) : i;
    }

    public static int G(String str, int i) {
        if (!I()) {
            return i;
        }
        RunExtra runExtra = (RunExtra) GsonUtil.a(str, RunExtra.class);
        return (runExtra == null || runExtra.getBsSwimDistance() <= 0) ? x(i) : (int) runExtra.getBsSwimDistance();
    }

    public static boolean H() {
        if (qe0.E()) {
            return false;
        }
        boolean zEquals = v9g.x(b78.a().getPackageName() + "_preferences").E("measure_unit", "0").equals("british_system");
        StringBuilder sb = new StringBuilder();
        sb.append("isMetricUnitIsBritish() = ");
        sb.append(zEquals);
        return zEquals;
    }

    public static boolean I() {
        if (qe0.E()) {
            return false;
        }
        boolean zEquals = v9g.x(b78.a().getPackageName() + "_preferences").E("measure_unit", "0").equals("british_system");
        StringBuilder sb = new StringBuilder();
        sb.append("isMetricUnitIsBritish() = ");
        sb.append(zEquals);
        return zEquals;
    }

    public static long a(long j2) {
        return I() ? o(j2) : j2;
    }

    public static Double b(Double d) {
        return I() ? p(d) : d;
    }

    public static double c(double d) {
        return I() ? q(d) : d;
    }

    public static double d(double d) {
        return H() ? r(d) : d;
    }

    public static int e(int i) {
        return H() ? s(i) : i;
    }

    public static String f(String str) {
        return H() ? t(str) : str;
    }

    public static double g(double d) {
        return I() ? u(d) : d;
    }

    public static int h(int i) {
        return I() ? v(i) : i;
    }

    public static double i(double d) {
        return I() ? w(d) : d;
    }

    public static int j(int i) {
        return I() ? x(i) : i;
    }

    public static double k(double d) {
        return I() ? y(d) : d;
    }

    public static double l(double d) {
        return I() ? A(d) : d;
    }

    public static int m(int i) {
        return I() ? B(i) : i;
    }

    public static String n(String str) {
        if (!I()) {
            return str;
        }
        double d = Double.parseDouble(str);
        if (!(!str.contains("."))) {
            return BigDecimal.valueOf(A(d)).setScale(Math.max((str.length() - str.indexOf(".")) - 1, 0), RoundingMode.DOWN).toString();
        }
        return "" + B((int) d);
    }

    public static long o(long j2) {
        return (long) (Math.floor((j2 * 0.621371192d) * 100.0d) / 100.0d);
    }

    public static Double p(Double d) {
        return Double.valueOf(Math.floor((d.doubleValue() * 0.621371192d) * 100.0d) / 100.0d);
    }

    public static double q(double d) {
        return Math.round(d * 0.39370079d);
    }

    public static double r(double d) {
        return d * 4.1858158d;
    }

    public static int s(int i) {
        return (int) Math.floor(((double) i) * 4.1858158d);
    }

    public static String t(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            i = 0;
        }
        return String.valueOf(s(i));
    }

    public static double u(double d) {
        return Math.floor((d * 3.2808399d) * 100.0d) / 100.0d;
    }

    public static int v(int i) {
        return (int) Math.floor(((double) i) * 3.2808399d);
    }

    public static double w(double d) {
        return Math.floor(d * 1.093613d);
    }

    public static int x(int i) {
        return (int) Math.floor(((double) i) * 1.093613d);
    }

    public static double y(double d) {
        return ((int) ((d * 100.0d) / 0.621371192d)) / 100;
    }

    public static long z(long j2) {
        return ((long) ((j2 * 10000) / 0.621371192d)) / 10000;
    }
}
