package com.oplus.ovoicemanager.wakeup.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IVoiceWakeupManager extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager";

    public static class Default implements IVoiceWakeupManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public int establishSession(IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public int getChannelNumber() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public int onEnd(int i, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public int onError(int i) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public int onRecognition(int i, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public boolean startHotwordRecording(int i, IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public boolean stopHotwordRecording() throws RemoteException {
            return false;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
        public int terminateSession() throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IVoiceWakeupManager {
        static final int TRANSACTION_establishSession = 4;
        static final int TRANSACTION_getChannelNumber = 3;
        static final int TRANSACTION_onEnd = 8;
        static final int TRANSACTION_onError = 7;
        static final int TRANSACTION_onRecognition = 6;
        static final int TRANSACTION_startHotwordRecording = 1;
        static final int TRANSACTION_stopHotwordRecording = 2;
        static final int TRANSACTION_terminateSession = 5;

        public static class Proxy implements IVoiceWakeupManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public int establishSession(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public int getChannelNumber() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IVoiceWakeupManager.DESCRIPTOR;
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public int onEnd(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public int onError(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public int onRecognition(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public boolean startHotwordRecording(int i, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public boolean stopHotwordRecording() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.IVoiceWakeupManager
            public int terminateSession() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupManager.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IVoiceWakeupManager.DESCRIPTOR);
        }

        public static IVoiceWakeupManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IVoiceWakeupManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IVoiceWakeupManager)) ? new Proxy(iBinder) : (IVoiceWakeupManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IVoiceWakeupManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IVoiceWakeupManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    boolean zStartHotwordRecording = startHotwordRecording(parcel.readInt(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartHotwordRecording ? 1 : 0);
                    return true;
                case 2:
                    boolean zStopHotwordRecording = stopHotwordRecording();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopHotwordRecording ? 1 : 0);
                    return true;
                case 3:
                    int channelNumber = getChannelNumber();
                    parcel2.writeNoException();
                    parcel2.writeInt(channelNumber);
                    return true;
                case 4:
                    int iEstablishSession = establishSession(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(iEstablishSession);
                    return true;
                case 5:
                    int iTerminateSession = terminateSession();
                    parcel2.writeNoException();
                    parcel2.writeInt(iTerminateSession);
                    return true;
                case 6:
                    int iOnRecognition = onRecognition(parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnRecognition);
                    return true;
                case 7:
                    int iOnError = onError(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnError);
                    return true;
                case 8:
                    int iOnEnd = onEnd(parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnEnd);
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

    int establishSession(IBinder iBinder) throws RemoteException;

    int getChannelNumber() throws RemoteException;

    int onEnd(int i, Bundle bundle) throws RemoteException;

    int onError(int i) throws RemoteException;

    int onRecognition(int i, Bundle bundle) throws RemoteException;

    boolean startHotwordRecording(int i, IBinder iBinder) throws RemoteException;

    boolean stopHotwordRecording() throws RemoteException;

    int terminateSession() throws RemoteException;
}
