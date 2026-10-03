package com.oplus.aiunit.vision;

import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes2.dex */
public class exa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Pools.SimplePool<exa> f11116c = new Pools.SimplePool<>(50);
    public float a;
    public String b;

    public exa(float f, String str) {
        this.a = f;
        this.b = str;
    }

    public void a() {
        f11116c.release(this);
    }
}
