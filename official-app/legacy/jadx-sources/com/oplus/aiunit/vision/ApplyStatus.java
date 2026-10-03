package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kf0, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/kf0;", "", "", "a", "", "toString", "", "hashCode", "other", "equals", "I", "getCode", "()I", "code", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ApplyStatus {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("code")
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("message")
    @NotNull
    private final String message;

    public final boolean a() {
        return this.code == 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyStatus)) {
            return false;
        }
        ApplyStatus applyStatus = (ApplyStatus) other;
        return this.code == applyStatus.code && Intrinsics.areEqual(this.message, applyStatus.message);
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplyStatus(code=" + this.code + ", message=" + this.message + ")";
    }
}
