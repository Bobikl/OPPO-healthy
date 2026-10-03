package com.oplus.nearx.track.internal.storage.db.common.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@s15(tableName = "app_config")
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006%"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "", "", "component1", "component2", "", "component3", "component4", "_id", "appId", "channel", "customHead", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "get_id", "()J", "set_id", "(J)V", "getAppId", "setAppId", "Ljava/lang/String;", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", "getCustomHead", "setCustomHead", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AppConfig {

    @NotNull
    public static final String APP_ID = "app_id";

    @NotNull
    public static final String CHANNEL = "channel";

    @NotNull
    public static final String CUSTOM_HEAD = "custom_head";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "_id";
    private long _id;

    @t15
    private long appId;

    @t15
    @NotNull
    private String channel;

    @t15
    @NotNull
    private String customHead;

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.storage.db.common.entity.AppConfig$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig$a;", "", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "config", "Lorg/json/JSONObject;", "b", "", "jsonString", "a", "APP_ID", "Ljava/lang/String;", "CHANNEL", "CUSTOM_HEAD", alf.ID, "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AppConfig a(@NotNull String jsonString) {
            Object objM5287constructorimpl;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            try {
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject(jsonString);
                long jOptLong = jSONObject.optLong("_id");
                long jOptLong2 = jSONObject.optLong("appId");
                String strOptString = jSONObject.optString("channel");
                Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(AppConfig::channel.name)");
                String strOptString2 = jSONObject.optString("customHead");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObj.optString(AppConfig::customHead.name)");
                objM5287constructorimpl = Result.m5287constructorimpl(new AppConfig(jOptLong, jOptLong2, strOptString, strOptString2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
                objM5287constructorimpl = null;
            }
            return (AppConfig) objM5287constructorimpl;
        }

        @NotNull
        public final JSONObject b(@NotNull AppConfig config) throws JSONException {
            Intrinsics.checkNotNullParameter(config, "config");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_id", config.get_id());
            jSONObject.put("appId", config.getAppId());
            jSONObject.put("channel", config.getChannel());
            jSONObject.put("customHead", config.getCustomHead());
            return jSONObject;
        }
    }

    public AppConfig() {
        this(0L, 0L, null, null, 15, null);
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, long j2, long j3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = appConfig._id;
        }
        long j4 = j2;
        if ((i & 2) != 0) {
            j3 = appConfig.appId;
        }
        long j5 = j3;
        if ((i & 4) != 0) {
            str = appConfig.channel;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = appConfig.customHead;
        }
        return appConfig.copy(j4, j5, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomHead() {
        return this.customHead;
    }

    @NotNull
    public final AppConfig copy(long _id, long appId, @NotNull String channel, @NotNull String customHead) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(customHead, "customHead");
        return new AppConfig(_id, appId, channel, customHead);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        return this._id == appConfig._id && this.appId == appConfig.appId && Intrinsics.areEqual(this.channel, appConfig.channel) && Intrinsics.areEqual(this.customHead, appConfig.customHead);
    }

    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getCustomHead() {
        return this.customHead;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        return (((((Long.hashCode(this._id) * 31) + Long.hashCode(this.appId)) * 31) + this.channel.hashCode()) * 31) + this.customHead.hashCode();
    }

    public final void setAppId(long j2) {
        this.appId = j2;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setCustomHead(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customHead = str;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "AppConfig(_id=" + this._id + ", appId=" + this.appId + ", channel=" + this.channel + ", customHead=" + this.customHead + ')';
    }

    public AppConfig(long j2, long j3, @NotNull String channel, @NotNull String customHead) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(customHead, "customHead");
        this._id = j2;
        this.appId = j3;
        this.channel = channel;
        this.customHead = customHead;
    }

    public /* synthetic */ AppConfig(long j2, long j3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? -1L : j3, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
