package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes13.dex */
public interface c extends IInterface {
    public static final String b = "com.glyphix.mas.GlyphixMasResolver";

    public static class a implements c {
        @Override // com.glyphix.mas.c
        public int a(String str) {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.c
        public int b(String str) {
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int d(String str) {
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int retry() {
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int timeout() {
            return 0;
        }
    }

    public static abstract class b extends Binder implements c {
        static final int i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f2314j = 2;
        static final int k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f2315l = 4;
        static final int m = 5;

        public static class a implements c {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // com.glyphix.mas.c
            public int a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.b);
                    parcelObtain.writeString(str);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.i;
            }

            @Override // com.glyphix.mas.c
            public int b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.b);
                    parcelObtain.writeString(str);
                    this.i.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.c
            public int d(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.b);
                    parcelObtain.writeString(str);
                    this.i.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return c.b;
            }

            @Override // com.glyphix.mas.c
            public int retry() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.b);
                    this.i.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.c
            public int timeout() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.b);
                    this.i.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.b);
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            int iA;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(c.b);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(c.b);
                return true;
            }
            if (i2 == 1) {
                iA = a(parcel.readString());
            } else if (i2 == 2) {
                iA = b(parcel.readString());
            } else if (i2 == 3) {
                iA = d(parcel.readString());
            } else if (i2 == 4) {
                iA = timeout();
            } else {
                if (i2 != 5) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                iA = retry();
            }
            parcel2.writeNoException();
            parcel2.writeInt(iA);
            return true;
        }
    }

    int a(String str);

    int b(String str);

    int d(String str);

    int retry();

    int timeout();
}
