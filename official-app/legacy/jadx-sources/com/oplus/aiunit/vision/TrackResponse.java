package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.h7k, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\n\u0010\u001bR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0014\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/h7k;", "", "", "f", "other", "equals", "", "hashCode", "", "toString", "a", "I", "b", "()I", "code", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "message", "", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "", "[B", "()[B", "body", "", "J", "()J", "contentLength", "configs", "<init>", "(ILjava/lang/String;Ljava/util/Map;[BJLjava/util/Map;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TrackResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> header;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final byte[] body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long contentLength;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, Object> configs;

    public TrackResponse(int i, @NotNull String message, @NotNull Map<String, String> header, @NotNull byte[] body, long j2, @NotNull Map<String, Object> configs) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.code = i;
        this.message = message;
        this.header = header;
        this.body = body;
        this.contentLength = j2;
        this.configs = configs;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.header;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TrackResponse.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.nearx.track.internal.upload.net.model.TrackResponse");
        TrackResponse trackResponse = (TrackResponse) other;
        return this.code == trackResponse.code && Intrinsics.areEqual(this.message, trackResponse.message) && Intrinsics.areEqual(this.header, trackResponse.header) && Arrays.equals(this.body, trackResponse.body) && this.contentLength == trackResponse.contentLength && Intrinsics.areEqual(this.configs, trackResponse.configs);
    }

    public final boolean f() {
        return this.code == 200;
    }

    public int hashCode() {
        return (((((((((this.code * 31) + this.message.hashCode()) * 31) + this.header.hashCode()) * 31) + Arrays.hashCode(this.body)) * 31) + Long.hashCode(this.contentLength)) * 31) + this.configs.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrackResponse(code=" + this.code + ", message=" + this.message + ", header=" + this.header + ", body=" + Arrays.toString(this.body) + ", contentLength=" + this.contentLength + ", configs=" + this.configs + ')';
    }
}
