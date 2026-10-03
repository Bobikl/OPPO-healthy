package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\f\u0018\u0000 \u00162\u00020\u0001:\u0002\u0005\fBM\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/gw9;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "url", "", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "d", "params", "configs", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class gw9 {

    @NotNull
    public static final String CONNECT_TIME_OUT = "OKHTTP_CONNECT_TIME_OUT";

    @NotNull
    public static final String READ_TIME_OUT = "OKHTTP_READ_TIME_OUT";

    @NotNull
    public static final String WRITE_TIME_OUT = "OKHTTP_WRITE_TIME_OUT";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> params;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> configs;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/gw9$a;", "", "", "url", MapSchema.FIELD_NAME_ENTRY, "key", "value", "a", "", "connectTime", "readTimeout", "writeTimeOut", "d", "Lcom/oplus/aiunit/vision/gw9;", "b", "Ljava/lang/String;", "", "Ljava/util/Map;", "c", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "params", "configs", "<init>", "()V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> header = new ConcurrentHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final Map<String, String> params = new ConcurrentHashMap();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Map<String, Object> configs = new ConcurrentHashMap();

        @NotNull
        public final a a(@NotNull String key, @NotNull String value) {
            Intrinsics.checkParameterIsNotNull(key, "key");
            Intrinsics.checkParameterIsNotNull(value, "value");
            this.header.put(key, value);
            return this;
        }

        @NotNull
        public final gw9 b() {
            String str = this.url;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("make sure you have correct url ..., current is null");
            }
            String str2 = this.url;
            if (str2 == null) {
                str2 = "";
            }
            return new gw9(str2, this.header, this.params, this.configs, null);
        }

        @NotNull
        public final Map<String, String> c() {
            return this.header;
        }

        @NotNull
        public final a d(int connectTime, int readTimeout, int writeTimeOut) {
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
        public final a e(@NotNull String url) {
            Intrinsics.checkParameterIsNotNull(url, "url");
            this.url = url;
            return this;
        }
    }

    public gw9(String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        this.url = str;
        this.header = map;
        this.params = map2;
        this.configs = map3;
    }

    public final <T> T a(@NotNull String key) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Map<String, Object> map = this.configs;
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
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
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ gw9(String str, Map map, Map map2, Map map3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, map2, map3);
    }
}
