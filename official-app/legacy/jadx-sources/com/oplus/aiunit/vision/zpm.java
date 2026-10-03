package com.oplus.aiunit.vision;

import com.heytap.store.base.core.util.DeviceInfoUtil;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zpm {
    public final AtomicBoolean a;
    public final ExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19507c;
    public final com.xingin.xhssharesdk.b.r d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b7n f19508e;
    public l7n f;

    public zpm() {
        final com.xingin.xhssharesdk.b.r rVar = com.xingin.xhssharesdk.b.r.BIZ;
        this.a = new AtomicBoolean(false);
        this.f19507c = new ArrayList();
        this.d = rVar;
        this.b = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.nom
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zpm.b(rVar, runnable);
            }
        });
    }

    public static Thread b(com.xingin.xhssharesdk.b.r rVar, Runnable runnable) {
        return new Thread(runnable, "TrackerEncoder-" + rVar.a);
    }

    public final void c() {
        v6n.a("%s ,handleCache() cache size=%s", this.d, Integer.valueOf(this.f19507c.size()));
        synchronized (this.f19507c) {
            Iterator it = this.f19507c.iterator();
            while (it.hasNext()) {
                e((qzm) it.next());
            }
        }
    }

    public final synchronized void d(qzm.a aVar) {
        aVar.a = 1;
        qzm qzmVar = new qzm();
        qzmVar.f16003c = aVar.a;
        qzmVar.f16004e = aVar.b;
        qzmVar.f = aVar.f16005c;
        qzmVar.g = aVar.d;
        e(qzmVar);
    }

    public final void e(final qzm qzmVar) {
        if (this.a.get()) {
            final o3n o3nVarA = o3n.a();
            this.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.oom
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(qzmVar, o3nVarA);
                }
            });
        } else {
            v6n.a("%s ,addToCache() TrackerEventDetail=%s", this.d, qzmVar);
            synchronized (this.f19507c) {
                this.f19507c.add(qzmVar);
            }
        }
    }

    public final void f(qzm qzmVar, o3n o3nVar) {
        lmm lmmVar;
        xxm xxmVar = new xxm(qzmVar, o3nVar);
        v6n.a("%s ,track() TrackerEvent=%s", this.d, xxmVar);
        wym wymVar = xxmVar.b;
        ajm.a aVarD = ajm.C.d();
        int i = xxmVar.b.f18447j;
        aVarD.f();
        ((ajm) aVarD.f20427j).f9410l = i;
        String str = xxmVar.b.k;
        aVarD.f();
        ajm ajmVar = (ajm) aVarD.f20427j;
        ajmVar.getClass();
        if (str == null) {
            str = "";
        }
        ajmVar.m = str;
        String strValueOf = String.valueOf(xxmVar.b.f18448l);
        aVarD.f();
        ajm ajmVar2 = (ajm) aVarD.f20427j;
        ajmVar2.getClass();
        if (strValueOf == null) {
            strValueOf = "";
        }
        ajmVar2.f9411n = strValueOf;
        xxmVar.b.getClass();
        aVarD.f();
        ajm ajmVar3 = (ajm) aVarD.f20427j;
        ajmVar3.getClass();
        ajmVar3.q = "";
        xxmVar.b.getClass();
        aVarD.f();
        ajm ajmVar4 = (ajm) aVarD.f20427j;
        ajmVar4.getClass();
        ajmVar4.r = "";
        String strA = g1n.a(xxmVar.f.f16003c);
        aVarD.f();
        ajm ajmVar5 = (ajm) aVarD.f20427j;
        ajmVar5.getClass();
        ajmVar5.u = strA;
        String str2 = xxmVar.a.i;
        aVarD.f();
        ajm ajmVar6 = (ajm) aVarD.f20427j;
        ajmVar6.getClass();
        if (str2 == null) {
            str2 = "";
        }
        ajmVar6.v = str2;
        xxmVar.a.getClass();
        aVarD.f();
        ajm ajmVar7 = (ajm) aVarD.f20427j;
        ajmVar7.getClass();
        ajmVar7.w = DeviceInfoUtil.SYSTEM_NAME;
        String str3 = xxmVar.a.f14320j;
        aVarD.f();
        ajm ajmVar8 = (ajm) aVarD.f20427j;
        ajmVar8.getClass();
        if (str3 == null) {
            str3 = "";
        }
        ajmVar8.x = str3;
        String strValueOf2 = String.valueOf(xxmVar.a.k);
        aVarD.f();
        ajm ajmVar9 = (ajm) aVarD.f20427j;
        ajmVar9.getClass();
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        ajmVar9.y = strValueOf2;
        xxmVar.a.getClass();
        aVarD.f();
        ajm ajmVar10 = (ajm) aVarD.f20427j;
        ajmVar10.getClass();
        ajmVar10.z = "";
        xxmVar.a.getClass();
        aVarD.f();
        ((ajm) aVarD.f20427j).A = 0;
        String str4 = xxmVar.a.f14321l;
        aVarD.f();
        ajm ajmVar11 = (ajm) aVarD.f20427j;
        ajmVar11.getClass();
        if (str4 == null) {
            str4 = "";
        }
        ajmVar11.B = str4;
        String str5 = xxmVar.a.m;
        aVarD.f();
        ajm ajmVar12 = (ajm) aVarD.f20427j;
        ajmVar12.getClass();
        if (str5 == null) {
            str5 = "";
        }
        ajmVar12.E = str5;
        xxmVar.a.getClass();
        aVarD.f();
        ((ajm) aVarD.f20427j).A = 0;
        String str6 = xxmVar.f18795c.i;
        aVarD.f();
        ajm ajmVar13 = (ajm) aVarD.f20427j;
        ajmVar13.getClass();
        if (str6 == null) {
            str6 = "";
        }
        ajmVar13.G = str6;
        String str7 = xxmVar.f18795c.f18884j;
        aVarD.f();
        ajm ajmVar14 = (ajm) aVarD.f20427j;
        ajmVar14.getClass();
        if (str7 == null) {
            str7 = "";
        }
        ajmVar14.H = str7;
        String str8 = xxmVar.f18796e.i;
        aVarD.f();
        ajm ajmVar15 = (ajm) aVarD.f20427j;
        ajmVar15.getClass();
        if (str8 == null) {
            str8 = "";
        }
        ajmVar15.I = str8;
        String str9 = xxmVar.f18796e.f16472j;
        aVarD.f();
        ajm ajmVar16 = (ajm) aVarD.f20427j;
        ajmVar16.getClass();
        if (str9 == null) {
            str9 = "";
        }
        ajmVar16.J = str9;
        String str10 = xxmVar.b.i;
        aVarD.f();
        ajm ajmVar17 = (ajm) aVarD.f20427j;
        ajmVar17.getClass();
        if (str10 == null) {
            str10 = "";
        }
        ajmVar17.K = str10;
        String str11 = xxmVar.d.i;
        aVarD.f();
        ajm ajmVar18 = (ajm) aVarD.f20427j;
        ajmVar18.getClass();
        if (str11 == null) {
            str11 = "";
        }
        ajmVar18.L = str11;
        String str12 = xxmVar.d.f14761j;
        aVarD.f();
        ajm ajmVar19 = (ajm) aVarD.f20427j;
        ajmVar19.getClass();
        if (str12 == null) {
            str12 = "";
        }
        ajmVar19.M = str12;
        int iA = oim.a(xxmVar.d.k);
        aVarD.f();
        ((ajm) aVarD.f20427j).N = iA;
        ajm ajmVarE = aVarD.e();
        eqm.b bVarD = eqm.o.d();
        int i2 = xxmVar.f.f16004e;
        bVarD.f();
        ((eqm) bVarD.f20427j).f11031l = i2;
        xxmVar.f.getClass();
        xxmVar.f.getClass();
        xxmVar.f.getClass();
        int i3 = xxmVar.f.f;
        if (i3 != 0) {
            bVarD.f();
            eqm eqmVar = (eqm) bVarD.f20427j;
            eqmVar.getClass();
            eqmVar.r = jdm.a(i3);
        }
        String str13 = xxmVar.f.a;
        bVarD.f();
        eqm eqmVar2 = (eqm) bVarD.f20427j;
        eqmVar2.getClass();
        eqmVar2.s = str13 != null ? str13 : "";
        int i4 = xxmVar.f.d;
        bVarD.f();
        ((eqm) bVarD.f20427j).t = i4;
        long j2 = xxmVar.f.b;
        bVarD.f();
        ((eqm) bVarD.f20427j).u = j2;
        HashMap map = xxmVar.f.g;
        bVarD.f();
        eqm eqmVar3 = (eqm) bVarD.f20427j;
        com.xingin.xhssharesdk.a.q<String, String> qVar = eqmVar3.x;
        if (!qVar.a) {
            eqmVar3.x = qVar.isEmpty() ? new com.xingin.xhssharesdk.a.q<>() : new com.xingin.xhssharesdk.a.q<>(qVar);
        }
        eqmVar3.x.putAll(map);
        eqm eqmVarE = bVarD.e();
        tmm.a aVarD2 = tmm.f.d();
        aVarD2.f();
        tmm tmmVar = (tmm) aVarD2.f20427j;
        tmmVar.getClass();
        tmmVar.m = eqmVarE;
        aVarD2.f();
        tmm tmmVar2 = (tmm) aVarD2.f20427j;
        tmmVar2.getClass();
        tmmVar2.f17067l = ajmVarE;
        tmm tmmVarE = aVarD2.e();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Logger logger = com.xingin.xhssharesdk.a.g.a;
            lmmVar = new lmm(new com.xingin.xhssharesdk.a.g.d(byteArrayOutputStream));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            lmmVar = null;
        }
        if (lmmVar != null) {
            try {
                lmmVar.a(tmmVarE);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (wymVar == null || qzmVar == null) {
            return;
        }
        String str14 = qzmVar.a;
        g1n.a(qzmVar.f16003c);
        if (g(str14, byteArray)) {
            this.f.i();
            return;
        }
        String str15 = qzmVar.a;
        kmm.a(qzmVar.f16003c);
        this.f.g(new yum(-1L, str15, byteArray, null));
    }

    public final boolean g(String str, byte[] bArr) {
        b7n b7nVar = this.f19508e;
        long jB = b7nVar.a.b(new yum(-1L, str, bArr, null));
        Object[] objArr = {b7nVar.b, str};
        if (jB >= 0) {
            v6n.a("%s, store() success eventId=%s", objArr);
        } else {
            v6n.a("%s, store() fail eventId=%s", objArr);
        }
        return jB >= 0;
    }
}
