package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/health/voiceassistant/tts/RelyAppInfo;", "", "dmpInfo", "Lcom/heytap/health/voiceassistant/tts/DmpInfo;", "memoryInfo", "Lcom/heytap/health/voiceassistant/tts/MemoryInfo;", "healthyInfo", "Lcom/heytap/health/voiceassistant/tts/HealthyInfo;", "(Lcom/heytap/health/voiceassistant/tts/DmpInfo;Lcom/heytap/health/voiceassistant/tts/MemoryInfo;Lcom/heytap/health/voiceassistant/tts/HealthyInfo;)V", "getDmpInfo", "()Lcom/heytap/health/voiceassistant/tts/DmpInfo;", "setDmpInfo", "(Lcom/heytap/health/voiceassistant/tts/DmpInfo;)V", "getHealthyInfo", "()Lcom/heytap/health/voiceassistant/tts/HealthyInfo;", "setHealthyInfo", "(Lcom/heytap/health/voiceassistant/tts/HealthyInfo;)V", "getMemoryInfo", "()Lcom/heytap/health/voiceassistant/tts/MemoryInfo;", "setMemoryInfo", "(Lcom/heytap/health/voiceassistant/tts/MemoryInfo;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RelyAppInfo {

    @Nullable
    private DmpInfo dmpInfo;

    @Nullable
    private HealthyInfo healthyInfo;

    @Nullable
    private MemoryInfo memoryInfo;

    public RelyAppInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RelyAppInfo copy$default(RelyAppInfo relyAppInfo, DmpInfo dmpInfo, MemoryInfo memoryInfo, HealthyInfo healthyInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            dmpInfo = relyAppInfo.dmpInfo;
        }
        if ((i & 2) != 0) {
            memoryInfo = relyAppInfo.memoryInfo;
        }
        if ((i & 4) != 0) {
            healthyInfo = relyAppInfo.healthyInfo;
        }
        return relyAppInfo.copy(dmpInfo, memoryInfo, healthyInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DmpInfo getDmpInfo() {
        return this.dmpInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HealthyInfo getHealthyInfo() {
        return this.healthyInfo;
    }

    @NotNull
    public final RelyAppInfo copy(@Nullable DmpInfo dmpInfo, @Nullable MemoryInfo memoryInfo, @Nullable HealthyInfo healthyInfo) {
        return new RelyAppInfo(dmpInfo, memoryInfo, healthyInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelyAppInfo)) {
            return false;
        }
        RelyAppInfo relyAppInfo = (RelyAppInfo) other;
        return Intrinsics.areEqual(this.dmpInfo, relyAppInfo.dmpInfo) && Intrinsics.areEqual(this.memoryInfo, relyAppInfo.memoryInfo) && Intrinsics.areEqual(this.healthyInfo, relyAppInfo.healthyInfo);
    }

    @Nullable
    public final DmpInfo getDmpInfo() {
        return this.dmpInfo;
    }

    @Nullable
    public final HealthyInfo getHealthyInfo() {
        return this.healthyInfo;
    }

    @Nullable
    public final MemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    public int hashCode() {
        DmpInfo dmpInfo = this.dmpInfo;
        int iHashCode = (dmpInfo == null ? 0 : dmpInfo.hashCode()) * 31;
        MemoryInfo memoryInfo = this.memoryInfo;
        int iHashCode2 = (iHashCode + (memoryInfo == null ? 0 : memoryInfo.hashCode())) * 31;
        HealthyInfo healthyInfo = this.healthyInfo;
        return iHashCode2 + (healthyInfo != null ? healthyInfo.hashCode() : 0);
    }

    public final void setDmpInfo(@Nullable DmpInfo dmpInfo) {
        this.dmpInfo = dmpInfo;
    }

    public final void setHealthyInfo(@Nullable HealthyInfo healthyInfo) {
        this.healthyInfo = healthyInfo;
    }

    public final void setMemoryInfo(@Nullable MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    @NotNull
    public String toString() {
        return "RelyAppInfo(dmpInfo=" + this.dmpInfo + ", memoryInfo=" + this.memoryInfo + ", healthyInfo=" + this.healthyInfo + ")";
    }

    public RelyAppInfo(@Nullable DmpInfo dmpInfo, @Nullable MemoryInfo memoryInfo, @Nullable HealthyInfo healthyInfo) {
        this.dmpInfo = dmpInfo;
        this.memoryInfo = memoryInfo;
        this.healthyInfo = healthyInfo;
    }

    public /* synthetic */ RelyAppInfo(DmpInfo dmpInfo, MemoryInfo memoryInfo, HealthyInfo healthyInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dmpInfo, (i & 2) != 0 ? null : memoryInfo, (i & 4) != 0 ? null : healthyInfo);
    }
}
