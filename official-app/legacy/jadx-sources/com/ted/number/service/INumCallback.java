package com.ted.number.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.a7b;
import com.ted.number.entrys.RecognitionNumber;

/* JADX INFO: loaded from: classes10.dex */
public interface INumCallback extends IInterface {

    public static abstract class Stub extends Binder implements INumCallback {
        private static final String DESCRIPTOR = "com.ted.number.service.INumCallback";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements INumCallback {
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

            @Override // com.ted.number.service.INumCallback
            public void onFail() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                        this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (Exception e2) {
                        a7b.b("INumCallback", " Proxy onFail : " + e2.getMessage());
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumCallback
            public void onSuccess(RecognitionNumber recognitionNumber) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                        if (recognitionNumber != null) {
                            parcelObtain.writeInt(1);
                            recognitionNumber.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                        this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (Exception e2) {
                        a7b.b("INumCallback", " Proxy onSuccess : " + e2.getMessage());
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

        public static INumCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INumCallback)) ? new Proxy(iBinder) : (INumCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readInt() != 0 ? RecognitionNumber.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
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
            onFail();
            parcel2.writeNoException();
            return true;
        }
    }

    void onFail() throws RemoteException;

    void onSuccess(RecognitionNumber recognitionNumber) throws RemoteException;
}
