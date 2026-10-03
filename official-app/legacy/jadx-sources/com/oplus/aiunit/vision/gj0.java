package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gj0 implements Cloneable {
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11780j = 1;
    public int k = -1;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gj0 clone() {
        try {
            return (gj0) super.clone();
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract t22 c(rpj rpjVar);

    public int d() {
        return this.i;
    }

    public int e() {
        return this.i;
    }
}
