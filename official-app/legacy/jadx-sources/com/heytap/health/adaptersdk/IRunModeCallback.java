package com.heytap.health.adaptersdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;

/* JADX INFO: loaded from: classes15.dex */
public interface IRunModeCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.adaptersdk.IRunModeCallback";

    public static class Default implements IRunModeCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IRunModeCallback
        public void onRunModeChanged(Node node, int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRunModeCallback {
        static final int TRANSACTION_onRunModeChanged = 1;

        public static class Proxy implements IRunModeCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRunModeCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.adaptersdk.IRunModeCallback
            public void onRunModeChanged(Node node, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRunModeCallback.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRunModeCallback.DESCRIPTOR);
        }

        public static IRunModeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRunModeCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRunModeCallback)) ? new Proxy(iBinder) : (IRunModeCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRunModeCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRunModeCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onRunModeChanged((Node) a.c(parcel, Node.CREATOR), parcel.readInt(), parcel.readInt());
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

    void onRunModeChanged(Node node, int i, int i2) throws RemoteException;
}
