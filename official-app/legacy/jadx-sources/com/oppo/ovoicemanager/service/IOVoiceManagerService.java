package com.oppo.ovoicemanager.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public interface IOVoiceManagerService extends IInterface {
    public static final String DESCRIPTOR = "com.oppo.ovoicemanager.service.IOVoiceManagerService";

    public static class Default implements IOVoiceManagerService {
        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_Create(String str, IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_DeleteModel(String str, String str2, int i) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_Destroy(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public boolean OVMS_GetVoiceToken(String str) throws RemoteException {
            return false;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_ListModel(String str, String[] strArr, int[] iArr, boolean[] zArr) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_RegisterCallback(String str, IOVoiceManagerCallback iOVoiceManagerCallback) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_StartActivity(String str, Intent intent, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_StartRecognition(String str, String str2, int i) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_StopRecognition(String str, String str2, int i) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_UnRegisterCallback(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
        public int OVMS_UpdateModel(String str, String str2, int i, byte[] bArr, int i2) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IOVoiceManagerService {
        static final int TRANSACTION_OVMS_Create = 1;
        static final int TRANSACTION_OVMS_DeleteModel = 4;
        static final int TRANSACTION_OVMS_Destroy = 11;
        static final int TRANSACTION_OVMS_GetVoiceToken = 9;
        static final int TRANSACTION_OVMS_ListModel = 3;
        static final int TRANSACTION_OVMS_RegisterCallback = 7;
        static final int TRANSACTION_OVMS_StartActivity = 10;
        static final int TRANSACTION_OVMS_StartRecognition = 5;
        static final int TRANSACTION_OVMS_StopRecognition = 6;
        static final int TRANSACTION_OVMS_UnRegisterCallback = 8;
        static final int TRANSACTION_OVMS_UpdateModel = 2;

        public static class Proxy implements IOVoiceManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_Create(String str, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_DeleteModel(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_Destroy(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public boolean OVMS_GetVoiceToken(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_ListModel(String str, String[] strArr, int[] iArr, boolean[] zArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeBooleanArray(zArr);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    parcelObtain2.readStringArray(strArr);
                    parcelObtain2.readIntArray(iArr);
                    parcelObtain2.readBooleanArray(zArr);
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_RegisterCallback(String str, IOVoiceManagerCallback iOVoiceManagerCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iOVoiceManagerCallback);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_StartActivity(String str, Intent intent, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, intent, 0);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_StartRecognition(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_StopRecognition(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_UnRegisterCallback(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerService
            public int OVMS_UpdateModel(String str, String str2, int i, byte[] bArr, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i3 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    return i3;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOVoiceManagerService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IOVoiceManagerService.DESCRIPTOR);
        }

        public static IOVoiceManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOVoiceManagerService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOVoiceManagerService)) ? new Proxy(iBinder) : (IOVoiceManagerService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOVoiceManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOVoiceManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    int iOVMS_Create = OVMS_Create(parcel.readString(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_Create);
                    return true;
                case 2:
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i3 = parcel.readInt();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    int iOVMS_UpdateModel = OVMS_UpdateModel(string, string2, i3, bArrCreateByteArray, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_UpdateModel);
                    parcel2.writeByteArray(bArrCreateByteArray);
                    return true;
                case 3:
                    String string3 = parcel.readString();
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    int[] iArrCreateIntArray = parcel.createIntArray();
                    boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
                    int iOVMS_ListModel = OVMS_ListModel(string3, strArrCreateStringArray, iArrCreateIntArray, zArrCreateBooleanArray);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_ListModel);
                    parcel2.writeStringArray(strArrCreateStringArray);
                    parcel2.writeIntArray(iArrCreateIntArray);
                    parcel2.writeBooleanArray(zArrCreateBooleanArray);
                    return true;
                case 4:
                    int iOVMS_DeleteModel = OVMS_DeleteModel(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_DeleteModel);
                    return true;
                case 5:
                    int iOVMS_StartRecognition = OVMS_StartRecognition(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_StartRecognition);
                    return true;
                case 6:
                    int iOVMS_StopRecognition = OVMS_StopRecognition(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_StopRecognition);
                    return true;
                case 7:
                    int iOVMS_RegisterCallback = OVMS_RegisterCallback(parcel.readString(), IOVoiceManagerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_RegisterCallback);
                    return true;
                case 8:
                    int iOVMS_UnRegisterCallback = OVMS_UnRegisterCallback(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_UnRegisterCallback);
                    return true;
                case 9:
                    boolean zOVMS_GetVoiceToken = OVMS_GetVoiceToken(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zOVMS_GetVoiceToken ? 1 : 0);
                    return true;
                case 10:
                    int iOVMS_StartActivity = OVMS_StartActivity(parcel.readString(), (Intent) a.c(parcel, Intent.CREATOR), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_StartActivity);
                    return true;
                case 11:
                    int iOVMS_Destroy = OVMS_Destroy(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOVMS_Destroy);
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

    int OVMS_Create(String str, IBinder iBinder) throws RemoteException;

    int OVMS_DeleteModel(String str, String str2, int i) throws RemoteException;

    int OVMS_Destroy(String str) throws RemoteException;

    boolean OVMS_GetVoiceToken(String str) throws RemoteException;

    int OVMS_ListModel(String str, String[] strArr, int[] iArr, boolean[] zArr) throws RemoteException;

    int OVMS_RegisterCallback(String str, IOVoiceManagerCallback iOVoiceManagerCallback) throws RemoteException;

    int OVMS_StartActivity(String str, Intent intent, Bundle bundle) throws RemoteException;

    int OVMS_StartRecognition(String str, String str2, int i) throws RemoteException;

    int OVMS_StopRecognition(String str, String str2, int i) throws RemoteException;

    int OVMS_UnRegisterCallback(String str) throws RemoteException;

    int OVMS_UpdateModel(String str, String str2, int i, byte[] bArr, int i2) throws RemoteException;
}
