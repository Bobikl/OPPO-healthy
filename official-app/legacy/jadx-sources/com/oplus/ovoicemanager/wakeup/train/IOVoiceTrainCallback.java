package com.oplus.ovoicemanager.wakeup.train;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IOVoiceTrainCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback";

    public static class Default implements IOVoiceTrainCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onAudioRecord(int i) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onSpeechEnd(int i, int i2) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onSpeechProgress(int i, int i2) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onSpeechStart(int i) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainEnd(int i) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainError(int i) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainStart() throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainStop() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOVoiceTrainCallback {
        static final int TRANSACTION_onAudioRecord = 8;
        static final int TRANSACTION_onSpeechEnd = 7;
        static final int TRANSACTION_onSpeechProgress = 6;
        static final int TRANSACTION_onSpeechStart = 5;
        static final int TRANSACTION_onTrainEnd = 4;
        static final int TRANSACTION_onTrainError = 2;
        static final int TRANSACTION_onTrainStart = 1;
        static final int TRANSACTION_onTrainStop = 3;

        public static class Proxy implements IOVoiceTrainCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOVoiceTrainCallback.DESCRIPTOR;
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onAudioRecord(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onSpeechEnd(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onSpeechProgress(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onSpeechStart(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onTrainEnd(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onTrainError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onTrainStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
            public void onTrainStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceTrainCallback.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOVoiceTrainCallback.DESCRIPTOR);
        }

        public static IOVoiceTrainCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOVoiceTrainCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOVoiceTrainCallback)) ? new Proxy(iBinder) : (IOVoiceTrainCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOVoiceTrainCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOVoiceTrainCallback.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onTrainStart();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onTrainError(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onTrainStop();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onTrainEnd(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onSpeechStart(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onSpeechProgress(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onSpeechEnd(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    onAudioRecord(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onAudioRecord(int i) throws RemoteException;

    void onSpeechEnd(int i, int i2) throws RemoteException;

    void onSpeechProgress(int i, int i2) throws RemoteException;

    void onSpeechStart(int i) throws RemoteException;

    void onTrainEnd(int i) throws RemoteException;

    void onTrainError(int i) throws RemoteException;

    void onTrainStart() throws RemoteException;

    void onTrainStop() throws RemoteException;
}
