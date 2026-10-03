package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeTabResponseData;", "", "code", "", "data", "", "Lcom/heytap/store/homemodule/data/HomeTabData;", "(Ljava/lang/Integer;Ljava/util/List;)V", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/heytap/store/homemodule/data/HomeTabResponseData;", "equals", "", "other", "hashCode", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeTabResponseData {

    @Nullable
    private Integer code;

    @Nullable
    private List<HomeTabData> data;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeTabResponseData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeTabResponseData copy$default(HomeTabResponseData homeTabResponseData, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = homeTabResponseData.code;
        }
        if ((i & 2) != 0) {
            list = homeTabResponseData.data;
        }
        return homeTabResponseData.copy(num, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final List<HomeTabData> component2() {
        return this.data;
    }

    @NotNull
    public final HomeTabResponseData copy(@Nullable Integer code, @Nullable List<HomeTabData> data) {
        return new HomeTabResponseData(code, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeTabResponseData)) {
            return false;
        }
        HomeTabResponseData homeTabResponseData = (HomeTabResponseData) other;
        return Intrinsics.areEqual(this.code, homeTabResponseData.code) && Intrinsics.areEqual(this.data, homeTabResponseData.data);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final List<HomeTabData> getData() {
        return this.data;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<HomeTabData> list = this.data;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setData(@Nullable List<HomeTabData> list) {
        this.data = list;
    }

    @NotNull
    public String toString() {
        return "HomeTabResponseData(code=" + this.code + ", data=" + this.data + ')';
    }

    public HomeTabResponseData(@Nullable Integer num, @Nullable List<HomeTabData> list) {
        this.code = num;
        this.data = list;
    }

    public /* synthetic */ HomeTabResponseData(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : list);
    }
}
