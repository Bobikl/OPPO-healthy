package com.oplus.navi.oms;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IOmsPluginLoader extends IInterface {
    public static final String a = "com.oplus.navi.oms.IOmsPluginLoader";

    public static class Default implements IOmsPluginLoader {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.navi.oms.IOmsPluginLoader
        public void onQueryCompleted(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOmsPluginLoader {
        static final int b = 1;

        public static class Proxy implements IOmsPluginLoader {
            private IBinder b;

            public Proxy(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            public String getInterfaceDescriptor() {
                return IOmsPluginLoader.a;
            }

            @Override // com.oplus.navi.oms.IOmsPluginLoader
            public void onQueryCompleted(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOmsPluginLoader.a);
                    a.b(parcelObtain, bundle, 0);
                    this.b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOmsPluginLoader.a);
        }

        public static IOmsPluginLoader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOmsPluginLoader.a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOmsPluginLoader)) ? new Proxy(iBinder) : (IOmsPluginLoader) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOmsPluginLoader.a);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOmsPluginLoader.a);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onQueryCompleted((Bundle) a.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class a {
        public static <T> T a(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onQueryCompleted(Bundle bundle) throws RemoteException;
}
