package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/business/component/entity/IntegralExpEntity;", "", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "id", "", "nameMap", "", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;Ljava/lang/String;Ljava/util/Map;)V", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getId", "()Ljava/lang/String;", "getNameMap", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class IntegralExpEntity {

    @Nullable
    private final OStoreHeaderInfo headerInfo;

    @NotNull
    private final String id;

    @Nullable
    private final Map<String, String> nameMap;

    public IntegralExpEntity(@Nullable OStoreHeaderInfo oStoreHeaderInfo, @NotNull String id, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.headerInfo = oStoreHeaderInfo;
        this.id = id;
        this.nameMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntegralExpEntity copy$default(IntegralExpEntity integralExpEntity, OStoreHeaderInfo oStoreHeaderInfo, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            oStoreHeaderInfo = integralExpEntity.headerInfo;
        }
        if ((i & 2) != 0) {
            str = integralExpEntity.id;
        }
        if ((i & 4) != 0) {
            map = integralExpEntity.nameMap;
        }
        return integralExpEntity.copy(oStoreHeaderInfo, str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.nameMap;
    }

    @NotNull
    public final IntegralExpEntity copy(@Nullable OStoreHeaderInfo headerInfo, @NotNull String id, @Nullable Map<String, String> nameMap) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new IntegralExpEntity(headerInfo, id, nameMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegralExpEntity)) {
            return false;
        }
        IntegralExpEntity integralExpEntity = (IntegralExpEntity) other;
        return Intrinsics.areEqual(this.headerInfo, integralExpEntity.headerInfo) && Intrinsics.areEqual(this.id, integralExpEntity.id) && Intrinsics.areEqual(this.nameMap, integralExpEntity.nameMap);
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, String> getNameMap() {
        return this.nameMap;
    }

    public int hashCode() {
        OStoreHeaderInfo oStoreHeaderInfo = this.headerInfo;
        int iHashCode = (((oStoreHeaderInfo == null ? 0 : oStoreHeaderInfo.hashCode()) * 31) + this.id.hashCode()) * 31;
        Map<String, String> map = this.nameMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IntegralExpEntity(headerInfo=" + this.headerInfo + ", id=" + this.id + ", nameMap=" + this.nameMap + ')';
    }

    public /* synthetic */ IntegralExpEntity(OStoreHeaderInfo oStoreHeaderInfo, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oStoreHeaderInfo, str, (i & 4) != 0 ? null : map);
    }
}
