package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class xvj {
    public Context a;
    public pee b;

    public xvj(Context context) {
        this.a = context;
        this.b = new pee(context);
    }

    public boolean a(String str) {
        if (this.a != null && !TextUtils.isEmpty(str) && this.b != null) {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid == null) {
                return false;
            }
            for (String str2 : packagesForUid) {
                if (this.b.g(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
