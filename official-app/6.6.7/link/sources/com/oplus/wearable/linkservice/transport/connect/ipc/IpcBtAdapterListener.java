package com.oplus.wearable.linkservice.transport.connect.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IpcBtAdapterListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.wearable.linkservice.transport.connect.ipc.IpcBtAdapterListener";

    public static class Default implements IpcBtAdapterListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IpcBtAdapterListener {

        public static class Proxy implements IpcBtAdapterListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IpcBtAdapterListener.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IpcBtAdapterListener.DESCRIPTOR);
        }

        public static IpcBtAdapterListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IpcBtAdapterListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IpcBtAdapterListener)) ? new Proxy(iBinder) : (IpcBtAdapterListener) iInterfaceQueryLocalInterface;
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
            parcel2.writeString(IpcBtAdapterListener.DESCRIPTOR);
            return true;
        }
    }
}
