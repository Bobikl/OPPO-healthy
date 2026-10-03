package com.heytap.health.health.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00014B)\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u00101B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b0\u00102J\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0006\u0010\u0014\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\bH\u0004J\t\u0010\u0016\u001a\u00020\u0010HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0010HÖ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/heytap/health/health/bitmap/ThemeDataResult;", "Landroid/os/Parcelable;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/os/Parcel;", "parcel", "", "forAidl", "", "writeBitmapToParcel", "writeCompressedBitmap", "readBitmapFromParcel", "src", "", "ratio", "scaleBitmap", "", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "describeContents", "recycle", "finalize", "component1", "component2", "component3", "errorCode", "darkBitmap", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getErrorCode", "()I", "setErrorCode", "(I)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "getDarkBitmap", "setDarkBitmap", "needRecycle", "Z", "<init>", "(ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "(Landroid/os/Parcel;)V", "Companion", "b", "health_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThemeDataResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeDataResult.kt\ncom/heytap/health/health/bitmap/ThemeDataResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final /* data */ class ThemeDataResult implements Parcelable {
    private static final int BITMAP_COMPRESS_QUALITY = 80;
    private static final int MAX_BITMAP_SIZE_BYTES = 819200;
    private static final int SAFE_MODE_THRESHOLD = 1048576;

    @Nullable
    private Bitmap bitmap;

    @Nullable
    private Bitmap darkBitmap;
    private int errorCode;
    private boolean needRecycle;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ThemeDataResult> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/heytap/health/health/bitmap/ThemeDataResult$a", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/health/bitmap/ThemeDataResult;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/health/bitmap/ThemeDataResult;", "health_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<ThemeDataResult> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ThemeDataResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ThemeDataResult themeDataResult = new ThemeDataResult(parcel);
            themeDataResult.needRecycle = true;
            return themeDataResult;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ThemeDataResult[] newArray(int size) {
            return new ThemeDataResult[size];
        }
    }

    public ThemeDataResult() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ ThemeDataResult copy$default(ThemeDataResult themeDataResult, int i, Bitmap bitmap, Bitmap bitmap2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = themeDataResult.errorCode;
        }
        if ((i2 & 2) != 0) {
            bitmap = themeDataResult.bitmap;
        }
        if ((i2 & 4) != 0) {
            bitmap2 = themeDataResult.darkBitmap;
        }
        return themeDataResult.copy(i, bitmap, bitmap2);
    }

    private final Bitmap readBitmapFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        if (i <= 0) {
            return null;
        }
        try {
            byte[] bArr = new byte[i];
            parcel.readByteArray(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
            if (bitmapDecodeByteArray == null) {
                return null;
            }
            if (bitmapDecodeByteArray.getAllocationByteCount() <= 2457600) {
                return bitmapDecodeByteArray;
            }
            bitmapDecodeByteArray.recycle();
            throw new IllegalStateException("Bitmap exceeds safety limit");
        } catch (Exception unused) {
            return null;
        }
    }

    private final Bitmap scaleBitmap(Bitmap src, float ratio) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(src, (int) (src.getWidth() * ratio), (int) (src.getHeight() * ratio), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(\n    …           true\n        )");
        src.recycle();
        return bitmapCreateScaledBitmap;
    }

    private final void writeBitmapToParcel(Bitmap bitmap, Parcel parcel, boolean forAidl) {
        if (bitmap == null) {
            parcel.writeInt(0);
        } else if (!forAidl || bitmap.getAllocationByteCount() <= 1048576) {
            writeCompressedBitmap(bitmap, parcel);
        } else {
            writeCompressedBitmap(scaleBitmap(bitmap, 0.5f), parcel);
        }
    }

    private final void writeCompressedBitmap(Bitmap bitmap, Parcel parcel) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!bitmap.compress(Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream)) {
                parcel.writeInt(0);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                return;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayOutputStream, th);
                throw th2;
            }
        }
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

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bitmap getDarkBitmap() {
        return this.darkBitmap;
    }

    @NotNull
    public final ThemeDataResult copy(int errorCode, @Nullable Bitmap bitmap, @Nullable Bitmap darkBitmap) {
        return new ThemeDataResult(errorCode, bitmap, darkBitmap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeDataResult)) {
            return false;
        }
        ThemeDataResult themeDataResult = (ThemeDataResult) other;
        return this.errorCode == themeDataResult.errorCode && Intrinsics.areEqual(this.bitmap, themeDataResult.bitmap) && Intrinsics.areEqual(this.darkBitmap, themeDataResult.darkBitmap);
    }

    public final void finalize() {
        if (this.needRecycle) {
            recycle();
        }
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final Bitmap getDarkBitmap() {
        return this.darkBitmap;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        Bitmap bitmap = this.bitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.darkBitmap;
        return iHashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }

    public final void recycle() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.recycle();
                this.bitmap = null;
            }
        }
        Bitmap bitmap2 = this.darkBitmap;
        if (bitmap2 != null) {
            if (bitmap2.isRecycled()) {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.darkBitmap = null;
            }
        }
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setDarkBitmap(@Nullable Bitmap bitmap) {
        this.darkBitmap = bitmap;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    @NotNull
    public String toString() {
        return "ThemeDataResult(errorCode=" + this.errorCode + ", bitmap=" + this.bitmap + ", darkBitmap=" + this.darkBitmap + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        try {
            parcel.writeInt(this.errorCode);
            int i = flags & 1;
            boolean z = i != 0;
            writeBitmapToParcel(this.bitmap, parcel, z);
            writeBitmapToParcel(this.darkBitmap, parcel, z);
            if (i != 0) {
            }
        } finally {
            if ((flags & 1) != 0) {
                recycle();
            }
        }
    }

    public ThemeDataResult(int i, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        this.errorCode = i;
        this.bitmap = bitmap;
        this.darkBitmap = bitmap2;
    }

    public /* synthetic */ ThemeDataResult(int i, Bitmap bitmap, Bitmap bitmap2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : bitmap, (i2 & 4) != 0 ? null : bitmap2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemeDataResult(@NotNull Parcel parcel) {
        this(parcel.readInt(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.bitmap = readBitmapFromParcel(parcel);
        this.darkBitmap = readBitmapFromParcel(parcel);
    }
}
