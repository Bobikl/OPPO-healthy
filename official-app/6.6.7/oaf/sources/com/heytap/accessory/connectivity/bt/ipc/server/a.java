package com.heytap.accessory.connectivity.bt.ipc.server;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public final BluetoothDevice a;
    public final String b;
    public BluetoothSocket c;

    public a(BluetoothDevice bluetoothDevice, String str) {
        this.a = bluetoothDevice;
        this.b = str;
    }

    public static String a(BluetoothDevice bluetoothDevice, String str) {
        return bluetoothDevice.getAddress() + "@" + str;
    }

    public synchronized void b() throws IOException {
        BluetoothSocket bluetoothSocket = this.c;
        if (bluetoothSocket != null) {
            bluetoothSocket.close();
        }
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = this.a.createRfcommSocketToServiceRecord(UUID.fromString(this.b));
        this.c = bluetoothSocketCreateRfcommSocketToServiceRecord;
        bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
    }

    public void a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (this.c == null) {
            b();
        }
        OutputStream outputStream = this.c.getOutputStream();
        outputStream.write(bArr, i, i2);
        if (z) {
            outputStream.flush();
        }
    }

    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.c == null) {
            b();
        }
        return this.c.getInputStream().read(bArr, i, i2);
    }

    public synchronized void a() {
        BluetoothSocket bluetoothSocket = this.c;
        if (bluetoothSocket != null) {
            try {
                a(bluetoothSocket.getOutputStream());
                a(this.c.getInputStream());
                a(this.c);
                this.c = null;
            } catch (IOException unused) {
            }
        }
    }

    public void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
