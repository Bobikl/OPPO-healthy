package com.platform.usercenter.account.ams.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes9.dex */
public interface IAmsBinder extends IInterface {
    public static final String DESCRIPTOR = "com.platform.usercenter.account.ams.ipc.IAmsBinder";

    public static class Default implements IAmsBinder {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.platform.usercenter.account.ams.ipc.IAmsBinder
        public void execute(IpcRequest ipcRequest, ResultReceiver resultReceiver) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAmsBinder {
        static final int TRANSACTION_execute = 1;

        public static class Proxy implements IAmsBinder {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.platform.usercenter.account.ams.ipc.IAmsBinder
            public void execute(IpcRequest ipcRequest, ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAmsBinder.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, ipcRequest, 0);
                    _Parcel.writeTypedObject(parcelObtain, resultReceiver, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAmsBinder.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IAmsBinder.DESCRIPTOR);
        }

        public static IAmsBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAmsBinder.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAmsBinder)) ? new Proxy(iBinder) : (IAmsBinder) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAmsBinder.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAmsBinder.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            execute((IpcRequest) _Parcel.readTypedObject(parcel, IpcRequest.CREATOR), (ResultReceiver) _Parcel.readTypedObject(parcel, ResultReceiver.CREATOR));
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void execute(IpcRequest ipcRequest, ResultReceiver resultReceiver) throws RemoteException;
}
