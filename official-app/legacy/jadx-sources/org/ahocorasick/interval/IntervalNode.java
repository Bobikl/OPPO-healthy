package org.ahocorasick.interval;

import com.oplus.aiunit.vision.xfa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class IntervalNode {
    public IntervalNode a;
    public IntervalNode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20745c;
    public List<xfa> d = new ArrayList();

    public enum Direction {
        LEFT,
        RIGHT
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Direction.values().length];
            a = iArr;
            try {
                iArr[Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntervalNode(List<xfa> list) {
        this.a = null;
        this.b = null;
        this.f20745c = e(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xfa xfaVar : list) {
            if (xfaVar.getEnd() < this.f20745c) {
                arrayList.add(xfaVar);
            } else if (xfaVar.getStart() > this.f20745c) {
                arrayList2.add(xfaVar);
            } else {
                this.d.add(xfaVar);
            }
        }
        if (arrayList.size() > 0) {
            this.a = new IntervalNode(arrayList);
        }
        if (arrayList2.size() > 0) {
            this.b = new IntervalNode(arrayList2);
        }
    }

    public void a(xfa xfaVar, List<xfa> list, List<xfa> list2) {
        for (xfa xfaVar2 : list2) {
            if (!xfaVar2.equals(xfaVar)) {
                list.add(xfaVar2);
            }
        }
    }

    public List<xfa> b(xfa xfaVar, Direction direction) {
        ArrayList arrayList = new ArrayList();
        for (xfa xfaVar2 : this.d) {
            int i = a.a[direction.ordinal()];
            if (i != 1) {
                if (i == 2 && xfaVar2.getEnd() >= xfaVar.getStart()) {
                    arrayList.add(xfaVar2);
                }
            } else if (xfaVar2.getStart() <= xfaVar.getEnd()) {
                arrayList.add(xfaVar2);
            }
        }
        return arrayList;
    }

    public List<xfa> c(xfa xfaVar) {
        return b(xfaVar, Direction.LEFT);
    }

    public List<xfa> d(xfa xfaVar) {
        return b(xfaVar, Direction.RIGHT);
    }

    public int e(List<xfa> list) {
        int i = -1;
        int i2 = -1;
        for (xfa xfaVar : list) {
            int start = xfaVar.getStart();
            int end = xfaVar.getEnd();
            if (i == -1 || start < i) {
                i = start;
            }
            if (i2 == -1 || end > i2) {
                i2 = end;
            }
        }
        return (i + i2) / 2;
    }

    public List<xfa> f(IntervalNode intervalNode, xfa xfaVar) {
        return intervalNode != null ? intervalNode.g(xfaVar) : Collections.emptyList();
    }

    public List<xfa> g(xfa xfaVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f20745c < xfaVar.getStart()) {
            a(xfaVar, arrayList, f(this.b, xfaVar));
            a(xfaVar, arrayList, d(xfaVar));
        } else if (this.f20745c > xfaVar.getEnd()) {
            a(xfaVar, arrayList, f(this.a, xfaVar));
            a(xfaVar, arrayList, c(xfaVar));
        } else {
            a(xfaVar, arrayList, this.d);
            a(xfaVar, arrayList, f(this.a, xfaVar));
            a(xfaVar, arrayList, f(this.b, xfaVar));
        }
        return arrayList;
    }
}
