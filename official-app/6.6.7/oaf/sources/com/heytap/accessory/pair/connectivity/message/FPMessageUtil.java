package com.heytap.accessory.pair.connectivity.message;

import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.provider.PairServerFsm;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FPMessageUtil {
    private static final String TAG = "FPMessageUtil";

    public static class FPMessage {
        private byte[] mMessage;
        private int mMessageType;

        public static FPMessage parseMessage(byte[] bArr) {
            FPMessage fPMessage = new FPMessage();
            if (bArr == null || bArr.length == 0) {
                PairLog.w(FPMessageUtil.TAG, "parseMessage: message is null or empty");
                return null;
            }
            fPMessage.mMessage = bArr;
            fPMessage.mMessageType = bArr[0];
            return fPMessage;
        }

        public byte[] getMessage() {
            return this.mMessage;
        }

        public int getMessageType() {
            return this.mMessageType;
        }

        public void setMessage(byte[] bArr) {
            this.mMessage = bArr;
        }

        public void setMessageType(int i) {
            this.mMessageType = i;
        }
    }

    public static byte[] decryptProvider(byte[] bArr, ProtocolEventManager protocolEventManager) {
        if (bArr == null || bArr.length == 0) {
            PairLog.w(TAG, "decryptProvider: message is null or empty");
            return null;
        }
        PairServerFsm fsm = protocolEventManager.getFsm();
        if (fsm != PairServerFsm.IDLE && ((fsm != PairServerFsm.INITIALIZATION || !protocolEventManager.isMsgNotEncrypted()) && (fsm != PairServerFsm.KEY_BASED_PAIRING || !protocolEventManager.isMsgNotEncrypted()))) {
            return protocolEventManager.decrypt(bArr);
        }
        PairLog.w(TAG, "decryptProvider: current message doesn't need to decrypt: " + fsm);
        return bArr;
    }

    public static byte[] decryptSeeker(byte[] bArr, AbsWorker absWorker) {
        if (bArr == null || bArr.length == 0) {
            PairLog.w(TAG, "decryptSeeker: message is null or empty");
            return null;
        }
        FastPairSeekerFsm fsm = absWorker.getFsm();
        if (fsm != FastPairSeekerFsm.IDLE && fsm != FastPairSeekerFsm.INITIALIZATION && (fsm != FastPairSeekerFsm.KEY_BASED_PAIRING || !absWorker.isMsgNotEncrypted())) {
            return absWorker.decrypt(bArr);
        }
        PairLog.w(TAG, "decryptSeeker: current message doesn't need to decrypt: " + fsm);
        return bArr;
    }
}
