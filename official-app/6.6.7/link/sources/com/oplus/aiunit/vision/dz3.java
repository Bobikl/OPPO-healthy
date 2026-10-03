package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class dz3 {
    public final BluetoothDevice a;
    public final UUID b;
    public BluetoothSocket c;

    public dz3(BluetoothDevice bluetoothDevice, UUID uuid) {
        this.a = bluetoothDevice;
        this.b = uuid;
    }

    public synchronized void a() {
        BluetoothSocket bluetoothSocket = this.c;
        if (bluetoothSocket != null) {
            try {
                b(bluetoothSocket.getOutputStream());
                b(this.c.getInputStream());
                b(this.c);
                this.c = null;
            } catch (IOException unused) {
            }
        }
    }

    public void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public synchronized void c() throws IOException {
        BluetoothSocket bluetoothSocket = this.c;
        if (bluetoothSocket != null) {
            bluetoothSocket.close();
        }
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = this.a.createRfcommSocketToServiceRecord(this.b);
        this.c = bluetoothSocketCreateRfcommSocketToServiceRecord;
        bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
    }

    public int d() throws IOException {
        BluetoothSocket bluetoothSocket = this.c;
        if (bluetoothSocket != null) {
            return bluetoothSocket.getInputStream().available();
        }
        uml.k("ConnectionRecorder", "inAvailable: ");
        return 0;
    }

    public int e(byte[] bArr, int i, int i2) throws IOException {
        if (this.c == null) {
            c();
        }
        return this.c.getInputStream().read(bArr, i, i2);
    }

    public void f(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (this.c == null) {
            c();
        }
        OutputStream outputStream = this.c.getOutputStream();
        outputStream.write(bArr, i, i2);
        if (z) {
            outputStream.flush();
        }
    }
}
