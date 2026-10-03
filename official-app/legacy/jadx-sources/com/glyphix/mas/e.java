package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public interface e extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2324c = "com.glyphix.mas.GlyphixWear263";

    public static class a implements e {
        @Override // com.glyphix.mas.e
        public void a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, i iVar) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.e
        public int b() {
            return 0;
        }

        @Override // com.glyphix.mas.e
        public void d(String str, String str2, i iVar) {
        }

        @Override // com.glyphix.mas.e
        public void e(String str) {
        }

        @Override // com.glyphix.mas.e
        public void a(h hVar) {
        }

        @Override // com.glyphix.mas.e
        public void b(String str, i iVar) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2, i iVar) {
        }

        @Override // com.glyphix.mas.e
        public void b(String str, String str2) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, f fVar) {
        }

        @Override // com.glyphix.mas.e
        public void b(String str, String str2, h hVar) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, String str2) {
        }

        @Override // com.glyphix.mas.e
        public void b(String str, String str2, i iVar) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, String str2, g gVar) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, String str2, h hVar) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, String str2, i iVar) {
        }

        @Override // com.glyphix.mas.e
        public void a(String str, String str2, String str3, i iVar) {
        }

        @Override // com.glyphix.mas.e
        public boolean a() {
            return false;
        }
    }

    public static abstract class b extends Binder implements e {
        static final int i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f2325j = 2;
        static final int k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f2326l = 4;
        static final int m = 5;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f2327n = 6;
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

        public static class a implements e {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // com.glyphix.mas.e
            public void a(String str, String str2, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(4, parcelObtain, parcelObtain2, 0);
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

            @Override // com.glyphix.mas.e
            public void b(String str, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void d(String str, String str2, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void e(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    this.i.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return e.f2324c;
            }

            @Override // com.glyphix.mas.e
            public boolean a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public int b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    this.i.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    c.b(parcelObtain, parcelFileDescriptor, 0);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void b(String str, String str2, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(String str, f fVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(fVar);
                    this.i.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void b(String str, String str2, h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(hVar);
                    this.i.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(String str, String str2, g gVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(gVar);
                    this.i.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void b(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.i.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeStrongInterface(hVar);
                    this.i.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    c.b(parcelObtain, parcelFileDescriptor, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(String str, String str2, String str3, i iVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(iVar);
                    this.i.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(String str, String str2, h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(hVar);
                    this.i.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.e
            public void a(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f2324c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.i.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, e.f2324c);
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e.f2324c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            int iA;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(e.f2324c);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(e.f2324c);
                return true;
            }
            switch (i2) {
                case 1:
                    iA = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 2:
                    iA = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 3:
                    a(h.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    a(parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    a(parcel.readString(), f.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    e(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    b(parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    b(parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    d(parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    a(parcel.readString(), parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    a(parcel.readString(), parcel.readString(), g.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    b(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    b(parcel.readString(), parcel.readString(), h.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    a((ParcelFileDescriptor) c.b(parcel, ParcelFileDescriptor.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    a(parcel.readString(), (ParcelFileDescriptor) c.b(parcel, ParcelFileDescriptor.CREATOR), parcel.readString(), i.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    a(parcel.readString(), parcel.readString(), h.b.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
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

    void a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, i iVar);

    void a(h hVar);

    void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2, i iVar);

    void a(String str, f fVar);

    void a(String str, String str2);

    void a(String str, String str2, g gVar);

    void a(String str, String str2, h hVar);

    void a(String str, String str2, i iVar);

    void a(String str, String str2, String str3, i iVar);

    boolean a();

    int b();

    void b(String str, i iVar);

    void b(String str, String str2);

    void b(String str, String str2, h hVar);

    void b(String str, String str2, i iVar);

    void d(String str, String str2, i iVar);

    void e(String str);
}
