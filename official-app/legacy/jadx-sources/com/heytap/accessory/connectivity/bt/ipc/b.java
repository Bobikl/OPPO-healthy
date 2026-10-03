package com.heytap.accessory.connectivity.bt.ipc;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static void a(Context context, BluetoothDevice bluetoothDevice, UUID uuid, byte[] bArr, int i, int i2, boolean z) throws Exception {
        com.heytap.accessory.base.logging.a.a("IpcBtSocket", "write: ");
        com.heytap.accessory.connectivity.bt.ipc.client.b.a(context).a(bluetoothDevice, uuid.toString(), bArr, i, i2, z);
    }

    public static void b(Context context, BluetoothDevice bluetoothDevice, UUID uuid) throws Exception {
        com.heytap.accessory.base.logging.a.a("IpcBtSocket", "connect: ");
        com.heytap.accessory.connectivity.bt.ipc.client.b.a(context).a(bluetoothDevice, uuid.toString());
    }

    public static int a(Context context, BluetoothDevice bluetoothDevice, UUID uuid, byte[] bArr, int i, int i2) throws Exception {
        com.heytap.accessory.base.logging.a.a("IpcBtSocket", "read: ");
        return com.heytap.accessory.connectivity.bt.ipc.client.b.a(context).a(bluetoothDevice, uuid.toString(), bArr, i, i2);
    }

    public static void a(Context context, BluetoothDevice bluetoothDevice, UUID uuid) throws Exception {
        com.heytap.accessory.base.logging.a.a("IpcBtSocket", "close: ");
        com.heytap.accessory.connectivity.bt.ipc.client.b.a(context).b(bluetoothDevice, uuid.toString());
    }
}
