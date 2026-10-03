package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\tHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006)"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreReserverReportEntity;", "", "reserver_type", "", "moudle", SensorsBean.RESERVE_PLACE, "reserveChannel", "reserveType", "otherPair", "", "Lkotlin/Pair;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMoudle", "()Ljava/lang/String;", "setMoudle", "(Ljava/lang/String;)V", "getOtherPair", "()Ljava/util/List;", "setOtherPair", "(Ljava/util/List;)V", "getReserveChannel", "setReserveChannel", "getReserveType", "setReserveType", "getReserve_place", "setReserve_place", "getReserver_type", "setReserver_type", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreReserverReportEntity {

    @NotNull
    private String moudle;

    @Nullable
    private List<Pair<String, String>> otherPair;

    @NotNull
    private String reserveChannel;

    @NotNull
    private String reserveType;

    @NotNull
    private String reserve_place;

    @NotNull
    private String reserver_type;

    public OStoreReserverReportEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OStoreReserverReportEntity copy$default(OStoreReserverReportEntity oStoreReserverReportEntity, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oStoreReserverReportEntity.reserver_type;
        }
        if ((i & 2) != 0) {
            str2 = oStoreReserverReportEntity.moudle;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oStoreReserverReportEntity.reserve_place;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oStoreReserverReportEntity.reserveChannel;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = oStoreReserverReportEntity.reserveType;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = oStoreReserverReportEntity.otherPair;
        }
        return oStoreReserverReportEntity.copy(str, str6, str7, str8, str9, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReserver_type() {
        return this.reserver_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMoudle() {
        return this.moudle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReserve_place() {
        return this.reserve_place;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReserveChannel() {
        return this.reserveChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReserveType() {
        return this.reserveType;
    }

    @Nullable
    public final List<Pair<String, String>> component6() {
        return this.otherPair;
    }

    @NotNull
    public final OStoreReserverReportEntity copy(@NotNull String reserver_type, @NotNull String moudle, @NotNull String reserve_place, @NotNull String reserveChannel, @NotNull String reserveType, @Nullable List<Pair<String, String>> otherPair) {
        Intrinsics.checkNotNullParameter(reserver_type, "reserver_type");
        Intrinsics.checkNotNullParameter(moudle, "moudle");
        Intrinsics.checkNotNullParameter(reserve_place, "reserve_place");
        Intrinsics.checkNotNullParameter(reserveChannel, "reserveChannel");
        Intrinsics.checkNotNullParameter(reserveType, "reserveType");
        return new OStoreReserverReportEntity(reserver_type, moudle, reserve_place, reserveChannel, reserveType, otherPair);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreReserverReportEntity)) {
            return false;
        }
        OStoreReserverReportEntity oStoreReserverReportEntity = (OStoreReserverReportEntity) other;
        return Intrinsics.areEqual(this.reserver_type, oStoreReserverReportEntity.reserver_type) && Intrinsics.areEqual(this.moudle, oStoreReserverReportEntity.moudle) && Intrinsics.areEqual(this.reserve_place, oStoreReserverReportEntity.reserve_place) && Intrinsics.areEqual(this.reserveChannel, oStoreReserverReportEntity.reserveChannel) && Intrinsics.areEqual(this.reserveType, oStoreReserverReportEntity.reserveType) && Intrinsics.areEqual(this.otherPair, oStoreReserverReportEntity.otherPair);
    }

    @NotNull
    public final String getMoudle() {
        return this.moudle;
    }

    @Nullable
    public final List<Pair<String, String>> getOtherPair() {
        return this.otherPair;
    }

    @NotNull
    public final String getReserveChannel() {
        return this.reserveChannel;
    }

    @NotNull
    public final String getReserveType() {
        return this.reserveType;
    }

    @NotNull
    public final String getReserve_place() {
        return this.reserve_place;
    }

    @NotNull
    public final String getReserver_type() {
        return this.reserver_type;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.reserver_type.hashCode() * 31) + this.moudle.hashCode()) * 31) + this.reserve_place.hashCode()) * 31) + this.reserveChannel.hashCode()) * 31) + this.reserveType.hashCode()) * 31;
        List<Pair<String, String>> list = this.otherPair;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setMoudle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moudle = str;
    }

    public final void setOtherPair(@Nullable List<Pair<String, String>> list) {
        this.otherPair = list;
    }

    public final void setReserveChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserveChannel = str;
    }

    public final void setReserveType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserveType = str;
    }

    public final void setReserve_place(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserve_place = str;
    }

    public final void setReserver_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserver_type = str;
    }

    @NotNull
    public String toString() {
        return "OStoreReserverReportEntity(reserver_type=" + this.reserver_type + ", moudle=" + this.moudle + ", reserve_place=" + this.reserve_place + ", reserveChannel=" + this.reserveChannel + ", reserveType=" + this.reserveType + ", otherPair=" + this.otherPair + ')';
    }

    public OStoreReserverReportEntity(@NotNull String reserver_type, @NotNull String moudle, @NotNull String reserve_place, @NotNull String reserveChannel, @NotNull String reserveType, @Nullable List<Pair<String, String>> list) {
        Intrinsics.checkNotNullParameter(reserver_type, "reserver_type");
        Intrinsics.checkNotNullParameter(moudle, "moudle");
        Intrinsics.checkNotNullParameter(reserve_place, "reserve_place");
        Intrinsics.checkNotNullParameter(reserveChannel, "reserveChannel");
        Intrinsics.checkNotNullParameter(reserveType, "reserveType");
        this.reserver_type = reserver_type;
        this.moudle = moudle;
        this.reserve_place = reserve_place;
        this.reserveChannel = reserveChannel;
        this.reserveType = reserveType;
        this.otherPair = list;
    }

    public /* synthetic */ OStoreReserverReportEntity(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : list);
    }
}
