package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.MessageEventParcelable;
import com.oplus.ocs.wearengine.common.Status;

/* JADX INFO: loaded from: classes8.dex */
public interface IMessageListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IMessageListener";

    public static class Default implements IMessageListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IMessageListener
        public void onAck(int i, Status status) throws RemoteException {
        }

        @Override // com.oplus.ocs.wearengine.aidl.IMessageListener
        public int onMessageReceived(MessageEventParcelable messageEventParcelable) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IMessageListener {
        static final int TRANSACTION_onAck = 1;
        static final int TRANSACTION_onMessageReceived = 2;

        public static class Proxy implements IMessageListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMessageListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IMessageListener
            public void onAck(int i, Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMessageListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, status, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IMessageListener
            public int onMessageReceived(MessageEventParcelable messageEventParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMessageListener.DESCRIPTOR);
                    a.d(parcelObtain, messageEventParcelable, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMessageListener.DESCRIPTOR);
        }

        public static IMessageListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMessageListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMessageListener)) ? new Proxy(iBinder) : (IMessageListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMessageListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMessageListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onAck(parcel.readInt(), (Status) a.c(parcel, Status.CREATOR));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int iOnMessageReceived = onMessageReceived((MessageEventParcelable) a.c(parcel, MessageEventParcelable.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iOnMessageReceived);
            }
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

    void onAck(int i, Status status) throws RemoteException;

    int onMessageReceived(MessageEventParcelable messageEventParcelable) throws RemoteException;
}
