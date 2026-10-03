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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001)B/\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b \u0010\u001dR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b\u0014\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PermissionInfo;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "component4", "", "component5", "group", "groupLabel", PermissionDetailAct.PERMISSION, "permissionLabel", "isAuth", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getGroup", "()Ljava/lang/String;", "getGroupLabel", "getPermission", "getPermissionLabel", "Z", "()Z", "setAuth", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PermissionInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String group;

    @NotNull
    private final String groupLabel;
    private boolean isAuth;

    @NotNull
    private final String permission;

    @NotNull
    private final String permissionLabel;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.PermissionInfo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/PermissionInfo$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/PermissionInfo;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/PermissionInfo;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<PermissionInfo> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PermissionInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PermissionInfo[] newArray(int size) {
            return new PermissionInfo[size];
        }
    }

    public PermissionInfo(@NotNull String group, @NotNull String groupLabel, @NotNull String permission, @NotNull String permissionLabel, boolean z) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(permissionLabel, "permissionLabel");
        this.group = group;
        this.groupLabel = groupLabel;
        this.permission = permission;
        this.permissionLabel = permissionLabel;
        this.isAuth = z;
    }

    public static /* synthetic */ PermissionInfo copy$default(PermissionInfo permissionInfo, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionInfo.group;
        }
        if ((i & 2) != 0) {
            str2 = permissionInfo.groupLabel;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = permissionInfo.permission;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = permissionInfo.permissionLabel;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = permissionInfo.isAuth;
        }
        return permissionInfo.copy(str, str5, str6, str7, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupLabel() {
        return this.groupLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPermissionLabel() {
        return this.permissionLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsAuth() {
        return this.isAuth;
    }

    @NotNull
    public final PermissionInfo copy(@NotNull String group, @NotNull String groupLabel, @NotNull String permission, @NotNull String permissionLabel, boolean isAuth) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(permissionLabel, "permissionLabel");
        return new PermissionInfo(group, groupLabel, permission, permissionLabel, isAuth);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionInfo)) {
            return false;
        }
        PermissionInfo permissionInfo = (PermissionInfo) other;
        return Intrinsics.areEqual(this.group, permissionInfo.group) && Intrinsics.areEqual(this.groupLabel, permissionInfo.groupLabel) && Intrinsics.areEqual(this.permission, permissionInfo.permission) && Intrinsics.areEqual(this.permissionLabel, permissionInfo.permissionLabel) && this.isAuth == permissionInfo.isAuth;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    public final String getGroupLabel() {
        return this.groupLabel;
    }

    @NotNull
    public final String getPermission() {
        return this.permission;
    }

    @NotNull
    public final String getPermissionLabel() {
        return this.permissionLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((this.group.hashCode() * 31) + this.groupLabel.hashCode()) * 31) + this.permission.hashCode()) * 31) + this.permissionLabel.hashCode()) * 31;
        boolean z = this.isAuth;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    public final void setAuth(boolean z) {
        this.isAuth = z;
    }

    @NotNull
    public String toString() {
        return "PermissionInfo(group=" + this.group + ", groupLabel=" + this.groupLabel + ", permission=" + this.permission + ", permissionLabel=" + this.permissionLabel + ", isAuth=" + this.isAuth + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.group);
        parcel.writeString(this.groupLabel);
        parcel.writeString(this.permission);
        parcel.writeString(this.permissionLabel);
        parcel.writeByte(this.isAuth ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PermissionInfo(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        this(str, str2, str3, string4 == null ? "" : string4, parcel.readByte() != 0);
    }
}
