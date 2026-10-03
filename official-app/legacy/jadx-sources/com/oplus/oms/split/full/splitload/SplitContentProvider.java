package com.oplus.oms.split.full.splitload;

import com.oplus.aiunit.vision.r7i;
import com.oplus.aiunit.vision.t7i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class SplitContentProvider extends com.oplus.oms.split.full.splitload.c.f {
    @Override // com.oplus.oms.split.full.splitload.c.f
    public boolean a(String str) {
        if (a() != null) {
            return true;
        }
        if (!t7i.F()) {
            return false;
        }
        r7i r7iVarE = t7i.E();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        r7iVarE.m(arrayList);
        return a() != null;
    }
}
