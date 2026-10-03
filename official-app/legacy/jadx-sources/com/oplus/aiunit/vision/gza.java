package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public class gza extends ej2 {
    public gza y;
    public gza z;

    public gza(Context context, int i, gza gzaVar) {
        super(context, i);
        this.y = null;
        this.z = null;
        if (gzaVar == null) {
            this.y = new gza(context, i, this);
        } else {
            this.z = gzaVar;
        }
        C(false);
        y(false);
    }

    public gza J() {
        return this.y;
    }

    public final void K() {
        super.a();
    }

    public final void L() {
        super.f();
    }

    @Override // com.oplus.aiunit.vision.wmi, com.oplus.aiunit.vision.c56
    public void a() {
        gza gzaVar = this.y;
        if (gzaVar != null) {
            gzaVar.K();
        }
        gza gzaVar2 = this.z;
        if (gzaVar2 != null) {
            gzaVar2.K();
        }
        K();
    }

    @Override // com.oplus.aiunit.vision.wmi, com.oplus.aiunit.vision.c56
    public void f() {
        gza gzaVar = this.y;
        if (gzaVar != null) {
            gzaVar.L();
        }
        gza gzaVar2 = this.z;
        if (gzaVar2 != null) {
            gzaVar2.L();
        }
        L();
    }
}
