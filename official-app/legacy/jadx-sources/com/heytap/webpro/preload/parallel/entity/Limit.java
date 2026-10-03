package com.heytap.webpro.preload.parallel.entity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.d94;
import com.oplus.aiunit.vision.q7b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class Limit {
    public static final String KEY_PACKAGE = "package_name";
    public static final String KEY_VERSION_CODE = "version_code";
    private static final String TAG = "Limit";
    public static final String TYPE_CONTAINS = "CONTAINS";
    public static final String TYPE_CONTAINS_STR = "CONTAINS_STR";
    public static final String TYPE_END_WITH = "END_WITH";
    public static final String TYPE_EQUAL = "EQUAL";
    public static final String TYPE_NOT_CONTAINS = "NOT_CONTAINS";
    public static final String TYPE_NOT_CONTAINS_STR = "NOT_CONTAINS_STR";
    public static final String TYPE_NOT_EQUAL = "NOT_EQUAL";
    public static final String TYPE_NUMBER_CONTAINS = "CONTAINS";
    public static final String TYPE_NUMBER_EQUAL = "EQUAL";
    public static final String TYPE_NUMBER_GREAT_EQUAL = "GREAT_EQUAL";
    public static final String TYPE_NUMBER_GREAT_THAN = "GREAT_THAN";
    public static final String TYPE_NUMBER_LESS_EQUAL = "LESS_EQUAL";
    public static final String TYPE_NUMBER_LESS_THAN = "LESS_THAN";
    public static final String TYPE_NUMBER_NOT_CONTAINS = "NOT_CONTAINS";
    public static final String TYPE_NUMBER_NOT_EQUAL = "NOT_EQUAL";
    public static final String TYPE_START_WITH = "START_WITH";
    public long _id;
    public String key;
    public String type;
    public Object value;

    public static boolean checkLimit(Limit limit) {
        String str = limit.key;
        str.hashCode();
        if (str.equals("package_name")) {
            return comparePackage(limit.value, limit.type);
        }
        if (str.equals("version_code")) {
            return compareVersionCode(limit.value, limit.type);
        }
        return true;
    }

    private static boolean compareDouble(double d, Object obj, String str) {
        double dDoubleValue = ((Double) obj).doubleValue();
        str.hashCode();
        switch (str) {
            case "LESS_THAN":
                return d < dDoubleValue;
            case "GREAT_EQUAL":
                return d >= dDoubleValue;
            case "LESS_EQUAL":
                return d <= dDoubleValue;
            case "EQUAL":
                return d == dDoubleValue;
            case "NOT_EQUAL":
                return d != dDoubleValue;
            case "GREAT_THAN":
                return d > dDoubleValue;
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    private static boolean compareList(double d, Object obj, String str) {
        byte b;
        try {
            List list = (List) obj;
            int iHashCode = str.hashCode();
            if (iHashCode != -2063252949) {
                if (iHashCode == 215180831 && str.equals("CONTAINS")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("NOT_CONTAINS")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                return !containsNumber(list, d);
            }
            if (b != 1) {
                return true;
            }
            return containsNumber(list, d);
        } catch (Exception e2) {
            q7b.f(TAG, "compareList failed!", e2);
            return true;
        }
    }

    private static boolean compareNumber(double d, Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (obj instanceof Double) {
            return compareDouble(d, obj, str);
        }
        if (obj instanceof List) {
            return compareList(d, obj, str);
        }
        return true;
    }

    private static boolean comparePackage(Object obj, String str) {
        return compareString(d94.b().getPackageName(), obj, str);
    }

    private static boolean compareString(String str, Object obj, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && obj != null) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                str2.hashCode();
                switch (str2) {
                    case "END_WITH":
                        return str.endsWith(str3);
                    case "START_WITH":
                        return str.startsWith(str3);
                    case "EQUAL":
                        return TextUtils.equals(str, str3);
                    case "CONTAINS_STR":
                        return str.contains(str3);
                    case "NOT_CONTAINS_STR":
                        return !str.contains(str3);
                    case "NOT_EQUAL":
                        return !TextUtils.equals(str, str3);
                    default:
                        return true;
                }
            }
            if (obj instanceof List) {
                try {
                    List list = (List) obj;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -2063252949) {
                        if (iHashCode == 215180831 && str2.equals("CONTAINS")) {
                        }
                    } else if (str2.equals("NOT_CONTAINS")) {
                    }
                    if (r2 == 0) {
                        return !containsString(list, str);
                    }
                    if (r2 != 1) {
                        return true;
                    }
                    return containsString(list, str);
                } catch (Exception e2) {
                    q7b.f(TAG, "compareString failed!", e2);
                }
            }
        }
        return true;
    }

    private static boolean compareVersionCode(Object obj, String str) {
        Context contextB = d94.b();
        try {
            return compareNumber(contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0).versionCode, obj, str);
        } catch (PackageManager.NameNotFoundException e2) {
            q7b.f(TAG, "compareVersionCode failed!", e2);
            return true;
        }
    }

    private static boolean containsNumber(List<Double> list, double d) {
        if (list == null || list.size() == 0) {
            return true;
        }
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().doubleValue() == d) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsString(List<String> list, String str) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }
}
