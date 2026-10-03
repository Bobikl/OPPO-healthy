package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/StyleRequire;", "", DBHealthReviewPlan.DESC, "", "icon", "require", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDesc", "()Ljava/lang/String;", "getIcon", "getRequire", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StyleRequire {

    @NotNull
    private final String desc;

    @NotNull
    private final String icon;
    private final boolean require;

    public StyleRequire(@NotNull String desc, @NotNull String icon, boolean z) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.desc = desc;
        this.icon = icon;
        this.require = z;
    }

    public static /* synthetic */ StyleRequire copy$default(StyleRequire styleRequire, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = styleRequire.desc;
        }
        if ((i & 2) != 0) {
            str2 = styleRequire.icon;
        }
        if ((i & 4) != 0) {
            z = styleRequire.require;
        }
        return styleRequire.copy(str, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRequire() {
        return this.require;
    }

    @NotNull
    public final StyleRequire copy(@NotNull String desc, @NotNull String icon, boolean require) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new StyleRequire(desc, icon, require);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleRequire)) {
            return false;
        }
        StyleRequire styleRequire = (StyleRequire) other;
        return Intrinsics.areEqual(this.desc, styleRequire.desc) && Intrinsics.areEqual(this.icon, styleRequire.icon) && this.require == styleRequire.require;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final boolean getRequire() {
        return this.require;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((this.desc.hashCode() * 31) + this.icon.hashCode()) * 31;
        boolean z = this.require;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "StyleRequire(desc=" + this.desc + ", icon=" + this.icon + ", require=" + this.require + ")";
    }
}
