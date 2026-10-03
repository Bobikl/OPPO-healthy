package com.oplus.aiunit.vision;

import android.os.Parcelable;
import android.util.SparseArray;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class s63 extends w92 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<r63> f16482e = new SparseArray<>();
    public SparseArray<ia2> f = new SparseArray<>();
    public w7e g;

    @Override // com.oplus.aiunit.vision.w92
    public z92 d(int i) {
        z92 z92Var = new z92();
        if (i > 0 && k(i)) {
            try {
                z92Var.b = o(z92Var, i);
            } catch (Exception e2) {
                t6b.d("CfgSegmentAssemble", "buildContent, exception: " + e2.getMessage());
            }
        }
        return z92Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // com.oplus.aiunit.vision.w92
    public ha2 h(TaskResult taskResult, int i) {
        Object objB;
        int iA;
        if (i <= 0) {
            return new ha2(3);
        }
        try {
            ha2 ha2Var = new ha2();
            if (taskResult != null) {
                Content content = taskResult.getContent();
                if (9000 == taskResult.getResultCode()) {
                    if (content instanceof z92) {
                        z92 z92Var = (z92) content;
                        ia2 ia2VarM = m(i);
                        if (ia2VarM != null) {
                            objB = ia2VarM.b(z92Var);
                            iA = ia2VarM.a();
                        } else {
                            objB = null;
                            iA = -1;
                        }
                    } else {
                        objB = null;
                        iA = -1;
                    }
                    if (objB == null) {
                        ha2Var.a = 4;
                    } else if (iA == 0) {
                        ha2Var.j(i, String.valueOf(objB));
                    } else if (1 == iA) {
                        ha2Var.g(i, ((Integer) objB).intValue());
                    } else if (2 == iA) {
                        ha2Var.h(i, (Parcelable) objB);
                    } else if (3 == iA) {
                        ha2Var.i(i, (ArrayList) objB);
                    }
                }
            } else {
                ha2Var.a = 1;
            }
            return ha2Var;
        } catch (Exception e2) {
            t6b.d("CfgSegmentAssemble", "buildContent, parseResult: " + e2.getMessage());
            return new ha2(2);
        }
    }

    @Override // com.oplus.aiunit.vision.w92
    public boolean k(int i) {
        return l(i);
    }

    public boolean l(int i) {
        return this.f16482e.indexOfKey(i) >= 0;
    }

    public ia2 m(int i) {
        return this.f.get(i);
    }

    public r63 n(int i) {
        return this.f16482e.get(i);
    }

    public boolean o(z92 z92Var, int i) {
        r63 r63VarN = n(i);
        if (r63VarN == null || r63VarN.f() <= 0) {
            return false;
        }
        if (!r63VarN.g()) {
            z92Var.c(1100, w92.e(g()), ".*(9000)$");
        }
        int iF = r63VarN.f();
        for (int i2 = 0; i2 < iF; i2++) {
            v92 v92VarA = v92.a(r63VarN.e(i2));
            if (v92VarA != null) {
                z92Var.putCommand(v92VarA);
            }
        }
        return true;
    }

    public void p(w7e w7eVar) {
        this.g = w7eVar;
    }

    public void q(int i, ia2 ia2Var) {
        if (ia2Var == null) {
            this.f.remove(i);
        } else {
            this.f.put(i, ia2Var);
        }
    }

    public void r(int i, r63 r63Var) {
        if (r63Var == null) {
            this.f16482e.remove(i);
        } else {
            this.f16482e.put(i, r63Var);
        }
    }
}
