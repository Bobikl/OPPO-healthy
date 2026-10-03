package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class or3 implements fv9 {
    @Override // com.oplus.aiunit.vision.fv9
    public boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (gvk.a()) {
            return new mee().a(context);
        }
        return context.checkCallingPermission("com.oppo.permission.safe.SECURITY") == 0;
    }
}
