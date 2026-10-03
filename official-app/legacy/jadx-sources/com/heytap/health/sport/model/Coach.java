package com.heytap.health.sport.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/sport/model/Coach;", "", "validTimeinterval", "", "title", "", "body", "imageUrl", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getImageUrl", "getTitle", "getValidTimeinterval", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Coach {
    public static final int $stable = 0;

    @NotNull
    private final String body;

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String title;
    private final long validTimeinterval;

    public Coach() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ Coach copy$default(Coach coach, long j2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = coach.validTimeinterval;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            str = coach.title;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = coach.body;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = coach.imageUrl;
        }
        return coach.copy(j3, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getValidTimeinterval() {
        return this.validTimeinterval;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final Coach copy(long validTimeinterval, @NotNull String title, @NotNull String body, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new Coach(validTimeinterval, title, body, imageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coach)) {
            return false;
        }
        Coach coach = (Coach) other;
        return this.validTimeinterval == coach.validTimeinterval && Intrinsics.areEqual(this.title, coach.title) && Intrinsics.areEqual(this.body, coach.body) && Intrinsics.areEqual(this.imageUrl, coach.imageUrl);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getValidTimeinterval() {
        return this.validTimeinterval;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.validTimeinterval) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "Coach(validTimeinterval=" + this.validTimeinterval + ", title=" + this.title + ", body=" + this.body + ", imageUrl=" + this.imageUrl + ")";
    }

    public Coach(long j2, @NotNull String title, @NotNull String body, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.validTimeinterval = j2;
        this.title = title;
        this.body = body;
        this.imageUrl = imageUrl;
    }

    public /* synthetic */ Coach(long j2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
