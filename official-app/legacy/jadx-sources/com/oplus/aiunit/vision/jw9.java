package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017\u0012\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001c\u0012\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00178\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/jw9;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "", b2n.f, "", "a", "", "c", "()Ljava/lang/Long;", "", "I", "d", "()I", "code", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "message", "", "Ljava/util/Map;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "bodyFunction", "contentLengthFunction", "configs", "<init>", "(ILjava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class jw9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> header;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Function0<byte[]> bodyFunction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Function0<Long> contentLengthFunction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Map<String, Object> configs;

    public jw9(int i, @NotNull String message, @NotNull Map<String, String> header, @NotNull Function0<byte[]> bodyFunction, @NotNull Function0<Long> contentLengthFunction, @NotNull Map<String, Object> configs) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(header, "header");
        Intrinsics.checkParameterIsNotNull(bodyFunction, "bodyFunction");
        Intrinsics.checkParameterIsNotNull(contentLengthFunction, "contentLengthFunction");
        Intrinsics.checkParameterIsNotNull(configs, "configs");
        this.code = i;
        this.message = message;
        this.header = header;
        this.bodyFunction = bodyFunction;
        this.contentLengthFunction = contentLengthFunction;
        this.configs = configs;
    }

    @Nullable
    public final byte[] a() {
        return this.bodyFunction.invoke();
    }

    public final <T> T b(@NotNull String key) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        Map<String, Object> map = this.configs;
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    @Nullable
    public final Long c() {
        return this.contentLengthFunction.invoke();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, String> e() {
        return this.header;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean g() {
        return this.code == 200;
    }
}
