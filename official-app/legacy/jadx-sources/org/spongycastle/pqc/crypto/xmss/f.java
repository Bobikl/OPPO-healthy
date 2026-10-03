package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.h5l;

/* JADX INFO: loaded from: classes11.dex */
public class f {
    public static XMSSNode a(d dVar, h5l h5lVar, b bVar) {
        double d;
        if (h5lVar == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (bVar == null) {
            throw new NullPointerException("address == null");
        }
        int iC = dVar.d().c();
        byte[][] bArrA = h5lVar.a();
        XMSSNode[] xMSSNodeArr = new XMSSNode[bArrA.length];
        for (int i = 0; i < bArrA.length; i++) {
            xMSSNodeArr[i] = new XMSSNode(0, bArrA[i]);
        }
        e eVarL = new b.C1051b().g(bVar.b()).h(bVar.c()).n(bVar.e()).o(0).p(bVar.g()).f(bVar.a()).l();
        while (true) {
            b bVar2 = (b) eVarL;
            if (iC <= 1) {
                return xMSSNodeArr[0];
            }
            int i2 = 0;
            while (true) {
                d = iC / 2;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                bVar2 = (b) new b.C1051b().g(bVar2.b()).h(bVar2.c()).n(bVar2.e()).o(bVar2.f()).p(i2).f(bVar2.a()).l();
                int i3 = i2 * 2;
                xMSSNodeArr[i2] = b(dVar, xMSSNodeArr[i3], xMSSNodeArr[i3 + 1], bVar2);
                i2++;
            }
            if (iC % 2 == 1) {
                xMSSNodeArr[(int) Math.floor(d)] = xMSSNodeArr[iC - 1];
            }
            iC = (int) Math.ceil(((double) iC) / 2.0d);
            eVarL = new b.C1051b().g(bVar2.b()).h(bVar2.c()).n(bVar2.e()).o(bVar2.f() + 1).p(bVar2.g()).f(bVar2.a()).l();
        }
    }

    public static XMSSNode b(d dVar, XMSSNode xMSSNode, XMSSNode xMSSNode2, e eVar) {
        if (xMSSNode == null) {
            throw new NullPointerException("left == null");
        }
        if (xMSSNode2 == null) {
            throw new NullPointerException("right == null");
        }
        if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (eVar == null) {
            throw new NullPointerException("address == null");
        }
        byte[] bArrF = dVar.f();
        if (eVar instanceof b) {
            b bVar = (b) eVar;
            eVar = (b) new b.C1051b().g(bVar.b()).h(bVar.c()).n(bVar.e()).o(bVar.f()).p(bVar.g()).f(0).l();
        } else if (eVar instanceof a) {
            a aVar = (a) eVar;
            eVar = (a) new a.b().g(aVar.b()).h(aVar.c()).m(aVar.e()).n(aVar.f()).f(0).k();
        }
        byte[] bArrC = dVar.c().c(bArrF, eVar.d());
        if (eVar instanceof b) {
            b bVar2 = (b) eVar;
            eVar = (b) new b.C1051b().g(bVar2.b()).h(bVar2.c()).n(bVar2.e()).o(bVar2.f()).p(bVar2.g()).f(1).l();
        } else if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            eVar = (a) new a.b().g(aVar2.b()).h(aVar2.c()).m(aVar2.e()).n(aVar2.f()).f(1).k();
        }
        byte[] bArrC2 = dVar.c().c(bArrF, eVar.d());
        if (eVar instanceof b) {
            b bVar3 = (b) eVar;
            eVar = (b) new b.C1051b().g(bVar3.b()).h(bVar3.c()).n(bVar3.e()).o(bVar3.f()).p(bVar3.g()).f(2).l();
        } else if (eVar instanceof a) {
            a aVar3 = (a) eVar;
            eVar = (a) new a.b().g(aVar3.b()).h(aVar3.c()).m(aVar3.e()).n(aVar3.f()).f(2).k();
        }
        byte[] bArrC3 = dVar.c().c(bArrF, eVar.d());
        int iB = dVar.d().b();
        byte[] bArr = new byte[iB * 2];
        for (int i = 0; i < iB; i++) {
            bArr[i] = (byte) (xMSSNode.getValue()[i] ^ bArrC2[i]);
        }
        for (int i2 = 0; i2 < iB; i2++) {
            bArr[i2 + iB] = (byte) (xMSSNode2.getValue()[i2] ^ bArrC3[i2]);
        }
        return new XMSSNode(xMSSNode.getHeight(), dVar.c().b(bArrC, bArr));
    }
}
