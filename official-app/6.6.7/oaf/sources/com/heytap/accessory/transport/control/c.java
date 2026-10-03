package com.heytap.accessory.transport.control;

import androidx.annotation.Nullable;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.bean.TrafficReport;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static boolean a = true;
    public static final float[] b = {40.0f};
    public static Map<String, d> c;
    public static Map<String, e> d;
    public static TrafficControlConfig e;

    public static void a() {
    }

    public static void b(long j, int i, int i2) {
        if (i2 == 0) {
            e eVarD = d(j, i);
            if (eVarD != null) {
                eVarD.a();
                return;
            }
            return;
        }
        if (i2 == 1) {
            d dVarB = b(j, i);
            if (dVarB != null) {
                dVarB.a();
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.e("TrafficController - TCTrack", "cleanup tc cache, but unexpected role found(0 or 1 are allowed): " + i2);
    }

    public static int c(long j, int i) {
        d dVarB = b(j, i);
        if (dVarB == null) {
            return 0;
        }
        return dVarB.b();
    }

    public static void d(long j, int i, int i2) {
        e eVarD = d(j, i);
        if (eVarD == null) {
            a("TrafficController - TCTrack", "[send data, ignore tc] tc controller not found, ignore tc check");
        } else {
            eVarD.b(i2);
        }
    }

    public static void a(TrafficControlConfig trafficControlConfig) {
        e = trafficControlConfig;
        if (trafficControlConfig == null) {
            return;
        }
        a = trafficControlConfig.isEnable();
    }

    public static String c(long j, int i, int i2) {
        return j + ";" + i + ";" + i2;
    }

    public static int a(long j, int i) {
        d dVarB = b(j, i);
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
    public static e d(long j, int i) {
        if (d == null) {
            d = new HashMap();
        }
        return d.get(c(j, i, 0));
    }

    public static void a(long j, int i, int i2, long j2, int i3) {
        TrafficControlConfig trafficControlConfig = new TrafficControlConfig();
        trafficControlConfig.setEnable(true);
        trafficControlConfig.setHandleMsgTime(0);
        trafficControlConfig.setMaxWindowSize((int) j2);
        trafficControlConfig.setShowLog(true);
        trafficControlConfig.setStrategy(i3);
        a(j, i, new e(j, i, i2, trafficControlConfig));
    }

    @Nullable
    public static d b(long j, int i) {
        if (c == null) {
            c = new HashMap();
        }
        return c.get(c(j, i, 1));
    }

    public static void b(String str, String str2) {
        if (a) {
            com.heytap.accessory.base.logging.a.c(str, str2);
        }
    }

    public static void a(long j, int i, long j2, int i2, int i3) {
        if (e == null) {
            com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "tc not config, ignore tc.");
            return;
        }
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.b("TrafficController - TCTrack", com.heytap.accessory.accessorymanager.AccessoryManager.EXTRA_ACCESSORY + j + " not found, ignore tc");
            return;
        }
        int iH = bVarA.h();
        if (e.hasTransportTypeBanned(iH)) {
            com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "[tc banned] transportType: " + iH);
            return;
        }
        if (e.hasChannelTypeBanned(i3)) {
            com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "[tc banned] channelType: " + i3);
            return;
        }
        AccessoryManager.h().a(j2, i, e.getMaxWindowSize());
        a(j, i, new d(j, i, i2, e));
        com.heytap.accessory.base.logging.a.c("TrafficController - TCTrack", "[init Receiver], enable:" + e.isEnable() + "; maxWindowSize:" + e.getMaxWindowSize() + "; sleepTime:" + e.getHandleMsgTime() + "; sReceiverStrategy:" + e.getStrategy() + "; connectionId: " + j2 + "; channelId: " + i + "; accId: " + j + "; transId: " + i2);
    }

    public static void a(long j, int i, TrafficReport trafficReport, long j2, a aVar) {
        d dVarB = b(j, i);
        if (dVarB == null) {
            return;
        }
        dVarB.a(trafficReport, j2, aVar);
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

    public static int a(long j, int i, int i2) {
        e eVarD = d(j, i);
        if (eVarD == null) {
            com.heytap.accessory.base.logging.a.a("TrafficController - TCTrack", "calculatePackageLength, tc controller not found, use suggestion:" + i2);
            return i2;
        }
        return eVarD.a(i2);
    }

    public static void a(long j, int i, d dVar) {
        if (c == null) {
            c = new HashMap();
        }
        c.put(c(j, i, 1), dVar);
    }

    public static void a(long j, int i, e eVar) {
        if (d == null) {
            d = new HashMap();
        }
        d.put(c(j, i, 0), eVar);
    }

    public static void a(String str, String str2) {
        if (a) {
            com.heytap.accessory.base.logging.a.a(str, str2);
        }
    }
}
