package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public abstract class eym {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11132c = 100;
    public static final int d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11133e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f11134j = 5;
    public static final String k = "ProcessSplitInfo";
    public Context a;
    public eym b;

    public static eym a(eym eymVar, eym... eymVarArr) {
        int length = eymVarArr.length;
        int i2 = 0;
        eym eymVar2 = eymVar;
        while (i2 < length) {
            eym eymVar3 = eymVarArr[i2];
            eymVar2.b = eymVar3;
            i2++;
            eymVar2 = eymVar3;
        }
        return eymVar;
    }

    public v5n b(int i2, int i3, String str, v5n v5nVar) {
        v5n v5nVar2 = new v5n(v5nVar.j());
        v5nVar2.i = i2;
        v5nVar2.k = i3;
        v5nVar2.f17726j = str;
        v5nVar2.f17728n = v5nVar;
        w7i.e(k, "newVersionInfo: " + v5nVar2.toString(), new Object[0]);
        return v5nVar2;
    }

    public abstract v5n c(v5n v5nVar);

    public void d(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public boolean e(int i2, int i3) {
        boolean z;
        int i4 = i2 / 100;
        if (i3 >= i4 * 100) {
            z = i3 < (i4 + 1) * 100;
        }
        if (!z) {
            w7i.e(k, "split version code not match base version code", new Object[0]);
        }
        return z;
    }

    public v5n f(v5n v5nVar) {
        eym eymVar = this.b;
        return eymVar == null ? v5nVar : eymVar.c(v5nVar);
    }
}
