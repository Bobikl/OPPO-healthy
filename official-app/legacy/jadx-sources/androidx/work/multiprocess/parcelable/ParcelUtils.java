package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ParcelUtils {
    private ParcelUtils() {
    }

    public static boolean readBooleanValue(@NonNull Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static void writeBooleanValue(@NonNull Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
