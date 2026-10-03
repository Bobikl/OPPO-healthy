package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class tmm extends com.xingin.xhssharesdk.a.k<tmm, a> implements k7n {
    public static final tmm f;
    public static volatile com.xingin.xhssharesdk.a.k.b g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ajm f17067l;
    public eqm m;

    public static final class a extends com.xingin.xhssharesdk.a.k.a<tmm, a> implements k7n {
        public a() {
            super(tmm.f);
        }
    }

    static {
        tmm tmmVar = new tmm();
        f = tmmVar;
        tmmVar.g();
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final void a(com.xingin.xhssharesdk.a.g gVar) {
        ajm ajmVar = this.f17067l;
        if (ajmVar != null) {
            gVar.k(1, ajmVar);
        }
        eqm eqmVar = this.m;
        if (eqmVar != null) {
            gVar.k(2, eqmVar);
        }
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final int b() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        ajm ajmVar = this.f17067l;
        int iV = 0;
        if (ajmVar != null) {
            int iN = com.xingin.xhssharesdk.a.g.n(1);
            int iB = ajmVar.b();
            iV = 0 + com.xingin.xhssharesdk.a.g.v(iB) + iB + iN;
        }
        eqm eqmVar = this.m;
        if (eqmVar != null) {
            int iN2 = com.xingin.xhssharesdk.a.g.n(2);
            int iB2 = eqmVar.b();
            iV += com.xingin.xhssharesdk.a.g.v(iB2) + iB2 + iN2;
        }
        this.k = iV;
        return iV;
    }

    @Override // com.xingin.xhssharesdk.a.k
    public final Object c(com.xingin.xhssharesdk.a.k.h hVar, Object obj, Object obj2) {
        switch (hVar) {
            case a:
                return f;
            case b:
                com.xingin.xhssharesdk.a.k.i iVar = (com.xingin.xhssharesdk.a.k.i) obj;
                tmm tmmVar = (tmm) obj2;
                this.f17067l = (ajm) iVar.b(this.f17067l, tmmVar.f17067l);
                this.m = (eqm) iVar.b(this.m, tmmVar.m);
                return this;
            case f20429c:
                com.xingin.xhssharesdk.a.c cVar = (com.xingin.xhssharesdk.a.c) obj;
                pzm pzmVar = (pzm) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int iK = cVar.k();
                        if (iK != 0) {
                            if (iK == 10) {
                                ajm ajmVar = this.f17067l;
                                ajm.a aVarD = ajmVar != null ? ajmVar.d() : null;
                                v8n v8nVar = (v8n) ajm.C.b(com.xingin.xhssharesdk.a.k.h.h);
                                int iE = cVar.e();
                                if (cVar.h >= 100) {
                                    throw com.xingin.xhssharesdk.a.m.a();
                                }
                                int iC = cVar.c(iE);
                                cVar.h++;
                                com.xingin.xhssharesdk.a.k kVarA = v8nVar.a(cVar, pzmVar);
                                cVar.b(0);
                                cVar.h--;
                                cVar.g = iC;
                                cVar.m();
                                ajm ajmVar2 = (ajm) kVarA;
                                this.f17067l = ajmVar2;
                                if (aVarD != null) {
                                    aVarD.b(ajmVar2);
                                    if (!aVarD.k) {
                                        aVarD.f20427j.g();
                                        aVarD.k = true;
                                    }
                                    this.f17067l = (ajm) aVarD.f20427j;
                                }
                            } else if (iK == 18) {
                                eqm eqmVar = this.m;
                                eqm.b bVarD = eqmVar != null ? eqmVar.d() : null;
                                v8n v8nVar2 = (v8n) eqm.o.b(com.xingin.xhssharesdk.a.k.h.h);
                                int iE2 = cVar.e();
                                if (cVar.h >= 100) {
                                    throw com.xingin.xhssharesdk.a.m.a();
                                }
                                int iC2 = cVar.c(iE2);
                                cVar.h++;
                                com.xingin.xhssharesdk.a.k kVarA2 = v8nVar2.a(cVar, pzmVar);
                                cVar.b(0);
                                cVar.h--;
                                cVar.g = iC2;
                                cVar.m();
                                eqm eqmVar2 = (eqm) kVarA2;
                                this.m = eqmVar2;
                                if (bVarD != null) {
                                    bVarD.b(eqmVar2);
                                    if (!bVarD.k) {
                                        bVarD.f20427j.g();
                                        bVarD.k = true;
                                    }
                                    this.m = (eqm) bVarD.f20427j;
                                }
                            } else if (!cVar.h(iK)) {
                            }
                        }
                        z = true;
                    } catch (com.xingin.xhssharesdk.a.m e2) {
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        throw new RuntimeException(new com.xingin.xhssharesdk.a.m(e3.getMessage()));
                    }
                }
                break;
            case d:
                return null;
            case f20430e:
                return new tmm();
            case f:
                return new a();
            case g:
                break;
            case h:
                if (g == null) {
                    synchronized (tmm.class) {
                        if (g == null) {
                            g = new com.xingin.xhssharesdk.a.k.b(f);
                        }
                        break;
                    }
                }
                return g;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }
}
