package com.oplus.aiunit.vision;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public class na8 {
    public static void a(Bundle bundle) {
        bundle.putDouble("altitude", 0.0d);
        bundle.putDouble("heightAnomaly", 0.0d);
        bundle.putDouble("mslAltitude", 0.0d);
    }

    public static boolean b(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NullPointerException | NumberFormatException unused) {
            a7b.b("gpsdata", "gga parse error:qualityIndiactor error");
            i = 0;
        }
        return i != 0;
    }

    public static boolean c(String str, String str2) {
        try {
            double d = Double.parseDouble(str);
            double d2 = Double.parseDouble(str2);
            if (d != 0.0d || d2 != 0.0d) {
                return true;
            }
            a7b.b("gpsdata", "gns_check data error!");
            return false;
        } catch (NullPointerException | NumberFormatException unused) {
            a7b.b("gpsdata", "gns_check parse error:" + str + "-" + str2);
            return false;
        }
    }

    public static void d(Bundle bundle) {
        bundle.putDouble("pDop", 0.0d);
        bundle.putDouble("hDop", 0.0d);
        bundle.putDouble("vDop", 0.0d);
    }

    public static boolean e(Bundle bundle, @NonNull String str) {
        String strH = h(str);
        if (!strH.equals("GGA") && !strH.equals("GNS")) {
            return false;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length < 12) {
            a7b.b("gpsdata", "gga_parse_error:tokens.length error" + strArrSplit.length);
            return false;
        }
        if (!(strH.equals("GGA") ? b(strArrSplit[6]) : c(strArrSplit[2], strArrSplit[4]))) {
            a7b.b("gpsdata", "nmea_parse_error:tokens.length error: " + strH);
            return false;
        }
        String str2 = strArrSplit[9];
        String str3 = strH.equals("GGA") ? strArrSplit[11] : strArrSplit[10];
        try {
            double d = Double.parseDouble(str2);
            double d2 = Double.parseDouble(str3);
            bundle.putDouble("altitude", d + d2);
            bundle.putDouble("heightAnomaly", d2);
            bundle.putDouble("mslAltitude", d);
            return true;
        } catch (NullPointerException | NumberFormatException unused) {
            a7b.b("gpsdata", "gga_parse_error:altitude error");
            return false;
        }
    }

    public static boolean f(Bundle bundle, @NonNull String str) {
        if (str.regionMatches(3, "GSA", 0, 3)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length >= 18) {
                String str2 = strArrSplit[15];
                String str3 = strArrSplit[16];
                String str4 = strArrSplit[17].split("\\*")[0];
                try {
                    double d = Double.parseDouble(str2);
                    double d2 = Double.parseDouble(str3);
                    double d3 = Double.parseDouble(str4);
                    bundle.putDouble("pDop", d);
                    bundle.putDouble("hDop", d2);
                    bundle.putDouble("vDop", d3);
                    return true;
                } catch (NullPointerException | NumberFormatException unused) {
                    a7b.b("gpsdata", "gsa parse error!");
                }
            }
        }
        return false;
    }

    public static Bundle g(String str) {
        String strH = h(str);
        Bundle bundle = new Bundle();
        if (strH.equals("GSA")) {
            bundle.putString("nmeaType", "GSA");
            if (!f(bundle, str)) {
                d(bundle);
            }
        } else if (strH.equals("GGA") || strH.equals("GNS")) {
            bundle.putString("nmeaType", "GGA");
            if (!e(bundle, str)) {
                a(bundle);
            }
        }
        return bundle;
    }

    public static String h(@NonNull String str) {
        return str.substring(3, 6);
    }
}
