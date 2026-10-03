package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public class rzg implements po9 {
    @Override // com.oplus.aiunit.vision.po9
    public boolean a(int i, Bundle bundle, bm9 bm9Var) {
        if (bundle != null && bm9Var != null) {
            if (i == 3) {
                izg izgVar = new izg(bundle);
                if (!izgVar.checkArgs()) {
                    return false;
                }
                bm9Var.b(izgVar);
                return true;
            }
            if (i == 4) {
                jzg jzgVar = new jzg(bundle);
                if (jzgVar.checkArgs()) {
                    bm9Var.c(jzgVar);
                    return true;
                }
            }
        }
        return false;
    }
}
