package com.oplus.seedling.sdk.seedling;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JP\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;", "Ljava/io/Serializable;", JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE, "", "isRequestShowPanel", JsonToSeedlingCardOptionsConvertor.KEY_NOTIFICATION_ID_LIST, "", "", JsonToSeedlingCardOptionsConvertor.KEY_SHOW_HOST_MAP, "", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotificationIdList", "()Ljava/util/List;", "getShowHostMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;", "equals", "other", "", "hashCode", "toString", "", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeedlingCardOptions implements Serializable {
    private static final long serialVersionUID = 1;

    @Nullable
    private final Boolean isMilestone;

    @Nullable
    private final Boolean isRequestShowPanel;

    @Nullable
    private final List<Integer> notificationIdList;

    @Nullable
    private final Map<Integer, Boolean> showHostMap;

    public SeedlingCardOptions() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeedlingCardOptions copy$default(SeedlingCardOptions seedlingCardOptions, Boolean bool, Boolean bool2, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = seedlingCardOptions.isMilestone;
        }
        if ((i & 2) != 0) {
            bool2 = seedlingCardOptions.isRequestShowPanel;
        }
        if ((i & 4) != 0) {
            list = seedlingCardOptions.notificationIdList;
        }
        if ((i & 8) != 0) {
            map = seedlingCardOptions.showHostMap;
        }
        return seedlingCardOptions.copy(bool, bool2, list, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsMilestone() {
        return this.isMilestone;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    @Nullable
    public final List<Integer> component3() {
        return this.notificationIdList;
    }

    @Nullable
    public final Map<Integer, Boolean> component4() {
        return this.showHostMap;
    }

    @NotNull
    public final SeedlingCardOptions copy(@Nullable Boolean isMilestone, @Nullable Boolean isRequestShowPanel, @Nullable List<Integer> notificationIdList, @Nullable Map<Integer, Boolean> showHostMap) {
        return new SeedlingCardOptions(isMilestone, isRequestShowPanel, notificationIdList, showHostMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingCardOptions)) {
            return false;
        }
        SeedlingCardOptions seedlingCardOptions = (SeedlingCardOptions) other;
        return Intrinsics.areEqual(this.isMilestone, seedlingCardOptions.isMilestone) && Intrinsics.areEqual(this.isRequestShowPanel, seedlingCardOptions.isRequestShowPanel) && Intrinsics.areEqual(this.notificationIdList, seedlingCardOptions.notificationIdList) && Intrinsics.areEqual(this.showHostMap, seedlingCardOptions.showHostMap);
    }

    @Nullable
    public final List<Integer> getNotificationIdList() {
        return this.notificationIdList;
    }

    @Nullable
    public final Map<Integer, Boolean> getShowHostMap() {
        return this.showHostMap;
    }

    public int hashCode() {
        Boolean bool = this.isMilestone;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isRequestShowPanel;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list = this.notificationIdList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, Boolean> map = this.showHostMap;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMilestone() {
        return this.isMilestone;
    }

    @Nullable
    public final Boolean isRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    @NotNull
    public String toString() {
        return "SeedlingCardOptions(isMilestone=" + this.isMilestone + ", isRequestShowPanel=" + this.isRequestShowPanel + ", notificationIdList=" + this.notificationIdList + ", showHostMap=" + this.showHostMap + ")";
    }

    public SeedlingCardOptions(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable List<Integer> list, @Nullable Map<Integer, Boolean> map) {
        this.isMilestone = bool;
        this.isRequestShowPanel = bool2;
        this.notificationIdList = list;
        this.showHostMap = map;
    }

    public /* synthetic */ SeedlingCardOptions(Boolean bool, Boolean bool2, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : map);
    }
}
