package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes16.dex */
public class zz0 {
    public zz0 b;
    public transient int a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MutableLiveData<Integer> f19603c = new MutableLiveData<>();

    public void a() {
        zz0 zz0Var = this.b;
        if (zz0Var != null) {
            zz0Var.d(this.a);
            this.b.a();
        }
    }

    public int b() {
        return this.a;
    }

    public MutableLiveData<Integer> c() {
        return this.f19603c;
    }

    public void d(int i) {
        this.a = i;
        this.f19603c.postValue(Integer.valueOf(i));
    }

    public void e(zz0 zz0Var) {
        this.b = zz0Var;
    }
}
