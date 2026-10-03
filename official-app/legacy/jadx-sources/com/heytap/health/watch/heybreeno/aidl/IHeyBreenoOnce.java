package com.heytap.health.watch.heybreeno.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
public interface IHeyBreenoOnce extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.heybreeno.aidl.IHeyBreenoOnce";

    public static class Default implements IHeyBreenoOnce {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.heybreeno.aidl.IHeyBreenoOnce
        public void onMessageReceived(MessageEvent messageEvent) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHeyBreenoOnce {
        static final int TRANSACTION_onMessageReceived = 1;

        public static class Proxy implements IHeyBreenoOnce {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IHeyBreenoOnce.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.heybreeno.aidl.IHeyBreenoOnce
            public void onMessageReceived(MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeyBreenoOnce.DESCRIPTOR);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHeyBreenoOnce.DESCRIPTOR);
        }

        public static IHeyBreenoOnce asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHeyBreenoOnce.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHeyBreenoOnce)) ? new Proxy(iBinder) : (IHeyBreenoOnce) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHeyBreenoOnce.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHeyBreenoOnce.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onMessageReceived((MessageEvent) a.c(parcel, MessageEvent.CREATOR));
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

    void onMessageReceived(MessageEvent messageEvent) throws RemoteException;
}
