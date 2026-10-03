package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public interface b extends IInterface {
    public static final String a = "com.glyphix.mas.GlyphixMasExecutor";

    public static class a implements b {
        @Override // com.glyphix.mas.b
        public String a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, com.glyphix.mas.c cVar) {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.b
        public void b(f fVar) {
        }

        @Override // com.glyphix.mas.b
        public int c() {
            return 0;
        }

        @Override // com.glyphix.mas.b
        public void f(String str) {
        }

        @Override // com.glyphix.mas.b
        public void g(String str) {
        }

        @Override // com.glyphix.mas.b
        public String a(String str, String str2, String str3, com.glyphix.mas.c cVar) {
            return null;
        }

        @Override // com.glyphix.mas.b
        public void b(String str, com.glyphix.mas.c cVar) {
        }

        @Override // com.glyphix.mas.b
        public void c(String str, com.glyphix.mas.c cVar) {
        }

        @Override // com.glyphix.mas.b
        public void a(com.glyphix.mas.c cVar) {
        }

        @Override // com.glyphix.mas.b
        public void b(String str, String str2, String str3, com.glyphix.mas.c cVar) {
        }

        @Override // com.glyphix.mas.b
        public void a(String str, com.glyphix.mas.c cVar) {
        }

        @Override // com.glyphix.mas.b
        public void a(String str, h hVar) {
        }

        @Override // com.glyphix.mas.b
        public boolean a() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.glyphix.mas.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0218b extends Binder implements b {
        static final int i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f2311j = 2;
        static final int k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f2312l = 4;
        static final int m = 5;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f2313n = 6;
        static final int o = 7;
        static final int p = 8;
        static final int q = 9;
        static final int r = 10;
        static final int s = 11;
        static final int t = 12;
        static final int u = 13;

        /* JADX INFO: renamed from: com.glyphix.mas.b$b$a */
        public static class a implements b {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // com.glyphix.mas.b
            public String a(String str, String str2, String str3, com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.i;
            }

            @Override // com.glyphix.mas.b
            public void b(String str, com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public int c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    this.i.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void f(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    this.i.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void g(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    this.i.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return b.a;
            }

            @Override // com.glyphix.mas.b
            public void a(com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void b(String str, String str2, String str3, com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void c(String str, com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public boolean a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void b(f fVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeStrongInterface(fVar);
                    this.i.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void a(String str, com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public String a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, com.glyphix.mas.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    c.b(parcelObtain, parcelFileDescriptor, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(cVar);
                    this.i.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.b
            public void a(String str, h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(hVar);
                    this.i.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0218b() {
            attachInterface(this, b.a);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String strA;
            int iA;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(b.a);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(b.a);
                return true;
            }
            switch (i2) {
                case 1:
                    iA = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 2:
                    b(parcel.readString(), parcel.readString(), parcel.readString(), com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    g(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    a(parcel.readString(), h.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    f(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    a(com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    a(parcel.readString(), com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    c(parcel.readString(), com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    b(f.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    strA = a(parcel.readString(), parcel.readString(), parcel.readString(), com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(strA);
                    return true;
                case 11:
                    iA = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 12:
                    b(parcel.readString(), com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    strA = a((ParcelFileDescriptor) c.b(parcel, ParcelFileDescriptor.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), com.glyphix.mas.c.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(strA);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    String a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, com.glyphix.mas.c cVar);

    String a(String str, String str2, String str3, com.glyphix.mas.c cVar);

    void a(com.glyphix.mas.c cVar);

    void a(String str, com.glyphix.mas.c cVar);

    void a(String str, h hVar);

    boolean a();

    void b(f fVar);

    void b(String str, com.glyphix.mas.c cVar);

    void b(String str, String str2, String str3, com.glyphix.mas.c cVar);

    int c();

    void c(String str, com.glyphix.mas.c cVar);

    void f(String str);

    void g(String str);
}
