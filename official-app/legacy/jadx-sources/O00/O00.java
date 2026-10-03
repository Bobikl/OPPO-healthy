package O00;

import OO0.O00O;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface O00 extends IInterface {

    /* JADX INFO: renamed from: O00.O00$O00, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000O00 extends Binder implements O00 {

        /* JADX INFO: renamed from: O00, reason: collision with root package name */
        public static final /* synthetic */ int f157O00 = 0;

        /* JADX INFO: renamed from: O00.O00$O00$O00, reason: collision with other inner class name */
        public static class C0001O00 implements O00 {

            /* JADX INFO: renamed from: O00, reason: collision with root package name */
            public final IBinder f158O00;

            public C0001O00(IBinder iBinder) {
                this.f158O00 = iBinder;
            }

            @Override // O00.O00
            public final Bundle O00(String str, String str2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.oplus.carlink.ICallable");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f158O00.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) (parcelObtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcelObtain2) : null);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f158O00;
            }
        }

        public AbstractBinderC0000O00() {
            attachInterface(this, "com.oplus.carlink.ICallable");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.oplus.carlink.ICallable");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.oplus.carlink.ICallable");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Bundle bundleO00 = ((O00O.O00) this).O00(parcel.readString(), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            if (bundleO00 != null) {
                parcel2.writeInt(1);
                bundleO00.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    Bundle O00(String str, String str2, Bundle bundle);
}
