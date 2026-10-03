package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public interface d extends IInterface {
    public static final String d = "com.glyphix.mas.GlyphixWear";

    public static class a implements d {
        @Override // com.glyphix.mas.d
        public IBinder a(int i) {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.d
        public int b() {
            return 0;
        }

        @Override // com.glyphix.mas.d
        public void c(String str, i iVar) {
        }

        @Override // com.glyphix.mas.d
        public void d() {
        }

        @Override // com.glyphix.mas.d
        public void e() {
        }

        @Override // com.glyphix.mas.d
        public void g() {
        }

        @Override // com.glyphix.mas.d
        public void a(ParcelFileDescriptor parcelFileDescriptor, String str, i iVar) {
        }

        @Override // com.glyphix.mas.d
        public void b(h hVar) {
        }

        @Override // com.glyphix.mas.d
        public void c(String str, String str2, i iVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, i iVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(com.glyphix.mas.b bVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(f fVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(g gVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(h hVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(i iVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(String str, i iVar) {
        }

        @Override // com.glyphix.mas.d
        public void a(String str, String str2, i iVar) {
        }

        @Override // com.glyphix.mas.d
        public boolean a() {
            return false;
        }
    }

    public static abstract class b extends Binder implements d {
        static final int i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f2321j = 2;
        static final int k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f2322l = 4;
        static final int m = 5;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f2323n = 6;
        static final int o = 7;
        static final int p = 8;
        static final int q = 9;
        static final int r = 10;
        static final int s = 11;
        static final int t = 12;
        static final int u = 13;
        static final int v = 14;
        static final int w = 15;
        static final int x = 16;
        static final int y = 17;
        static final int z = 18;

        public static class a implements d {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // com.glyphix.mas.d
            public void a(String str, String str2, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.i;
            }

            @Override // com.glyphix.mas.d
            public int b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    this.i.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void c(String str, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    this.i.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    this.i.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    this.i.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return d.d;
            }

            @Override // com.glyphix.mas.d
            public void a(i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void b(h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeStrongInterface(hVar);
                    this.i.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void c(String str, String str2, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public IBinder a(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeInt(i);
                    this.i.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public boolean a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(ParcelFileDescriptor parcelFileDescriptor, String str, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    c.b(parcelObtain, parcelFileDescriptor, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(String str, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(f fVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeStrongInterface(fVar);
                    this.i.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(g gVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeStrongInterface(gVar);
                    this.i.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeStrongInterface(hVar);
                    this.i.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    c.b(parcelObtain, parcelFileDescriptor, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.d
            public void a(com.glyphix.mas.b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.d);
                    parcelObtain.writeStrongInterface(bVar);
                    this.i.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, d.d);
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            int iA;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(d.d);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(d.d);
                return true;
            }
            switch (i2) {
                case 1:
                    iA = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 2:
                    a(f.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    d();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    a(i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    c(parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    a(parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    c(parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    a(g.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    g();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    b(h.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    e();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    a((ParcelFileDescriptor) c.b(parcel, ParcelFileDescriptor.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    a(com.glyphix.mas.b.AbstractBinderC0218b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    iA = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 15:
                    a((ParcelFileDescriptor) c.b(parcel, ParcelFileDescriptor.CREATOR), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    a(h.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    a(parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    IBinder iBinderA = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderA);
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

    IBinder a(int i);

    void a(ParcelFileDescriptor parcelFileDescriptor, String str, i iVar);

    void a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, i iVar);

    void a(com.glyphix.mas.b bVar);

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void a(i iVar);

    void a(String str, i iVar);

    void a(String str, String str2, i iVar);

    boolean a();

    int b();

    void b(h hVar);

    void c(String str, i iVar);

    void c(String str, String str2, i iVar);

    void d();

    void e();

    void g();
}
