package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/insight/signs/AppTranslateText;", "", "content", "", Feedback.WIDGET_LABEL, "", "title", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getLabel", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppTranslateText {
    public static final int $stable = 8;

    @NotNull
    private final String content;

    @NotNull
    private final List<String> label;

    @NotNull
    private final String title;

    public AppTranslateText(@NotNull String content, @NotNull List<String> label, @NotNull String title) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(title, "title");
        this.content = content;
        this.label = label;
        this.title = title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppTranslateText copy$default(AppTranslateText appTranslateText, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appTranslateText.content;
        }
        if ((i & 2) != 0) {
            list = appTranslateText.label;
        }
        if ((i & 4) != 0) {
            str2 = appTranslateText.title;
        }
        return appTranslateText.copy(str, list, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<String> component2() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AppTranslateText copy(@NotNull String content, @NotNull List<String> label, @NotNull String title) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AppTranslateText(content, label, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTranslateText)) {
            return false;
        }
        AppTranslateText appTranslateText = (AppTranslateText) other;
        return Intrinsics.areEqual(this.content, appTranslateText.content) && Intrinsics.areEqual(this.label, appTranslateText.label) && Intrinsics.areEqual(this.title, appTranslateText.title);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<String> getLabel() {
        return this.label;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.content.hashCode() * 31) + this.label.hashCode()) * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppTranslateText(content=" + this.content + ", label=" + this.label + ", title=" + this.title + ")";
    }
}
