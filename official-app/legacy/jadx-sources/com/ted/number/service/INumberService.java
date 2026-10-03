package com.ted.number.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.a7b;
import com.ted.number.entrys.RecognitionNumber;
import com.ted.number.entrys.RequestData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface INumberService extends IInterface {

    public static abstract class Stub extends Binder implements INumberService {
        private static final String DESCRIPTOR = "com.ted.number.service.INumberService";
        static final int TRANSACTION_checkUrls = 11;
        static final int TRANSACTION_clearCache = 8;
        static final int TRANSACTION_correctMark = 15;
        static final int TRANSACTION_correctName = 5;
        static final int TRANSACTION_getAllMarkClassifies = 3;
        static final int TRANSACTION_getFormatUrl = 10;
        static final int TRANSACTION_getIconData = 14;
        static final int TRANSACTION_getNumberLocation = 2;
        static final int TRANSACTION_isServiceNumber = 1;
        static final int TRANSACTION_markNumber = 4;
        static final int TRANSACTION_markNumberByItype = 17;
        static final int TRANSACTION_markSpamNumber = 13;
        static final int TRANSACTION_oppoGetMenu = 18;
        static final int TRANSACTION_queryBatch = 16;
        static final int TRANSACTION_queryNumInfoEvenExpired = 12;
        static final int TRANSACTION_queryNumberInfo = 6;
        static final int TRANSACTION_queryNumberInfoAsync = 7;
        static final int TRANSACTION_queryShutdown = 9;

        public static class Proxy implements INumberService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ted.number.service.INumberService
            public List<String> checkUrls(List<String> list, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void clearCache() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void correctMark(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void correctName(String str, String str2, String str3, String str4, String str5) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public List<String> getAllMarkClassifies() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public String getFormatUrl(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public byte[] getIconData(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.ted.number.service.INumberService
            public String getNumberLocation(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public boolean isServiceNumber(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void markNumber(String str, String str2, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void markNumberByItype(String str, String str2, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void markSpamNumber(String str, List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void oppoGetMenu(RequestData requestData, INumCallback iNumCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (requestData != null) {
                        parcelObtain.writeInt(1);
                        requestData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iNumCallback != null ? iNumCallback.asBinder() : null);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void queryBatch(List<RequestData> list, INumListCallback iNumListCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    parcelObtain.writeStrongBinder(iNumListCallback != null ? iNumListCallback.asBinder() : null);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public RecognitionNumber queryNumInfoEvenExpired(RequestData requestData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (requestData != null) {
                        parcelObtain.writeInt(1);
                        requestData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RecognitionNumber.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public RecognitionNumber queryNumberInfo(RequestData requestData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (requestData != null) {
                        parcelObtain.writeInt(1);
                        requestData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RecognitionNumber.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public RecognitionNumber queryNumberInfoAsync(RequestData requestData, INumCallback iNumCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (requestData != null) {
                        parcelObtain.writeInt(1);
                        requestData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    a7b.b("XXX", "11Callback.asbinder=" + iNumCallback);
                    parcelObtain.writeStrongBinder(iNumCallback != null ? iNumCallback.asBinder() : null);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? RecognitionNumber.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ted.number.service.INumberService
            public void queryShutdown(RequestData requestData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (requestData != null) {
                        parcelObtain.writeInt(1);
                        requestData.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INumberService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INumberService)) ? new Proxy(iBinder) : (INumberService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsServiceNumber = isServiceNumber(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsServiceNumber ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String numberLocation = getNumberLocation(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(numberLocation);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<String> allMarkClassifies = getAllMarkClassifies();
                    parcel2.writeNoException();
                    parcel2.writeStringList(allMarkClassifies);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    markNumber(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    correctName(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    RecognitionNumber recognitionNumberQueryNumberInfo = queryNumberInfo(parcel.readInt() != 0 ? RequestData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (recognitionNumberQueryNumberInfo != null) {
                        parcel2.writeInt(1);
                        recognitionNumberQueryNumberInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    RequestData requestDataCreateFromParcel = parcel.readInt() != 0 ? RequestData.CREATOR.createFromParcel(parcel) : null;
                    INumCallback iNumCallbackAsInterface = INumCallback.Stub.asInterface(parcel.readStrongBinder());
                    a7b.b("XXX", "query11 -arg1=" + iNumCallbackAsInterface);
                    RecognitionNumber recognitionNumberQueryNumberInfoAsync = queryNumberInfoAsync(requestDataCreateFromParcel, iNumCallbackAsInterface);
                    parcel2.writeNoException();
                    if (recognitionNumberQueryNumberInfoAsync != null) {
                        parcel2.writeInt(1);
                        recognitionNumberQueryNumberInfoAsync.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    clearCache();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    queryShutdown(parcel.readInt() != 0 ? RequestData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String formatUrl = getFormatUrl(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(formatUrl);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<String> listCheckUrls = checkUrls(parcel.createStringArrayList(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeStringList(listCheckUrls);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    RecognitionNumber recognitionNumberQueryNumInfoEvenExpired = queryNumInfoEvenExpired(parcel.readInt() != 0 ? RequestData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (recognitionNumberQueryNumInfoEvenExpired != null) {
                        parcel2.writeInt(1);
                        recognitionNumberQueryNumInfoEvenExpired.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    markSpamNumber(parcel.readString(), parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] iconData = getIconData(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeByteArray(iconData);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    correctMark(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    queryBatch(parcel.createTypedArrayList(RequestData.CREATOR), INumListCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    markNumberByItype(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    oppoGetMenu(parcel.readInt() != 0 ? RequestData.CREATOR.createFromParcel(parcel) : null, INumCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    List<String> checkUrls(List<String> list, long j2) throws RemoteException;

    void clearCache() throws RemoteException;

    void correctMark(String str, String str2, String str3, String str4) throws RemoteException;

    void correctName(String str, String str2, String str3, String str4, String str5) throws RemoteException;

    List<String> getAllMarkClassifies() throws RemoteException;

    String getFormatUrl(String str) throws RemoteException;

    byte[] getIconData(String str) throws RemoteException;

    String getNumberLocation(String str) throws RemoteException;

    boolean isServiceNumber(String str) throws RemoteException;

    void markNumber(String str, String str2, int i, int i2) throws RemoteException;

    void markNumberByItype(String str, String str2, int i, int i2, int i3) throws RemoteException;

    void markSpamNumber(String str, List<String> list) throws RemoteException;

    void oppoGetMenu(RequestData requestData, INumCallback iNumCallback) throws RemoteException;

    void queryBatch(List<RequestData> list, INumListCallback iNumListCallback) throws RemoteException;

    RecognitionNumber queryNumInfoEvenExpired(RequestData requestData) throws RemoteException;

    RecognitionNumber queryNumberInfo(RequestData requestData) throws RemoteException;

    RecognitionNumber queryNumberInfoAsync(RequestData requestData, INumCallback iNumCallback) throws RemoteException;

    void queryShutdown(RequestData requestData) throws RemoteException;
}
