package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class j82 implements rhf {
    public i82 a = new i82();
    public ArrayList<k82> b = new ArrayList<>();

    @Override // com.oplus.aiunit.vision.rhf
    public void a(qhf qhfVar) {
        this.a.w(qhfVar);
        Iterator<k82> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(this.a);
        }
    }
}
