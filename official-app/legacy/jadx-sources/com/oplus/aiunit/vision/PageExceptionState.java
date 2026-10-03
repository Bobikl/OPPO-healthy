package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.a4e, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/a4e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "icon", "b", "title", "<init>", "(II)V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PageExceptionState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int title;

    public PageExceptionState(int i, int i2) {
        this.icon = i;
        this.title = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageExceptionState)) {
            return false;
        }
        PageExceptionState pageExceptionState = (PageExceptionState) other;
        return this.icon == pageExceptionState.icon && this.title == pageExceptionState.title;
    }

    public int hashCode() {
        return (Integer.hashCode(this.icon) * 31) + Integer.hashCode(this.title);
    }

    @NotNull
    public String toString() {
        return "PageExceptionState(icon=" + this.icon + ", title=" + this.title + ")";
    }
}
