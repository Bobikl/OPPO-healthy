package com.heytap.health.watch.wifi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
public interface IWifiSyncOnce extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.wifi.IWifiSyncOnce";

    public static class Default implements IWifiSyncOnce {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
        public void onMessageReceived(MessageEvent messageEvent) throws RemoteException {
        }

        @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
        public void processBondConnect(Node node) throws RemoteException {
        }

        @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
        public void processCheck() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWifiSyncOnce {
        static final int TRANSACTION_onMessageReceived = 2;
        static final int TRANSACTION_processBondConnect = 3;
        static final int TRANSACTION_processCheck = 4;

        public static class Proxy implements IWifiSyncOnce {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWifiSyncOnce.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
            public void onMessageReceived(MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
            public void processBondConnect(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
            public void processCheck() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiSyncOnce.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWifiSyncOnce.DESCRIPTOR);
        }

        public static IWifiSyncOnce asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWifiSyncOnce.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWifiSyncOnce)) ? new Proxy(iBinder) : (IWifiSyncOnce) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWifiSyncOnce.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWifiSyncOnce.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                onMessageReceived((MessageEvent) a.c(parcel, MessageEvent.CREATOR));
                parcel2.writeNoException();
            } else if (i == 3) {
                processBondConnect((Node) a.c(parcel, Node.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                processCheck();
                parcel2.writeNoException();
            }
            return true;
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

    void onMessageReceived(MessageEvent messageEvent) throws RemoteException;

    void processBondConnect(Node node) throws RemoteException;

    void processCheck() throws RemoteException;
}
