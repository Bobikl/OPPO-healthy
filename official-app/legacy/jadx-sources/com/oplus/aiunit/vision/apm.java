package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public class apm implements po9 {
    @Override // com.oplus.aiunit.vision.po9
    public boolean a(int i, Bundle bundle, bm9 bm9Var) {
        if (bundle != null && bm9Var != null) {
            if (i == 5) {
                d1h d1hVar = new d1h(bundle);
                if (!d1hVar.checkArgs()) {
                    return false;
                }
                bm9Var.b(d1hVar);
                return true;
            }
            if (i == 6) {
                e1h e1hVar = new e1h(bundle);
                if (e1hVar.checkArgs()) {
                    bm9Var.c(e1hVar);
                    return true;
                }
            }
        }
        return false;
    }
}
