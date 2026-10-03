package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/business/component/entity/CubeBean;", "", "rows", "Ljava/util/ArrayList;", "Lcom/heytap/store/business/component/entity/CubeRow;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getRows", "()Ljava/util/ArrayList;", "setRows", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class CubeBean {

    @NotNull
    private ArrayList<CubeRow> rows;

    public CubeBean(@NotNull ArrayList<CubeRow> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CubeBean copy$default(CubeBean cubeBean, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = cubeBean.rows;
        }
        return cubeBean.copy(arrayList);
    }

    @NotNull
    public final ArrayList<CubeRow> component1() {
        return this.rows;
    }

    @NotNull
    public final CubeBean copy(@NotNull ArrayList<CubeRow> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new CubeBean(rows);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CubeBean) && Intrinsics.areEqual(this.rows, ((CubeBean) other).rows);
    }

    @NotNull
    public final ArrayList<CubeRow> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return this.rows.hashCode();
    }

    public final void setRows(@NotNull ArrayList<CubeRow> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.rows = arrayList;
    }

    @NotNull
    public String toString() {
        return "CubeBean(rows=" + this.rows + ')';
    }
}
