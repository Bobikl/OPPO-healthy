package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class x5m implements v5m {
    public z5m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18502j;

    public class a implements g6m {
        public final /* synthetic */ Object a;
        public final /* synthetic */ z5m b;

        public a(Object obj, z5m z5mVar) {
            this.a = obj;
            this.b = z5mVar;
        }

        @Override // com.oplus.aiunit.vision.g6m
        public String getValue() {
            Object obj = this.a;
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }

        public String toString() {
            return this.a.toString();
        }
    }

    public x5m() {
        this.f18502j = null;
        this.i = new z5m(null, null, null);
    }

    public final Object a(int i, z5m z5mVar) throws XMPException {
        Object bool;
        String strO = z5mVar.O();
        switch (i) {
            case 1:
                bool = new Boolean(j6m.b(strO));
                break;
            case 2:
                bool = new Integer(j6m.e(strO));
                break;
            case 3:
                bool = new Long(j6m.f(strO));
                break;
            case 4:
                bool = new Double(j6m.d(strO));
                break;
            case 5:
                return j6m.c(strO);
            case 6:
                return j6m.c(strO).x();
            case 7:
                return j6m.g(strO);
            default:
                return (strO != null || z5mVar.I().m()) ? strO : "";
        }
        return bool;
    }

    public g6m b(String str, String str2, int i) throws XMPException {
        k7e.e(str);
        k7e.d(str2);
        z5m z5mVarG = a6m.g(this.i, e6m.a(str, str2), false, null);
        if (z5mVarG == null) {
            return null;
        }
        if (i == 0 || !z5mVarG.I().m()) {
            return new a(a(i, z5mVarG), z5mVarG);
        }
        throw new XMPException("Property must be simple when a value type is requested", 102);
    }

    public z5m c() {
        return this.i;
    }

    public Object clone() {
        return new x5m((z5m) this.i.clone());
    }

    public void d(String str) {
        this.f18502j = str;
    }

    @Override // com.oplus.aiunit.vision.v5m
    public g6m l(String str, String str2, String str3, String str4) throws XMPException {
        k7e.e(str);
        k7e.g(str2);
        return p(str, str2 + d6m.c(str3, str4));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    @Override // com.oplus.aiunit.vision.v5m
    public void n(String str, String str2, String str3, String str4, String str5, bze bzeVar) throws XMPException {
        z5m z5mVar;
        boolean z;
        k7e.e(str);
        k7e.a(str2);
        k7e.f(str4);
        String strH = str3 != null ? srk.h(str3) : null;
        String strH2 = srk.h(str4);
        z5m z5mVarG = a6m.g(this.i, e6m.a(str, str2), true, new bze(k18.GL_KEEP));
        if (z5mVarG == null) {
            throw new XMPException("Failed to find or create array node", 102);
        }
        if (!z5mVarG.I().j()) {
            if (z5mVarG.P() || !z5mVarG.I().k()) {
                throw new XMPException("Specified property is no alt-text array", 102);
            }
            z5mVarG.I().t(true);
        }
        Iterator itV = z5mVarG.V();
        while (true) {
            if (!itV.hasNext()) {
                z5mVar = null;
                z = false;
                break;
            }
            z5mVar = (z5m) itV.next();
            if (!z5mVar.Q() || !"xml:lang".equals(z5mVar.K(1).H())) {
                throw new XMPException("Language qualifier must be first", 102);
            }
            if ("x-default".equals(z5mVar.K(1).O())) {
                z = true;
                break;
            }
        }
        if (z5mVar != null && z5mVarG.E() > 1) {
            z5mVarG.Y(z5mVar);
            z5mVarG.b(1, z5mVar);
        }
        Object[] objArrB = a6m.b(z5mVarG, strH, strH2);
        int iIntValue = ((Integer) objArrB[0]).intValue();
        z5m z5mVar2 = (z5m) objArrB[1];
        boolean zEquals = "x-default".equals(strH2);
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    if (z && z5mVar != z5mVar2 && z5mVar != null && z5mVar.O().equals(z5mVar2.O())) {
                        z5mVar.k0(str5);
                    }
                    z5mVar2.k0(str5);
                } else if (iIntValue == 3) {
                    a6m.a(z5mVarG, strH2, str5);
                    if (zEquals) {
                    }
                } else if (iIntValue == 4) {
                    if (z5mVar != null && z5mVarG.E() == 1) {
                        z5mVar.k0(str5);
                    }
                    a6m.a(z5mVarG, strH2, str5);
                } else {
                    if (iIntValue != 5) {
                        throw new XMPException("Unexpected result from ChooseLocalizedText", 9);
                    }
                    a6m.a(z5mVarG, strH2, str5);
                    if (zEquals) {
                    }
                }
            } else if (zEquals) {
                Iterator itV2 = z5mVarG.V();
                while (itV2.hasNext()) {
                    z5m z5mVar3 = (z5m) itV2.next();
                    if (z5mVar3 != z5mVar) {
                        if (z5mVar3.O().equals(z5mVar != null ? z5mVar.O() : null)) {
                            z5mVar3.k0(str5);
                        }
                    }
                }
                if (z5mVar != null) {
                    z5mVar.k0(str5);
                }
            } else {
                if (z && z5mVar != z5mVar2 && z5mVar != null && z5mVar.O().equals(z5mVar2.O())) {
                    z5mVar.k0(str5);
                }
                z5mVar2.k0(str5);
            }
            if (z && z5mVarG.E() == 1) {
                a6m.a(z5mVarG, "x-default", str5);
                return;
            }
        }
        a6m.a(z5mVarG, "x-default", str5);
        if (!zEquals) {
            a6m.a(z5mVarG, strH2, str5);
        }
        z = true;
        if (z) {
        }
    }

    @Override // com.oplus.aiunit.vision.v5m
    public int o(String str, String str2) throws XMPException {
        k7e.e(str);
        k7e.a(str2);
        z5m z5mVarG = a6m.g(this.i, e6m.a(str, str2), false, null);
        if (z5mVarG == null) {
            return 0;
        }
        if (z5mVarG.I().i()) {
            return z5mVarG.E();
        }
        throw new XMPException("The named property is not an array", 102);
    }

    @Override // com.oplus.aiunit.vision.v5m
    public g6m p(String str, String str2) throws XMPException {
        return b(str, str2, 0);
    }

    public x5m(z5m z5mVar) {
        this.f18502j = null;
        this.i = z5mVar;
    }
}
