package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJD\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006#"}, d2 = {"Lcom/heytap/store/base/core/data/HotWordData;", "", "iconDetailsForms", "", "Lcom/heytap/store/base/core/data/IconDetailsForms;", "rows", "", "cols", "maxProductNum", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCols", "()Ljava/lang/Integer;", "setCols", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIconDetailsForms", "()Ljava/util/List;", "setIconDetailsForms", "(Ljava/util/List;)V", "getMaxProductNum", "setMaxProductNum", "getRows", "setRows", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/store/base/core/data/HotWordData;", "equals", "", "other", "hashCode", "toString", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HotWordData {

    @Nullable
    private Integer cols;

    @Nullable
    private List<IconDetailsForms> iconDetailsForms;

    @Nullable
    private Integer maxProductNum;

    @Nullable
    private Integer rows;

    public HotWordData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotWordData copy$default(HotWordData hotWordData, List list, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hotWordData.iconDetailsForms;
        }
        if ((i & 2) != 0) {
            num = hotWordData.rows;
        }
        if ((i & 4) != 0) {
            num2 = hotWordData.cols;
        }
        if ((i & 8) != 0) {
            num3 = hotWordData.maxProductNum;
        }
        return hotWordData.copy(list, num, num2, num3);
    }

    @Nullable
    public final List<IconDetailsForms> component1() {
        return this.iconDetailsForms;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRows() {
        return this.rows;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCols() {
        return this.cols;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxProductNum() {
        return this.maxProductNum;
    }

    @NotNull
    public final HotWordData copy(@Nullable List<IconDetailsForms> iconDetailsForms, @Nullable Integer rows, @Nullable Integer cols, @Nullable Integer maxProductNum) {
        return new HotWordData(iconDetailsForms, rows, cols, maxProductNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotWordData)) {
            return false;
        }
        HotWordData hotWordData = (HotWordData) other;
        return Intrinsics.areEqual(this.iconDetailsForms, hotWordData.iconDetailsForms) && Intrinsics.areEqual(this.rows, hotWordData.rows) && Intrinsics.areEqual(this.cols, hotWordData.cols) && Intrinsics.areEqual(this.maxProductNum, hotWordData.maxProductNum);
    }

    @Nullable
    public final Integer getCols() {
        return this.cols;
    }

    @Nullable
    public final List<IconDetailsForms> getIconDetailsForms() {
        return this.iconDetailsForms;
    }

    @Nullable
    public final Integer getMaxProductNum() {
        return this.maxProductNum;
    }

    @Nullable
    public final Integer getRows() {
        return this.rows;
    }

    public int hashCode() {
        List<IconDetailsForms> list = this.iconDetailsForms;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.rows;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cols;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxProductNum;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setCols(@Nullable Integer num) {
        this.cols = num;
    }

    public final void setIconDetailsForms(@Nullable List<IconDetailsForms> list) {
        this.iconDetailsForms = list;
    }

    public final void setMaxProductNum(@Nullable Integer num) {
        this.maxProductNum = num;
    }

    public final void setRows(@Nullable Integer num) {
        this.rows = num;
    }

    @NotNull
    public String toString() {
        return "HotWordData(iconDetailsForms=" + this.iconDetailsForms + ", rows=" + this.rows + ", cols=" + this.cols + ", maxProductNum=" + this.maxProductNum + ')';
    }

    public HotWordData(@Nullable List<IconDetailsForms> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.iconDetailsForms = list;
        this.rows = num;
        this.cols = num2;
        this.maxProductNum = num3;
    }

    public /* synthetic */ HotWordData(List list, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
