package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.kca;
import com.oplus.aiunit.vision.o6m;
import com.oplus.aiunit.vision.t6m;
import com.oplus.aiunit.vision.x6m;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public class BDSStateMap implements Serializable {
    private final Map<Integer, BDS> bdsState = new TreeMap();

    public BDSStateMap() {
    }

    private void updateState(o6m o6mVar, long j2, byte[] bArr, byte[] bArr2) {
        t6m t6mVarG = o6mVar.g();
        int iD = t6mVarG.d();
        long j3 = x6m.j(j2, iD);
        int i = x6m.i(j2, iD);
        c cVar = (c) new c.b().h(j3).p(i).l();
        int i2 = (1 << iD) - 1;
        if (i < i2) {
            if (get(0) == null || i == 0) {
                put(0, new BDS(t6mVarG, bArr, bArr2, cVar));
            }
            update(0, bArr, bArr2, cVar);
        }
        for (int i3 = 1; i3 < o6mVar.d(); i3++) {
            int i4 = x6m.i(j3, iD);
            j3 = x6m.j(j3, iD);
            c cVar2 = (c) new c.b().g(i3).h(j3).p(i4).l();
            if (i4 < i2 && x6m.m(j2, iD, i3)) {
                if (get(i3) == null) {
                    put(i3, new BDS(o6mVar.g(), bArr, bArr2, cVar2));
                }
                update(i3, bArr, bArr2, cVar2);
            }
        }
    }

    public BDS get(int i) {
        return this.bdsState.get(kca.b(i));
    }

    public boolean isEmpty() {
        return this.bdsState.isEmpty();
    }

    public void put(int i, BDS bds) {
        this.bdsState.put(kca.b(i), bds);
    }

    public void setXMSS(t6m t6mVar) {
        Iterator<Integer> it = this.bdsState.keySet().iterator();
        while (it.hasNext()) {
            BDS bds = this.bdsState.get(it.next());
            bds.setXMSS(t6mVar);
            bds.validate();
        }
    }

    public BDS update(int i, byte[] bArr, byte[] bArr2, c cVar) {
        return this.bdsState.put(kca.b(i), this.bdsState.get(kca.b(i)).getNextState(bArr, bArr2, cVar));
    }

    public BDSStateMap(o6m o6mVar, long j2, byte[] bArr, byte[] bArr2) {
        for (long j3 = 0; j3 < j2; j3++) {
            updateState(o6mVar, j3, bArr, bArr2);
        }
    }

    public BDSStateMap(BDSStateMap bDSStateMap, o6m o6mVar, long j2, byte[] bArr, byte[] bArr2) {
        for (Integer num : bDSStateMap.bdsState.keySet()) {
            this.bdsState.put(num, bDSStateMap.bdsState.get(num));
        }
        updateState(o6mVar, j2, bArr, bArr2);
    }
}
