package com.heytap.health.voiceassistant.speech.operation;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/voiceassistant/speech/operation/OldAsr;", "", "payload", "Lcom/heytap/health/voiceassistant/speech/operation/OldAsrContent;", "(Lcom/heytap/health/voiceassistant/speech/operation/OldAsrContent;)V", "getPayload", "()Lcom/heytap/health/voiceassistant/speech/operation/OldAsrContent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OldAsr {

    @NotNull
    private final OldAsrContent payload;

    public OldAsr(@NotNull OldAsrContent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    public static /* synthetic */ OldAsr copy$default(OldAsr oldAsr, OldAsrContent oldAsrContent, int i, Object obj) {
        if ((i & 1) != 0) {
            oldAsrContent = oldAsr.payload;
        }
        return oldAsr.copy(oldAsrContent);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OldAsrContent getPayload() {
        return this.payload;
    }

    @NotNull
    public final OldAsr copy(@NotNull OldAsrContent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new OldAsr(payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OldAsr) && Intrinsics.areEqual(this.payload, ((OldAsr) other).payload);
    }

    @NotNull
    public final OldAsrContent getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return "OldAsr(payload=" + this.payload + ")";
    }
}
