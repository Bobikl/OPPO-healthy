package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.services.core.AMapException;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.f58;
import com.oplus.aiunit.vision.v3n;
import com.oplus.aiunit.vision.w3n;
import com.oplus.aiunit.vision.x3n;
import com.oplus.aiunit.vision.y3n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes13.dex */
public final class i {
    public SparseArray<Long> a = new SparseArray<>();
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1177c = 0;
    String[] d = {"ol", "cl", "gl", "ha", "bs", "ds"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1178e = -1;
    public long f = -1;
    private static List<x3n> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONArray f1176j = null;
    static AMapLocation g = null;
    static boolean h = false;

    /* JADX INFO: renamed from: com.autonavi.aps.amapapi.utils.i$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String a(int i2) {
        if (i2 == 2011) {
            return "ContextIsNull";
        }
        if (i2 == 2031) {
            return "CreateApsReqException";
        }
        if (i2 == 2041) {
            return "ResponseResultIsNull";
        }
        if (i2 == 2081) {
            return "LocalLocException";
        }
        if (i2 == 2091) {
            return "InitException";
        }
        if (i2 == 2111) {
            return "ErrorCgiInfo";
        }
        if (i2 == 2121) {
            return "NotLocPermission";
        }
        if (i2 == 2141) {
            return "NoEnoughStatellites";
        }
        if (i2 == 2021) {
            return "OnlyMainWifi";
        }
        if (i2 == 2022) {
            return "OnlyOneWifiButNotMain";
        }
        if (i2 == 2061) {
            return "ServerRetypeError";
        }
        if (i2 == 2062) {
            return "ServerLocFail";
        }
        switch (i2) {
            case 2051:
                return "NeedLoginNetWork\t";
            case 2052:
                return "MaybeIntercepted";
            case 2053:
                return "DecryptResponseException";
            case 2054:
                return "ParserDataException";
            default:
                switch (i2) {
                    case AMapException.CODE_AMAP_NEARBY_KEY_NOT_BIND /* 2101 */:
                        return "BindAPSServiceException";
                    case 2102:
                        return "AuthClientScodeFail";
                    case 2103:
                        return "NotConfigAPSService";
                    default:
                        switch (i2) {
                            case 2131:
                                return "NoCgiOAndWifiInfo";
                            case 2132:
                                return "AirPlaneModeAndWifiOff";
                            case 2133:
                                return "NoCgiAndWifiOff";
                            default:
                                switch (i2) {
                                    case 2151:
                                        return "MaybeMockNetLoc";
                                    case 2152:
                                        return "MaybeMockGPSLoc";
                                    case 2153:
                                        return "UNSUPPORT_COARSE_LBSLOC";
                                    case 2154:
                                        return "UNSUPPORT_CONTINUE_LOC";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public static void b(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (b.a()) {
                    a(context, j2, z, "O024");
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "reportCoarseLocUseTime");
            }
        }
    }

    private static void f(Context context) {
        try {
            JSONArray jSONArray = f1176j;
            if (jSONArray == null || jSONArray.length() <= 0) {
                return;
            }
            w3n.e(new v3n(context, c.c(), f1176j.toString()), context);
            f1176j = null;
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "writeOfflineLocLog");
        }
    }

