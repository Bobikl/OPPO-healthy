package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class qy3 {
    public final BluetoothDevice a;
    public final UUID b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothSocket f15984c;

    public qy3(BluetoothDevice bluetoothDevice, UUID uuid) {
        this.a = bluetoothDevice;
        this.b = uuid;
    }

    public synchronized void a() {
        BluetoothSocket bluetoothSocket = this.f15984c;
        if (bluetoothSocket != null) {
            try {
                b(bluetoothSocket.getOutputStream());
                b(this.f15984c.getInputStream());
                b(this.f15984c);
                this.f15984c = null;
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
        BluetoothSocket bluetoothSocket = this.f15984c;
        if (bluetoothSocket != null) {
            bluetoothSocket.close();
        }
        BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = this.a.createRfcommSocketToServiceRecord(this.b);
        this.f15984c = bluetoothSocketCreateRfcommSocketToServiceRecord;
        bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
    }

    public int d() throws IOException {
        BluetoothSocket bluetoothSocket = this.f15984c;
        if (bluetoothSocket != null) {
            return bluetoothSocket.getInputStream().available();
        }
        wil.k("ConnectionRecorder", "inAvailable: ");
        return 0;
    }

    public int e(byte[] bArr, int i, int i2) throws IOException {
        if (this.f15984c == null) {
            c();
        }
        return this.f15984c.getInputStream().read(bArr, i, i2);
    }

    public void f(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (this.f15984c == null) {
            c();
        }
        OutputStream outputStream = this.f15984c.getOutputStream();
        outputStream.write(bArr, i, i2);
        if (z) {
            outputStream.flush();
        }
    }
}
