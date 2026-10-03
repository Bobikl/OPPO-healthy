package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/insight/net/SignsChartBean;", "", "axis", "Lcom/heytap/health/insight/net/Axis;", "dataSet", "", "Lcom/heytap/health/insight/net/Data;", "legends", "Lcom/heytap/health/insight/net/Legend;", "(Lcom/heytap/health/insight/net/Axis;Ljava/util/List;Ljava/util/List;)V", "getAxis", "()Lcom/heytap/health/insight/net/Axis;", "getDataSet", "()Ljava/util/List;", "getLegends", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SignsChartBean {

    @Nullable
    private final Axis axis;

    @Nullable
    private final List<Data> dataSet;

    @Nullable
    private final List<Legend> legends;

    public SignsChartBean(@Nullable Axis axis, @Nullable List<Data> list, @Nullable List<Legend> list2) {
        this.axis = axis;
        this.dataSet = list;
        this.legends = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignsChartBean copy$default(SignsChartBean signsChartBean, Axis axis, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            axis = signsChartBean.axis;
        }
        if ((i & 2) != 0) {
            list = signsChartBean.dataSet;
        }
        if ((i & 4) != 0) {
            list2 = signsChartBean.legends;
        }
        return signsChartBean.copy(axis, list, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Axis getAxis() {
        return this.axis;
    }

    @Nullable
    public final List<Data> component2() {
        return this.dataSet;
    }

    @Nullable
    public final List<Legend> component3() {
        return this.legends;
    }

    @NotNull
    public final SignsChartBean copy(@Nullable Axis axis, @Nullable List<Data> dataSet, @Nullable List<Legend> legends) {
        return new SignsChartBean(axis, dataSet, legends);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignsChartBean)) {
            return false;
        }
        SignsChartBean signsChartBean = (SignsChartBean) other;
        return Intrinsics.areEqual(this.axis, signsChartBean.axis) && Intrinsics.areEqual(this.dataSet, signsChartBean.dataSet) && Intrinsics.areEqual(this.legends, signsChartBean.legends);
    }

    @Nullable
    public final Axis getAxis() {
        return this.axis;
    }

    @Nullable
    public final List<Data> getDataSet() {
        return this.dataSet;
    }

    @Nullable
    public final List<Legend> getLegends() {
        return this.legends;
    }

    public int hashCode() {
        Axis axis = this.axis;
        int iHashCode = (axis == null ? 0 : axis.hashCode()) * 31;
        List<Data> list = this.dataSet;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Legend> list2 = this.legends;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SignsChartBean(axis=" + this.axis + ", dataSet=" + this.dataSet + ", legends=" + this.legends + ")";
    }
}
