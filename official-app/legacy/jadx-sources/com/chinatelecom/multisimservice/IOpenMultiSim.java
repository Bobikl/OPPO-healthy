package com.chinatelecom.multisimservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak;

/* JADX INFO: loaded from: classes13.dex */
public interface IOpenMultiSim extends IInterface {
    public static final String DESCRIPTOR = "com.chinatelecom.multisimservice.IOpenMultiSim";

    public static class Default implements IOpenMultiSim {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void downloadESimProfile(String str) throws RemoteException {
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() throws RemoteException {
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException {
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenMultiSim {
        static final int TRANSACTION_downloadESimProfile = 4;
        static final int TRANSACTION_getAttachedDeviceMultiSimInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        public static class Proxy implements IOpenMultiSim {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.chinatelecom.multisimservice.IOpenMultiSim
            public void downloadESimProfile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.chinatelecom.multisimservice.IOpenMultiSim
            public void getAttachedDeviceMultiSimInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOpenMultiSim.DESCRIPTOR;
            }

            @Override // com.chinatelecom.multisimservice.IOpenMultiSim
            public void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenMultiSimCalbcak);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.chinatelecom.multisimservice.IOpenMultiSim
            public void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenMultiSimCalbcak);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOpenMultiSim.DESCRIPTOR);
        }

        public static IOpenMultiSim asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenMultiSim.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenMultiSim)) ? new Proxy(iBinder) : (IOpenMultiSim) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenMultiSim.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenMultiSim.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                registerCallback(IOpenMultiSimCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(IOpenMultiSimCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceMultiSimInfo();
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                downloadESimProfile(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void downloadESimProfile(String str) throws RemoteException;

    void getAttachedDeviceMultiSimInfo() throws RemoteException;

    void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException;

    void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) throws RemoteException;
}
