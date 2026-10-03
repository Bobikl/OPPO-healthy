package com.heytap.accessory.connectivity.bt.ipc.server;

import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.RemoteException;
import com.heytap.accessory.connectivity.btipc.IpcBtAdapter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class IpcBtAdapterImpl extends IpcBtAdapter.Stub {
    public static final Object b = new Object();
    public Map<String, a> a = new HashMap();

    @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
    public void a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
        a aVar;
        com.heytap.accessory.base.logging.a.c("IpcBtAdapterImpl", "socketWrite: ");
        String strA = a.a(bluetoothDevice, str);
        try {
            synchronized (b) {
                aVar = this.a.get(strA);
                if (aVar == null) {
                    aVar = new a(bluetoothDevice, str);
                    this.a.put(strA, aVar);
                }
            }
            aVar.a(bArr, i, i2, z);
        } catch (IOException e2) {
            throw new com.heytap.accessory.connectivity.bt.ipc.a(e2);
        }
    }

    @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
    public void b(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
        a aVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.heytap.accessory.base.logging.a.c("IpcBtAdapterImpl", "socketConnect: ");
        try {
            String strA = a.a(bluetoothDevice, str);
            Object obj = b;
            synchronized (obj) {
                aVar = this.a.get(strA);
            }
            if (aVar != null) {
                aVar.a();
            }
            a aVar2 = new a(bluetoothDevice, str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                aVar2.b();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                synchronized (obj) {
                    this.a.put(strA, aVar2);
                }
                com.heytap.accessory.base.logging.a.c("IpcBtAdapterImpl", "socketConnect: success delay=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        } catch (IOException e2) {
            com.heytap.accessory.base.logging.a.b("IpcBtAdapterImpl", "socketConnect: failed delay=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " " + e2.getMessage());
            throw new com.heytap.accessory.connectivity.bt.ipc.a(e2);
        }
    }

    @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
    public int a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2) throws RemoteException {
        a aVar;
        com.heytap.accessory.base.logging.a.c("IpcBtAdapterImpl", "socketRead: ");
        String strA = a.a(bluetoothDevice, str);
        try {
            synchronized (b) {
                aVar = this.a.get(strA);
                if (aVar == null) {
                    aVar = new a(bluetoothDevice, str);
                    this.a.put(strA, aVar);
                }
            }
            return aVar.a(bArr, i, i2);
        } catch (IOException e2) {
            throw new com.heytap.accessory.connectivity.bt.ipc.a(e2);
        }
    }

    @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
    public void a(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
        com.heytap.accessory.base.logging.a.c("IpcBtAdapterImpl", "socketClose: ");
        String strA = a.a(bluetoothDevice, str);
        synchronized (b) {
            a aVarRemove = this.a.remove(strA);
            if (aVarRemove == null) {
                com.heytap.accessory.base.logging.a.a("IpcBtAdapterImpl", "socketClose: not find");
            } else {
                aVarRemove.a();
            }
        }
    }
}
