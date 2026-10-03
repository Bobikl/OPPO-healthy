package com.oplus.safecenter.removableapp.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IRemovableApp extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.safecenter.removableapp.aidl.IRemovableApp";

    public static class Default implements IRemovableApp {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.safecenter.removableapp.aidl.IRemovableApp
        public boolean restoreRemovableApp(String str, IRemovableAppClient iRemovableAppClient, Bundle bundle) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IRemovableApp {
        static final int TRANSACTION_restoreRemovableApp = 1;

        public static class Proxy implements IRemovableApp {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRemovableApp.DESCRIPTOR;
            }

            @Override // com.oplus.safecenter.removableapp.aidl.IRemovableApp
            public boolean restoreRemovableApp(String str, IRemovableAppClient iRemovableAppClient, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemovableApp.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iRemovableAppClient);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRemovableApp.DESCRIPTOR);
        }

        public static IRemovableApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemovableApp.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemovableApp)) ? new Proxy(iBinder) : (IRemovableApp) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRemovableApp.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRemovableApp.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean zRestoreRemovableApp = restoreRemovableApp(parcel.readString(), IRemovableAppClient.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(zRestoreRemovableApp ? 1 : 0);
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

    boolean restoreRemovableApp(String str, IRemovableAppClient iRemovableAppClient, Bundle bundle) throws RemoteException;
}
