package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.heytap.accessory.authcode.AuthFailureException;
import com.heytap.accessory.authcode.IAuthentication;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes17.dex */
public class u3b implements IAuthentication {
    public static AtomicInteger a;

    public int a(Context context) {
        synchronized (u3b.class) {
            if (a == null) {
                try {
                    a = new AtomicInteger(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).uid);
                } catch (PackageManager.NameNotFoundException e2) {
                    wil.k("LocalAuthentication", "getUid: exception " + e2);
                }
            }
            AtomicInteger atomicInteger = a;
            if (atomicInteger != null) {
                return atomicInteger.intValue();
            }
            wil.k("LocalAuthentication", "getUid: null");
            return 0;
        }
    }

    @Override // com.heytap.accessory.authcode.IAuthentication
    public int check(Context context, int i, int i2, boolean z) {
        if (i == a(context)) {
            return 1001;
        }
        wil.k("LocalAuthentication", "check: failed uid=" + i + " pid=" + i2);
        return 1002;
    }

    @Override // com.heytap.accessory.authcode.IAuthentication
    public boolean checkPermission(Context context, int i, int i2, String str, boolean z) {
        if (i == a(context)) {
            return true;
        }
        wil.k("LocalAuthentication", "checkPermission: failed uid=" + i + " pid=" + i2);
        return false;
    }

    @Override // com.heytap.accessory.authcode.IAuthentication
    public boolean checkPermission(Context context, String str, String str2, boolean z) throws AuthFailureException {
        if (TextUtils.equals(context.getPackageName(), str)) {
            return true;
        }
        wil.k("LocalAuthentication", "getUid: packageName=" + str);
        return false;
    }
}
