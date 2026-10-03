package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.b3g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/b3g;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "alphaPreMultiplied", "b", "enableFlipBitmap", "c", "useHardwareBitmap", "<init>", "(ZZZ)V", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class RuntimeShaderOptions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean alphaPreMultiplied;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean enableFlipBitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean useHardwareBitmap;

    public RuntimeShaderOptions() {
        this(false, false, false, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAlphaPreMultiplied() {
        return this.alphaPreMultiplied;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnableFlipBitmap() {
        return this.enableFlipBitmap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUseHardwareBitmap() {
        return this.useHardwareBitmap;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuntimeShaderOptions)) {
            return false;
        }
        RuntimeShaderOptions runtimeShaderOptions = (RuntimeShaderOptions) other;
        return this.alphaPreMultiplied == runtimeShaderOptions.alphaPreMultiplied && this.enableFlipBitmap == runtimeShaderOptions.enableFlipBitmap && this.useHardwareBitmap == runtimeShaderOptions.useHardwareBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        boolean z = this.alphaPreMultiplied;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enableFlipBitmap;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.useHardwareBitmap;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "RuntimeShaderOptions(alphaPreMultiplied=" + this.alphaPreMultiplied + ", enableFlipBitmap=" + this.enableFlipBitmap + ", useHardwareBitmap=" + this.useHardwareBitmap + ")";
    }

    public RuntimeShaderOptions(boolean z, boolean z2, boolean z3) {
        this.alphaPreMultiplied = z;
        this.enableFlipBitmap = z2;
        this.useHardwareBitmap = z3;
    }

    public /* synthetic */ RuntimeShaderOptions(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
