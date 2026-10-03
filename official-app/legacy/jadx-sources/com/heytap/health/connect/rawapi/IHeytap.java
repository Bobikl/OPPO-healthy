package com.heytap.health.connect.rawapi;

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
public interface IHeytap extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.connect.rawapi.IHeytap";

    public static class Default implements IHeytap {
        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void addAllListener(IHFileListener iHFileListener) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void addHRunModeListener(IHRunModeListener iHRunModeListener) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void addMessageListener(IHMessageListener iHMessageListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void cancelFile(String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void connectNode(Node node, boolean z, String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void createBond(Node node, byte[] bArr, String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void disableWifiConnection(String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void disconnectNode(Node node, String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void enableWifiConnection(String str, long j2, IResult iResult) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public String getActiveNodeId() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public List<Node> getBondNodes() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void getBondNodesOfWearOS(IResult iResult) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public List<Node> getConnectedNodes() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void getConnectedNodesOfWearOS(IResult iResult) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public String getCurrentConnectId() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public Node getNodeByMac(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public int getRunMode(String str) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public String getWearOSNodeIdByMac(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean isConnected(String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean isCurrentConnected() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean isOafEnabled() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean isStubModule() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean isSupportDynamicRegisterAgent() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean isWifiConnected() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void monitorStatus(IHNodeStatusChanged iHNodeStatusChanged) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void notifyNodeStatus(String str, Node node, int i) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean receiveFile(String str, String str2) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void rejectFile(String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void removeAllListener(IHFileListener iHFileListener) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void removeBond(Node node, String str, IResult iResult) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void removeHRunModeListener(IHRunModeListener iHRunModeListener) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void removeMessageListener(IHMessageListener iHMessageListener) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public boolean sendMessageActiveDevice(MessageEvent messageEvent, IResult iResult) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void setActiveDevice(String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHeytap
        public void unMonitorStatus(IHNodeStatusChanged iHNodeStatusChanged) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHeytap {
        static final int TRANSACTION_addAllListener = 2006;
        static final int TRANSACTION_addHRunModeListener = 3002;
        static final int TRANSACTION_addMessageListener = 1002;
        static final int TRANSACTION_cancelFile = 2005;
        static final int TRANSACTION_connectNode = 3;
        static final int TRANSACTION_createBond = 1;
        static final int TRANSACTION_disableWifiConnection = 3006;
        static final int TRANSACTION_disconnectNode = 4;
        static final int TRANSACTION_enableWifiConnection = 3005;
        static final int TRANSACTION_getActiveNodeId = 14;
        static final int TRANSACTION_getBondNodes = 7;
        static final int TRANSACTION_getBondNodesOfWearOS = 10;
        static final int TRANSACTION_getConnectedNodes = 8;
        static final int TRANSACTION_getConnectedNodesOfWearOS = 9;
        static final int TRANSACTION_getCurrentConnectId = 17;
        static final int TRANSACTION_getNodeByMac = 12;
        static final int TRANSACTION_getRunMode = 3004;
        static final int TRANSACTION_getWearOSNodeIdByMac = 11;
        static final int TRANSACTION_isConnected = 16;
        static final int TRANSACTION_isCurrentConnected = 15;
        static final int TRANSACTION_isOafEnabled = 20;
        static final int TRANSACTION_isStubModule = 18;
        static final int TRANSACTION_isSupportDynamicRegisterAgent = 21;
        static final int TRANSACTION_isWifiConnected = 3007;
        static final int TRANSACTION_monitorStatus = 5;
        static final int TRANSACTION_notifyNodeStatus = 19;
        static final int TRANSACTION_receiveFile = 2003;
        static final int TRANSACTION_rejectFile = 2004;
        static final int TRANSACTION_removeAllListener = 2007;
        static final int TRANSACTION_removeBond = 2;
        static final int TRANSACTION_removeHRunModeListener = 3003;
        static final int TRANSACTION_removeMessageListener = 1003;
        static final int TRANSACTION_sendFile = 2002;
        static final int TRANSACTION_sendMessage = 1004;
        static final int TRANSACTION_sendMessageActiveDevice = 1005;
        static final int TRANSACTION_setActiveDevice = 13;
        static final int TRANSACTION_unMonitorStatus = 6;

        public static class Proxy implements IHeytap {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void addAllListener(IHFileListener iHFileListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHFileListener);
                    this.mRemote.transact(2006, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void addHRunModeListener(IHRunModeListener iHRunModeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHRunModeListener);
                    this.mRemote.transact(3002, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void addMessageListener(IHMessageListener iHMessageListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHMessageListener);
                    this.mRemote.transact(1002, parcelObtain, parcelObtain2, 0);
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

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void cancelFile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2005, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void connectNode(Node node, boolean z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void createBond(Node node, byte[] bArr, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void disableWifiConnection(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3006, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void disconnectNode(Node node, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void enableWifiConnection(String str, long j2, IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(3005, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public String getActiveNodeId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public List<Node> getBondNodes() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void getBondNodesOfWearOS(IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public List<Node> getConnectedNodes() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void getConnectedNodesOfWearOS(IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public String getCurrentConnectId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IHeytap.DESCRIPTOR;
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public Node getNodeByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Node) a.d(parcelObtain2, Node.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public int getRunMode(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3004, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public String getWearOSNodeIdByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean isConnected(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean isCurrentConnected() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean isOafEnabled() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean isStubModule() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean isSupportDynamicRegisterAgent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean isWifiConnected() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    this.mRemote.transact(3007, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void monitorStatus(IHNodeStatusChanged iHNodeStatusChanged) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHNodeStatusChanged);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void notifyNodeStatus(String str, Node node, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean receiveFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(2003, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void rejectFile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2004, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void removeAllListener(IHFileListener iHFileListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHFileListener);
                    this.mRemote.transact(2007, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void removeBond(Node node, String str, IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    a.f(parcelObtain, node, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void removeHRunModeListener(IHRunModeListener iHRunModeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHRunModeListener);
                    this.mRemote.transact(3003, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void removeMessageListener(IHMessageListener iHMessageListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHMessageListener);
                    this.mRemote.transact(1003, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str3);
                    a.f(parcelObtain, uri, 0);
                    this.mRemote.transact(2002, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.f(parcelObtain, messageEvent, 0);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(1004, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public boolean sendMessageActiveDevice(MessageEvent messageEvent, IResult iResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    a.f(parcelObtain, messageEvent, 0);
                    parcelObtain.writeStrongInterface(iResult);
                    this.mRemote.transact(1005, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void setActiveDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHeytap
            public void unMonitorStatus(IHNodeStatusChanged iHNodeStatusChanged) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeytap.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iHNodeStatusChanged);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHeytap.DESCRIPTOR);
        }

        public static IHeytap asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHeytap.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHeytap)) ? new Proxy(iBinder) : (IHeytap) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHeytap.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHeytap.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    createBond((Node) a.d(parcel, Node.CREATOR), parcel.createByteArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    removeBond((Node) a.d(parcel, Node.CREATOR), parcel.readString(), IResult.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    connectNode((Node) a.d(parcel, Node.CREATOR), parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    disconnectNode((Node) a.d(parcel, Node.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    monitorStatus(IHNodeStatusChanged.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    unMonitorStatus(IHNodeStatusChanged.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    List<Node> bondNodes = getBondNodes();
                    parcel2.writeNoException();
                    a.e(parcel2, bondNodes, 1);
                    return true;
                case 8:
                    List<Node> connectedNodes = getConnectedNodes();
                    parcel2.writeNoException();
                    a.e(parcel2, connectedNodes, 1);
                    return true;
                case 9:
                    getConnectedNodesOfWearOS(IResult.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    getBondNodesOfWearOS(IResult.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    String wearOSNodeIdByMac = getWearOSNodeIdByMac(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(wearOSNodeIdByMac);
                    return true;
                case 12:
                    Node nodeByMac = getNodeByMac(parcel.readString());
                    parcel2.writeNoException();
                    a.f(parcel2, nodeByMac, 1);
                    return true;
                case 13:
                    setActiveDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    String activeNodeId = getActiveNodeId();
                    parcel2.writeNoException();
                    parcel2.writeString(activeNodeId);
                    return true;
                case 15:
                    boolean zIsCurrentConnected = isCurrentConnected();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCurrentConnected ? 1 : 0);
                    return true;
                case 16:
                    boolean zIsConnected = isConnected(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnected ? 1 : 0);
                    return true;
                case 17:
                    String currentConnectId = getCurrentConnectId();
                    parcel2.writeNoException();
                    parcel2.writeString(currentConnectId);
                    return true;
                case 18:
                    boolean zIsStubModule = isStubModule();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsStubModule ? 1 : 0);
                    return true;
                case 19:
                    notifyNodeStatus(parcel.readString(), (Node) a.d(parcel, Node.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zIsOafEnabled = isOafEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsOafEnabled ? 1 : 0);
                    return true;
                case 21:
                    boolean zIsSupportDynamicRegisterAgent = isSupportDynamicRegisterAgent();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportDynamicRegisterAgent ? 1 : 0);
                    return true;
                default:
                    switch (i) {
                        case 1002:
                            addMessageListener(IHMessageListener.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case 1003:
                            removeMessageListener(IHMessageListener.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case 1004:
                            boolean zSendMessage = sendMessage(parcel.readString(), (MessageEvent) a.d(parcel, MessageEvent.CREATOR), IResult.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            parcel2.writeInt(zSendMessage ? 1 : 0);
                            return true;
                        case 1005:
                            boolean zSendMessageActiveDevice = sendMessageActiveDevice((MessageEvent) a.d(parcel, MessageEvent.CREATOR), IResult.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            parcel2.writeInt(zSendMessageActiveDevice ? 1 : 0);
                            return true;
                        default:
                            switch (i) {
                                case 2002:
                                    String strSendFile = sendFile(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (Uri) a.d(parcel, Uri.CREATOR));
                                    parcel2.writeNoException();
                                    parcel2.writeString(strSendFile);
                                    return true;
                                case 2003:
                                    boolean zReceiveFile = receiveFile(parcel.readString(), parcel.readString());
                                    parcel2.writeNoException();
                                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                                    return true;
                                case 2004:
                                    rejectFile(parcel.readString());
                                    parcel2.writeNoException();
                                    return true;
                                case 2005:
                                    cancelFile(parcel.readString());
                                    parcel2.writeNoException();
                                    return true;
                                case 2006:
                                    addAllListener(IHFileListener.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2007:
                                    removeAllListener(IHFileListener.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    switch (i) {
                                        case 3002:
                                            addHRunModeListener(IHRunModeListener.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3003:
                                            removeHRunModeListener(IHRunModeListener.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3004:
                                            int runMode = getRunMode(parcel.readString());
                                            parcel2.writeNoException();
                                            parcel2.writeInt(runMode);
                                            return true;
                                        case 3005:
                                            enableWifiConnection(parcel.readString(), parcel.readLong(), IResult.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3006:
                                            disableWifiConnection(parcel.readString());
                                            parcel2.writeNoException();
                                            return true;
                                        case 3007:
                                            boolean zIsWifiConnected = isWifiConnected();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(zIsWifiConnected ? 1 : 0);
                                            return true;
                                        default:
                                            return super.onTransact(i, parcel, parcel2, i2);
                                    }
                            }
                    }
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

    void addAllListener(IHFileListener iHFileListener) throws RemoteException;

    void addHRunModeListener(IHRunModeListener iHRunModeListener) throws RemoteException;

    void addMessageListener(IHMessageListener iHMessageListener) throws RemoteException;

    void cancelFile(String str) throws RemoteException;

    void connectNode(Node node, boolean z, String str) throws RemoteException;

    void createBond(Node node, byte[] bArr, String str) throws RemoteException;

    void disableWifiConnection(String str) throws RemoteException;

    void disconnectNode(Node node, String str) throws RemoteException;

    void enableWifiConnection(String str, long j2, IResult iResult) throws RemoteException;

    String getActiveNodeId() throws RemoteException;

    List<Node> getBondNodes() throws RemoteException;

    void getBondNodesOfWearOS(IResult iResult) throws RemoteException;

    List<Node> getConnectedNodes() throws RemoteException;

    void getConnectedNodesOfWearOS(IResult iResult) throws RemoteException;

    String getCurrentConnectId() throws RemoteException;

    Node getNodeByMac(String str) throws RemoteException;

    int getRunMode(String str) throws RemoteException;

    String getWearOSNodeIdByMac(String str) throws RemoteException;

    boolean isConnected(String str) throws RemoteException;

    boolean isCurrentConnected() throws RemoteException;

    boolean isOafEnabled() throws RemoteException;

    boolean isStubModule() throws RemoteException;

    boolean isSupportDynamicRegisterAgent() throws RemoteException;

    boolean isWifiConnected() throws RemoteException;

    void monitorStatus(IHNodeStatusChanged iHNodeStatusChanged) throws RemoteException;

    void notifyNodeStatus(String str, Node node, int i) throws RemoteException;

    boolean receiveFile(String str, String str2) throws RemoteException;

    void rejectFile(String str) throws RemoteException;

    void removeAllListener(IHFileListener iHFileListener) throws RemoteException;

    void removeBond(Node node, String str, IResult iResult) throws RemoteException;

    void removeHRunModeListener(IHRunModeListener iHRunModeListener) throws RemoteException;

    void removeMessageListener(IHMessageListener iHMessageListener) throws RemoteException;

    String sendFile(String str, String str2, int i, String str3, Uri uri) throws RemoteException;

    boolean sendMessage(String str, MessageEvent messageEvent, IResult iResult) throws RemoteException;

    boolean sendMessageActiveDevice(MessageEvent messageEvent, IResult iResult) throws RemoteException;

    void setActiveDevice(String str) throws RemoteException;

    void unMonitorStatus(IHNodeStatusChanged iHNodeStatusChanged) throws RemoteException;
}
