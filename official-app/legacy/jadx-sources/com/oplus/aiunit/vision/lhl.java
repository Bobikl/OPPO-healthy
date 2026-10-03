package com.oplus.aiunit.vision;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class lhl {
    public HashMap<Integer, Float> a = new LinkedHashMap();
    public float b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13701c = 0;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13702e = 0.0f;
    public float f = 0.1f;
    public boolean g = true;
    public float h = 0.0f;
    public IDataSet i;

    public final void a(String str) {
    }

    public final int b() {
        for (Integer num : this.a.keySet()) {
            if (num.intValue() > this.f13701c) {
                return num.intValue();
            }
        }
        return this.f13701c + 1;
    }

    public final void c(float f) {
        a7b.b("WaveAnimatorHelper", "fixBarTurn");
        int iRound = Math.round(f / this.f);
        a("changeRange is so big, pastBarTurn:" + iRound);
        while (iRound >= 0) {
            this.f13701c = e(this.i, b());
            iRound--;
        }
    }

    public float d(ChartAnimator chartAnimator, int i) {
        float fFloatValue;
        if (this.f13702e > 0.0f && chartAnimator.getPhaseY() >= this.f13702e) {
            return 1.0f;
        }
        if (this.a.get(Integer.valueOf(i)) == null) {
            fFloatValue = this.g ? 0.0f : chartAnimator.getPhaseY();
        } else {
            fFloatValue = this.a.get(Integer.valueOf(i)).floatValue();
        }
        return Math.min(1.0f, Math.max(0.0f, fFloatValue));
    }

    public final int e(IDataSet iDataSet, int i) {
        return Math.min(iDataSet.getEntryCount() - 1, Math.max(0, i));
    }

    public final boolean f(int i, int i2) {
        Float f = this.a.get(-1);
        Float f2 = this.a.get(-2);
        if (f2 == null || f == null) {
            h(i, i2);
            return true;
        }
        if (((int) f.floatValue()) == i && ((int) f2.floatValue()) == i2) {
            g(i, i2, false);
            return false;
        }
        h(i, i2);
        return true;
    }

    public final void g(int i, int i2, boolean z) {
        a("initBarPhases");
        Iterator<Integer> it = this.a.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() != -1 && next.intValue() != -2 && (next.intValue() < i || next.intValue() > i2)) {
                it.remove();
            }
        }
        for (int i3 = i; i3 <= i2; i3++) {
            if ((!this.g || i(this.i, i3) || i3 == i || i3 == i2) && (this.a.get(Integer.valueOf(i3)) == null || this.a.get(Integer.valueOf(i3)).floatValue() > Float.MAX_VALUE || this.a.get(Integer.valueOf(i3)).floatValue() < Float.MIN_VALUE || z)) {
                this.a.put(Integer.valueOf(i3), Float.valueOf(this.b));
            }
        }
    }

    public final void h(int i, int i2) {
        a("initBarPhasesBounds init barTurn");
        this.a.clear();
        this.a.put(-2, Float.valueOf(i2));
        this.a.put(-1, Float.valueOf(i));
        this.f13701c = i;
        g(i, i2, false);
    }

    public final boolean i(IDataSet iDataSet, int i) {
        return i >= 0 && i < iDataSet.getEntryCount() && iDataSet.getEntryForIndex(i).getY() > this.h;
    }

    public void j(IDataSet iDataSet, ChartAnimator chartAnimator, int i, int i2) {
        this.i = iDataSet;
        a("setBarPhases visibleCount:" + this.d + ",totalPhase:" + this.f13702e + ",criticalPhase:" + this.f);
        int i3 = this.f13701c;
        if (i3 < i || i3 > i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("setBarPhases barTurn not in right range:");
            sb.append(this.f13701c);
            this.f13701c = i;
        }
        a("setBarPhases XBounds min:" + i + ",max:" + i2 + ",barTurn:" + this.f13701c);
        float phaseY = chartAnimator.getPhaseY();
        if (!f(i, i2)) {
            Float f = this.a.get(Integer.valueOf(i));
            if (f == null) {
                a("setBarPhases error,get min key null");
                return;
            }
            float fFloatValue = phaseY - f.floatValue();
            a("setBarPhases phaseY:" + phaseY + ",minValue:" + f + ",changeRange:" + fFloatValue + ",barTurn:" + this.f13701c);
            if (fFloatValue < 0.0f) {
                a7b.f("WaveAnimatorHelper", "setBarPhases changeRange < 0, initBarPhases");
                h(i, i2);
                return;
            }
            if (fFloatValue == 0.0f) {
                return;
            }
            Float fValueOf = this.a.get(Integer.valueOf(this.f13701c));
            if (fValueOf == null) {
                fValueOf = Float.valueOf(this.b);
            }
            if (fValueOf.floatValue() + fFloatValue > this.b + this.f) {
                this.f13701c = e(iDataSet, b());
                if (fFloatValue > this.f + 0.05f) {
                    c(fFloatValue);
                }
                this.f13701c = Math.max(Math.min(this.f13701c, i2), i);
                a("setBarPhases minValue:" + f + ",bigger than increment, add barTurn:" + this.f13701c);
            }
            a("setBarPhases final changeRange:" + fFloatValue);
            while (i <= this.f13701c) {
                Float f2 = this.a.get(Integer.valueOf(i));
                if (f2 != null) {
                    this.a.put(Integer.valueOf(i), Float.valueOf(f2.floatValue() + fFloatValue));
                }
                i++;
            }
            a("setBarPhases final map:" + this.a);
            a("============  setBarPhases end  ==========");
            return;
        }
        this.a.put(Integer.valueOf(i), Float.valueOf(phaseY));
        this.a.put(Integer.valueOf(i2), Float.valueOf(phaseY));
        while (true) {
            i++;
            if (i >= i2) {
                a("setBarPhases init barValues:" + this.a);
                return;
            }
            if (this.g && i(iDataSet, i)) {
                this.a.put(Integer.valueOf(i), Float.valueOf(phaseY));
            } else if (!this.g) {
                this.a.put(Integer.valueOf(i), Float.valueOf(phaseY));
            }
        }
    }

    public lhl k(float f) {
        this.f = f;
        return this;
    }

    public lhl l(float f) {
        this.b = f;
        return this;
    }

    public lhl m(float f) {
        this.f13702e = f;
        return this;
    }

    public lhl n(int i) {
        this.d = i;
        return this;
    }
}
