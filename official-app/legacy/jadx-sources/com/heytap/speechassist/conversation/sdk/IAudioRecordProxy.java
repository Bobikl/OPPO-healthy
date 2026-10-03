package com.heytap.speechassist.conversation.sdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IAudioRecordProxy extends IInterface {

    public static class Default implements IAudioRecordProxy {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public int read(byte[] bArr, int i, int i2) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public int releaseAudioRecord(Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public Bundle startAudioRecord(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public int stopAudioRecord(Bundle bundle) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IAudioRecordProxy {
        private static final String DESCRIPTOR = "com.heytap.speechassist.conversation.sdk.IAudioRecordProxy";
        static final int TRANSACTION_read = 2;
        static final int TRANSACTION_releaseAudioRecord = 4;
        static final int TRANSACTION_startAudioRecord = 1;
        static final int TRANSACTION_stopAudioRecord = 3;

        public static class Proxy implements IAudioRecordProxy {
            public static IAudioRecordProxy sDefaultImpl;
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

            @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
            public int read(byte[] bArr, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().read(bArr, i, i2);
                    }
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
            public int releaseAudioRecord(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().releaseAudioRecord(bundle);
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
            public Bundle startAudioRecord(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startAudioRecord(bundle);
                    }
                    parcelObtain2.readException();
                    Bundle bundle2 = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return bundle2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
            public int stopAudioRecord(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopAudioRecord(bundle);
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAudioRecordProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAudioRecordProxy)) ? new Proxy(iBinder) : (IAudioRecordProxy) iInterfaceQueryLocalInterface;
        }

        public static IAudioRecordProxy getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAudioRecordProxy iAudioRecordProxy) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAudioRecordProxy == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAudioRecordProxy;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                Bundle bundleStartAudioRecord = startAudioRecord(bundle);
                parcel2.writeNoException();
                if (bundleStartAudioRecord != null) {
                    parcel2.writeInt(1);
                    bundleStartAudioRecord.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i3 = read(bArrCreateByteArray, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                parcel2.writeByteArray(bArrCreateByteArray);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                int iStopAudioRecord = stopAudioRecord(bundle);
                parcel2.writeNoException();
                parcel2.writeInt(iStopAudioRecord);
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            int iReleaseAudioRecord = releaseAudioRecord(bundle);
            parcel2.writeNoException();
            parcel2.writeInt(iReleaseAudioRecord);
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    int read(byte[] bArr, int i, int i2) throws RemoteException;

    int releaseAudioRecord(Bundle bundle) throws RemoteException;

    Bundle startAudioRecord(Bundle bundle) throws RemoteException;

    int stopAudioRecord(Bundle bundle) throws RemoteException;
}
