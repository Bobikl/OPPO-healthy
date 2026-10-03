package com.heytap.health.device.ota;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.device.ota.bean.OTAVersion;

/* JADX INFO: loaded from: classes16.dex */
public interface IOTASyncTransport extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.device.ota.IOTASyncTransport";

    public static class Default implements IOTASyncTransport {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.device.ota.IOTASyncTransport
        public boolean isDownloadingOrTransferring() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.device.ota.IOTASyncTransport
        public boolean registerCallback(String str, IOTAUpdateCallback iOTAUpdateCallback) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.device.ota.IOTASyncTransport
        public void removeOTADownloadListener(String str, OTAVersion oTAVersion, boolean z, IOTADownloadListener iOTADownloadListener) throws RemoteException {
        }

        @Override // com.heytap.health.device.ota.IOTASyncTransport
        public void requestOTAUpdate(OTAVersion oTAVersion, IOTAUpdateCallback iOTAUpdateCallback, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.device.ota.IOTASyncTransport
        public void startOTADownload(String str, OTAVersion oTAVersion, boolean z, IOTADownloadListener iOTADownloadListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOTASyncTransport {
        static final int TRANSACTION_isDownloadingOrTransferring = 5;
        static final int TRANSACTION_registerCallback = 2;
        static final int TRANSACTION_removeOTADownloadListener = 4;
        static final int TRANSACTION_requestOTAUpdate = 1;
        static final int TRANSACTION_startOTADownload = 3;

        public static class Proxy implements IOTASyncTransport {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOTASyncTransport.DESCRIPTOR;
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public boolean isDownloadingOrTransferring() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTASyncTransport.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public boolean registerCallback(String str, IOTAUpdateCallback iOTAUpdateCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTASyncTransport.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iOTAUpdateCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public void removeOTADownloadListener(String str, OTAVersion oTAVersion, boolean z, IOTADownloadListener iOTADownloadListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTASyncTransport.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, oTAVersion, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iOTADownloadListener);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public void requestOTAUpdate(OTAVersion oTAVersion, IOTAUpdateCallback iOTAUpdateCallback, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTASyncTransport.DESCRIPTOR);
                    a.d(parcelObtain, oTAVersion, 0);
                    parcelObtain.writeStrongInterface(iOTAUpdateCallback);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public void startOTADownload(String str, OTAVersion oTAVersion, boolean z, IOTADownloadListener iOTADownloadListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTASyncTransport.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, oTAVersion, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iOTADownloadListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOTASyncTransport.DESCRIPTOR);
        }

        public static IOTASyncTransport asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOTASyncTransport.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOTASyncTransport)) ? new Proxy(iBinder) : (IOTASyncTransport) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOTASyncTransport.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOTASyncTransport.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                requestOTAUpdate((OTAVersion) a.c(parcel, OTAVersion.CREATOR), IOTAUpdateCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
            } else if (i == 2) {
                boolean zRegisterCallback = registerCallback(parcel.readString(), IOTAUpdateCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterCallback ? 1 : 0);
            } else if (i == 3) {
                startOTADownload(parcel.readString(), (OTAVersion) a.c(parcel, OTAVersion.CREATOR), parcel.readInt() != 0, IOTADownloadListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 4) {
                removeOTADownloadListener(parcel.readString(), (OTAVersion) a.c(parcel, OTAVersion.CREATOR), parcel.readInt() != 0, IOTADownloadListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean zIsDownloadingOrTransferring = isDownloadingOrTransferring();
                parcel2.writeNoException();
                parcel2.writeInt(zIsDownloadingOrTransferring ? 1 : 0);
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

    boolean isDownloadingOrTransferring() throws RemoteException;

    boolean registerCallback(String str, IOTAUpdateCallback iOTAUpdateCallback) throws RemoteException;

    void removeOTADownloadListener(String str, OTAVersion oTAVersion, boolean z, IOTADownloadListener iOTADownloadListener) throws RemoteException;

    void requestOTAUpdate(OTAVersion oTAVersion, IOTAUpdateCallback iOTAUpdateCallback, boolean z) throws RemoteException;

    void startOTADownload(String str, OTAVersion oTAVersion, boolean z, IOTADownloadListener iOTADownloadListener) throws RemoteException;
}
