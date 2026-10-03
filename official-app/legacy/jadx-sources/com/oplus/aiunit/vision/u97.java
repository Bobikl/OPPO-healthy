package com.oplus.aiunit.vision;

import com.heytap.device.data.sporthealth.pull.fetcher.DailyActivityStateDataFetcher;
import com.heytap.device.data.sporthealth.pull.fetcher.EcgListFetcher;
import com.heytap.device.data.sporthealth.pull.fetcher.FitnessDataFetcher;
import com.heytap.device.data.sporthealth.pull.fetcher.SleepDataFetcher;
import com.heytap.device.data.sporthealth.pull.fetcher.SportRecordListFetcher;

/* JADX INFO: loaded from: classes15.dex */
public class u97 {
    public static com.heytap.device.data.sporthealth.pull.fetcher.h a(n97 n97Var) {
        qyj gVar;
        switch (n97Var.a) {
            case 1:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.g();
                break;
            case 2:
                gVar = com.heytap.device.data.sporthealth.pull.fetcher.k.INSTANCE.a();
                break;
            case 3:
                gVar = new SleepDataFetcher();
                break;
            case 4:
                gVar = !e() ? new com.heytap.device.data.sporthealth.pull.fetcher.u() : com.heytap.device.data.sporthealth.pull.fetcher.w.INSTANCE.a();
                break;
            case 5:
                gVar = new SportRecordListFetcher();
                break;
            case 6:
                gVar = com.heytap.device.data.sporthealth.pull.fetcher.k.INSTANCE.b();
                break;
            case 7:
                gVar = new qii(true);
                break;
            case 8:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.a0();
                break;
            case 9:
                gVar = new FitnessDataFetcher();
                break;
            case 10:
                if (!d()) {
                    gVar = com.heytap.device.data.sporthealth.pull.fetcher.p.INSTANCE.a();
                } else if (!hbi.a(gl4.managerApi.getCurrentConnectId()).o1()) {
                    gVar = com.heytap.device.data.sporthealth.pull.fetcher.p.INSTANCE.b();
                } else {
                    gVar = com.heytap.device.data.sporthealth.pull.fetcher.p.INSTANCE.c();
                }
                break;
            case 11:
                gVar = new qii(false);
                break;
            case 12:
                if (!d()) {
                    gVar = EcgListFetcher.J();
                } else if (!b()) {
                    gVar = EcgListFetcher.K();
                } else {
                    gVar = EcgListFetcher.L();
                }
                break;
            case 13:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.l();
                break;
            case 14:
                gVar = new gf8();
                break;
            case 15:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.m();
                break;
            case 16:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.a();
                break;
            case 17:
                gVar = com.heytap.device.data.sporthealth.pull.fetcher.d0.INSTANCE.a(c());
                break;
            case 18:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.z();
                break;
            case 19:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.v();
                break;
            case 20:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.f();
                break;
            case 21:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.t();
                break;
            case 22:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.q();
                break;
            case 23:
                gVar = com.heytap.device.data.sporthealth.pull.fetcher.w.INSTANCE.b();
                break;
            case 24:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.b();
                break;
            case 25:
                gVar = !d() ? com.heytap.device.data.sporthealth.pull.fetcher.c.INSTANCE.a() : com.heytap.device.data.sporthealth.pull.fetcher.c.INSTANCE.b();
                break;
            case 26:
                gVar = !d() ? com.heytap.device.data.sporthealth.pull.fetcher.e.INSTANCE.a() : com.heytap.device.data.sporthealth.pull.fetcher.e.INSTANCE.b();
                break;
            case 27:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.d();
                break;
            case 28:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.e0();
                break;
            case 29:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.f0();
                break;
            case 30:
            default:
                a7b.b("Data-Sync", "DataType not support, type=" + n97Var.a);
                gVar = null;
                break;
            case 31:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.s();
                break;
            case 32:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.n();
                break;
            case 33:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.o();
                break;
            case 34:
                gVar = new DailyActivityStateDataFetcher();
                break;
            case 35:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.b0();
                break;
            case 36:
                gVar = new com.heytap.device.data.sporthealth.pull.fetcher.c0();
                break;
        }
        if (gVar != null) {
            gVar.B(n97Var.d());
            gVar.A(n97Var.c());
        }
        return gVar;
    }

    public static boolean b() {
        return hbi.a(gl4.managerApi.getCurrentConnectId()).K0();
    }

    public static boolean c() {
        return hbi.a(gl4.managerApi.getCurrentConnectId()).g0();
    }

    public static boolean d() {
        return hbi.a(gl4.managerApi.getCurrentConnectId()).l4();
    }

    public static boolean e() {
        return hbi.a(gl4.managerApi.getCurrentConnectId()).u2();
    }
}
