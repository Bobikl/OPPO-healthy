package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.le0, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/le0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "d", "(Z)V", "enableTrace", "", "b", "J", "c", "()J", "traceConfigId", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "traceConfigCode", "<init>", "(ZJLjava/lang/String;)V", "com.heytap.nearx.apptrace"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AppTraceConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public boolean enableTrace;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long traceConfigId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String traceConfigCode;

    @JvmOverloads
    public AppTraceConfig(boolean z, long j2, @NotNull String traceConfigCode) {
        Intrinsics.checkNotNullParameter(traceConfigCode, "traceConfigCode");
        this.enableTrace = z;
        this.traceConfigId = j2;
        this.traceConfigCode = traceConfigCode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnableTrace() {
        return this.enableTrace;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTraceConfigCode() {
        return this.traceConfigCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTraceConfigId() {
        return this.traceConfigId;
    }

    public final void d(boolean z) {
        this.enableTrace = z;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.traceConfigCode = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTraceConfig)) {
            return false;
        }
        AppTraceConfig appTraceConfig = (AppTraceConfig) other;
        return this.enableTrace == appTraceConfig.enableTrace && this.traceConfigId == appTraceConfig.traceConfigId && Intrinsics.areEqual(this.traceConfigCode, appTraceConfig.traceConfigCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enableTrace;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        long j2 = this.traceConfigId;
        int i = ((r0 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.traceConfigCode;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppTraceConfig(enableTrace=" + this.enableTrace + ", traceConfigId=" + this.traceConfigId + ", traceConfigCode=" + this.traceConfigCode + ")";
    }
}
