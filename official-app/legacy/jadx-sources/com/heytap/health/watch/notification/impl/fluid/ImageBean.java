package com.heytap.health.watch.notification.impl.fluid;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Arrays;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/heytap/health/watch/notification/impl/fluid/ImageBean;", "Landroid/os/Parcelable;", "md5", "", "level", "bytes", "", "square", "", "(Ljava/lang/String;Ljava/lang/String;[BZ)V", "getBytes", "()[B", "setBytes", "([B)V", "getLevel", "()Ljava/lang/String;", "setLevel", "(Ljava/lang/String;)V", "getMd5", "getSquare", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImageBean> CREATOR = new a();

    @NotNull
    private byte[] bytes;

    @NotNull
    private String level;

    @NotNull
    private final String md5;
    private final boolean square;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageBean> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageBean(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageBean[] newArray(int i) {
            return new ImageBean[i];
        }
    }

    public ImageBean(@NotNull String md5, @NotNull String level, @NotNull byte[] bytes, boolean z) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.md5 = md5;
        this.level = level;
        this.bytes = bytes;
        this.square = z;
    }

    public static /* synthetic */ ImageBean copy$default(ImageBean imageBean, String str, String str2, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageBean.md5;
        }
        if ((i & 2) != 0) {
            str2 = imageBean.level;
        }
        if ((i & 4) != 0) {
            bArr = imageBean.bytes;
        }
        if ((i & 8) != 0) {
            z = imageBean.square;
        }
        return imageBean.copy(str, str2, bArr, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSquare() {
        return this.square;
    }

    @NotNull
    public final ImageBean copy(@NotNull String md5, @NotNull String level, @NotNull byte[] bytes, boolean square) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new ImageBean(md5, level, bytes, square);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ImageBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watch.notification.impl.fluid.ImageBean");
        ImageBean imageBean = (ImageBean) other;
        return this.square == imageBean.square && Intrinsics.areEqual(this.md5, imageBean.md5) && Intrinsics.areEqual(this.level, imageBean.level) && Arrays.equals(this.bytes, imageBean.bytes);
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    public final boolean getSquare() {
        return this.square;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.square) * 31) + this.md5.hashCode()) * 31) + this.level.hashCode()) * 31) + Arrays.hashCode(this.bytes);
    }

    public final void setBytes(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.bytes = bArr;
    }

    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    @NotNull
    public String toString() {
        return "ImageBean(level='" + this.level + "', md5='" + this.md5 + "', square=" + this.square + ", size=" + this.bytes.length + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.md5);
        parcel.writeString(this.level);
        parcel.writeByteArray(this.bytes);
        parcel.writeInt(this.square ? 1 : 0);
    }

    public /* synthetic */ ImageBean(String str, String str2, byte[] bArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bArr, (i & 8) != 0 ? false : z);
    }
}
