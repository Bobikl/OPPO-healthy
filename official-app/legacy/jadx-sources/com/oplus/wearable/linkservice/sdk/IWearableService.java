package com.oplus.wearable.linkservice.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface IWearableService extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.wearable.linkservice.sdk.IWearableService";

    public static class Default implements IWearableService {
        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void addListener(String str, IWearableListener iWearableListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void cancelFile(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void connect(String str, Node node, boolean z) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void createBond(String str, Node node, byte[] bArr) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void disconnect(String str, Node node) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public List<Node> getBondNodes(String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void getBondNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public List<Node> getConnectedNodes(String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void getConnectedNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public String getWearOSNodeIdByMac(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public FileTransferTask olinkSendFile(String str, FileTransferTask fileTransferTask) throws RemoteException {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public boolean receiveFile(String str, int i, String str2, String str3, String str4) throws RemoteException {
            return false;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void rejectFile(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void removeBond(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public void removeListener(String str, IWearableListener iWearableListener) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableService
        public boolean sendMessage(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IWearableService {
        static final int TRANSACTION_addListener = 4;
        static final int TRANSACTION_cancelFile = 10;
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_createBond = 11;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_getBondNodes = 13;
        static final int TRANSACTION_getBondNodesOfWearOS = 15;
        static final int TRANSACTION_getConnectedNodes = 3;
        static final int TRANSACTION_getConnectedNodesOfWearOS = 14;
        static final int TRANSACTION_getWearOSNodeIdByMac = 16;
        static final int TRANSACTION_olinkSendFile = 7;
        static final int TRANSACTION_receiveFile = 8;
        static final int TRANSACTION_rejectFile = 9;
        static final int TRANSACTION_removeBond = 12;
        static final int TRANSACTION_removeListener = 5;
        static final int TRANSACTION_sendMessage = 6;

        public static class Proxy implements IWearableService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void addListener(String str, IWearableListener iWearableListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iWearableListener);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void cancelFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void connect(String str, Node node, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void createBond(String str, Node node, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void disconnect(String str, Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, node, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public List<Node> getBondNodes(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void getBondNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(onResultCallback);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public List<Node> getConnectedNodes(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void getConnectedNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(onResultCallback);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IWearableService.DESCRIPTOR;
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public String getWearOSNodeIdByMac(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public FileTransferTask olinkSendFile(String str, FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    FileTransferTask fileTransferTask2 = (FileTransferTask) a.d(parcelObtain2, FileTransferTask.CREATOR);
                    if (parcelObtain2.readInt() != 0) {
                        fileTransferTask.readFromParcel(parcelObtain2);
                    }
                    return fileTransferTask2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public boolean receiveFile(String str, int i, String str2, String str3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void rejectFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void removeBond(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeStrongInterface(iRemoveBoundCallback);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public void removeListener(String str, IWearableListener iWearableListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iWearableListener);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableService
            public boolean sendMessage(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    a.f(parcelObtain, messageEvent, 0);
                    parcelObtain.writeStrongInterface(iWearableCallback);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
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
                    connect(parcel.readString(), (Node) a.d(parcel, Node.CREATOR), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    disconnect(parcel.readString(), (Node) a.d(parcel, Node.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    List<Node> connectedNodes = getConnectedNodes(parcel.readString());
                    parcel2.writeNoException();
                    a.e(parcel2, connectedNodes, 1);
                    return true;
                case 4:
                    addListener(parcel.readString(), IWearableListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    removeListener(parcel.readString(), IWearableListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean zSendMessage = sendMessage(parcel.readString(), parcel.readString(), (MessageEvent) a.d(parcel, MessageEvent.CREATOR), IWearableCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendMessage ? 1 : 0);
                    return true;
                case 7:
                    String string = parcel.readString();
                    FileTransferTask fileTransferTask = (FileTransferTask) a.d(parcel, FileTransferTask.CREATOR);
                    FileTransferTask fileTransferTaskOlinkSendFile = olinkSendFile(string, fileTransferTask);
                    parcel2.writeNoException();
                    a.f(parcel2, fileTransferTaskOlinkSendFile, 1);
                    a.f(parcel2, fileTransferTask, 1);
                    return true;
                case 8:
                    boolean zReceiveFile = receiveFile(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 9:
                    rejectFile(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    cancelFile(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    createBond(parcel.readString(), (Node) a.d(parcel, Node.CREATOR), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    removeBond(parcel.readString(), (Node) a.d(parcel, Node.CREATOR), IRemoveBoundCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    List<Node> bondNodes = getBondNodes(parcel.readString());
                    parcel2.writeNoException();
                    a.e(parcel2, bondNodes, 1);
                    return true;
                case 14:
                    getConnectedNodesOfWearOS(parcel.readString(), OnResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    getBondNodesOfWearOS(parcel.readString(), OnResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    String wearOSNodeIdByMac = getWearOSNodeIdByMac(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(wearOSNodeIdByMac);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class a {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addListener(String str, IWearableListener iWearableListener) throws RemoteException;

    void cancelFile(String str, String str2) throws RemoteException;

    void connect(String str, Node node, boolean z) throws RemoteException;

    void createBond(String str, Node node, byte[] bArr) throws RemoteException;

    void disconnect(String str, Node node) throws RemoteException;

    List<Node> getBondNodes(String str) throws RemoteException;

    void getBondNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException;

    List<Node> getConnectedNodes(String str) throws RemoteException;

    void getConnectedNodesOfWearOS(String str, OnResultCallback onResultCallback) throws RemoteException;

    String getWearOSNodeIdByMac(String str, String str2) throws RemoteException;

    FileTransferTask olinkSendFile(String str, FileTransferTask fileTransferTask) throws RemoteException;

    boolean receiveFile(String str, int i, String str2, String str3, String str4) throws RemoteException;

    void rejectFile(String str, String str2) throws RemoteException;

    void removeBond(String str, Node node, IRemoveBoundCallback iRemoveBoundCallback) throws RemoteException;

    void removeListener(String str, IWearableListener iWearableListener) throws RemoteException;

    boolean sendMessage(String str, String str2, MessageEvent messageEvent, IWearableCallback iWearableCallback) throws RemoteException;
}
