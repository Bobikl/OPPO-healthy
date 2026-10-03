package com.oplus.aiunit.vision;

import com.oplus.drs.core.reconciliation.UploadFailReason;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class cgf {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UploadFailReason.values().length];
            a = iArr;
            try {
                iArr[UploadFailReason.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UploadFailReason.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UploadFailReason.MISSING_SECRET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UploadFailReason.INPUT_JSON_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[UploadFailReason.OUTPUT_JSON_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[UploadFailReason.SERVER_GATEWAY_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[UploadFailReason.SERVER_BUSINESS_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[UploadFailReason.SERVER_APP_ID_NOT_SUPPORTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[UploadFailReason.HTTP_4XX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[UploadFailReason.HTTP_429.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[UploadFailReason.HTTP_5XX.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[UploadFailReason.HTTP_503.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[UploadFailReason.SERVER_TIMEOUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static Map<String, Map<Long, Integer>> a(List<co3> list, xv9 xv9Var) {
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (co3 co3Var : list) {
            if (co3Var != null && (str = co3Var.i) != null && !str.isEmpty()) {
                String str2 = co3Var.i;
                Boolean boolValueOf = (Boolean) map2.get(str2);
                if (boolValueOf == null) {
                    boolValueOf = Boolean.valueOf(xv9Var.n(str2));
                    map2.put(str2, boolValueOf);
                }
                if (boolValueOf.booleanValue()) {
                    long jC = hgf.c(co3Var.p);
                    Map map3 = (Map) map.get(str2);
                    if (map3 == null) {
                        map3 = new HashMap();
                        map.put(str2, map3);
                    }
                    Integer num = (Integer) map3.get(Long.valueOf(jC));
                    map3.put(Long.valueOf(jC), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                }
            }
        }
        return map;
    }

    public static Map<Long, Integer> b(List<co3> list) {
        HashMap map = new HashMap();
        for (co3 co3Var : list) {
            if (co3Var != null) {
                long jC = hgf.c(co3Var.p);
                Integer num = (Integer) map.get(Long.valueOf(jC));
                map.put(Long.valueOf(jC), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        return map;
    }

    public static Map<Long, Integer> c(List<co3> list) {
        HashMap map = new HashMap();
        for (co3 co3Var : list) {
            if (co3Var != null) {
                long jC = hgf.c(co3Var.p);
                if (!map.containsKey(Long.valueOf(jC))) {
                    map.put(Long.valueOf(jC), 1);
                }
            }
        }
        return map;
    }

    public static void d(String str, String str2, List<co3> list) {
        String str3;
        if (str == null || !str.equals(str2) || list == null || list.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (co3 co3Var : list) {
                if (co3Var != null && (str3 = co3Var.h) != null && !str3.isEmpty()) {
                    arrayList.add(co3Var.h);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            String string = "";
            try {
                string = arrayList.subList(0, Math.min(3, size)).toString();
            } catch (Exception unused) {
            }
            z6b.q("ReconciliationRecorder", "Reconciliation deletion requested after upload success, appId=" + str2 + ", batchSize=" + list.size() + ", sequenceIdCount=" + size + ", sample=" + string);
            xv9 xv9VarA = fgf.a();
            if (xv9VarA != null) {
                xv9VarA.e(arrayList);
                z6b.q("ReconciliationRecorder", "Reconciliation deletion dispatched: count=" + arrayList.size());
            }
        } catch (Exception e2) {
            z6b.p("ReconciliationRecorder", "Failed to remove uploaded reconciliation data", e2);
        }
    }

    public static String e(UploadFailReason uploadFailReason) {
        switch (a.a[uploadFailReason.ordinal()]) {
            case 1:
                return "NETWORK_ERROR";
            case 2:
                return "NO_NETWORK";
            case 3:
                return "MISSING_SECRET";
            case 4:
                return "INPUT_JSON_ERROR";
            case 5:
                return "OUTPUT_JSON_ERROR";
            case 6:
                return "SERVER_GATEWAY_ERROR";
            case 7:
                return "SERVER_BUSINESS_ERROR";
            case 8:
                return "SERVER_APP_ID_NOT_SUPPORTED";
            case 9:
                return "HTTP_4XX";
            case 10:
                return "HTTP_429";
            case 11:
                return "HTTP_5XX";
            case 12:
                return "HTTP_503";
            case 13:
                return "SERVER_TIMEOUT";
            default:
                return String.valueOf(uploadFailReason.getCode());
        }
    }

    public static void f(List<co3> list) {
        xv9 xv9VarA;
        if (list == null || list.isEmpty() || (xv9VarA = fgf.a()) == null) {
            return;
        }
        for (Map.Entry<String, Map<Long, Integer>> entry : a(list, xv9VarA).entrySet()) {
            xv9VarA.l(entry.getKey(), entry.getValue(), 0);
        }
    }

    public static void g(List<co3> list) {
        try {
            f(list);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorder", "recordCachedSuccessSafe error", th);
        }
    }

    public static void h(co3 co3Var) {
        String str;
        xv9 xv9VarA;
        if (co3Var == null || (str = co3Var.i) == null || str.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(co3Var.i)) {
            return;
        }
        xv9VarA.i(co3Var.i, 1, co3Var.p, "DATA_CORRUPTED");
    }

    public static void i(List<co3> list) {
        xv9 xv9VarA;
        if (list == null || list.isEmpty() || (xv9VarA = fgf.a()) == null) {
            return;
        }
        for (Map.Entry<String, Map<Long, Integer>> entry : a(list, xv9VarA).entrySet()) {
            xv9VarA.a(entry.getKey(), entry.getValue(), "OTHER");
        }
        z6b.q("ReconciliationRecorder", "Recorded db write failed for " + list.size() + " records");
    }

    public static void j(List<co3> list) {
        try {
            i(list);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorder", "recordDbWriteFailedSafe error", th);
        }
    }

    public static void k(String str, long j2) {
        xv9 xv9VarA;
        if (str == null || str.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(str)) {
            return;
        }
        xv9VarA.d(str, 1, j2, "QUOTA_APP_EXCEEDED");
    }

    public static void l(String str, long j2) {
        try {
            k(str, j2);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorder", "recordQuotaAppExceededSafe error", th);
        }
    }

    public static void m(String str, long j2) {
        xv9 xv9VarA;
        if (str == null || str.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(str)) {
            return;
        }
        xv9VarA.d(str, 1, j2, "QUOTA_GLOBAL_EXCEEDED");
    }

    public static void n(String str, long j2) {
        try {
            m(str, j2);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorder", "recordQuotaGlobalExceededSafe error", th);
        }
    }

    public static void o(List<co3> list) {
        String str;
        xv9 xv9VarA;
        if (list == null || list.isEmpty() || (str = list.get(0).i) == null || str.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(str)) {
            return;
        }
        xv9VarA.c(str, b(list));
    }

    public static void p(String str, List<co3> list, int i, int i2) {
        q(str, list, i, i2, false);
    }

    public static void q(String str, List<co3> list, int i, int i2, boolean z) {
        xv9 xv9VarA;
        if (str == null || str.isEmpty() || list == null || list.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(str)) {
            return;
        }
        UploadFailReason uploadFailReasonFromUploadStateCode = UploadFailReason.fromUploadStateCode(i, z);
        xv9VarA.k(str, b(list), e(uploadFailReasonFromUploadStateCode), i2);
        z6b.q("ReconciliationRecorder", "Upload failed recorded: appId=" + str + ", code=" + i + ", reason=" + uploadFailReasonFromUploadStateCode.getDescription() + ", batchRetryCount=" + i2 + ", batchSize=" + list.size());
    }

    public static void r(List<co3> list) {
        String str;
        xv9 xv9VarA;
        if (list == null || list.isEmpty() || (str = list.get(0).i) == null || str.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(str)) {
            return;
        }
        xv9VarA.g(str, c(list));
    }

    public static void s(String str, List<co3> list, int i) {
        xv9 xv9VarA;
        if (str == null || str.isEmpty() || list == null || list.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (co3 co3Var : list) {
            if (co3Var != null) {
                arrayList.add(Long.valueOf(co3Var.p));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        xv9VarA.f(str, arrayList, i);
    }
}
