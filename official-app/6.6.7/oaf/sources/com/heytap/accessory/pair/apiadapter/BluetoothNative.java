package com.heytap.accessory.pair.apiadapter;

import android.bluetooth.BluetoothDevice;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.pair.logging.PairLog;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class BluetoothNative {
    private static final String TAG = "BluetoothNative";
    private static BluetoothNative mInstace;
    private IBluetoothAdapter mBluetoothAdapter;

    private BluetoothNative() {
    }

    public static BluetoothNative getInstance() {
        if (mInstace == null) {
            synchronized (BluetoothNative.class) {
                if (mInstace == null) {
                    mInstace = new BluetoothNative();
                }
            }
        }
        return mInstace;
    }

    public boolean cancelBondProcess(BluetoothDevice bluetoothDevice) {
        IBluetoothAdapter iBluetoothAdapter = this.mBluetoothAdapter;
        if (iBluetoothAdapter != null) {
            return iBluetoothAdapter.cancelBondProcess(bluetoothDevice);
        }
        PairLog.e(TAG, "BluetoothNative is not initialized, please use cancelBondProcess() after init()");
        return false;
    }

    public String getAddress() {
        return ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS;
    }

    public void init(IBluetoothAdapter iBluetoothAdapter) {
        this.mBluetoothAdapter = iBluetoothAdapter;
    }

    public boolean removeBond(BluetoothDevice bluetoothDevice) {
        IBluetoothAdapter iBluetoothAdapter = this.mBluetoothAdapter;
        if (iBluetoothAdapter != null) {
            return iBluetoothAdapter.removeBond(bluetoothDevice);
        }
        PairLog.e(TAG, "BluetoothNative is not initialized, please use cancelBond() after init()");
        return false;
    }

    public boolean setPairingConfirmation(BluetoothDevice bluetoothDevice, boolean z) {
        IBluetoothAdapter iBluetoothAdapter = this.mBluetoothAdapter;
        if (iBluetoothAdapter != null) {
            return iBluetoothAdapter.setPairingConfirmation(bluetoothDevice, z);
        }
        PairLog.e(TAG, "BluetoothNative is not initialized, please use setPairingConfirmation() after init()");
        return false;
    }
}
