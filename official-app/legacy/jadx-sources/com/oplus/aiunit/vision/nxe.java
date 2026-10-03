package com.oplus.aiunit.vision;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class nxe<T, V extends View> implements ComponentCallbacks {
    public V i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14679j;
    public SparseArray<T> k;

    public nxe(@Nullable V v, int i, @NonNull SparseArray<T> sparseArray) {
        if (sparseArray == null) {
            throw new IllegalArgumentException("Processor: the params cannot be null!");
        }
        this.i = v;
        this.f14679j = i;
        this.k = sparseArray;
    }

    public int a() {
        return this.f14679j;
    }

    public boolean b() {
        return this.i != null;
    }

    public abstract void c(@Nullable V v, int i, SparseArray<T> sparseArray);

    public void d() {
        e(this.i);
    }

    public void e(V v) {
        if (v != null) {
            c(v, this.f14679j, this.k);
        } else {
            Log.e(getClass().getSimpleName(), "Processor: the parameter mView == null");
        }
    }

    public void f() {
        this.i = null;
        this.k.clear();
        this.k = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
