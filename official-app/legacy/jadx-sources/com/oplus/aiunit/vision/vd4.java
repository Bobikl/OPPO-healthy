package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vd4 extends ud4 {
    public static final int VIEW_ADD = 1;
    public static final int VIEW_BEAN = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17813l;
    public boolean m;

    public vd4() {
    }

    public static List<ud4> a(List<vd4> list) {
        ArrayList arrayList = new ArrayList();
        for (vd4 vd4Var : list) {
            ud4 ud4Var = new ud4();
            ud4Var.a = vd4Var.a;
            ud4Var.b = vd4Var.b;
            ud4Var.f17423c = vd4Var.f17423c;
            ud4Var.d = vd4Var.d;
            ud4Var.f17424e = vd4Var.f17424e;
            ud4Var.f = vd4Var.f;
            ud4Var.g = vd4Var.g;
            ud4Var.h = vd4Var.h;
            ud4Var.i = vd4Var.i;
            ud4Var.f17425j = vd4Var.f17425j;
            ud4Var.k = vd4Var.k;
            arrayList.add(ud4Var);
        }
        return arrayList;
    }

    public static List<vd4> b(List<ud4> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ud4> it = list.iterator();
        while (it.hasNext()) {
            vd4 vd4Var = new vd4(it.next());
            vd4Var.f17813l = 0;
            arrayList.add(vd4Var);
        }
        return arrayList;
    }

    public ud4 c() {
        ud4 ud4Var = new ud4();
        ud4Var.a = this.a;
        ud4Var.b = this.b;
        ud4Var.f17423c = this.f17423c;
        ud4Var.d = this.d;
        ud4Var.f17424e = this.f17424e;
        ud4Var.f = this.f;
        ud4Var.g = this.g;
        ud4Var.h = this.h;
        ud4Var.i = this.i;
        ud4Var.f17425j = this.f17425j;
        ud4Var.k = this.k;
        return ud4Var;
    }

    public vd4(ud4 ud4Var) {
        this.a = ud4Var.a;
        this.b = ud4Var.b;
        this.f17423c = ud4Var.f17423c;
        this.d = ud4Var.d;
        this.f17424e = ud4Var.f17424e;
        this.f = ud4Var.f;
        this.g = ud4Var.g;
        this.h = ud4Var.h;
        this.i = ud4Var.i;
        this.f17425j = ud4Var.f17425j;
        this.k = ud4Var.k;
    }
}
