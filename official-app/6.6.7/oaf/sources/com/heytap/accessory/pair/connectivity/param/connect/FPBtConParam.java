package com.heytap.accessory.pair.connectivity.param.connect;

import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FPBtConParam extends FPConParam {
    public UUID mUUID;

    public FPBtConParam(String str) {
        super(str, 2);
    }

    public FPBtConParam(String str, UUID uuid) {
        super(str, 2);
        this.mUUID = uuid;
    }
}
