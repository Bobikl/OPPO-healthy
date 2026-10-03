package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/insight/signs/TranslateText;", "", "appTranslateText", "Lcom/heytap/health/insight/signs/AppTranslateText;", "watchTranslateText", "Lcom/heytap/health/insight/signs/WatchTranslateText;", "(Lcom/heytap/health/insight/signs/AppTranslateText;Lcom/heytap/health/insight/signs/WatchTranslateText;)V", "getAppTranslateText", "()Lcom/heytap/health/insight/signs/AppTranslateText;", "getWatchTranslateText", "()Lcom/heytap/health/insight/signs/WatchTranslateText;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TranslateText {
    public static final int $stable = 8;

    @NotNull
    private final AppTranslateText appTranslateText;

    @NotNull
    private final WatchTranslateText watchTranslateText;

    public TranslateText(@NotNull AppTranslateText appTranslateText, @NotNull WatchTranslateText watchTranslateText) {
        Intrinsics.checkNotNullParameter(appTranslateText, "appTranslateText");
        Intrinsics.checkNotNullParameter(watchTranslateText, "watchTranslateText");
        this.appTranslateText = appTranslateText;
        this.watchTranslateText = watchTranslateText;
    }

    public static /* synthetic */ TranslateText copy$default(TranslateText translateText, AppTranslateText appTranslateText, WatchTranslateText watchTranslateText, int i, Object obj) {
        if ((i & 1) != 0) {
            appTranslateText = translateText.appTranslateText;
        }
        if ((i & 2) != 0) {
            watchTranslateText = translateText.watchTranslateText;
        }
        return translateText.copy(appTranslateText, watchTranslateText);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppTranslateText getAppTranslateText() {
        return this.appTranslateText;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WatchTranslateText getWatchTranslateText() {
        return this.watchTranslateText;
    }

    @NotNull
    public final TranslateText copy(@NotNull AppTranslateText appTranslateText, @NotNull WatchTranslateText watchTranslateText) {
        Intrinsics.checkNotNullParameter(appTranslateText, "appTranslateText");
        Intrinsics.checkNotNullParameter(watchTranslateText, "watchTranslateText");
        return new TranslateText(appTranslateText, watchTranslateText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslateText)) {
            return false;
        }
        TranslateText translateText = (TranslateText) other;
        return Intrinsics.areEqual(this.appTranslateText, translateText.appTranslateText) && Intrinsics.areEqual(this.watchTranslateText, translateText.watchTranslateText);
    }

    @NotNull
    public final AppTranslateText getAppTranslateText() {
        return this.appTranslateText;
    }

    @NotNull
    public final WatchTranslateText getWatchTranslateText() {
        return this.watchTranslateText;
    }

    public int hashCode() {
        return (this.appTranslateText.hashCode() * 31) + this.watchTranslateText.hashCode();
    }

    @NotNull
    public String toString() {
        return "TranslateText(appTranslateText=" + this.appTranslateText + ", watchTranslateText=" + this.watchTranslateText + ")";
    }
}