    public final int c(Context context) {
        try {
            long jA = j.a(context, "pref1", this.d[2], 0L);
            long jA2 = j.a(context, "pref1", this.d[0], 0L);
            long jA3 = j.a(context, "pref1", this.d[1], 0L);
            if (jA == 0 && jA2 == 0 && jA3 == 0) {
                return -1;
            }
            long j2 = jA2 - jA;
            long j3 = jA3 - jA;
            if (jA > j2) {
                return jA > j3 ? 2 : 1;
            }
            return j2 > j3 ? 0 : 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Context context) {
        try {
            long jA = j.a(context, "pref1", this.d[3], 0L);
            long jA2 = j.a(context, "pref1", this.d[4], 0L);
            long jA3 = j.a(context, "pref1", this.d[5], 0L);
            if (jA == 0 && jA2 == 0 && jA3 == 0) {
                return -1;
            }
            if (jA > jA2) {
                return jA > jA3 ? 3 : 5;
            }
            return jA2 > jA3 ? 4 : 5;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void e(Context context) {
        try {
            SharedPreferences.Editor editorA = j.a(context, "pref1");
            int i2 = 0;
            while (true) {
                String[] strArr = this.d;
                if (i2 >= strArr.length) {
                    j.a(editorA);
                    return;
                } else {
                    j.a(editorA, strArr[i2], 0L);
                    i2++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(AMapLocation aMapLocation) {
        if (k.a(aMapLocation)) {
            return !c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        }
        return "http://abroad.apilocate.amap.com/mobile/binary".equals(c.f1169c);
    }

    public final void b(Context context) {
        try {
            long jB = k.b() - this.f1177c;
            int i2 = this.b;
            if (i2 != -1) {
                this.a.append(this.b, Long.valueOf(jB + this.a.get(i2, 0L).longValue()));
            }
            long jB2 = k.b() - this.f;
            int i3 = this.f1178e;
            if (i3 != -1) {
                this.a.append(this.f1178e, Long.valueOf(jB2 + this.a.get(i3, 0L).longValue()));
            }
            SharedPreferences.Editor editorA = j.a(context, "pref1");
            for (int i4 = 0; i4 < this.d.length; i4++) {
                long jLongValue = this.a.get(i4, 0L).longValue();
                if (jLongValue > 0 && jLongValue > j.a(context, "pref1", this.d[i4], 0L)) {
                    j.a(editorA, this.d[i4], jLongValue);
                }
            }
            j.a(editorA);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "saveLocationTypeAndMode");
        }
    }

    public static void a(Context context, AMapLocation aMapLocation, com.autonavi.aps.amapapi.a aVar) {
        int i2;
        if (aMapLocation == null) {
            return;
        }
        try {
            if (!f58.GPS.equalsIgnoreCase(aMapLocation.getProvider()) && aMapLocation.getLocationType() != 1) {
                String str = a(aMapLocation) ? "abroad" : "domestic";
                String str2 = "cache";
                if (aMapLocation.getErrorCode() != 0) {
                    int errorCode = aMapLocation.getErrorCode();
                    if (errorCode == 4 || errorCode == 5 || errorCode == 6 || errorCode == 11) {
                        str2 = "net";
                    }
                    i2 = 0;
                } else {
                    int locationType = aMapLocation.getLocationType();
                    if (locationType == 5 || locationType == 6) {
                        str2 = "net";
                    }
                    i2 = 1;
                }
                a(context, "O016", str2, str, i2, aMapLocation.getErrorCode(), aVar);
            }
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "reportBatting");
        }
    }

    public static void a(Context context, long j2, boolean z) {
        if (context != null) {
            try {
                if (b.a()) {
                    a(context, j2, z, "O015");
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "reportGPSLocUseTime");
            }
        }
    }

    private static void a(Context context, long j2, boolean z, String str) {
        a(context, str, !z ? "abroad" : "domestic", Long.valueOf(j2).intValue());
    }

    private static void a(Context context, String str, String str2, String str3, int i2, int i3, com.autonavi.aps.amapapi.a aVar) {
        if (context != null) {
            try {
                if (b.a()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("param_string_second", str3);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    if (i3 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_second", i3);
                    }
                    if (aVar != null) {
                        if (!TextUtils.isEmpty(aVar.d())) {
                            jSONObject.put("dns", aVar.d());
                        }
                        if (!TextUtils.isEmpty(aVar.e())) {
                            jSONObject.put("domain", aVar.e());
                        }
                        if (!TextUtils.isEmpty(aVar.f())) {
                            jSONObject.put("type", aVar.f());
                        }
                        if (!TextUtils.isEmpty(aVar.g())) {
                            jSONObject.put(EngineConstant.REASON, aVar.g());
                        }
                        if (!TextUtils.isEmpty(aVar.c())) {
                            jSONObject.put("ip", aVar.c());
                        }
                        if (!TextUtils.isEmpty(aVar.b())) {
                            jSONObject.put(TombstoneParser.keyStack, aVar.b());
                        }
                        if (aVar.h() > 0) {
                            jSONObject.put("ctime", String.valueOf(aVar.h()));
                        }
                        if (aVar.a() > 0) {
                            jSONObject.put("ntime", String.valueOf(aVar.a()));
                        }
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    private static void a(Context context, String str, String str2, int i2) {
        if (context != null) {
            try {
                if (b.a()) {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("param_string_first", str2);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        jSONObject.put("param_string_second", (Object) null);
                    }
                    if (i2 != Integer.MAX_VALUE) {
                        jSONObject.put("param_int_first", i2);
                    }
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    public static synchronized void a(Context context, String str, JSONObject jSONObject) {
        if (context != null) {
            try {
                if (b.a()) {
                    x3n x3nVar = new x3n(context, "loc", "6.5.1", str);
                    if (jSONObject != null) {
                        x3nVar.a(jSONObject.toString());
                    }
                    i.add(x3nVar);
                    if (i.size() >= 30) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(i);
                        y3n.h(arrayList, context);
                        i.clear();
                    }
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatistics");
            }
        }
    }

    public static synchronized void a(Context context) {
        if (context != null) {
            try {
                if (b.a()) {
                    List<x3n> list = i;
                    if (list != null && list.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(i);
                        y3n.h(arrayList, context);
                        i.clear();
                    }
                    f(context);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "destroy");
            }
        }
    }

    public static void a(String str, String str2) {
        try {
            c2n.o(c.c(), str2, str);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "reportLog");
        }
    }

    public final void a(Context context, int i2) {
        try {
            int i3 = this.b;
            if (i3 == i2) {
                return;
            }
            if (i3 != -1 && i3 != i2) {
                this.a.append(this.b, Long.valueOf((k.b() - this.f1177c) + this.a.get(this.b, 0L).longValue()));
            }
            this.f1177c = k.b() - j.a(context, "pref1", this.d[i2], 0L);
            this.b = i2;
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "setLocationType");
        }
    }

    public final void a(Context context, AMapLocationClientOption aMapLocationClientOption) {
        int i2;
        try {
            int i3 = AnonymousClass1.a[aMapLocationClientOption.getLocationMode().ordinal()];
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 != 2) {
                i2 = 3;
                if (i3 != 3) {
                    i2 = -1;
                }
            } else {
                i2 = 5;
            }
            int i4 = this.f1178e;
            if (i4 == i2) {
                return;
            }
            if (i4 != -1 && i4 != i2) {
                this.a.append(this.f1178e, Long.valueOf((k.b() - this.f) + this.a.get(this.f1178e, 0L).longValue()));
            }
            this.f = k.b() - j.a(context, "pref1", this.d[i2], 0L);
            this.f1178e = i2;
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "setLocationMode");
        }
    }

    public static void a(Context context, int i2, int i3, long j2, long j3) {
        if (i2 == -1 || i3 == -1) {
            return;
        }
        try {
            a(context, "O012", i2, i3, j2, j3);
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "reportServiceAliveTime");
        }
    }

    private static void a(Context context, String str, int i2, int i3, long j2, long j3) {
        if (context != null) {
            try {
                if (b.a()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("param_int_first", i2);
                    jSONObject.put("param_int_second", i3);
                    jSONObject.put("param_long_first", j2);
                    jSONObject.put("param_long_second", j3);
                    a(context, str, jSONObject);
                }
            } catch (Throwable th) {
                c.a(th, "ReportUtil", "applyStatisticsEx");
            }
        }
    }

    public static synchronized void a(Context context, AMapLocation aMapLocation) {
        int i2;
        try {
            if (k.a(aMapLocation)) {
                int locationType = aMapLocation.getLocationType();
                int i3 = 0;
                if (locationType == 1) {
                    i2 = i3;
                    i3 = 1;
                } else if (locationType == 2 || locationType == 4) {
                    i2 = 1;
                    i3 = 1;
                } else {
                    if (locationType == 11) {
                        i2 = 4;
                    } else if (locationType == 8) {
                        i3 = 3;
                        i2 = i3;
                    } else if (locationType != 9) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                    i3 = 1;
                }
                if (i3 != 0) {
                    int iC = b.c();
                    if (iC != 0) {
                        if (i2 == 0 || i2 == 4) {
                            if (iC == 2) {
                                return;
                            }
                        } else if (iC == 1) {
                            return;
                        }
                    }
                    if (f1176j == null) {
                        f1176j = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lon", k.b(aMapLocation.getLongitude()));
                    jSONObject.put("lat", k.b(aMapLocation.getLatitude()));
                    jSONObject.put("type", i2);
                    jSONObject.put("timestamp", k.a());
                    if (aMapLocation.getCoordType().equalsIgnoreCase("WGS84")) {
                        jSONObject.put("coordType", 1);
                    } else {
                        jSONObject.put("coordType", 2);
                    }
                    if (i2 == 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("accuracy", k.c(aMapLocation.getAccuracy()));
                        jSONObject2.put("altitude", k.c(aMapLocation.getAltitude()));
                        jSONObject2.put("bearing", k.c(aMapLocation.getBearing()));
                        jSONObject2.put("speed", k.c(aMapLocation.getSpeed()));
                        jSONObject.put(DBSportMetadata.EXTENSION, jSONObject2);
                    }
                    JSONArray jSONArrayPut = f1176j.put(jSONObject);
                    f1176j = jSONArrayPut;
                    if (jSONArrayPut.length() >= b.b()) {
                        f(context);
                    }
                }
            }
        } catch (Throwable th) {
            c.a(th, "ReportUtil", "recordOfflineLocLog");
        }
    }

    public static void a(String str, int i2) {
        a(str, String.valueOf(i2), a(i2));
    }

    public static void a(String str, String str2, String str3) {
        try {
            c2n.k(c.c(), "/mobile/binary", str3, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Throwable th) {
        try {
            if (th instanceof ik) {
                c2n.j(c.c(), str, (ik) th);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        try {
            if (g == null) {
                if (!k.a(aMapLocation)) {
                    g = aMapLocation2;
                    return;
                }
                g = aMapLocation.m4468clone();
            }
            if (k.a(g) && k.a(aMapLocation2)) {
                AMapLocation aMapLocationM4468clone = aMapLocation2.m4468clone();
                if (g.getLocationType() != 1 && g.getLocationType() != 9 && !f58.GPS.equalsIgnoreCase(g.getProvider()) && g.getLocationType() != 7 && aMapLocationM4468clone.getLocationType() != 1 && aMapLocationM4468clone.getLocationType() != 9 && !f58.GPS.equalsIgnoreCase(aMapLocationM4468clone.getProvider()) && aMapLocationM4468clone.getLocationType() != 7) {
                    long jAbs = Math.abs(aMapLocationM4468clone.getTime() - g.getTime()) / 1000;
                    if (jAbs <= 0) {
                        jAbs = 1;
                    }
                    if (jAbs <= 1800) {
                        float fA = k.a(g, aMapLocationM4468clone);
                        float f = fA / jAbs;
                        if (fA > 30000.0f && f > 1000.0f) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(g.getLatitude());
                            sb.append(",");
                            sb.append(g.getLongitude());
                            sb.append(",");
                            sb.append(g.getAccuracy());
                            sb.append(",");
                            sb.append(g.getLocationType());
                            sb.append(",");
                            if (aMapLocation.getTime() != 0) {
                                sb.append(k.a(g.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(g.getTime());
                            }
                            sb.append("#");
                            sb.append(aMapLocationM4468clone.getLatitude());
                            sb.append(",");
                            sb.append(aMapLocationM4468clone.getLongitude());
                            sb.append(",");
                            sb.append(aMapLocationM4468clone.getAccuracy());
                            sb.append(",");
                            sb.append(aMapLocationM4468clone.getLocationType());
                            sb.append(",");
                            if (aMapLocationM4468clone.getTime() != 0) {
                                sb.append(k.a(aMapLocationM4468clone.getTime(), "yyyyMMdd_HH:mm:ss:SS"));
                            } else {
                                sb.append(aMapLocationM4468clone.getTime());
                            }
                            a("bigshiftstatistics", sb.toString());
                            sb.delete(0, sb.length());
                        }
                    }
                }
                g = aMapLocationM4468clone;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(long j2, long j3) {
        try {
            if (h) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("gpsTime:");
            stringBuffer.append(k.a(j2, "yyyy-MM-dd HH:mm:ss.SSS"));
            stringBuffer.append(",");
            stringBuffer.append("sysTime:");
            stringBuffer.append(k.a(j3, "yyyy-MM-dd HH:mm:ss.SSS"));
            stringBuffer.append(",");
            long jU = b.u();
            String strA = 0 != jU ? k.a(jU, "yyyy-MM-dd HH:mm:ss.SSS") : "0";
            stringBuffer.append("serverTime:");
            stringBuffer.append(strA);
            a("checkgpstime", stringBuffer.toString());
            if (0 != jU && Math.abs(j2 - jU) < 31536000000L) {
                stringBuffer.append(", correctError");
                a("checkgpstimeerror", stringBuffer.toString());
            }
            stringBuffer.delete(0, stringBuffer.length());
            h = true;
        } catch (Throwable unused) {
        }
    }
}
