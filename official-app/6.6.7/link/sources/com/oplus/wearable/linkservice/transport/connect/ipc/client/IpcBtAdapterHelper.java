package com.oplus.wearable.linkservice.transport.connect.ipc.client;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.os.RemoteException;
import com.oplus.aiunit.vision.uml;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapterListener;
import com.oplus.wearable.linkservice.transport.connect.ipc.server.IpcBtService;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class IpcBtAdapterHelper implements a.d {
    public static IpcBtAdapterHelper c;
    public final a<IpcBtAdapter> a;
    public final IpcBtAdapterListener b = new IpcBtAdapterListener.Stub() { // from class: com.oplus.wearable.linkservice.transport.connect.ipc.client.IpcBtAdapterHelper.1
    };

    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public IpcBtAdapterHelper(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, IpcBtService.class);
        a<IpcBtAdapter> aVar = new a<>("bt", context, intent, new a.e() { // from class: com.oplus.aiunit.vision.sha
            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.client.a.e
            public final Object a(IBinder iBinder) {
                return IpcBtAdapter.Stub.asInterface(iBinder);
            }
        }, new a.f() { // from class: com.oplus.aiunit.vision.tha
            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.client.a.f
            public final void a(IBinder iBinder) {
                this.a.e(iBinder);
            }
        });
        this.a = aVar;
        aVar.p(this);
    }

    public static IpcBtAdapterHelper c(Context context) {
        if (c == null) {
            synchronized (IpcBtAdapterHelper.class) {
                if (c == null) {
                    c = new IpcBtAdapterHelper(context);
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(IBinder iBinder) {
        try {
            IpcBtAdapter.Stub.asInterface(iBinder).setListener(this.b);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void b(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            uml.k("IpcBtAdapterHelper", "connect: api is null");
            return;
        }
        try {
            ipcBtAdapter.socketConnect(bluetoothDevice, parcelUuid);
        } catch (RemoteException e) {
            uml.k("IpcBtAdapterHelper", "socketClose: re " + e);
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public int d(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            uml.k("IpcBtAdapterHelper", "inAvailable: api is null");
            return 0;
        }
        try {
            return ipcBtAdapter.inAvailable(bluetoothDevice, parcelUuid);
        } catch (RemoteException e) {
            uml.k("IpcBtAdapterHelper", "inAvailable: re " + e);
            return 0;
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void f(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            uml.k("IpcBtAdapterHelper", "socketClose: api is null");
            return;
        }
        try {
            ipcBtAdapter.socketClose(bluetoothDevice, parcelUuid);
        } catch (RemoteException e) {
            uml.k("IpcBtAdapterHelper", "socketClose: re " + e);
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public int g(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            uml.k("IpcBtAdapterHelper", "socketRead: api is null");
            return -1;
        }
        try {
            return ipcBtAdapter.socketRead(bluetoothDevice, parcelUuid, bArr, i, i2);
        } catch (RemoteException e) {
            uml.k("IpcBtAdapterHelper", "socketClose: re " + e);
            return -1;
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void h(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            uml.k("IpcBtAdapterHelper", "socketWrite: api is null");
            return;
        }
        try {
            ipcBtAdapter.socketWrite(bluetoothDevice, parcelUuid, bArr, i, i2, z);
        } catch (RemoteException e) {
            uml.k("IpcBtAdapterHelper", "socketClose: re " + e);
        } catch (IllegalStateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.client.a.d
    public void onDead() {
    }
}
