package com.heytap.accessory.connectivity.params;

import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public static final String a = "d";

    public static c a(int i, int i2, int i3) {
        c aVar;
        if (i == 1) {
            e eVar = new e();
            eVar.a(0);
            aVar = eVar;
        } else if (i == 2) {
            b bVar = new b();
            if (i2 == 1) {
                bVar.a(i3);
                return bVar;
            }
            int i4 = Integer.parseInt("aa15", 16);
            if (i3 == 1) {
                i4 = Integer.parseInt("bb15", 16);
            }
            com.heytap.accessory.base.logging.a.a(a, "btDefaultValue:" + i4 + "; uuidType: " + i3);
            StringBuilder sb = new StringBuilder();
            sb.append("a49e");
            sb.append(Integer.toHexString(i4 + i2 + 1));
            sb.append("-cb06-495c-9f4f-bb80a90cdf00");
            bVar.b = UUID.fromString(sb.toString());
            aVar = bVar;
        } else {
            if (i != 4) {
                throw new UnsupportedOperationException("connect type no support!!");
            }
            aVar = new a();
        }
        aVar.a = i2;
        return aVar;
    }

    public static c a(long j2, int i, int i2, int i3) {
        if (i3 == 1) {
            return a(i, i2);
        }
        return a(j2, i, i3);
    }

    public static c a(long j2, int i, int i2) {
        c cVarA;
        String strB = com.heytap.accessory.connectivity.negotiation.b.b().b(j2, i2);
        if (i == 1) {
            cVarA = new e().a(strB);
        } else if (i == 2) {
            cVarA = new b().a(strB);
        } else if (i == 4) {
            cVarA = new a().a(strB);
        } else {
            throw new UnsupportedOperationException("connect type no support!!");
        }
        cVarA.a = i2;
        return cVarA;
    }

    public static c a(int i, int i2) {
        c eVar;
        if (i == 1) {
            eVar = new e();
        } else if (i == 2) {
            eVar = new b();
        } else if (i == 4) {
            eVar = new a();
        } else {
            throw new UnsupportedOperationException("connect type no support!!");
        }
        eVar.a(i2);
        return eVar;
    }
}
