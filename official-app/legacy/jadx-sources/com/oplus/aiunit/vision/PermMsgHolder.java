package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hee, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/hee;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "setFeatureId", "(I)V", "featureId", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "setPermsList", "(Ljava/util/List;)V", "permsList", "Z", "()Z", "setPermOpen", "(Z)V", "permOpen", "<init>", "(ILjava/util/List;Z)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PermMsgHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int featureId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public List<String> permsList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean permOpen;

    public PermMsgHolder(int i, @NotNull List<String> permsList, boolean z) {
        Intrinsics.checkNotNullParameter(permsList, "permsList");
        this.featureId = i;
        this.permsList = permsList;
        this.permOpen = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFeatureId() {
        return this.featureId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPermOpen() {
        return this.permOpen;
    }

    @NotNull
    public final List<String> c() {
        return this.permsList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermMsgHolder)) {
            return false;
        }
        PermMsgHolder permMsgHolder = (PermMsgHolder) other;
        return this.featureId == permMsgHolder.featureId && Intrinsics.areEqual(this.permsList, permMsgHolder.permsList) && this.permOpen == permMsgHolder.permOpen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.featureId) * 31) + this.permsList.hashCode()) * 31;
        boolean z = this.permOpen;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "PermMsgHolder(featureId=" + this.featureId + ", permsList=" + this.permsList + ", permOpen=" + this.permOpen + ")";
    }
}
