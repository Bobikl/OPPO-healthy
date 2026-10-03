package com.omron;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.omron.lib.OMRONLib;
import com.omron.lib.common.OMRONBLEErrMsg;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ao {
    public static Pair<OMRONBLEErrMsg, aq> a(@NonNull Context context, aq aqVar, int i) {
        return a(context, aqVar, i, "");
    }

    public static Pair<OMRONBLEErrMsg, aq> a(@NonNull Context context, aq aqVar, int i, String str) {
        OMRONBLEErrMsg oMRONBLEErrMsg;
        if (aqVar == null) {
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_NOT_SUPPORT;
        } else if (aqVar.b() != i) {
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_CATEGORY_NOT_SUPPORT;
        } else if (!OMRONLib.getInstance().isBluetoothOn()) {
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth;
        } else {
            if (TextUtils.isEmpty(str) || BluetoothAdapter.checkBluetoothAddress(str)) {
                return Pair.create(null, aqVar);
            }
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_SDK_INVALID_DEVICE_ADDRESS;
        }
        return Pair.create(oMRONBLEErrMsg, null);
    }

    public static aq a(@NonNull List<aq> list, @NonNull String str) {
        if (list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (aq aqVar : list) {
            if (str.toLowerCase().startsWith(aqVar.a().toLowerCase())) {
                return aqVar;
            }
        }
        return null;
    }
}
