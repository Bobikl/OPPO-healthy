package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.heytap.accessory.bean.PeerAgent;

/* JADX INFO: loaded from: classes14.dex */
public interface IFrameworkManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IFrameworkManager";

    public static class Default implements IFrameworkManager {
        @Override // com.heytap.accessory.api.IFrameworkManager
        public Bundle acceptServiceConnection(long j2, String str, PeerAgent peerAgent, long j3, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int authenticatePeerAgent(long j2, String str, PeerAgent peerAgent, IPeerAgentAuthCallback iPeerAgentAuthCallback, long j3) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void cleanupAgent(long j2, String str) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void cleanupChannelCache(long j2, String str, long j3) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int closeServiceConnection(long j2, String str) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int findPeerAgents(long j2, long j3, String str, IPeerAgentCallback iPeerAgentCallback) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public Bundle getAgentDetails(long j2, String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public String getAgentId(long j2, String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public ResultReceiver getClientCallback(long j2) throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public Bundle getLocalAgentId(long j2, String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int getVersion() throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int handleAuthentication(int i) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public boolean isSocketConnected(long j2, String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public Bundle makeFrameworkConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void registerComponent(long j2, byte[] bArr) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void registerMexCallback(long j2, String str, IMsgExpCallback iMsgExpCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int rejectServiceConnection(long j2, String str, PeerAgent peerAgent, long j3) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int requestServiceConnection(long j2, String str, PeerAgent peerAgent, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int send(long j2, String str, long j3, byte[] bArr, boolean z, int i, int i2, int i3) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int sendMessage(long j2, String str, String str2, long j3, byte[] bArr, boolean z, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void sendMessageDeliveryStatus(long j2, long j3, int i, int i2) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void sendMessageDeliveryStatusV2(long j2, long j3, String str, int i, int i2) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int sendV2(long j2, String str, long j3, String str2, long j4, byte[] bArr, boolean z, int i, int i2, int i3, boolean z2) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public int tearFrameworkConnection(long j2) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.IFrameworkManager
        public void unregisterMexCallback(long j2, String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFrameworkManager {
        static final int TRANSACTION_acceptServiceConnection = 7;
        static final int TRANSACTION_authenticatePeerAgent = 5;
        static final int TRANSACTION_cleanupAgent = 18;
        static final int TRANSACTION_cleanupChannelCache = 26;
        static final int TRANSACTION_closeServiceConnection = 9;
        static final int TRANSACTION_findPeerAgents = 4;
        static final int TRANSACTION_getAgentDetails = 10;
        static final int TRANSACTION_getAgentId = 19;
        static final int TRANSACTION_getClientCallback = 13;
        static final int TRANSACTION_getLocalAgentId = 3;
        static final int TRANSACTION_getVersion = 21;
        static final int TRANSACTION_handleAuthentication = 22;
        static final int TRANSACTION_handleAuthenticationWithPermission = 23;
        static final int TRANSACTION_isSocketConnected = 12;
        static final int TRANSACTION_makeFrameworkConnection = 1;
        static final int TRANSACTION_registerComponent = 2;
        static final int TRANSACTION_registerMexCallback = 14;
        static final int TRANSACTION_rejectServiceConnection = 8;
        static final int TRANSACTION_requestServiceConnection = 6;
        static final int TRANSACTION_send = 20;
        static final int TRANSACTION_sendMessage = 16;
        static final int TRANSACTION_sendMessageDeliveryStatus = 17;
        static final int TRANSACTION_sendMessageDeliveryStatusV2 = 25;
        static final int TRANSACTION_sendV2 = 24;
        static final int TRANSACTION_tearFrameworkConnection = 11;
        static final int TRANSACTION_unregisterMexCallback = 15;

        public static class Proxy implements IFrameworkManager {
            public static IFrameworkManager sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public Bundle acceptServiceConnection(long j2, String str, PeerAgent peerAgent, long j3, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (peerAgent != null) {
                        parcelObtain.writeInt(1);
                        peerAgent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeStrongBinder(iServiceConnectionCallback != null ? iServiceConnectionCallback.asBinder() : null);
                    parcelObtain.writeStrongBinder(iServiceChannelCallback != null ? iServiceChannelCallback.asBinder() : null);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().acceptServiceConnection(j2, str, peerAgent, j3, iServiceConnectionCallback, iServiceChannelCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int authenticatePeerAgent(long j2, String str, PeerAgent peerAgent, IPeerAgentAuthCallback iPeerAgentAuthCallback, long j3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (peerAgent != null) {
                        parcelObtain.writeInt(1);
                        peerAgent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iPeerAgentAuthCallback != null ? iPeerAgentAuthCallback.asBinder() : null);
                    parcelObtain.writeLong(j3);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().authenticatePeerAgent(j2, str, peerAgent, iPeerAgentAuthCallback, j3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void cleanupAgent(long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cleanupAgent(j2, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void cleanupChannelCache(long j2, String str, long j3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j3);
                    if (this.mRemote.transact(26, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cleanupChannelCache(j2, str, j3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int closeServiceConnection(long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().closeServiceConnection(j2, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int findPeerAgents(long j2, long j3, String str, IPeerAgentCallback iPeerAgentCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iPeerAgentCallback != null ? iPeerAgentCallback.asBinder() : null);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().findPeerAgents(j2, j3, str, iPeerAgentCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public Bundle getAgentDetails(long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAgentDetails(j2, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public String getAgentId(long j2, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAgentId(j2, str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public ResultReceiver getClientCallback(long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    if (!this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getClientCallback(j2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IFrameworkManager.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public Bundle getLocalAgentId(long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalAgentId(j2, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int getVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    if (!this.mRemote.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVersion();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int handleAuthentication(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(22, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().handleAuthentication(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().handleAuthenticationWithPermission(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public boolean isSocketConnected(long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSocketConnected(j2, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public Bundle makeFrameworkConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iDeathCallback != null ? iDeathCallback.asBinder() : null);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iServiceConnectionIndicationCallback != null ? iServiceConnectionIndicationCallback.asBinder() : null);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().makeFrameworkConnection(i, str, iDeathCallback, i2, iServiceConnectionIndicationCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void registerComponent(long j2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerComponent(j2, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void registerMexCallback(long j2, String str, IMsgExpCallback iMsgExpCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iMsgExpCallback != null ? iMsgExpCallback.asBinder() : null);
                    if (this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerMexCallback(j2, str, iMsgExpCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int rejectServiceConnection(long j2, String str, PeerAgent peerAgent, long j3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (peerAgent != null) {
                        parcelObtain.writeInt(1);
                        peerAgent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeLong(j3);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().rejectServiceConnection(j2, str, peerAgent, j3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int requestServiceConnection(long j2, String str, PeerAgent peerAgent, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (peerAgent != null) {
                        parcelObtain.writeInt(1);
                        peerAgent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iServiceConnectionCallback != null ? iServiceConnectionCallback.asBinder() : null);
                    parcelObtain.writeStrongBinder(iServiceChannelCallback != null ? iServiceChannelCallback.asBinder() : null);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().requestServiceConnection(j2, str, peerAgent, iServiceConnectionCallback, iServiceChannelCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int send(long j2, String str, long j3, byte[] bArr, boolean z, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (!this.mRemote.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().send(j2, str, j3, bArr, z, i, i2, i3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int sendMessage(long j2, String str, String str2, long j3, byte[] bArr, boolean z, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendMessage(j2, str, str2, j3, bArr, z, i, i2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void sendMessageDeliveryStatus(long j2, long j3, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendMessageDeliveryStatus(j2, j3, i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void sendMessageDeliveryStatusV2(long j2, long j3, String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(25, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendMessageDeliveryStatusV2(j2, j3, str, i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int sendV2(long j2, String str, long j3, String str2, long j4, byte[] bArr, boolean z, int i, int i2, int i3, boolean z2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeLong(j4);
                    parcelObtain.writeByteArray(bArr);
                    int i4 = 1;
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (!z2) {
                        i4 = 0;
                    }
                    parcelObtain.writeInt(i4);
                    if (!this.mRemote.transact(24, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendV2(j2, str, j3, str2, j4, bArr, z, i, i2, i3, z2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public int tearFrameworkConnection(long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().tearFrameworkConnection(j2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IFrameworkManager
            public void unregisterMexCallback(long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterMexCallback(j2, str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFrameworkManager.DESCRIPTOR);
        }

        public static IFrameworkManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IFrameworkManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFrameworkManager)) ? new Proxy(iBinder) : (IFrameworkManager) iInterfaceQueryLocalInterface;
        }

        public static IFrameworkManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IFrameworkManager iFrameworkManager) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iFrameworkManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iFrameworkManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IFrameworkManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    Bundle bundleMakeFrameworkConnection = makeFrameworkConnection(parcel.readInt(), parcel.readString(), IDeathCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), IServiceConnectionIndicationCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (bundleMakeFrameworkConnection != null) {
                        parcel2.writeInt(1);
                        bundleMakeFrameworkConnection.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    registerComponent(parcel.readLong(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    Bundle localAgentId = getLocalAgentId(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    if (localAgentId != null) {
                        parcel2.writeInt(1);
                        localAgentId.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iFindPeerAgents = findPeerAgents(parcel.readLong(), parcel.readLong(), parcel.readString(), IPeerAgentCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iFindPeerAgents);
                    return true;
                case 5:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iAuthenticatePeerAgent = authenticatePeerAgent(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? PeerAgent.CREATOR.createFromParcel(parcel) : null, IPeerAgentAuthCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAuthenticatePeerAgent);
                    return true;
                case 6:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iRequestServiceConnection = requestServiceConnection(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? PeerAgent.CREATOR.createFromParcel(parcel) : null, IServiceConnectionCallback.Stub.asInterface(parcel.readStrongBinder()), IServiceChannelCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestServiceConnection);
                    return true;
                case 7:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    Bundle bundleAcceptServiceConnection = acceptServiceConnection(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? PeerAgent.CREATOR.createFromParcel(parcel) : null, parcel.readLong(), IServiceConnectionCallback.Stub.asInterface(parcel.readStrongBinder()), IServiceChannelCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (bundleAcceptServiceConnection != null) {
                        parcel2.writeInt(1);
                        bundleAcceptServiceConnection.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iRejectServiceConnection = rejectServiceConnection(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? PeerAgent.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRejectServiceConnection);
                    return true;
                case 9:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iCloseServiceConnection = closeServiceConnection(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCloseServiceConnection);
                    return true;
                case 10:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    Bundle agentDetails = getAgentDetails(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    if (agentDetails != null) {
                        parcel2.writeInt(1);
                        agentDetails.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iTearFrameworkConnection = tearFrameworkConnection(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iTearFrameworkConnection);
                    return true;
                case 12:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    boolean zIsSocketConnected = isSocketConnected(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSocketConnected ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    ResultReceiver clientCallback = getClientCallback(parcel.readLong());
                    parcel2.writeNoException();
                    if (clientCallback != null) {
                        parcel2.writeInt(1);
                        clientCallback.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 14:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    registerMexCallback(parcel.readLong(), parcel.readString(), IMsgExpCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    unregisterMexCallback(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iSendMessage = sendMessage(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createByteArray(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendMessage);
                    return true;
                case 17:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    sendMessageDeliveryStatus(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    cleanupAgent(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    String agentId = getAgentId(parcel.readLong(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(agentId);
                    return true;
                case 20:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iSend = send(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.createByteArray(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iSend);
                    return true;
                case 21:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                case 22:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iHandleAuthentication = handleAuthentication(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iHandleAuthentication);
                    return true;
                case 23:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    boolean zHandleAuthenticationWithPermission = handleAuthenticationWithPermission(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHandleAuthenticationWithPermission ? 1 : 0);
                    return true;
                case 24:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    int iSendV2 = sendV2(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.createByteArray(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendV2);
                    return true;
                case 25:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    sendMessageDeliveryStatusV2(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(IFrameworkManager.DESCRIPTOR);
                    cleanupChannelCache(parcel.readLong(), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    Bundle acceptServiceConnection(long j2, String str, PeerAgent peerAgent, long j3, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws RemoteException;

    int authenticatePeerAgent(long j2, String str, PeerAgent peerAgent, IPeerAgentAuthCallback iPeerAgentAuthCallback, long j3) throws RemoteException;

    void cleanupAgent(long j2, String str) throws RemoteException;

    void cleanupChannelCache(long j2, String str, long j3) throws RemoteException;

    int closeServiceConnection(long j2, String str) throws RemoteException;

    int findPeerAgents(long j2, long j3, String str, IPeerAgentCallback iPeerAgentCallback) throws RemoteException;

    Bundle getAgentDetails(long j2, String str) throws RemoteException;

    String getAgentId(long j2, String str, String str2) throws RemoteException;

    ResultReceiver getClientCallback(long j2) throws RemoteException;

    Bundle getLocalAgentId(long j2, String str) throws RemoteException;

    int getVersion() throws RemoteException;

    int handleAuthentication(int i) throws RemoteException;

    boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException;

    boolean isSocketConnected(long j2, String str) throws RemoteException;

    Bundle makeFrameworkConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) throws RemoteException;

    void registerComponent(long j2, byte[] bArr) throws RemoteException;

    void registerMexCallback(long j2, String str, IMsgExpCallback iMsgExpCallback) throws RemoteException;

    int rejectServiceConnection(long j2, String str, PeerAgent peerAgent, long j3) throws RemoteException;

    int requestServiceConnection(long j2, String str, PeerAgent peerAgent, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws RemoteException;

    int send(long j2, String str, long j3, byte[] bArr, boolean z, int i, int i2, int i3) throws RemoteException;

    int sendMessage(long j2, String str, String str2, long j3, byte[] bArr, boolean z, int i, int i2) throws RemoteException;

    void sendMessageDeliveryStatus(long j2, long j3, int i, int i2) throws RemoteException;

    void sendMessageDeliveryStatusV2(long j2, long j3, String str, int i, int i2) throws RemoteException;

    int sendV2(long j2, String str, long j3, String str2, long j4, byte[] bArr, boolean z, int i, int i2, int i3, boolean z2) throws RemoteException;

    int tearFrameworkConnection(long j2) throws RemoteException;

    void unregisterMexCallback(long j2, String str) throws RemoteException;
}
