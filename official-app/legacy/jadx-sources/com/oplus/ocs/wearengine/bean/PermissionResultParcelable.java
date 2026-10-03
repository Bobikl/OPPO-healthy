package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B'\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010!B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\"B!\b\u0016\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0004\b\u001f\u0010#J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PermissionResultParcelable;", "", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "Ljava/util/ArrayList;", "Lcom/oplus/ocs/wearengine/bean/PermissionInfoParcelable;", "Lkotlin/collections/ArrayList;", "component1", "Lcom/oplus/ocs/wearengine/common/Status;", "component2", "permissionInfo", "status", "copy", "", "toString", "hashCode", "other", "", "equals", "Ljava/util/ArrayList;", "getPermissionInfo", "()Ljava/util/ArrayList;", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "<init>", "(Ljava/util/ArrayList;Lcom/oplus/ocs/wearengine/common/Status;)V", "(Landroid/os/Parcel;)V", "(Lcom/oplus/ocs/wearengine/common/Status;)V", "(Ljava/util/ArrayList;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PermissionResultParcelable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ArrayList<PermissionInfoParcelable> permissionInfo;

    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.PermissionResultParcelable$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PermissionResultParcelable$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/PermissionResultParcelable;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/PermissionResultParcelable;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<PermissionResultParcelable> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PermissionResultParcelable createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionResultParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PermissionResultParcelable[] newArray(int size) {
            return new PermissionResultParcelable[size];
        }
    }

    public PermissionResultParcelable(@NotNull ArrayList<PermissionInfoParcelable> permissionInfo, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(permissionInfo, "permissionInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        this.permissionInfo = permissionInfo;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionResultParcelable copy$default(PermissionResultParcelable permissionResultParcelable, ArrayList arrayList, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = permissionResultParcelable.getPermissionInfo();
        }
        if ((i & 2) != 0) {
            status = permissionResultParcelable.getStatus();
        }
        return permissionResultParcelable.copy(arrayList, status);
    }

    @NotNull
    public final ArrayList<PermissionInfoParcelable> component1() {
        return getPermissionInfo();
    }

    @NotNull
    public final Status component2() {
        return getStatus();
    }

    @NotNull
    public final PermissionResultParcelable copy(@NotNull ArrayList<PermissionInfoParcelable> permissionInfo, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(permissionInfo, "permissionInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PermissionResultParcelable(permissionInfo, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionResultParcelable)) {
            return false;
        }
        PermissionResultParcelable permissionResultParcelable = (PermissionResultParcelable) other;
        return Intrinsics.areEqual(getPermissionInfo(), permissionResultParcelable.getPermissionInfo()) && Intrinsics.areEqual(getStatus(), permissionResultParcelable.getStatus());
    }

    @NotNull
    public ArrayList<PermissionInfoParcelable> getPermissionInfo() {
        return this.permissionInfo;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (getPermissionInfo().hashCode() * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionResultParcelable(permissionInfo=" + getPermissionInfo() + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(getPermissionInfo());
        parcel.writeParcelable(getStatus(), flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PermissionResultParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(PermissionInfoParcelable.INSTANCE);
        arrayListCreateTypedArrayList = arrayListCreateTypedArrayList == null ? new ArrayList() : arrayListCreateTypedArrayList;
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this(arrayListCreateTypedArrayList, status == null ? new Status(8, null, 2, 0 == true ? 1 : 0) : status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PermissionResultParcelable(@NotNull Status status) {
        this(new ArrayList(), status);
        Intrinsics.checkNotNullParameter(status, "status");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PermissionResultParcelable(@NotNull ArrayList<PermissionInfoParcelable> permissionInfo) {
        this(permissionInfo, Status.SUCCESS);
        Intrinsics.checkNotNullParameter(permissionInfo, "permissionInfo");
    }
}
