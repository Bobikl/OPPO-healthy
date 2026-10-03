package com.heytap.accessory.pair.provider.bleserver.pairing;

/* JADX INFO: loaded from: classes14.dex */
public class BluetoothEdrPair extends BluetoothPair {
    public BluetoothEdrPair(String str) {
        super(str);
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    public int getPairType() {
        return 1;
    }
}
