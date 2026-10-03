package com.heytap.accessory.authcode;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public interface IAuthentication {
    int check(Context context, int i, int i2, boolean z);

    boolean checkPermission(Context context, int i, int i2, String str, boolean z);

    boolean checkPermission(Context context, String str, String str2, boolean z) throws AuthFailureException;
}
