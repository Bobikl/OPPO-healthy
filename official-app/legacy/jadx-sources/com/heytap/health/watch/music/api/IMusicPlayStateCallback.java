package com.heytap.health.watch.music.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IMusicPlayStateCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.music.api.IMusicPlayStateCallback";

    public static class Default implements IMusicPlayStateCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.music.api.IMusicPlayStateCallback
        public void onPlayStateChanged(boolean z, String str, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMusicPlayStateCallback {
        static final int TRANSACTION_onPlayStateChanged = 1;

        public static class Proxy implements IMusicPlayStateCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMusicPlayStateCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.music.api.IMusicPlayStateCallback
            public void onPlayStateChanged(boolean z, String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicPlayStateCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMusicPlayStateCallback.DESCRIPTOR);
        }

        public static IMusicPlayStateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMusicPlayStateCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMusicPlayStateCallback)) ? new Proxy(iBinder) : (IMusicPlayStateCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMusicPlayStateCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMusicPlayStateCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onPlayStateChanged(parcel.readInt() != 0, parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onPlayStateChanged(boolean z, String str, int i) throws RemoteException;
}
