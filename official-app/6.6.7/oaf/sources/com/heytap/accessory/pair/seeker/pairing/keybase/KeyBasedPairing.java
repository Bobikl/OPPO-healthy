package com.heytap.accessory.pair.seeker.pairing.keybase;

import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class KeyBasedPairing {
    public static final int KEY_BASED_PARING_TIMEOUT = 30000;
    AbsWorker mAbsWorker;
    int mConfirmTimeout;
    byte[] mLocalDeviceId;
    String mMacAddress;

    public KeyBasedPairing(AbsWorker absWorker, String str, byte[] bArr, int i) {
        this.mAbsWorker = absWorker;
        this.mMacAddress = str;
        if (i == 0) {
            this.mConfirmTimeout = 30000;
        } else {
            this.mConfirmTimeout = i;
        }
        this.mLocalDeviceId = bArr;
    }

    public abstract void handleKeyBasedResponse(byte[] bArr);

    public abstract void notifyKeyBasedPairing();
}
