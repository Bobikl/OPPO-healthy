package com.oplus.pantanal.seedling.bean;

import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00172\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "", "timestamp", "", "action", "", "flag", "Lcom/oplus/pantanal/seedling/bean/SeedlingIntentFlagEnum;", "data", "Lorg/json/JSONObject;", "options", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "(JLjava/lang/String;Lcom/oplus/pantanal/seedling/bean/SeedlingIntentFlagEnum;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;)V", "getAction", "()Ljava/lang/String;", "getCardOptions", "()Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "getData", "()Lorg/json/JSONObject;", "getFlag", "()Lcom/oplus/pantanal/seedling/bean/SeedlingIntentFlagEnum;", Constants.IS_SUPPORT_MULTI_INSTANCE, "", "()Z", "setSupportMultiInstance", "(Z)V", "getOptions", "serviceInstanceId", "getServiceInstanceId", "setServiceInstanceId", "(Ljava/lang/String;)V", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeedlingIntent {

    @NotNull
    private final String action;

    @Nullable
    private final SeedlingCardOptions cardOptions;

    @Nullable
    private final JSONObject data;

    @NotNull
    private final SeedlingIntentFlagEnum flag;
    private boolean isSupportMultiInstance;

    @Nullable
    private final JSONObject options;

    @NotNull
    private String serviceInstanceId;
    private final long timestamp;

    public SeedlingIntent(long j2, @NotNull String action, @NotNull SeedlingIntentFlagEnum flag, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable SeedlingCardOptions seedlingCardOptions) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.timestamp = j2;
        this.action = action;
        this.flag = flag;
        this.data = jSONObject;
        this.options = jSONObject2;
        this.cardOptions = seedlingCardOptions;
        this.serviceInstanceId = "";
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SeedlingIntentFlagEnum getFlag() {
        return this.flag;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JSONObject getOptions() {
        return this.options;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SeedlingCardOptions getCardOptions() {
        return this.cardOptions;
    }

    @NotNull
    public final SeedlingIntent copy(long timestamp, @NotNull String action, @NotNull SeedlingIntentFlagEnum flag, @Nullable JSONObject data, @Nullable JSONObject options, @Nullable SeedlingCardOptions cardOptions) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new SeedlingIntent(timestamp, action, flag, data, options, cardOptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingIntent)) {
            return false;
        }
        SeedlingIntent seedlingIntent = (SeedlingIntent) other;
        return this.timestamp == seedlingIntent.timestamp && Intrinsics.areEqual(this.action, seedlingIntent.action) && this.flag == seedlingIntent.flag && Intrinsics.areEqual(this.data, seedlingIntent.data) && Intrinsics.areEqual(this.options, seedlingIntent.options) && Intrinsics.areEqual(this.cardOptions, seedlingIntent.cardOptions);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final SeedlingCardOptions getCardOptions() {
        return this.cardOptions;
    }

    @Nullable
    public final JSONObject getData() {
        return this.data;
    }

    @NotNull
    public final SeedlingIntentFlagEnum getFlag() {
        return this.flag;
    }

    @Nullable
    public final JSONObject getOptions() {
        return this.options;
    }

    @NotNull
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.timestamp) * 31) + this.action.hashCode()) * 31) + this.flag.hashCode()) * 31;
        JSONObject jSONObject = this.data;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONObject jSONObject2 = this.options;
        int iHashCode3 = (iHashCode2 + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        SeedlingCardOptions seedlingCardOptions = this.cardOptions;
        return iHashCode3 + (seedlingCardOptions != null ? seedlingCardOptions.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isSupportMultiInstance, reason: from getter */
    public final boolean getIsSupportMultiInstance() {
        return this.isSupportMultiInstance;
    }

    public final void setServiceInstanceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceInstanceId = str;
    }

    public final void setSupportMultiInstance(boolean z) {
        this.isSupportMultiInstance = z;
    }

    @NotNull
    public String toString() {
        return "SeedlingIntent(timestamp=" + this.timestamp + ", action=" + this.action + ", flag=" + this.flag + ", data=" + this.data + ", options=" + this.options + ", cardOptions=" + this.cardOptions + ")";
    }

    public /* synthetic */ SeedlingIntent(long j2, String str, SeedlingIntentFlagEnum seedlingIntentFlagEnum, JSONObject jSONObject, JSONObject jSONObject2, SeedlingCardOptions seedlingCardOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j2, str, (i & 4) != 0 ? SeedlingIntentFlagEnum.START : seedlingIntentFlagEnum, (i & 8) != 0 ? null : jSONObject, (i & 16) != 0 ? null : jSONObject2, (i & 32) != 0 ? null : seedlingCardOptions);
    }
}
