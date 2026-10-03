package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.collection.ArraySet;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class dle implements mb3.a {
    public final Context a;
    public HashMap<r01, c60> g;
    public HashMap<r01, e60> h;
    public f6m j;
    public pv1 k;
    public final ArraySet<r01> b = new ArraySet<>(1);
    public final ArraySet<r01> c = new ArraySet<>(1);
    public boolean d = true;
    public boolean e = false;
    public boolean f = false;
    public mb3 i = null;

    public dle(Context context) {
        this.a = context;
        o();
    }

    public static dle e(Context context) {
        return new dle(context);
    }

    public static String i(int i) {
        if (i == 1) {
            return "position";
        }
        if (i == 2) {
            return "scale";
        }
        if (i != 3) {
            return i != 4 ? "custom" : ViewEntity.ALPHA;
        }
        return ViewEntity.ROTATION;
    }

    public final void A() {
        if (z25.a()) {
            z25.d(z25.FRAME_LOG_TAG, "syncMoverChanging start ===========> mCurrentRunningBehaviors =:" + this.b.size());
        }
        for (r01 r01Var : this.b) {
            if (r01Var != null) {
                r01Var.m();
                B(r01Var);
                t(r01Var);
                if (z25.a()) {
                    z25.d(z25.FRAME_LOG_TAG, "updateBehavior : " + r01Var);
                }
                if (r01Var.t()) {
                    if (z25.b()) {
                        z25.c("syncMoverChanging : behavior is steady");
                    }
                    r01Var.C();
                }
            }
        }
        this.d = this.b.isEmpty();
        if (z25.a()) {
            z25.d(z25.FRAME_LOG_TAG, "syncMoverChanging end ===========> mCurrentRunningBehaviors =:" + this.b.size());
        }
        if (this.d) {
            u();
        } else {
            this.i.d();
        }
    }

    public void B(r01 r01Var) {
        r01Var.E();
    }

    public void a(r01 r01Var, c60 c60Var) {
        if (this.g == null) {
            this.g = new HashMap<>(1);
        }
        this.g.put(r01Var, c60Var);
    }

    public void b(r01 r01Var, e60 e60Var) {
        if (this.h == null) {
            this.h = new HashMap<>(1);
        }
        this.h.put(r01Var, e60Var);
    }

    public <T extends r01> T c(T t) {
        Object obj;
        Object obj2;
        t.c(this);
        int i = 0;
        while (i < this.c.size()) {
            r01 r01Var = (r01) this.c.valueAt(i);
            if (r01Var != null && (obj = r01Var.n) != null && (obj2 = t.n) != null && obj == obj2 && r01Var.r() == t.r() && v(r01Var)) {
                i--;
            }
            i++;
        }
        this.c.add(t);
        if (z25.b()) {
            z25.c("addBehavior behavior =:" + t + ",mAllBehaviors.size =:" + this.c.size());
        }
        return t;
    }

    public final pv1 d(ejk ejkVar, int i) {
        pv1 pv1VarF = f(this.j.f().d(vr3.d(ejkVar.e.a), vr3.d(ejkVar.e.b)), 1, i, vr3.d(ejkVar.a), vr3.d(ejkVar.b), i(i));
        pv1VarF.e.f();
        pv1VarF.l(true);
        return pv1VarF;
    }

    @Override // com.oplus.aiunit.vision.mb3.a
    public void doFrame(long j) {
        if (this.f) {
            return;
        }
        y();
    }

    public pv1 f(lyk lykVar, int i, int i2, float f, float f2, String str) {
        return this.j.a(lykVar, i, i2, f, f2, str);
    }

    public eoi g(hoi hoiVar) {
        return this.j.b(hoiVar);
    }

    public final void h() {
        this.j = new f6m();
        this.k = f(new lyk(), 0, 5, vr3.UNSET, vr3.UNSET, "Ground");
        if (z25.b()) {
            z25.c("createWorld : " + this);
        }
    }

    public boolean j(pv1 pv1Var) {
        if (pv1Var == null) {
            return false;
        }
        this.j.c(pv1Var);
        return true;
    }

    public boolean k(eoi eoiVar) {
        this.j.d(eoiVar);
        return true;
    }

    public pv1 l() {
        return this.k;
    }

    public pv1 m(ejk ejkVar, int i) {
        pv1 pv1Var;
        if (z25.b()) {
            z25.c("getOrCreatePropertyBody : uiItem =:" + ejkVar + ",propertyType =:" + i);
        }
        for (r01 r01Var : this.c) {
            ejk ejkVar2 = r01Var.j;
            if (ejkVar2 != null && ejkVar2 == ejkVar && (pv1Var = r01Var.k) != null && pv1Var.g() == i) {
                return r01Var.k;
            }
        }
        return d(ejkVar, i);
    }

    public ejk n(Object obj) {
        Object obj2;
        if (z25.b()) {
            z25.c("getOrCreateUIItem : target =:" + obj);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ejk ejkVar = ((r01) it.next()).j;
            if (ejkVar != null && (obj2 = ejkVar.c) != null && obj != null && obj2 == obj) {
                return ejkVar;
            }
        }
        if (!(obj instanceof View)) {
            return obj instanceof ejk ? (ejk) obj : new ejk().b(vr3.UNSET, vr3.UNSET);
        }
        View view = (View) obj;
        ejk ejkVarB = new ejk(obj).b(view.getMeasuredWidth(), view.getMeasuredHeight());
        ejkVarB.c(view.getX(), view.getY());
        ejkVarB.d(view.getScaleX(), view.getScaleY());
        return ejkVarB;
    }

    public final void o() {
        mb3 mb3Var = new mb3();
        this.i = mb3Var;
        mb3Var.e(this);
        p();
        h();
    }

    public final void p() {
        vr3.e(this.a.getResources().getDisplayMetrics().density);
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            vr3.f(1.0f / defaultDisplay.getRefreshRate());
        }
        if (z25.b()) {
            z25.c("initConfig : sPhysicalSizeToPixelsRatio =:" + vr3.sPhysicalSizeToPixelsRatio + ",sSteadyAccuracy =:" + vr3.sSteadyAccuracy + ",sRefreshRate =:" + vr3.sRefreshRate);
        }
    }

    public boolean q() {
        return this.e;
    }

    public final void r(r01 r01Var) {
        c60 c60Var;
        HashMap<r01, c60> map = this.g;
        if (map == null || (c60Var = map.get(r01Var)) == null) {
            return;
        }
        c60Var.onAnimationEnd(r01Var);
    }

    public final void s(r01 r01Var) {
        c60 c60Var;
        HashMap<r01, c60> map = this.g;
        if (map == null || (c60Var = map.get(r01Var)) == null) {
            return;
        }
        c60Var.onAnimationStart(r01Var);
    }

    public final void t(r01 r01Var) {
        e60 e60Var;
        HashMap<r01, e60> map = this.h;
        if (map == null || (e60Var = map.get(r01Var)) == null) {
            return;
        }
        e60Var.onAnimationUpdate(r01Var);
    }

    public final void u() {
        if (this.e) {
            this.i.f();
            this.e = false;
        }
    }

    public boolean v(r01 r01Var) {
        if (r01Var == null) {
            return false;
        }
        boolean zRemove = this.c.remove(r01Var);
        if (z25.b()) {
            z25.c("removeBehavior behavior =:" + r01Var + ",removed =:" + zRemove);
        }
        if (zRemove) {
            r01Var.z();
        }
        return zRemove;
    }

    public final void w() {
        if (this.e) {
            return;
        }
        this.i.d();
        this.e = true;
    }

    public void x(r01 r01Var) {
        Object obj;
        Object obj2;
        pv1 pv1Var;
        pv1 pv1Var2;
        if (this.f) {
            return;
        }
        if (this.b.contains(r01Var) && this.e) {
            return;
        }
        if (z25.b()) {
            z25.c("startBehavior behavior =:" + r01Var);
        }
        int i = 0;
        while (i < this.b.size()) {
            r01 r01Var2 = (r01) this.b.valueAt(i);
            if (r01Var2 != null && (obj = r01Var2.n) != null && (obj2 = r01Var.n) != null && obj == obj2 && (pv1Var = r01Var2.k) != null && (pv1Var2 = r01Var.k) != null && pv1Var == pv1Var2 && r01Var2.C()) {
                i--;
            }
            i++;
        }
        this.b.add(r01Var);
        this.d = false;
        w();
        s(r01Var);
    }

    public final void y() {
        this.j.i(vr3.sRefreshRate);
        A();
    }

    public void z(r01 r01Var) {
        this.b.remove(r01Var);
        if (z25.b()) {
            z25.c("stopBehavior behavior =:" + r01Var + ",mCurrentRunningBehaviors.size() =:" + this.b.size());
        }
        r(r01Var);
    }
}
