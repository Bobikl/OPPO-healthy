package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableData;", "Landroid/os/Parcelable;", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "data", "Landroidx/work/Data;", "(Landroidx/work/Data;)V", "getData", "()Landroidx/work/Data;", "describeContents", "", "writeToParcel", "", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "Companion", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nParcelableData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParcelableData.kt\nandroidx/work/multiprocess/parcelable/ParcelableData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class ParcelableData implements Parcelable {

    @NotNull
    private final Data data;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableData> CREATOR = new Parcelable.Creator<ParcelableData>() { // from class: androidx.work.multiprocess.parcelable.ParcelableData$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableData createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new ParcelableData(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableData[] newArray(int size) {
            return new ParcelableData[size];
        }
    };

    public ParcelableData(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByteArray(this.data.toByteArray());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ParcelableData(@NotNull Parcel inParcel) {
        Data dataFromByteArray;
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        byte[] bArrCreateByteArray = inParcel.createByteArray();
        this((bArrCreateByteArray == null || (dataFromByteArray = Data.INSTANCE.fromByteArray(bArrCreateByteArray)) == null) ? Data.EMPTY : dataFromByteArray);
    }
}
