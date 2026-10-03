package com.oplus.aiunit.vision;

import com.oplus.drs.rom.sdk.comm.exception.CleanExceptionType;
import com.oplus.drs.rom.sdk.comm.exception.StorageExceptionType;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class tt6 {
    public static volatile tt6 b;
    public String a;

    public static tt6 g() {
        if (b == null) {
            synchronized (tt6.class) {
                if (b == null) {
                    b = new tt6();
                }
            }
        }
        return b;
    }

    public void a(String str, int i, String str2, long j2, int i2, long j3) {
        StringBuilder sb = new StringBuilder();
        sb.append("client_capacity_clean|reason=");
        sb.append(str2 != null ? str2 : "unknown");
        sb.append(",count=");
        sb.append(i);
        sb.append(",currentSize=");
        sb.append(j2);
        sb.append(",currentCount=");
        sb.append(i2);
        j(str, "drs_sdk", CleanExceptionType.CAPACITY_CLEAN.getCode(), j3, sb.toString());
    }

    public void b(String str, String str2, String str3, long j2, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("client_db_write_failed|error=");
        if (str4 == null) {
            str4 = "unknown";
        }
        sb.append(str4);
        j(str, str2, str3, j2, sb.toString());
    }

    public void c(String str, int i, int i2, long j2, Map<String, Integer> map) {
        j(str, "drs_sdk", CleanExceptionType.EXPIRED_CLEAN.getCode(), j2, "client_expired_clean|days=" + i2 + ",count=" + i);
    }

    public void d(String str, String str2, String str3, long j2) {
        j(str, str2, str3, j2, "client_missing_required_field");
    }

    public void e(String str, String str2, String str3, long j2, int i, int i2) {
        j(str, str2, str3, j2, "client_data_too_large|maxSize=" + i2 + ",actualSize=" + i);
    }

    public void f(String str, long j2, long j3, int i, int i2) {
        j(str, "drs_sdk", StorageExceptionType.DB_FULL.getCode(), System.currentTimeMillis(), "client_storage_full|currentSize=" + j2 + ",maxSize=" + j3 + ",currentCount=" + i + ",maxCount=" + i2);
    }

    public void h(lf3 lf3Var, String str) {
        this.a = str;
    }

    public final String i(String str) {
        return (str == null || str.isEmpty()) ? this.a : str;
    }

    public final void j(String str, String str2, String str3, long j2, String str4) {
        String strI = i(str);
        if (str2 == null || str2.isEmpty()) {
            str2 = "drs_sdk";
        }
        String str5 = str2;
        if (str3 == null) {
            str3 = "";
        }
        String str6 = str3;
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        k(new au6(strI, str5, str6, j2, str4));
    }

    public final void k(au6 au6Var) {
        if (au6Var == null) {
            return;
        }
        try {
            ku9.f().m(au6Var);
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ExceptionCollector", "Failed to send exception info", e2, new Object[0]);
        }
    }
}
