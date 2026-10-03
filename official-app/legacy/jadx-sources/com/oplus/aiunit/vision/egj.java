package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class egj {
    public final List<o97> a;

    public egj(List<o97> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public List<o97> a() {
        return this.a;
    }

    public boolean b() {
        Iterator<o97> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().b == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean c() {
        Iterator<o97> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = it.next().b;
            if (i2 == 3) {
                return false;
            }
            if (i2 == 1) {
                i++;
            }
        }
        return i > 0;
    }
}
