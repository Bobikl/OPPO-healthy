package com.oplus.pantanal.seedling.intelligent;

import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003JW\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00064"}, d2 = {"Lcom/oplus/pantanal/seedling/intelligent/IntelligentData;", "", "timestamp", "", TraceConstants.INTELLIGENT_DATA_EVENT_CODE, "", "event", "", "data", "Lorg/json/JSONObject;", "businessData", "seedlingCardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "serviceInstanceId", "(JILjava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;Ljava/lang/String;)V", "getBusinessData", "()Lorg/json/JSONObject;", "setBusinessData", "(Lorg/json/JSONObject;)V", "getData", "setData", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "getEventCode", "()I", "setEventCode", "(I)V", "getSeedlingCardOptions", "()Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "setSeedlingCardOptions", "(Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;)V", "getServiceInstanceId", "setServiceInstanceId", "getTimestamp", "()J", "setTimestamp", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IntelligentData {

    @Nullable
    private JSONObject businessData;

    @Nullable
    private JSONObject data;

    @NotNull
    private String event;
    private int eventCode;

    @Nullable
    private SeedlingCardOptions seedlingCardOptions;

    @Nullable
    private String serviceInstanceId;
    private long timestamp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntelligentData(long j, int i, @NotNull String str) {
        this(j, i, str, null, null, null, null, 120, null);
        Intrinsics.checkNotNullParameter(str, "event");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEventCode() {
        return this.eventCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JSONObject getBusinessData() {
        return this.businessData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SeedlingCardOptions getSeedlingCardOptions() {
        return this.seedlingCardOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    @NotNull
    public final IntelligentData copy(long timestamp, int eventCode, @NotNull String event, @Nullable JSONObject data, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions seedlingCardOptions, @Nullable String serviceInstanceId) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new IntelligentData(timestamp, eventCode, event, data, businessData, seedlingCardOptions, serviceInstanceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntelligentData)) {
            return false;
        }
        IntelligentData intelligentData = (IntelligentData) other;
        return this.timestamp == intelligentData.timestamp && this.eventCode == intelligentData.eventCode && Intrinsics.areEqual(this.event, intelligentData.event) && Intrinsics.areEqual(this.data, intelligentData.data) && Intrinsics.areEqual(this.businessData, intelligentData.businessData) && Intrinsics.areEqual(this.seedlingCardOptions, intelligentData.seedlingCardOptions) && Intrinsics.areEqual(this.serviceInstanceId, intelligentData.serviceInstanceId);
    }

    @Nullable
    public final JSONObject getBusinessData() {
        return this.businessData;
    }

    @Nullable
    public final JSONObject getData() {
        return this.data;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    public final int getEventCode() {
        return this.eventCode;
    }

    @Nullable
    public final SeedlingCardOptions getSeedlingCardOptions() {
        return this.seedlingCardOptions;
    }

    @Nullable
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.eventCode)) * 31) + this.event.hashCode()) * 31;
        JSONObject jSONObject = this.data;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONObject jSONObject2 = this.businessData;
        int iHashCode3 = (iHashCode2 + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        SeedlingCardOptions seedlingCardOptions = this.seedlingCardOptions;
        int iHashCode4 = (iHashCode3 + (seedlingCardOptions == null ? 0 : seedlingCardOptions.hashCode())) * 31;
        String str = this.serviceInstanceId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final void setBusinessData(@Nullable JSONObject jSONObject) {
        this.businessData = jSONObject;
    }

    public final void setData(@Nullable JSONObject jSONObject) {
        this.data = jSONObject;
    }

    public final void setEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event = str;
    }

    public final void setEventCode(int i) {
        this.eventCode = i;
    }

    public final void setSeedlingCardOptions(@Nullable SeedlingCardOptions seedlingCardOptions) {
        this.seedlingCardOptions = seedlingCardOptions;
    }

    public final void setServiceInstanceId(@Nullable String str) {
        this.serviceInstanceId = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "IntelligentData(timestamp=" + this.timestamp + ", eventCode=" + this.eventCode + ", event=" + this.event + ", data=" + this.data + ", businessData=" + this.businessData + ", seedlingCardOptions=" + this.seedlingCardOptions + ", serviceInstanceId=" + this.serviceInstanceId + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntelligentData(long j, int i, @NotNull String str, @Nullable JSONObject jSONObject) {
        this(j, i, str, jSONObject, null, null, null, 112, null);
        Intrinsics.checkNotNullParameter(str, "event");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntelligentData(long j, int i, @NotNull String str, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this(j, i, str, jSONObject, jSONObject2, null, null, 96, null);
        Intrinsics.checkNotNullParameter(str, "event");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntelligentData(long j, int i, @NotNull String str, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable SeedlingCardOptions seedlingCardOptions) {
        this(j, i, str, jSONObject, jSONObject2, seedlingCardOptions, null, 64, null);
        Intrinsics.checkNotNullParameter(str, "event");
    }

    @JvmOverloads
    public IntelligentData(long j, int i, @NotNull String str, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable SeedlingCardOptions seedlingCardOptions, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "event");
        this.timestamp = j;
        this.eventCode = i;
        this.event = str;
        this.data = jSONObject;
        this.businessData = jSONObject2;
        this.seedlingCardOptions = seedlingCardOptions;
        this.serviceInstanceId = str2;
    }

    public /* synthetic */ IntelligentData(long j, int i, String str, JSONObject jSONObject, JSONObject jSONObject2, SeedlingCardOptions seedlingCardOptions, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, (i2 & 8) != 0 ? null : jSONObject, (i2 & 16) != 0 ? null : jSONObject2, (i2 & 32) != 0 ? null : seedlingCardOptions, (i2 & 64) != 0 ? null : str2);
    }
}
