package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lk9, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/lk9;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "enable", "Lcom/oplus/aiunit/vision/ini;", "b", "Lcom/oplus/aiunit/vision/ini;", "c", "()Lcom/oplus/aiunit/vision/ini;", "statisticCaller", "I", "()I", "sampleRatio", "<init>", "(ZLcom/oplus/aiunit/vision/ini;I)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HttpStatConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final ini statisticCaller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int sampleRatio;

    @JvmOverloads
    public HttpStatConfig() {
        this(false, null, 0, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSampleRatio() {
        return this.sampleRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ini getStatisticCaller() {
        return this.statisticCaller;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpStatConfig)) {
            return false;
        }
        HttpStatConfig httpStatConfig = (HttpStatConfig) other;
        return this.enable == httpStatConfig.enable && Intrinsics.areEqual(this.statisticCaller, httpStatConfig.statisticCaller) && this.sampleRatio == httpStatConfig.sampleRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ini iniVar = this.statisticCaller;
        return ((i + (iniVar != null ? iniVar.hashCode() : 0)) * 31) + this.sampleRatio;
    }

    @NotNull
    public String toString() {
        return "HttpStatConfig(enable=" + this.enable + ", statisticCaller=" + this.statisticCaller + ", sampleRatio=" + this.sampleRatio + ")";
    }

    @JvmOverloads
    public HttpStatConfig(boolean z, @Nullable ini iniVar) {
        this(z, iniVar, 0, 4, null);
    }

    @JvmOverloads
    public HttpStatConfig(boolean z, @Nullable ini iniVar, int i) {
        this.enable = z;
        this.statisticCaller = iniVar;
        this.sampleRatio = i;
    }

    public /* synthetic */ HttpStatConfig(boolean z, ini iniVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? null : iniVar, (i2 & 4) != 0 ? 1 : i);
    }
}
