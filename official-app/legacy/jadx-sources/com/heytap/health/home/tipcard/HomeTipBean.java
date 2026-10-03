package com.heytap.health.home.tipcard;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÂ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J5\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0004J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/home/tipcard/HomeTipBean;", "", "clickTimes", "", "", "", "displayCounts", "(Ljava/util/Map;Ljava/util/Map;)V", "component1", "component2", "copy", "equals", "", "other", "getCount", "type", "getTime", "hashCode", "incrementCount", "", "saveTime", "toString", "", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HomeTipBean {
    public static final int $stable = 8;

    @NotNull
    private final Map<Integer, Long> clickTimes;

    @NotNull
    private final Map<Integer, Integer> displayCounts;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeTipBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final Map<Integer, Long> component1() {
        return this.clickTimes;
    }

    private final Map<Integer, Integer> component2() {
        return this.displayCounts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeTipBean copy$default(HomeTipBean homeTipBean, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = homeTipBean.clickTimes;
        }
        if ((i & 2) != 0) {
            map2 = homeTipBean.displayCounts;
        }
        return homeTipBean.copy(map, map2);
    }

    @NotNull
    public final HomeTipBean copy(@NotNull Map<Integer, Long> clickTimes, @NotNull Map<Integer, Integer> displayCounts) {
        Intrinsics.checkNotNullParameter(clickTimes, "clickTimes");
        Intrinsics.checkNotNullParameter(displayCounts, "displayCounts");
        return new HomeTipBean(clickTimes, displayCounts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeTipBean)) {
            return false;
        }
        HomeTipBean homeTipBean = (HomeTipBean) other;
        return Intrinsics.areEqual(this.clickTimes, homeTipBean.clickTimes) && Intrinsics.areEqual(this.displayCounts, homeTipBean.displayCounts);
    }

    public final int getCount(int type) {
        Integer num = this.displayCounts.get(Integer.valueOf(type));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final long getTime(int type) {
        Long l2 = this.clickTimes.get(Integer.valueOf(type));
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public int hashCode() {
        return (this.clickTimes.hashCode() * 31) + this.displayCounts.hashCode();
    }

    public final void incrementCount(int type) {
        Map<Integer, Integer> map = this.displayCounts;
        Integer numValueOf = Integer.valueOf(type);
        Integer num = this.displayCounts.get(Integer.valueOf(type));
        map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void saveTime(int type) {
        this.clickTimes.put(Integer.valueOf(type), Long.valueOf(System.currentTimeMillis()));
    }

    @NotNull
    public String toString() {
        return "HomeTipBean(clickTimes=" + this.clickTimes + ", displayCounts=" + this.displayCounts + ")";
    }

    public HomeTipBean(@NotNull Map<Integer, Long> clickTimes, @NotNull Map<Integer, Integer> displayCounts) {
        Intrinsics.checkNotNullParameter(clickTimes, "clickTimes");
        Intrinsics.checkNotNullParameter(displayCounts, "displayCounts");
        this.clickTimes = clickTimes;
        this.displayCounts = displayCounts;
    }

    public /* synthetic */ HomeTipBean(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? new LinkedHashMap() : map2);
    }
}
