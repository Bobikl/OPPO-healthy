package com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision;

import com.google.gson.annotations.SerializedName;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/Intent;", "", "intentId", "", "intentName", ParserTag.TAG_INTENT_TYPE, "intentScore", "", "intentChannel", "", "traceId", "", "services", "", "Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/Service;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIJLjava/util/List;)V", "getIntentChannel", "()I", "getIntentId", "()Ljava/lang/String;", "getIntentName", "getIntentScore", "()D", "getIntentType", "getServices", "()Ljava/util/List;", "getTraceId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Intent {

    @SerializedName("intent_channel")
    private final int intentChannel;

    @SerializedName("intent_id")
    @Nullable
    private final String intentId;

    @SerializedName("intent_name")
    @Nullable
    private final String intentName;

    @SerializedName("intent_score")
    private final double intentScore;

    @SerializedName("intent_type")
    @Nullable
    private final String intentType;

    @SerializedName("services")
    @Nullable
    private final List<Service> services;

    @SerializedName("trace_id")
    private final long traceId;

    public Intent() {
        this(null, null, null, 0.0d, 0, 0L, null, 127, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntentId() {
        return this.intentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIntentType() {
        return this.intentType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getIntentScore() {
        return this.intentScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIntentChannel() {
        return this.intentChannel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTraceId() {
        return this.traceId;
    }

    @Nullable
    public final List<Service> component7() {
        return this.services;
    }

    @NotNull
    public final Intent copy(@Nullable String intentId, @Nullable String intentName, @Nullable String intentType, double intentScore, int intentChannel, long traceId, @Nullable List<Service> services) {
        return new Intent(intentId, intentName, intentType, intentScore, intentChannel, traceId, services);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) other;
        return Intrinsics.areEqual(this.intentId, intent.intentId) && Intrinsics.areEqual(this.intentName, intent.intentName) && Intrinsics.areEqual(this.intentType, intent.intentType) && Intrinsics.areEqual((Object) Double.valueOf(this.intentScore), (Object) Double.valueOf(intent.intentScore)) && this.intentChannel == intent.intentChannel && this.traceId == intent.traceId && Intrinsics.areEqual(this.services, intent.services);
    }

    public final int getIntentChannel() {
        return this.intentChannel;
    }

    @Nullable
    public final String getIntentId() {
        return this.intentId;
    }

    @Nullable
    public final String getIntentName() {
        return this.intentName;
    }

    public final double getIntentScore() {
        return this.intentScore;
    }

    @Nullable
    public final String getIntentType() {
        return this.intentType;
    }

    @Nullable
    public final List<Service> getServices() {
        return this.services;
    }

    public final long getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        String str = this.intentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.intentName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.intentType;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.intentScore)) * 31) + Integer.hashCode(this.intentChannel)) * 31) + Long.hashCode(this.traceId)) * 31;
        List<Service> list = this.services;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Intent(intentId=" + ((Object) this.intentId) + ", intentName=" + ((Object) this.intentName) + ", intentType=" + ((Object) this.intentType) + ", intentScore=" + this.intentScore + ", intentChannel=" + this.intentChannel + ", traceId=" + this.traceId + ", services=" + this.services + ')';
    }

    public Intent(@Nullable String str, @Nullable String str2, @Nullable String str3, double d, int i, long j2, @Nullable List<Service> list) {
        this.intentId = str;
        this.intentName = str2;
        this.intentType = str3;
        this.intentScore = d;
        this.intentChannel = i;
        this.traceId = j2;
        this.services = list;
    }

    public /* synthetic */ Intent(String str, String str2, String str3, double d, int i, long j2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? 0L : j2, (i2 & 64) != 0 ? null : list);
    }
}
