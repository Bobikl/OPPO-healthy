package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes13.dex */
public interface g extends IInterface {
    public static final String f = "com.glyphix.mas.WearEngineHearBeatResolver";

    public static class a implements g {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.g
        public void f() {
        }
    }

    public static abstract class b extends Binder implements g {
        static final int i = 1;

        public static class a implements g {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.i;
            }

            @Override // com.glyphix.mas.g
            public void f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(g.f);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return g.f;
            }
        }

        public b() {
            attachInterface(this, g.f);
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(g.f);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(g.f);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(g.f);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            f();
            parcel2.writeNoException();
            return true;
        }
    }

    void f();
}
