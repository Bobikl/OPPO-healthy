package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.yva, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\t\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/yva;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "iconResId", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "title", "content", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LifeSuggestionItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int iconResId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String content;

    public LifeSuggestionItem(int i, @NotNull String title, @NotNull String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.iconResId = i;
        this.title = title;
        this.content = content;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LifeSuggestionItem)) {
            return false;
        }
        LifeSuggestionItem lifeSuggestionItem = (LifeSuggestionItem) other;
        return this.iconResId == lifeSuggestionItem.iconResId && Intrinsics.areEqual(this.title, lifeSuggestionItem.title) && Intrinsics.areEqual(this.content, lifeSuggestionItem.content);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.iconResId) * 31) + this.title.hashCode()) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "LifeSuggestionItem(iconResId=" + this.iconResId + ", title=" + this.title + ", content=" + this.content + ")";
    }
}
