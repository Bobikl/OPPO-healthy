package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.UserManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.shield.authcode.dao.AuthenticationDb;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class ym0 {
    public static nm0 b(Context context, String str, String str2) {
        if (!e(context)) {
            i1e.b("Not get data from db cause user is locked.");
            return null;
        }
        dn0 dn0VarA = AuthenticationDb.e(context).d().a(g3e.d(context, str), str, n04.APP_PLATFORM_DB_SHEET_NAME, str2);
        if (dn0VarA != null) {
            return new nm0(str, 1001, dn0VarA.h());
        }
        return null;
    }

    @NonNull
    public static nm0 c(Context context, String str) {
        int iD = g3e.d(context, str);
        if (TextUtils.isEmpty(str)) {
            i1e.c("Get target packageName is empty");
            return new nm0("", 1004, new byte[0]);
        }
        String strB = g3e.b(context, str);
        if (TextUtils.isEmpty(strB)) {
            i1e.c("Get target application authCode is empty");
            return new nm0("", 1004, new byte[0]);
        }
        try {
            Iterator<String> it = glj.c(strB, ";").iterator();
            while (it.hasNext()) {
                byte[][] bArrD = d(str, it.next(), context);
                if (bArrD[0][0] == 1) {
                    byte[] bArr = bArrD[1];
                    g(context, strB, str, iD, nzj.a(bArrD[2]), bArr);
                    i1e.d("Auth code check ok");
                    return new nm0(str, 1001, bArr);
                }
            }
            i1e.c("Signature verify failed, package : " + str);
            return new nm0(str, 1002, new byte[0]);
        } catch (Exception e2) {
            i1e.c("Check key get exception " + e2.getMessage());
            return new nm0(str, 1002, new byte[0]);
        }
    }

    public static byte[][] d(String str, String str2, Context context) {
        byte[][] bArr = {new byte[]{0}};
        try {
            byte[] bArrA = uy0.a(str2);
            byte[] bArrE = d8e.e(bArrA);
            byte[] bArr2 = {8};
            int iB = glj.b(d8e.d(bArrA));
            byte[] bArrC = d8e.c(bArrA, iB);
            byte[] bArrB = d8e.b(bArrA, iB);
            if (v2h.c(context, str, bArrE, iB, bArr2, bArrB, bArrC, d8e.a(bArrA, iB))) {
                return new byte[][]{new byte[]{1}, bArrC, bArrB};
            }
            i1e.d("Signature verify failed.");
            return bArr;
        } catch (Exception e2) {
            i1e.c("Check key get exception " + e2.getMessage());
            return bArr;
        }
    }

    public static boolean e(Context context) {
        if (context != null) {
            return ((UserManager) context.getSystemService("user")).isUserUnlocked();
        }
        return false;
    }

    public static /* synthetic */ void f(String str, int i, String str2, Calendar calendar, byte[] bArr, Context context) {
        AuthenticationDb.e(context).d().b(new dn0(str, true, i, str2, n04.APP_PLATFORM_DB_SHEET_NAME, calendar.getTimeInMillis(), bArr, System.currentTimeMillis(), 0L));
    }

    public static void g(final Context context, final String str, final String str2, final int i, final Calendar calendar, final byte[] bArr) {
        if (!e(context)) {
            i1e.b("Not save to db cause user is locked.");
        } else {
            if (str2 == null) {
                return;
            }
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.oplus.aiunit.vision.vm0
                @Override // java.lang.Runnable
                public final void run() {
                    ym0.f(str, i, str2, calendar, bArr, context);
                }
            });
        }
    }
}
