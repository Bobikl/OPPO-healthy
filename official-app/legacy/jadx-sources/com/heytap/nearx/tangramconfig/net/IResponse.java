package com.heytap.nearx.tangramconfig.net;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010\u0017\u001a\u0004\u0018\u00010\nJ\u0019\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fR\u0018\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/IResponse;", "", "code", "", "message", "", SpeechConstant.KEY_TTS_REQUEST_HEADER, "", "bodyFunction", "Lkotlin/Function0;", "", "contentLengthFunction", "", "configs", "(ILjava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)V", "getCode", "()I", "setCode", "(I)V", "getHeader", "()Ljava/util/Map;", "getMessage", "()Ljava/lang/String;", "body", "config", ExifInterface.GPS_DIRECTION_TRUE, "key", "(Ljava/lang/String;)Ljava/lang/Object;", "contentLength", "()Ljava/lang/Long;", "isException", "", "isSuccess", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IResponse {
    public static final int RESPONSE_CODE_BIND = 904;
    public static final int RESPONSE_CODE_CONNECT = 901;
    public static final int RESPONSE_CODE_HTTP_RETRY = 930;
    public static final int RESPONSE_CODE_IO = 990;
    public static final int RESPONSE_CODE_MALFORMED_URL = 910;
    public static final int RESPONSE_CODE_NO_ROUTE_TO_HOST = 903;
    public static final int RESPONSE_CODE_PORT_UNREACHABLE = 906;
    public static final int RESPONSE_CODE_PROTOCOL = 911;
    public static final int RESPONSE_CODE_SOCKET = 931;
    public static final int RESPONSE_CODE_SOCKET_TIMEOUT = 902;
    public static final int RESPONSE_CODE_SSL = 924;
    public static final int RESPONSE_CODE_SSL_HAND_SHAKE = 920;
    public static final int RESPONSE_CODE_SSL_KEY = 921;
    public static final int RESPONSE_CODE_SSL_PEER_UNVERIFIED = 923;
    public static final int RESPONSE_CODE_SSL_PROTOCOL = 922;
    public static final int RESPONSE_CODE_UNKNOWN = 999;
    public static final int RESPONSE_CODE_UNKNOWN_HOST = 900;
    public static final int RESPONSE_CODE_UNKNOWN_SERVICE = 905;
    public static final int RESPONSE_CODE_URI_SYNTAX = 912;

    @Nullable
    private final Function0<byte[]> bodyFunction;
    private int code;

    @NotNull
    private final Map<String, Object> configs;

    @Nullable
    private final Function0<Long> contentLengthFunction;

    @NotNull
    private final Map<String, String> header;

    @NotNull
    private final String message;

    public IResponse(int i, @NotNull String message, @NotNull Map<String, String> header, @Nullable Function0<byte[]> function0, @Nullable Function0<Long> function1, @NotNull Map<String, Object> configs) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.code = i;
        this.message = message;
        this.header = header;
        this.bodyFunction = function0;
        this.contentLengthFunction = function1;
        this.configs = configs;
    }

    @Nullable
    public final byte[] body() {
        Function0<byte[]> function0 = this.bodyFunction;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final <T> T config(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.configs.get(key);
    }

    @Nullable
    public final Long contentLength() {
        Function0<Long> function0 = this.contentLengthFunction;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean isException() {
        int i = this.code;
        if (i != 930 && i != 931 && i != 990 && i != 999) {
            switch (i) {
                case 900:
                case 901:
                case 902:
                case 903:
                case 904:
                case 905:
                case 906:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccess() {
        return this.code == 200;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public /* synthetic */ IResponse(int i, String str, Map map, Function0 function0, Function0 function1, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? new ConcurrentHashMap() : map, (i2 & 8) != 0 ? null : function0, (i2 & 16) != 0 ? null : function1, (i2 & 32) != 0 ? new ConcurrentHashMap() : map2);
    }
}
