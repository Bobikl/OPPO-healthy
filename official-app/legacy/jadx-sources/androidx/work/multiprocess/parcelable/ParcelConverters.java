package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ParcelConverters {
    private ParcelConverters() {
    }

    @NonNull
    public static byte[] marshall(@NonNull Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @NonNull
    public static <T> T unmarshall(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }
}
