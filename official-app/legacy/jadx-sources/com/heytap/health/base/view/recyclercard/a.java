package com.heytap.health.base.view.recyclercard;

import android.content.Context;
import android.database.Observable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public abstract class a {
    public C0298a i = new C0298a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3337j = "Card";
    public SparseArray<View> k = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3338l = false;
    public boolean m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f3339n;

    /* JADX INFO: renamed from: com.heytap.health.base.view.recyclercard.a$a, reason: collision with other inner class name */
    public static class C0298a extends Observable<RecyclerCardController.d> {
        public boolean a(RecyclerCardController.d dVar) {
            synchronized (((Observable) this).mObservers) {
                return ((Observable) this).mObservers.contains(dVar);
            }
        }

        public void b(a aVar, C0298a c0298a) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerCardController.d) ((Observable) this).mObservers.get(size)).a(aVar, c0298a);
            }
        }
    }

    public final View a(View view, int i) {
        if (this.f3339n != view) {
            this.f3339n = view;
            this.k.clear();
            View viewFindViewById = this.f3339n.findViewById(i);
            this.k.put(i, viewFindViewById);
            return viewFindViewById;
        }
        View view2 = this.k.get(i);
        if (view2 != null) {
            return view2;
        }
        View viewFindViewById2 = view.findViewById(i);
        this.k.put(i, viewFindViewById2);
        return viewFindViewById2;
    }

    public int b() {
        return 0;
    }

    public boolean c() {
        return this.m;
    }

    public boolean d() {
        return this.f3338l;
    }

    public abstract int e();

    public void f(Context context, View view, View view2) {
    }

    public void g(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCardClick: ");
        sb.append(getClass().getSimpleName());
    }

    public void h() {
        StringBuilder sb = new StringBuilder();
        sb.append("onDestory: ");
        sb.append(getClass().getSimpleName());
    }

    public void i() {
        StringBuilder sb = new StringBuilder();
        sb.append("onHidden: ");
        sb.append(getClass().getSimpleName());
        this.f3338l = false;
    }

    public void j() {
        StringBuilder sb = new StringBuilder();
        sb.append("onShow: ");
        sb.append(getClass().getSimpleName());
        this.f3338l = true;
    }

    public void k(RecyclerCardController.d dVar) {
        if (this.i.a(dVar)) {
            return;
        }
        this.i.registerObserver(dVar);
    }

    public void l(Context context, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("renderView: ");
        sb.append(getClass().getSimpleName());
    }

    public void m(boolean z) {
        if (this.m != z) {
            this.m = z;
            C0298a c0298a = this.i;
            c0298a.b(this, c0298a);
        }
    }

    public void n(RecyclerCardController.d dVar) {
        if (this.i.a(dVar)) {
            this.i.unregisterObserver(dVar);
        }
    }
}
