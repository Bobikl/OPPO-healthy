package com.heytap.health.persistent.oplus;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.persistent.IOPlusPersistent;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.u3d;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/persistent/helper")
public class OPlusPersistentHelper implements IOPlusPersistent {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f5277j;

    @Override // com.heytap.health.base.persistent.IOPlusPersistent
    public void M0() {
        if (this.i) {
            Context context = this.f5277j;
            u3d.e(context, context.getPackageName(), 0);
        }
    }

    @Override // com.heytap.health.base.persistent.IOPlusPersistent
    public boolean g9() {
        return this.i;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        this.f5277j = context.getApplicationContext();
        this.i = ilj.B() && u3d.d(this.f5277j);
    }

    @Override // com.heytap.health.base.persistent.IOPlusPersistent
    public void ka() {
        if (this.i) {
            Context context = this.f5277j;
            u3d.e(context, context.getPackageName(), 1);
        }
    }
}
