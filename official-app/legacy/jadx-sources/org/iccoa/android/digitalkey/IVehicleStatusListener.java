package org.iccoa.android.digitalkey;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IVehicleStatusListener extends IInterface {

    public static class Default implements IVehicleStatusListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
        public void onBleAuthStatusChange(byte[] bArr, int i) throws RemoteException {
        }

        @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
        public void onConnectionStateChange(byte[] bArr, boolean z) throws RemoteException {
        }

        @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
        public void onConsecutiveRkeConfirmation(byte[] bArr, int i, int i2, int i3, byte[] bArr2) throws RemoteException {
        }

        @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
        public void onCustomEvent(byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
        public void onExecutionStatus(byte[] bArr, int i, int i2, int i3) throws RemoteException {
        }

        @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
        public void onFunctionStatus(byte[] bArr, int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IVehicleStatusListener {
        private static final String DESCRIPTOR = "org.iccoa.android.digitalkey.IVehicleStatusListener";
        static final int TRANSACTION_onBleAuthStatusChange = 6;
        static final int TRANSACTION_onConnectionStateChange = 4;
        static final int TRANSACTION_onConsecutiveRkeConfirmation = 3;
        static final int TRANSACTION_onCustomEvent = 5;
        static final int TRANSACTION_onExecutionStatus = 1;
        static final int TRANSACTION_onFunctionStatus = 2;

        public static class Proxy implements IVehicleStatusListener {
            public static IVehicleStatusListener sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
            public void onBleAuthStatusChange(byte[] bArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onBleAuthStatusChange(bArr, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
            public void onConnectionStateChange(byte[] bArr, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectionStateChange(bArr, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
            public void onConsecutiveRkeConfirmation(byte[] bArr, int i, int i2, int i3, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConsecutiveRkeConfirmation(bArr, i, i2, i3, bArr2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
            public void onCustomEvent(byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onCustomEvent(bArr, bArr2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
            public void onExecutionStatus(byte[] bArr, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onExecutionStatus(bArr, i, i2, i3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
            public void onFunctionStatus(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFunctionStatus(bArr, i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IVehicleStatusListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IVehicleStatusListener)) ? new Proxy(iBinder) : (IVehicleStatusListener) iInterfaceQueryLocalInterface;
        }

        public static IVehicleStatusListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IVehicleStatusListener iVehicleStatusListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iVehicleStatusListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iVehicleStatusListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onExecutionStatus(parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFunctionStatus(parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConsecutiveRkeConfirmation(parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onConnectionStateChange(parcel.createByteArray(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCustomEvent(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBleAuthStatusChange(parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onBleAuthStatusChange(byte[] bArr, int i) throws RemoteException;

    void onConnectionStateChange(byte[] bArr, boolean z) throws RemoteException;

    void onConsecutiveRkeConfirmation(byte[] bArr, int i, int i2, int i3, byte[] bArr2) throws RemoteException;

    void onCustomEvent(byte[] bArr, byte[] bArr2) throws RemoteException;

    void onExecutionStatus(byte[] bArr, int i, int i2, int i3) throws RemoteException;

    void onFunctionStatus(byte[] bArr, int i, int i2) throws RemoteException;
}
