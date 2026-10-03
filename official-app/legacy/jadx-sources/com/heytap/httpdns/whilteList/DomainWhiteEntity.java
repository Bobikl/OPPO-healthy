package com.heytap.httpdns.whilteList;

import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@s15(addedVersion = 1, tableName = DomainWhiteEntity.TABLE_NAME)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/heytap/httpdns/whilteList/DomainWhiteEntity;", "", "", "component1", "", "component2", "host", "_id", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "J", "get_id", "()J", "set_id", "(J)V", "<init>", "(Ljava/lang/String;J)V", "Companion", "a", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DomainWhiteEntity {

    @NotNull
    public static final String TABLE_NAME = "dn_list";
    private long _id;

    @t15(dbColumnName = "host")
    @NotNull
    private String host;

    public DomainWhiteEntity() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ DomainWhiteEntity copy$default(DomainWhiteEntity domainWhiteEntity, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainWhiteEntity.host;
        }
        if ((i & 2) != 0) {
            j2 = domainWhiteEntity._id;
        }
        return domainWhiteEntity.copy(str, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    @NotNull
    public final DomainWhiteEntity copy(@NotNull String host, long _id) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new DomainWhiteEntity(host, _id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainWhiteEntity)) {
            return false;
        }
        DomainWhiteEntity domainWhiteEntity = (DomainWhiteEntity) other;
        return Intrinsics.areEqual(this.host, domainWhiteEntity.host) && this._id == domainWhiteEntity._id;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j2 = this._id;
        return (iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "DomainWhiteEntity(host=" + this.host + ", _id=" + this._id + ")";
    }

    public DomainWhiteEntity(@NotNull String host, long j2) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this._id = j2;
    }

    public /* synthetic */ DomainWhiteEntity(String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j2);
    }
}
