package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import com.oplus.wearable.linkservice.db.device.AESHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class uj5 {
    public static qj5 a(qj5 qj5Var) {
        if (qj5Var == null) {
            return null;
        }
        qj5Var.i(AESHelper.a(qj5Var.a()));
        String strA = AESHelper.a(qj5Var.e());
        if (strA == null) {
            strA = qj5Var.e();
        }
        qj5Var.m(strA);
        String strA2 = AESHelper.a(qj5Var.c());
        if (strA2 == null) {
            strA2 = qj5Var.c();
        }
        qj5Var.k(strA2);
        String strA3 = AESHelper.a(qj5Var.g());
        if (strA3 == null) {
            strA3 = qj5Var.g();
        }
        qj5Var.o(strA3);
        return qj5Var;
    }

    @Deprecated
    public static qj5 b(qj5 qj5Var) throws IllegalAccessException {
        if (qj5Var == null) {
            return null;
        }
        qj5Var.e();
        qj5Var.i(AESHelper.a(qj5Var.a()));
        String strC = qj5Var.c();
        if (strC == null || BluetoothAdapter.checkBluetoothAddress(strC)) {
            return qj5Var;
        }
        throw new IllegalAccessException();
    }

    public static qj5 c(qj5 qj5Var) {
        if (qj5Var == null) {
            return null;
        }
        qj5Var.i(AESHelper.c(qj5Var.a()));
        qj5Var.m(AESHelper.c(qj5Var.e()));
        qj5Var.k(AESHelper.c(qj5Var.c()));
        qj5Var.o(AESHelper.c(qj5Var.g()));
        return qj5Var;
    }
}
