package com.heytap.accessory.pair.connectivity.param;

import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.bt.BtConstants;
import com.heytap.accessory.pair.connectivity.param.connect.FPBleConParam;
import com.heytap.accessory.pair.connectivity.param.connect.FPBtConParam;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.connectivity.param.connect.FPWifiConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPBleMessageParam;
import com.heytap.accessory.pair.connectivity.param.message.FPBtMessageParam;
import com.heytap.accessory.pair.connectivity.param.message.FPMessageParam;
import com.heytap.accessory.pair.connectivity.param.message.FPWifiMessageParam;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class FPParamFactory {
    public static FPMessageParam obtain(String str, int i, UUID uuid) {
        if (i == 1) {
            FPBleMessageParam fPBleMessageParam = new FPBleMessageParam(str);
            fPBleMessageParam.mService = CoreConstants.UUID_SERVICE_FAST_PAIR;
            fPBleMessageParam.mCharacter = uuid;
            return fPBleMessageParam;
        }
        if (i == 4) {
            return new FPWifiMessageParam(str);
        }
        if (i == 2) {
            return new FPBtMessageParam(str);
        }
        return null;
    }

    public static FPConParam obtain(String str, int i) {
        if (i == 1) {
            return new FPBleConParam(str);
        }
        if (i == 2) {
            return new FPBtConParam(str, BtConstants.FP_BT_UUID);
        }
        if (i == 4) {
            return new FPWifiConParam(str);
        }
        return null;
    }
}
