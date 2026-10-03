package com.oplus.aiunit.vision;

import com.oplus.drs.core.ingest.step.StepResult;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class dgf {
    public static String a(String str) {
        int iIndexOf;
        int i;
        int iIndexOf2;
        if (str != null && !str.isEmpty()) {
            try {
                int iIndexOf3 = str.indexOf("\"app_id\"");
                if (iIndexOf3 < 0) {
                    iIndexOf3 = str.indexOf("\"appId\"");
                }
                if (iIndexOf3 >= 0 && (iIndexOf = str.indexOf("\"", iIndexOf3 + 9)) >= 0 && (iIndexOf2 = str.indexOf("\"", (i = iIndexOf + 1))) >= 0) {
                    return str.substring(i, iIndexOf2);
                }
                return null;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void b(String str, String str2) {
        try {
            String strA = a(str);
            if (strA != null && !strA.isEmpty()) {
                xv9 xv9VarA = fgf.a();
                if (xv9VarA != null && xv9VarA.n(strA)) {
                    String str3 = "quota_global_exceeded".equals(str2) ? "QUOTA_GLOBAL_EXCEEDED" : "QUEUE_FULL";
                    xv9VarA.d(strA, 1, System.currentTimeMillis(), str3);
                    z6b.q("ReconciliationRecorderExt", "Fast backpressure blocked recorded: appId=" + strA + ", reason=" + str3);
                    return;
                }
                return;
            }
            z6b.u("ReconciliationRecorderExt", "Fast backpressure blocked, cannot extract appId, reason=" + str2);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorderExt", "recordFastBackpressureBlockedSafe error", th);
        }
    }

    public static void c(p7a p7aVar) {
        Map<String, Map<String, Integer>> map;
        if (p7aVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(p7aVar.a);
        sb.append("] FilterResult: dropByRule=");
        sb.append(p7aVar.f15232l);
        sb.append(", dropBySample=");
        sb.append(p7aVar.m);
        sb.append(", dropByInvalid=");
        sb.append(p7aVar.f15233n);
        sb.append(", passed=");
        sb.append(p7aVar.e() ? p7aVar.d.size() : p7aVar.b.size());
        z6b.q("ReconciliationRecorderExt", sb.toString());
        xv9 xv9VarA = fgf.a();
        if (xv9VarA == null || (map = p7aVar.o) == null || map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = p7aVar.p;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j2 = jCurrentTimeMillis;
        for (Map.Entry<String, Map<String, Integer>> entry : p7aVar.o.entrySet()) {
            String key = entry.getKey();
            if (xv9VarA.n(key)) {
                for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                    String key2 = entry2.getKey();
                    int iIntValue = entry2.getValue().intValue();
                    if (iIntValue > 0) {
                        xv9VarA.b(key, iIntValue, j2, key2);
                    }
                }
            }
        }
    }

    public static void d(p7a p7aVar) {
        try {
            c(p7aVar);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorderExt", "recordFilterResultSafe error", th);
        }
    }

    public static void e(String str, Exception exc) {
        try {
            String strA = a(str);
            if (strA != null && !strA.isEmpty()) {
                xv9 xv9VarA = fgf.a();
                if (xv9VarA != null && xv9VarA.n(strA)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    xv9VarA.h(strA, 1, jCurrentTimeMillis);
                    xv9VarA.m(strA, 1, jCurrentTimeMillis, "JSON_PARSE_ERROR");
                    z6b.q("ReconciliationRecorderExt", "JSON parse failed recorded: appId=" + strA);
                    return;
                }
                return;
            }
            z6b.u("ReconciliationRecorderExt", "JSON parse failed, cannot extract appId");
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorderExt", "recordJsonParseFailedSafe error", th);
        }
    }

    public static void f(p7a p7aVar, String str, long j2, StepResult stepResult) {
        if (p7aVar == null || str == null) {
            return;
        }
        String strName = stepResult != null ? stepResult.a.name() : "null";
        String str2 = stepResult != null ? stepResult.b : null;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(p7aVar.a);
        sb.append("] Step=");
        sb.append(str);
        sb.append(", duration=");
        sb.append(j2);
        sb.append("ms, action=");
        sb.append(strName);
        sb.append(", reason=");
        if (str2 == null) {
            str2 = "-";
        }
        sb.append(str2);
        sb.append(", remaining=");
        sb.append(p7aVar.b.size());
        sb.append(", dropByRule=");
        sb.append(p7aVar.f15232l);
        sb.append(", dropBySample=");
        sb.append(p7aVar.m);
        sb.append(", dropByInvalid=");
        sb.append(p7aVar.f15233n);
        z6b.q("ReconciliationRecorderExt", sb.toString());
    }

    public static void g(p7a p7aVar, String str, Exception exc) {
        if (p7aVar == null || str == null) {
            return;
        }
        z6b.p("ReconciliationRecorderExt", "[" + p7aVar.a + "] Step=" + str + " ERROR: " + (exc != null ? exc.getMessage() : "unknown") + ", remaining=" + p7aVar.b.size(), exc);
    }

    public static void h(p7a p7aVar, String str, Exception exc) {
        try {
            g(p7aVar, str, exc);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorderExt", "recordStepErrorSafe error", th);
        }
    }

    public static void i(p7a p7aVar, String str, long j2, StepResult stepResult) {
        try {
            f(p7aVar, str, j2, stepResult);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorderExt", "recordStepSafe error", th);
        }
    }

    public static void j(sga sgaVar, String str) {
        String strA;
        xv9 xv9VarA;
        if (sgaVar == null || (strA = sgaVar.a()) == null || strA.isEmpty() || (xv9VarA = fgf.a()) == null || !xv9VarA.n(strA)) {
            return;
        }
        xv9VarA.m(strA, 1, sgaVar.p(), str);
    }

    public static void k(sga sgaVar, String str) {
        try {
            j(sgaVar, str);
        } catch (Throwable th) {
            z6b.p("ReconciliationRecorderExt", "recordValidationFailedSafe error", th);
        }
    }
}
