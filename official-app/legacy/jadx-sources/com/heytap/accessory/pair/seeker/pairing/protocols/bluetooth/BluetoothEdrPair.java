package com.heytap.accessory.pair.seeker.pairing.protocols.bluetooth;

import com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;

/* JADX INFO: loaded from: classes14.dex */
public class BluetoothEdrPair extends BluetoothPair {
    public BluetoothEdrPair(String str, AbsWorker absWorker, AbsPairProtocol.CallBack callBack) {
        super(str, absWorker, callBack);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol
    public int getPairType() {
        return 1;
    }
}
