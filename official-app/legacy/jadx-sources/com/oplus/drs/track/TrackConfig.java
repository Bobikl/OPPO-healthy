package com.oplus.drs.track;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.zz4;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/oplus/drs/track/TrackConfig;", "", "Lorg/json/JSONObject;", "customHead", "Lorg/json/JSONObject;", "getCustomHead", "()Lorg/json/JSONObject;", "", "channel", "Ljava/lang/String;", "getChannel", "()Ljava/lang/String;", "Lkotlin/Pair;", "keyAndSecret", "Lkotlin/Pair;", "getKeyAndSecret", "()Lkotlin/Pair;", "", "maxCacheSize", "J", "getMaxCacheSize", "()J", "Lcom/oplus/drs/track/TrackConfig$Builder;", "builder", "<init>", "(Lcom/oplus/drs/track/TrackConfig$Builder;)V", "Companion", "Builder", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class TrackConfig {
    public static final long CACHE_SIZE_MAX = 536870912;
    public static final long CACHE_SIZE_MIN = 16777216;

    @NotNull
    private final String channel;

    @NotNull
    private final JSONObject customHead;

    @NotNull
    private final Pair<String, String> keyAndSecret;
    private final long maxCacheSize;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/oplus/drs/track/TrackConfig$Builder;", "", "Lorg/json/JSONObject;", "customHead", "setCustomHead", "", "channel", "setChannel", "", "maxCacheSize", "setMaxCacheSize", "Lcom/oplus/drs/track/TrackConfig;", jla.DEFAULT_BUILD_METHOD, "a", "Lorg/json/JSONObject;", "getCustomHead$obus_sdk_release", "()Lorg/json/JSONObject;", "setCustomHead$obus_sdk_release", "(Lorg/json/JSONObject;)V", "b", "Ljava/lang/String;", "getChannel$obus_sdk_release", "()Ljava/lang/String;", "setChannel$obus_sdk_release", "(Ljava/lang/String;)V", "Lkotlin/Pair;", "c", "Lkotlin/Pair;", "getKeyAndSecret$obus_sdk_release", "()Lkotlin/Pair;", "setKeyAndSecret$obus_sdk_release", "(Lkotlin/Pair;)V", "keyAndSecret", "d", "J", "getMaxCacheSize$obus_sdk_release", "()J", "setMaxCacheSize$obus_sdk_release", "(J)V", HttpConst.APP_KEY, f04.JSON_KEY_APP_SECRET, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public JSONObject customHead;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String channel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Pair<String, String> keyAndSecret;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long maxCacheSize;

        public Builder(@NotNull String appKey, @NotNull String appSecret) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            Intrinsics.checkNotNullParameter(appSecret, "appSecret");
            this.customHead = new JSONObject();
            this.channel = "";
            this.keyAndSecret = new Pair<>("", "");
            this.maxCacheSize = zz4.JOURNAL_SIZE_LIMIT_LOW;
            if (TextUtils.isEmpty(appKey)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s can't be empty", Arrays.copyOf(new Object[]{HttpConst.APP_KEY}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new IllegalArgumentException(str);
            }
            if (!TextUtils.isEmpty(appSecret)) {
                this.keyAndSecret = new Pair<>(appKey, appSecret);
                return;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s can't be empty", Arrays.copyOf(new Object[]{f04.JSON_KEY_APP_SECRET}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            throw new IllegalArgumentException(str2);
        }

        @NotNull
        public final TrackConfig build() {
            return new TrackConfig(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: getChannel$obus_sdk_release, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        @NotNull
        /* JADX INFO: renamed from: getCustomHead$obus_sdk_release, reason: from getter */
        public final JSONObject getCustomHead() {
            return this.customHead;
        }

        @NotNull
        public final Pair<String, String> getKeyAndSecret$obus_sdk_release() {
            return this.keyAndSecret;
        }

        /* JADX INFO: renamed from: getMaxCacheSize$obus_sdk_release, reason: from getter */
        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        @NotNull
        public final Builder setChannel(@NotNull String channel) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.channel = channel;
            return this;
        }

        public final void setChannel$obus_sdk_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.channel = str;
        }

        @Deprecated(message = "")
        @NotNull
        public final Builder setCustomHead(@NotNull JSONObject customHead) {
            Intrinsics.checkNotNullParameter(customHead, "customHead");
            this.customHead = customHead;
            return this;
        }

        public final void setCustomHead$obus_sdk_release(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
            this.customHead = jSONObject;
        }

        public final void setKeyAndSecret$obus_sdk_release(@NotNull Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<set-?>");
            this.keyAndSecret = pair;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0007 A[PHI: r0
  0x0007: PHI (r0v2 long) = (r0v0 long), (r0v1 long) binds: [B:3:0x0005, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
        @NotNull
        public final Builder setMaxCacheSize(long maxCacheSize) {
            long j2 = 16777216;
            if (maxCacheSize < 16777216) {
                maxCacheSize = j2;
            } else {
                j2 = 536870912;
                if (maxCacheSize > 536870912) {
                    maxCacheSize = j2;
                }
            }
            this.maxCacheSize = maxCacheSize;
            return this;
        }

        public final void setMaxCacheSize$obus_sdk_release(long j2) {
            this.maxCacheSize = j2;
        }
    }

    public /* synthetic */ TrackConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final JSONObject getCustomHead() {
        return this.customHead;
    }

    @NotNull
    public final Pair<String, String> getKeyAndSecret() {
        return this.keyAndSecret;
    }

    public final long getMaxCacheSize() {
        return this.maxCacheSize;
    }

    private TrackConfig(Builder builder) {
        this.customHead = builder.getCustomHead();
        this.channel = builder.getChannel();
        this.keyAndSecret = builder.getKeyAndSecret$obus_sdk_release();
        this.maxCacheSize = builder.getMaxCacheSize();
    }
}
