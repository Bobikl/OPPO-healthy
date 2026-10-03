package com.heytap.databaseengine.apiv2.device.game.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.databaseengine.apiv2.device.game.model.GameInfo;

/* JADX INFO: loaded from: classes15.dex */
public interface OnRequestGameStatusListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.device.game.callback.OnRequestGameStatusListener";

    public static class Default implements OnRequestGameStatusListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.callback.OnRequestGameStatusListener
        public GameInfo onRequestGameStatus() throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements OnRequestGameStatusListener {
        static final int TRANSACTION_onRequestGameStatus = 1;

        public static class Proxy implements OnRequestGameStatusListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return OnRequestGameStatusListener.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.callback.OnRequestGameStatusListener
            public GameInfo onRequestGameStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OnRequestGameStatusListener.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (GameInfo) a.c(parcelObtain2, GameInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, OnRequestGameStatusListener.DESCRIPTOR);
        }

        public static OnRequestGameStatusListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OnRequestGameStatusListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OnRequestGameStatusListener)) ? new Proxy(iBinder) : (OnRequestGameStatusListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(OnRequestGameStatusListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(OnRequestGameStatusListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            GameInfo gameInfoOnRequestGameStatus = onRequestGameStatus();
            parcel2.writeNoException();
            a.d(parcel2, gameInfoOnRequestGameStatus, 1);
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

    GameInfo onRequestGameStatus() throws RemoteException;
}
