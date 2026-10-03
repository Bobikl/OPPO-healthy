package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b!\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b!\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b!\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PackageInfoParcelable;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "component1", "", "component2", "Lcom/oplus/ocs/wearengine/common/Status;", "component3", "versionCode", "versionName", "status", "copy", "toString", "hashCode", "other", "", "equals", "I", "getVersionCode", "()I", "Ljava/lang/String;", "getVersionName", "()Ljava/lang/String;", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "<init>", "(ILjava/lang/String;Lcom/oplus/ocs/wearengine/common/Status;)V", "parcel", "(Landroid/os/Parcel;)V", "(ILjava/lang/String;)V", "(Lcom/oplus/ocs/wearengine/common/Status;)V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PackageInfoParcelable implements Parcelable {

    @NotNull
    private final Status status;
    private final int versionCode;

    @NotNull
    private final String versionName;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<PackageInfoParcelable> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/oplus/ocs/wearengine/bean/PackageInfoParcelable$a", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/PackageInfoParcelable;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/PackageInfoParcelable;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<PackageInfoParcelable> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PackageInfoParcelable createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new PackageInfoParcelable(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PackageInfoParcelable[] newArray(int size) {
            return new PackageInfoParcelable[size];
        }
    }

    public PackageInfoParcelable(int i, @NotNull String versionName, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.versionCode = i;
        this.versionName = versionName;
        this.status = status;
    }

    public static /* synthetic */ PackageInfoParcelable copy$default(PackageInfoParcelable packageInfoParcelable, int i, String str, Status status, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = packageInfoParcelable.getVersionCode();
        }
        if ((i2 & 2) != 0) {
            str = packageInfoParcelable.getVersionName();
        }
        if ((i2 & 4) != 0) {
            status = packageInfoParcelable.getStatus();
        }
        return packageInfoParcelable.copy(i, str, status);
    }

    public final int component1() {
        return getVersionCode();
    }

    @NotNull
    public final String component2() {
        return getVersionName();
    }

    @NotNull
    public final Status component3() {
        return getStatus();
    }

    @NotNull
    public final PackageInfoParcelable copy(int versionCode, @NotNull String versionName, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PackageInfoParcelable(versionCode, versionName, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageInfoParcelable)) {
            return false;
        }
        PackageInfoParcelable packageInfoParcelable = (PackageInfoParcelable) other;
        return getVersionCode() == packageInfoParcelable.getVersionCode() && Intrinsics.areEqual(getVersionName(), packageInfoParcelable.getVersionName()) && Intrinsics.areEqual(getStatus(), packageInfoParcelable.getStatus());
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((Integer.hashCode(getVersionCode()) * 31) + getVersionName().hashCode()) * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "PackageInfoParcelable(versionCode=" + getVersionCode() + ", versionName=" + getVersionName() + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(getVersionCode());
        dest.writeString(getVersionName());
        dest.writeParcelable(getStatus(), 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PackageInfoParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        String string = parcel.readString();
        string = string == null ? "" : string;
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this(i, string, status == null ? new Status(8, null, 2, null) : status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PackageInfoParcelable(int i, @NotNull String versionName) {
        this(i, versionName, Status.SUCCESS);
        Intrinsics.checkNotNullParameter(versionName, "versionName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PackageInfoParcelable(@NotNull Status status) {
        this(0, "", status);
        Intrinsics.checkNotNullParameter(status, "status");
    }
}
