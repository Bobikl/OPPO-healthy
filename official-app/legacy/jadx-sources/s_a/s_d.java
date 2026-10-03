package s_a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes11.dex */
public final class s_d implements s_f {

    /* JADX INFO: renamed from: s_a, reason: collision with root package name */
    public final IBinder f20845s_a;

    public s_d(IBinder iBinder) {
        this.f20845s_a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20845s_a;
    }

    public final String s_a(String str, String str2, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.oplus.stdid.IStdID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            if (!this.f20845s_a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i = s_e.f20846s_a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
