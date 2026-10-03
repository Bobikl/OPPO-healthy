package com.oplus.statistics.util;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SystemUtil {
    public static boolean isSystemUser(@NonNull Context context) {
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        return userManager != null && userManager.isSystemUser();
    }
}
