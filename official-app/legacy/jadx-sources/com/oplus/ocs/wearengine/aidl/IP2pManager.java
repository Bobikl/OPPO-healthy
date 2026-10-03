package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.FileTransferPackageNameParcelable;
import com.oplus.ocs.wearengine.bean.SendFileInfoParcelable;
import com.oplus.ocs.wearengine.common.Status;

/* JADX INFO: loaded from: classes8.dex */
public interface IP2pManager extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IP2pManager";

    public static class Default implements IP2pManager {
        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status addExerciseDataListener(String str, IExerciseUpdateListener iExerciseUpdateListener) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status addFileTransferListener(String str, IFileTransferListener iFileTransferListener) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status addMessageListener(String str, IMessageListener iMessageListener) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status cancelFile(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public FileTransferPackageNameParcelable getFileTransferPackageName(String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status receiveFile(String str, String str2, String str3) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status rejectFile(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status removeExerciseDataListener(String str, IExerciseUpdateListener iExerciseUpdateListener) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status removeFileTransferListener(String str, IFileTransferListener iFileTransferListener) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status removeMessageListener(String str, IMessageListener iMessageListener) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public SendFileInfoParcelable sendFile(String str, String str2, String str3) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
        public Status sendMessage(String str, int i, String str2, byte[] bArr, boolean z) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IP2pManager {
        static final int TRANSACTION_addExerciseDataListener = 11;
        static final int TRANSACTION_addFileTransferListener = 4;
        static final int TRANSACTION_addMessageListener = 2;
        static final int TRANSACTION_cancelFile = 10;
        static final int TRANSACTION_getFileTransferPackageName = 6;
        static final int TRANSACTION_receiveFile = 7;
        static final int TRANSACTION_rejectFile = 8;
        static final int TRANSACTION_removeExerciseDataListener = 12;
        static final int TRANSACTION_removeFileTransferListener = 5;
        static final int TRANSACTION_removeMessageListener = 3;
        static final int TRANSACTION_sendFile = 9;
        static final int TRANSACTION_sendMessage = 1;

        public static class Proxy implements IP2pManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status addExerciseDataListener(String str, IExerciseUpdateListener iExerciseUpdateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iExerciseUpdateListener);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status addFileTransferListener(String str, IFileTransferListener iFileTransferListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iFileTransferListener);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status addMessageListener(String str, IMessageListener iMessageListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iMessageListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status cancelFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public FileTransferPackageNameParcelable getFileTransferPackageName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (FileTransferPackageNameParcelable) a.c(parcelObtain2, FileTransferPackageNameParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IP2pManager.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status receiveFile(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status rejectFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status removeExerciseDataListener(String str, IExerciseUpdateListener iExerciseUpdateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iExerciseUpdateListener);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status removeFileTransferListener(String str, IFileTransferListener iFileTransferListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iFileTransferListener);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status removeMessageListener(String str, IMessageListener iMessageListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iMessageListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public SendFileInfoParcelable sendFile(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SendFileInfoParcelable) a.c(parcelObtain2, SendFileInfoParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IP2pManager
            public Status sendMessage(String str, int i, String str2, byte[] bArr, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IP2pManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IP2pManager.DESCRIPTOR);
        }

        public static IP2pManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IP2pManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IP2pManager)) ? new Proxy(iBinder) : (IP2pManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IP2pManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IP2pManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    Status statusSendMessage = sendMessage(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    a.d(parcel2, statusSendMessage, 1);
                    return true;
                case 2:
                    Status statusAddMessageListener = addMessageListener(parcel.readString(), IMessageListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusAddMessageListener, 1);
                    return true;
                case 3:
                    Status statusRemoveMessageListener = removeMessageListener(parcel.readString(), IMessageListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusRemoveMessageListener, 1);
                    return true;
                case 4:
                    Status statusAddFileTransferListener = addFileTransferListener(parcel.readString(), IFileTransferListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusAddFileTransferListener, 1);
                    return true;
                case 5:
                    Status statusRemoveFileTransferListener = removeFileTransferListener(parcel.readString(), IFileTransferListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusRemoveFileTransferListener, 1);
                    return true;
                case 6:
                    FileTransferPackageNameParcelable fileTransferPackageName = getFileTransferPackageName(parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, fileTransferPackageName, 1);
                    return true;
                case 7:
                    Status statusReceiveFile = receiveFile(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, statusReceiveFile, 1);
                    return true;
                case 8:
                    Status statusRejectFile = rejectFile(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, statusRejectFile, 1);
                    return true;
                case 9:
                    SendFileInfoParcelable sendFileInfoParcelableSendFile = sendFile(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, sendFileInfoParcelableSendFile, 1);
                    return true;
                case 10:
                    Status statusCancelFile = cancelFile(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, statusCancelFile, 1);
                    return true;
                case 11:
                    Status statusAddExerciseDataListener = addExerciseDataListener(parcel.readString(), IExerciseUpdateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusAddExerciseDataListener, 1);
                    return true;
                case 12:
                    Status statusRemoveExerciseDataListener = removeExerciseDataListener(parcel.readString(), IExerciseUpdateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusRemoveExerciseDataListener, 1);
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

    Status addExerciseDataListener(String str, IExerciseUpdateListener iExerciseUpdateListener) throws RemoteException;

    Status addFileTransferListener(String str, IFileTransferListener iFileTransferListener) throws RemoteException;

    Status addMessageListener(String str, IMessageListener iMessageListener) throws RemoteException;

    Status cancelFile(String str, String str2) throws RemoteException;

    FileTransferPackageNameParcelable getFileTransferPackageName(String str) throws RemoteException;

    Status receiveFile(String str, String str2, String str3) throws RemoteException;

    Status rejectFile(String str, String str2) throws RemoteException;

    Status removeExerciseDataListener(String str, IExerciseUpdateListener iExerciseUpdateListener) throws RemoteException;

    Status removeFileTransferListener(String str, IFileTransferListener iFileTransferListener) throws RemoteException;

    Status removeMessageListener(String str, IMessageListener iMessageListener) throws RemoteException;

    SendFileInfoParcelable sendFile(String str, String str2, String str3) throws RemoteException;

    Status sendMessage(String str, int i, String str2, byte[] bArr, boolean z) throws RemoteException;
}
