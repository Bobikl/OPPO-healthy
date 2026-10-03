package com.heytap.okhttp.extension.hubble.cloudconfig;

import com.heytap.nearx.cloudconfig.anotation.FieldIndex;
import com.oplus.aiunit.vision.zma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@zma
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/heytap/okhttp/extension/hubble/cloudconfig/HubbleConfigEntity;", "", "", "toString", "", "hashCode", "other", "", "equals", "dbCacheMinSize", "Ljava/lang/String;", "getDbCacheMinSize", "()Ljava/lang/String;", "reportInterval", "getReportInterval", "dnsDelay", "getDnsDelay", "connectDelay", "a", "headerDelay", "getHeaderDelay", "bandWidth", "getBandWidth", "timeSlice", "getTimeSlice", "isOpen", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HubbleConfigEntity {

    @FieldIndex(index = 6)
    @NotNull
    private final String bandWidth;

    @FieldIndex(index = 4)
    @NotNull
    private final String connectDelay;

    @FieldIndex(index = 1)
    @NotNull
    private final String dbCacheMinSize;

    @FieldIndex(index = 3)
    @NotNull
    private final String dnsDelay;

    @FieldIndex(index = 5)
    @NotNull
    private final String headerDelay;

    @FieldIndex(index = 8)
    @NotNull
    private final String isOpen;

    @FieldIndex(index = 2)
    @NotNull
    private final String reportInterval;

    @FieldIndex(index = 7)
    @NotNull
    private final String timeSlice;

    public HubbleConfigEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConnectDelay() {
        return this.connectDelay;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIsOpen() {
        return this.isOpen;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubbleConfigEntity)) {
            return false;
        }
        HubbleConfigEntity hubbleConfigEntity = (HubbleConfigEntity) other;
        return Intrinsics.areEqual(this.dbCacheMinSize, hubbleConfigEntity.dbCacheMinSize) && Intrinsics.areEqual(this.reportInterval, hubbleConfigEntity.reportInterval) && Intrinsics.areEqual(this.dnsDelay, hubbleConfigEntity.dnsDelay) && Intrinsics.areEqual(this.connectDelay, hubbleConfigEntity.connectDelay) && Intrinsics.areEqual(this.headerDelay, hubbleConfigEntity.headerDelay) && Intrinsics.areEqual(this.bandWidth, hubbleConfigEntity.bandWidth) && Intrinsics.areEqual(this.timeSlice, hubbleConfigEntity.timeSlice) && Intrinsics.areEqual(this.isOpen, hubbleConfigEntity.isOpen);
    }

    public int hashCode() {
        String str = this.dbCacheMinSize;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.reportInterval;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.dnsDelay;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.connectDelay;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.headerDelay;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.bandWidth;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.timeSlice;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.isOpen;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HubbleConfigEntity(dbCacheMinSize=" + this.dbCacheMinSize + ", reportInterval=" + this.reportInterval + ", dnsDelay=" + this.dnsDelay + ", connectDelay=" + this.connectDelay + ", headerDelay=" + this.headerDelay + ", bandWidth=" + this.bandWidth + ", timeSlice=" + this.timeSlice + ", isOpen=" + this.isOpen + ")";
    }

    public HubbleConfigEntity(@NotNull String dbCacheMinSize, @NotNull String reportInterval, @NotNull String dnsDelay, @NotNull String connectDelay, @NotNull String headerDelay, @NotNull String bandWidth, @NotNull String timeSlice, @NotNull String isOpen) {
        Intrinsics.checkNotNullParameter(dbCacheMinSize, "dbCacheMinSize");
        Intrinsics.checkNotNullParameter(reportInterval, "reportInterval");
        Intrinsics.checkNotNullParameter(dnsDelay, "dnsDelay");
        Intrinsics.checkNotNullParameter(connectDelay, "connectDelay");
        Intrinsics.checkNotNullParameter(headerDelay, "headerDelay");
        Intrinsics.checkNotNullParameter(bandWidth, "bandWidth");
        Intrinsics.checkNotNullParameter(timeSlice, "timeSlice");
        Intrinsics.checkNotNullParameter(isOpen, "isOpen");
        this.dbCacheMinSize = dbCacheMinSize;
        this.reportInterval = reportInterval;
        this.dnsDelay = dnsDelay;
        this.connectDelay = connectDelay;
        this.headerDelay = headerDelay;
        this.bandWidth = bandWidth;
        this.timeSlice = timeSlice;
        this.isOpen = isOpen;
    }

    public /* synthetic */ HubbleConfigEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8);
    }
}
