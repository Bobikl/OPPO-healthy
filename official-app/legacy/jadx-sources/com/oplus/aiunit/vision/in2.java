package com.oplus.aiunit.vision;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class in2 implements ComponentCallbacks {
    public SparseArray<List<nxe>> i = new SparseArray<>();

    public void c(List<nxe> list) {
        if (list == null) {
            return;
        }
        d((nxe[]) list.toArray(new nxe[0]));
    }

    public void d(nxe... nxeVarArr) {
        if (nxeVarArr == null) {
            return;
        }
        for (nxe nxeVar : nxeVarArr) {
            if (this.i.get(nxeVar.a()) == null) {
                this.i.put(nxeVar.a(), new LinkedList());
            }
            this.i.get(nxeVar.a()).add(nxeVar);
        }
    }

    public View e() {
        throw null;
    }

    public void f(int i) {
        List<nxe> list = this.i.get(i);
        if (list == null) {
            return;
        }
        for (nxe nxeVar : list) {
            if (nxeVar.b()) {
                nxeVar.d();
            } else {
                nxeVar.e(e());
            }
        }
    }

    public void g() {
        for (int i = 0; i < this.i.size(); i++) {
            for (nxe nxeVar : this.i.valueAt(i)) {
                if (nxeVar != null) {
                    nxeVar.f();
                }
            }
        }
        this.i.clear();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        for (int i = 0; i < this.i.size(); i++) {
            for (nxe nxeVar : this.i.valueAt(i)) {
                if (nxeVar != null) {
                    nxeVar.onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
