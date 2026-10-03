package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.oplus.oms.split.full.splitinstall.InstallException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class aim implements k3n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9385c = "SplitInstallerImpl";
    public final Context a;
    public final d1n b;

    public aim(Context context, d1n d1nVar) {
        this.a = context;
        this.b = d1nVar;
    }

    @Override // com.oplus.aiunit.vision.k3n
    public void a(int i, vzm vzmVar) {
        e(i, vzmVar);
    }

    @Override // com.oplus.aiunit.vision.k3n
    public void b(int i, List<v5n> list) throws Throwable {
        f(i, list);
    }

    public final int c(com.oplus.oms.split.full.splitinstall.a aVar, v5n v5nVar) {
        try {
            return aVar.s(this.a, v5nVar);
        } catch (InstallException e2) {
            if (e2.a() == -100 || v5nVar.b() == null) {
                return 6;
            }
            d(v5nVar);
            return c(aVar, v5nVar.b());
        }
    }

    public void d(v5n v5nVar) {
        File fileC = a8i.o().c(v5nVar.j().q(), v5nVar.g(), false);
        if (fileC.exists()) {
            pd7.c(fileC);
        }
    }

    public final void e(int i, vzm vzmVar) {
        if (vzmVar == null) {
            vzmVar = this.b.b(i);
        }
        List<h7i> list = vzmVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (h7i h7iVar : list) {
            Intent intent = new Intent();
            intent.putExtra("split_name", h7iVar.q());
            arrayList.add(intent);
        }
        vzmVar.k = arrayList;
        vzmVar.c(10);
        this.b.a(i, 10);
        this.b.b(vzmVar);
    }

    public final void f(int i, List<v5n> list) throws Throwable {
        boolean z;
        int iC;
        w7i.e(f9385c, "startCopyAndExtractLib sessionId: %d", Integer.valueOf(i));
        vzm vzmVarB = this.b.b(i);
        this.b.a(i, 4);
        this.b.b(vzmVarB);
        ArrayList arrayList = new ArrayList();
        Iterator<v5n> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            v5n next = it.next();
            f8i f8iVar = new f8i(next.j().q(), String.valueOf(next.g()));
            f8iVar.b("pInstall");
            arrayList.add(f8iVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.oplus.oms.split.full.splitinstall.a aVar = null;
            try {
                try {
                    com.oplus.oms.split.full.splitinstall.a aVar2 = new com.oplus.oms.split.full.splitinstall.a(a8i.o().g(next.j().q(), true));
                    try {
                        f8iVar.h(String.valueOf(next.e()));
                        f8iVar.g(System.currentTimeMillis() - jCurrentTimeMillis);
                        iC = c(aVar2, next);
                        pd7.a(aVar2);
                    } catch (InstallException unused) {
                        aVar = aVar2;
                        pd7.a(aVar);
                        iC = 6;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        pd7.a(aVar);
                        throw th;
                    }
                } catch (IOException | IllegalStateException e2) {
                    w7i.c(f9385c, "SplitDownloadPreprocessor sessionId: %d, error: %s", Integer.valueOf(i), e2.getMessage());
                    throw new InstallException(-100, e2);
                }
            } catch (InstallException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            f8iVar.g(System.currentTimeMillis() - jCurrentTimeMillis);
            f8iVar.f(iC);
            if (iC == 6) {
                vzmVarB = this.b.b(i);
                vzmVarB.g = -100;
                this.b.a(i, 6);
                this.b.b(vzmVarB);
                z = false;
                break;
            }
        }
        if (z) {
            e(i, vzmVarB);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        e8i.b("install", arrayList);
    }
}
