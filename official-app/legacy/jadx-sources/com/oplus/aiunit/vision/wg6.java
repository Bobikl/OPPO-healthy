package com.oplus.aiunit.vision;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.oplus.anim.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wg6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<Layer>> f18248c;
    public Map<String, gi6> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, aw7> f18249e;
    public List<wfb> f;
    public SparseArrayCompat<hw7> g;
    public LongSparseArray<Layer> h;
    public List<Layer> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f18250j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18251l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18252n;
    public final eee a = new eee();
    public final HashSet<String> b = new HashSet<>();
    public int o = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        u7b.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.f18250j;
    }

    public SparseArrayCompat<hw7> c() {
        return this.g;
    }

    public float d() {
        return (long) ((e() / this.m) * 1000.0f);
    }

    public float e() {
        return this.f18251l - this.k;
    }

    public float f() {
        return this.f18251l;
    }

    public Map<String, aw7> g() {
        return this.f18249e;
    }

    public float h(float f) {
        return l0c.i(this.k, this.f18251l, f);
    }

    public float i() {
        return this.m;
    }

    public Map<String, gi6> j() {
        return this.d;
    }

    public List<Layer> k() {
        return this.i;
    }

    @Nullable
    public wfb l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            wfb wfbVar = this.f.get(i);
            if (wfbVar.a(str)) {
                return wfbVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int m() {
        return this.o;
    }

    public eee n() {
        return this.a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> o(String str) {
        return this.f18248c.get(str);
    }

    public float p() {
        return this.k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean q() {
        return this.f18252n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r(int i) {
        this.o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void s(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, gi6> map2, SparseArrayCompat<hw7> sparseArrayCompat, Map<String, aw7> map3, List<wfb> list2) {
        this.f18250j = rect;
        this.k = f;
        this.f18251l = f2;
        this.m = f3;
        this.i = list;
        this.h = longSparseArray;
        this.f18248c = map;
        this.d = map2;
        this.g = sparseArrayCompat;
        this.f18249e = map3;
        this.f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer t(long j2) {
        return this.h.get(j2);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EffectiveAnimationComposition:\n");
        Iterator<Layer> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().y("\t"));
        }
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void u(boolean z) {
        this.f18252n = z;
    }

    public void v(boolean z) {
        this.a.b(z);
    }
}
