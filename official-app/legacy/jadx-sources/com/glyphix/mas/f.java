package com.glyphix.mas;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes13.dex */
public interface f extends IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2328e = "com.glyphix.mas.WearEngineDeviceLinkStatusResolver";

    public static class a implements f {
        @Override // com.glyphix.mas.f
        public void a(boolean z) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements f {
        static final int i = 1;

        public static class a implements f {
            private IBinder i;

            public a(IBinder iBinder) {
                this.i = iBinder;
            }

            @Override // com.glyphix.mas.f
            public void a(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f.f2328e);
                    parcelObtain.writeInt(z ? 1 : 0);
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

            public String h() {
                return f.f2328e;
            }
        }

        public b() {
            attachInterface(this, f.f2328e);
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f.f2328e);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(f.f2328e);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(f.f2328e);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            a(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void a(boolean z);
}
