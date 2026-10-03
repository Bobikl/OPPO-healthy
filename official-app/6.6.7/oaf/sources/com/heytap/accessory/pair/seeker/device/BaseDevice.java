package com.heytap.accessory.pair.seeker.device;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import com.heytap.accessory.accessorymanager.AccessoryManager;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.seeker.IDeviceEvent;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.utils.ByteUtils;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.MD5Utils;
import com.heytap.accessory.security.deviceId.DeviceIdFactory;
import com.oplus.aiunit.vision.e88;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class BaseDevice {
    public static final int RUN_TYPE_PAIR = 2;
    private static final String TAG = "BaseDevice";
    private static boolean sUseSysOaf;
    private Map<String, byte[]> mAliasToKscMap;
    private final String mBluetoothName;
    int mConnectivityFlag;
    private IDeviceEvent mDeviceEvent;
    private byte[] mLocalDeviceId;
    private String mMac;
    private byte[] mRemoteDeviceId;
    protected final String mTag;
    private Map<Integer, String> mTypeToAliasMap;
    AbsWorker mWorker;
    private int mState = -1;
    private int mErrorCode = 0;

    public BaseDevice(BluetoothDevice bluetoothDevice) {
        this.mMac = bluetoothDevice.getAddress();
        this.mBluetoothName = bluetoothDevice.getName();
        this.mTag = HexUtils.byteArrayToHexStr(MD5Utils.md5(this.mMac.getBytes(), 16));
        if (!sUseSysOaf) {
            this.mLocalDeviceId = DeviceIdFactory.getIDeviceIdFetcher().loadDeviceId(e88.a());
            PairLog.e(TAG, "oaf deviceId=" + this.mLocalDeviceId);
            return;
        }
        try {
            this.mLocalDeviceId = AccessoryManager.getInstance(PlatformUtils.getContext(), null).getLocalDeviceId();
            PairLog.e(TAG, "sys oaf deviceId=" + this.mLocalDeviceId);
        } catch (Exception unused) {
            PairLog.e(TAG, "sys oaf deviceId error");
        }
    }

    public static void setUseSysOaf(boolean z) {
        sUseSysOaf = z;
    }

    public abstract void cancel(int i);

    public void changeState(int i) {
        if (this.mState != i) {
            PairLog.i(TAG, "setState, from: " + this.mState + ", to: " + i + ", device: " + this);
        }
        this.mState = i;
    }

    public String getBluetoothName() {
        return this.mBluetoothName;
    }

    public int getConnectivityFlag() {
        return this.mConnectivityFlag;
    }

    public String getDetail() {
        return TAG + toString();
    }

    public IDeviceEvent getDeviceEvent() {
        return this.mDeviceEvent;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public Map<String, byte[]> getKscAlias() {
        return this.mAliasToKscMap;
    }

    public byte[] getLocalDeviceId() {
        return this.mLocalDeviceId;
    }

    public String getMac() {
        return this.mMac;
    }

    public String getName() {
        return this.mBluetoothName;
    }

    public int getPairType() {
        AbsWorker absWorker = this.mWorker;
        if (absWorker != null) {
            return absWorker.mFlags;
        }
        return -1;
    }

    public byte[] getRemoteDeviceId() {
        return this.mRemoteDeviceId;
    }

    public int getState() {
        return this.mState;
    }

    public String getTag() {
        return this.mTag;
    }

    public Map<Integer, String> getTypeAlias() {
        return this.mTypeToAliasMap;
    }

    public AbsWorker getWorker() {
        return this.mWorker;
    }

    public boolean isAvailable() {
        return true;
    }

    public void notifyIntegrator(int i) {
        notifyIntegrator(i, null, -1);
    }

    public void onFinished(int i) {
        PairLog.i(TAG, "onFinished errorCode: " + i);
        this.mErrorCode = i;
    }

    public abstract void run(int i);

    public void setDeviceEvent(IDeviceEvent iDeviceEvent) {
        PairLog.i(TAG, "setDeviceEvent, IDeviceEvent: " + iDeviceEvent + ", device: " + this);
        this.mDeviceEvent = iDeviceEvent;
    }

    public void setKscAlias(Map<String, byte[]> map) {
        this.mAliasToKscMap = map;
    }

    public void setRemoteDeviceId(byte[] bArr) {
        if (ByteUtils.isEmpty(bArr) || bArr.length != 6) {
            throw new IllegalArgumentException("invalid deviceId length must be 6");
        }
        this.mRemoteDeviceId = bArr;
    }

    public int setStateData(int i, byte[] bArr) {
        return 0;
    }

    public void setTypeAlias(Map<Integer, String> map) {
        this.mTypeToAliasMap = map;
    }

    public void startRunning(int i) {
        run(i);
    }

    public String toString() {
        return "{ tag: " + SensitiveLogUtils.toHiddenIfNeed(getTag()) + " name: " + getName() + " bt_name: " + getBluetoothName() + " }";
    }

    public void notifyIntegrator(int i, Bundle bundle) {
        notifyIntegrator(i, bundle, -1);
    }

    public synchronized void startRunning() {
        startRunning(2);
        PairLog.i(TAG, "startRunning");
    }

    public void notifyIntegrator(int i, byte b) {
        notifyIntegrator(i, null, b);
    }

    public void notifyIntegrator(int i, Bundle bundle, int i2) {
        PairLog.i(TAG, "notifyIntegrator state:" + i);
        IDeviceEvent deviceEvent = getDeviceEvent();
        if (deviceEvent == null) {
            PairLog.e(TAG, "notifyIntegrator failed, state: " + i + ", deviceEvent is null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(IDeviceEvent.FLAG_MAC, getTag());
        if (i == 4) {
            bundle.putInt(IDeviceEvent.FLAG_AUTHENTICATE_MODE, i2);
        }
        changeState(i);
        deviceEvent.send(i, bundle);
    }
}
