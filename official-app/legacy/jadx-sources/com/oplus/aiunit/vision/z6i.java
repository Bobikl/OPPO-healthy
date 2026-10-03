package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.splitdownload.IProvider;

/* JADX INFO: loaded from: classes8.dex */
public class z6i {
    public IProvider a;
    public boolean b = false;

    public static class a {
        public static final z6i a = new z6i();
    }

    public static z6i b() {
        return a.a;
    }

    public IProvider a() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public void d(IProvider iProvider) {
        this.a = iProvider;
    }

    public void e(boolean z) {
        this.b = z;
    }
}
