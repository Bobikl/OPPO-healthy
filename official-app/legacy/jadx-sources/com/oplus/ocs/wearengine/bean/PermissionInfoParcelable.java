package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PermissionInfoParcelable;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "", "component2", PermissionDetailAct.PERMISSION, "isAuth", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "setPermission", "(Ljava/lang/String;)V", "Z", "()Z", "setAuth", "(Z)V", "<init>", "(Ljava/lang/String;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PermissionInfoParcelable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean isAuth;

    @NotNull
    private String permission;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.PermissionInfoParcelable$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PermissionInfoParcelable$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/PermissionInfoParcelable;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/PermissionInfoParcelable;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<PermissionInfoParcelable> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PermissionInfoParcelable createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionInfoParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PermissionInfoParcelable[] newArray(int size) {
            return new PermissionInfoParcelable[size];
        }
    }

    public PermissionInfoParcelable(@NotNull String permission, boolean z) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.permission = permission;
        this.isAuth = z;
    }

    public static /* synthetic */ PermissionInfoParcelable copy$default(PermissionInfoParcelable permissionInfoParcelable, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionInfoParcelable.permission;
        }
        if ((i & 2) != 0) {
            z = permissionInfoParcelable.isAuth;
        }
        return permissionInfoParcelable.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAuth() {
        return this.isAuth;
    }

    @NotNull
    public final PermissionInfoParcelable copy(@NotNull String permission, boolean isAuth) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return new PermissionInfoParcelable(permission, isAuth);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionInfoParcelable)) {
            return false;
        }
        PermissionInfoParcelable permissionInfoParcelable = (PermissionInfoParcelable) other;
        return Intrinsics.areEqual(this.permission, permissionInfoParcelable.permission) && this.isAuth == permissionInfoParcelable.isAuth;
    }

    @NotNull
    public final String getPermission() {
        return this.permission;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.permission.hashCode() * 31;
        boolean z = this.isAuth;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    public final void setAuth(boolean z) {
        this.isAuth = z;
    }

    public final void setPermission(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permission = str;
    }

    @NotNull
    public String toString() {
        return "PermissionInfoParcelable(permission=" + this.permission + ", isAuth=" + this.isAuth + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.permission);
        parcel.writeByte(this.isAuth ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PermissionInfoParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        this(string == null ? "" : string, parcel.readByte() != 0);
    }
}
