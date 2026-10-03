package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public class bh0 extends tpj {
    public LinkedList<LinkedList<gj0>> g;
    public int h;
    public int i;

    public bh0() {
        LinkedList<LinkedList<gj0>> linkedList = new LinkedList<>();
        this.g = linkedList;
        linkedList.add(new LinkedList<>());
        this.i = 0;
    }

    public void n() {
        this.g.get(this.i).add(this.d);
        this.d = null;
    }

    public void o(int i) {
        this.g.get(this.i).add(this.d);
        for (int i2 = 1; i2 < i - 1; i2++) {
            this.g.get(this.i).add(null);
        }
        this.d = null;
    }

    public void p() {
        n();
        this.g.add(new LinkedList<>());
        this.i++;
    }

    public void q() {
        if (this.g.getLast().size() != 0 || this.d != null) {
            p();
        }
        this.i = this.g.size() - 1;
        this.h = this.g.get(0).size();
        for (int i = 1; i < this.i; i++) {
            if (this.g.get(i).size() > this.h) {
                this.h = this.g.get(i).size();
            }
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            int size = this.g.get(i2).size();
            if (size != this.h && this.g.get(i2).get(0) != null && this.g.get(i2).get(0).i != 11) {
                LinkedList<gj0> linkedList = this.g.get(i2);
                while (size < this.h) {
                    linkedList.add(null);
                    size++;
                }
            }
        }
    }

    public otk r() {
        otk otkVar = new otk();
        otkVar.j(true);
        Iterator<LinkedList<gj0>> it = this.g.iterator();
        while (it.hasNext()) {
            Iterator<gj0> it2 = it.next().iterator();
            while (it2.hasNext()) {
                otkVar.i(it2.next());
            }
        }
        return otkVar;
    }
}
