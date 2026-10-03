package com.oplus.wearable.linkservice.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IWearableListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.wearable.linkservice.sdk.IWearableListener";

    public static class Default implements IWearableListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void checkFileInfo(FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerConnected(Node node) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerDisconnected(Node node) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWearableListener {
        static final int TRANSACTION_checkFileInfo = 7;
        static final int TRANSACTION_onMessageReceived = 1;
        static final int TRANSACTION_onPeerConnected = 2;
        static final int TRANSACTION_onPeerDisconnected = 3;
        static final int TRANSACTION_onTransferComplete = 6;
        static final int TRANSACTION_onTransferProgress = 5;
        static final int TRANSACTION_onTransferRequested = 4;

        public static class Proxy implements IWearableListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void checkFileInfo(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        fileTransferTask.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IWearableListener.DESCRIPTOR;
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void onPeerConnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void onPeerDisconnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
            public void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWearableListener.DESCRIPTOR);
        }

        public static IWearableListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearableListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWearableListener)) ? new Proxy(iBinder) : (IWearableListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearableListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearableListener.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onMessageReceived(parcel.readString(), (MessageEvent) a.c(parcel, MessageEvent.CREATOR));
                    return true;
                case 2:
                    onPeerConnected((Node) a.c(parcel, Node.CREATOR));
                    return true;
                case 3:
                    onPeerDisconnected((Node) a.c(parcel, Node.CREATOR));
                    return true;
                case 4:
                    onTransferRequested((FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onTransferProgress((FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onTransferComplete((FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    FileTransferTask fileTransferTask = (FileTransferTask) a.c(parcel, FileTransferTask.CREATOR);
                    checkFileInfo(fileTransferTask);
                    parcel2.writeNoException();
                    a.d(parcel2, fileTransferTask, 1);
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

    void checkFileInfo(FileTransferTask fileTransferTask) throws RemoteException;

    void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException;

    void onPeerConnected(Node node) throws RemoteException;

    void onPeerDisconnected(Node node) throws RemoteException;

    void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException;

    void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException;

    void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException;
}
