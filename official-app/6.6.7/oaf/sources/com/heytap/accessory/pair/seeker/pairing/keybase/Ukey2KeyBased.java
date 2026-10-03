package com.heytap.accessory.pair.seeker.pairing.keybase;

import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.ukey2.Ukey2Client;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.SystemUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class Ukey2KeyBased extends KeyBasedPairing implements Ukey2Client.Ukey2ClientCallback {
    private static final String TAG = "Ukey2KeyBased";
    public static final String TIMEOUT_KBP_UKEY2_CF = "1001_12";
    public static final String TIMEOUT_KBP_UKEY2_CI = "1001_10";
    private boolean mServerInited;
    private Ukey2Client mUkey2Client;

    public Ukey2KeyBased(AbsWorker absWorker, String str, byte[] bArr, int i) {
        super(absWorker, str, bArr, i);
        Ukey2Client ukey2Client = Ukey2Client.getInstance();
        this.mUkey2Client = ukey2Client;
        ukey2Client.setUkey2ClientCallback(this);
        this.mServerInited = false;
    }

    private void writeUkey2ClientInit() {
        byte[] bArrPrepareClientInit = this.mUkey2Client.prepareClientInit();
        if (bArrPrepareClientInit == null) {
            PairLog.w(TAG, "writeUkey2ClientInit prepareClientInit rtn null");
            return;
        }
        byte[] bArr = new byte[bArrPrepareClientInit.length + 1];
        bArr[0] = 16;
        SystemUtils.arraycopy(bArrPrepareClientInit, 0, bArr, 1, bArrPrepareClientInit.length);
        PairLog.d(TAG, "writeUkey2ClientInit message to remote:" + HexUtils.byteArrayToHexStr(bArr));
        this.mAbsWorker.getTimeOutMonitor().startTiming(1, TIMEOUT_KBP_UKEY2_CI);
        ConnectionManager.getInstance().sendMessage(bArr, FPParamFactory.obtain(this.mMacAddress, this.mAbsWorker.getConnectivityFlag(), CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.keybase.KeyBasedPairing
    public void handleKeyBasedResponse(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            PairLog.d(TAG, "notifyKeyBasedPairing failed, data err1");
            this.mAbsWorker.cancel(2010);
            return;
        }
        if (this.mServerInited) {
            if (bArr[0] == 19) {
                PairLog.d(TAG, "receive ukey2 serverFinished msg");
                this.mAbsWorker.onKeyBasedPairingFinished(bArr);
                return;
            }
        } else if (bArr[0] == 17) {
            this.mServerInited = true;
            PairLog.d(TAG, "receive ukey2 serverInit msg");
            this.mUkey2Client.afterServerInit(Arrays.copyOfRange(bArr, 1, bArr.length));
            return;
        }
        PairLog.d(TAG, "notifyKeyBasedPairing failed, data err2");
        this.mAbsWorker.cancel(2010);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.keybase.KeyBasedPairing
    public void notifyKeyBasedPairing() {
        writeUkey2ClientInit();
    }

    @Override // com.heytap.accessory.pair.ukey2.Ukey2Client.Ukey2ClientCallback
    public void onClientFinished(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.mAbsWorker.onAuthStrAndSecretKey(bArr2, bArr3, bArr4);
        writeKeyBasedFinished(bArr);
    }

    public void writeKeyBasedFinished(byte[] bArr) {
        byte[] bArrCombineByteArrays = SystemUtils.combineByteArrays(this.mLocalDeviceId, this.mAbsWorker.generateSalt(10));
        byte[] bArrEncrypt = this.mAbsWorker.encrypt(bArrCombineByteArrays);
        byte[] bArrCombineByteArrays2 = SystemUtils.combineByteArrays(new byte[]{18}, bArrEncrypt, bArr);
        PairLog.d(TAG, "prepareKeyBasedPairing, localdeviceid: " + SensitiveLogUtils.toHiddenIfNeed(this.mLocalDeviceId) + "; prepareKeyBasedPairing, rawData: " + SensitiveLogUtils.toHiddenIfNeed(bArrCombineByteArrays) + "; prepareKeyBasedPairing, encData: " + SensitiveLogUtils.toHiddenIfNeed(bArrEncrypt) + "; prepareKeyBasedPairing, sendData: " + SensitiveLogUtils.toHiddenIfNeed(bArrCombineByteArrays2));
        this.mAbsWorker.getTimeOutMonitor().startTiming(2, TIMEOUT_KBP_UKEY2_CF);
        ConnectionManager.getInstance().sendMessage(bArrCombineByteArrays2, FPParamFactory.obtain(this.mMacAddress, this.mAbsWorker.getConnectivityFlag(), CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
    }
}
