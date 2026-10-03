package com.andes.crypto.manager.se;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes12.dex */
public interface ISecureElement extends IInterface {
    public static final String DESCRIPTOR = "vendor$oplus$hardware$secure_element$ISecureElement".replace(Typography.dollar, '.');
    public static final String HASH = "25b290e537996d74293658ad2447e9c2c9d01af9";
    public static final int VERSION = 1;

    public static class Default implements ISecureElement {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.andes.crypto.manager.se.ISecureElement
        public String getInterfaceHash() {
            return "";
        }

        @Override // com.andes.crypto.manager.se.ISecureElement
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // com.andes.crypto.manager.se.ISecureElement
        public boolean is_device_locked() throws RemoteException {
            return false;
        }

        @Override // com.andes.crypto.manager.se.ISecureElement
        public int is_se_broken() throws RemoteException {
            return 0;
        }

        @Override // com.andes.crypto.manager.se.ISecureElement
        public byte[] symmetric_crypto(byte[] bArr, byte[] bArr2, int i, int i2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ISecureElement {
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_is_device_locked = 2;
        static final int TRANSACTION_is_se_broken = 1;
        static final int TRANSACTION_symmetric_crypto = 3;

        public static class Proxy implements ISecureElement {
            private IBinder mRemote;
            private int mCachedVersion = -1;
            private String mCachedHash = "-1";

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISecureElement.DESCRIPTOR;
            }

            @Override // com.andes.crypto.manager.se.ISecureElement
            public synchronized String getInterfaceHash() throws RemoteException {
                if ("-1".equals(this.mCachedHash)) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(ISecureElement.DESCRIPTOR);
                        this.mRemote.transact(Stub.TRANSACTION_getInterfaceHash, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedHash = parcelObtain2.readString();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                }
                return this.mCachedHash;
            }

            @Override // com.andes.crypto.manager.se.ISecureElement
            public int getInterfaceVersion() throws RemoteException {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(ISecureElement.DESCRIPTOR);
                        this.mRemote.transact(16777215, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // com.andes.crypto.manager.se.ISecureElement
            public boolean is_device_locked() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISecureElement.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method is_device_locked is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readBoolean();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.andes.crypto.manager.se.ISecureElement
            public int is_se_broken() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISecureElement.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method is_se_broken is unimplemented.");
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.andes.crypto.manager.se.ISecureElement
            public byte[] symmetric_crypto(byte[] bArr, byte[] bArr2, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISecureElement.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method symmetric_crypto is unimplemented.");
                    }
                    parcelObtain2.readException();
                    byte[] bArrCreateByteArray = parcelObtain2.createByteArray();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bArrCreateByteArray;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            markVintfStability();
            attachInterface(this, ISecureElement.DESCRIPTOR);
        }

        public static ISecureElement asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISecureElement.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISecureElement)) ? new Proxy(iBinder) : (ISecureElement) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ISecureElement.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            switch (i) {
                case TRANSACTION_getInterfaceHash /* 16777214 */:
                    parcel2.writeNoException();
                    parcel2.writeString(getInterfaceHash());
                    return true;
                case 16777215:
                    parcel2.writeNoException();
                    parcel2.writeInt(getInterfaceVersion());
                    return true;
                case 1598968902:
                    parcel2.writeString(str);
                    return true;
                default:
                    if (i == 1) {
                        int iIs_se_broken = is_se_broken();
                        parcel2.writeNoException();
                        parcel2.writeInt(iIs_se_broken);
                    } else if (i == 2) {
                        boolean zIs_device_locked = is_device_locked();
                        parcel2.writeNoException();
                        parcel2.writeBoolean(zIs_device_locked);
                    } else {
                        if (i != 3) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        byte[] bArrCreateByteArray = parcel.createByteArray();
                        byte[] bArrCreateByteArray2 = parcel.createByteArray();
                        int i3 = parcel.readInt();
                        int i4 = parcel.readInt();
                        parcel.enforceNoDataAvail();
                        byte[] bArrSymmetric_crypto = symmetric_crypto(bArrCreateByteArray, bArrCreateByteArray2, i3, i4);
                        parcel2.writeNoException();
                        parcel2.writeByteArray(bArrSymmetric_crypto);
                    }
                    return true;
            }
        }
    }

    String getInterfaceHash() throws RemoteException;

    int getInterfaceVersion() throws RemoteException;

    boolean is_device_locked() throws RemoteException;

    int is_se_broken() throws RemoteException;

    byte[] symmetric_crypto(byte[] bArr, byte[] bArr2, int i, int i2) throws RemoteException;
}
