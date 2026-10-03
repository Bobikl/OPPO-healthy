package com.omron;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cp implements bu {
    private final List<bu> a = new ArrayList();

    public cp(bu... buVarArr) {
        for (bu buVar : buVarArr) {
            this.a.add(buVar);
        }
    }

    @Override // com.omron.bu
    public bs a(int i, int i2, byte[] bArr, int i3) {
        Iterator<bu> it = this.a.iterator();
        while (it.hasNext()) {
            bs bsVarA = it.next().a(i, i2, bArr, i3);
            if (bsVarA != null) {
                return bsVarA;
            }
        }
        return null;
    }
}
