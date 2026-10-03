package com.oplus.safecenter.removableapp.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IRemovableAppClient extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.safecenter.removableapp.aidl.IRemovableAppClient";

    public static class Default implements IRemovableAppClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.safecenter.removableapp.aidl.IRemovableAppClient
        public void onRestoreFinished(int i, String str, Intent intent) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRemovableAppClient {
        static final int TRANSACTION_onRestoreFinished = 1;

        public static class Proxy implements IRemovableAppClient {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRemovableAppClient.DESCRIPTOR;
            }

            @Override // com.oplus.safecenter.removableapp.aidl.IRemovableAppClient
            public void onRestoreFinished(int i, String str, Intent intent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemovableAppClient.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, intent, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRemovableAppClient.DESCRIPTOR);
        }

        public static IRemovableAppClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemovableAppClient.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemovableAppClient)) ? new Proxy(iBinder) : (IRemovableAppClient) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRemovableAppClient.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRemovableAppClient.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onRestoreFinished(parcel.readInt(), parcel.readString(), (Intent) a.c(parcel, Intent.CREATOR));
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

    void onRestoreFinished(int i, String str, Intent intent) throws RemoteException;
}
