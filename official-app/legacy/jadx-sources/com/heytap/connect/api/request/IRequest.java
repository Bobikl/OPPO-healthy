package com.heytap.connect.api.request;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.jla;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bBU\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/connect/api/request/IRequest;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "config", "(Ljava/lang/String;)Ljava/lang/Object;", "", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "configs", "getConfigs", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lcom/heytap/connect/api/request/Method;", "method", "Lcom/heytap/connect/api/request/Method;", "getMethod", "()Lcom/heytap/connect/api/request/Method;", "params", "getParams", "<init>", "(Ljava/lang/String;Lcom/heytap/connect/api/request/Method;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "Companion", "Builder", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class IRequest {

    @NotNull
    public static final String CONNECT_TIME_OUT = "OKHTTP_CONNECT_TIME_OUT";

    @NotNull
    public static final String READ_TIME_OUT = "OKHTTP_READ_TIME_OUT";

    @NotNull
    public static final String WRITE_TIME_OUT = "OKHTTP_WRITE_TIME_OUT";

    @NotNull
    private final Map<String, Object> configs;

    @NotNull
    private final Map<String, String> header;

    @NotNull
    private final Method method;

    @NotNull
    private final Map<String, String> params;

    @NotNull
    private final String url;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\f\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR%\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001e¨\u0006&"}, d2 = {"Lcom/heytap/connect/api/request/IRequest$Builder;", "", "", "url", "(Ljava/lang/String;)Lcom/heytap/connect/api/request/IRequest$Builder;", "Lcom/heytap/connect/api/request/Method;", "method", "(Lcom/heytap/connect/api/request/Method;)Lcom/heytap/connect/api/request/IRequest$Builder;", "key", "value", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/connect/api/request/IRequest$Builder;", "addParams", "", "map", "(Ljava/util/Map;)Lcom/heytap/connect/api/request/IRequest$Builder;", "addConfig", "", "connectTime", "readTimeout", "writeTimeOut", "", "setTimeOut", "(III)V", "Lcom/heytap/connect/api/request/IRequest;", jla.DEFAULT_BUILD_METHOD, "()Lcom/heytap/connect/api/request/IRequest;", "Lcom/heytap/connect/api/request/Method;", "", "params", "Ljava/util/Map;", "Ljava/lang/String;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "getHeader", "()Ljava/util/Map;", "configs", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        @Nullable
        private String url;

        @NotNull
        private Method method = Method.GET;

        @NotNull
        private final Map<String, String> header = new LinkedHashMap();

        @NotNull
        private final Map<String, String> params = new LinkedHashMap();

        @NotNull
        private final Map<String, Object> configs = new LinkedHashMap();

        public static /* synthetic */ void setTimeOut$default(Builder builder, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = 0;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            builder.setTimeOut(i, i2, i3);
        }

        @NotNull
        public final Builder addConfig(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.configs.put(key, value);
            return this;
        }

        @NotNull
        public final Builder addHeader(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.header.put(key, value);
            return this;
        }

        @NotNull
        public final Builder addParams(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.params.put(key, value);
            return this;
        }

        @NotNull
        public final IRequest build() {
            String str = this.url;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("make sure you have correct url ..., current is null");
            }
            String str2 = this.url;
            if (str2 == null) {
                str2 = "";
            }
            return new IRequest(str2, this.method, this.header, this.params, this.configs, null);
        }

        @NotNull
        public final Map<String, String> getHeader() {
            return this.header;
        }

        @NotNull
        public final Builder method(@NotNull Method method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        public final void setTimeOut(int connectTime, int readTimeout, int writeTimeOut) {
            if (connectTime > 0) {
                this.configs.put("OKHTTP_CONNECT_TIME_OUT", Integer.valueOf(connectTime));
            }
            if (readTimeout > 0) {
                this.configs.put("OKHTTP_READ_TIME_OUT", Integer.valueOf(readTimeout));
            }
            if (writeTimeOut > 0) {
                this.configs.put("OKHTTP_WRITE_TIME_OUT", Integer.valueOf(writeTimeOut));
            }
        }

        @NotNull
        public final Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        @NotNull
        public final Builder addParams(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.params.putAll(map);
            return this;
        }
    }

    private IRequest(String str, Method method, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        this.url = str;
        this.method = method;
        this.header = map;
        this.params = map2;
        this.configs = map3;
    }

    public final <T> T config(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.configs;
        if (map == null) {
            return null;
        }
        return (T) map.get(key);
    }

    @NotNull
    public final Map<String, Object> getConfigs() {
        return this.configs;
    }

    @NotNull
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ IRequest(String str, Method method, Map map, Map map2, Map map3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, method, map, map2, map3);
    }
}
