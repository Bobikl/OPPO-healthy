package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class b6m {
    public static Map a;

    static {
        d();
    }

    public static void a(z5m z5mVar, z5m z5mVar2, boolean z) throws XMPException {
        if (!z5mVar.O().equals(z5mVar2.O()) || z5mVar.E() != z5mVar2.E()) {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        }
        if (!z && (!z5mVar.H().equals(z5mVar2.H()) || !z5mVar.I().equals(z5mVar2.I()) || z5mVar.M() != z5mVar2.M())) {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        }
        Iterator itV = z5mVar.V();
        Iterator itV2 = z5mVar2.V();
        while (itV.hasNext() && itV2.hasNext()) {
            a((z5m) itV.next(), (z5m) itV2.next(), false);
        }
        Iterator itW = z5mVar.W();
        Iterator itW2 = z5mVar2.W();
        while (itW.hasNext() && itW2.hasNext()) {
            a((z5m) itW.next(), (z5m) itW2.next(), false);
        }
    }

    public static void b(z5m z5mVar) {
        Iterator itV = z5mVar.V();
        while (itV.hasNext()) {
            if (!((z5m) itV.next()).P()) {
                itV.remove();
            }
        }
    }

    public static void c(z5m z5mVar) throws XMPException {
        z5m z5mVarE = a6m.e(z5mVar, "exif:GPSTimeStamp", false);
        if (z5mVarE == null) {
            return;
        }
        try {
            t5m t5mVarC = j6m.c(z5mVarE.O());
            if (t5mVarC.getYear() == 0 && t5mVarC.getMonth() == 0 && t5mVarC.getDay() == 0) {
                z5m z5mVarE2 = a6m.e(z5mVar, "exif:DateTimeOriginal", false);
                if (z5mVarE2 == null) {
                    z5mVarE2 = a6m.e(z5mVar, "exif:DateTimeDigitized", false);
                }
                t5m t5mVarC2 = j6m.c(z5mVarE2.O());
                Calendar calendarX = t5mVarC.x();
                calendarX.set(1, t5mVarC2.getYear());
                calendarX.set(2, t5mVarC2.getMonth());
                calendarX.set(5, t5mVarC2.getDay());
                z5mVarE.k0(j6m.a(new u5m(calendarX)));
            }
        } catch (XMPException unused) {
        }
    }

    public static void d() {
        a = new HashMap();
        bze bzeVar = new bze();
        bzeVar.s(true);
        a.put("dc:contributor", bzeVar);
        a.put("dc:language", bzeVar);
        a.put("dc:publisher", bzeVar);
        a.put("dc:relation", bzeVar);
        a.put("dc:subject", bzeVar);
        a.put("dc:type", bzeVar);
        bze bzeVar2 = new bze();
        bzeVar2.s(true);
        bzeVar2.v(true);
        a.put("dc:creator", bzeVar2);
        a.put("dc:date", bzeVar2);
        bze bzeVar3 = new bze();
        bzeVar3.s(true);
        bzeVar3.v(true);
        bzeVar3.u(true);
        bzeVar3.t(true);
        a.put("dc:description", bzeVar3);
        a.put("dc:rights", bzeVar3);
        a.put("dc:title", bzeVar3);
    }

    public static void e(v5m v5mVar, z5m z5mVar) {
        String str;
        try {
            z5m z5mVarJ = a6m.j(((x5m) v5mVar).c(), "http://purl.org/dc/elements/1.1/", true);
            String strO = z5mVar.O();
            z5m z5mVarE = a6m.e(z5mVarJ, "dc:rights", false);
            if (z5mVarE == null || !z5mVarE.P()) {
                v5mVar.n("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", "\n\n" + strO, null);
            } else {
                int iM = a6m.m(z5mVarE, "x-default");
                if (iM < 0) {
                    v5mVar.n("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", z5mVarE.p(1).O(), null);
                    iM = a6m.m(z5mVarE, "x-default");
                }
                z5m z5mVarP = z5mVarE.p(iM);
                String strO2 = z5mVarP.O();
                int iIndexOf = strO2.indexOf("\n\n");
                if (iIndexOf >= 0) {
                    int i = iIndexOf + 2;
                    if (!strO2.substring(i).equals(strO)) {
                        str = strO2.substring(0, i) + strO;
                        z5mVarP.k0(str);
                    }
                } else if (!strO.equals(strO2)) {
                    str = strO2 + "\n\n" + strO;
                    z5mVarP.k0(str);
                }
            }
            z5mVar.J().Y(z5mVar);
        } catch (XMPException unused) {
        }
    }

    public static void f(z5m z5mVar, z7e z7eVar) throws XMPException {
        if (z5mVar.F()) {
            z5mVar.e0(false);
            boolean zM = z7eVar.m();
            for (z5m z5mVar2 : z5mVar.N()) {
                if (z5mVar2.F()) {
                    Iterator itV = z5mVar2.V();
                    while (itV.hasNext()) {
                        z5m z5mVar3 = (z5m) itV.next();
                        if (z5mVar3.R()) {
                            z5mVar3.d0(false);
                            s5m s5mVarD = w5m.a().d(z5mVar3.H());
                            if (s5mVarD != null) {
                                z5m z5mVarP = null;
                                z5m z5mVarI = a6m.i(z5mVar, s5mVarD.c(), null, true);
                                z5mVarI.g0(false);
                                z5m z5mVarE = a6m.e(z5mVarI, s5mVarD.d() + s5mVarD.a(), false);
                                if (z5mVarE != null) {
                                    if (!s5mVarD.b().j()) {
                                        if (s5mVarD.b().i()) {
                                            int iM = a6m.m(z5mVarE, "x-default");
                                            if (iM != -1) {
                                                z5mVarP = z5mVarE.p(iM);
                                            }
                                        } else if (z5mVarE.P()) {
                                            z5mVarP = z5mVarE.p(1);
                                        }
                                        if (z5mVarP == null) {
                                            k(itV, z5mVar3, z5mVarE);
                                        } else if (zM) {
                                            a(z5mVar3, z5mVarP, true);
                                        }
                                    } else if (zM) {
                                        a(z5mVar3, z5mVarE, true);
                                    }
                                    itV.remove();
                                } else if (s5mVarD.b().j()) {
                                    z5mVar3.h0(s5mVarD.d() + s5mVarD.a());
                                    z5mVarI.d(z5mVar3);
                                    itV.remove();
                                } else {
                                    z5m z5mVar4 = new z5m(s5mVarD.d() + s5mVarD.a(), s5mVarD.b().m());
                                    z5mVarI.d(z5mVar4);
                                    k(itV, z5mVar3, z5mVar4);
                                }
                            }
                        }
                    }
                    z5mVar2.e0(false);
                }
            }
        }
    }

    public static void g(z5m z5mVar) throws XMPException {
        for (int i = 1; i <= z5mVar.E(); i++) {
            z5m z5mVarP = z5mVar.p(i);
            bze bzeVar = (bze) a.get(z5mVarP.H());
            if (bzeVar != null) {
                if (z5mVarP.I().p()) {
                    z5m z5mVar2 = new z5m(z5mVarP.H(), bzeVar);
                    z5mVarP.h0("[]");
                    z5mVar2.d(z5mVarP);
                    z5mVar.c0(i, z5mVar2);
                    if (bzeVar.j() && !z5mVarP.I().h()) {
                        z5mVarP.e(new z5m("xml:lang", "x-default", null));
                    }
                } else {
                    z5mVarP.I().f(k18.GL_KEEP, false);
                    z5mVarP.I().r(bzeVar);
                    if (bzeVar.j()) {
                        i(z5mVarP);
                    }
                }
            }
        }
    }

    public static v5m h(x5m x5mVar, z7e z7eVar) throws XMPException {
        z5m z5mVarC = x5mVar.c();
        j(x5mVar);
        f(z5mVarC, z7eVar);
        l(z5mVarC);
        b(z5mVarC);
        return x5mVar;
    }

    public static void i(z5m z5mVar) throws XMPException {
        if (z5mVar == null || !z5mVar.I().i()) {
            return;
        }
        z5mVar.I().v(true).u(true).t(true);
        Iterator itV = z5mVar.V();
        while (itV.hasNext()) {
            z5m z5mVar2 = (z5m) itV.next();
            if (!z5mVar2.I().m()) {
                if (!z5mVar2.I().h()) {
                    String strO = z5mVar2.O();
                    if (strO != null && strO.length() != 0) {
                        z5mVar2.e(new z5m("xml:lang", "x-repair", null));
                    }
                }
            }
            itV.remove();
        }
    }

    public static void j(x5m x5mVar) throws XMPException {
        z5m z5mVarE;
        a6m.j(x5mVar.c(), "http://purl.org/dc/elements/1.1/", true);
        Iterator itV = x5mVar.c().V();
        while (itV.hasNext()) {
            z5m z5mVar = (z5m) itV.next();
            if ("http://purl.org/dc/elements/1.1/".equals(z5mVar.H())) {
                g(z5mVar);
            } else if ("http://ns.adobe.com/exif/1.0/".equals(z5mVar.H())) {
                c(z5mVar);
                z5mVarE = a6m.e(z5mVar, "exif:UserComment", false);
                if (z5mVarE != null) {
                    i(z5mVarE);
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(z5mVar.H())) {
                z5m z5mVarE2 = a6m.e(z5mVar, "xmpDM:copyright", false);
                if (z5mVarE2 != null) {
                    e(x5mVar, z5mVarE2);
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(z5mVar.H()) && (z5mVarE = a6m.e(z5mVar, "xmpRights:UsageTerms", false)) != null) {
                i(z5mVarE);
            }
        }
    }

    public static void k(Iterator it, z5m z5mVar, z5m z5mVar2) throws XMPException {
        if (z5mVar2.I().j()) {
            if (z5mVar.I().h()) {
                throw new XMPException("Alias to x-default already has a language qualifier", 203);
            }
            z5mVar.e(new z5m("xml:lang", "x-default", null));
        }
        it.remove();
        z5mVar.h0("[]");
        z5mVar2.d(z5mVar);
    }

    public static void l(z5m z5mVar) throws XMPException {
        if (z5mVar.H() == null || z5mVar.H().length() < 36) {
            return;
        }
        String lowerCase = z5mVar.H().toLowerCase();
        if (lowerCase.startsWith("uuid:")) {
            lowerCase = lowerCase.substring(5);
        }
        if (srk.a(lowerCase)) {
            z5m z5mVarG = a6m.g(z5mVar, e6m.a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
            if (z5mVarG == null) {
                throw new XMPException("Failure creating xmpMM:InstanceID", 9);
            }
            z5mVarG.i0(null);
            z5mVarG.k0("uuid:" + lowerCase);
            z5mVarG.Z();
            z5mVarG.b0();
            z5mVar.h0(null);
        }
    }
}
