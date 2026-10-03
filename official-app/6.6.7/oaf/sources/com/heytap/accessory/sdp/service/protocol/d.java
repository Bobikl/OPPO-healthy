package com.heytap.accessory.sdp.service.protocol;

import com.heytap.accessory.message.e;
import java.util.Iterator;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d {
    public static final String a = "d";

    public static boolean a(int i) {
        return i == 2 || i == 3;
    }

    public static c b(com.heytap.accessory.message.a aVar) {
        return e(aVar);
    }

    public static b c(com.heytap.accessory.message.a aVar) {
        if (aVar == null || aVar.f() == null || aVar.g() <= 0) {
            com.heytap.accessory.base.logging.a.b(a, "Error while Parsing Capability Discovery Query Message!");
            return null;
        }
        int iG = aVar.g();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        b bVar = new b();
        try {
            bVar.d = dVar.a("mMessageType");
            byte bA = dVar.a("mQueryType");
            bVar.f = bA;
            if (!a(bA)) {
                bVar.e = aVar.d(2);
            } else if (6 <= iG) {
                bVar.c = dVar.b(4, "mChecksum");
                if (7 <= iG) {
                    bVar.e = dVar.a("mNoOfRecords");
                }
            }
            com.heytap.accessory.base.logging.a.a(a, "ServiceDiscoveryMessageParams, params.mNoOfRecords = " + bVar.e);
            for (int i = 0; i < bVar.e; i++) {
                b.b bVar2 = new b.b();
                String strB = dVar.b((byte) 59, "profileId");
                bVar2.a = strB;
                bVar2.a = strB.trim();
                String str = a;
                com.heytap.accessory.base.logging.a.a(str, "ServiceDiscoveryMessageParams, profileId = " + bVar2.a);
                if (bVar2.a.length() > 0) {
                    bVar.b.add(bVar2);
                } else {
                    com.heytap.accessory.base.logging.a.e(str, "ignoring empty profileId!");
                }
            }
            if (dVar.a() != iG) {
                com.heytap.accessory.base.logging.a.e(a, "Trailing bytes found in Capability Discovery Request Message! Ignoring");
            }
            com.heytap.accessory.base.logging.a.a(a + " - SLPTrack", "parse query serviceParams: " + bVar);
            return bVar;
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, e.toString());
            return null;
        }
    }

    public static b d(com.heytap.accessory.message.a aVar) {
        if (aVar == null || aVar.f() == null || aVar.g() <= 0) {
            com.heytap.accessory.base.logging.a.b(a, "Error while Parsing Capability Discovery Response Message!");
            return null;
        }
        int iG = aVar.g();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        b bVar = new b();
        try {
            bVar.d = dVar.a("mMessageType");
            byte bA = dVar.a("mQueryType");
            bVar.f = bA;
            if (a(bA)) {
                bVar.c = dVar.b(4, "mChecksum");
            }
            bVar.e = dVar.b(2, "mNoOfRecords");
            for (int i = 0; i < bVar.e; i++) {
                b.a aVar2 = new b.a();
                aVar2.a = dVar.b((byte) 59, "appName");
                aVar2.b = dVar.b((byte) 59, "appHash");
                int iB = dVar.b(2, "nAgents");
                for (int i2 = 0; i2 < iB; i2++) {
                    b.c cVar = new b.c();
                    cVar.b = dVar.b(2, "agentId");
                    if (dVar.a((byte) 61)) {
                        cVar.d = dVar.d(17, "profileId");
                    } else {
                        cVar.d = dVar.b((byte) 59, "profileId");
                        cVar.a = dVar.b(2, "profileVersion");
                        cVar.e = dVar.a("role");
                        cVar.c = dVar.b(2, "connTimeOut");
                    }
                    aVar2.c.add(cVar);
                }
                bVar.a.add(aVar2);
            }
            StringBuilder sb = new StringBuilder();
            String str = a;
            sb.append(str);
            sb.append(" - SLPTrack");
            com.heytap.accessory.base.logging.a.a(sb.toString(), "parse response serviceParams: " + bVar);
            if (dVar.a() != iG) {
                com.heytap.accessory.base.logging.a.e(str, "Trailing bytes found in Capability Discovery Response Message! Ignoring");
            }
            return bVar;
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, e.toString());
            return null;
        }
    }

    public static c e(com.heytap.accessory.message.a aVar) {
        if (aVar == null || aVar.f() == null || aVar.g() <= 0) {
            com.heytap.accessory.base.logging.a.b(a, "Error while Parsing Capability Incremental Update Message!");
            return null;
        }
        int iG = aVar.g();
        c cVar = new c();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            cVar.c = dVar.a("mMessageType ");
            byte bA = dVar.a("mQueryType");
            cVar.e = bA;
            if (a(bA)) {
                cVar.b = dVar.b(4, "mChecksum");
            }
            cVar.d = dVar.b(2, "mNoOfRecords");
            for (int i = 0; i < cVar.d; i++) {
                c.a aVar2 = new c.a();
                aVar2.d = dVar.a("updateType");
                String strB = dVar.b((byte) 59, "appName");
                aVar2.a = strB;
                if (strB.length() > 30) {
                    com.heytap.accessory.base.logging.a.e(a, "App Friendly Name [" + aVar2.a + "] is too long!");
                }
                aVar2.b = dVar.b((byte) 59, "appHash");
                int iB = dVar.b(2, "nAgents");
                for (int i2 = 0; i2 < iB; i2++) {
                    c.b bVar = new c.b();
                    bVar.b = dVar.b(2, "agentId");
                    if (dVar.a((byte) 61)) {
                        bVar.d = dVar.d(17, "profileId");
                    } else {
                        bVar.d = dVar.b((byte) 59, "profileId");
                        bVar.a = dVar.b(2, "profileVersion");
                        bVar.e = dVar.a("role");
                        bVar.c = dVar.b(2, "connTimeOut");
                    }
                    aVar2.c.add(bVar);
                }
                cVar.a.add(aVar2);
            }
            if (dVar.a() != iG) {
                com.heytap.accessory.base.logging.a.e(a, "Trailing bytes found in parseCapabilityIncrUpdateMessage! Ignoring");
            }
            com.heytap.accessory.base.logging.a.a(a + " - SLPTrack", "parse Incr ServiceParams: " + cVar);
            return cVar;
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, e.toString() + "(parseCapabilityIncrUpdateMessage)");
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(b bVar, long j, long j2) {
        if (bVar != null) {
            return a(j, j2, bVar);
        }
        throw new AssertionError();
    }

    public static com.heytap.accessory.message.a b(long j, long j2, b bVar) {
        com.heytap.accessory.base.logging.a.a(a + " - SLPTrack", "compose response ServiceParams: " + bVar);
        int length = a(bVar.f) ? 8 : 4;
        for (b.a aVar : bVar.a) {
            length += aVar.a.length() + 1 + aVar.b.length() + 1 + 2;
            Iterator<b.c> it = aVar.c.iterator();
            while (it.hasNext()) {
                length = length + 3 + it.next().d.length() + 1 + 4;
            }
        }
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j, j2, length);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(a, "Failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        try {
            e eVar = new e(aVarC);
            eVar.a(bVar.d);
            eVar.a(bVar.f);
            if (a(bVar.f)) {
                eVar.a(bVar.c, 4);
            }
            eVar.a(bVar.e, 2);
            for (b.a aVar2 : bVar.a) {
                eVar.a(aVar2.a);
                eVar.a((byte) 59);
                eVar.a(aVar2.b);
                eVar.a((byte) 59);
                eVar.a(aVar2.c.size(), 2);
                for (b.c cVar : aVar2.c) {
                    eVar.a(cVar.b, 2);
                    eVar.a(cVar.d);
                    eVar.a((byte) 59);
                    eVar.a(cVar.a, 2);
                    eVar.a(cVar.e);
                    eVar.a(cVar.c, 2);
                }
            }
            return eVar.a();
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, e.toString());
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(long j, long j2, c cVar) {
        com.heytap.accessory.base.logging.a.a(a + " - SLPTrack", "compose Incr serviceparams: " + cVar);
        int length = (a(cVar.e) ? 6 : 2) + 2;
        for (c.a aVar : cVar.a) {
            length += aVar.a.length() + 1 + 1 + aVar.b.length() + 1 + 2;
            Iterator<c.b> it = aVar.c.iterator();
            while (it.hasNext()) {
                length += it.next().d.length() + 2 + 1 + 2 + 1 + 2;
            }
        }
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j, j2, length);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(a, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        try {
            e eVar = new e(aVarC);
            eVar.a(cVar.c);
            eVar.a(cVar.e);
            if (a(cVar.e)) {
                eVar.a(cVar.b, 4);
            }
            eVar.a(cVar.d, 2);
            for (c.a aVar2 : cVar.a) {
                eVar.a(aVar2.d);
                eVar.a(aVar2.a);
                eVar.a((byte) 59);
                eVar.a(aVar2.b);
                eVar.a((byte) 59);
                eVar.a(aVar2.c.size(), 2);
                for (c.b bVar : aVar2.c) {
                    eVar.a(bVar.b, 2);
                    eVar.a(bVar.d);
                    eVar.a((byte) 59);
                    eVar.a(bVar.a, 2);
                    eVar.a(bVar.e);
                    eVar.a(bVar.c, 2);
                }
            }
            return eVar.a();
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.a(a, e.toString(), e);
            return null;
        }
    }

    public static com.heytap.accessory.message.a b(b bVar, long j, long j2) {
        if (bVar != null) {
            return b(j, j2, bVar);
        }
        throw new AssertionError();
    }

    public static com.heytap.accessory.message.a a(long j, long j2, b bVar) {
        com.heytap.accessory.base.logging.a.a(a + " - SLPTrack", "compose query ServiceParams: " + bVar);
        int length = a(bVar.f) ? 7 : 3;
        for (b.b bVar2 : bVar.b) {
            if (bVar2.a.length() >= 0) {
                length += bVar2.a.length() + 1;
            }
        }
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j, j2, length);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(a, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        e eVar = new e(aVarC);
        try {
            eVar.a(bVar.d);
            eVar.a(bVar.f);
            if (a(bVar.f)) {
                eVar.a(bVar.c, 4);
            }
            eVar.a((byte) (bVar.e & 255));
            for (b.b bVar3 : bVar.b) {
                if (bVar3.a.length() >= 0) {
                    com.heytap.accessory.base.logging.a.a(a, "ServiceDiscoveryMessageParams compose profileId: " + bVar3.a);
                    eVar.a(bVar3.a);
                    eVar.a((byte) 59);
                }
            }
            return eVar.a();
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, e.toString());
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(c cVar, long j, long j2) {
        if (cVar != null) {
            return a(j, j2, cVar);
        }
        throw new AssertionError();
    }

    public static b a(com.heytap.accessory.message.a aVar) {
        if (aVar != null && aVar.f() != null && aVar.g() > 0) {
            byte bD = aVar.d(0);
            if (bD == 1) {
                return c(aVar);
            }
            if (bD == 2) {
                return d(aVar);
            }
            com.heytap.accessory.base.logging.a.e(a, "Invalid message received by Capability Manager");
            return null;
        }
        com.heytap.accessory.base.logging.a.b(a, "Error while Parsing Capability Discovery Message params!");
        return null;
    }
}
