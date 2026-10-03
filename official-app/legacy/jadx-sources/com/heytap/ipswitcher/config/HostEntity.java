package com.heytap.ipswitcher.config;

import com.heytap.nearx.cloudconfig.anotation.FieldIndex;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.zma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@zma
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/ipswitcher/config/HostEntity;", "", "host", "", Fields.SP_STRATEGY_FIELD, "isDefault", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getHost", "()Ljava/lang/String;", "()I", "getStrategy", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.nearx.ipswitcher"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HostEntity {

    @FieldIndex(index = 1)
    @NotNull
    private final String host;

    @FieldIndex(index = 3)
    private final int isDefault;

    @FieldIndex(index = 2)
    @NotNull
    private final String strategy;

    public HostEntity() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ HostEntity copy$default(HostEntity hostEntity, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hostEntity.host;
        }
        if ((i2 & 2) != 0) {
            str2 = hostEntity.strategy;
        }
        if ((i2 & 4) != 0) {
            i = hostEntity.isDefault;
        }
        return hostEntity.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStrategy() {
        return this.strategy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsDefault() {
        return this.isDefault;
    }

    @NotNull
    public final HostEntity copy(@NotNull String host, @NotNull String strategy, int isDefault) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new HostEntity(host, strategy, isDefault);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostEntity)) {
            return false;
        }
        HostEntity hostEntity = (HostEntity) other;
        return Intrinsics.areEqual(this.host, hostEntity.host) && Intrinsics.areEqual(this.strategy, hostEntity.strategy) && this.isDefault == hostEntity.isDefault;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.strategy;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.isDefault;
    }

    public final int isDefault() {
        return this.isDefault;
    }

    @NotNull
    public String toString() {
        return "HostEntity(host=" + this.host + ", strategy=" + this.strategy + ", isDefault=" + this.isDefault + ")";
    }

    public HostEntity(@NotNull String host, @NotNull String strategy, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.host = host;
        this.strategy = strategy;
        this.isDefault = i;
    }

    public /* synthetic */ HostEntity(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
