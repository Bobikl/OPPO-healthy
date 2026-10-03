package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class mee implements fv9 {
    @Override // com.oplus.aiunit.vision.fv9
    public boolean a(Context context) {
        return context != null && context.checkCallingPermission("com.oplus.permission.safe.SECURITY") == 0;
    }
}
