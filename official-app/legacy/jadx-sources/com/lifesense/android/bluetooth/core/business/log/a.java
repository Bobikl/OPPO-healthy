package com.lifesense.android.bluetooth.core.business.log;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final int LEVEL_ADVANCED = 2;
    public static final int LEVEL_GENERAL = 1;
    public static final int LEVEL_SUPREME = 3;
    public boolean enablePrint = true;
    public boolean enableLogPrint = true;
    public String logPath = "connect";

    public b getAdvancedLogInfo(String str, String str2, com.lifesense.android.bluetooth.core.business.log.report.a aVar, String str3, boolean z) {
        b bVar = new b();
        bVar.a(2);
        bVar.b(str2);
        bVar.a(aVar);
        bVar.a(str);
        bVar.a(true);
        bVar.b(z);
        bVar.c(str3);
        return bVar;
    }

    public b getGeneralLogInfo(String str, String str2, com.lifesense.android.bluetooth.core.business.log.report.a aVar, String str3, boolean z) {
        b bVar = new b();
        bVar.a(1);
        bVar.b(str2);
        bVar.a(aVar);
        bVar.a(str);
        bVar.a(true);
        bVar.b(z);
        bVar.c(str3);
        return bVar;
    }

    public b getPrintLogInfo(String str, int i) {
        b bVar = new b();
        bVar.a(i);
        bVar.b(str);
        return bVar;
    }

    public b getSupperLogInfo(String str, String str2, com.lifesense.android.bluetooth.core.business.log.report.a aVar, String str3, boolean z) {
        b bVar = new b();
        bVar.a(3);
        bVar.b(str2);
        bVar.a(aVar);
        bVar.a(str);
        bVar.a(true);
        bVar.b(z);
        bVar.c(str3);
        return bVar;
    }

    public void printLogMessage(b bVar) {
        if (bVar == null) {
            return;
        }
        if (this.enablePrint) {
            bVar.d();
            bVar.b();
        }
        if (bVar.f()) {
            d.d().a(bVar.c(), bVar.a(), bVar.g(), bVar.d(), bVar.e());
        }
    }

    public void setPrintPermission(boolean z) {
        this.enablePrint = z;
    }
}
