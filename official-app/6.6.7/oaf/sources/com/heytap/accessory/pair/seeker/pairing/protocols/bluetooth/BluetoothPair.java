package com.heytap.accessory.pair.seeker.pairing.protocols.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.heytap.accessory.pair.apiadapter.BluetoothNative;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.SystemUtils;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class BluetoothPair extends AbsPairProtocol {
    private static final int DATA_LENGTH = 16;
    private static final int PASSKEY_HEX_0000FF = 255;
    private static final int PASSKEY_HEX_00FF00 = 65280;
    private static final int PASSKEY_HEX_FF0000 = 16711680;
    private static final int PASSKEY_LENGTH = 3;
    private static final int PASSKEY_OFFSET_16 = 16;
    private static final int PASSKEY_OFFSET_8 = 8;
    private static final String TAG = "BluetoothPair";
    public static final String TIMEOUT_CREATE_BOND = "CRT_BOND";
    public static final String TIMEOUT_SEEKER_PASSKEY = "1101_06";
    private String mMac;
    private int mPairKey;

    public BluetoothPair(String str, AbsWorker absWorker, AbsPairProtocol.CallBack callBack) {
        super(absWorker, callBack);
        this.mMac = str;
    }

    private boolean checkIfSystemBonded() {
        Set<BluetoothDevice> bondedDevices;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (bondedDevices = defaultAdapter.getBondedDevices()) == null) {
            return false;
        }
        Iterator<BluetoothDevice> it = bondedDevices.iterator();
        while (it.hasNext()) {
            if (it.next().getAddress().equals(this.mMac)) {
                PairLog.d(TAG, "checkIfBonded, device bonded");
                return true;
            }
        }
        return false;
    }

    private void createBond(String str) {
        PairLog.d(TAG, "start startBond");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
            PairLog.d(TAG, "current bonded state=" + remoteDevice.getBondState());
            if (remoteDevice.getBondState() == 11) {
                BluetoothNative.getInstance().cancelBondProcess(remoteDevice);
            }
        }
        this.mWorker.getTimeOutMonitor().startTiming(1, TIMEOUT_CREATE_BOND);
    }

    private void notifyPassKey() {
        writePassKey();
    }

    private void unNotifyPassKey() {
    }

    private void writePassKey() {
        int i = this.mPairKey;
        if (i == 0) {
            PairLog.e(TAG, "writePassKey failed, pairKey is 0, quit");
            end(2009);
            return;
        }
        byte[] bArr = new byte[16];
        bArr[0] = 6;
        bArr[1] = (byte) ((PASSKEY_HEX_FF0000 & i) >> 16);
        bArr[2] = (byte) ((65280 & i) >> 8);
        bArr[3] = (byte) (i & 255);
        SystemUtils.arraycopy(this.mWorker.generateSalt(12), 0, bArr, 4, 12);
        PairLog.d(TAG, "writePassKey ");
        byte[] bArrEncrypt = this.mWorker.encrypt(bArr);
        this.mWorker.getTimeOutMonitor().startTiming(1, TIMEOUT_SEEKER_PASSKEY);
        ConnectionManager.getInstance().sendMessage(bArrEncrypt, FPParamFactory.obtain(this.mProviderBleMac, this.mWorker.getConnectivityFlag(), CoreConstants.UUID_CHARACTERISTIC_BLUETOOTH_BOND));
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol
    public void end(int i) {
        unNotifyPassKey();
        super.end(i);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol
    public byte[] getMacAddress() {
        return HexUtils.hexStrToByteArray(this.mMac);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol
    public String getPairedAddress() {
        return this.mMac;
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol
    public void handlePairingResponse(byte[] bArr) {
        if (bArr == null || bArr.length != 16 || bArr[0] != 7) {
            PairLog.d(TAG, "notifyPassKey failed, data err");
            end(2010);
        } else if (((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255) == this.mPairKey) {
            end(2001);
        } else {
            PairLog.e(TAG, "notifyPassKey failed, pairResult not equal");
            end(2013);
        }
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol
    public void start() {
        if (checkIfSystemBonded()) {
            end(2001);
        } else {
            createBond(this.mMac);
        }
    }
}
