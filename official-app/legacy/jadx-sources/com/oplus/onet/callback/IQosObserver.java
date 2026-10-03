package com.oplus.onet.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.onet.lan.SocketQos;

/* JADX INFO: loaded from: classes8.dex */
public interface IQosObserver extends IInterface {

    public static class Default implements IQosObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.callback.IQosObserver
        public void onSocketQosAvailable(String str, SocketQos socketQos) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.IQosObserver
        public void onSocketQosUnavailable(String str, SocketQos socketQos) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IQosObserver {
        private static final String DESCRIPTOR = "com.oplus.onet.callback.IQosObserver";
        public static final int TRANSACTION_onSocketQosAvailable = 1;
        public static final int TRANSACTION_onSocketQosUnavailable = 2;

        public static class Proxy implements IQosObserver {
            public static IQosObserver sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.onet.callback.IQosObserver
            public void onSocketQosAvailable(String str, SocketQos socketQos) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (socketQos != null) {
                        parcelObtain.writeInt(1);
                        socketQos.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSocketQosAvailable(str, socketQos);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        socketQos.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IQosObserver
            public void onSocketQosUnavailable(String str, SocketQos socketQos) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (socketQos != null) {
                        parcelObtain.writeInt(1);
                        socketQos.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSocketQosUnavailable(str, socketQos);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        socketQos.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IQosObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IQosObserver)) ? new Proxy(iBinder) : (IQosObserver) iInterfaceQueryLocalInterface;
        }

        public static IQosObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IQosObserver iQosObserver) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iQosObserver == null) {
                return false;
            }
            Proxy.sDefaultImpl = iQosObserver;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            SocketQos socketQosCreateFromParcel;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String string = parcel.readString();
                socketQosCreateFromParcel = parcel.readInt() != 0 ? SocketQos.CREATOR.createFromParcel(parcel) : null;
                onSocketQosAvailable(string, socketQosCreateFromParcel);
                parcel2.writeNoException();
                if (socketQosCreateFromParcel != null) {
                    parcel2.writeInt(1);
                    socketQosCreateFromParcel.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String string2 = parcel.readString();
            socketQosCreateFromParcel = parcel.readInt() != 0 ? SocketQos.CREATOR.createFromParcel(parcel) : null;
            onSocketQosUnavailable(string2, socketQosCreateFromParcel);
            parcel2.writeNoException();
            if (socketQosCreateFromParcel != null) {
                parcel2.writeInt(1);
                socketQosCreateFromParcel.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void onSocketQosAvailable(String str, SocketQos socketQos) throws RemoteException;

    void onSocketQosUnavailable(String str, SocketQos socketQos) throws RemoteException;
}
