package com.omron;

import android.bluetooth.BluetoothDevice;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    public static boolean a(Class<?> cls, BluetoothDevice bluetoothDevice) throws Exception {
        Boolean bool = (Boolean) cls.getMethod("cancelBondProcess", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        Log.e("ClsUtils", "ClsUtils cancelBondProcess returnValue " + bool + "---" + bluetoothDevice.getName());
        return bool.booleanValue();
    }

    public static boolean b(Class<?> cls, BluetoothDevice bluetoothDevice) throws Exception {
        Boolean bool = (Boolean) cls.getMethod("cancelPairingUserInput", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        Log.e("ClsUtils", "ClsUtils cancelPairingUserInput returnValue " + bool + "---" + bluetoothDevice.getName());
        return bool.booleanValue();
    }

    public static boolean c(Class cls, BluetoothDevice bluetoothDevice) throws Exception {
        Boolean bool = (Boolean) cls.getMethod("createBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        Log.e("ClsUtils", "与设备配对 ClsUtils createBond returnValue: " + bool + "---" + bluetoothDevice.getName());
        return bool.booleanValue();
    }
}
