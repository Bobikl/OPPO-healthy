package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/CityIotList;", "", "cityCardDTOList", "", "Lcom/heytap/health/wallet/network/bus/rsp/CityCardIotDTO;", "version", "", "(Ljava/util/List;J)V", "getCityCardDTOList", "()Ljava/util/List;", "setCityCardDTOList", "(Ljava/util/List;)V", "getVersion", "()J", "setVersion", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CityIotList {

    @Nullable
    private List<CityCardIotDTO> cityCardDTOList;
    private long version;

    public CityIotList() {
        this(null, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CityIotList copy$default(CityIotList cityIotList, List list, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cityIotList.cityCardDTOList;
        }
        if ((i & 2) != 0) {
            j2 = cityIotList.version;
        }
        return cityIotList.copy(list, j2);
    }

    @Nullable
    public final List<CityCardIotDTO> component1() {
        return this.cityCardDTOList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    public final CityIotList copy(@Nullable List<CityCardIotDTO> cityCardDTOList, long version) {
        return new CityIotList(cityCardDTOList, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityIotList)) {
            return false;
        }
        CityIotList cityIotList = (CityIotList) other;
        return Intrinsics.areEqual(this.cityCardDTOList, cityIotList.cityCardDTOList) && this.version == cityIotList.version;
    }

    @Nullable
    public final List<CityCardIotDTO> getCityCardDTOList() {
        return this.cityCardDTOList;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        List<CityCardIotDTO> list = this.cityCardDTOList;
        return ((list == null ? 0 : list.hashCode()) * 31) + Long.hashCode(this.version);
    }

    public final void setCityCardDTOList(@Nullable List<CityCardIotDTO> list) {
        this.cityCardDTOList = list;
    }

    public final void setVersion(long j2) {
        this.version = j2;
    }

    @NotNull
    public String toString() {
        return "CityIotList(cityCardDTOList=" + this.cityCardDTOList + ", version=" + this.version + ")";
    }

    public CityIotList(@Nullable List<CityCardIotDTO> list, long j2) {
        this.cityCardDTOList = list;
        this.version = j2;
    }

    public /* synthetic */ CityIotList(List list, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0L : j2);
    }
}
