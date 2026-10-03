package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreNearStoreNetInfo;", "", "shopInfoDTO", "Lcom/heytap/store/business/component/entity/OStoreNearShopInfo;", "serverList", "", "", "(Lcom/heytap/store/business/component/entity/OStoreNearShopInfo;Ljava/util/List;)V", "getServerList", "()Ljava/util/List;", "setServerList", "(Ljava/util/List;)V", "getShopInfoDTO", "()Lcom/heytap/store/business/component/entity/OStoreNearShopInfo;", "setShopInfoDTO", "(Lcom/heytap/store/business/component/entity/OStoreNearShopInfo;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreNearStoreNetInfo {

    @Nullable
    private List<String> serverList;

    @Nullable
    private OStoreNearShopInfo shopInfoDTO;

    /* JADX WARN: Multi-variable type inference failed */
    public OStoreNearStoreNetInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OStoreNearStoreNetInfo copy$default(OStoreNearStoreNetInfo oStoreNearStoreNetInfo, OStoreNearShopInfo oStoreNearShopInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            oStoreNearShopInfo = oStoreNearStoreNetInfo.shopInfoDTO;
        }
        if ((i & 2) != 0) {
            list = oStoreNearStoreNetInfo.serverList;
        }
        return oStoreNearStoreNetInfo.copy(oStoreNearShopInfo, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OStoreNearShopInfo getShopInfoDTO() {
        return this.shopInfoDTO;
    }

    @Nullable
    public final List<String> component2() {
        return this.serverList;
    }

    @NotNull
    public final OStoreNearStoreNetInfo copy(@Nullable OStoreNearShopInfo shopInfoDTO, @Nullable List<String> serverList) {
        return new OStoreNearStoreNetInfo(shopInfoDTO, serverList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreNearStoreNetInfo)) {
            return false;
        }
        OStoreNearStoreNetInfo oStoreNearStoreNetInfo = (OStoreNearStoreNetInfo) other;
        return Intrinsics.areEqual(this.shopInfoDTO, oStoreNearStoreNetInfo.shopInfoDTO) && Intrinsics.areEqual(this.serverList, oStoreNearStoreNetInfo.serverList);
    }

    @Nullable
    public final List<String> getServerList() {
        return this.serverList;
    }

    @Nullable
    public final OStoreNearShopInfo getShopInfoDTO() {
        return this.shopInfoDTO;
    }

    public int hashCode() {
        OStoreNearShopInfo oStoreNearShopInfo = this.shopInfoDTO;
        int iHashCode = (oStoreNearShopInfo == null ? 0 : oStoreNearShopInfo.hashCode()) * 31;
        List<String> list = this.serverList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setServerList(@Nullable List<String> list) {
        this.serverList = list;
    }

    public final void setShopInfoDTO(@Nullable OStoreNearShopInfo oStoreNearShopInfo) {
        this.shopInfoDTO = oStoreNearShopInfo;
    }

    @NotNull
    public String toString() {
        return "OStoreNearStoreNetInfo(shopInfoDTO=" + this.shopInfoDTO + ", serverList=" + this.serverList + ')';
    }

    public OStoreNearStoreNetInfo(@Nullable OStoreNearShopInfo oStoreNearShopInfo, @Nullable List<String> list) {
        this.shopInfoDTO = oStoreNearShopInfo;
        this.serverList = list;
    }

    public /* synthetic */ OStoreNearStoreNetInfo(OStoreNearShopInfo oStoreNearShopInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oStoreNearShopInfo, (i & 2) != 0 ? null : list);
    }
}
