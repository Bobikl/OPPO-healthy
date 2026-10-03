package com.heytap.nearx.cloudconfig;

import com.heytap.nearx.cloudconfig.anotation.FieldIndex;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/heytap/nearx/cloudconfig/AreaHostEntity;", "", "countryCode", "", "host", DebugModeEntity.KEY_AREA, "state", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "tag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getArea", "()Ljava/lang/String;", "getCountryCode", "getHost", "getState", "()I", "setState", "(I)V", "getTag", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "cloudconfig-area_release"}, k = 1, mv = {1, 1, 16})
public final /* data */ class AreaHostEntity {

    @FieldIndex(index = 3)
    @NotNull
    private final String area;

    @FieldIndex(index = 2)
    @Nullable
    private final String countryCode;

    @FieldIndex(index = 1)
    @NotNull
    private final String host;
    private int state;

    @FieldIndex(index = 4)
    @NotNull
    private final String tag;

    public AreaHostEntity() {
        this(null, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ AreaHostEntity copy$default(AreaHostEntity areaHostEntity, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = areaHostEntity.countryCode;
        }
        if ((i2 & 2) != 0) {
            str2 = areaHostEntity.host;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = areaHostEntity.area;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = areaHostEntity.tag;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = areaHostEntity.state;
        }
        return areaHostEntity.copy(str, str5, str6, str7, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArea() {
        return this.area;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final AreaHostEntity copy(@Nullable String countryCode, @NotNull String host, @NotNull String area, @NotNull String tag, int state) {
        Intrinsics.checkParameterIsNotNull(host, "host");
        Intrinsics.checkParameterIsNotNull(area, "area");
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        return new AreaHostEntity(countryCode, host, area, tag, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AreaHostEntity)) {
            return false;
        }
        AreaHostEntity areaHostEntity = (AreaHostEntity) other;
        return Intrinsics.areEqual(this.countryCode, areaHostEntity.countryCode) && Intrinsics.areEqual(this.host, areaHostEntity.host) && Intrinsics.areEqual(this.area, areaHostEntity.area) && Intrinsics.areEqual(this.tag, areaHostEntity.tag) && this.state == areaHostEntity.state;
    }

    @NotNull
    public final String getArea() {
        return this.area;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.countryCode;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.host;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.area;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tag;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @NotNull
    public String toString() {
        return "AreaHostEntity(countryCode=" + this.countryCode + ", host=" + this.host + ", area=" + this.area + ", tag=" + this.tag + ", state=" + this.state + ")";
    }

    public AreaHostEntity(@Nullable String str, @NotNull String host, @NotNull String area, @NotNull String tag, int i) {
        Intrinsics.checkParameterIsNotNull(host, "host");
        Intrinsics.checkParameterIsNotNull(area, "area");
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        this.countryCode = str;
        this.host = host;
        this.area = area;
        this.tag = tag;
        this.state = i;
    }

    public /* synthetic */ AreaHostEntity(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AreaHostEntity(@Nullable String str, @NotNull String host, @NotNull String area, int i) {
        this(str, host, area, "", i);
        Intrinsics.checkParameterIsNotNull(host, "host");
        Intrinsics.checkParameterIsNotNull(area, "area");
    }

    public /* synthetic */ AreaHostEntity(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
