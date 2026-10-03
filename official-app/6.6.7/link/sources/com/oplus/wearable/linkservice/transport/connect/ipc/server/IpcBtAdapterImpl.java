package com.oplus.wearable.linkservice.transport.connect.ipc.server;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.os.RemoteException;
import com.oplus.aiunit.vision.c9c;
import com.oplus.aiunit.vision.dz3;
import com.oplus.aiunit.vision.uml;
import com.oplus.aiunit.vision.veb;
import com.oplus.wearable.linkservice.transport.connect.ipc.IOExceptionWrapper;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapterListener;
import com.oplus.wearable.linkservice.transport.connect.ipc.server.IpcBtAdapterImpl;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class IpcBtAdapterImpl extends IpcBtAdapter.Stub {
    private static final String TAG = "IpcBtAdapterImpl";
    private final c9c<BluetoothDevice, UUID, dz3> mBluetoothSocketMap = new c9c<>();
    private final IBinder.DeathRecipient mDeathRecipient = new a();
    private IpcBtAdapterListener mListener;

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpcBtAdapterListener ipcBtAdapterListener = IpcBtAdapterImpl.this.mListener;
            if (ipcBtAdapterListener != null) {
                ipcBtAdapterListener.asBinder().unlinkToDeath(this, 0);
            }
            IpcBtAdapterImpl.this.handleClientDied();
            IpcBtAdapterImpl.this.mListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$handleClientDied$3(BluetoothDevice bluetoothDevice, UUID uuid, dz3 dz3Var) {
        uml.d(TAG, "handleClientDied: close " + veb.a(bluetoothDevice.getAddress()));
        dz3Var.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dz3 lambda$inAvailable$2(BluetoothDevice bluetoothDevice, UUID uuid) {
        return new dz3(bluetoothDevice, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dz3 lambda$socketRead$1(BluetoothDevice bluetoothDevice, UUID uuid) {
        return new dz3(bluetoothDevice, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dz3 lambda$socketWrite$0(BluetoothDevice bluetoothDevice, UUID uuid) {
        return new dz3(bluetoothDevice, uuid);
    }

    public void handleClientDied() {
        uml.d(TAG, "handleClientDied: client died");
        this.mBluetoothSocketMap.a(new c9c.b() { // from class: com.oplus.aiunit.vision.wha
            @Override // com.oplus.aiunit.vision.c9c.b
            public final boolean a(Object obj, Object obj2, Object obj3) {
                return IpcBtAdapterImpl.lambda$handleClientDied$3((BluetoothDevice) obj, (UUID) obj2, (dz3) obj3);
            }
        });
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public int inAvailable(final BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        uml.d(TAG, "inAvailable: ");
        final UUID uuid = parcelUuid.getUuid();
        try {
            return this.mBluetoothSocketMap.c(bluetoothDevice, uuid, new c9c.a() { // from class: com.oplus.aiunit.vision.xha
                @Override // com.oplus.aiunit.vision.c9c.a
                public final Object create() {
                    return IpcBtAdapterImpl.lambda$inAvailable$2(bluetoothDevice, uuid);
                }
            }).d();
        } catch (IOException e) {
            throw new IOExceptionWrapper(e);
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public void setListener(IpcBtAdapterListener ipcBtAdapterListener) throws RemoteException {
        uml.d(TAG, "setListener: listener = " + ipcBtAdapterListener.asBinder());
        this.mListener = ipcBtAdapterListener;
        try {
            ipcBtAdapterListener.asBinder().linkToDeath(this.mDeathRecipient, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public void socketClose(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        uml.d(TAG, "socketClose: ");
        dz3 dz3VarE = this.mBluetoothSocketMap.e(bluetoothDevice, parcelUuid.getUuid());
        if (dz3VarE != null) {
            dz3VarE.a();
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public void socketConnect(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        uml.d(TAG, "socketConnect: ");
        try {
            UUID uuid = parcelUuid.getUuid();
            dz3 dz3VarB = this.mBluetoothSocketMap.b(bluetoothDevice, uuid);
            if (dz3VarB != null) {
                dz3VarB.a();
            }
            dz3 dz3Var = new dz3(bluetoothDevice, uuid);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                dz3Var.c();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                this.mBluetoothSocketMap.d(bluetoothDevice, uuid, dz3Var);
                uml.d(TAG, "socketConnect: success delay=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        } catch (IOException e) {
            uml.b(TAG, "socketConnect: failed delay=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " " + e.getMessage());
            throw new IOExceptionWrapper(e);
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public int socketRead(final BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws RemoteException {
        uml.d(TAG, "socketRead: ");
        final UUID uuid = parcelUuid.getUuid();
        try {
            return this.mBluetoothSocketMap.c(bluetoothDevice, uuid, new c9c.a() { // from class: com.oplus.aiunit.vision.vha
                @Override // com.oplus.aiunit.vision.c9c.a
                public final Object create() {
                    return IpcBtAdapterImpl.lambda$socketRead$1(bluetoothDevice, uuid);
                }
            }).e(bArr, i, i2);
        } catch (IOException e) {
            throw new IOExceptionWrapper(e);
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public void socketWrite(final BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
        uml.d(TAG, "socketWrite: ");
        final UUID uuid = parcelUuid.getUuid();
        try {
            this.mBluetoothSocketMap.c(bluetoothDevice, uuid, new c9c.a() { // from class: com.oplus.aiunit.vision.uha
                @Override // com.oplus.aiunit.vision.c9c.a
                public final Object create() {
                    return IpcBtAdapterImpl.lambda$socketWrite$0(bluetoothDevice, uuid);
                }
            }).f(bArr, i, i2, z);
        } catch (IOException e) {
            throw new IOExceptionWrapper(e);
        }
    }
}
