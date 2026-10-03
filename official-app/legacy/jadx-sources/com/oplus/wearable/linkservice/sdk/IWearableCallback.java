package com.oplus.wearable.linkservice.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.common.Status;

/* JADX INFO: loaded from: classes5.dex */
public interface IWearableCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.wearable.linkservice.sdk.IWearableCallback";

    public static class Default implements IWearableCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableCallback
        public void onResult(Status status) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWearableCallback {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IWearableCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWearableCallback.DESCRIPTOR;
            }

            @Override // com.oplus.wearable.linkservice.sdk.IWearableCallback
            public void onResult(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearableCallback.DESCRIPTOR);
                    a.d(parcelObtain, status, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWearableCallback.DESCRIPTOR);
        }

        public static IWearableCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearableCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWearableCallback)) ? new Proxy(iBinder) : (IWearableCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearableCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearableCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult((Status) a.c(parcel, Status.CREATOR));
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

    void onResult(Status status) throws RemoteException;
}
