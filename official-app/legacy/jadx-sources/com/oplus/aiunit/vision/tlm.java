package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.oms.split.full.splitdownload.IProvider;

/* JADX INFO: loaded from: classes8.dex */
public class tlm extends eym {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f17055l = "CustomProcessSplitInfo";

    public tlm(Context context) {
        d(context);
    }

    @Override // com.oplus.aiunit.vision.eym
    public v5n c(v5n v5nVar) {
        if (v5nVar == null) {
            w7i.c(f17055l, "pre SplitVersionInfo is null", new Object[0]);
            return null;
        }
        if (this.a == null) {
            w7i.i(f17055l, "context is null", new Object[0]);
            return f(v5nVar);
        }
        IProvider iProviderA = z6i.b().a();
        if (iProviderA == null) {
            w7i.c(f17055l, "custom is null", new Object[0]);
            return f(v5nVar);
        }
        String strQ = v5nVar.j().q();
        int iR = v5nVar.j().r();
        int splitVersionCode = iProviderA.getSplitVersionCode(this.a, strQ);
        if (e(iR, splitVersionCode) && v5nVar.g() < splitVersionCode) {
            return f(b(4, splitVersionCode, iProviderA.getSplitVersionName(this.a, strQ), v5nVar));
        }
        return f(v5nVar);
    }
}
