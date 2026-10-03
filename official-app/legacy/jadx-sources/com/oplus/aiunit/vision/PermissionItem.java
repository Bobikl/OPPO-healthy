package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.settings.me.settings2.permission.FeaturePermissionDetailActivity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.zee, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\bB%\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/zee;", "", "", "featureId", "", "f", "", "toString", "a", "", "b", "hashCode", "other", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "c", DBHealthReviewPlan.DESC, "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "permissions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "operations_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PermissionItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String desc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<String> permissions;

    public PermissionItem(@NotNull String name, @NotNull String desc, @NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.name = name;
        this.desc = desc;
        this.permissions = permissions;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> b() {
        return this.permissions;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String d() {
        return this.name;
    }

    @NotNull
    public final List<String> e() {
        return this.permissions;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionItem)) {
            return false;
        }
        PermissionItem permissionItem = (PermissionItem) other;
        return Intrinsics.areEqual(this.name, permissionItem.name) && Intrinsics.areEqual(this.desc, permissionItem.desc) && Intrinsics.areEqual(this.permissions, permissionItem.permissions);
    }

    public final boolean f(int featureId) {
        for (String str : this.permissions) {
            if (!PermissionRequestDialog.D(featureId, str)) {
                a7b.f(FeaturePermissionDetailActivity.TAG, "isPermissionEnable featureId:" + featureId + ",perm:" + str + " is not enable");
                return false;
            }
        }
        a7b.f(FeaturePermissionDetailActivity.TAG, "isPermissionEnable featureId:" + featureId + ", is enabled:" + this.permissions);
        return true;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.desc.hashCode()) * 31) + this.permissions.hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionItem(name='" + this.name + "', desc='" + this.desc + "', permissions=" + this.permissions + ")";
    }
}
