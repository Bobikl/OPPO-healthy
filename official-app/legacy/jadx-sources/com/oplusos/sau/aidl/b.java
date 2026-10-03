package com.oplusos.sau.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes19.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        private static String a = new String(Base64.decode("Y29tLmNvbG9yb3Muc2F1LmFpZGwuSVVwZGF0ZUFwcE9ic2VydmVy".getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8);
        static final int b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f20175c = 2;
        static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f20176e = 4;
        static final int f = 5;
        static final int g = 6;
        static final int h = 7;
        static final int i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f20177j = 9;

        /* JADX INFO: renamed from: com.oplusos.sau.aidl.b$a$a, reason: collision with other inner class name */
        public static class C0988a implements b {
            private IBinder a;

            public C0988a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                return a.a;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.oplusos.sau.aidl.b
            public void b(String str, long j2, long j3, long j4, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeLong(j4);
                    parcelObtain.writeInt(i);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void c(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void d(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void a(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void a(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void b(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void a(String str, AppUpdateInfo appUpdateInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    if (appUpdateInfo != null) {
                        parcelObtain.writeInt(1);
                        appUpdateInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void a(String str, DataresUpdateInfo dataresUpdateInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    if (dataresUpdateInfo != null) {
                        parcelObtain.writeInt(1);
                        dataresUpdateInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplusos.sau.aidl.b
            public void a(String str, long j2, long j3, long j4, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeLong(j4);
                    parcelObtain.writeInt(i);
                    this.a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, a);
        }

        public static void b() {
            a = "com.oplusos.sau.aidl.IUpdateAppObserver";
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            String str = a;
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface(str);
                    a(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(str);
                    a(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    a(parcel.readString(), parcel.readInt() != 0 ? (AppUpdateInfo) AppUpdateInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    d(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    b(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    c(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(str);
                    a(parcel.readString(), parcel.readInt() != 0 ? (DataresUpdateInfo) DataresUpdateInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(str);
                    a(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(str);
                    b(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0988a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void a(String str, int i) throws RemoteException;

    void a(String str, int i, String str2) throws RemoteException;

    void a(String str, long j2, long j3, long j4, int i) throws RemoteException;

    void a(String str, AppUpdateInfo appUpdateInfo) throws RemoteException;

    void a(String str, DataresUpdateInfo dataresUpdateInfo) throws RemoteException;

    void b(String str, int i) throws RemoteException;

    void b(String str, long j2, long j3, long j4, int i) throws RemoteException;

    void c(String str, int i) throws RemoteException;

    void d(String str, int i) throws RemoteException;
}
