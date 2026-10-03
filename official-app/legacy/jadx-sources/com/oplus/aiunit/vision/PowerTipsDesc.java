package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.loe, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/loe;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "quantity", "Ljava/lang/String;", "()Ljava/lang/String;", "formatStr", "<init>", "(ILjava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PowerTipsDesc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int quantity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String formatStr;

    public PowerTipsDesc(int i, @NotNull String formatStr) {
        Intrinsics.checkNotNullParameter(formatStr, "formatStr");
        this.quantity = i;
        this.formatStr = formatStr;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFormatStr() {
        return this.formatStr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PowerTipsDesc)) {
            return false;
        }
        PowerTipsDesc powerTipsDesc = (PowerTipsDesc) other;
        return this.quantity == powerTipsDesc.quantity && Intrinsics.areEqual(this.formatStr, powerTipsDesc.formatStr);
    }

    public int hashCode() {
        return (Integer.hashCode(this.quantity) * 31) + this.formatStr.hashCode();
    }

    @NotNull
    public String toString() {
        return "PowerTipsDesc(quantity=" + this.quantity + ", formatStr=" + this.formatStr + ")";
    }
}
