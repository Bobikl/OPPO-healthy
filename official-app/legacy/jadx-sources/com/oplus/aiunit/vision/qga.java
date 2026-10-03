package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.ParcelUuid;
import com.oplus.wearable.linkservice.transport.connect.ipc.client.IpcBtAdapterHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class qga {
    public static void a(Context context, BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        wil.a("IpcBtSocket", "close: ");
        IpcBtAdapterHelper.c(context).f(bluetoothDevice, parcelUuid);
    }

    public static void b(Context context, BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        wil.a("IpcBtSocket", "connect: ");
        IpcBtAdapterHelper.c(context).b(bluetoothDevice, parcelUuid);
    }

    public static int c(Context context, BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        wil.a("IpcBtSocket", "inAvailable: ");
        return IpcBtAdapterHelper.c(context).d(bluetoothDevice, parcelUuid);
    }

    public static int d(Context context, BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws IOException {
        wil.a("IpcBtSocket", "read: ");
        return IpcBtAdapterHelper.c(context).g(bluetoothDevice, parcelUuid, bArr, i, i2);
    }

    public static void e(Context context, BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws IOException {
        wil.a("IpcBtSocket", "write: ");
        IpcBtAdapterHelper.c(context).h(bluetoothDevice, parcelUuid, bArr, i, i2, z);
    }
}
