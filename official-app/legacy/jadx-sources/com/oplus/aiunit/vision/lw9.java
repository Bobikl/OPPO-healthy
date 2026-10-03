package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.heytap.health.adaptersdk.IResult;

/* JADX INFO: loaded from: classes15.dex */
public class lw9 {
    public static void a(IResult iResult, boolean z, int i, String str) {
        if (iResult != null) {
            try {
                iResult.onResult(z, i, str);
            } catch (RemoteException e2) {
                wil.b("IResultCall", "callIResult: ex " + e2);
            }
        }
    }
}
