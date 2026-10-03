package com.oplus.aiunit.vision;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class k9b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<Layer>> f13202c;
    public Map<String, xab> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13203e;
    public Map<String, cw7> f;
    public List<xfb> g;
    public SparseArrayCompat<iw7> h;
    public LongSparseArray<Layer> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Layer> f13204j;
    public Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13205l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13206n;
    public boolean o;
    public int q;
    public int r;
    public final dee a = new dee();
    public final HashSet<String> b = new HashSet<>();
    public int p = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        o7b.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.k;
    }

    public SparseArrayCompat<iw7> c() {
        return this.h;
    }

    public float d() {
        return (long) ((e() / this.f13206n) * 1000.0f);
    }

    public float e() {
        return this.m - this.f13205l;
    }

    public float f() {
        return this.m;
    }

    public Map<String, cw7> g() {
        return this.f;
    }

    public float h(float f) {
        return m0c.i(this.f13205l, this.m, f);
    }

    public float i() {
        return this.f13206n;
    }

    public Map<String, xab> j() {
        float fE = frk.e();
        if (fE != this.f13203e) {
            for (Map.Entry<String, xab> entry : this.d.entrySet()) {
                this.d.put(entry.getKey(), entry.getValue().a(this.f13203e / fE));
            }
        }
        this.f13203e = fE;
        return this.d;
    }

    public List<Layer> k() {
        return this.f13204j;
    }

    @Nullable
    public xfb l(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            xfb xfbVar = this.g.get(i);
            if (xfbVar.a(str)) {
                return xfbVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int m() {
        return this.p;
    }

    public dee n() {
        return this.a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> o(String str) {
        return this.f13202c.get(str);
    }

    public float p() {
        return this.f13205l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean q() {
        return this.o;
    }

    public boolean r() {
        return !this.d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void s(int i) {
        this.p += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void t(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, xab> map2, float f4, SparseArrayCompat<iw7> sparseArrayCompat, Map<String, cw7> map3, List<xfb> list2, int i, int i2) {
        this.k = rect;
        this.f13205l = f;
        this.m = f2;
        this.f13206n = f3;
        this.f13204j = list;
        this.i = longSparseArray;
        this.f13202c = map;
        this.d = map2;
        this.f13203e = f4;
        this.h = sparseArrayCompat;
        this.f = map3;
        this.g = list2;
        this.q = i;
        this.r = i2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f13204j.iterator();
        while (it.hasNext()) {
            sb.append(it.next().z("\t"));
        }
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer u(long j2) {
        return this.i.get(j2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void v(boolean z) {
        this.o = z;
    }

    public void w(boolean z) {
        this.a.b(z);
    }
}
