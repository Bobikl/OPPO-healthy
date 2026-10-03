package com.oplus.aiunit.vision;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class ksk implements a2f {
    @Override // com.oplus.aiunit.vision.a2f
    public boolean a(fxb fxbVar) {
        if (c(fxbVar)) {
            return false;
        }
        Iterator<ea7> it = fxbVar.d().iterator();
        while (it.hasNext()) {
            if ((it.next().b() & 31) > 13) {
                return false;
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.a2f
    public boolean b(bxb bxbVar) {
        if (c(new fxb(bxbVar))) {
            return false;
        }
        Iterator<w97> it = bxbVar.p().iterator();
        while (it.hasNext()) {
            if ((it.next().C() & 31) > 13) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(fxb fxbVar) {
        return fxbVar.f11557e.size() > 0;
    }
}
