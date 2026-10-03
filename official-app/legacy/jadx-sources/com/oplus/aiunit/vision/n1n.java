package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Vector;

/* JADX INFO: loaded from: classes12.dex */
public final class n1n {
    public static int d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f14297e = 10000;
    public Vector<k1n> a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14298c;

    public n1n() {
        this.f14298c = 0;
        this.b = 10;
        this.a = new Vector<>();
    }

    public final Vector<k1n> a() {
        return this.a;
    }

    public final synchronized void b(k1n k1nVar) {
        if (k1nVar != null) {
            if (!TextUtils.isEmpty(k1nVar.g())) {
                this.a.add(k1nVar);
                this.f14298c += k1nVar.g().getBytes().length;
            }
        }
    }

    public final synchronized boolean c(String str) {
        if (str == null) {
            return false;
        }
        if (this.a.size() >= this.b) {
            return true;
        }
        return this.f14298c + str.getBytes().length > f14297e;
    }

    public final synchronized void d() {
        this.a.clear();
        this.f14298c = 0;
    }

    public n1n(byte b) {
        this.b = d;
        this.f14298c = 0;
        this.a = new Vector<>();
    }
}
