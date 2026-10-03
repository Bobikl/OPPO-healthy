package com.heytap.accessory.connectivity.ble.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public String a;
    public List<d> b = new ArrayList();

    public c(String str) {
        this.a = str;
    }

    public void a(String str) {
        d dVar = new d(str);
        if (this.b.contains(dVar)) {
            return;
        }
        this.b.add(dVar);
    }

    public String b() {
        return this.a;
    }

    public void a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            d dVar = new d(it.next());
            if (!this.b.contains(dVar)) {
                this.b.add(dVar);
            }
        }
    }

    public List<d> a() {
        return this.b;
    }
}
