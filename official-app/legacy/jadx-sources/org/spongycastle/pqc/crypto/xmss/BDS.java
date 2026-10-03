package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.h5l;
import com.oplus.aiunit.vision.t6m;
import com.oplus.aiunit.vision.x6m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public final class BDS implements Serializable {
    private static final long serialVersionUID = 1;
    private List<XMSSNode> authenticationPath;
    private int index;
    private int k;
    private Map<Integer, XMSSNode> keep;
    private Map<Integer, LinkedList<XMSSNode>> retain;
    private XMSSNode root;
    private Stack<XMSSNode> stack;
    private final List<BDSTreeHash> treeHashInstances;
    private final int treeHeight;
    private boolean used;
    private transient d wotsPlus;

    public BDS(t6m t6mVar, int i) {
        this(t6mVar.f(), t6mVar.d(), t6mVar.e());
        this.index = i;
        this.used = true;
    }

    private BDSTreeHash getBDSTreeHashInstanceForUpdate() {
        BDSTreeHash bDSTreeHash = null;
        for (BDSTreeHash bDSTreeHash2 : this.treeHashInstances) {
            if (!bDSTreeHash2.isFinished() && bDSTreeHash2.isInitialized() && (bDSTreeHash == null || bDSTreeHash2.getHeight() < bDSTreeHash.getHeight() || (bDSTreeHash2.getHeight() == bDSTreeHash.getHeight() && bDSTreeHash2.getIndexLeaf() < bDSTreeHash.getIndexLeaf()))) {
                bDSTreeHash = bDSTreeHash2;
            }
        }
        return bDSTreeHash;
    }

    private void initialize(byte[] bArr, byte[] bArr2, c cVar) {
        if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        b bVar = (b) new b.C1051b().g(cVar.b()).h(cVar.c()).l();
        a aVar = (a) new a.b().g(cVar.b()).h(cVar.c()).k();
        for (int i = 0; i < (1 << this.treeHeight); i++) {
            cVar = (c) new c.b().g(cVar.b()).h(cVar.c()).p(i).n(cVar.e()).o(cVar.f()).f(cVar.a()).l();
            d dVar = this.wotsPlus;
            dVar.h(dVar.g(bArr2, cVar), bArr);
            h5l h5lVarE = this.wotsPlus.e(cVar);
            bVar = (b) new b.C1051b().g(bVar.b()).h(bVar.c()).n(i).o(bVar.f()).p(bVar.g()).f(bVar.a()).l();
            XMSSNode xMSSNodeA = f.a(this.wotsPlus, h5lVarE, bVar);
            aVar = (a) new a.b().g(aVar.b()).h(aVar.c()).n(i).f(aVar.a()).k();
            while (!this.stack.isEmpty() && this.stack.peek().getHeight() == xMSSNodeA.getHeight()) {
                int iFloor = (int) Math.floor(i / (1 << xMSSNodeA.getHeight()));
                if (iFloor == 1) {
                    this.authenticationPath.add(xMSSNodeA.clone());
                }
                if (iFloor == 3 && xMSSNodeA.getHeight() < this.treeHeight - this.k) {
                    this.treeHashInstances.get(xMSSNodeA.getHeight()).setNode(xMSSNodeA.clone());
                }
                if (iFloor >= 3 && (iFloor & 1) == 1 && xMSSNodeA.getHeight() >= this.treeHeight - this.k && xMSSNodeA.getHeight() <= this.treeHeight - 2) {
                    if (this.retain.get(Integer.valueOf(xMSSNodeA.getHeight())) == null) {
                        LinkedList<XMSSNode> linkedList = new LinkedList<>();
                        linkedList.add(xMSSNodeA.clone());
                        this.retain.put(Integer.valueOf(xMSSNodeA.getHeight()), linkedList);
                    } else {
                        this.retain.get(Integer.valueOf(xMSSNodeA.getHeight())).add(xMSSNodeA.clone());
                    }
                }
                a aVar2 = (a) new a.b().g(aVar.b()).h(aVar.c()).m(aVar.e()).n((aVar.f() - 1) / 2).f(aVar.a()).k();
                XMSSNode xMSSNodeB = f.b(this.wotsPlus, this.stack.pop(), xMSSNodeA, aVar2);
                XMSSNode xMSSNode = new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue());
                aVar = (a) new a.b().g(aVar2.b()).h(aVar2.c()).m(aVar2.e() + 1).n(aVar2.f()).f(aVar2.a()).k();
                xMSSNodeA = xMSSNode;
            }
            this.stack.push(xMSSNodeA);
        }
        this.root = this.stack.pop();
    }

    private void nextAuthenticationPath(byte[] bArr, byte[] bArr2, c cVar) {
        if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.used) {
            throw new IllegalStateException("index already used");
        }
        if (this.index > (1 << this.treeHeight) - 2) {
            throw new IllegalStateException("index out of bounds");
        }
        b bVar = (b) new b.C1051b().g(cVar.b()).h(cVar.c()).l();
        a aVar = (a) new a.b().g(cVar.b()).h(cVar.c()).k();
        int iB = x6m.b(this.index, this.treeHeight);
        if (((this.index >> (iB + 1)) & 1) == 0 && iB < this.treeHeight - 1) {
            this.keep.put(Integer.valueOf(iB), this.authenticationPath.get(iB).clone());
        }
        if (iB == 0) {
            cVar = (c) new c.b().g(cVar.b()).h(cVar.c()).p(this.index).n(cVar.e()).o(cVar.f()).f(cVar.a()).l();
            d dVar = this.wotsPlus;
            dVar.h(dVar.g(bArr2, cVar), bArr);
            this.authenticationPath.set(0, f.a(this.wotsPlus, this.wotsPlus.e(cVar), (b) new b.C1051b().g(bVar.b()).h(bVar.c()).n(this.index).o(bVar.f()).p(bVar.g()).f(bVar.a()).l()));
        } else {
            int i = iB - 1;
            XMSSNode xMSSNodeB = f.b(this.wotsPlus, this.authenticationPath.get(i), this.keep.get(Integer.valueOf(i)), (a) new a.b().g(aVar.b()).h(aVar.c()).m(i).n(this.index >> iB).f(aVar.a()).k());
            this.authenticationPath.set(iB, new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue()));
            this.keep.remove(Integer.valueOf(i));
            for (int i2 = 0; i2 < iB; i2++) {
                if (i2 < this.treeHeight - this.k) {
                    this.authenticationPath.set(i2, this.treeHashInstances.get(i2).getTailNode());
                } else {
                    this.authenticationPath.set(i2, this.retain.get(Integer.valueOf(i2)).removeFirst());
                }
            }
            int iMin = Math.min(iB, this.treeHeight - this.k);
            for (int i3 = 0; i3 < iMin; i3++) {
                int i4 = this.index + 1 + ((1 << i3) * 3);
                if (i4 < (1 << this.treeHeight)) {
                    this.treeHashInstances.get(i3).initialize(i4);
                }
            }
        }
        for (int i5 = 0; i5 < ((this.treeHeight - this.k) >> 1); i5++) {
            BDSTreeHash bDSTreeHashInstanceForUpdate = getBDSTreeHashInstanceForUpdate();
            if (bDSTreeHashInstanceForUpdate != null) {
                bDSTreeHashInstanceForUpdate.update(this.stack, this.wotsPlus, bArr, bArr2, cVar);
            }
        }
        this.index++;
    }

    public List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        Iterator<XMSSNode> it = this.authenticationPath.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().clone());
        }
        return arrayList;
    }

    public int getIndex() {
        return this.index;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, c cVar) {
        return new BDS(this, bArr, bArr2, cVar);
    }

    public XMSSNode getRoot() {
        return this.root.clone();
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void setXMSS(t6m t6mVar) {
        if (this.treeHeight != t6mVar.d()) {
            throw new IllegalStateException("wrong height");
        }
        this.wotsPlus = t6mVar.f();
    }

    public void validate() {
        if (this.authenticationPath == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.retain == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.stack == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.treeHashInstances == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.keep == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!x6m.l(this.treeHeight, this.index)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public BDS(t6m t6mVar, byte[] bArr, byte[] bArr2, c cVar) {
        this(t6mVar.f(), t6mVar.d(), t6mVar.e());
        initialize(bArr, bArr2, cVar);
    }

    public BDS(t6m t6mVar, byte[] bArr, byte[] bArr2, c cVar, int i) {
        this(t6mVar.f(), t6mVar.d(), t6mVar.e());
        initialize(bArr, bArr2, cVar);
        while (this.index < i) {
            nextAuthenticationPath(bArr, bArr2, cVar);
            this.used = false;
        }
    }

    private BDS(d dVar, int i, int i2) {
        this.wotsPlus = dVar;
        this.treeHeight = i;
        this.k = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.authenticationPath = new ArrayList();
                this.retain = new TreeMap();
                this.stack = new Stack<>();
                this.treeHashInstances = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.treeHashInstances.add(new BDSTreeHash(i4));
                }
                this.keep = new TreeMap();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    private BDS(BDS bds, byte[] bArr, byte[] bArr2, c cVar) {
        this.wotsPlus = bds.wotsPlus;
        this.treeHeight = bds.treeHeight;
        this.k = bds.k;
        this.root = bds.root;
        this.authenticationPath = new ArrayList(bds.authenticationPath);
        this.retain = bds.retain;
        this.stack = (Stack) bds.stack.clone();
        this.treeHashInstances = bds.treeHashInstances;
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        nextAuthenticationPath(bArr, bArr2, cVar);
        bds.used = true;
    }
}
