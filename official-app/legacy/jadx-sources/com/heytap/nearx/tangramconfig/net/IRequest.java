package com.heytap.nearx.tangramconfig.net;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.jla;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014BK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/IRequest;", "", "url", "", SpeechConstant.KEY_TTS_REQUEST_HEADER, "", "params", "configs", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getConfigs", "()Ljava/util/Map;", "getHeader", "getParams", "getUrl", "()Ljava/lang/String;", "config", ExifInterface.GPS_DIRECTION_TRUE, "key", "(Ljava/lang/String;)Ljava/lang/Object;", "Builder", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
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
    private final Map<String, String> params;

    @NotNull
    private final String url;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/IRequest$Builder;", "", "()V", "configs", "", "", SpeechConstant.KEY_TTS_REQUEST_HEADER, "getHeader", "()Ljava/util/Map;", "params", "url", "addConfig", "key", "value", "addHeader", "addParams", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/nearx/tangramconfig/net/IRequest;", "setTimeOut", "connectTime", "", "readTimeout", "writeTimeOut", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private String url;

        @NotNull
        private final Map<String, String> header = new ConcurrentHashMap();

        @NotNull
        private final Map<String, String> params = new ConcurrentHashMap();

        @NotNull
        private final Map<String, Object> configs = new ConcurrentHashMap();

        public static /* synthetic */ Builder setTimeOut$default(Builder builder, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = 0;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return builder.setTimeOut(i, i2, i3);
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
            return new IRequest(str2, this.header, this.params, this.configs, null);
        }

        @NotNull
        public final Map<String, String> getHeader() {
            return this.header;
        }

        @NotNull
        public final Builder setTimeOut(int connectTime, int readTimeout, int writeTimeOut) {
            if (connectTime > 0) {
                this.configs.put("OKHTTP_CONNECT_TIME_OUT", Integer.valueOf(connectTime));
            }
            if (readTimeout > 0) {
                this.configs.put("OKHTTP_READ_TIME_OUT", Integer.valueOf(readTimeout));
            }
            if (writeTimeOut > 0) {
                this.configs.put("OKHTTP_WRITE_TIME_OUT", Integer.valueOf(writeTimeOut));
            }
            return this;
        }

        @NotNull
        public final Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }
    }

    public /* synthetic */ IRequest(String str, Map map, Map map2, Map map3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, map2, map3);
    }

    public final <T> T config(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.configs;
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
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
    public final Map<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    private IRequest(String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        this.url = str;
        this.header = map;
        this.params = map2;
        this.configs = map3;
    }
}
