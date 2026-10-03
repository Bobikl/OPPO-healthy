package com.heytap.health.adaptersdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes15.dex */
public interface IMessageCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.adaptersdk.IMessageCallback";

    public static class Default implements IMessageCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IMessageCallback
        public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMessageCallback {
        static final int TRANSACTION_onMessageReceived = 1;

        public static class Proxy implements IMessageCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMessageCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.adaptersdk.IMessageCallback
            public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMessageCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMessageCallback.DESCRIPTOR);
        }

        public static IMessageCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMessageCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMessageCallback)) ? new Proxy(iBinder) : (IMessageCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMessageCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMessageCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onMessageReceived(parcel.readString(), (MessageEvent) a.c(parcel, MessageEvent.CREATOR));
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

    void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException;
}
