package com.heytap.health.watch.netnumber;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
public interface IWnnAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.netnumber.IWnnAidl";

    public static class Default implements IWnnAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.netnumber.IWnnAidl
        public boolean onMessageReceived(MessageEvent messageEvent) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IWnnAidl {
        static final int TRANSACTION_onMessageReceived = 1;

        public static class Proxy implements IWnnAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWnnAidl.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.netnumber.IWnnAidl
            public boolean onMessageReceived(MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWnnAidl.DESCRIPTOR);
                    a.d(parcelObtain, messageEvent, 0);
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
            attachInterface(this, IWnnAidl.DESCRIPTOR);
        }

        public static IWnnAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWnnAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWnnAidl)) ? new Proxy(iBinder) : (IWnnAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWnnAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWnnAidl.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean zOnMessageReceived = onMessageReceived((MessageEvent) a.c(parcel, MessageEvent.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(zOnMessageReceived ? 1 : 0);
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

    boolean onMessageReceived(MessageEvent messageEvent) throws RemoteException;
}
