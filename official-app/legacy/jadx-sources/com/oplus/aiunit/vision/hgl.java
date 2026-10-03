package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/hgl;", "", "", "toString", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", SpeechConstant.KEY_IMSI, "b", MapSchema.FIELD_NAME_ENTRY, "iccid", "", "I", "()I", "d", "(I)V", "active", "getProviderName", b2n.f, "providerName", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class hgl {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String imsi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String iccid = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int active;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public String providerName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActive() {
        return this.active;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIccid() {
        return this.iccid;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImsi() {
        return this.imsi;
    }

    public final void d(int i) {
        this.active = i;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iccid = str;
    }

    public final void f(@Nullable String str) {
        this.imsi = str;
    }

    public final void g(@Nullable String str) {
        this.providerName = str;
    }

    @NotNull
    public String toString() {
        return "WatchSimInfo{imsi='" + this.imsi + ", iccid='" + this.iccid + ", active=" + this.active + ", providerName='" + this.providerName + "}";
    }
}
