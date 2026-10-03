package com.heytap.accessory.connectivity.bt.ipc.client;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.accessory.connectivity.bt.ipc.server.IpcBtService;
import com.heytap.accessory.connectivity.btipc.IpcBtAdapter;

/* JADX INFO: loaded from: classes14.dex */
public class b implements a.d {
    public static volatile b b;
    public final a<IpcBtAdapter> a;

    public b(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, IpcBtService.class);
        a<IpcBtAdapter> aVar = new a<>("IpcBtAdapterHelper", context, intent, new a.e() { // from class: com.oplus.aiunit.vision.afm
            @Override // com.heytap.accessory.connectivity.bt.ipc.client.a.e
            public final Object a(IBinder iBinder) {
                return IpcBtAdapter.Stub.a(iBinder);
            }
        }, new a.f() { // from class: com.oplus.aiunit.vision.hfm
            @Override // com.heytap.accessory.connectivity.bt.ipc.client.a.f
            public final void a(IBinder iBinder) {
                com.heytap.accessory.connectivity.bt.ipc.client.b.a(iBinder);
            }
        });
        this.a = aVar;
        aVar.a(this);
    }

    @Override // com.heytap.accessory.connectivity.bt.ipc.client.a.d
    public void a() {
    }

    public void b(BluetoothDevice bluetoothDevice, String str) throws Exception {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.d();
        if (ipcBtAdapter != null) {
            ipcBtAdapter.a(bluetoothDevice, str);
        }
    }

    public static /* synthetic */ void a(IBinder iBinder) {
    }

    public static b a(Context context) {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(context);
                }
            }
        }
        return b;
    }

    public void a(BluetoothDevice bluetoothDevice, String str) throws Exception {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.d();
        if (ipcBtAdapter != null) {
            ipcBtAdapter.b(bluetoothDevice, str);
        }
    }

    public void a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2, boolean z) throws Exception {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.d();
        if (ipcBtAdapter != null) {
            ipcBtAdapter.a(bluetoothDevice, str, bArr, i, i2, z);
        }
    }

    public int a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2) throws RemoteException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.d();
        if (ipcBtAdapter != null) {
            return ipcBtAdapter.a(bluetoothDevice, str, bArr, i, i2);
        }
        return -1;
    }
}
