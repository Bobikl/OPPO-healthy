package com.heytap.accessory.pair.seeker.pairing.workers;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.common.TimeOutMonitor;
import com.heytap.accessory.pair.common.ksc.KscException;
import com.heytap.accessory.pair.common.ksc.KscManager;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener;
import com.heytap.accessory.pair.connectivity.message.FPMessageUtil;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.seeker.DeviceEventManager;
import com.heytap.accessory.pair.seeker.device.BaseDevice;
import com.heytap.accessory.pair.seeker.pairing.keybase.KeyBasedPairing;
import com.heytap.accessory.pair.seeker.pairing.keybase.Ukey2KeyBased;
import com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol;
import com.heytap.accessory.pair.utils.FalseCountUtils;
import com.heytap.accessory.pair.utils.FastPairTimeStatistic;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.SecurityUtils;
import com.heytap.accessory.pair.utils.SystemUtils;
import com.oplus.aiunit.vision.qe0;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsWorker implements Handler.Callback, AbsPairProtocol.CallBack, TimeOutMonitor.Callback {
    public static final String CANCEL_CODE = "cancel_code";
    public static final int CONNECT_TIMEOUT = 30000;
    public static final int DATA_LENGTH = 16;
    private static final int DEFAULT_AUTH_RETRY_TIME = 3;
    public static final int DISCOVER_TIMEOUT = 3000;
    public static final int FLAGS_PAIR_BLE = 32768;
    public static final int FLAGS_PAIR_BR_EDR = 16384;
    public static final int FLAGS_PAIR_P2P_FOR_PC = 4096;
    public static final int FLAGS_PAIR_WIFI_DIRECT = 8192;
    public static final int MAC_LENGTH = 6;
    public static final int MSG_ACCOUNT_KEY = 8;
    public static final int MSG_AUTH = 6;
    public static final int MSG_CANCEL = 1;
    public static final int MSG_CONTINUE = 11;
    public static final int MSG_GATT = 2;
    public static final int MSG_INIT = 4;
    public static final int MSG_MTU = 3;
    public static final int MSG_PAIR = 7;
    public static final int MSG_PKBP = 5;
    public static final int MSG_RECEIVE_KSC = 10;
    public static final int MSG_REQUEST_TIMEOUT = 101;
    public static final int MSG_WRITE_KSC = 9;
    public static final int PUBLIC_KEY_LENGTH = 64;
    private static final String TAG = "AbsWorker";
    private static final String THREAD_NAME = "wk";
    public static final String TIMEOUT_ACCOUNT_KEY = "1003_20";
    public static final String TIMEOUT_AUTH_REQ = "1002_04";
    public static final String TIMEOUT_INIT_REQ = "0001_00";
    public static final String TIMEOUT_KSC_GENERATING = "1004_0C";
    public static final String TIMEOUT_SET_MTU = "MTU";
    public static final int TIME_SECOND_UNIT = 1000;
    private List<AbsPairProtocol> mAbsPairProtocols;
    private String mAdvertiseMac;
    private Map<String, byte[]> mAliasToKscMap;
    private int mAuthRetryTime;
    private byte mAuthenticationCode;
    private boolean mBTPairedComplete;
    private IWorkerCallback mCallback;
    private int mConfirmTimeout;
    private final IConnectionEventListener mConnectionEventListener;
    private int mConnectivityFlag;
    private volatile boolean mEarly;
    private final Object mEarlyLock;
    public int mFlags;
    private long mGatt2CostMs;
    private long mGatt2StartMs;
    private long mGattCostMs;
    private long mGattStartMs;
    private Handler mHandler;
    private byte mInitRespValue;
    private boolean mIsBTNeedPaired;
    private boolean mIsWifiNeedPaired;
    IvParameterSpec mIvParameterSpec;
    private KeyBasedPairing mKeyBasedPairing;
    private byte mKeyType;
    private boolean mNeedShowUkey2Str;
    private long mPairCostMs;
    private AbsPairProtocol mPairProtocol;
    private long mPairStartMs;
    private int mProviderMajorVersion;
    private int mProviderMinorVersion;
    private SecureRandom mRandom;
    private Set<byte[]> mReceivedSaltSet;
    byte[] mSecretKey;
    private SecretKeySpec mSecretKeySpec;
    private FastPairSeekerFsm mSeekerFsm;
    byte[] mSeekerPubKey;
    private long mStartMs;
    final BaseDevice mTask;
    private Bundle mTaskNotifyBundle;
    private TimeOutMonitor mTom;
    private Map<Integer, String> mTypeToAliasMap;
    private boolean mWifiPairedComplete;

    /* JADX INFO: renamed from: com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm;

        static {
            int[] iArr = new int[FastPairSeekerFsm.values().length];
            $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm = iArr;
            try {
                iArr[FastPairSeekerFsm.GATT_CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm[FastPairSeekerFsm.INITIALIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm[FastPairSeekerFsm.KEY_BASED_PAIRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm[FastPairSeekerFsm.AUTHENTICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm[FastPairSeekerFsm.KSC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm[FastPairSeekerFsm.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AbsWorker(BaseDevice baseDevice) {
        this(baseDevice, 3);
    }

    private void cancelEarly(int i) {
        if (!FastPairSeekerFsm.IDLE.enter(this)) {
            PairLog.w(TAG, this + ", enter IDLE failed, do nothing.");
            return;
        }
        this.mTask.onFinished(i);
        ConnectionManager.getInstance().closeConnection(this.mAdvertiseMac);
        this.mTom.endTiming();
        IWorkerCallback iWorkerCallback = this.mCallback;
        if (iWorkerCallback != null) {
            iWorkerCallback.onWorkerStop(true);
        }
    }

    private void cancelInternal(int i) {
        this.mHandler.removeMessages(101);
        if (!FastPairSeekerFsm.ERROR.enter(this)) {
            PairLog.w(TAG, this + ", enter error failed, do nothing.");
            return;
        }
        this.mTask.onFinished(i);
        this.mTaskNotifyBundle.putInt(CANCEL_CODE, i);
        if (i == 2003) {
            PairLog.e(TAG, this + ", cancelInternal, connection error, disconnect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac));
            this.mTask.notifyIntegrator(3, this.mTaskNotifyBundle);
        } else if (i == 2021) {
            PairLog.e(TAG, this + ", cancelInternal, auth timeout, disconnect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac));
            this.mTask.notifyIntegrator(9);
        } else if (i == 2022) {
            PairLog.e(TAG, this + ", cancelInternal, auth limit, disconnect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac));
            this.mTask.notifyIntegrator(7);
        } else if (i == 2017) {
            PairLog.e(TAG, this + ", cancelInternal, refuse pair, disconnect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac));
            this.mTask.notifyIntegrator(3, this.mTaskNotifyBundle);
        } else if (i == 101) {
            PairLog.w(TAG, this + ", screen lock, keep silence and no notify to user");
            this.mTask.notifyIntegrator(15);
        } else {
            PairLog.e(TAG, this + ", cancelInternal, pair failed, disconnect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac));
            this.mTask.notifyIntegrator(3, this.mTaskNotifyBundle);
        }
        ConnectionManager.getInstance().closeConnection(this.mAdvertiseMac);
        this.mTom.endTiming();
        IWorkerCallback iWorkerCallback = this.mCallback;
        if (iWorkerCallback != null) {
            iWorkerCallback.onWorkerStop(true);
        }
    }

    private void cancelWk(int i) {
        FastPairSeekerFsm fastPairSeekerFsm = FastPairSeekerFsm.IDLE;
        if (checkFsm(FastPairSeekerFsm.SUCCESS, fastPairSeekerFsm)) {
            PairLog.i(TAG, "cancelWk out, fsm: " + getFsm() + ", err: " + i);
            return;
        }
        if (i != 2003 && i != 2007) {
            cancelInternal(i);
            return;
        }
        if (!checkFsm(fastPairSeekerFsm)) {
            cancelInternal(i);
            return;
        }
        PairLog.i(TAG, "cancelWk out, fsm: " + getFsm() + ", err: " + i);
    }

    private boolean checkAuthTryCountMax() {
        return this.mAuthRetryTime <= 1;
    }

    private boolean checkFsm(FastPairSeekerFsm... fastPairSeekerFsmArr) {
        for (FastPairSeekerFsm fastPairSeekerFsm : fastPairSeekerFsmArr) {
            if (getFsm() == fastPairSeekerFsm) {
                return true;
            }
        }
        return false;
    }

    private void connectDevice() {
        this.mAdvertiseMac = this.mTask.getMac();
        this.mConnectivityFlag = this.mTask.getConnectivityFlag();
        PairLog.i(TAG, this + ", connect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac) + ",use connectType:" + this.mConnectivityFlag);
        setGattStartMs(FastPairTimeStatistic.tick());
        FPConParam fPConParamObtain = FPParamFactory.obtain(this.mAdvertiseMac, this.mConnectivityFlag);
        if (fPConParamObtain != null) {
            ConnectionManager.getInstance().connect(fPConParamObtain, this.mConnectionEventListener);
            return;
        }
        PairLog.i(TAG, " connect mac: " + SensitiveLogUtils.toHiddenIfNeed(this.mAdvertiseMac) + " param is null");
    }

    private void errorNextFsm(FastPairSeekerFsm fastPairSeekerFsm) {
        errorNextFsm(getFsm(), fastPairSeekerFsm);
    }

    private String getName() {
        BaseDevice baseDevice = this.mTask;
        if (baseDevice == null) {
            return null;
        }
        return baseDevice.getName();
    }

    private String getTag() {
        BaseDevice baseDevice = this.mTask;
        if (baseDevice == null) {
            return null;
        }
        return baseDevice.getTag();
    }

    private void handleAuthenticationResponse(byte[] bArr) {
        if (bArr == null || bArr.length != 16 || bArr[0] != 5) {
            PairLog.e(TAG, this + ", notifyAuthentication failed, data error");
            cancel(2010);
            return;
        }
        int i = (bArr[1] & 255) >> 7;
        if (i == 1) {
            PairLog.d(TAG, this + ", AUTH_SUCCESS");
            this.mHandler.obtainMessage(7).sendToTarget();
            return;
        }
        PairLog.e(TAG, this + ", notifyAuthentication failed, result: " + i + ", authMode: " + ((int) this.mAuthenticationCode));
        if (this.mAuthenticationCode == 4) {
            cancel(2022);
            return;
        }
        if (checkAuthTryCountMax()) {
            PairLog.e(TAG, this + ", notifyAuthentication failed, exit");
            cancel(2022);
            return;
        }
        PairLog.e(TAG, this + ", notifyAuthentication failed, retry");
        updateAuthRetryTime();
        this.mTom.startTiming(3, TIMEOUT_AUTH_REQ);
        this.mTask.notifyIntegrator(6);
    }

    private void handleInitializeResponse(byte[] bArr) {
        byte b;
        this.mProviderMajorVersion = (bArr[1] & 65280) + (bArr[2] & 255);
        this.mProviderMinorVersion = (bArr[3] & 65280) + (bArr[4] & 255);
        this.mInitRespValue = bArr[5];
        this.mKeyType = bArr[6];
        if (bArr.length > 8) {
            this.mConfirmTimeout = (((bArr[7] & 255) << 8) | (bArr[8] & 255)) * 1000;
        }
        PairLog.d(TAG, this + "keyType: " + ((int) this.mKeyType) + "; provider v:" + this.mProviderMajorVersion + "." + this.mProviderMinorVersion + "; provider mInitRespValue:" + ((int) this.mInitRespValue) + "; provider mConfirmTimeout:" + this.mConfirmTimeout);
        if (this.mProviderMajorVersion == 0 && (b = this.mInitRespValue) != 1) {
            if (b == 0) {
                this.mHandler.obtainMessage(5).sendToTarget();
                return;
            }
            PairLog.e(TAG, this + ", initialization failed, unknown err: " + ((int) this.mInitRespValue));
            cancel(2000);
            return;
        }
        PairLog.e(TAG, this + ", provider raw data: " + HexUtils.byteArrayToHexStr(bArr));
        PairLog.e(TAG, this + ", initialization failed, seeker v:0.0");
        cancel(2016);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageDispatched(String str, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            PairLog.e(TAG, "handleMessageDispatched: message is null");
            cancel(2010);
        } else {
            if (AnonymousClass2.$SwitchMap$com$heytap$accessory$pair$seeker$pairing$workers$FastPairSeekerFsm[this.mSeekerFsm.ordinal()] != 4) {
                return;
            }
            this.mTask.notifyIntegrator(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageReceived(String str, FPMessageUtil.FPMessage fPMessage) {
        if (fPMessage == null) {
            PairLog.e(TAG, "handleMessageReceived: message is null");
            cancel(2010);
            return;
        }
        int messageType = fPMessage.getMessageType();
        if (messageType == 1) {
            handleInitializeResponse(fPMessage.getMessage());
            return;
        }
        if (messageType != 3) {
            if (messageType == 5) {
                handleAuthenticationResponse(fPMessage.getMessage());
                return;
            }
            if (messageType == 13) {
                PairLog.d(TAG, this + ", ksc onNotify, receive reply");
                this.mHandler.obtainMessage(10, fPMessage.getMessage()).sendToTarget();
                return;
            }
            if (messageType != 17 && messageType != 19) {
                PairLog.w(TAG, this + ", nothing to do with this case:" + fPMessage.getMessageType());
                return;
            }
        }
        this.mKeyBasedPairing.handleKeyBasedResponse(fPMessage.getMessage());
    }

    private void handlePairFinished(int i) {
        if (i == 2001) {
            PairLog.d(TAG, "handlePairFinished adb type: ModelIDWorker");
            this.mHandler.sendEmptyMessage(8);
            return;
        }
        PairLog.e(TAG, this + ", handlePairFinished failed, err: " + i);
        cancel(i);
    }

    private void initRandom() {
        this.mRandom = new SecureRandom();
    }

    private boolean isUkey2Mode() {
        byte b = this.mKeyType;
        return b == 2 || b == 1;
    }

    private void notifyAuthenticationWk(byte b) {
        PairLog.funcIn();
        FastPairSeekerFsm.AUTHENTICATION.enter(this);
        this.mAuthenticationCode = b;
        this.mTom.startTiming(3, TIMEOUT_AUTH_REQ);
        this.mTask.notifyIntegrator(4, this.mAuthenticationCode);
    }

    private void notifyEvent2Listener(int i, DeviceEventManager.Event event) {
        if (this.mTask.getDeviceEvent() == null) {
            PairLog.e(TAG, this + ", notifyEvent2Listener failed, deviceEvent is null");
        }
    }

    private void notifyInitializationWk() {
        PairLog.funcIn();
        FastPairSeekerFsm.INITIALIZATION.enter(this);
        this.mTom.startTiming(2, TIMEOUT_INIT_REQ);
        writeInitialization();
    }

    private void notifyKeyBasedPairing() {
        FastPairSeekerFsm.KEY_BASED_PAIRING.enter(this);
        if (!isUkey2Mode()) {
            PairLog.e(TAG, "Unexpected KeyBasePairing type");
            cancel(2009);
            return;
        }
        if (this.mKeyBasedPairing == null) {
            this.mKeyBasedPairing = new Ukey2KeyBased(this, this.mAdvertiseMac, this.mTask.getLocalDeviceId(), this.mConfirmTimeout);
        }
        PairLog.d(TAG, this + ", Ukey2KeyBased:" + this.mKeyBasedPairing);
        if (this.mKeyType == 1) {
            this.mNeedShowUkey2Str = true;
        }
        this.mKeyBasedPairing.notifyKeyBasedPairing();
    }

    private void notifyKscWk() {
        PairLog.funcIn();
        FastPairSeekerFsm.KSC.enter(this);
        writeKsc();
    }

    private void onFastFairFinished() {
        if (!FastPairSeekerFsm.SUCCESS.enter(this)) {
            PairLog.w(TAG, this + ", enter error failed, do nothing.");
            return;
        }
        this.mTask.notifyIntegrator(2, this.mTaskNotifyBundle, 0);
        ConnectionManager.getInstance().closeConnection(this.mAdvertiseMac);
        this.mTom.endTiming();
        IWorkerCallback iWorkerCallback = this.mCallback;
        if (iWorkerCallback != null) {
            iWorkerCallback.onWorkerStop(true);
        }
    }

    private void preKeyBasePairingWk() {
        notifyKeyBasedPairing();
    }

    private void receiveKscPackWk(byte[] bArr) {
        if (qe0.w()) {
            PairLog.d(TAG, this + ",receiveKscPack: " + HexUtils.byteArrayToHexStr(bArr));
        } else {
            PairLog.d(TAG, this + ",receiveKscPack ");
        }
        String strByteArrayToHexStr = HexUtils.byteArrayToHexStr(this.mTask.getRemoteDeviceId());
        try {
            if (KscManager.checkKscResp(this.mAdvertiseMac, bArr, strByteArrayToHexStr, this.mAliasToKscMap) == 0) {
                this.mTask.setKscAlias(this.mAliasToKscMap);
                this.mTask.setTypeAlias(this.mTypeToAliasMap);
                onFastFairFinished();
            } else {
                PairLog.w(TAG, this + ", ksc duplicate, recreate ksc!");
                this.mTypeToAliasMap.clear();
                this.mAliasToKscMap.clear();
                if (FalseCountUtils.checkFalseCountMax(strByteArrayToHexStr)) {
                    PairLog.e(TAG, this + ", ksc fc max, quit");
                    cancel(2019);
                } else {
                    FalseCountUtils.increaseFalseCount(strByteArrayToHexStr);
                    writeKsc();
                }
            }
        } catch (KscException unused) {
        }
    }

    private void requestGattWk(boolean z) {
        if (!checkFsm(FastPairSeekerFsm.IDLE, FastPairSeekerFsm.ERROR)) {
            errorNextFsm(FastPairSeekerFsm.GATT_CONNECTING);
            return;
        }
        FastPairSeekerFsm.GATT_CONNECTING.enter(this);
        generateKeys();
        connectDevice();
    }

    private void requestMtuWk() {
    }

    private void setEarly(boolean z) {
        this.mEarly = z;
        if (z) {
            return;
        }
        PairLog.i(TAG, "user click fast pair!");
        setStartMs(FastPairTimeStatistic.tick());
    }

    private void updateAuthRetryTime() {
        this.mAuthRetryTime--;
    }

    private void writeAuthentication(byte[] bArr) {
        PairLog.funcIn();
        PairLog.d(TAG, "raw data length : " + bArr.length);
        byte[] bArrEncrypt = encrypt(bArr);
        this.mTom.startTiming(3, TIMEOUT_AUTH_REQ);
        ConnectionManager.getInstance().sendMessage(bArrEncrypt, FPParamFactory.obtain(this.mAdvertiseMac, this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_AUTHENTICATION));
    }

    private void writeInitialization() {
        String name;
        PairLog.funcIn();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        byte[] bytes = (defaultAdapter == null || (name = defaultAdapter.getName()) == null) ? null : name.getBytes();
        PairLog.i(TAG, "writeInitialization, device name: " + HexUtils.byteArrayToHexStr(bytes));
        byte[] bArr = {0, 0, 0, 0};
        if (!(this instanceof ModelIDWorker)) {
            PairLog.e(TAG, "unknown advType");
            cancel(2009);
            return;
        }
        byte[][] bArr2 = new byte[5][];
        bArr2[0] = new byte[]{0};
        bArr2[1] = bArr;
        bArr2[2] = new byte[]{0};
        byte[] bArr3 = new byte[1];
        bArr3[0] = (byte) (bytes == null ? 0 : bytes.length);
        bArr2[3] = bArr3;
        bArr2[4] = bytes;
        byte[] bArrCombineByteArrays = SystemUtils.combineByteArrays(bArr2);
        PairLog.d(TAG, this + "seeker raw data: " + SensitiveLogUtils.toHiddenIfNeed(bArrCombineByteArrays));
        ConnectionManager.getInstance().sendMessage(bArrCombineByteArrays, FPParamFactory.obtain(this.mAdvertiseMac, this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_INITIALIZATION));
    }

    private void writeKsc() {
        PairLog.funcIn();
        PairLog.d(TAG, this + ", writeKsc");
        this.mAliasToKscMap = new HashMap();
        HashMap map = new HashMap();
        this.mTypeToAliasMap = map;
        byte[] bArrEncrypt = encrypt(KscManager.generateKscPack(this.mFlags, this.mAliasToKscMap, map));
        PairLog.d(TAG, this + ", to send ksc pack");
        this.mTom.startTiming(1, TIMEOUT_KSC_GENERATING);
        ConnectionManager.getInstance().sendMessage(bArrEncrypt, FPParamFactory.obtain(this.mAdvertiseMac, this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_KSC_GENERATING));
    }

    public void cancel(int i) {
        PairLog.e(TAG, this + ", cancel, error: " + i);
        this.mHandler.obtainMessage(1, i, 0).sendToTarget();
    }

    public boolean continueIfEarly() {
        if (!isEarly()) {
            return false;
        }
        synchronized (this.mEarlyLock) {
            if (!isEarly()) {
                return false;
            }
            setEarly(false);
            this.mHandler.obtainMessage(11).sendToTarget();
            return true;
        }
    }

    @Nullable
    public byte[] decrypt(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return bArr.length != 16 ? SecurityUtils.decryptAESCTR(this.mSecretKeySpec, this.mIvParameterSpec, bArr) : SecurityUtils.decryptAES(this.mSecretKeySpec, this.mIvParameterSpec, bArr);
    }

    public abstract void doKeyBasedPairing(byte[] bArr, byte[] bArr2);

    @Nullable
    public byte[] encrypt(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return bArr.length != 16 ? SecurityUtils.encryptAESCTR(this.mSecretKeySpec, this.mIvParameterSpec, bArr, this.mRandom) : SecurityUtils.encryptAES(this.mSecretKeySpec, this.mIvParameterSpec, bArr);
    }

    public abstract void generateKeys();

    public byte[] generateSalt(int i) {
        return SecurityUtils.generateSalt(this.mRandom, i);
    }

    public int getConnectivityFlag() {
        return this.mConnectivityFlag;
    }

    public BaseDevice getDevice() {
        return this.mTask;
    }

    public FastPairSeekerFsm getFsm() {
        return this.mSeekerFsm;
    }

    public long getGatt2CostMs() {
        return this.mGatt2CostMs;
    }

    public long getGatt2StartMs() {
        return this.mGatt2StartMs;
    }

    public long getGattCostMs() {
        return this.mGattCostMs;
    }

    public long getGattStartMs() {
        return this.mGattStartMs;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public long getPairCostMs() {
        return this.mPairCostMs;
    }

    public long getPairStartMs() {
        return this.mPairStartMs;
    }

    public TimeOutMonitor getTimeOutMonitor() {
        return this.mTom;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 101) {
            switch (i) {
                case 1:
                    cancelWk(message.arg1);
                    break;
                case 2:
                    requestGattWk(((Boolean) message.obj).booleanValue());
                    break;
                case 3:
                    requestMtuWk();
                    break;
                case 4:
                    notifyInitializationWk();
                    break;
                case 5:
                    preKeyBasePairingWk();
                    break;
                case 6:
                    notifyAuthenticationWk(((Byte) message.obj).byteValue());
                    break;
                default:
                    switch (i) {
                        case 9:
                            notifyKscWk();
                            break;
                        case 10:
                            receiveKscPackWk((byte[]) message.obj);
                            break;
                        case 11:
                            if (checkFsm(FastPairSeekerFsm.IDLE)) {
                                this.mHandler.obtainMessage(2, Boolean.FALSE).sendToTarget();
                            }
                            break;
                    }
                    break;
            }
        } else {
            PairLog.e(TAG, this + ", MSG_REQUEST_TIMEOUT, who: " + message.obj);
            if (TIMEOUT_AUTH_REQ.equals(message.obj)) {
                cancelWk(2021);
            } else {
                cancelWk(4);
            }
        }
        return true;
    }

    public boolean isEarly() {
        return this.mEarly;
    }

    public boolean isMsgNotEncrypted() {
        return this.mSecretKeySpec == null || this.mIvParameterSpec == null;
    }

    public void onAuthStrAndSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PairLog.d(TAG, this + "onAuthStrAndSecretKey " + SensitiveLogUtils.toHiddenIfNeed(bArr2));
        this.mSecretKeySpec = SecurityUtils.getAESKeySpec(bArr);
        this.mIvParameterSpec = SecurityUtils.getIVSpec(bArr2);
        if (this.mNeedShowUkey2Str) {
            this.mTask.notifyIntegrator(4);
        }
    }

    public void onKeyBasedPairingFinished(byte[] bArr) {
        this.mFlags = (bArr[1] << 8) | bArr[2];
        byte b = bArr[15];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, 15);
        PairLog.d(TAG, this + "onKeyBasedPairingFinished, remoteDeviceId: " + SensitiveLogUtils.toHiddenIfNeed(bArrCopyOfRange) + "; rawData: " + SensitiveLogUtils.toHiddenIfNeed(bArr));
        this.mTask.setRemoteDeviceId(bArrCopyOfRange);
        PairLog.i(TAG, this + "onKeyBasedPairingFinished, conclusion is " + HexUtils.byteToHexStr(b) + "; mFlags = " + Integer.toHexString(this.mFlags));
        if (1 == b) {
            PairLog.i(TAG, this + ", agree connect, start generate ksc");
            this.mHandler.obtainMessage(9).sendToTarget();
            return;
        }
        if (2 == b) {
            PairLog.e(TAG, this + ", onKeyBasedPairingFinished failed, refuse");
            cancel(2017);
            return;
        }
        if (3 == b || 4 == b) {
            if (this.mKeyType == 1) {
                PairLog.e(TAG, this + ", onKeyBasedPairingFinished, ukey2 already show code");
            }
            this.mHandler.obtainMessage(6, Byte.valueOf(b)).sendToTarget();
            return;
        }
        PairLog.e(TAG, this + ", onKeyBasedPairingFinished failed, unknown conclusion: " + ((int) b));
        cancel(2000);
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.protocols.AbsPairProtocol.CallBack
    public void onPairingFinished(int i, int i2, @NonNull Bundle bundle) {
        PairLog.d(TAG, this + ", onPairingFinished, errorCode: " + i2);
        setPairCostMs(FastPairTimeStatistic.countPairTime(getPairStartMs(), toString()));
        if (i2 == 2001) {
            bundle.putString("tag", this.mTask.getTag());
            bundle.putByteArray(DeviceEventManager.Event.KEY_REMOTE_DEVICE_ID, this.mTask.getRemoteDeviceId());
            notifyEvent2Listener(2, new DeviceEventManager.Event(i, bundle));
        }
        if (i == 1 || i == 3) {
            this.mBTPairedComplete = true;
        }
        if (i == 2) {
            this.mWifiPairedComplete = true;
        }
        boolean z = this.mIsWifiNeedPaired;
        if (z && this.mIsBTNeedPaired && this.mBTPairedComplete && this.mWifiPairedComplete) {
            PairLog.d(TAG, this + ", bt and wifi pair complete ");
            handlePairFinished(i2);
            return;
        }
        if (z && this.mWifiPairedComplete && !this.mIsBTNeedPaired) {
            PairLog.d(TAG, this + ", wifi pair complete ");
            handlePairFinished(i2);
            return;
        }
        if (!this.mIsBTNeedPaired || !this.mBTPairedComplete || z) {
            PairLog.w(TAG, this + ", pairing not finished yet, wait for next call");
            return;
        }
        PairLog.d(TAG, this + ", bt pair complete ");
        handlePairFinished(i2);
    }

    @Override // com.heytap.accessory.pair.common.TimeOutMonitor.Callback
    public void onTimeOut(String str, String str2) {
        Handler handler = this.mHandler;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(101, str2));
    }

    public void prepareAuthentication(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = 4;
        bArr2[1] = (byte) bArr.length;
        SystemUtils.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        PairLog.d(TAG, this + ", prepareAuthentication=" + HexUtils.byteArrayToHexStr(bArr2));
        writeAuthentication(bArr2);
    }

    public void run(IWorkerCallback iWorkerCallback) {
        run(iWorkerCallback, false);
    }

    public void setFsm(FastPairSeekerFsm fastPairSeekerFsm) {
        this.mSeekerFsm = fastPairSeekerFsm;
    }

    public void setGatt2CostMs(long j2) {
        this.mGatt2CostMs = j2;
    }

    public void setGatt2StartMs(long j2) {
        this.mGatt2StartMs = j2;
    }

    public void setGattCostMs(long j2) {
        this.mGattCostMs = j2;
    }

    public void setGattStartMs(long j2) {
        this.mGattStartMs = j2;
    }

    public void setPairCostMs(long j2) {
        this.mPairCostMs = j2;
    }

    public void setPairStartMs(long j2) {
        this.mPairStartMs = j2;
    }

    public void setStartMs(long j2) {
        this.mStartMs = j2;
    }

    public String toString() {
        return "{ tag: " + SensitiveLogUtils.toHiddenIfNeed(getTag()) + ", name: " + getName() + " }";
    }

    public void writeKeyBasedPairingFinish(byte[] bArr) {
        PairLog.funcIn();
        PairLog.d(TAG, this + "writeKeyBasedPairingFinish");
        ConnectionManager.getInstance().sendMessage(bArr, FPParamFactory.obtain(this.mAdvertiseMac, this.mConnectivityFlag, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING));
    }

    public AbsWorker(BaseDevice baseDevice, int i) {
        this.mEarlyLock = new Object();
        this.mInitRespValue = (byte) -1;
        this.mKeyType = (byte) 0;
        this.mConfirmTimeout = 30000;
        this.mSeekerFsm = FastPairSeekerFsm.IDLE;
        this.mAbsPairProtocols = new ArrayList();
        this.mNeedShowUkey2Str = false;
        this.mIsBTNeedPaired = false;
        this.mIsWifiNeedPaired = false;
        this.mBTPairedComplete = false;
        this.mWifiPairedComplete = false;
        this.mAuthRetryTime = 3;
        this.mEarly = false;
        this.mConnectivityFlag = 2;
        this.mConnectionEventListener = new IConnectionEventListener() { // from class: com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker.1
            @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
            public void onConnectionStateChanged(String str, int i2, int i3) {
                if (i2 == 1) {
                    AbsWorker.this.mHandler.obtainMessage(4).sendToTarget();
                    return;
                }
                PairLog.e(AbsWorker.TAG, this + ", connection error, status: " + i2 + " errorCode:" + i3);
                AbsWorker.this.cancel(i3);
            }

            @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
            public void onMessageDispatched(String str, byte[] bArr) {
                AbsWorker.this.handleMessageDispatched(str, bArr);
            }

            @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
            public void onMessageReceived(String str, byte[] bArr) {
                AbsWorker.this.handleMessageReceived(str, FPMessageUtil.FPMessage.parseMessage(FPMessageUtil.decryptSeeker(bArr, AbsWorker.this)));
            }
        };
        this.mTask = baseDevice;
        if (i > 0) {
            this.mAuthRetryTime = i;
        }
        this.mTom = new TimeOutMonitor(getDevice().getTag(), this);
        HandlerThread handlerThread = new HandlerThread("wk-" + getTag());
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper(), this);
        this.mReceivedSaltSet = new HashSet();
        this.mTaskNotifyBundle = new Bundle();
        initRandom();
    }

    private void errorNextFsm(FastPairSeekerFsm fastPairSeekerFsm, FastPairSeekerFsm fastPairSeekerFsm2) {
        PairLog.e(TAG, "errorFsm, from: " + fastPairSeekerFsm + ", to: " + fastPairSeekerFsm2);
    }

    public void run(IWorkerCallback iWorkerCallback, boolean z) {
        synchronized (this.mEarlyLock) {
            this.mCallback = iWorkerCallback;
            setGatt2StartMs(FastPairTimeStatistic.tick());
            this.mHandler.obtainMessage(2, Boolean.valueOf(z)).sendToTarget();
        }
    }
}
