package org.spongycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
class BDSTreeHash implements Serializable {
    private static final long serialVersionUID = 1;
    private int height;
    private final int initialHeight;
    private int nextIndex;
    private XMSSNode tailNode;
    private boolean initialized = false;
    private boolean finished = false;

    public BDSTreeHash(int i) {
        this.initialHeight = i;
    }

    public int getHeight() {
        if (!this.initialized || this.finished) {
            return Integer.MAX_VALUE;
        }
        return this.height;
    }

    public int getIndexLeaf() {
        return this.nextIndex;
    }

    public XMSSNode getTailNode() {
        return this.tailNode.clone();
    }

    public void initialize(int i) {
        this.tailNode = null;
        this.height = this.initialHeight;
        this.nextIndex = i;
        this.initialized = true;
        this.finished = false;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public void setNode(XMSSNode xMSSNode) {
        this.tailNode = xMSSNode;
        int height = xMSSNode.getHeight();
        this.height = height;
        if (height == this.initialHeight) {
            this.finished = true;
        }
    }

    public void update(Stack<XMSSNode> stack, d dVar, byte[] bArr, byte[] bArr2, c cVar) {
        if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.finished || !this.initialized) {
            throw new IllegalStateException("finished or not initialized");
        }
        c cVar2 = (c) new c.b().g(cVar.b()).h(cVar.c()).p(this.nextIndex).n(cVar.e()).o(cVar.f()).f(cVar.a()).l();
        b bVar = (b) new b.C1051b().g(cVar2.b()).h(cVar2.c()).n(this.nextIndex).l();
        a aVar = (a) new a.b().g(cVar2.b()).h(cVar2.c()).n(this.nextIndex).k();
        dVar.h(dVar.g(bArr2, cVar2), bArr);
        XMSSNode xMSSNodeA = f.a(dVar, dVar.e(cVar2), bVar);
        while (!stack.isEmpty() && stack.peek().getHeight() == xMSSNodeA.getHeight() && stack.peek().getHeight() != this.initialHeight) {
            a aVar2 = (a) new a.b().g(aVar.b()).h(aVar.c()).m(aVar.e()).n((aVar.f() - 1) / 2).f(aVar.a()).k();
            XMSSNode xMSSNodeB = f.b(dVar, stack.pop(), xMSSNodeA, aVar2);
            XMSSNode xMSSNode = new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue());
            aVar = (a) new a.b().g(aVar2.b()).h(aVar2.c()).m(aVar2.e() + 1).n(aVar2.f()).f(aVar2.a()).k();
            xMSSNodeA = xMSSNode;
        }
        XMSSNode xMSSNode2 = this.tailNode;
        if (xMSSNode2 == null) {
            this.tailNode = xMSSNodeA;
        } else if (xMSSNode2.getHeight() == xMSSNodeA.getHeight()) {
            a aVar3 = (a) new a.b().g(aVar.b()).h(aVar.c()).m(aVar.e()).n((aVar.f() - 1) / 2).f(aVar.a()).k();
            xMSSNodeA = new XMSSNode(this.tailNode.getHeight() + 1, f.b(dVar, this.tailNode, xMSSNodeA, aVar3).getValue());
            this.tailNode = xMSSNodeA;
        } else {
            stack.push(xMSSNodeA);
        }
        if (this.tailNode.getHeight() == this.initialHeight) {
            this.finished = true;
        } else {
            this.height = xMSSNodeA.getHeight();
            this.nextIndex++;
        }
    }
}
