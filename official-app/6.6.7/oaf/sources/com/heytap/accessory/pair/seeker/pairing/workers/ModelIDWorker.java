package com.heytap.accessory.pair.seeker.pairing.workers;

import com.heytap.accessory.pair.seeker.device.BaseDevice;
import com.heytap.accessory.pair.utils.SecurityUtils;
import com.heytap.accessory.pair.utils.SystemUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ModelIDWorker extends AbsWorker {
    private static final int MTU_MODEL_ID = 83;

    public ModelIDWorker(BaseDevice baseDevice, int i) {
        super(baseDevice, i);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker
    public void doKeyBasedPairing(byte[] bArr, byte[] bArr2) {
        this.mIvParameterSpec = SecurityUtils.getIVSpec(bArr);
        byte[] bArr3 = new byte[96];
        SystemUtils.arraycopy(encrypt(bArr2), 0, bArr3, 0, 16);
        SystemUtils.arraycopy(bArr, 0, bArr3, 16, 16);
        SystemUtils.arraycopy(this.mSeekerPubKey, 0, bArr3, 32, 64);
        writeKeyBasedPairingFinish(bArr3);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker
    public void generateKeys() {
    }
}
