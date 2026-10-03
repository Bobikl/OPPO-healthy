package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wx5, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\"\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b\u001d\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/wx5;", "", "", "key", "value", "", "f", "", "default", "a", MapSchema.FIELD_NAME_ENTRY, "toString", "", "hashCode", "other", "equals", "", "Ljava/util/Map;", "configs", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lcom/oplus/aiunit/vision/tx5;", "c", "Lcom/oplus/aiunit/vision/tx5;", "()Lcom/oplus/aiunit/vision/tx5;", "dnsIndex", "d", "url", "Z", "()Z", b2n.f, "(Z)V", "isHttpRetry", "<init>", "(Ljava/lang/String;Lcom/oplus/aiunit/vision/tx5;Ljava/lang/String;Z)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DnsRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Map<String, Object> configs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final DnsIndex dnsIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isHttpRetry;

    public DnsRequest(@NotNull String id, @NotNull DnsIndex dnsIndex, @NotNull String url, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(dnsIndex, "dnsIndex");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id;
        this.dnsIndex = dnsIndex;
        this.url = url;
        this.isHttpRetry = z;
        this.configs = new LinkedHashMap();
    }

    public final boolean a(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.configs.get(key);
        return (obj == null || !(obj instanceof Boolean)) ? z : ((Boolean) obj).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DnsIndex getDnsIndex() {
        return this.dnsIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsHttpRetry() {
        return this.isHttpRetry;
    }

    public final void e(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.configs.put(key, Boolean.valueOf(value));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnsRequest)) {
            return false;
        }
        DnsRequest dnsRequest = (DnsRequest) other;
        return Intrinsics.areEqual(this.id, dnsRequest.id) && Intrinsics.areEqual(this.dnsIndex, dnsRequest.dnsIndex) && Intrinsics.areEqual(this.url, dnsRequest.url) && this.isHttpRetry == dnsRequest.isHttpRetry;
    }

    public final void f(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.configs.put(key, value);
    }

    public final void g(boolean z) {
        this.isHttpRetry = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        DnsIndex dnsIndex = this.dnsIndex;
        int iHashCode2 = (iHashCode + (dnsIndex != null ? dnsIndex.hashCode() : 0)) * 31;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isHttpRetry;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode3 + r3;
    }

    @NotNull
    public String toString() {
        return "DnsRequest(id=" + this.id + ", dnsIndex=" + this.dnsIndex + ", url=" + this.url + ", isHttpRetry=" + this.isHttpRetry + ")";
    }

    public /* synthetic */ DnsRequest(String str, DnsIndex dnsIndex, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, dnsIndex, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }
}
