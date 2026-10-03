package com.oplus.wearable.linkservice.transport.connect.ipc;

import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IpcBtAdapter extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter";

    public static class Default implements IpcBtAdapter {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
        public int inAvailable(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
        public void setListener(IpcBtAdapterListener ipcBtAdapterListener) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
        public void socketClose(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
        public void socketConnect(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
        public int socketRead(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
        public void socketWrite(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IpcBtAdapter {
        static final int TRANSACTION_inAvailable = 6;
        static final int TRANSACTION_setListener = 1;
        static final int TRANSACTION_socketClose = 5;
        static final int TRANSACTION_socketConnect = 2;
        static final int TRANSACTION_socketRead = 4;
        static final int TRANSACTION_socketWrite = 3;

        public static class Proxy implements IpcBtAdapter {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IpcBtAdapter.DESCRIPTOR;
            }

            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
            public int inAvailable(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IpcBtAdapter.DESCRIPTOR);
                    a.d(parcelObtain, bluetoothDevice, 0);
                    a.d(parcelObtain, parcelUuid, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
            public void setListener(IpcBtAdapterListener ipcBtAdapterListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IpcBtAdapter.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(ipcBtAdapterListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
            public void socketClose(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IpcBtAdapter.DESCRIPTOR);
                    a.d(parcelObtain, bluetoothDevice, 0);
                    a.d(parcelObtain, parcelUuid, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
            public void socketConnect(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IpcBtAdapter.DESCRIPTOR);
                    a.d(parcelObtain, bluetoothDevice, 0);
                    a.d(parcelObtain, parcelUuid, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
            public int socketRead(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IpcBtAdapter.DESCRIPTOR);
                    a.d(parcelObtain, bluetoothDevice, 0);
                    a.d(parcelObtain, parcelUuid, 0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapter
            public void socketWrite(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IpcBtAdapter.DESCRIPTOR);
                    a.d(parcelObtain, bluetoothDevice, 0);
                    a.d(parcelObtain, parcelUuid, 0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IpcBtAdapter.DESCRIPTOR);
        }

        public static IpcBtAdapter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IpcBtAdapter.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IpcBtAdapter)) ? new Proxy(iBinder) : (IpcBtAdapter) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IpcBtAdapter.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IpcBtAdapter.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    setListener(IpcBtAdapterListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    socketConnect((BluetoothDevice) a.c(parcel, BluetoothDevice.CREATOR), (ParcelUuid) a.c(parcel, ParcelUuid.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    socketWrite((BluetoothDevice) a.c(parcel, BluetoothDevice.CREATOR), (ParcelUuid) a.c(parcel, ParcelUuid.CREATOR), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) a.c(parcel, BluetoothDevice.CREATOR);
                    ParcelUuid parcelUuid = (ParcelUuid) a.c(parcel, ParcelUuid.CREATOR);
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    int iSocketRead = socketRead(bluetoothDevice, parcelUuid, bArrCreateByteArray, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iSocketRead);
                    parcel2.writeByteArray(bArrCreateByteArray);
                    return true;
                case 5:
                    socketClose((BluetoothDevice) a.c(parcel, BluetoothDevice.CREATOR), (ParcelUuid) a.c(parcel, ParcelUuid.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int iInAvailable = inAvailable((BluetoothDevice) a.c(parcel, BluetoothDevice.CREATOR), (ParcelUuid) a.c(parcel, ParcelUuid.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iInAvailable);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    int inAvailable(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException;

    void setListener(IpcBtAdapterListener ipcBtAdapterListener) throws RemoteException;

    void socketClose(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException;

    void socketConnect(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException;

    int socketRead(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2) throws RemoteException;

    void socketWrite(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid, byte[] bArr, int i, int i2, boolean z) throws RemoteException;
}
