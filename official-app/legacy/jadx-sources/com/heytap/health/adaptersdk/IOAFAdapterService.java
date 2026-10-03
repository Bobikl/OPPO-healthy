package com.heytap.health.adaptersdk;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface IOAFAdapterService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.adaptersdk.IOAFAdapterService";

    public static class Default implements IOAFAdapterService {
        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addFileListener(IFileCallback iFileCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addMessageListener(IMessageCallback iMessageCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addNodeListener(INodeCallback iNodeCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void addRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void cancelFile(String str) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void connectNode(Node node, boolean z, boolean z2, byte[] bArr, String str) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void disconnectNode(Node node, boolean z, String str) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public List<Node> getBondedNodes() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public List<Node> getConnectedNodes() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public int getRunMode(String str) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public boolean isOafConnect(String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public boolean receiveFile(String str, String str2) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void rejectFile(String str) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeFileListener(IFileCallback iFileCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeMessageListener(IMessageCallback iMessageCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeNodeListener(INodeCallback iNodeCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void removeRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.adaptersdk.IOAFAdapterService
        public void setOafModelInfo(String str, String str2, String str3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOAFAdapterService {
        static final int TRANSACTION_addFileListener = 8;
        static final int TRANSACTION_addMessageListener = 5;
        static final int TRANSACTION_addNodeListener = 1;
        static final int TRANSACTION_addRunModeListener = 17;
        static final int TRANSACTION_cancelFile = 12;
        static final int TRANSACTION_connectNode = 3;
        static final int TRANSACTION_disconnectNode = 4;
        static final int TRANSACTION_getBondedNodes = 14;
        static final int TRANSACTION_getConnectedNodes = 15;
        static final int TRANSACTION_getRunMode = 19;
        static final int TRANSACTION_isOafConnect = 16;
        static final int TRANSACTION_receiveFile = 11;
        static final int TRANSACTION_rejectFile = 13;
        static final int TRANSACTION_removeFileListener = 9;
        static final int TRANSACTION_removeMessageListener = 6;
        static final int TRANSACTION_removeNodeListener = 2;
        static final int TRANSACTION_removeRunModeListener = 18;
        static final int TRANSACTION_sendFile = 10;
        static final int TRANSACTION_sendMessage = 7;
        static final int TRANSACTION_setOafModelInfo = 20;

        public static class Proxy implements IOAFAdapterService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void addFileListener(IFileCallback iFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iFileCallback);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void addMessageListener(IMessageCallback iMessageCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMessageCallback);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void addNodeListener(INodeCallback iNodeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iNodeCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void addRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRunModeCallback);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
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

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void cancelFile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void connectNode(Node node, boolean z, boolean z2, byte[] bArr, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    a.f(parcelObtain, node, 0);
                    int i = 1;
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void disconnectNode(Node node, boolean z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public List<Node> getBondedNodes() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public List<Node> getConnectedNodes() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOAFAdapterService.DESCRIPTOR;
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public int getRunMode(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public boolean isOafConnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public boolean receiveFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void rejectFile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void removeFileListener(IFileCallback iFileCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iFileCallback);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void removeMessageListener(IMessageCallback iMessageCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMessageCallback);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void removeNodeListener(INodeCallback iNodeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iNodeCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void removeRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRunModeCallback);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str3);
                    a.f(parcelObtain, uri, 0);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, messageEvent, 0);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IOAFAdapterService
            public void setOafModelInfo(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOAFAdapterService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOAFAdapterService.DESCRIPTOR);
        }

        public static IOAFAdapterService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOAFAdapterService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOAFAdapterService)) ? new Proxy(iBinder) : (IOAFAdapterService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOAFAdapterService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOAFAdapterService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    addNodeListener(INodeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    removeNodeListener(INodeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    connectNode((Node) a.d(parcel, Node.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.createByteArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    disconnectNode((Node) a.d(parcel, Node.CREATOR), parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    addMessageListener(IMessageCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    removeMessageListener(IMessageCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean zSendMessage = sendMessage(parcel.readString(), (MessageEvent) a.d(parcel, MessageEvent.CREATOR), IResult.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendMessage ? 1 : 0);
                    return true;
                case 8:
                    addFileListener(IFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    removeFileListener(IFileCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    String strSendFile = sendFile(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (Uri) a.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeString(strSendFile);
                    return true;
                case 11:
                    boolean zReceiveFile = receiveFile(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 12:
                    cancelFile(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    rejectFile(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    List<Node> bondedNodes = getBondedNodes();
                    parcel2.writeNoException();
                    a.e(parcel2, bondedNodes, 1);
                    return true;
                case 15:
                    List<Node> connectedNodes = getConnectedNodes();
                    parcel2.writeNoException();
                    a.e(parcel2, connectedNodes, 1);
                    return true;
                case 16:
                    boolean zIsOafConnect = isOafConnect(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsOafConnect ? 1 : 0);
                    return true;
                case 17:
                    addRunModeListener(IRunModeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    removeRunModeListener(IRunModeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    int runMode = getRunMode(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(runMode);
                    return true;
                case 20:
                    setOafModelInfo(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
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

    void addFileListener(IFileCallback iFileCallback) throws RemoteException;

    void addMessageListener(IMessageCallback iMessageCallback) throws RemoteException;

    void addNodeListener(INodeCallback iNodeCallback) throws RemoteException;

    void addRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException;

    void cancelFile(String str) throws RemoteException;

    void connectNode(Node node, boolean z, boolean z2, byte[] bArr, String str) throws RemoteException;

    void disconnectNode(Node node, boolean z, String str) throws RemoteException;

    List<Node> getBondedNodes() throws RemoteException;

    List<Node> getConnectedNodes() throws RemoteException;

    int getRunMode(String str) throws RemoteException;

    boolean isOafConnect(String str) throws RemoteException;

    boolean receiveFile(String str, String str2) throws RemoteException;

    void rejectFile(String str) throws RemoteException;

    void removeFileListener(IFileCallback iFileCallback) throws RemoteException;

    void removeMessageListener(IMessageCallback iMessageCallback) throws RemoteException;

    void removeNodeListener(INodeCallback iNodeCallback) throws RemoteException;

    void removeRunModeListener(IRunModeCallback iRunModeCallback) throws RemoteException;

    String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException;

    boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException;

    void setOafModelInfo(String str, String str2, String str3) throws RemoteException;
}
