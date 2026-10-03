package com.heytap.accessory.pair.provider.bleserver.pairing;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.apiadapter.BluetoothNative;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.provider.PairServer;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.accessory.pair.provider.bleserver.receiver.ConnectionReceiver;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.SaltCheckUtils;
import com.heytap.accessory.pair.utils.SystemUtils;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.xda;
import java.security.SecureRandom;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class BluetoothPair extends AbsConnection implements ConnectionReceiver.OnConnectionCallback {
    private static final int PASSKEY_HEX_0000FF = 255;
    private static final int PASSKEY_HEX_00FF00 = 65280;
    private static final int PASSKEY_HEX_FF0000 = 16711680;
    private static final int PASSKEY_OFFSET_16 = 16;
    private static final int PASSKEY_OFFSET_8 = 8;
    private static final int SALT_LENGTH_12 = 12;
    private static final int SALT_START_POS_4 = 4;
    private static final String TAG = "BluetoothPair";
    public static final String TIMEOUT_PROVIDER_PASSKEY = "1101_07";
    private ConnectionReceiver mConnectionReceiver;
    private Context mContext;
    private int mPasskey;
    private BluetoothDevice mPasskeyBroadcastDevice;
    private BluetoothDevice mPasskeyRequestDevice;
    private byte[] mPasskeyRequestRawData;
    private ProtocolEventManager mProtocolEventManager;

    public BluetoothPair(String str) {
        super(str);
        this.mPasskey = -1;
        this.mPasskeyRequestRawData = null;
        this.mContext = e88.a();
        ProtocolEventManager protocolEventManager = PairServer.getInstance().getProtocolEventManager(this.mBleMac);
        this.mProtocolEventManager = protocolEventManager;
        if (protocolEventManager == null) {
            PairLog.e(TAG, "current ble address not in the working map!");
        }
    }

    private boolean dataCheck() {
        byte[] bArr = this.mPasskeyRequestRawData;
        byte b = bArr[0];
        if (b != 6) {
            PairLog.e(TAG, "dataCheck failed, msgType: " + ((int) b));
            return false;
        }
        byte[] bArr2 = new byte[12];
        SystemUtils.arraycopy(bArr, 4, bArr2, 0, 12);
        if (SaltCheckUtils.checkSalt(this.mPasskeyRequestDevice.getAddress(), SaltCheckUtils.SALT_TYPE_BLUETOOTH_BOND, bArr2)) {
            PairLog.e(TAG, "dataCheck failed, the same salt");
            return false;
        }
        byte[] bArr3 = this.mPasskeyRequestRawData;
        int i = ((bArr3[1] & 255) << 16) + ((bArr3[2] & 255) << 8) + (bArr3[3] & 255);
        PairLog.d(TAG, "mPasskeyRequestRawData " + HexUtils.byteArrayToHexStr(this.mPasskeyRequestRawData));
        int i2 = this.mPasskey;
        if (i != i2) {
            PairLog.e(TAG, String.format("dataCheck failed, provider passkey: %s\nseeker passkey: %s", Integer.valueOf(i2), Integer.valueOf(i)));
            return false;
        }
        try {
            PairLog.d(TAG, "setPairingConfirmation address=" + SensitiveLogUtils.toHiddenIfNeed(this.mPasskeyRequestDevice.getAddress()));
            if (BluetoothNative.getInstance().setPairingConfirmation(this.mPasskeyBroadcastDevice, true)) {
                return true;
            }
            PairLog.e(TAG, "dataCheck failed, confirmation failed");
            return false;
        } catch (Exception e) {
            PairLog.e(TAG, "dataCheck failed, exception: " + e);
            return false;
        }
    }

    private void handlePasskeyRequest() {
        if (!dataCheck()) {
            this.mProtocolEventManager.getTimeOutMonitor().startTiming(1, TIMEOUT_PROVIDER_PASSKEY);
            ConnectionManager.getInstance().sendMessage(null, FPParamFactory.obtain(this.mPasskeyRequestDevice.getAddress(), this.mProtocolEventManager.getConnectivityFlag(), CoreConstants.UUID_CHARACTERISTIC_BLUETOOTH_BOND));
            this.mProtocolEventManager.onConnectFailed(this, this.mPasskeyRequestDevice);
            return;
        }
        this.mProtocolEventManager.onDeviceConnected(this);
        byte[] bArr = new byte[16];
        bArr[0] = 7;
        int i = this.mPasskey;
        bArr[1] = (byte) ((PASSKEY_HEX_FF0000 & i) >> 16);
        bArr[2] = (byte) ((65280 & i) >> 8);
        bArr[3] = (byte) (i & 255);
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        SystemUtils.arraycopy(bArr2, 0, bArr, 4, 12);
        byte[] bArrEncrypt = this.mProtocolEventManager.encrypt(bArr);
        PairLog.d(String.format("rawdata[%s]\nvs[%s]", HexUtils.byteArrayToHexStr(bArr), HexUtils.byteArrayToHexStr(bArrEncrypt)));
        this.mProtocolEventManager.getTimeOutMonitor().startTiming(1, TIMEOUT_PROVIDER_PASSKEY);
        ConnectionManager.getInstance().sendMessage(bArrEncrypt, FPParamFactory.obtain(this.mPasskeyRequestDevice.getAddress(), this.mProtocolEventManager.getConnectivityFlag(), CoreConstants.UUID_CHARACTERISTIC_BLUETOOTH_BOND));
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, "android.bluetooth.device.action.PAIRING_REQUEST");
        xda.a(intentFilter, "android.bluetooth.device.action.BOND_STATE_CHANGED");
        xda.a(intentFilter, "android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.setPriority(1000);
        ConnectionReceiver connectionReceiver = new ConnectionReceiver();
        this.mConnectionReceiver = connectionReceiver;
        connectionReceiver.setCallback(this);
        vgf.a(this.mContext, this.mConnectionReceiver, intentFilter, 2);
    }

    private synchronized void setProviderPassKey(int i) {
        PairLog.d(TAG, "mPasskey: " + this.mPasskey + ", passkey: " + i);
        this.mPasskey = i;
        if (this.mPasskeyRequestRawData == null) {
            PairLog.d(TAG, "get passkey from system, wait for seeker");
        } else {
            handlePasskeyRequest();
        }
    }

    private void unregisterReceiver() {
        ConnectionReceiver connectionReceiver = this.mConnectionReceiver;
        if (connectionReceiver != null) {
            this.mContext.unregisterReceiver(connectionReceiver);
            this.mConnectionReceiver = null;
        }
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    public void close() {
        unregisterReceiver();
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    @Nullable
    public String getIpAddress() {
        return null;
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    @Nullable
    public String getMacAddress() {
        BluetoothDevice bluetoothDevice = this.mPasskeyBroadcastDevice;
        if (bluetoothDevice == null) {
            return null;
        }
        return bluetoothDevice.getAddress();
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    @Nullable
    public String getPairedAddress() {
        return getMacAddress();
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    public void handlePairRequest(byte[] bArr, BluetoothDevice bluetoothDevice) {
        this.mPasskeyRequestRawData = bArr;
        PairLog.d(TAG, "mPasskey: " + this.mPasskey + ", mPasskeyRequestRawData: " + HexUtils.byteArrayToHexStr(this.mPasskeyRequestRawData));
        this.mPasskeyRequestDevice = bluetoothDevice;
        if (this.mPasskey == -1) {
            PairLog.d(TAG, "get passkey from seeker, wait for system");
        } else {
            handlePasskeyRequest();
        }
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.pairing.AbsConnection
    public void init() {
        registerReceiver();
    }

    @Override // com.heytap.accessory.pair.provider.bleserver.receiver.ConnectionReceiver.OnConnectionCallback
    public void onPassKeyGot(int i, BluetoothDevice bluetoothDevice) {
        this.mPasskeyBroadcastDevice = bluetoothDevice;
        PairLog.d("my passkey " + i + " mPasskeyBroadcastDevice addr=" + SensitiveLogUtils.toHiddenIfNeed(this.mPasskeyBroadcastDevice.getAddress()));
        setProviderPassKey(i);
        unregisterReceiver();
    }
}
