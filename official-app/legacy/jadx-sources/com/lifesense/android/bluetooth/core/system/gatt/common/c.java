package com.lifesense.android.bluetooth.core.system.gatt.common;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class c {
    public static BluetoothGattCharacteristic a(String str, Queue<BluetoothGattCharacteristic> queue) {
        if (queue == null || queue.size() == 0 || str == null) {
            return null;
        }
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : queue) {
            if (bluetoothGattCharacteristic.getUuid() != null && com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid()).equalsIgnoreCase(str)) {
                return bluetoothGattCharacteristic;
            }
        }
        return null;
    }

    public static boolean b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic != null && 2 == (bluetoothGattCharacteristic.getProperties() & 2);
    }

    public static boolean c(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        int properties = bluetoothGattCharacteristic.getProperties();
        return 8 == (properties & 8) || 4 == (properties & 4) || 64 == (properties & 64);
    }

    public static BluetoothGattCharacteristic a(List<BluetoothGattService> list, UUID uuid) {
        if (list == null || list.size() == 0 || uuid == null) {
            return null;
        }
        for (BluetoothGattService bluetoothGattService : list) {
            if (bluetoothGattService.getCharacteristics() != null) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                    if (bluetoothGattCharacteristic.getUuid() != null && bluetoothGattCharacteristic.getUuid().equals(uuid)) {
                        return bluetoothGattCharacteristic;
                    }
                }
            }
        }
        return null;
    }

    public static String a(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
        StringBuilder sb;
        String string;
        StringBuilder sb2;
        if (bluetoothGattCharacteristic == null) {
            return "null";
        }
        try {
            if (bluetoothGattCharacteristic.getService() == null) {
                return "service=null";
            }
            String strA = com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getService().getUuid());
            String strA2 = com.lifesense.android.bluetooth.core.tools.a.a(bluetoothGattCharacteristic.getUuid());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("characteristic=" + strA2 + "[" + strA + "]; ");
            int properties = bluetoothGattCharacteristic.getProperties();
            if ("Enable".equalsIgnoreCase(str)) {
                if ((properties & 32) == 32) {
                    sb2 = new StringBuilder();
                    sb2.append("indicate:");
                } else {
                    if ((properties & 16) == 16) {
                        sb2 = new StringBuilder();
                        sb2.append("notify:");
                    } else {
                        string = "";
                    }
                    sb = new StringBuilder();
                    sb.append("propertis=");
                    sb.append(str);
                    sb.append("[");
                    sb.append(string);
                    sb.append("]");
                }
                sb2.append(properties);
                string = sb2.toString();
                sb = new StringBuilder();
                sb.append("propertis=");
                sb.append(str);
                sb.append("[");
                sb.append(string);
                sb.append("]");
            } else {
                sb = new StringBuilder();
                sb.append("propertis=");
                sb.append(str);
                sb.append("[");
                sb.append(properties);
                sb.append("]");
            }
            stringBuffer.append(sb.toString());
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception...";
        }
    }

    public static boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        int properties = bluetoothGattCharacteristic.getProperties();
        return 32 == (properties & 32) || 16 == (properties & 16);
    }
}
