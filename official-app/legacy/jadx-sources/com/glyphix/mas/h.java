package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes13.dex */
public interface h extends IInterface {
    public static final String g = "com.glyphix.mas.WearEngineMessageResolver";

    public static class a implements h {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.glyphix.mas.h
        public void c(String str) {
        }
    }

    public static abstract class b extends Binder implements h {
        static final int i = 1;

        public static class a implements h {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.i;
            }

            @Override // com.glyphix.mas.h
            public void c(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(h.g);
                    parcelObtain.writeString(str);
                    this.i.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return h.g;
            }
        }

        public b() {
            attachInterface(this, h.g);
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(h.g);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) ? new a(iBinder) : (h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(h.g);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(h.g);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            c(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void c(String str);
}
