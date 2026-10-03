package com.oplus.utrace.hlog;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010+\u001a\u00020\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\b\u0010.\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/oplus/utrace/hlog/PushData;", "", "business", "", "traceId", "", "beginTime", "endTime", "useWifi", "", "tracePkg", "rawContent", "extras", "", "(Ljava/lang/String;JJJZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBeginTime", "()J", "getBusiness", "()Ljava/lang/String;", "getEndTime", "getExtras", "()Ljava/util/Map;", "reporter", "Lcom/oplus/utrace/hlog/IHLogReporter;", "getReporter", "()Lcom/oplus/utrace/hlog/IHLogReporter;", "setReporter", "(Lcom/oplus/utrace/hlog/IHLogReporter;)V", "getTraceId", "getTracePkg", "getUseWifi", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "getRawContent", "hashCode", "", "toString", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushData.kt\ncom/oplus/utrace/hlog/PushData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final /* data */ class PushData {
    private static final int HLOG_UPLOAD_MAX_SIZE = 10;

    @NotNull
    private static final String KEY_BEGINTIME = "beginTime";

    @NotNull
    private static final String KEY_BUSINESS = "business";

    @NotNull
    private static final String KEY_ENDTIME = "endTime";

    @NotNull
    private static final String KEY_EXTRAS = "extras";

    @NotNull
    private static final String KEY_FORCE = "force";

    @NotNull
    private static final String KEY_MAXLOGSIZE = "maxLogSize";

    @NotNull
    private static final String KEY_RAW_CONTENT = "rawContent";

    @NotNull
    private static final String KEY_TRACEID = "traceId";

    @NotNull
    private static final String KEY_TRACEPKG = "tracePkg";

    @NotNull
    private static final String KEY_USEWIFI = "useWifi";
    private final long beginTime;

    @NotNull
    private final String business;
    private final long endTime;

    @NotNull
    private final Map<String, Object> extras;

    @NotNull
    private final String rawContent;

    @Nullable
    private IHLogReporter reporter;
    private final long traceId;

    @NotNull
    private final String tracePkg;

    /* JADX INFO: renamed from: useWifi, reason: from kotlin metadata and from toString */
    private final boolean wifiOnly;

    public PushData() {
        this(null, 0L, 0L, 0L, false, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getRawContent() {
        return this.rawContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusiness() {
        return this.business;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBeginTime() {
        return this.beginTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWifiOnly() {
        return this.wifiOnly;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTracePkg() {
        return this.tracePkg;
    }

    @NotNull
    public final Map<String, Object> component8() {
        return this.extras;
    }

    @NotNull
    public final PushData copy(@NotNull String business, long traceId, long beginTime, long endTime, boolean useWifi, @NotNull String tracePkg, @NotNull String rawContent, @NotNull Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(business, "business");
        Intrinsics.checkNotNullParameter(tracePkg, "tracePkg");
        Intrinsics.checkNotNullParameter(rawContent, "rawContent");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new PushData(business, traceId, beginTime, endTime, useWifi, tracePkg, rawContent, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushData)) {
            return false;
        }
        PushData pushData = (PushData) other;
        return Intrinsics.areEqual(this.business, pushData.business) && this.traceId == pushData.traceId && this.beginTime == pushData.beginTime && this.endTime == pushData.endTime && this.wifiOnly == pushData.wifiOnly && Intrinsics.areEqual(this.tracePkg, pushData.tracePkg) && Intrinsics.areEqual(this.rawContent, pushData.rawContent) && Intrinsics.areEqual(this.extras, pushData.extras);
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    @NotNull
    public final String getBusiness() {
        return this.business;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getRawContent() throws JSONException {
        String str = this.rawContent;
        if (!(!StringsKt__StringsJVMKt.isBlank(str))) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceId", this.traceId);
        jSONObject.put("beginTime", this.beginTime);
        jSONObject.put("endTime", this.endTime);
        jSONObject.put("force", !this.wifiOnly ? 1 : 0);
        jSONObject.put("tracePkg", this.tracePkg);
        jSONObject.put("maxLogSize", 10);
        jSONObject.put("business", this.business);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …ess)\n        }.toString()");
        return string;
    }

    @Nullable
    public final IHLogReporter getReporter() {
        return this.reporter;
    }

    public final long getTraceId() {
        return this.traceId;
    }

    @NotNull
    public final String getTracePkg() {
        return this.tracePkg;
    }

    public final boolean getUseWifi() {
        return this.wifiOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.business.hashCode() * 31) + Long.hashCode(this.traceId)) * 31) + Long.hashCode(this.beginTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        boolean z = this.wifiOnly;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((iHashCode + r1) * 31) + this.tracePkg.hashCode()) * 31) + this.rawContent.hashCode()) * 31) + this.extras.hashCode();
    }

    public final void setReporter(@Nullable IHLogReporter iHLogReporter) {
        this.reporter = iHLogReporter;
    }

    @NotNull
    public String toString() {
        return "PushData(business=" + this.business + ", traceId=" + this.traceId + ", tracePkg=" + this.tracePkg + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", wifiOnly=" + this.wifiOnly + ')';
    }

    public PushData(@NotNull String business, long j2, long j3, long j4, boolean z, @NotNull String tracePkg, @NotNull String rawContent, @NotNull Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(business, "business");
        Intrinsics.checkNotNullParameter(tracePkg, "tracePkg");
        Intrinsics.checkNotNullParameter(rawContent, "rawContent");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.business = business;
        this.traceId = j2;
        this.beginTime = j3;
        this.endTime = j4;
        this.wifiOnly = z;
        this.tracePkg = tracePkg;
        this.rawContent = rawContent;
        this.extras = extras;
    }

    public /* synthetic */ PushData(String str, long j2, long j3, long j4, boolean z, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) == 0 ? j4 : 0L, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str2, (i & 64) == 0 ? str3 : "", (i & 128) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
