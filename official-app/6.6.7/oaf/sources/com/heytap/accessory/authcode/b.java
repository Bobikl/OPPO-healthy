package com.heytap.accessory.authcode;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b implements IAuthentication {
    @Override // com.heytap.accessory.authcode.IAuthentication
    public int check(Context context, int i, int i2, boolean z) {
        return 1001;
    }

    @Override // com.heytap.accessory.authcode.IAuthentication
    public boolean checkPermission(Context context, int i, int i2, String str, boolean z) {
        return true;
    }

    @Override // com.heytap.accessory.authcode.IAuthentication
    public boolean checkPermission(Context context, String str, String str2, boolean z) {
        return true;
    }
}
