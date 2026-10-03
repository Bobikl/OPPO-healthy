package com.oplus.aiunit.vision;

import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.tx5, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012(\b\u0002\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR7\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\u001b¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/tx5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "host", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "port", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "getTags", "()Ljava/util/HashMap;", UTraceSQLiteHelperKt.COL_TAGS, "d", "getDnUnit", "setDnUnit", "(Ljava/lang/String;)V", "dnUnit", MapSchema.FIELD_NAME_ENTRY, "getCarrier", "setCarrier", "carrier", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DnsIndex {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer port;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final HashMap<String, String> tags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public String dnUnit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String carrier;

    public DnsIndex(@NotNull String host, @Nullable Integer num, @Nullable HashMap<String, String> map, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.port = num;
        this.tags = map;
        this.dnUnit = str;
        this.carrier = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnsIndex)) {
            return false;
        }
        DnsIndex dnsIndex = (DnsIndex) other;
        return Intrinsics.areEqual(this.host, dnsIndex.host) && Intrinsics.areEqual(this.port, dnsIndex.port) && Intrinsics.areEqual(this.tags, dnsIndex.tags) && Intrinsics.areEqual(this.dnUnit, dnsIndex.dnUnit) && Intrinsics.areEqual(this.carrier, dnsIndex.carrier);
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.port;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        HashMap<String, String> map = this.tags;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.dnUnit;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.carrier;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DnsIndex(host=" + this.host + ", port=" + this.port + ", tags=" + this.tags + ", dnUnit=" + this.dnUnit + ", carrier=" + this.carrier + ")";
    }

    public /* synthetic */ DnsIndex(String str, Integer num, HashMap map, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
