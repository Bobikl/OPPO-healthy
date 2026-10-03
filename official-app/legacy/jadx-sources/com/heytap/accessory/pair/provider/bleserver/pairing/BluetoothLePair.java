package com.heytap.accessory.pair.provider.bleserver.pairing;

/* JADX INFO: loaded from: classes14.dex */
public class BluetoothLePair extends BluetoothPair {
    public BluetoothLePair(String str) {
        super(str);
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    public int getPairType() {
        return 3;
    }
}
