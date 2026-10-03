package com.lifesense.plugin.ble.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public class s {
    public static BluetoothGattCharacteristic a(String str, Queue queue) {
        if (queue == null || queue.size() == 0 || str == null) {
            return null;
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
            if (bluetoothGattCharacteristic.getUuid() != null && com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getUuid()).equalsIgnoreCase(str)) {
                return bluetoothGattCharacteristic;
            }
        }
        return null;
    }

    public static boolean b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        int properties = bluetoothGattCharacteristic.getProperties();
        return 8 == (properties & 8) || 4 == (properties & 4) || 64 == (properties & 64);
    }

    public static boolean c(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        int properties = bluetoothGattCharacteristic.getProperties();
        return 32 == (properties & 32) || 16 == (properties & 16);
    }

    public static BluetoothGattCharacteristic a(List list, UUID uuid) {
        if (list == null || list.size() == 0 || uuid == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BluetoothGattService bluetoothGattService = (BluetoothGattService) it.next();
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
        String str2;
        StringBuilder sb;
        if (bluetoothGattCharacteristic == null) {
            return "null";
        }
        try {
            if (bluetoothGattCharacteristic.getService() == null) {
                return "service=null";
            }
            String strA = com.lifesense.plugin.ble.c.b.a(bluetoothGattCharacteristic.getService().getUuid());
            String string = bluetoothGattCharacteristic.getUuid().toString();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("UUID =" + string + "[" + strA + "]; ");
            int properties = bluetoothGattCharacteristic.getProperties();
            if ("Enable".equalsIgnoreCase(str)) {
                String string2 = "";
                if ((properties & 32) == 32) {
                    sb = new StringBuilder();
                    sb.append("Indicate[");
                    sb.append(properties);
                    sb.append("]");
                } else {
                    if ((properties & 16) == 16) {
                        sb = new StringBuilder();
                        sb.append("Notify[");
                        sb.append(properties);
                        sb.append("]");
                    }
                    str2 = "propertis=" + string2;
                }
                string2 = sb.toString();
                str2 = "propertis=" + string2;
            } else {
                str2 = "propertis=" + str + "[" + properties + "]";
            }
            stringBuffer.append(str2);
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception...";
        }
    }

    public static boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic != null && 2 == (bluetoothGattCharacteristic.getProperties() & 2);
    }
}
