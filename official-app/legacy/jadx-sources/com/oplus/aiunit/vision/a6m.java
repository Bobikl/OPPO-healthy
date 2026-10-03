package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class a6m {
    public static void a(z5m z5mVar, String str, String str2) throws XMPException {
        z5m z5mVar2 = new z5m("[]", str2, null);
        z5m z5mVar3 = new z5m("xml:lang", str, null);
        z5mVar2.e(z5mVar3);
        if ("x-default".equals(z5mVar3.O())) {
            z5mVar.b(1, z5mVar2);
        } else {
            z5mVar.d(z5mVar2);
        }
    }

    public static Object[] b(z5m z5mVar, String str, String str2) throws XMPException {
        if (!z5mVar.I().j()) {
            throw new XMPException("Localized text array is not alt-text", 102);
        }
        int i = 0;
        z5m z5mVar2 = null;
        if (!z5mVar.P()) {
            return new Object[]{new Integer(0), null};
        }
        Iterator itV = z5mVar.V();
        z5m z5mVar3 = null;
        while (itV.hasNext()) {
            z5m z5mVar4 = (z5m) itV.next();
            if (z5mVar4.I().m()) {
                throw new XMPException("Alt-text array item is not simple", 102);
            }
            if (!z5mVar4.Q() || !"xml:lang".equals(z5mVar4.K(1).H())) {
                throw new XMPException("Alt-text array item has no language qualifier", 102);
            }
            String strO = z5mVar4.K(1).O();
            if (str2.equals(strO)) {
                return new Object[]{new Integer(1), z5mVar4};
            }
            if (str != null && strO.startsWith(str)) {
                if (z5mVar2 == null) {
                    z5mVar2 = z5mVar4;
                }
                i++;
            } else if ("x-default".equals(strO)) {
                z5mVar3 = z5mVar4;
            }
        }
        if (i == 1) {
            return new Object[]{new Integer(2), z5mVar2};
        }
        if (i > 1) {
            return new Object[]{new Integer(3), z5mVar2};
        }
        return z5mVar3 != null ? new Object[]{new Integer(4), z5mVar3} : new Object[]{new Integer(5), z5mVar.p(1)};
    }

    public static void c(z5m z5mVar) {
        z5m z5mVarJ = z5mVar.J();
        if (z5mVar.I().n()) {
            z5mVarJ.a0(z5mVar);
        } else {
            z5mVarJ.Y(z5mVar);
        }
        if (z5mVarJ.P() || !z5mVarJ.I().o()) {
            return;
        }
        z5mVarJ.J().Y(z5mVarJ);
    }

    public static void d(z5m z5mVar) {
        boolean z;
        if (z5mVar.I().k() && z5mVar.P()) {
            Iterator itV = z5mVar.V();
            while (true) {
                if (!itV.hasNext()) {
                    z = false;
                    break;
                } else if (((z5m) itV.next()).I().h()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                z5mVar.I().t(true);
                o(z5mVar);
            }
        }
    }

    public static z5m e(z5m z5mVar, String str, boolean z) throws XMPException {
        if (!z5mVar.I().o() && !z5mVar.I().q()) {
            if (!z5mVar.S()) {
                throw new XMPException("Named children only allowed for schemas and structs", 102);
            }
            if (z5mVar.I().i()) {
                throw new XMPException("Named children not allowed for arrays", 102);
            }
            if (z) {
                z5mVar.I().B(true);
            }
        }
        z5m z5mVarN = z5mVar.n(str);
        if (z5mVarN != null || !z) {
            return z5mVarN;
        }
        z5m z5mVar2 = new z5m(str, new bze());
        z5mVar2.g0(true);
        z5mVar.d(z5mVar2);
        return z5mVar2;
    }

    public static int f(z5m z5mVar, String str, boolean z) throws XMPException {
        try {
            int i = Integer.parseInt(str.substring(1, str.length() - 1));
            if (i < 1) {
                throw new XMPException("Array index must be larger than zero", 102);
            }
            if (z && i == z5mVar.E() + 1) {
                z5m z5mVar2 = new z5m("[]", null);
                z5mVar2.g0(true);
                z5mVar.d(z5mVar2);
            }
            return i;
        } catch (NumberFormatException unused) {
            throw new XMPException("Array index not digits.", 102);
        }
    }

    public static z5m g(z5m z5mVar, c6m c6mVar, boolean z, bze bzeVar) throws XMPException {
        z5m z5mVar2;
        if (c6mVar == null || c6mVar.c() == 0) {
            throw new XMPException("Empty XMPPath", 102);
        }
        z5m z5mVarJ = j(z5mVar, c6mVar.b(0).c(), z);
        if (z5mVarJ == null) {
            return null;
        }
        if (z5mVarJ.S()) {
            z5mVarJ.g0(false);
            z5mVar2 = z5mVarJ;
        } else {
            z5mVar2 = null;
        }
        for (int i = 1; i < c6mVar.c(); i++) {
            try {
                z5mVarJ = k(z5mVarJ, c6mVar.b(i), z);
                if (z5mVarJ == null) {
                    if (z) {
                        c(z5mVar2);
                    }
                    return null;
                }
                if (z5mVarJ.S()) {
                    z5mVarJ.g0(false);
                    if (i == 1 && c6mVar.b(i).d() && c6mVar.b(i).a() != 0) {
                        z5mVarJ.I().f(c6mVar.b(i).a(), true);
                    } else if (i < c6mVar.c() - 1 && c6mVar.b(i).b() == 1 && !z5mVarJ.I().m()) {
                        z5mVarJ.I().B(true);
                    }
                    if (z5mVar2 == null) {
                        z5mVar2 = z5mVarJ;
                    }
                }
            } catch (XMPException e2) {
                if (z5mVar2 != null) {
                    c(z5mVar2);
                }
                throw e2;
            }
        }
        if (z5mVar2 != null) {
            z5mVarJ.I().r(bzeVar);
            z5mVarJ.i0(z5mVarJ.I());
        }
        return z5mVarJ;
    }

    public static z5m h(z5m z5mVar, String str, boolean z) throws XMPException {
        z5m z5mVarO = z5mVar.o(str);
        if (z5mVarO != null || !z) {
            return z5mVarO;
        }
        z5m z5mVar2 = new z5m(str, null);
        z5mVar2.g0(true);
        z5mVar.e(z5mVar2);
        return z5mVar2;
    }

    public static z5m i(z5m z5mVar, String str, String str2, boolean z) throws XMPException {
        z5m z5mVarN = z5mVar.n(str);
        if (z5mVarN == null && z) {
            z5mVarN = new z5m(str, new bze().A(true));
            z5mVarN.g0(true);
            String strA = w5m.a().a(str);
            if (strA == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new XMPException("Unregistered schema namespace URI", 101);
                }
                strA = w5m.a().b(str, str2);
            }
            z5mVarN.k0(strA);
            z5mVar.d(z5mVarN);
        }
        return z5mVarN;
    }

    public static z5m j(z5m z5mVar, String str, boolean z) throws XMPException {
        return i(z5mVar, str, null, z);
    }

    public static z5m k(z5m z5mVar, f6m f6mVar, boolean z) throws XMPException {
        int iN;
        int iB = f6mVar.b();
        if (iB == 1) {
            return e(z5mVar, f6mVar.c(), z);
        }
        if (iB == 2) {
            return h(z5mVar, f6mVar.c().substring(1), z);
        }
        if (!z5mVar.I().i()) {
            throw new XMPException("Indexing applied to non-array", 102);
        }
        if (iB == 3) {
            iN = f(z5mVar, f6mVar.c(), z);
        } else if (iB == 4) {
            iN = z5mVar.E();
        } else if (iB == 6) {
            String[] strArrI = srk.i(f6mVar.c());
            iN = l(z5mVar, strArrI[0], strArrI[1]);
        } else {
            if (iB != 5) {
                throw new XMPException("Unknown array indexing step in FollowXPathStep", 9);
            }
            String[] strArrI2 = srk.i(f6mVar.c());
            iN = n(z5mVar, strArrI2[0], strArrI2[1], f6mVar.a());
        }
        if (1 > iN || iN > z5mVar.E()) {
            return null;
        }
        return z5mVar.p(iN);
    }

    public static int l(z5m z5mVar, String str, String str2) throws XMPException {
        int i = -1;
        for (int i2 = 1; i2 <= z5mVar.E() && i < 0; i2++) {
            z5m z5mVarP = z5mVar.p(i2);
            if (!z5mVarP.I().q()) {
                throw new XMPException("Field selector must be used on array of struct", 102);
            }
            for (int i3 = 1; i3 <= z5mVarP.E(); i3++) {
                z5m z5mVarP2 = z5mVarP.p(i3);
                if (str.equals(z5mVarP2.H()) && str2.equals(z5mVarP2.O())) {
                    i = i2;
                    break;
                }
            }
        }
        return i;
    }

    public static int m(z5m z5mVar, String str) throws XMPException {
        if (!z5mVar.I().i()) {
            throw new XMPException("Language item must be used on array", 102);
        }
        for (int i = 1; i <= z5mVar.E(); i++) {
            z5m z5mVarP = z5mVar.p(i);
            if (z5mVarP.Q() && "xml:lang".equals(z5mVarP.K(1).H()) && str.equals(z5mVarP.K(1).O())) {
                return i;
            }
        }
        return -1;
    }

    public static int n(z5m z5mVar, String str, String str2, int i) throws XMPException {
        if ("xml:lang".equals(str)) {
            int iM = m(z5mVar, srk.h(str2));
            if (iM >= 0 || (i & 4096) <= 0) {
                return iM;
            }
            z5m z5mVar2 = new z5m("[]", null);
            z5mVar2.e(new z5m("xml:lang", "x-default", null));
            z5mVar.b(1, z5mVar2);
            return 1;
        }
        for (int i2 = 1; i2 < z5mVar.E(); i2++) {
            Iterator itW = z5mVar.p(i2).W();
            while (itW.hasNext()) {
                z5m z5mVar3 = (z5m) itW.next();
                if (str.equals(z5mVar3.H()) && str2.equals(z5mVar3.O())) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void o(z5m z5mVar) {
        if (z5mVar.I().j()) {
            for (int i = 2; i <= z5mVar.E(); i++) {
                z5m z5mVarP = z5mVar.p(i);
                if (z5mVarP.Q() && "x-default".equals(z5mVarP.K(1).O())) {
                    try {
                        z5mVar.X(i);
                        z5mVar.b(1, z5mVarP);
                    } catch (XMPException unused) {
                    }
                    if (i == 2) {
                        z5mVar.p(2).k0(z5mVarP.O());
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static bze p(bze bzeVar, Object obj) throws XMPException {
        if (bzeVar == null) {
            bzeVar = new bze();
        }
        if (bzeVar.j()) {
            bzeVar.u(true);
        }
        if (bzeVar.k()) {
            bzeVar.v(true);
        }
        if (bzeVar.l()) {
            bzeVar.s(true);
        }
        if (bzeVar.m() && obj != null && obj.toString().length() > 0) {
            throw new XMPException("Structs and arrays can't have values", 103);
        }
        bzeVar.a(bzeVar.d());
        return bzeVar;
    }
}
