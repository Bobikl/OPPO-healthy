package com.heytap.health.health.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u001d\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/heytap/health/health/bitmap/DataResult;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "writeBitmapToParcel", "readBitmapFromParcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "describeContents", "component1", "Landroid/graphics/Bitmap;", "component2", "errorCode", "bitmap", "copy", "", "toString", "hashCode", "", "other", "", "equals", "I", "getErrorCode", "()I", "setErrorCode", "(I)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "<init>", "(ILandroid/graphics/Bitmap;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "health_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DataResult implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Bitmap bitmap;
    private int errorCode;

    /* JADX INFO: renamed from: com.heytap.health.health.bitmap.DataResult$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/health/bitmap/DataResult$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/health/bitmap/DataResult;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/health/bitmap/DataResult;", "<init>", "()V", "health_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<DataResult> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataResult[] newArray(int size) {
            return new DataResult[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataResult() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DataResult copy$default(DataResult dataResult, int i, Bitmap bitmap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dataResult.errorCode;
        }
        if ((i2 & 2) != 0) {
            bitmap = dataResult.bitmap;
        }
        return dataResult.copy(i, bitmap);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final DataResult copy(int errorCode, @Nullable Bitmap bitmap) {
        return new DataResult(errorCode, bitmap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataResult)) {
            return false;
        }
        DataResult dataResult = (DataResult) other;
        return this.errorCode == dataResult.errorCode && Intrinsics.areEqual(this.bitmap, dataResult.bitmap);
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        Bitmap bitmap = this.bitmap;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final void readBitmapFromParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.bitmap = bArrCreateByteArray != null ? BitmapFactory.decodeByteArray(bArrCreateByteArray, 0, bArrCreateByteArray.length) : null;
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    @NotNull
    public String toString() {
        return "DataResult(errorCode=" + this.errorCode + ", bitmap=" + this.bitmap + ")";
    }

    public final void writeBitmapToParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (this.bitmap == null) {
            parcel.writeByteArray(null);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = this.bitmap;
        Intrinsics.checkNotNull(bitmap);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        parcel.writeByteArray(byteArrayOutputStream.toByteArray());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.errorCode);
        writeBitmapToParcel(parcel);
    }

    public DataResult(int i, @Nullable Bitmap bitmap) {
        this.errorCode = i;
        this.bitmap = bitmap;
    }

    public /* synthetic */ DataResult(int i, Bitmap bitmap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : bitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataResult(@NotNull Parcel parcel) {
        this(parcel.readInt(), null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readBitmapFromParcel(parcel);
    }
}
