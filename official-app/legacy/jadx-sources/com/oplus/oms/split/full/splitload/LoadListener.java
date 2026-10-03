package com.oplus.oms.split.full.splitload;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface LoadListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.oms.split.full.splitload.LoadListener";

    public static class Default implements LoadListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.oms.split.full.splitload.LoadListener
        public void loadStatus(Map map) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements LoadListener {
        static final int TRANSACTION_loadStatus = 1;

        public static class Proxy implements LoadListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return LoadListener.DESCRIPTOR;
            }

            @Override // com.oplus.oms.split.full.splitload.LoadListener
            public void loadStatus(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(LoadListener.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, LoadListener.DESCRIPTOR);
        }

        public static LoadListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(LoadListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof LoadListener)) ? new Proxy(iBinder) : (LoadListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(LoadListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(LoadListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            loadStatus(parcel.readHashMap(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        }
    }

    void loadStatus(Map map) throws RemoteException;
}
