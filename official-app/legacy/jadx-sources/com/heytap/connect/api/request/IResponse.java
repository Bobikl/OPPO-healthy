package com.heytap.connect.api.request;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001f\u0012\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001f\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R%\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006%"}, d2 = {"Lcom/heytap/connect/api/request/IResponse;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "config", "(Ljava/lang/String;)Ljava/lang/Object;", "", "isSuccess", "()Z", "", "body", "()[B", "", "contentLength", "()Ljava/lang/Long;", "", "code", "I", "getCode", "()I", "", "configs", "Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "getHeader", "()Ljava/util/Map;", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lkotlin/Function0;", "bodyFunction", "Lkotlin/jvm/functions/Function0;", "contentLengthFunction", "<init>", "(ILjava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class IResponse {

    @NotNull
    private final Function0<byte[]> bodyFunction;
    private final int code;

    @NotNull
    private final Map<String, Object> configs;

    @NotNull
    private final Function0<Long> contentLengthFunction;

    @NotNull
    private final Map<String, String> header;

    @NotNull
    private final String message;

    public IResponse(int i, @NotNull String message, @NotNull Map<String, String> header, @NotNull Function0<byte[]> bodyFunction, @NotNull Function0<Long> contentLengthFunction, @NotNull Map<String, Object> configs) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(bodyFunction, "bodyFunction");
        Intrinsics.checkNotNullParameter(contentLengthFunction, "contentLengthFunction");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.code = i;
        this.message = message;
        this.header = header;
        this.bodyFunction = bodyFunction;
        this.contentLengthFunction = contentLengthFunction;
        this.configs = configs;
    }

    @Nullable
    public final byte[] body() {
        return this.bodyFunction.invoke();
    }

    public final <T> T config(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.configs;
        if (map == null) {
            return null;
        }
        return (T) map.get(key);
    }

    @Nullable
    public final Long contentLength() {
        return this.contentLengthFunction.invoke();
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

    public final boolean isSuccess() {
        return this.code == 200;
    }

    public /* synthetic */ IResponse(int i, String str, Map map, Function0 function0, Function0 function1, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? new LinkedHashMap() : map, function0, function1, (i2 & 32) != 0 ? new LinkedHashMap() : map2);
    }
}
