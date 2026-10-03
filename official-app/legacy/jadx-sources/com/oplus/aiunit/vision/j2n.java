package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class j2n implements d1n {
    public static final String f = "SplitInstallSessionManagerImpl";
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12739c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.oplus.oms.split.full.core.splitinstall.a f12740e;
    public final SparseArray<vzm> a = new SparseArray<>();
    public final Object d = new Object();

    public j2n(Context context) {
        this.b = context;
        this.f12739c = context.getPackageName();
    }

    public static <C> List<C> d(SparseArray<C> sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.d1n
    public void a(int i, vzm vzmVar) {
        synchronized (this.d) {
            if (i != 0) {
                if (this.a.get(i) == null) {
                    this.a.put(i, vzmVar);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.d1n
    public boolean b() {
        synchronized (this.d) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.valueAt(i).h == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.d1n
    public void c(com.oplus.oms.split.full.core.splitinstall.a aVar) {
        this.f12740e = aVar;
    }

    public void e(int i) {
        synchronized (this.d) {
            if (i != 0) {
                this.a.remove(i);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.d1n
    public void a(int i, int i2) {
        synchronized (this.d) {
            vzm vzmVar = this.a.get(i);
            if (vzmVar != null) {
                vzmVar.c(i2);
                if (i2 == 7 || i2 == 6 || i2 == 10) {
                    e(i);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.d1n
    public vzm b(int i) {
        vzm vzmVar;
        synchronized (this.d) {
            vzmVar = this.a.get(i);
        }
        return vzmVar;
    }

    @Override // com.oplus.aiunit.vision.d1n
    public List<vzm> a() {
        List<vzm> listD;
        synchronized (this.d) {
            listD = d(this.a);
        }
        return listD;
    }

    @Override // com.oplus.aiunit.vision.d1n
    public void b(vzm vzmVar) {
        Bundle bundleA = vzm.a(vzmVar);
        Intent intent = new Intent();
        intent.putExtra("session_state", bundleA);
        com.oplus.oms.split.full.core.splitinstall.a aVar = this.f12740e;
        if (aVar != null) {
            aVar.f(intent);
            w7i.e(f, "sendEmitSessionState1: sessionId: %d, status: %d", Integer.valueOf(vzmVar.i), Integer.valueOf(vzmVar.h));
        } else {
            w7i.e(f, "sendEmitSessionState2: mSplitInstallListenerRegistry = null", new Object[0]);
        }
    }

    @Override // com.oplus.aiunit.vision.d1n
    public boolean a(List<String> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            return false;
        }
        synchronized (this.d) {
            List<vzm> listA = a();
            z = false;
            for (int i = 0; i < listA.size(); i++) {
                vzm vzmVar = listA.get(i);
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (vzmVar.a.contains(it.next())) {
                        z = true;
                        break;
                    }
                    if (z) {
                        break;
                    }
                }
            }
        }
        return z;
    }
}
