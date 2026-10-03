package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes13.dex */
public interface i extends IInterface {
    public static final String h = "com.glyphix.mas.WearEngineProgressResolver";

    public static class a implements i {
        @Override // com.glyphix.mas.i
        public void a(String str) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.i
        public void b(String str) {
        }

        @Override // com.glyphix.mas.i
        public void d(String str) {
        }
    }

    public static abstract class b extends Binder implements i {
        static final int i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f2331j = 2;
        static final int k = 3;

        public static class a implements i {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // com.glyphix.mas.i
            public void a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.h);
                    parcelObtain.writeString(str);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
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

            @Override // com.glyphix.mas.i
            public void b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.h);
                    parcelObtain.writeString(str);
                    this.i.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.glyphix.mas.i
            public void d(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.h);
                    parcelObtain.writeString(str);
                    this.i.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return i.h;
            }
        }

        public b() {
            attachInterface(this, i.h);
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(i.h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(i.h);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(i.h);
                return true;
            }
            if (i2 == 1) {
                a(parcel.readString());
            } else if (i2 == 2) {
                b(parcel.readString());
            } else {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                d(parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(String str);

    void b(String str);

    void d(String str);
}
