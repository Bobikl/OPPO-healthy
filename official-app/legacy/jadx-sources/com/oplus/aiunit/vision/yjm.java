package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class yjm {
    public static volatile yjm b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static t2n f19046c;
    public Context a;

    public yjm(Context context) {
        this.a = context;
        f19046c = i(context);
    }

    public static yjm b(Context context) {
        if (b == null) {
            synchronized (yjm.class) {
                if (b == null) {
                    b = new yjm(context);
                }
            }
        }
        return b;
    }

    public static List<String> d(List<vjm> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            Iterator<vjm> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }

    public static void h(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        String strB = vjm.b(str);
        if (f19046c.p(strB, vjm.class).size() > 0) {
            f19046c.j(strB, vjm.class);
        }
        String[] strArrSplit = str2.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            arrayList.add(new vjm(str, str3));
        }
        f19046c.l(arrayList);
    }

    public static t2n i(Context context) {
        try {
            return new t2n(context, xjm.a());
        } catch (Throwable th) {
            c2n.r(th, "OfflineDB", "getDB");
            th.printStackTrace();
            return null;
        }
    }

    public final synchronized tjm a(String str) {
        if (!l()) {
            return null;
        }
        List listP = f19046c.p(wjm.f(str), tjm.class);
        if (listP.size() <= 0) {
            return null;
        }
        return (tjm) listP.get(0);
    }

    public final ArrayList<tjm> c() {
        ArrayList<tjm> arrayList = new ArrayList<>();
        if (!l()) {
            return arrayList;
        }
        Iterator it = f19046c.p("", tjm.class).iterator();
        while (it.hasNext()) {
            arrayList.add((tjm) it.next());
        }
        return arrayList;
    }

    public final synchronized void e(tjm tjmVar) {
        if (l()) {
            f19046c.h(tjmVar, wjm.h(tjmVar.j()));
            h(tjmVar.e(), tjmVar.k());
        }
    }

    public final void f(String str, int i, long j2, long j3, long j4) {
        if (l()) {
            g(str, i, j2, new long[]{j3, 0, 0, 0, 0}, new long[]{j4, 0, 0, 0, 0});
        }
    }

    public final synchronized void g(String str, int i, long j2, long[] jArr, long[] jArr2) {
        if (l()) {
            f19046c.h(new ujm(str, j2, i, jArr[0], jArr2[0]), ujm.a(str));
        }
    }

    public final synchronized List<String> j(String str) {
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return arrayList;
        }
        arrayList.addAll(d(f19046c.p(vjm.b(str), vjm.class)));
        return arrayList;
    }

    public final synchronized void k(tjm tjmVar) {
        if (l()) {
            f19046c.j(wjm.h(tjmVar.j()), wjm.class);
            f19046c.j(vjm.b(tjmVar.e()), vjm.class);
            f19046c.j(ujm.a(tjmVar.e()), ujm.class);
        }
    }

    public final boolean l() {
        if (f19046c == null) {
            f19046c = i(this.a);
        }
        return f19046c != null;
    }

    public final synchronized void m(String str) {
        if (l()) {
            f19046c.j(wjm.f(str), wjm.class);
            f19046c.j(vjm.b(str), vjm.class);
            f19046c.j(ujm.a(str), ujm.class);
        }
    }

    public final synchronized String n(String str) {
        if (!l()) {
            return null;
        }
        List listP = f19046c.p(wjm.h(str), wjm.class);
        return listP.size() > 0 ? ((wjm) listP.get(0)).c() : null;
    }
}
