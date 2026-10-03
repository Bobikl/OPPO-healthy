package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import com.oplus.wearable.linkservice.db.device.AESHelper;

/* JADX INFO: loaded from: classes5.dex */
public class yi5 {
    public static ui5 a(ui5 ui5Var) {
        if (ui5Var == null) {
            return null;
        }
        ui5Var.i(AESHelper.a(ui5Var.a()));
        String strA = AESHelper.a(ui5Var.e());
        if (strA == null) {
            strA = ui5Var.e();
        }
        ui5Var.m(strA);
        String strA2 = AESHelper.a(ui5Var.c());
        if (strA2 == null) {
            strA2 = ui5Var.c();
        }
        ui5Var.k(strA2);
        String strA3 = AESHelper.a(ui5Var.g());
        if (strA3 == null) {
            strA3 = ui5Var.g();
        }
        ui5Var.o(strA3);
        return ui5Var;
    }

    @Deprecated
    public static ui5 b(ui5 ui5Var) throws IllegalAccessException {
        if (ui5Var == null) {
            return null;
        }
        ui5Var.e();
        ui5Var.i(AESHelper.a(ui5Var.a()));
        String strC = ui5Var.c();
        if (strC == null || BluetoothAdapter.checkBluetoothAddress(strC)) {
            return ui5Var;
        }
        throw new IllegalAccessException();
    }

    public static ui5 c(ui5 ui5Var) {
        if (ui5Var == null) {
            return null;
        }
        ui5Var.i(AESHelper.c(ui5Var.a()));
        ui5Var.m(AESHelper.c(ui5Var.e()));
        ui5Var.k(AESHelper.c(ui5Var.c()));
        ui5Var.o(AESHelper.c(ui5Var.g()));
        return ui5Var;
    }
}
