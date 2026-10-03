package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.m5j, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0014\u0010\u000eR(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\t\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/m5j;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "c", "()Z", "setSupportSwitch", "(Z)V", "supportSwitch", "b", "d", MapSchema.FIELD_NAME_ENTRY, "switchOn", "setSupportSmartSwitch", "supportSmartSwitch", "", "Ljava/util/Set;", "()Ljava/util/Set;", "setAssistAids", "(Ljava/util/Set;)V", "assistAids", "<init>", "(ZZZ)V", "business_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SwipeConfigs {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public boolean supportSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public boolean switchOn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean supportSmartSwitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Set<String> assistAids;

    public SwipeConfigs() {
        this(false, false, false, 7, null);
    }

    @NotNull
    public final Set<String> a() {
        return this.assistAids;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSupportSmartSwitch() {
        return this.supportSmartSwitch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSupportSwitch() {
        return this.supportSwitch;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSwitchOn() {
        return this.switchOn;
    }

    public final void e(boolean z) {
        this.switchOn = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeConfigs)) {
            return false;
        }
        SwipeConfigs swipeConfigs = (SwipeConfigs) other;
        return this.supportSwitch == swipeConfigs.supportSwitch && this.switchOn == swipeConfigs.switchOn && this.supportSmartSwitch == swipeConfigs.supportSmartSwitch;
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
        boolean z = this.supportSwitch;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.switchOn;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.supportSmartSwitch;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "SwipeConfigs(supportSwitch=" + this.supportSwitch + ", switchOn=" + this.switchOn + ", supportSmartSwitch=" + this.supportSmartSwitch + ")";
    }

    public SwipeConfigs(boolean z, boolean z2, boolean z3) {
        this.supportSwitch = z;
        this.switchOn = z2;
        this.supportSmartSwitch = z3;
        this.assistAids = new LinkedHashSet();
    }

    public /* synthetic */ SwipeConfigs(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
