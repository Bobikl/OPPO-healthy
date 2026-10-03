package com.platform.usercenter.account.mba;

import android.content.Context;
import com.platform.usercenter.account.mba.entity.RecoverParam;
import com.platform.usercenter.account.mba.recovery.RecoveryManager;

/* JADX INFO: loaded from: classes9.dex */
public class MbaAgent {
    public static boolean isPkgUninstall(Context context, String str) {
        return RecoveryManager.isPkgUninstall(context, str);
    }

    public static boolean isRecoverLink(String str) {
        return RecoveryManager.isRecoverLink(str);
    }

    public static void recover(Context context, RecoverParam recoverParam, IResultCallback iResultCallback) {
        RecoveryManager.getInstance().recover(context, recoverParam, iResultCallback);
    }
}
