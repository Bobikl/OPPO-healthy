package com.heytap.wearable.oms.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.wearable.oms.common.Status;
import com.heytap.wearable.oms.internal.CapabilityOmsVersionParcelable;
import com.heytap.wearable.oms.internal.CapabilityPackageInfoParcelable;
import com.heytap.wearable.oms.internal.MessageEventParcelable;
import com.heytap.wearable.oms.internal.NodeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public interface IWearableListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.oms.aidl.IWearableListener";

    public static class Default implements IWearableListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public void onAck(int i, Status status) throws RemoteException {
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public void onGetOmsVersion(int i, CapabilityOmsVersionParcelable capabilityOmsVersionParcelable) throws RemoteException {
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public void onGetPackageInfo(int i, CapabilityPackageInfoParcelable capabilityPackageInfoParcelable) throws RemoteException {
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public void onMessageReceived(MessageEventParcelable messageEventParcelable) throws RemoteException {
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public int onMessageReceived2(MessageEventParcelable messageEventParcelable) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public void onPeerConnected(NodeParcelable nodeParcelable) throws RemoteException {
        }

        @Override // com.heytap.wearable.oms.aidl.IWearableListener
        public void onPeerDisconnected(NodeParcelable nodeParcelable) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWearableListener {
        static final int TRANSACTION_onAck = 4;
        static final int TRANSACTION_onGetOmsVersion = 6;
        static final int TRANSACTION_onGetPackageInfo = 5;
        static final int TRANSACTION_onMessageReceived = 3;
        static final int TRANSACTION_onMessageReceived2 = 7;
        static final int TRANSACTION_onPeerConnected = 1;
        static final int TRANSACTION_onPeerDisconnected = 2;

        public static class Proxy implements IWearableListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWearableListener.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public void onAck(int i, Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, status, 0);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public void onGetOmsVersion(int i, CapabilityOmsVersionParcelable capabilityOmsVersionParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, capabilityOmsVersionParcelable, 0);
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public void onGetPackageInfo(int i, CapabilityPackageInfoParcelable capabilityPackageInfoParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, capabilityPackageInfoParcelable, 0);
                    this.mRemote.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public void onMessageReceived(MessageEventParcelable messageEventParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, messageEventParcelable, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public int onMessageReceived2(MessageEventParcelable messageEventParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, messageEventParcelable, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public void onPeerConnected(NodeParcelable nodeParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, nodeParcelable, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.oms.aidl.IWearableListener
            public void onPeerDisconnected(NodeParcelable nodeParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableListener.DESCRIPTOR);
                    a.d(parcelObtain, nodeParcelable, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
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
                    onPeerConnected((NodeParcelable) a.c(parcel, NodeParcelable.CREATOR));
                    return true;
                case 2:
                    onPeerDisconnected((NodeParcelable) a.c(parcel, NodeParcelable.CREATOR));
                    return true;
                case 3:
                    onMessageReceived((MessageEventParcelable) a.c(parcel, MessageEventParcelable.CREATOR));
                    return true;
                case 4:
                    onAck(parcel.readInt(), (Status) a.c(parcel, Status.CREATOR));
                    return true;
                case 5:
                    onGetPackageInfo(parcel.readInt(), (CapabilityPackageInfoParcelable) a.c(parcel, CapabilityPackageInfoParcelable.CREATOR));
                    return true;
                case 6:
                    onGetOmsVersion(parcel.readInt(), (CapabilityOmsVersionParcelable) a.c(parcel, CapabilityOmsVersionParcelable.CREATOR));
                    return true;
                case 7:
                    int iOnMessageReceived2 = onMessageReceived2((MessageEventParcelable) a.c(parcel, MessageEventParcelable.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnMessageReceived2);
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

    void onAck(int i, Status status) throws RemoteException;

    void onGetOmsVersion(int i, CapabilityOmsVersionParcelable capabilityOmsVersionParcelable) throws RemoteException;

    void onGetPackageInfo(int i, CapabilityPackageInfoParcelable capabilityPackageInfoParcelable) throws RemoteException;

    void onMessageReceived(MessageEventParcelable messageEventParcelable) throws RemoteException;

    int onMessageReceived2(MessageEventParcelable messageEventParcelable) throws RemoteException;

    void onPeerConnected(NodeParcelable nodeParcelable) throws RemoteException;

    void onPeerDisconnected(NodeParcelable nodeParcelable) throws RemoteException;
}
