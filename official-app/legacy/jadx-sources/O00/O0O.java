package O00;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface O0O extends IInterface {

    public static abstract class O00 extends Binder implements O0O {
        public O00() {
            attachInterface(this, "com.oplus.carlink.ICallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.oplus.carlink.ICallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.oplus.carlink.ICallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            O00((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
    }

    void O00(Bundle bundle);
}
