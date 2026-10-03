package com.heytap.accessory.pair.provider;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.apiadapter.BluetoothNative;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.common.TimeOutMonitor;
import com.heytap.accessory.pair.common.ksc.KscException;
import com.heytap.accessory.pair.common.ksc.KscManager;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.message.FPMessageUtil;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection;
import com.heytap.accessory.pair.provider.bleserver.pairing.BluetoothEdrPair;
import com.heytap.accessory.pair.provider.bleserver.pairing.BluetoothLePair;
import com.heytap.accessory.pair.ukey2.Ukey2Server;
import com.heytap.accessory.pair.utils.ByteUtils;
import com.heytap.accessory.pair.utils.FalseCountUtils;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.SaltCheckUtils;
import com.heytap.accessory.pair.utils.SecurityUtils;
import com.heytap.accessory.pair.utils.SystemUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class ProtocolEventManager implements TimeOutMonitor.Callback {
    private static final int EIGHT_BYTE_SIZE = 64;
    private static final int ERROR_AUTHENTICATION_FAILED = 1;
    private static final int ERROR_DEVICE = 2;
    public static final int ERROR_NONE = 0;
    private static final int ERROR_PAIR_CONNECT_FAILED = 3;
    private static final byte FILL_BYTE = 0;
    private static final int FOUR_BYTE_SIZE = 32;
    private static final int INDEX_1 = 1;
    private static final int INDEX_2 = 2;
    private static final int INDEX_3 = 3;
    private static final int INDEX_4 = 4;
    private static final int INDEX_7 = 7;
    private static final int MAC_LENGTH = 6;
    private static final int MAX_CONFIRM_TIMEOUT = 65535;
    public static final int PAIR_MAJOR_TYPE_BT = 1;
    private static final int SALT_LENGTH = 9;
    private static final int SALT_LENGTH_KEY_BASED_PAIRING = 6;
    private static final int SEED_LENGTH = 20;
    public static final String TAG = "ProtocolEventManager";
    public static final String TIMEOUT_AUTH_RSP = "1002_05";
    public static final String TIMEOUT_INIT_RSP = "0001_01";
    public static final String TIMEOUT_KBP_AK_RSP = "1001_22";
    public static final String TIMEOUT_KBP_PRESET_RSP = "1001_02";
    public static final String TIMEOUT_KBP_UKEY2_SF = "1001_13";
    public static final String TIMEOUT_KBP_UKEY2_SI = "1001_11";
    private static final int TWELVE_BYTE_SIZE = 96;
    private static final int TWO_BYTE_SIZE = 16;
    private byte mAdvType;
    private int mConnectivityFlag;
    private IvParameterSpec mIvParameterSpec;
    private byte mKeyType;
    private int mPairMode;
    private byte[] mPresetKeyBasedPairingCache;
    private ProtocolEventListener mProtocolEventListener;
    private SecretKeySpec mSecretKeySpec;
    private int mSeekerMajorVersion;
    private int mSeekerMinorVersion;
    private TimeOutMonitor mTom;
    private Map<Integer, String> mTypeToAliasMap;
    private boolean mIsNeedToAuth = false;
    private List<AbsConnection> mAbsConnectionList = new ArrayList(3);
    private PairServerFsm mProviderFsm = PairServerFsm.IDLE;
    private Ukey2Server mUkey2Server = Ukey2Server.getInstance();
    private Ukey2Server.Ukey2ServerCallback mUkey2Callback = new Ukey2Server.Ukey2ServerCallback() { // from class: com.heytap.accessory.pair.provider.ProtocolEventManager.1
        @Override // com.heytap.accessory.pair.ukey2.Ukey2Server.Ukey2ServerCallback
        public void afterServerInit(byte[] bArr) {
            byte[] bArr2 = new byte[bArr.length + 1];
            bArr2[0] = 17;
            SystemUtils.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            ProtocolEventManager.this.mTom.startTiming(3, ProtocolEventManager.TIMEOUT_KBP_UKEY2_SI);
            ConnectionManager.getInstance().sendMessage(bArr2, FPParamFactory.obtain(ProtocolEventManager.this.mCurrentDevice.getBluetoothDevice().getAddress(), ProtocolEventManager.this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
        }

        @Override // com.heytap.accessory.pair.ukey2.Ukey2Server.Ukey2ServerCallback
        public void onAuthStrAndKeyGet(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            PairLog.d(ProtocolEventManager.TAG, "get ukey2 secretKey(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArr) + "; iv = " + SensitiveLogUtils.toHiddenIfNeed(bArr2));
            ProtocolEventManager.this.mIvParameterSpec = SecurityUtils.getIVSpec(bArr2);
            ProtocolEventManager.this.mSecretKeySpec = SecurityUtils.getAESKeySpec(bArr);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(ProtocolEventManager.this.mPresetKeyBasedPairingCache, 1, 17);
            byte[] bArrDecrypt = ProtocolEventManager.this.decrypt(bArrCopyOfRange);
            PairLog.d(ProtocolEventManager.TAG, "keybasedpairing(ukey2) rawData:" + SensitiveLogUtils.toHiddenIfNeed(bArrDecrypt) + "; keybasedpairing(ukey2) encData:" + SensitiveLogUtils.toHiddenIfNeed(bArrCopyOfRange) + "; keybasedpairing(ukey2) sendData:" + SensitiveLogUtils.toHiddenIfNeed(ProtocolEventManager.this.mPresetKeyBasedPairingCache));
            if (bArrDecrypt == null || bArrDecrypt.length != 16) {
                PairLog.e(ProtocolEventManager.TAG, "keybasedpairing(ukey2) raw data length is error.");
                ProtocolEventManager protocolEventManager = ProtocolEventManager.this;
                protocolEventManager.handleFailure(protocolEventManager.mCurrentDevice.getBluetoothDevice(), 3);
                return;
            }
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrDecrypt, 0, 6);
            if (SaltCheckUtils.checkSalt(ProtocolEventManager.this.mCurrentDevice.mTag, SaltCheckUtils.SALT_TYPE_KEY_BASED_PAIRING, Arrays.copyOfRange(bArrDecrypt, 10, 16))) {
                PairLog.e(ProtocolEventManager.TAG, "salt value is same with last time");
                ProtocolEventManager protocolEventManager2 = ProtocolEventManager.this;
                protocolEventManager2.handleFailure(protocolEventManager2.mCurrentDevice.getBluetoothDevice(), 3);
            }
            PairLog.d(ProtocolEventManager.TAG, "Provider keybasedpairing(ukey2) get deviceId: " + SensitiveLogUtils.toHiddenIfNeed(bArrCopyOfRange2));
            ProtocolEventManager.this.mCurrentDevice.mRemoteDeviceId = bArrCopyOfRange2;
            ProtocolEventManager.this.notifyReceived2Listener(new Event(EventID.SEEKER_REQUEST_CONNECT.ordinal()), null);
        }
    };
    private SecureRandom mRandom = new SecureRandom();
    private Device mCurrentDevice = new Device();

    public static class Device {
        private BluetoothDevice mBluetoothDevice;
        private volatile boolean mConnected;
        private byte[] mLocalDeviceId;
        private byte[] mName;
        private byte[] mRemoteDeviceId;
        private String mStrName;
        private String mTag;

        public Device() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isConnected() {
            return this.mConnected;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
            this.mBluetoothDevice = bluetoothDevice;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnected(boolean z) {
            this.mConnected = z;
        }

        private void setRemoteDeviceId(byte[] bArr) {
            this.mRemoteDeviceId = bArr;
        }

        public BluetoothDevice getBluetoothDevice() {
            return this.mBluetoothDevice;
        }

        public String getDeviceIdBase64() {
            if (ByteUtils.isEmpty(this.mRemoteDeviceId)) {
                return null;
            }
            return HexUtils.byte2Base64(this.mRemoteDeviceId);
        }

        public byte[] getName() {
            return this.mName;
        }

        public byte[] getRemoteDeviceId() {
            return this.mRemoteDeviceId;
        }

        public String getStringName() {
            return this.mStrName;
        }

        public String getTag() {
            return this.mTag;
        }

        public void setName(byte[] bArr) {
            this.mName = bArr;
            this.mStrName = ByteUtils.isEmpty(bArr) ? null : new String(bArr);
        }

        public void setTag(String str) {
            this.mTag = str;
        }

        public Device(BluetoothDevice bluetoothDevice) {
            this.mBluetoothDevice = bluetoothDevice;
        }
    }

    public ProtocolEventManager(int i, byte[] bArr, ProtocolEventListener protocolEventListener) {
        this.mConnectivityFlag = 2;
        this.mConnectivityFlag = i;
        setLocalDeviceId(bArr);
        this.mTypeToAliasMap = new HashMap();
        this.mProtocolEventListener = protocolEventListener;
        this.mUkey2Server.setUkey2ServerCallback(this.mUkey2Callback);
        this.mTom = new TimeOutMonitor(this.mCurrentDevice.getTag(), this);
    }

    private boolean checkKeybaseRequest(BluetoothDevice bluetoothDevice, byte[] bArr) {
        byte[] bArr2 = new byte[16];
        SystemUtils.arraycopy(bArr, 0, bArr2, 0, 16);
        byte[] bArrDecrypt = decrypt(bArr2);
        PairLog.d(TAG, String.format("KeybaseRequest encData:[%s]", SensitiveLogUtils.toHiddenIfNeed(bArr2)));
        PairLog.d(TAG, String.format("KeybaseRequest decode seeker request:[%s]", SensitiveLogUtils.toHiddenIfNeed(bArrDecrypt)));
        byte[] bArr3 = new byte[9];
        SystemUtils.arraycopy(bArrDecrypt, 7, bArr3, 0, 9);
        if (SaltCheckUtils.checkSalt(this.mCurrentDevice.mTag, SaltCheckUtils.SALT_TYPE_KEY_BASED_PAIRING, bArr3)) {
            PairLog.e(TAG, "salt value is same with last time");
            return false;
        }
        if (bArrDecrypt == null || bArrDecrypt.length != 16) {
            PairLog.e(TAG, "check Keybase data error");
            return false;
        }
        byte b = this.mKeyType;
        if (b == 3 && bArrDecrypt[0] != 33) {
            PairLog.e(TAG, "check ACCOUNT KEY Keybase data error, type error:" + ((int) bArrDecrypt[0]));
            return false;
        }
        if (b == 0 && bArrDecrypt[0] != 2) {
            PairLog.e(TAG, "check PRESET Keybase data error, type error:" + ((int) bArrDecrypt[0]));
            return false;
        }
        this.mCurrentDevice.mRemoteDeviceId = Arrays.copyOfRange(bArrDecrypt, 7, 13);
        PairLog.d(TAG, "Provider get remote deviceId: " + SensitiveLogUtils.toHiddenIfNeed(this.mCurrentDevice.mRemoteDeviceId));
        return true;
    }

    private byte[] generateKeypairResp(byte b) {
        byte[] bArrMacStrToByte = HexUtils.macStrToByte(BluetoothNative.getInstance().getAddress());
        byte[] bArr = new byte[6];
        this.mRandom.nextBytes(bArr);
        byte respTypeFromKeyType = (byte) getRespTypeFromKeyType(this.mKeyType);
        byte[] bArr2 = {(byte) (this.mPairMode >> 8), 0};
        byte[] bArr3 = this.mCurrentDevice.mLocalDeviceId;
        if (bArr3 == null || bArr3.length == 0) {
            PairLog.e(TAG, "send keypair Resp error, local DeviceId is empty!");
            return null;
        }
        byte[] bArrCombineByteArrays = SystemUtils.combineByteArrays(new byte[]{respTypeFromKeyType}, bArr2, bArrMacStrToByte, bArr3, new byte[]{b}, bArr);
        byte[] bArrEncrypt = encrypt(bArrCombineByteArrays);
        PairLog.d(TAG, String.format("generateKeypairResp, localdeviceId[%s]: raw:[%s]; encrypted:[%s]", SensitiveLogUtils.toHiddenIfNeed(this.mCurrentDevice.mLocalDeviceId), SensitiveLogUtils.toHiddenIfNeed(bArrCombineByteArrays), SensitiveLogUtils.toHiddenIfNeed(bArrEncrypt)));
        return bArrEncrypt;
    }

    private int getRespTypeFromKeyType(int i) {
        if (i == 2 || i == 1) {
            return 19;
        }
        return i == 3 ? 34 : 0;
    }

    private void handleEnd(BluetoothDevice bluetoothDevice, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        notifyReceived2Listener(new Event((z ? EventID.SEEKER_CONNECTED : EventID.SEEKER_CONNECT_FAILED).ordinal(), bundle), bluetoothDevice);
        reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFailure(BluetoothDevice bluetoothDevice, int i) {
        this.mTom.endTiming();
        if (!this.mCurrentDevice.isConnected()) {
            PairLog.e(TAG, "handleFailure failed, current device is disconnected");
            return;
        }
        PairLog.e(TAG, "handleFailure");
        PairServerFsm.ERROR.enter(this);
        handleEnd(bluetoothDevice, i, false);
    }

    private void handleInitRequest(BluetoothDevice bluetoothDevice, byte[] bArr) {
        PairServerFsm.INITIALIZATION.enter(this);
        PairLog.i(TAG, "handleCharacteristicWriteRequest Initialize");
        this.mSecretKeySpec = null;
        this.mIvParameterSpec = null;
        this.mCurrentDevice.setBluetoothDevice(bluetoothDevice);
        this.mCurrentDevice.setConnected(true);
        PairLog.d(TAG, "provider receive init request:" + SensitiveLogUtils.toHiddenIfNeed(bArr));
        int i = bArr[0];
        if ((i & 255) != 0) {
            PairLog.e(TAG, "handleInitialize failed, msgType: " + i);
            sendInitializeResp(bluetoothDevice, (byte) -1, (byte) 0, 0);
            this.mCurrentDevice.setConnected(false);
        }
        int i2 = (bArr[1] & 65280) + (bArr[2] & 255);
        this.mSeekerMajorVersion = i2;
        this.mSeekerMinorVersion = (65280 & bArr[3]) + (bArr[4] & 255);
        if (i2 != 0) {
            PairLog.e(TAG, "handleInitialize failed, seeker major_v: " + this.mSeekerMajorVersion + ", minor_v: " + this.mSeekerMinorVersion + ", self major: 0, minor: 0");
            sendInitializeResp(bluetoothDevice, (byte) 1, (byte) 0, 0);
            this.mCurrentDevice.setConnected(false);
        }
        this.mAdvType = bArr[5];
        int i3 = bArr[6];
        PairLog.i(TAG, "deviceNameLen:" + i3);
        if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            SystemUtils.arraycopy(bArr, 7, bArr2, 0, i3);
            this.mCurrentDevice.setName(bArr2);
        }
        PairLog.d(TAG, "handleInitialize V3, deviceName: " + this.mCurrentDevice.getStringName());
        notifyReceived2Listener(new Event(EventID.CHOOSE_KEY_TYPE.ordinal()), bluetoothDevice);
    }

    private void handleKeyBasePairing(BluetoothDevice bluetoothDevice, byte[] bArr) {
        PairLog.d(TAG, "handleCharacteristicWriteRequest KeyBasePairing");
        PairServerFsm.KEY_BASED_PAIRING.enter(this);
        this.mPresetKeyBasedPairingCache = bArr;
        if (isUkey2Mode()) {
            PairLog.d(TAG, "handleCharacteristicWriteRequest Ukey2:");
            handleUkey2Request(bluetoothDevice, bArr);
        } else {
            PairLog.e(TAG, "handleKeyBasePairing failed");
            ConnectionManager.getInstance().sendMessage(null, FPParamFactory.obtain(bluetoothDevice.getAddress(), this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
            handleFailure(bluetoothDevice, 3);
        }
    }

    private void handleKscRequest(byte[] bArr) {
        PairLog.d(TAG, "provider receive handleKscRequest");
        PairServerFsm.KSC.enter(this);
        try {
            byte bHandleKscPackRequest = KscManager.handleKscPackRequest(this.mCurrentDevice, bArr, this.mTypeToAliasMap);
            KscManager.handleKscReply(bHandleKscPackRequest, this.mConnectivityFlag, this.mCurrentDevice, this.mSecretKeySpec, this.mIvParameterSpec);
            if (bHandleKscPackRequest == 0) {
                handleSuccess(null);
            } else {
                PairLog.w("ProtocolEventManager - kscTrack", "checkKscAlias failed: result = " + ((int) bHandleKscPackRequest));
                PairLog.w("ProtocolEventManager - kscTrack", "waiting for recreate ksc");
                FalseCountUtils.increaseFalseCount(HexUtils.byteArrayToHexStr(this.mCurrentDevice.mLocalDeviceId));
            }
        } catch (KscException unused) {
            PairLog.e(TAG, "handleKscRequest failed, ksc parse failed");
            handleFailure(null, 0);
            FalseCountUtils.increaseFalseCount(HexUtils.byteArrayToHexStr(this.mCurrentDevice.mLocalDeviceId));
        }
    }

    private void handleSuccess(BluetoothDevice bluetoothDevice) {
        this.mTom.endTiming();
        PairLog.d(TAG, "handleSuccess");
        PairServerFsm.SUCCESS.enter(this);
        handleEnd(bluetoothDevice, 0, true);
    }

    private void handleUkey2Request(BluetoothDevice bluetoothDevice, byte[] bArr) {
        byte b = bArr[0];
        if (b == 16) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
            PairLog.d(TAG, "handleUkey2Request onClientInit," + HexUtils.byteArrayToHexStr(bArr));
            this.mUkey2Server.onClientInit(bArrCopyOfRange);
            return;
        }
        if (b == 18) {
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 17, bArr.length);
            PairLog.d(TAG, "handleUkey2Request onClientFinish");
            this.mUkey2Server.onClientFinish(bArrCopyOfRange2);
        } else {
            PairLog.e(TAG, "handleUkey2Request handleUkey2Request failed, wrong message type:" + ((int) bArr[0]));
            ConnectionManager.getInstance().sendMessage(generateKeypairResp((byte) -1), FPParamFactory.obtain(bluetoothDevice.getAddress(), this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
            handleFailure(bluetoothDevice, 3);
        }
    }

    private void initConnection() {
        if (!this.mAbsConnectionList.isEmpty()) {
            Iterator<AbsConnection> it = this.mAbsConnectionList.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
        this.mAbsConnectionList.clear();
        if (this.mPairMode == 0) {
            PairLog.e(TAG, "initConnection failed, paired type is zero");
            return;
        }
        String address = this.mCurrentDevice.getBluetoothDevice().getAddress();
        if ((this.mPairMode & 32768) != 0) {
            BluetoothLePair bluetoothLePair = new BluetoothLePair(address);
            bluetoothLePair.init();
            PairLog.w(TAG, "initConnection BLE");
            this.mAbsConnectionList.add(bluetoothLePair);
        }
        if ((this.mPairMode & 16384) != 0) {
            BluetoothEdrPair bluetoothEdrPair = new BluetoothEdrPair(address);
            bluetoothEdrPair.init();
            PairLog.i(TAG, "initConnection BR/EDR:");
            this.mAbsConnectionList.add(bluetoothEdrPair);
        }
    }

    private boolean isUkey2Mode() {
        byte b = this.mKeyType;
        return b == 2 || b == 1;
    }

    private void notifyEvent2Listener(int i, Event event, BluetoothDevice bluetoothDevice) {
        if (this.mProtocolEventListener == null) {
            PairLog.e(TAG, "notifyEvent2Listener failed, have no listener");
            return;
        }
        if (bluetoothDevice != null) {
            this.mCurrentDevice.setBluetoothDevice(bluetoothDevice);
        }
        this.mProtocolEventListener.onNotifyEvent(i, this.mCurrentDevice, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notifyReceived2Listener(Event event, BluetoothDevice bluetoothDevice) {
        if (this.mProtocolEventListener == null) {
            PairLog.e(TAG, "notifyReceived2Listener failed, have no listener");
            return false;
        }
        if (!this.mCurrentDevice.isConnected()) {
            PairLog.e(TAG, "notifyReceived2Listener failed, current device is disconnected, id: " + event.id());
            return false;
        }
        if (bluetoothDevice != null) {
            this.mCurrentDevice.setBluetoothDevice(bluetoothDevice);
        }
        if (event.id() == EventID.SEEKER_CONNECT_FAILED.ordinal()) {
            FalseCountUtils.increaseFalseCount(HexUtils.byteArrayToHexStr(this.mCurrentDevice.mRemoteDeviceId));
        }
        this.mProtocolEventListener.onReceived(this.mCurrentDevice, event);
        return true;
    }

    private void notifySentResult2Listener(Event event, BluetoothDevice bluetoothDevice) {
        if (this.mProtocolEventListener == null) {
            PairLog.e(TAG, "notifySent2Listener failed, have no listener");
        } else {
            this.mCurrentDevice.setBluetoothDevice(bluetoothDevice);
            this.mProtocolEventListener.onSentResult(this.mCurrentDevice, event);
        }
    }

    private void replyKeybased(BluetoothDevice bluetoothDevice, int i, byte b) {
        String str;
        this.mPairMode = i;
        PairLog.i(TAG, "replyKeybased, pairMode: " + i + ", connResult: " + ((int) b));
        byte[] bArrGenerateKeypairResp = generateKeypairResp(b);
        if (bArrGenerateKeypairResp == null) {
            handleFailure(bluetoothDevice, 3);
            return;
        }
        int respTypeFromKeyType = getRespTypeFromKeyType(this.mKeyType);
        if (respTypeFromKeyType == 19) {
            str = TIMEOUT_KBP_UKEY2_SF;
        } else if (respTypeFromKeyType == 3) {
            str = "1001_02";
        } else {
            str = respTypeFromKeyType == 34 ? TIMEOUT_KBP_AK_RSP : "";
        }
        this.mTom.startTiming(3, str);
        ConnectionManager.getInstance().sendMessage(bArrGenerateKeypairResp, FPParamFactory.obtain(bluetoothDevice.getAddress(), this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
    }

    private void sendAuthResp(BluetoothDevice bluetoothDevice, int i, int i2) {
        PairLog.i(TAG, "sendAuthResp, code: " + i + ", reason: " + i2);
        if (i == 1) {
            initConnection();
        }
        byte[] bArr = new byte[16];
        bArr[0] = 5;
        bArr[1] = (byte) ((i << 7) | i2);
        bArr[2] = 0;
        bArr[3] = 0;
        SystemUtils.arraycopy(SecurityUtils.generateSalt(this.mRandom, 12), 0, bArr, 4, 12);
        byte[] bArrEncrypt = encrypt(bArr);
        this.mTom.startTiming(3, TIMEOUT_AUTH_RSP);
        ConnectionManager.getInstance().sendMessage(bArrEncrypt, FPParamFactory.obtain(bluetoothDevice.getAddress(), this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_AUTHENTICATION));
    }

    private void sendInitializeResp(BluetoothDevice bluetoothDevice, byte b, byte b2, int i) {
        if (this.mAdvType == 1) {
            this.mKeyType = (byte) 3;
        } else {
            this.mKeyType = b2;
        }
        byte[] bArr = new byte[16];
        bArr[0] = 1;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = b;
        byte b3 = this.mKeyType;
        if (b3 != 3) {
            bArr[6] = b3;
            if (i != 0) {
                bArr[7] = (byte) ((65280 & i) >> 8);
                bArr[8] = (byte) (i & 255);
            }
        }
        if (b == 1 || b == -1) {
            PairLog.e(TAG, "sendInitializeResp failed, handleResult: " + ((int) b));
        }
        PairLog.d(TAG, "sendInitializeResp, keyType: " + ((int) this.mKeyType) + ", raw:" + HexUtils.byteArrayToHexStr(bArr));
        this.mTom.startTiming(1, TIMEOUT_INIT_RSP);
        ConnectionManager.getInstance().sendMessage(bArr, FPParamFactory.obtain(bluetoothDevice.getAddress(), this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_INITIALIZATION));
    }

    public void clientDisconnect(String str) {
        if (TextUtils.isEmpty(str)) {
            PairLog.e(TAG, "clientDisconnect failed, invalid device");
            return;
        }
        if (!this.mCurrentDevice.isConnected()) {
            PairLog.d(TAG, "clientDisconnect, client already is disconnected");
            return;
        }
        if (str.equals(this.mCurrentDevice.getBluetoothDevice().getAddress())) {
            handleFailure(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str), 3);
            return;
        }
        PairLog.d(TAG, "clientDisconnect, client: " + SensitiveLogUtils.toHiddenIfNeed(str) + ", current client: " + SensitiveLogUtils.toHiddenIfNeed(this.mCurrentDevice.getBluetoothDevice().getAddress()));
    }

    @Nullable
    public byte[] decrypt(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return bArr.length != 16 ? SecurityUtils.decryptAESCTR(this.mSecretKeySpec, this.mIvParameterSpec, bArr) : SecurityUtils.decryptAES(this.mSecretKeySpec, this.mIvParameterSpec, bArr);
    }

    @Nullable
    public byte[] encrypt(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return bArr.length != 16 ? SecurityUtils.encryptAESCTR(this.mSecretKeySpec, this.mIvParameterSpec, bArr, this.mRandom) : SecurityUtils.encryptAES(this.mSecretKeySpec, this.mIvParameterSpec, bArr);
    }

    public byte[] generateSalt(int i) {
        return SecurityUtils.generateSalt(this.mRandom, i);
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.mCurrentDevice.getBluetoothDevice();
    }

    public int getConnectivityFlag() {
        return this.mConnectivityFlag;
    }

    public PairServerFsm getFsm() {
        return this.mProviderFsm;
    }

    public byte[] getLocalDeviceId() {
        return this.mCurrentDevice.mLocalDeviceId;
    }

    public Map<Integer, String> getPairResult() {
        return this.mTypeToAliasMap;
    }

    public TimeOutMonitor getTimeOutMonitor() {
        return this.mTom;
    }

    public void handleMessageReceived(String str, FPMessageUtil.FPMessage fPMessage) {
        if (fPMessage == null) {
            PairLog.e(TAG, "handleMessageReceived: message is null");
            return;
        }
        PairLog.i(TAG, "handleMessageReceived:" + fPMessage.getMessageType());
        int messageType = fPMessage.getMessageType();
        if (messageType == 0) {
            handleInitRequest(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str), fPMessage.getMessage());
            return;
        }
        if (messageType != 2) {
            if (messageType == 12) {
                handleKscRequest(fPMessage.getMessage());
                return;
            }
            if (messageType != 16 && messageType != 18) {
                PairLog.w(TAG, this + ", nothing to do with this case:" + fPMessage.getMessageType());
                return;
            }
        }
        handleKeyBasePairing(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str), fPMessage.getMessage());
    }

    public boolean isMsgNotEncrypted() {
        return this.mSecretKeySpec == null || this.mIvParameterSpec == null;
    }

    public void onConnectFailed(AbsConnection absConnection, BluetoothDevice bluetoothDevice) {
        PairLog.e(TAG, "onConnectFailed, pairType: " + absConnection.getPairType() + ", address: " + SensitiveLogUtils.toHiddenIfNeed(absConnection.getPairedAddress()));
        handleFailure(bluetoothDevice, 3);
    }

    public void onDeviceConnected(AbsConnection absConnection) {
        Bundle bundle = new Bundle();
        bundle.putInt("connect_type", absConnection.getPairType());
        bundle.putString("pair_address", absConnection.getPairedAddress());
        bundle.putString(Event.MAC_ADDRESS, absConnection.getMacAddress());
        notifyEvent2Listener(3, new Event(bundle), null);
    }

    @Override // com.heytap.accessory.pair.common.TimeOutMonitor.Callback
    public void onTimeOut(String str, String str2) {
        handleFailure(this.mCurrentDevice.mBluetoothDevice, 4);
    }

    public void reset() {
        this.mCurrentDevice.setConnected(false);
        this.mProviderFsm = PairServerFsm.IDLE;
        if (this.mAbsConnectionList.isEmpty()) {
            return;
        }
        Iterator<AbsConnection> it = this.mAbsConnectionList.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public void send(Device device, Event event) {
        if (event.id() == EventID.SEEKER_SEND_AUTH_DATA.ordinal()) {
            sendAuthResp(device.getBluetoothDevice(), event.bundle().getInt(Event.AUTH_CODE), event.bundle().getInt("error_code"));
        } else if (event.id() == EventID.SEEKER_REQUEST_CONNECT.ordinal()) {
            replyKeybased(device.getBluetoothDevice(), event.bundle().getInt("connect_type"), event.bundle().getByte(Event.CONNECT_RESULT));
        } else if (event.id() == EventID.CHOOSE_KEY_TYPE.ordinal()) {
            byte b = (byte) (event.bundle().getInt(Event.KEY_TYPE) & 255);
            int i = event.bundle().getInt(Event.CONFIRM_NAX_TIME);
            PairLog.i(TAG, "send CHOOSE_KEY_TYPE, key: " + ((int) b));
            PairLog.i(TAG, "send CHOOSE_KEY_TYPE, confirmTimeout: " + i);
            if (i < 0) {
                i = 0;
            } else if (i > 65535) {
                i = 65535;
            }
            sendInitializeResp(device.getBluetoothDevice(), (byte) 0, b, i);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", 0);
        notifySentResult2Listener(new Event(event.id(), bundle), device.getBluetoothDevice());
    }

    public void setFsm(PairServerFsm pairServerFsm) {
        this.mProviderFsm = pairServerFsm;
    }

    public void setLocalDeviceId(byte[] bArr) {
        this.mCurrentDevice.mLocalDeviceId = bArr;
    }

    public static class Event {
        public static final String AUTH_CODE = "auth_code";
        public static final String AUTH_DATA = "auth_data";
        public static final String AUTH_MODE = "auth_mode";
        public static final String CONFIRM_NAX_TIME = "confirm_max_time";
        public static final String CONNECT_RESULT = "connect_result";
        public static final String CONNECT_TYPE = "connect_type";
        public static final String ECDH_PUBLIC_KEY = "ecdh_public_key";
        public static final String ECDH_SHARED_KEY = "ecdh_shared_key";
        public static final String ERROR_CODE = "error_code";
        public static final String KEY_TYPE = "key_type";
        public static final String MAC_ADDRESS = "mac_address";
        public static final String PAIR_ADDRESS = "pair_address";
        private Bundle mBundle;
        private int mId;

        public Event(int i) {
            this.mId = i;
        }

        public Bundle bundle() {
            return this.mBundle;
        }

        public int id() {
            return this.mId;
        }

        public Event(int i, Bundle bundle) {
            this.mId = i;
            this.mBundle = bundle;
        }

        public Event(Bundle bundle) {
            this.mBundle = bundle;
        }
    }
}
