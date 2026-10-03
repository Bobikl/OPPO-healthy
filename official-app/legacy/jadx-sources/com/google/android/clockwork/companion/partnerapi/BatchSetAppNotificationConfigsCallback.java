package com.google.android.clockwork.companion.partnerapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface BatchSetAppNotificationConfigsCallback extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback";

    public static class Default implements BatchSetAppNotificationConfigsCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback
        public void onResult(Map map) throws RemoteException {
        }

        @Override // com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback
        public void onTimeout() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements BatchSetAppNotificationConfigsCallback {
        static final int TRANSACTION_onResult = 1;
        static final int TRANSACTION_onTimeout = 2;

        public static class Proxy implements BatchSetAppNotificationConfigsCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return BatchSetAppNotificationConfigsCallback.DESCRIPTOR;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback
            public void onResult(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback
            public void onTimeout() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
        }

        public static BatchSetAppNotificationConfigsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof BatchSetAppNotificationConfigsCallback)) ? new Proxy(iBinder) : (BatchSetAppNotificationConfigsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult(parcel.readHashMap(getClass().getClassLoader()));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onTimeout();
            }
            return true;
        }
    }

    void onResult(Map map) throws RemoteException;

    void onTimeout() throws RemoteException;
}
