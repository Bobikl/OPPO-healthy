package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.g7k, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0002\t\u000fBg\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u001c\u0010\f¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/g7k;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", b2n.f, "()Ljava/lang/String;", "url", "", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "d", "params", "configs", "", MapSchema.FIELD_NAME_ENTRY, "[B", "()[B", "body", "f", "requestMethod", "sign", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;[BLjava/lang/String;Ljava/lang/String;)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TrackRequest {

    @NotNull
    public static final String CONNECT_TIME_OUT = "CONNECT_TIME_OUT";

    @NotNull
    public static final String METHOD_GET = "GET";

    @NotNull
    public static final String METHOD_POST = "POST";

    @NotNull
    public static final String READ_TIME_OUT = "READ_TIME_OUT";

    @NotNull
    public static final String WRITE_TIME_OUT = "WRITE_TIME_OUT";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> params;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, Object> configs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final byte[] body;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String requestMethod;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String sign;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.g7k$a */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005J\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bJ\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0005R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/g7k$a;", "", "", "value", "d", "", "key", "b", "", "params", "c", "a", "f", "", "connectTime", "readTimeout", "writeTimeOut", b2n.f, "i", "url", "Lcom/oplus/aiunit/vision/g7k;", MapSchema.FIELD_NAME_ENTRY, "", "Ljava/util/Map;", "getHeader$core_statistics_release", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "getParams$core_statistics_release", "getConfigs$core_statistics_release", "configs", "[B", "getBody$core_statistics_release", "()[B", "setBody$core_statistics_release", "([B)V", "body", "Ljava/lang/String;", "getRequestMethod$core_statistics_release", "()Ljava/lang/String;", "setRequestMethod$core_statistics_release", "(Ljava/lang/String;)V", "requestMethod", "getSign$core_statistics_release", "setSign$core_statistics_release", "sign", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public byte[] body;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public String sign;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> header = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> params = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Object> configs = new LinkedHashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String requestMethod = "POST";

        public static /* synthetic */ a h(a aVar, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = 5000;
            }
            if ((i4 & 2) != 0) {
                i2 = 5000;
            }
            if ((i4 & 4) != 0) {
                i3 = 5000;
            }
            return aVar.g(i, i2, i3);
        }

        @NotNull
        public final a a(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.configs.put(key, value);
            return this;
        }

        @NotNull
        public final a b(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.header.put(key, value);
            return this;
        }

        @NotNull
        public final a c(@NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.params.putAll(params);
            return this;
        }

        @NotNull
        public final a d(@NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.body = value;
            return this;
        }

        @NotNull
        public final TrackRequest e(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new TrackRequest(url, this.header, this.params, this.configs, this.body, this.requestMethod, this.sign);
        }

        @NotNull
        public final a f(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(value, "POST") && !Intrinsics.areEqual(value, "GET")) {
                throw new IllegalArgumentException("You should set requestMethod 'POST' or 'GET'");
            }
            this.requestMethod = value;
            return this;
        }

        @NotNull
        public final a g(int connectTime, int readTimeout, int writeTimeOut) {
            if (connectTime > 0) {
                this.configs.put(TrackRequest.CONNECT_TIME_OUT, Integer.valueOf(connectTime));
            }
            if (readTimeout > 0) {
                this.configs.put(TrackRequest.READ_TIME_OUT, Integer.valueOf(readTimeout));
            }
            if (writeTimeOut > 0) {
                this.configs.put(TrackRequest.WRITE_TIME_OUT, Integer.valueOf(writeTimeOut));
            }
            return this;
        }

        @NotNull
        public final a i(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.sign = value;
            return this;
        }
    }

    public TrackRequest(@NotNull String url, @NotNull Map<String, String> header, @NotNull Map<String, String> params, @NotNull Map<String, Object> configs, @Nullable byte[] bArr, @NotNull String requestMethod, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        this.url = url;
        this.header = header;
        this.params = params;
        this.configs = configs;
        this.body = bArr;
        this.requestMethod = requestMethod;
        this.sign = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.configs;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.header;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.params;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRequestMethod() {
        return this.requestMethod;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackRequest)) {
            return false;
        }
        TrackRequest trackRequest = (TrackRequest) other;
        return Intrinsics.areEqual(this.url, trackRequest.url) && Intrinsics.areEqual(this.header, trackRequest.header) && Intrinsics.areEqual(this.params, trackRequest.params) && Intrinsics.areEqual(this.configs, trackRequest.configs) && Intrinsics.areEqual(this.body, trackRequest.body) && Intrinsics.areEqual(this.requestMethod, trackRequest.requestMethod) && Intrinsics.areEqual(this.sign, trackRequest.sign);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((((this.url.hashCode() * 31) + this.header.hashCode()) * 31) + this.params.hashCode()) * 31) + this.configs.hashCode()) * 31;
        byte[] bArr = this.body;
        int iHashCode2 = (((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + this.requestMethod.hashCode()) * 31;
        String str = this.sign;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrackRequest(url=" + this.url + ", header=" + this.header + ", params=" + this.params + ", configs=" + this.configs + ", body=" + Arrays.toString(this.body) + ", requestMethod=" + this.requestMethod + ", sign=" + this.sign + ')';
    }
}
