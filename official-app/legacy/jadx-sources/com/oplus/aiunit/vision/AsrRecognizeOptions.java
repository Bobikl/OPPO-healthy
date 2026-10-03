package com.oplus.aiunit.vision;

import com.heytap.health.voiceassistant.AsrAudioFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ph0, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/ph0;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "timeoutMs", "Lcom/heytap/health/voiceassistant/AsrAudioFormat;", "Lcom/heytap/health/voiceassistant/AsrAudioFormat;", "getAudioFormat", "()Lcom/heytap/health/voiceassistant/AsrAudioFormat;", "audioFormat", "c", "Z", "()Z", "manualEndOnly", "<init>", "(JLcom/heytap/health/voiceassistant/AsrAudioFormat;Z)V", "voiceassistant_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AsrRecognizeOptions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long timeoutMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final AsrAudioFormat audioFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean manualEndOnly;

    public AsrRecognizeOptions() {
        this(0L, null, false, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getManualEndOnly() {
        return this.manualEndOnly;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsrRecognizeOptions)) {
            return false;
        }
        AsrRecognizeOptions asrRecognizeOptions = (AsrRecognizeOptions) other;
        return this.timeoutMs == asrRecognizeOptions.timeoutMs && this.audioFormat == asrRecognizeOptions.audioFormat && this.manualEndOnly == asrRecognizeOptions.manualEndOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.timeoutMs) * 31) + this.audioFormat.hashCode()) * 31;
        boolean z = this.manualEndOnly;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "AsrRecognizeOptions(timeoutMs=" + this.timeoutMs + ", audioFormat=" + this.audioFormat + ", manualEndOnly=" + this.manualEndOnly + ")";
    }

    public AsrRecognizeOptions(long j2, @NotNull AsrAudioFormat audioFormat, boolean z) {
        Intrinsics.checkNotNullParameter(audioFormat, "audioFormat");
        this.timeoutMs = j2;
        this.audioFormat = audioFormat;
        this.manualEndOnly = z;
    }

    public /* synthetic */ AsrRecognizeOptions(long j2, AsrAudioFormat asrAudioFormat, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 15000L : j2, (i & 2) != 0 ? AsrAudioFormat.PCM_16K_16BIT_MONO : asrAudioFormat, (i & 4) != 0 ? false : z);
    }
}
