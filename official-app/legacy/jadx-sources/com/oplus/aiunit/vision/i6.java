package com.oplus.aiunit.vision;

import com.badlogic.gdx.Input;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i6 implements Input {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12393l;
    public boolean m;
    public final bca k = new bca();
    public final boolean[] i = new boolean[256];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean[] f12392j = new boolean[256];

    public boolean f(int i) {
        return this.k.c(i);
    }

    public void g(int i, boolean z) {
        if (z) {
            this.k.a(i);
        } else {
            this.k.f(i);
        }
    }
}
