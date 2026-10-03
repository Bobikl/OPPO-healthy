package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.storage.db.AcOpenCipherDataBase;

/* JADX INFO: loaded from: classes6.dex */
public class ae {
    public static String a = "ae";

    public static void a(Context context, Throwable th) {
        boolean zC = c(th);
        AcLogUtil.i(a, "Account DB has crash,remove database and restart", true);
        AcLogUtil.i(a, "deleteDbWhenSqlcipherCompileError() called with: isSqlcipherCompileError = " + zC);
        if (zC) {
            context.deleteDatabase(AcOpenCipherDataBase.DATABASE_NAME);
            throw new IllegalStateException("Account DB has crash,remove database and restart");
        }
    }

    public static boolean b(Throwable th, String str) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (String.valueOf(stackTraceElement).contains(str)) {
                return true;
            }
        }
        return message != null && message.contains(str);
    }

    public static boolean c(Throwable th) {
        AcLogUtil.d(a, "isSqlcipherCompileError: e=" + th);
        return b(th, "com.platform.usercenter.account.sdk.open") && (b(th, "file is not a database: , while compiling") || b(th, "database disk image is malformed") || b(th, "while compiling: SELECT *") || b(th, "while computing database live data"));
    }
}
