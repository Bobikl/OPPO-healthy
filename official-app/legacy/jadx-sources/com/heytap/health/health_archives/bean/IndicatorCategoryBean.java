package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/heytap/health/health_archives/bean/IndicatorCategoryBean;", "", "code", "", "name", DBIndicatorStat.SORT, "", "selected", "", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getName", "setName", "getSelected", "()Z", "setSelected", "(Z)V", "getSort", "()I", "setSort", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorCategoryBean {

    @NotNull
    private String code;

    @NotNull
    private String name;
    private boolean selected;
    private int sort;

    public IndicatorCategoryBean() {
        this(null, null, 0, false, 15, null);
    }

    public static /* synthetic */ IndicatorCategoryBean copy$default(IndicatorCategoryBean indicatorCategoryBean, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = indicatorCategoryBean.code;
        }
        if ((i2 & 2) != 0) {
            str2 = indicatorCategoryBean.name;
        }
        if ((i2 & 4) != 0) {
            i = indicatorCategoryBean.sort;
        }
        if ((i2 & 8) != 0) {
            z = indicatorCategoryBean.selected;
        }
        return indicatorCategoryBean.copy(str, str2, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final IndicatorCategoryBean copy(@NotNull String code, @NotNull String name, int sort, boolean selected) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        return new IndicatorCategoryBean(code, name, sort, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorCategoryBean)) {
            return false;
        }
        IndicatorCategoryBean indicatorCategoryBean = (IndicatorCategoryBean) other;
        return Intrinsics.areEqual(this.code, indicatorCategoryBean.code) && Intrinsics.areEqual(this.name, indicatorCategoryBean.name) && this.sort == indicatorCategoryBean.sort && this.selected == indicatorCategoryBean.selected;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getSort() {
        return this.sort;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31;
        boolean z = this.selected;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    @NotNull
    public String toString() {
        return "IndicatorCategoryBean(code=" + this.code + ", name=" + this.name + ", sort=" + this.sort + ", selected=" + this.selected + ")";
    }

    public IndicatorCategoryBean(@NotNull String code, @NotNull String name, int i, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.code = code;
        this.name = name;
        this.sort = i;
        this.selected = z;
    }

    public /* synthetic */ IndicatorCategoryBean(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
