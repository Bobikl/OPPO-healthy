package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.collection.ArraySet;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class vie implements ya3.a {
    public final Context a;
    public HashMap<d01, s50> g;
    public HashMap<d01, u50> h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g2m f17875j;
    public bv1 k;
    public final ArraySet<d01> b = new ArraySet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArraySet<d01> f17873c = new ArraySet<>(1);
    public boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17874e = false;
    public boolean f = false;
    public ya3 i = null;

    public vie(Context context) {
        this.a = context;
        o();
    }

    public static vie e(Context context) {
        return new vie(context);
    }

    public static String i(int i) {
        if (i == 1) {
            return "position";
        }
        if (i == 2) {
            return "scale";
        }
        if (i != 3) {
            return i != 4 ? "custom" : "alpha";
        }
        return "rotation";
    }

    public final void A() {
        if (g25.a()) {
            g25.d(g25.FRAME_LOG_TAG, "syncMoverChanging start ===========> mCurrentRunningBehaviors =:" + this.b.size());
        }
        for (d01 d01Var : this.b) {
            if (d01Var != null) {
                d01Var.m();
                B(d01Var);
                t(d01Var);
                if (g25.a()) {
                    g25.d(g25.FRAME_LOG_TAG, "updateBehavior : " + d01Var);
                }
                if (d01Var.t()) {
                    if (g25.b()) {
                        g25.c("syncMoverChanging : behavior is steady");
                    }
                    d01Var.C();
                }
            }
        }
        this.d = this.b.isEmpty();
        if (g25.a()) {
            g25.d(g25.FRAME_LOG_TAG, "syncMoverChanging end ===========> mCurrentRunningBehaviors =:" + this.b.size());
        }
        if (this.d) {
            u();
        } else {
            this.i.d();
        }
    }

    public void B(d01 d01Var) {
        d01Var.E();
    }

    public void a(d01 d01Var, s50 s50Var) {
        if (this.g == null) {
            this.g = new HashMap<>(1);
        }
        this.g.put(d01Var, s50Var);
    }

    public void b(d01 d01Var, u50 u50Var) {
        if (this.h == null) {
            this.h = new HashMap<>(1);
        }
        this.h.put(d01Var, u50Var);
    }

    public <T extends d01> T c(T t) {
        Object obj;
        Object obj2;
        t.c(this);
        int i = 0;
        while (i < this.f17873c.size()) {
            d01 d01VarValueAt = this.f17873c.valueAt(i);
            if (d01VarValueAt != null && (obj = d01VarValueAt.f10315n) != null && (obj2 = t.f10315n) != null && obj == obj2 && d01VarValueAt.r() == t.r() && v(d01VarValueAt)) {
                i--;
            }
            i++;
        }
        this.f17873c.add(t);
        if (g25.b()) {
            g25.c("addBehavior behavior =:" + t + ",mAllBehaviors.size =:" + this.f17873c.size());
        }
        return t;
    }

    public final bv1 d(cfk cfkVar, int i) {
        bv1 bv1VarF = f(this.f17875j.f().d(hr3.d(cfkVar.f10068e.a), hr3.d(cfkVar.f10068e.b)), 1, i, hr3.d(cfkVar.a), hr3.d(cfkVar.b), i(i));
        bv1VarF.f9865e.f();
        bv1VarF.l(true);
        return bv1VarF;
    }

    @Override // com.oplus.aiunit.vision.ya3.a
    public void doFrame(long j2) {
        if (this.f) {
            return;
        }
        y();
    }

    public bv1 f(nuk nukVar, int i, int i2, float f, float f2, String str) {
        return this.f17875j.a(nukVar, i, i2, f, f2, str);
    }

    public lki g(oki okiVar) {
        return this.f17875j.b(okiVar);
    }

    public final void h() {
        this.f17875j = new g2m();
        this.k = f(new nuk(), 0, 5, 0.0f, 0.0f, "Ground");
        if (g25.b()) {
            g25.c("createWorld : " + this);
        }
    }

    public boolean j(bv1 bv1Var) {
        if (bv1Var == null) {
            return false;
        }
        this.f17875j.c(bv1Var);
        return true;
    }

    public boolean k(lki lkiVar) {
        this.f17875j.d(lkiVar);
        return true;
    }

    public bv1 l() {
        return this.k;
    }

    public bv1 m(cfk cfkVar, int i) {
        bv1 bv1Var;
        if (g25.b()) {
            g25.c("getOrCreatePropertyBody : uiItem =:" + cfkVar + ",propertyType =:" + i);
        }
        for (d01 d01Var : this.f17873c) {
            cfk cfkVar2 = d01Var.f10313j;
            if (cfkVar2 != null && cfkVar2 == cfkVar && (bv1Var = d01Var.k) != null && bv1Var.g() == i) {
                return d01Var.k;
            }
        }
        return d(cfkVar, i);
    }

    public cfk n(Object obj) {
        Object obj2;
        if (g25.b()) {
            g25.c("getOrCreateUIItem : target =:" + obj);
        }
        Iterator<d01> it = this.f17873c.iterator();
        while (it.hasNext()) {
            cfk cfkVar = it.next().f10313j;
            if (cfkVar != null && (obj2 = cfkVar.f10067c) != null && obj != null && obj2 == obj) {
                return cfkVar;
            }
        }
        if (!(obj instanceof View)) {
            return obj instanceof cfk ? (cfk) obj : new cfk().b(0.0f, 0.0f);
        }
        View view = (View) obj;
        cfk cfkVarB = new cfk(obj).b(view.getMeasuredWidth(), view.getMeasuredHeight());
        cfkVarB.c(view.getX(), view.getY());
        cfkVarB.d(view.getScaleX(), view.getScaleY());
        return cfkVarB;
    }

    public final void o() {
        ya3 ya3Var = new ya3();
        this.i = ya3Var;
        ya3Var.e(this);
        p();
        h();
    }

    public final void p() {
        hr3.e(this.a.getResources().getDisplayMetrics().density);
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            hr3.f(1.0f / defaultDisplay.getRefreshRate());
        }
        if (g25.b()) {
            g25.c("initConfig : sPhysicalSizeToPixelsRatio =:" + hr3.sPhysicalSizeToPixelsRatio + ",sSteadyAccuracy =:" + hr3.sSteadyAccuracy + ",sRefreshRate =:" + hr3.sRefreshRate);
        }
    }

    public boolean q() {
        return this.f17874e;
    }

    public final void r(d01 d01Var) {
        s50 s50Var;
        HashMap<d01, s50> map = this.g;
        if (map == null || (s50Var = map.get(d01Var)) == null) {
            return;
        }
        s50Var.onAnimationEnd(d01Var);
    }

    public final void s(d01 d01Var) {
        s50 s50Var;
        HashMap<d01, s50> map = this.g;
        if (map == null || (s50Var = map.get(d01Var)) == null) {
            return;
        }
        s50Var.onAnimationStart(d01Var);
    }

    public final void t(d01 d01Var) {
        u50 u50Var;
        HashMap<d01, u50> map = this.h;
        if (map == null || (u50Var = map.get(d01Var)) == null) {
            return;
        }
        u50Var.onAnimationUpdate(d01Var);
    }

    public final void u() {
        if (this.f17874e) {
            this.i.f();
            this.f17874e = false;
        }
    }

    public boolean v(d01 d01Var) {
        if (d01Var == null) {
            return false;
        }
        boolean zRemove = this.f17873c.remove(d01Var);
        if (g25.b()) {
            g25.c("removeBehavior behavior =:" + d01Var + ",removed =:" + zRemove);
        }
        if (zRemove) {
            d01Var.z();
        }
        return zRemove;
    }

    public final void w() {
        if (this.f17874e) {
            return;
        }
        this.i.d();
        this.f17874e = true;
    }

    public void x(d01 d01Var) {
        Object obj;
        Object obj2;
        bv1 bv1Var;
        bv1 bv1Var2;
        if (this.f) {
            return;
        }
        if (this.b.contains(d01Var) && this.f17874e) {
            return;
        }
        if (g25.b()) {
            g25.c("startBehavior behavior =:" + d01Var);
        }
        int i = 0;
        while (i < this.b.size()) {
            d01 d01VarValueAt = this.b.valueAt(i);
            if (d01VarValueAt != null && (obj = d01VarValueAt.f10315n) != null && (obj2 = d01Var.f10315n) != null && obj == obj2 && (bv1Var = d01VarValueAt.k) != null && (bv1Var2 = d01Var.k) != null && bv1Var == bv1Var2 && d01VarValueAt.C()) {
                i--;
            }
            i++;
        }
        this.b.add(d01Var);
        this.d = false;
        w();
        s(d01Var);
    }

    public final void y() {
        this.f17875j.i(hr3.sRefreshRate);
        A();
    }

    public void z(d01 d01Var) {
        this.b.remove(d01Var);
        if (g25.b()) {
            g25.c("stopBehavior behavior =:" + d01Var + ",mCurrentRunningBehaviors.size() =:" + this.b.size());
        }
        r(d01Var);
    }
}
