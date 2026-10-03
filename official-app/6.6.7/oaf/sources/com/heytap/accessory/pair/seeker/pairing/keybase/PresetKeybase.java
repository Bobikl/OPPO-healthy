package com.heytap.accessory.pair.seeker.pairing.keybase;

import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.seeker.pairing.workers.ModelIDWorker;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.SystemUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PresetKeybase extends KeyBasedPairing {
    private static final String TAG = "PresetKeybase";
    public static final String TIMEOUT_KBP_AK_REQ = "1001_21";
    public static final String TIMEOUT_KBP_PRESET_REQ = "1001_02";
    private byte[] mCommonKey;

    public PresetKeybase(AbsWorker absWorker, String str, byte[] bArr, byte[] bArr2, int i) {
        super(absWorker, str, bArr2, i);
        this.mCommonKey = bArr;
    }

    private void prepareKeyBasedPairing() {
        String str;
        byte[] bArr = new byte[1];
        AbsWorker absWorker = this.mAbsWorker;
        if (absWorker instanceof ModelIDWorker) {
            bArr[0] = 2;
            str = "1001_02";
        } else {
            str = "";
        }
        byte[] bArrCombineByteArrays = SystemUtils.combineByteArrays(bArr, this.mCommonKey, this.mLocalDeviceId, absWorker.generateSalt(3));
        PairLog.d(TAG, "prepareKeyBasedPairing localDeviceId = " + SensitiveLogUtils.toHiddenIfNeed(this.mLocalDeviceId) + "commonValue: " + SensitiveLogUtils.toHiddenIfNeed(this.mCommonKey) + "rawData: " + SensitiveLogUtils.toHiddenIfNeed(bArrCombineByteArrays));
        this.mAbsWorker.getTimeOutMonitor().startTiming(2, str);
        AbsWorker absWorker2 = this.mAbsWorker;
        absWorker2.doKeyBasedPairing(absWorker2.generateSalt(16), bArrCombineByteArrays);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.keybase.KeyBasedPairing
    public void handleKeyBasedResponse(byte[] bArr) {
        if (bArr == null || bArr.length <= 16) {
            PairLog.e(TAG, "notifyKeyBasedPairing failed, data length err:" + HexUtils.byteArrayToHexStr(bArr));
            this.mAbsWorker.cancel(2010);
            return;
        }
        PairLog.d(TAG, "notifyKeyBasedPairing rawData" + ((int) bArr[0]));
        AbsWorker absWorker = this.mAbsWorker;
        if (!(absWorker instanceof ModelIDWorker) || bArr[0] == 3) {
            absWorker.onKeyBasedPairingFinished(bArr);
            return;
        }
        PairLog.e(TAG, "notifyKeyBasedPairing failed, msg type err:" + ((int) bArr[0]) + ", which should be 3");
        this.mAbsWorker.cancel(2010);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.keybase.KeyBasedPairing
    public void notifyKeyBasedPairing() {
        prepareKeyBasedPairing();
    }
}
