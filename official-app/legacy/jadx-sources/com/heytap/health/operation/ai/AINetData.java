package com.heytap.health.operation.ai;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/operation/ai/AINetData;", "", "open", "", "(Z)V", "getOpen", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "operation_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AINetData {
    public static final int $stable = 0;
    private final boolean open;

    public AINetData(boolean z) {
        this.open = z;
    }

    public static /* synthetic */ AINetData copy$default(AINetData aINetData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aINetData.open;
        }
        return aINetData.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOpen() {
        return this.open;
    }

    @NotNull
    public final AINetData copy(boolean open) {
        return new AINetData(open);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AINetData) && this.open == ((AINetData) other).open;
    }

    public final boolean getOpen() {
        return this.open;
    }

    public int hashCode() {
        boolean z = this.open;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "AINetData(open=" + this.open + ")";
    }
}
