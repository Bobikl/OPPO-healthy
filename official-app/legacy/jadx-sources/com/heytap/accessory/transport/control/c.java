package com.heytap.accessory.transport.control;

import androidx.annotation.Nullable;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.bean.TrafficReport;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static boolean a = true;
    public static final float[] b = {40.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, d> f2781c;
    public static Map<String, e> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static TrafficControlConfig f2782e;

    public static void a() {
    }

    public static void b(long j2, int i, int i2) {
        if (i2 == 0) {
            e eVarD = d(j2, i);
            if (eVarD != null) {
                eVarD.a();
                return;
            }
            return;
        }
        if (i2 == 1) {
            d dVarB = b(j2, i);
            if (dVarB != null) {
                dVarB.a();
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.e("TrafficController - TCTrack", "cleanup tc cache, but unexpected role found(0 or 1 are allowed): " + i2);
    }

    public static int c(long j2, int i) {
        d dVarB = b(j2, i);
        if (dVarB == null) {
            return 0;
        }
        return dVarB.b();
    }

    public static void d(long j2, int i, int i2) {
        e eVarD = d(j2, i);
        if (eVarD == null) {
            a("TrafficController - TCTrack", "[send data, ignore tc] tc controller not found, ignore tc check");
        } else {
            eVarD.b(i2);
        }
    }

    public static void a(TrafficControlConfig trafficControlConfig) {
        f2782e = trafficControlConfig;
        if (trafficControlConfig == null) {
            return;
        }
        a = trafficControlConfig.isEnable();
    }

    public static String c(long j2, int i, int i2) {
        return j2 + ";" + i + ";" + i2;
    }

    public static int a(long j2, int i) {
        d dVarB = b(j2, i);
        if (dVarB == null) {
            return -1;
        }
        return dVarB.c();
    }

    public static void c(String str, String str2) {
        if (a) {
            com.heytap.accessory.base.logging.a.e(str, str2);
        }
    }

    @Nullable
    public static e d(long j2, int i) {
        if (d == null) {
            d = new HashMap();
        }
        return d.get(c(j2, i, 0));
    }

    public static void a(long j2, int i, int i2, long j3, int i3) {
        TrafficControlConfig trafficControlConfig = new TrafficControlConfig();
        trafficControlConfig.setEnable(true);
        trafficControlConfig.setHandleMsgTime(0);
        trafficControlConfig.setMaxWindowSize((int) j3);
        trafficControlConfig.setShowLog(true);
        trafficControlConfig.setStrategy(i3);
        a(j2, i, new e(j2, i, i2, trafficControlConfig));
    }

    @Nullable
    public static d b(long j2, int i) {
        if (f2781c == null) {
            f2781c = new HashMap();
        }
        return f2781c.get(c(j2, i, 1));
    }

    public static void b(String str, String str2) {
        if (a) {
            com.heytap.accessory.base.logging.a.c(str, str2);
        }
    }

    public static void a(long j2, int i, long j3, int i2, int i3) {
        if (f2782e == null) {
            com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "tc not config, ignore tc.");
            return;
        }
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.b("TrafficController - TCTrack", com.heytap.accessory.accessorymanager.AccessoryManager.EXTRA_ACCESSORY + j2 + " not found, ignore tc");
            return;
        }
        int iH = bVarA.h();
        if (f2782e.hasTransportTypeBanned(iH)) {
            com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "[tc banned] transportType: " + iH);
            return;
        }
        if (f2782e.hasChannelTypeBanned(i3)) {
            com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "[tc banned] channelType: " + i3);
            return;
        }
        AccessoryManager.h().a(j3, i, f2782e.getMaxWindowSize());
        a(j2, i, new d(j2, i, i2, f2782e));
        com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "[init Receiver], enable:" + f2782e.isEnable() + "; maxWindowSize:" + f2782e.getMaxWindowSize() + "; sleepTime:" + f2782e.getHandleMsgTime() + "; sReceiverStrategy:" + f2782e.getStrategy() + "; connectionId: " + j3 + "; channelId: " + i + "; accId: " + j2 + "; transId: " + i2);
    }

    public static void a(long j2, int i, TrafficReport trafficReport, long j3, a aVar) {
        d dVarB = b(j2, i);
        if (dVarB == null) {
            return;
        }
        dVarB.a(trafficReport, j3, aVar);
    }

    public static void a(b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e("TrafficController - TCTrack", "[receive tc request] request is null, ignore tc request.");
            return;
        }
        e eVarD = d(bVar.a(), bVar.b());
        if (eVarD == null) {
            com.heytap.accessory.base.logging.a.e("TrafficController - TCTrack", "[receive tc request] tc controller not found, ignore tc request");
        } else {
            eVarD.a(bVar);
        }
    }

    public static int a(long j2, int i, int i2) {
        e eVarD = d(j2, i);
        if (eVarD == null) {
            com.heytap.accessory.base.logging.a.a("TrafficController - TCTrack", "calculatePackageLength, tc controller not found, use suggestion:" + i2);
            return i2;
        }
        return eVarD.a(i2);
    }

    public static void a(long j2, int i, d dVar) {
        if (f2781c == null) {
            f2781c = new HashMap();
        }
        f2781c.put(c(j2, i, 1), dVar);
    }

    public static void a(long j2, int i, e eVar) {
        if (d == null) {
            d = new HashMap();
        }
        d.put(c(j2, i, 0), eVar);
    }

    public static void a(String str, String str2) {
        if (a) {
            com.heytap.accessory.base.logging.a.a(str, str2);
        }
    }
}
