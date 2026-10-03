package com.heytap.health.track;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface ITrackInterface extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.track.ITrackInterface";

    public static class Default implements ITrackInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.track.ITrackInterface
        public void setCustomClientId(String str) throws RemoteException {
        }

        @Override // com.heytap.health.track.ITrackInterface
        public void track(String str, String str2, String str3) throws RemoteException {
        }

        @Override // com.heytap.health.track.ITrackInterface
        public void upload() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITrackInterface {
        static final int TRANSACTION_setCustomClientId = 2;
        static final int TRANSACTION_track = 3;
        static final int TRANSACTION_upload = 1;

        public static class Proxy implements ITrackInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ITrackInterface.DESCRIPTOR;
            }

            @Override // com.heytap.health.track.ITrackInterface
            public void setCustomClientId(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrackInterface.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.track.ITrackInterface
            public void track(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrackInterface.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.track.ITrackInterface
            public void upload() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrackInterface.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITrackInterface.DESCRIPTOR);
        }

        public static ITrackInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrackInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrackInterface)) ? new Proxy(iBinder) : (ITrackInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITrackInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITrackInterface.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                upload();
                parcel2.writeNoException();
            } else if (i == 2) {
                setCustomClientId(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                track(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void setCustomClientId(String str) throws RemoteException;

    void track(String str, String str2, String str3) throws RemoteException;

    void upload() throws RemoteException;
}
