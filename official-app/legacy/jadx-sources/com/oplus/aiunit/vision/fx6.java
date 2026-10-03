package com.oplus.aiunit.vision;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class fx6 {
    public static final int CHILD = 1;
    public static final int GROUP = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<fx6> f11549e = new ArrayList<>(5);
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11550c;
    public int d;

    public static fx6 a() {
        synchronized (f11549e) {
            if (f11549e.size() <= 0) {
                return new fx6();
            }
            fx6 fx6VarRemove = f11549e.remove(0);
            fx6VarRemove.d();
            return fx6VarRemove;
        }
    }

    public static fx6 b(int i, int i2, int i3, int i4) {
        fx6 fx6VarA = a();
        fx6VarA.d = i;
        fx6VarA.a = i2;
        fx6VarA.b = i3;
        fx6VarA.f11550c = i4;
        return fx6VarA;
    }

    public void c() {
        synchronized (f11549e) {
            if (f11549e.size() < 5) {
                f11549e.add(this);
            }
        }
    }

    public final void d() {
        this.a = 0;
        this.b = 0;
        this.f11550c = 0;
        this.d = 0;
    }
}
