package com.heytap.health.bitmap;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/bitmap/Spo2Bean;", "", "spo2Value", "", "(I)V", "getSpo2Value", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Spo2Bean {
    public static final int $stable = 0;
    private final int spo2Value;

    public Spo2Bean(int i) {
        this.spo2Value = i;
    }

    public static /* synthetic */ Spo2Bean copy$default(Spo2Bean spo2Bean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = spo2Bean.spo2Value;
        }
        return spo2Bean.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSpo2Value() {
        return this.spo2Value;
    }

    @NotNull
    public final Spo2Bean copy(int spo2Value) {
        return new Spo2Bean(spo2Value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Spo2Bean) && this.spo2Value == ((Spo2Bean) other).spo2Value;
    }

    public final int getSpo2Value() {
        return this.spo2Value;
    }

    public int hashCode() {
        return Integer.hashCode(this.spo2Value);
    }

    @NotNull
    public String toString() {
        return "Spo2Bean(spo2Value=" + this.spo2Value + ")";
    }
}
