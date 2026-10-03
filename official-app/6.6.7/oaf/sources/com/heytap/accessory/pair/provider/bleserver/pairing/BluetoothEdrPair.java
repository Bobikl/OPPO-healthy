package com.heytap.accessory.pair.provider.bleserver.pairing;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class BluetoothEdrPair extends BluetoothPair {
    public BluetoothEdrPair(String str) {
        super(str);
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    public int getPairType() {
        return 1;
    }
}
