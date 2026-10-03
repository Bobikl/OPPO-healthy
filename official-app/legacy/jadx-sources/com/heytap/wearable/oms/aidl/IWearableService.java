package com.heytap.wearable.oms.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.wearable.oms.common.Status;
import com.heytap.wearable.oms.internal.NodeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public interface IWearableService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.oms.aidl.IWearableService";

    public static class Default implements IWearableService {
        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status addListener(String str, IWearableListener iWearableListener) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status checkInstalled(String str, int i, String str2) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public NodeParcelable getNode(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status getOmsVersion(String str, int i, String str2) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status getPackageInfo(String str, int i, String str2) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status removeListener(String str, IWearableListener iWearableListener) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status sendMessage(String str, int i, String str2, String str3, byte[] bArr) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status tryAwaken(String str, int i, String str2, String str3, byte[] bArr) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status tryInstall(String str, int i, String str2) throws RemoteException {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableService
        public Status tryOpenUrl(String str, int i, String str2, String str3) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWearableService {
        static final int TRANSACTION_addListener = 1;
        static final int TRANSACTION_checkInstalled = 5;
        static final int TRANSACTION_getNode = 4;
        static final int TRANSACTION_getOmsVersion = 10;
        static final int TRANSACTION_getPackageInfo = 9;
        static final int TRANSACTION_removeListener = 2;
        static final int TRANSACTION_sendMessage = 3;
        static final int TRANSACTION_tryAwaken = 7;
        static final int TRANSACTION_tryInstall = 6;
        static final int TRANSACTION_tryOpenUrl = 8;

        public static class Proxy implements IWearableService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status addListener(String str, IWearableListener iWearableListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iWearableListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
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

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status checkInstalled(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IWearableService.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public NodeParcelable getNode(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (NodeParcelable) a.c(parcelObtain2, NodeParcelable.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status getOmsVersion(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status getPackageInfo(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status removeListener(String str, IWearableListener iWearableListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iWearableListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status sendMessage(String str, int i, String str2, String str3, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status tryAwaken(String str, int i, String str2, String str3, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status tryInstall(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableService
            public Status tryOpenUrl(String str, int i, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWearableService.DESCRIPTOR);
        }

        public static IWearableService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearableService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWearableService)) ? new Proxy(iBinder) : (IWearableService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearableService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearableService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    Status statusAddListener = addListener(parcel.readString(), IWearableListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusAddListener, 1);
                    return true;
                case 2:
                    Status statusRemoveListener = removeListener(parcel.readString(), IWearableListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusRemoveListener, 1);
                    return true;
                case 3:
                    Status statusSendMessage = sendMessage(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    a.d(parcel2, statusSendMessage, 1);
                    return true;
                case 4:
                    NodeParcelable node = getNode(parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, node, 1);
                    return true;
                case 5:
                    Status statusCheckInstalled = checkInstalled(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, statusCheckInstalled, 1);
                    return true;
                case 6:
                    Status statusTryInstall = tryInstall(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, statusTryInstall, 1);
                    return true;
                case 7:
                    Status statusTryAwaken = tryAwaken(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    a.d(parcel2, statusTryAwaken, 1);
                    return true;
                case 8:
                    Status statusTryOpenUrl = tryOpenUrl(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, statusTryOpenUrl, 1);
                    return true;
                case 9:
                    Status packageInfo = getPackageInfo(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, packageInfo, 1);
                    return true;
                case 10:
                    Status omsVersion = getOmsVersion(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    a.d(parcel2, omsVersion, 1);
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

    Status addListener(String str, IWearableListener iWearableListener) throws RemoteException;

    Status checkInstalled(String str, int i, String str2) throws RemoteException;

    NodeParcelable getNode(String str) throws RemoteException;

    Status getOmsVersion(String str, int i, String str2) throws RemoteException;

    Status getPackageInfo(String str, int i, String str2) throws RemoteException;

    Status removeListener(String str, IWearableListener iWearableListener) throws RemoteException;

    Status sendMessage(String str, int i, String str2, String str3, byte[] bArr) throws RemoteException;

    Status tryAwaken(String str, int i, String str2, String str3, byte[] bArr) throws RemoteException;

    Status tryInstall(String str, int i, String str2) throws RemoteException;

    Status tryOpenUrl(String str, int i, String str2, String str3) throws RemoteException;
}
