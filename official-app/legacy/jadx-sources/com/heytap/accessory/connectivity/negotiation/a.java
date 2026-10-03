package com.heytap.accessory.connectivity.negotiation;

import com.heytap.accessory.message.d;
import com.heytap.accessory.message.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static final String a = "a";

    public static com.heytap.accessory.message.a a(long j2, long j3, List<b.e> list) {
        int iA;
        if (list == null || (iA = a(1, list)) == 0) {
            return null;
        }
        e eVar = new e(com.heytap.accessory.message.a.c(j2, j3, iA));
        try {
            eVar.a((byte) 1);
            eVar.a((byte) list.size());
            for (b.e eVar2 : list) {
                eVar.a((byte) eVar2.b());
                int length = eVar2.a().length();
                if (length > 32) {
                    length = 32;
                }
                eVar.a(eVar2.a(), length);
                eVar.a((byte) 59);
                com.heytap.accessory.base.logging.a.a(a, "obtainQueryMessage " + eVar2.b() + " , " + eVar2.a());
            }
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(a, "compose msg error.");
            e2.printStackTrace();
        }
        return eVar.a();
    }

    public static com.heytap.accessory.message.a b(long j2, long j3, List<b.e> list) {
        e eVar = new e(com.heytap.accessory.message.a.c(j2, j3, a(2, list)));
        try {
            eVar.a((byte) 2);
            eVar.a((byte) list.size());
            for (b.e eVar2 : list) {
                eVar.a((byte) eVar2.b());
                eVar.a((byte) eVar2.d());
                if (eVar2.d() == 0) {
                    eVar.a(eVar2.c());
                    eVar.a((byte) 59);
                }
                com.heytap.accessory.base.logging.a.a(a, "obtainResponseMessage " + eVar2.b() + " , " + eVar2.c() + " , " + eVar2.d());
            }
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(a, "compose msg error.");
            e2.printStackTrace();
        }
        return eVar.a();
    }

    public static List<b.e> c(com.heytap.accessory.message.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar == null || aVar.f() == null || aVar.g() <= 0) {
            com.heytap.accessory.base.logging.a.b(a, "Error Parsing nego Response Message!");
            return arrayList;
        }
        d dVar = new d(aVar);
        try {
            dVar.a("msg type");
            byte bA = dVar.a("channel size");
            for (int i = 0; i < bA; i++) {
                byte bA2 = dVar.a("channel type");
                byte bA3 = dVar.a("status");
                String strB = bA3 == 0 ? dVar.b((byte) 59, "params") : null;
                b.e eVar = new b.e();
                eVar.a(bA2);
                eVar.b(bA3);
                eVar.b(strB);
                arrayList.add(eVar);
                com.heytap.accessory.base.logging.a.a(a, "parseResponseMessage " + eVar.b() + " , " + eVar.c() + " , " + eVar.d());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public static int a(com.heytap.accessory.message.a aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            return new d(aVar).a("channel type");
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(a, "get message type error." + e2);
            return -1;
        }
    }

    public static List<b.e> b(com.heytap.accessory.message.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar != null && aVar.f() != null && aVar.g() > 0) {
            d dVar = new d(aVar);
            try {
                byte bA = dVar.a("msg type");
                byte bA2 = dVar.a("channel size");
                com.heytap.accessory.base.logging.a.a(a, "test log query " + ((int) bA) + " , " + ((int) bA2));
                for (int i = 0; i < bA2; i++) {
                    byte bA3 = dVar.a("channel type");
                    String strB = dVar.b((byte) 59, "channel name");
                    b.e eVar = new b.e();
                    eVar.a(bA3);
                    eVar.a(strB);
                    arrayList.add(eVar);
                    com.heytap.accessory.base.logging.a.a(a, "query " + ((int) bA3) + " , " + strB);
                }
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b(a, "Error reading nego Query Message!");
                e2.printStackTrace();
            }
            return arrayList;
        }
        com.heytap.accessory.base.logging.a.b(a, "Error Parsing nego Query Message!");
        return arrayList;
    }

    public static int a(int i, List<b.e> list) {
        int length = 0;
        if (list == null) {
            return 0;
        }
        if (1 == i) {
            Iterator<b.e> it = list.iterator();
            length = 2;
            while (it.hasNext()) {
                length += it.next().a().length() + 2;
            }
        } else if (2 == i) {
            length = 2;
            for (b.e eVar : list) {
                length += 2;
                if (eVar.d() == 0 && eVar.c() != null) {
                    length += eVar.c().length() + 1;
                }
            }
        }
        return length;
    }
}
