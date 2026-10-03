package com.oplus.aiunit.vision;

import com.heytap.msp.okipc.server.UncontrollHandler;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class vt6 implements UncontrollHandler {
    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("client_expired_clean") || str.startsWith("client_capacity_clean") || str.startsWith("client_storage_full");
    }

    public final boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("client_prefilter_status_drop") || str.startsWith("client_prefilter_sample_drop");
    }

    public final String c(String str) {
        if (str == null) {
            return "OTHER";
        }
        if (str.startsWith("client_expired_clean")) {
            return "SDK_EXPIRED_CLEAN";
        }
        return (str.startsWith("client_capacity_clean") || str.startsWith("client_storage_full")) ? "SDK_CAPACITY_CLEAN" : "OTHER";
    }

    public final String d(String str) {
        if (str == null) {
            return "OTHER";
        }
        if (str.startsWith("client_prefilter_status_drop")) {
            return "SDK_PREFILTER_STATUS_DROP";
        }
        return str.startsWith("client_prefilter_sample_drop") ? "SDK_PREFILTER_SAMPLE_DROP" : "OTHER";
    }

    public final ValidationReason e(String str) {
        if (str == null || str.isEmpty()) {
            return ValidationReason.OTHER;
        }
        int iIndexOf = str.indexOf(124);
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        if ("client_data_too_large".equals(str)) {
            return ValidationReason.CLIENT_DATA_TOO_LARGE;
        }
        if ("client_missing_required_field".equals(str)) {
            return ValidationReason.MISSING_REQUIRED_FIELD;
        }
        if ("client_db_write_failed".equals(str)) {
            return ValidationReason.CLIENT_DB_WRITE_FAILED;
        }
        if ("client_storage_full".equals(str)) {
            return ValidationReason.CLIENT_STORAGE_FULL;
        }
        if ("client_expired_clean".equals(str)) {
            return ValidationReason.CLIENT_EXPIRED_CLEAN;
        }
        if ("client_capacity_clean".equals(str)) {
            return ValidationReason.CLIENT_CAPACITY_CLEAN;
        }
        if ("client_ipc_retry_exhausted".equals(str)) {
            return ValidationReason.CLIENT_IPC_RETRY_EXHAUSTED;
        }
        if ("client_ipc_timeout".equals(str)) {
            return ValidationReason.CLIENT_IPC_TIMEOUT;
        }
        return "client_ipc_service_unavailable".equals(str) ? ValidationReason.CLIENT_IPC_SERVICE_UNAVAILABLE : ValidationReason.OTHER;
    }

    @Override // com.heytap.msp.okipc.server.UncontrollHandler
    public void handle(com.heytap.msp.okipc.server.b bVar) {
        int i;
        byte[] bArr = bVar.request().f7337c;
        if (bArr == null || bArr.length == 0) {
            z6b.u("ExceptionDataHandler", "handle: empty body for exception data.");
            bVar.c(new com.heytap.msp.okipc.e(new byte[0]));
            return;
        }
        String str = new String(bArr, StandardCharsets.UTF_8);
        au6 au6VarA = au6.a(str);
        if (au6VarA == null) {
            z6b.o("ExceptionDataHandler", "handle: parse ExceptionInfo failed, raw=" + str);
            bVar.c(new com.heytap.msp.okipc.e(new byte[0]));
            return;
        }
        z6b.q("ExceptionDataHandler", "handle: receive exception from IPC, appId=" + au6VarA.b() + ", group=" + au6VarA.c() + ", id=" + au6VarA.d() + ", time=" + au6VarA.e() + ", reason=" + au6VarA.f());
        String strB = au6VarA.b();
        xv9 xv9VarA = fgf.a();
        if (xv9VarA != null) {
            try {
                long jE = au6VarA.e();
                String strF = au6VarA.f();
                int i2 = 1;
                if (strF != null && strF.contains("|")) {
                    try {
                        String strTrim = strF.substring(strF.indexOf(124) + 1).trim();
                        try {
                            i = Integer.parseInt(strTrim);
                        } catch (NumberFormatException unused) {
                            i = 1;
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            i2 = i;
                            break;
                        }
                        try {
                            String[] strArrSplit = strTrim.split(",");
                            int length = strArrSplit.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = i;
                                    break;
                                }
                                String str2 = strArrSplit[i3];
                                if (str2.startsWith("count=")) {
                                    i2 = Integer.parseInt(str2.substring(6));
                                    break;
                                }
                                i3++;
                                i2 = i;
                                break;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                    }
                }
                int i4 = i2;
                if (b(strF)) {
                    xv9VarA.h(strB, i4, jE);
                    String strD = d(strF);
                    xv9VarA.b(strB, i4, jE, strD);
                    z6b.q("ExceptionDataHandler", "Prefilter drop recorded as RECEIVED+FILTERED: appId=" + strB + ", count=" + i4 + ", reason=" + strD);
                } else if (a(strF)) {
                    String strC = c(strF);
                    xv9VarA.i(strB, i4, jE, strC);
                    z6b.q("ExceptionDataHandler", "Exception recorded as CLEARED (no received): appId=" + strB + ", count=" + i4 + ", reason=" + strC);
                } else {
                    xv9VarA.h(strB, i4, jE);
                    ValidationReason validationReasonE = e(strF);
                    xv9VarA.m(strB, i4, jE, validationReasonE.name());
                    z6b.q("ExceptionDataHandler", "Exception recorded as VALIDATION_FAILED: appId=" + strB + ", count=" + i4 + ", reason=" + validationReasonE.name());
                }
            } catch (Exception e2) {
                z6b.p("ExceptionDataHandler", "handle: record reconciliation for exception failed", e2);
            }
        }
        bVar.c(new com.heytap.msp.okipc.e(new byte[0]));
    }
}
