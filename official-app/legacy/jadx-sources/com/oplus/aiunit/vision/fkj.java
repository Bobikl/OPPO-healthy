package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.wallet.location.LatLngEntity;
import com.heytap.health.wallet.location.LocationInfoEntity;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class fkj {
    public static final String ACTION_NFC_UPDATE_SMART_CARD_MANAGER = "com.nfc.action.UPDATE_MANAGER_IOT";
    public static final String ACTION_UPDATE_CARD_LOC = "com.nfc.action.UPDATE_CARD_LOC_IOT";
    public static final int CONFIG_TYPE_NOTIFY_SWIPE_EVENT = 3;
    public static final int CONFIG_TYPE_STATUS_SWITCH = 2;
    public static final int CONFIG_TYPE_USER_SWITCH = 1;
    public static final String PARAM_DEVICE_TYPE = "deviceType";
    public static final String PARAM_SWITCH_STATUS = "switchStatus";
    public static final String PARAM_TRANS_AMOUNT = "transAmount";
    public static final String PARAM_USER_SWITCH = "user_switch";

    public static class a {
        public static fkj a = new fkj();
    }

    public static fkj d() {
        return a.a;
    }

    public boolean c(Context context) {
        boolean zC = pqc.c(context);
        t6b.f("wallet.sysai.cllctor", "AutoSystemNfc supportSettingAddress  = " + zC);
        return zC;
    }

    public void g(final Context context, final String str, final String str2, final String str3, final Bundle bundle) {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.dkj
            @Override // java.lang.Runnable
            public final void run() {
                pqc.m(context, str, str2, str3, bundle);
            }
        });
    }

    public void h(final Context context, final String str) {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ekj
            @Override // java.lang.Runnable
            public final void run() {
                pqc.l(context, str);
            }
        });
    }

    public void i(String str, List<LocationInfoEntity> list) {
        t6b.i("wallet.sysai.cllctor", "updtlocs isBlank = " + e1j.k(str));
        if (e1j.k(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (LocationInfoEntity locationInfoEntity : list) {
                LatLngEntity latLngEntityB = qa8.b(locationInfoEntity.getLatitude(), locationInfoEntity.getLongitude());
                if (latLngEntityB != null) {
                    arrayList.add("[" + latLngEntityB.latitude + "," + latLngEntityB.longitude + "]");
                }
            }
        }
        Intent intent = new Intent(ACTION_UPDATE_CARD_LOC);
        intent.putExtra("aid", str);
        if (arrayList.isEmpty()) {
            t6b.i("wallet.sysai.cllctor", "nticelocs empty");
        } else {
            intent.putExtra("loc", new Gson().toJson(arrayList));
            t6b.i("wallet.sysai.cllctor", "nticelocs size = " + arrayList.size());
        }
        intent.setPackage("com.android.nfc");
        b78.a().sendBroadcast(intent);
    }

    public final void j(int i, int i2, String str, int i3) {
        t6b.i("wallet.sysai.cllctor", "SystemNfcSwitcher:updateNfcSwitchConfig switchStatus=" + i2 + ",configType=" + i);
        Intent intent = new Intent(ACTION_NFC_UPDATE_SMART_CARD_MANAGER);
        if (i == 1) {
            intent.putExtra(PARAM_USER_SWITCH, true);
            t6b.i("wallet.sysai.cllctor", "userSelCard suc ");
        } else if (i == 2) {
            intent.putExtra(PARAM_SWITCH_STATUS, i2);
            intent.putExtra("deviceType", DeviceInfoCompat.DeviceType.WATCH);
        } else if (i == 3) {
            intent.putExtra("aid", str);
            intent.putExtra(PARAM_TRANS_AMOUNT, i3);
        }
        intent.setPackage("com.android.nfc");
        b78.a().sendBroadcast(intent);
    }

    public void k(int i) {
        j(2, i, null, -1);
    }
}
