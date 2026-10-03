package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.mpa, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/mpa;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "titleResId", "contentResId", "<init>", "(II)V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class KnowledgeCardRes {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int titleResId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int contentResId;

    public KnowledgeCardRes(int i, int i2) {
        this.titleResId = i;
        this.contentResId = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getContentResId() {
        return this.contentResId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KnowledgeCardRes)) {
            return false;
        }
        KnowledgeCardRes knowledgeCardRes = (KnowledgeCardRes) other;
        return this.titleResId == knowledgeCardRes.titleResId && this.contentResId == knowledgeCardRes.contentResId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.contentResId);
    }

    @NotNull
    public String toString() {
        return "KnowledgeCardRes(titleResId=" + this.titleResId + ", contentResId=" + this.contentResId + ")";
    }
}
