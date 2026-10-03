package com.oppo.ovoicemanager.train;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public interface IOVoiceTrain extends IInterface {
    public static final String DESCRIPTOR = "com.oppo.ovoicemanager.train.IOVoiceTrain";

    public static class Default implements IOVoiceTrain {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void clearAppData() throws RemoteException {
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void deleteVprintModel(int i) throws RemoteException {
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public int getTrainStep() throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public int getVersion() throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public boolean getVprintStatus(int i) throws RemoteException {
            return false;
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public String[] listVprintModel() throws RemoteException {
            return null;
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public int setMultipleBreenoService(boolean z) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void setOneshotMode(boolean z) throws RemoteException {
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void setVprintStatus(int i, boolean z) throws RemoteException {
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void startSpeech() throws RemoteException {
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void startTrain(int i, int i2, IBinder iBinder, Bundle bundle) throws RemoteException {
        }

        @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
        public void stopTrain() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOVoiceTrain {
        static final int TRANSACTION_clearAppData = 10;
        static final int TRANSACTION_deleteVprintModel = 5;
        static final int TRANSACTION_getTrainStep = 3;
        static final int TRANSACTION_getVersion = 12;
        static final int TRANSACTION_getVprintStatus = 7;
        static final int TRANSACTION_listVprintModel = 8;
        static final int TRANSACTION_setMultipleBreenoService = 11;
        static final int TRANSACTION_setOneshotMode = 9;
        static final int TRANSACTION_setVprintStatus = 6;
        static final int TRANSACTION_startSpeech = 4;
        static final int TRANSACTION_startTrain = 1;
        static final int TRANSACTION_stopTrain = 2;

        public static class Proxy implements IOVoiceTrain {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void clearAppData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void deleteVprintModel(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOVoiceTrain.DESCRIPTOR;
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public int getTrainStep() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public int getVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public boolean getVprintStatus(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public String[] listVprintModel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public int setMultipleBreenoService(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void setOneshotMode(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void setVprintStatus(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void startSpeech() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void startTrain(int i, int i2, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iBinder);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.train.IOVoiceTrain
            public void stopTrain() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrain.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOVoiceTrain.DESCRIPTOR);
        }

        public static IOVoiceTrain asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOVoiceTrain.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOVoiceTrain)) ? new Proxy(iBinder) : (IOVoiceTrain) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOVoiceTrain.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOVoiceTrain.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    startTrain(parcel.readInt(), parcel.readInt(), parcel.readStrongBinder(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    stopTrain();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int trainStep = getTrainStep();
                    parcel2.writeNoException();
                    parcel2.writeInt(trainStep);
                    return true;
                case 4:
                    startSpeech();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    deleteVprintModel(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    setVprintStatus(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean vprintStatus = getVprintStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(vprintStatus ? 1 : 0);
                    return true;
                case 8:
                    String[] strArrListVprintModel = listVprintModel();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(strArrListVprintModel);
                    return true;
                case 9:
                    setOneshotMode(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    clearAppData();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    int multipleBreenoService = setMultipleBreenoService(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(multipleBreenoService);
                    return true;
                case 12:
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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

    void clearAppData() throws RemoteException;

    void deleteVprintModel(int i) throws RemoteException;

    int getTrainStep() throws RemoteException;

    int getVersion() throws RemoteException;

    boolean getVprintStatus(int i) throws RemoteException;

    String[] listVprintModel() throws RemoteException;

    int setMultipleBreenoService(boolean z) throws RemoteException;

    void setOneshotMode(boolean z) throws RemoteException;

    void setVprintStatus(int i, boolean z) throws RemoteException;

    void startSpeech() throws RemoteException;

    void startTrain(int i, int i2, IBinder iBinder, Bundle bundle) throws RemoteException;

    void stopTrain() throws RemoteException;
}
