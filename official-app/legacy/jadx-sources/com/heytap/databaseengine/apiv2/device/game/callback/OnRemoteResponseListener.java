package com.heytap.databaseengine.apiv2.device.game.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.databaseengine.apiv2.device.game.model.GameHealthData;

/* JADX INFO: loaded from: classes15.dex */
public interface OnRemoteResponseListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteResponseListener";

    public static class Default implements OnRemoteResponseListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteResponseListener
        public void onResponse(int i, GameHealthData gameHealthData) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements OnRemoteResponseListener {
        static final int TRANSACTION_onResponse = 1;

        public static class Proxy implements OnRemoteResponseListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return OnRemoteResponseListener.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteResponseListener
            public void onResponse(int i, GameHealthData gameHealthData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OnRemoteResponseListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, gameHealthData, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, OnRemoteResponseListener.DESCRIPTOR);
        }

        public static OnRemoteResponseListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OnRemoteResponseListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OnRemoteResponseListener)) ? new Proxy(iBinder) : (OnRemoteResponseListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(OnRemoteResponseListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(OnRemoteResponseListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResponse(parcel.readInt(), (GameHealthData) a.c(parcel, GameHealthData.CREATOR));
            parcel2.writeNoException();
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

    void onResponse(int i, GameHealthData gameHealthData) throws RemoteException;
}
