package com.oplus.wearable.linkservice.transport.connect.ipc.client;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.os.RemoteException;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapterListener;
import com.oplus.wearable.linkservice.transport.connect.ipc.server.IpcBtService;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class IpcBtAdapterHelper implements a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static IpcBtAdapterHelper f20151c;
    public final a<IpcBtAdapter> a;
    public final IpcBtAdapterListener b = new IpcBtAdapterListener.Stub() { // from class: com.oplus.wearable.linkservice.transport.connect.ipc.client.IpcBtAdapterHelper.1
    };

    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public IpcBtAdapterHelper(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, IpcBtService.class);
        a<IpcBtAdapter> aVar = new a<>("bt", context, intent, new a.e() { // from class: com.oplus.aiunit.vision.kga
            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.client.a.e
            public final Object a(IBinder iBinder) {
                return IpcBtAdapter.Stub.asInterface(iBinder);
            }
        }, new a.f() { // from class: com.oplus.aiunit.vision.lga
            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.client.a.f
            public final void a(IBinder iBinder) {
                this.a.e(iBinder);
            }
        });
        this.a = aVar;
        aVar.p(this);
    }

    public static IpcBtAdapterHelper c(Context context) {
        if (f20151c == null) {
            synchronized (IpcBtAdapterHelper.class) {
                if (f20151c == null) {
                    f20151c = new IpcBtAdapterHelper(context);
                }
            }
        }
        return f20151c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(IBinder iBinder) {
        try {
            IpcBtAdapter.Stub.asInterface(iBinder).setListener(this.b);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public void b(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            wil.k("IpcBtAdapterHelper", "connect: api is null");
            return;
        }
        try {
            ipcBtAdapter.socketConnect(bluetoothDevice, parcelUuid);
        } catch (RemoteException e2) {
            wil.k("IpcBtAdapterHelper", "socketClose: re " + e2);
        } catch (IllegalStateException e3) {
            throw new IOException(e3.getMessage());
        }
    }

    public int d(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            wil.k("IpcBtAdapterHelper", "inAvailable: api is null");
            return 0;
        }
        try {
            return ipcBtAdapter.inAvailable(bluetoothDevice, parcelUuid);
        } catch (RemoteException e2) {
            wil.k("IpcBtAdapterHelper", "inAvailable: re " + e2);
            return 0;
        } catch (IllegalStateException e3) {
            throw new IOException(e3.getMessage());
        }
    }

    public void f(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            wil.k("IpcBtAdapterHelper", "socketClose: api is null");
            return;
        }
        try {
            ipcBtAdapter.socketClose(bluetoothDevice, parcelUuid);
        } catch (RemoteException e2) {
            wil.k("IpcBtAdapterHelper", "socketClose: re " + e2);
        } catch (IllegalStateException e3) {
            throw new IOException(e3.getMessage());
        }
    }

    public int g(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            wil.k("IpcBtAdapterHelper", "socketRead: api is null");
            return -1;
        }
        try {
            return ipcBtAdapter.socketRead(bluetoothDevice, parcelUuid, bArr, i, i2);
        } catch (RemoteException e2) {
            wil.k("IpcBtAdapterHelper", "socketClose: re " + e2);
            return -1;
        } catch (IllegalStateException e3) {
            throw new IOException(e3.getMessage());
        }
    }

    public void h(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws IOException {
        IpcBtAdapter ipcBtAdapter = (IpcBtAdapter) this.a.s();
        if (ipcBtAdapter == null) {
            wil.k("IpcBtAdapterHelper", "socketWrite: api is null");
            return;
        }
        try {
            ipcBtAdapter.socketWrite(bluetoothDevice, parcelUuid, bArr, i, i2, z);
        } catch (RemoteException e2) {
            wil.k("IpcBtAdapterHelper", "socketClose: re " + e2);
        } catch (IllegalStateException e3) {
            throw new IOException(e3.getMessage());
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.client.a.d
    public void onDead() {
    }
}
