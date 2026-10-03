package com.heytap.accessory.pair.connectivity;

import com.heytap.accessory.pair.connectivity.ble.BleConnection;
import com.heytap.accessory.pair.connectivity.bt.BtRfConnection;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;

/* JADX INFO: loaded from: classes14.dex */
public class PairConnectionFactory {
    public static PairConnection getConnection(FPConParam fPConParam) {
        int i = fPConParam.mConnectivityType;
        if (i == 1) {
            return BleConnection.obtain(fPConParam);
        }
        if (i == 2) {
            return BtRfConnection.obtain(fPConParam);
        }
        return null;
    }
}
