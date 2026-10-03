package com.oplus.ovoicemanager.wakeup.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface HotwordRecordingListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener";

    public static class Default implements HotwordRecordingListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public String getClientPackageName() throws RemoteException {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onBufferReceive(byte[] bArr) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onEvent(int i, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onResult(int i, int i2) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int read(byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int startRecording(int i) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int stopRecording() throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements HotwordRecordingListener {
        static final int TRANSACTION_getClientPackageName = 6;
        static final int TRANSACTION_onBufferReceive = 1;
        static final int TRANSACTION_onEvent = 7;
        static final int TRANSACTION_onResult = 2;
        static final int TRANSACTION_read = 5;
        static final int TRANSACTION_startRecording = 3;
        static final int TRANSACTION_stopRecording = 4;

        public static class Proxy implements HotwordRecordingListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public String getClientPackageName() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return HotwordRecordingListener.DESCRIPTOR;
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public void onBufferReceive(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.readByteArray(bArr);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public void onEvent(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public void onResult(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public int read(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public int startRecording(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
            public int stopRecording() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(HotwordRecordingListener.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, HotwordRecordingListener.DESCRIPTOR);
        }

        public static HotwordRecordingListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(HotwordRecordingListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof HotwordRecordingListener)) ? new Proxy(iBinder) : (HotwordRecordingListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(HotwordRecordingListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(HotwordRecordingListener.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    onBufferReceive(bArrCreateByteArray);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrCreateByteArray);
                    return true;
                case 2:
                    onResult(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int iStartRecording = startRecording(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartRecording);
                    return true;
                case 4:
                    int iStopRecording = stopRecording();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopRecording);
                    return true;
                case 5:
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    int i3 = read(bArrCreateByteArray2, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    parcel2.writeByteArray(bArrCreateByteArray2);
                    return true;
                case 6:
                    String clientPackageName = getClientPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(clientPackageName);
                    return true;
                case 7:
                    int i4 = parcel.readInt();
                    Bundle bundle = (Bundle) a.c(parcel, Bundle.CREATOR);
                    onEvent(i4, bundle);
                    parcel2.writeNoException();
                    a.d(parcel2, bundle, 1);
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

    String getClientPackageName() throws RemoteException;

    void onBufferReceive(byte[] bArr) throws RemoteException;

    void onEvent(int i, Bundle bundle) throws RemoteException;

    void onResult(int i, int i2) throws RemoteException;

    int read(byte[] bArr, int i, int i2) throws RemoteException;

    int startRecording(int i) throws RemoteException;

    int stopRecording() throws RemoteException;
}
