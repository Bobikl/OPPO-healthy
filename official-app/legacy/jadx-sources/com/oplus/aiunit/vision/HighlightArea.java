package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l99, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/l99;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "b", "()F", y04.TIME_STYLE_LEFT_DIR_NAME, "d", "top", "c", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "<init>", "(FFFF)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HighlightArea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final float left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final float right;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final float bottom;

    public HighlightArea(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightArea)) {
            return false;
        }
        HighlightArea highlightArea = (HighlightArea) other;
        return Float.compare(this.left, highlightArea.left) == 0 && Float.compare(this.top, highlightArea.top) == 0 && Float.compare(this.right, highlightArea.right) == 0 && Float.compare(this.bottom, highlightArea.bottom) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @NotNull
    public String toString() {
        return "HighlightArea(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }
}
