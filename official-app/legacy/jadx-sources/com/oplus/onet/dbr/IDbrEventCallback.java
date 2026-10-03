package com.oplus.onet.dbr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IDbrEventCallback extends IInterface {

    public static class Default implements IDbrEventCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onClose() throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onDeviceConnected(List<String> list) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onDeviceDisconnected(List<String> list) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onError(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onFileProgressChanged(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onFileTransferCompleted(String str, String str2, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onFileTransferRequested(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onMessageReceived(String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onOpen() throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onStreamReceived(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onStreamTransferCompleted(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onStreamTransferRequested(String str) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IDbrEventCallback
        public void onUnReachable(List<String> list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDbrEventCallback {
        private static final String DESCRIPTOR = "com.oplus.onet.dbr.IDbrEventCallback";
        public static final int TRANSACTION_onClose = 2;
        public static final int TRANSACTION_onDeviceConnected = 10;
        public static final int TRANSACTION_onDeviceDisconnected = 11;
        public static final int TRANSACTION_onError = 13;
        public static final int TRANSACTION_onFileProgressChanged = 5;
        public static final int TRANSACTION_onFileTransferCompleted = 6;
        public static final int TRANSACTION_onFileTransferRequested = 4;
        public static final int TRANSACTION_onMessageReceived = 3;
        public static final int TRANSACTION_onOpen = 1;
        public static final int TRANSACTION_onStreamReceived = 8;
        public static final int TRANSACTION_onStreamTransferCompleted = 9;
        public static final int TRANSACTION_onStreamTransferRequested = 7;
        public static final int TRANSACTION_onUnReachable = 12;

        public static class Proxy implements IDbrEventCallback {
            public static IDbrEventCallback sDefaultImpl;
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

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onClose() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onClose();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onDeviceConnected(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDeviceConnected(list);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readStringList(list);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onDeviceDisconnected(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDeviceDisconnected(list);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readStringList(list);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onError(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onError(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onFileProgressChanged(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFileProgressChanged(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onFileTransferCompleted(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFileTransferCompleted(str, str2, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onFileTransferRequested(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFileTransferRequested(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onMessageReceived(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onMessageReceived(str, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onOpen() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onOpen();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onStreamReceived(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (parcelFileDescriptor != null) {
                        parcelObtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStreamReceived(str, parcelFileDescriptor);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onStreamTransferCompleted(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStreamTransferCompleted(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onStreamTransferRequested(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStreamTransferRequested(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IDbrEventCallback
            public void onUnReachable(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onUnReachable(list);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readStringList(list);
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

        public static IDbrEventCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDbrEventCallback)) ? new Proxy(iBinder) : (IDbrEventCallback) iInterfaceQueryLocalInterface;
        }

        public static IDbrEventCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDbrEventCallback iDbrEventCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDbrEventCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDbrEventCallback;
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
                    onOpen();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onClose();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onMessageReceived(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFileTransferRequested(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFileProgressChanged(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFileTransferCompleted(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onStreamTransferRequested(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onStreamReceived(parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onStreamTransferCompleted(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    onDeviceConnected(arrayListCreateStringArrayList);
                    parcel2.writeNoException();
                    parcel2.writeStringList(arrayListCreateStringArrayList);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                    onDeviceDisconnected(arrayListCreateStringArrayList2);
                    parcel2.writeNoException();
                    parcel2.writeStringList(arrayListCreateStringArrayList2);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                    onUnReachable(arrayListCreateStringArrayList3);
                    parcel2.writeNoException();
                    parcel2.writeStringList(arrayListCreateStringArrayList3);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onError(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onClose() throws RemoteException;

    void onDeviceConnected(List<String> list) throws RemoteException;

    void onDeviceDisconnected(List<String> list) throws RemoteException;

    void onError(String str, int i) throws RemoteException;

    void onFileProgressChanged(String str, int i) throws RemoteException;

    void onFileTransferCompleted(String str, String str2, int i) throws RemoteException;

    void onFileTransferRequested(String str, String str2) throws RemoteException;

    void onMessageReceived(String str, byte[] bArr) throws RemoteException;

    void onOpen() throws RemoteException;

    void onStreamReceived(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void onStreamTransferCompleted(String str, int i) throws RemoteException;

    void onStreamTransferRequested(String str) throws RemoteException;

    void onUnReachable(List<String> list) throws RemoteException;
}
