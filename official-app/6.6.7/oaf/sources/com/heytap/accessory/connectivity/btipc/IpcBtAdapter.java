package com.heytap.accessory.connectivity.btipc;

import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IpcBtAdapter extends IInterface {

    public static class Default implements IpcBtAdapter {
        @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
        public int a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
        public void b(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
        }

        @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
        public void a(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
        }

        @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
        public void a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
        }
    }

    int a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2) throws RemoteException;

    void a(BluetoothDevice bluetoothDevice, String str) throws RemoteException;

    void a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2, boolean z) throws RemoteException;

    void b(BluetoothDevice bluetoothDevice, String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IpcBtAdapter {
        public Stub() {
            attachInterface(this, "com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
        }

        public static IpcBtAdapter a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IpcBtAdapter)) ? new Proxy(iBinder) : (IpcBtAdapter) iInterfaceQueryLocalInterface;
        }

        public static IpcBtAdapter b() {
            return Proxy.b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                b(parcel.readInt() != 0 ? (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                a(parcel.readInt() != 0 ? (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel.enforceInterface("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                a(parcel.readInt() != 0 ? (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
            BluetoothDevice bluetoothDevice = parcel.readInt() != 0 ? (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel) : null;
            String string = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            int iA = a(bluetoothDevice, string, bArrCreateByteArray, parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(iA);
            parcel2.writeByteArray(bArrCreateByteArray);
            return true;
        }

        public static class Proxy implements IpcBtAdapter {
            public static IpcBtAdapter b;
            public IBinder a;

            public Proxy(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
            public void a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                    if (bluetoothDevice != null) {
                        parcelObtain.writeInt(1);
                        bluetoothDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.b().a(bluetoothDevice, str, bArr, i, i2, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
            public void b(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                    if (bluetoothDevice != null) {
                        parcelObtain.writeInt(1);
                        bluetoothDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.b() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.b().b(bluetoothDevice, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
            public int a(BluetoothDevice bluetoothDevice, String str, byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                    if (bluetoothDevice != null) {
                        parcelObtain.writeInt(1);
                        bluetoothDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0) && Stub.b() != null) {
                        return Stub.b().a(bluetoothDevice, str, bArr, i, i2);
                    }
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.connectivity.btipc.IpcBtAdapter
            public void a(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.accessory.connectivity.btipc.IpcBtAdapter");
                    if (bluetoothDevice != null) {
                        parcelObtain.writeInt(1);
                        bluetoothDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    if (!this.a.transact(4, parcelObtain, parcelObtain2, 0) && Stub.b() != null) {
                        Stub.b().a(bluetoothDevice, str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
