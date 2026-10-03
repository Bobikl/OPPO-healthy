package com.oplus.oms.split.full.splitinstall.b;

import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.d1n;
import com.oplus.aiunit.vision.e8i;
import com.oplus.aiunit.vision.f8i;
import com.oplus.aiunit.vision.k3n;
import com.oplus.aiunit.vision.v5n;
import com.oplus.aiunit.vision.vzm;
import com.oplus.aiunit.vision.w6b;
import com.oplus.aiunit.vision.w7i;
import com.oplus.oms.split.full.splitdownload.DownloadCallback;
import com.oplus.oms.split.full.splitinstall.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements DownloadCallback {
    public final vzm a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1n f20028c;
    public final k3n d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<v5n> f20029e;

    public o(k3n k3nVar, int i, d1n d1nVar, List<v5n> list) {
        this.b = i;
        this.f20028c = d1nVar;
        this.d = k3nVar;
        this.f20029e = list;
        this.a = d1nVar.b(i);
    }

    public static int b(int i) {
        if (i != 1) {
            return i != 2 ? -100 : -10;
        }
        return -6;
    }

    public final void a(int i) {
        List<v5n> list = this.f20029e;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (v5n v5nVar : this.f20029e) {
            if (v5nVar.e() == 2) {
                f8i f8iVar = new f8i();
                f8iVar.h("1");
                f8iVar.d(v5nVar.j().q());
                f8iVar.i(v5nVar.h());
                f8iVar.f(i);
                arrayList.add(f8iVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        e8i.b(a8i.DOWNLOAD, arrayList);
    }

    public final void c() {
        this.d.b(this.b, this.f20029e);
    }

    @Override // com.oplus.oms.split.full.splitdownload.DownloadCallback
    public void onCanceled() {
        this.f20028c.a(this.b, 7);
        this.f20028c.b(this.a);
        a(-34);
    }

    @Override // com.oplus.oms.split.full.splitdownload.DownloadCallback
    public void onCanceling() {
        this.f20028c.a(this.b, 9);
        this.f20028c.b(this.a);
    }

    @Override // com.oplus.oms.split.full.splitdownload.DownloadCallback
    public void onCompleted() {
        this.f20028c.a(this.b, 3);
        this.f20028c.b(this.a);
        a(1);
        this.d.b(this.b, this.f20029e);
    }

    @Override // com.oplus.oms.split.full.splitdownload.DownloadCallback
    public void onError(int i) {
        w7i.i(c.a, "download onError session: %d, errorCode: %d", Integer.valueOf(this.b), Integer.valueOf(i));
        if (b()) {
            w7i.i(c.a, "download onError: downgrade session:%d", Integer.valueOf(this.b));
            onCompleted();
            return;
        }
        int iB = b(i);
        this.a.g = iB;
        this.f20028c.a(this.b, 6);
        this.f20028c.b(this.a);
        a(iB);
    }

    @Override // com.oplus.oms.split.full.splitdownload.DownloadCallback
    public void onProgress(long j2) {
        this.a.b(j2);
        this.f20028c.a(this.b, 2);
        this.f20028c.b(this.a);
    }

    @Override // com.oplus.oms.split.full.splitdownload.DownloadCallback
    public void onStart() {
        this.f20028c.a(this.b, 2);
        this.f20028c.b(this.a);
    }

    public final boolean b() {
        List<v5n> list = this.f20029e;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f20029e.size());
            Iterator<v5n> it = this.f20029e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                v5n next = it.next();
                if (next.e() == 2) {
                    v5n v5nVarB = next.b();
                    if (v5nVarB == null || v5nVarB.e() == -1) {
                        w7i.e(c.a, "split download error and no default splitInfo", new Object[0]);
                        break;
                    }
                    arrayList.add(v5nVarB);
                } else {
                    arrayList.add(next);
                }
            }
            w7i.e(c.a, "canDowngrade session: %d, is downgrade: %b, origin: %s, downgrade: %s", Integer.valueOf(this.b), Boolean.valueOf(z), w6b.b(this.f20029e), w6b.b(arrayList));
            if (z) {
                this.f20029e = arrayList;
            }
        }
        return z;
    }

    public final void a() {
        this.f20028c.b(this.a);
    }
}
