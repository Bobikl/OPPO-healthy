package O00;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface OO0 extends IInterface {

    public static abstract class O00 extends Binder implements OO0 {

        /* JADX INFO: renamed from: O00, reason: collision with root package name */
        public static final /* synthetic */ int f159O00 = 0;

        /* JADX INFO: renamed from: O00.OO0$O00$O00, reason: collision with other inner class name */
        public static class C0002O00 implements OO0 {

            /* JADX INFO: renamed from: O00, reason: collision with root package name */
            public final IBinder f160O00;

            public C0002O00(IBinder iBinder) {
                this.f160O00 = iBinder;
            }

            @Override // O00.OO0
            public final void O00(String str, Bundle bundle, com.oplus.carlink.controlsdk.O0O.BinderC0953O0O binderC0953O0O) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.oplus.carlink.ICarControlCenterClient");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongInterface(binderC0953O0O);
                    this.f160O00.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f160O00;
            }
        }
    }

    void O00(String str, Bundle bundle, com.oplus.carlink.controlsdk.O0O.BinderC0953O0O binderC0953O0O);
}
