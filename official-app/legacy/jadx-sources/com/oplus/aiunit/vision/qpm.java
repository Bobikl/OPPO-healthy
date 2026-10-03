package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class qpm extends dcm {
    public qpm(fim fimVar) {
        super(fimVar);
    }

    @Override // com.oplus.aiunit.vision.x7f.c
    public void a(Context context) {
        if (this.d == null) {
            this.d = new HashMap(1);
        }
        z0n.i(context, this.f, this.a, this.b, this.f10508c, this.d, this.f10509e);
    }

    @Override // com.oplus.aiunit.vision.x7f.c
    public void b(Context context) {
        if (this.d == null) {
            this.d = new HashMap(1);
        }
        z0n.t(context, this.f, this.a, this.b, this.f10508c, this.d, this.f10509e);
    }
}
