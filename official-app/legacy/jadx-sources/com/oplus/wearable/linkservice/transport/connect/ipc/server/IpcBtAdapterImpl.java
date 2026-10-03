package com.oplus.wearable.linkservice.transport.connect.ipc.server;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.os.RemoteException;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.m7c;
import com.oplus.aiunit.vision.qy3;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.transport.connect.ipc.IOExceptionWrapper;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter;
import com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapterListener;
import com.oplus.wearable.linkservice.transport.connect.ipc.server.IpcBtAdapterImpl;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class IpcBtAdapterImpl extends IpcBtAdapter.Stub {
    private static final String TAG = "IpcBtAdapterImpl";
    private final m7c<BluetoothDevice, UUID, qy3> mBluetoothSocketMap = new m7c<>();
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
    public static /* synthetic */ boolean lambda$handleClientDied$3(BluetoothDevice bluetoothDevice, UUID uuid, qy3 qy3Var) {
        wil.d(TAG, "handleClientDied: close " + gdb.a(bluetoothDevice.getAddress()));
        qy3Var.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ qy3 lambda$inAvailable$2(BluetoothDevice bluetoothDevice, UUID uuid) {
        return new qy3(bluetoothDevice, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ qy3 lambda$socketRead$1(BluetoothDevice bluetoothDevice, UUID uuid) {
        return new qy3(bluetoothDevice, uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ qy3 lambda$socketWrite$0(BluetoothDevice bluetoothDevice, UUID uuid) {
        return new qy3(bluetoothDevice, uuid);
    }

    public void handleClientDied() {
        wil.d(TAG, "handleClientDied: client died");
        this.mBluetoothSocketMap.a(new m7c.b() { // from class: com.oplus.aiunit.vision.oga
            @Override // com.oplus.aiunit.vision.m7c.b
            public final boolean a(Object obj, Object obj2, Object obj3) {
                return IpcBtAdapterImpl.lambda$handleClientDied$3((BluetoothDevice) obj, (UUID) obj2, (qy3) obj3);
            }
        });
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public int inAvailable(final BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        wil.d(TAG, "inAvailable: ");
        final UUID uuid = parcelUuid.getUuid();
        try {
            return this.mBluetoothSocketMap.c(bluetoothDevice, uuid, new m7c.a() { // from class: com.oplus.aiunit.vision.pga
                @Override // com.oplus.aiunit.vision.m7c.a
                public final Object create() {
                    return IpcBtAdapterImpl.lambda$inAvailable$2(bluetoothDevice, uuid);
                }
            }).d();
        } catch (IOException e2) {
            throw new IOExceptionWrapper(e2);
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public void setListener(IpcBtAdapterListener ipcBtAdapterListener) throws RemoteException {
        wil.d(TAG, "setListener: listener = " + ipcBtAdapterListener.asBinder());
        this.mListener = ipcBtAdapterListener;
        try {
            ipcBtAdapterListener.asBinder().linkToDeath(this.mDeathRecipient, 0);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public void socketClose(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        wil.d(TAG, "socketClose: ");
        qy3 qy3VarE = this.mBluetoothSocketMap.e(bluetoothDevice, parcelUuid.getUuid());
        if (qy3VarE != null) {
            qy3VarE.a();
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public void socketConnect(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        wil.d(TAG, "socketConnect: ");
        try {
            UUID uuid = parcelUuid.getUuid();
            qy3 qy3VarB = this.mBluetoothSocketMap.b(bluetoothDevice, uuid);
            if (qy3VarB != null) {
                qy3VarB.a();
            }
            qy3 qy3Var = new qy3(bluetoothDevice, uuid);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                qy3Var.c();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                this.mBluetoothSocketMap.d(bluetoothDevice, uuid, qy3Var);
                wil.d(TAG, "socketConnect: success delay=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        } catch (IOException e2) {
            wil.b(TAG, "socketConnect: failed delay=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " " + e2.getMessage());
            throw new IOExceptionWrapper(e2);
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public int socketRead(final BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws RemoteException {
        wil.d(TAG, "socketRead: ");
        final UUID uuid = parcelUuid.getUuid();
        try {
            return this.mBluetoothSocketMap.c(bluetoothDevice, uuid, new m7c.a() { // from class: com.oplus.aiunit.vision.nga
                @Override // com.oplus.aiunit.vision.m7c.a
                public final Object create() {
                    return IpcBtAdapterImpl.lambda$socketRead$1(bluetoothDevice, uuid);
                }
            }).e(bArr, i, i2);
        } catch (IOException e2) {
            throw new IOExceptionWrapper(e2);
        }
    }

    @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
    public void socketWrite(final BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
        wil.d(TAG, "socketWrite: ");
        final UUID uuid = parcelUuid.getUuid();
        try {
            this.mBluetoothSocketMap.c(bluetoothDevice, uuid, new m7c.a() { // from class: com.oplus.aiunit.vision.mga
                @Override // com.oplus.aiunit.vision.m7c.a
                public final Object create() {
                    return IpcBtAdapterImpl.lambda$socketWrite$0(bluetoothDevice, uuid);
                }
            }).f(bArr, i, i2, z);
        } catch (IOException e2) {
            throw new IOExceptionWrapper(e2);
        }
    }
}
