package com.lifesense.plugin.ble.b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    protected static final int LEVEL_ADVANCED = 2;
    protected static final int LEVEL_GENERAL = 1;
    protected static final int LEVEL_SUPREME = 3;
    protected boolean enablePrint = true;

    public b getAdvancedLogInfo(String str, String str2, com.lifesense.plugin.ble.b.a.a aVar, String str3, boolean z) {
        b bVar = new b();
        bVar.a(2);
        bVar.b(str2);
        bVar.a(aVar);
        bVar.a(str);
        bVar.b(true);
        bVar.a(z);
        bVar.c(str3);
        return bVar;
    }

    public b getGeneralLogInfo(String str, String str2, com.lifesense.plugin.ble.b.a.a aVar, String str3, boolean z) {
        b bVar = new b();
        bVar.a(1);
        bVar.b(str2);
        bVar.a(aVar);
        bVar.a(str);
        bVar.b(true);
        bVar.a(z);
        bVar.c(str3);
        return bVar;
    }

    public b getPrintLogInfo(String str, int i) {
        b bVar = new b();
        bVar.a(i);
        bVar.b(str);
        return bVar;
    }

    public b getSupperLogInfo(String str, String str2, com.lifesense.plugin.ble.b.a.a aVar, String str3, boolean z) {
        b bVar = new b();
        bVar.a(3);
        bVar.b(str2);
        bVar.a(aVar);
        bVar.a(str);
        bVar.b(true);
        bVar.a(z);
        bVar.c(str3);
        return bVar;
    }

    public void printLogMessage(b bVar) {
        if (bVar == null) {
            return;
        }
        if (this.enablePrint) {
            bVar.d();
            bVar.f();
        }
        if (bVar.g()) {
            d.a().a(bVar.a(), bVar.b(), bVar.c(), bVar.d(), bVar.e());
        }
    }

    public void setPrintPermission(boolean z) {
        this.enablePrint = z;
    }
}
