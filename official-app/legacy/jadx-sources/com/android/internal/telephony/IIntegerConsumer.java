package com.android.internal.telephony;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes12.dex */
public interface IIntegerConsumer extends IInterface {
    public static final String DESCRIPTOR = "com.android.internal.telephony.IIntegerConsumer";

    public static class Default implements IIntegerConsumer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IIntegerConsumer {

        public static class Proxy implements IIntegerConsumer {
            public static IIntegerConsumer sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IIntegerConsumer.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IIntegerConsumer.DESCRIPTOR);
        }

        public static IIntegerConsumer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IIntegerConsumer.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIntegerConsumer)) ? new Proxy(iBinder) : (IIntegerConsumer) iInterfaceQueryLocalInterface;
        }

        public static IIntegerConsumer getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IIntegerConsumer iIntegerConsumer) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iIntegerConsumer == null) {
                return false;
            }
            Proxy.sDefaultImpl = iIntegerConsumer;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(IIntegerConsumer.DESCRIPTOR);
            return true;
        }
    }
}
