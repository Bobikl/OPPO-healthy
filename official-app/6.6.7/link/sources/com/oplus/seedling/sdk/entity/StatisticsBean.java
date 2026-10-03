package com.oplus.seedling.sdk.entity;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.oplus.channel.server.utils.LogUtil;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003Jn\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\bHÖ\u0001J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, d2 = {"Lcom/oplus/seedling/sdk/entity/StatisticsBean;", "", "exposeId", "", "serviceId", "timestamp", "", "eventCode", "", StatisticsBean.KEY_CARD_TYPE, "exposeDuration", StatisticsBean.KEY_FINAL_RANK, "extras", "Landroid/util/ArrayMap;", "(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Long;ILandroid/util/ArrayMap;)V", "getCardType", "()I", "getEventCode", "getExposeDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExposeId", "()Ljava/lang/String;", "getExtras", "()Landroid/util/ArrayMap;", "getFinalRank", "getServiceId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Long;ILandroid/util/ArrayMap;)Lcom/oplus/seedling/sdk/entity/StatisticsBean;", "equals", "", "other", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", StatisticsBean.KEY_ENTRY_TYPE, "toString", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StatisticsBean {

    @NotNull
    private static final String KEY_CARD_TYPE = "cardType";

    @NotNull
    private static final String KEY_ENTRY_TYPE = "entryType";

    @NotNull
    private static final String KEY_EVENT_CODE = "eventCode";

    @NotNull
    private static final String KEY_EXPOSE_ID = "exposeID";

    @NotNull
    private static final String KEY_EXPOSURE_DURATION = "exposureTime";

    @NotNull
    private static final String KEY_EXTRAS = "extras";

    @NotNull
    private static final String KEY_FINAL_RANK = "finalRank";

    @NotNull
    private static final String KEY_SERVICE_ID = "serviceId";

    @NotNull
    private static final String KEY_TIMESTAMP = "timeStamp";

    @NotNull
    private static final String TAG = "StatisticsBean";
    private final int cardType;
    private final int eventCode;

    @Nullable
    private final Long exposeDuration;

    @NotNull
    private final String exposeId;

    @Nullable
    private final ArrayMap<String, Object> extras;
    private final int finalRank;

    @NotNull
    private final String serviceId;
    private final long timestamp;

    public StatisticsBean(@NotNull String str, @NotNull String str2, long j, int i, int i2, @Nullable Long l, int i3, @Nullable ArrayMap<String, Object> arrayMap) {
        Intrinsics.checkNotNullParameter(str, "exposeId");
        Intrinsics.checkNotNullParameter(str2, "serviceId");
        this.exposeId = str;
        this.serviceId = str2;
        this.timestamp = j;
        this.eventCode = i;
        this.cardType = i2;
        this.exposeDuration = l;
        this.finalRank = i3;
        this.extras = arrayMap;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExposeId() {
        return this.exposeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEventCode() {
        return this.eventCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getExposeDuration() {
        return this.exposeDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFinalRank() {
        return this.finalRank;
    }

    @Nullable
    public final ArrayMap<String, Object> component8() {
        return this.extras;
    }

    @NotNull
    public final StatisticsBean copy(@NotNull String exposeId, @NotNull String serviceId, long timestamp, int eventCode, int cardType, @Nullable Long exposeDuration, int finalRank, @Nullable ArrayMap<String, Object> extras) {
        Intrinsics.checkNotNullParameter(exposeId, "exposeId");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        return new StatisticsBean(exposeId, serviceId, timestamp, eventCode, cardType, exposeDuration, finalRank, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsBean)) {
            return false;
        }
        StatisticsBean statisticsBean = (StatisticsBean) other;
        return Intrinsics.areEqual(this.exposeId, statisticsBean.exposeId) && Intrinsics.areEqual(this.serviceId, statisticsBean.serviceId) && this.timestamp == statisticsBean.timestamp && this.eventCode == statisticsBean.eventCode && this.cardType == statisticsBean.cardType && Intrinsics.areEqual(this.exposeDuration, statisticsBean.exposeDuration) && this.finalRank == statisticsBean.finalRank && Intrinsics.areEqual(this.extras, statisticsBean.extras);
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final int getEventCode() {
        return this.eventCode;
    }

    @Nullable
    public final Long getExposeDuration() {
        return this.exposeDuration;
    }

    @NotNull
    public final String getExposeId() {
        return this.exposeId;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    public final int getFinalRank() {
        return this.finalRank;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.exposeId.hashCode() * 31) + this.serviceId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.eventCode)) * 31) + Integer.hashCode(this.cardType)) * 31;
        Long l = this.exposeDuration;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.finalRank)) * 31;
        ArrayMap<String, Object> arrayMap = this.extras;
        return iHashCode2 + (arrayMap != null ? arrayMap.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJSONObject(long entryType) throws JSONException {
        Object obj;
        JSONObject jSONObjectPut;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_EXPOSE_ID, this.exposeId);
        jSONObject.put(KEY_TIMESTAMP, this.timestamp);
        jSONObject.put("serviceId", this.serviceId);
        jSONObject.put("eventCode", this.eventCode);
        jSONObject.put(KEY_CARD_TYPE, this.cardType);
        jSONObject.put(KEY_EXPOSURE_DURATION, this.exposeDuration);
        jSONObject.put(KEY_FINAL_RANK, this.finalRank);
        jSONObject.put(KEY_ENTRY_TYPE, entryType);
        try {
            Result.Companion companion = Result.Companion;
            ArrayMap<String, Object> arrayMap = this.extras;
            if (arrayMap != null) {
                String string = new JSONObject(arrayMap).toString();
                Intrinsics.checkNotNullExpressionValue(string, "JSONObject(it).toString()");
                jSONObjectPut = jSONObject.put("extras", string);
            } else {
                jSONObjectPut = null;
            }
            obj = Result.constructor-impl(jSONObjectPut);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            LogUtil.e(TAG, "toJSONObject error:" + th2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "StatisticsBean(exposeId=" + this.exposeId + ", serviceId=" + this.serviceId + ", timestamp=" + this.timestamp + ", eventCode=" + this.eventCode + ", cardType=" + this.cardType + ", exposeDuration=" + this.exposeDuration + ", finalRank=" + this.finalRank + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ StatisticsBean(String str, String str2, long j, int i, int i2, Long l, int i3, ArrayMap arrayMap, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, i, i2, l, i3, (i4 & 128) != 0 ? null : arrayMap);
    }
}
