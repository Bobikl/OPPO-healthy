package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\"B\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001fB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010 J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/FileTransferPackageNameParcelable;", "", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "Lcom/oplus/ocs/wearengine/common/Status;", "component2", "fileTransferPackageName", "status", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFileTransferPackageName", "()Ljava/lang/String;", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "<init>", "(Ljava/lang/String;Lcom/oplus/ocs/wearengine/common/Status;)V", "(Landroid/os/Parcel;)V", "(Lcom/oplus/ocs/wearengine/common/Status;)V", "(Ljava/lang/String;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FileTransferPackageNameParcelable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String fileTransferPackageName;

    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.FileTransferPackageNameParcelable$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/FileTransferPackageNameParcelable$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/FileTransferPackageNameParcelable;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/FileTransferPackageNameParcelable;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<FileTransferPackageNameParcelable> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileTransferPackageNameParcelable createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FileTransferPackageNameParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileTransferPackageNameParcelable[] newArray(int size) {
            return new FileTransferPackageNameParcelable[size];
        }
    }

    public FileTransferPackageNameParcelable(@Nullable String str, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.fileTransferPackageName = str;
        this.status = status;
    }

    public static /* synthetic */ FileTransferPackageNameParcelable copy$default(FileTransferPackageNameParcelable fileTransferPackageNameParcelable, String str, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileTransferPackageNameParcelable.fileTransferPackageName;
        }
        if ((i & 2) != 0) {
            status = fileTransferPackageNameParcelable.getStatus();
        }
        return fileTransferPackageNameParcelable.copy(str, status);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileTransferPackageName() {
        return this.fileTransferPackageName;
    }

    @NotNull
    public final Status component2() {
        return getStatus();
    }

    @NotNull
    public final FileTransferPackageNameParcelable copy(@Nullable String fileTransferPackageName, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new FileTransferPackageNameParcelable(fileTransferPackageName, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileTransferPackageNameParcelable)) {
            return false;
        }
        FileTransferPackageNameParcelable fileTransferPackageNameParcelable = (FileTransferPackageNameParcelable) other;
        return Intrinsics.areEqual(this.fileTransferPackageName, fileTransferPackageNameParcelable.fileTransferPackageName) && Intrinsics.areEqual(getStatus(), fileTransferPackageNameParcelable.getStatus());
    }

    @Nullable
    public final String getFileTransferPackageName() {
        return this.fileTransferPackageName;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.fileTransferPackageName;
        return ((str == null ? 0 : str.hashCode()) * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "FileTransferPackageNameParcelable(fileTransferPackageName=" + this.fileTransferPackageName + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.fileTransferPackageName);
        parcel.writeParcelable(getStatus(), flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileTransferPackageNameParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        string = string == null ? "" : string;
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this(string, status == null ? new Status(8, null, 2, null) : status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTransferPackageNameParcelable(@NotNull Status status) {
        this("", status);
        Intrinsics.checkNotNullParameter(status, "status");
    }

    public FileTransferPackageNameParcelable(@Nullable String str) {
        this(str, Status.SUCCESS);
    }
}
