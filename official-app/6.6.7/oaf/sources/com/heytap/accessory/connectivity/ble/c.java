package com.heytap.accessory.connectivity.ble;

import android.bluetooth.BluetoothGatt;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static volatile c b;
    public Map<String, BluetoothGatt> a = new ArrayMap();

    public static c a() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public boolean b(String str) {
        return this.a.get(str) != null;
    }

    public void c(String str) {
        this.a.remove(str);
    }

    public BluetoothGatt a(String str) {
        return this.a.get(str);
    }

    public void a(BluetoothGatt bluetoothGatt) {
        this.a.put(bluetoothGatt.getDevice().getAddress(), bluetoothGatt);
    }
}
