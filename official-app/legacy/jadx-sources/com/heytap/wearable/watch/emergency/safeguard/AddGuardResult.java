package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/AddGuardResult;", "", "inviteUrl", "", "title", iim.a.f, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getInviteUrl", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AddGuardResult {

    @NotNull
    private final String description;

    @NotNull
    private final String inviteUrl;

    @NotNull
    private final String title;

    public AddGuardResult(@NotNull String inviteUrl, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(inviteUrl, "inviteUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.inviteUrl = inviteUrl;
        this.title = title;
        this.description = description;
    }

    public static /* synthetic */ AddGuardResult copy$default(AddGuardResult addGuardResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addGuardResult.inviteUrl;
        }
        if ((i & 2) != 0) {
            str2 = addGuardResult.title;
        }
        if ((i & 4) != 0) {
            str3 = addGuardResult.description;
        }
        return addGuardResult.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInviteUrl() {
        return this.inviteUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final AddGuardResult copy(@NotNull String inviteUrl, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(inviteUrl, "inviteUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AddGuardResult(inviteUrl, title, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddGuardResult)) {
            return false;
        }
        AddGuardResult addGuardResult = (AddGuardResult) other;
        return Intrinsics.areEqual(this.inviteUrl, addGuardResult.inviteUrl) && Intrinsics.areEqual(this.title, addGuardResult.title) && Intrinsics.areEqual(this.description, addGuardResult.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getInviteUrl() {
        return this.inviteUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.inviteUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "AddGuardResult(inviteUrl=" + this.inviteUrl + ", title=" + this.title + ", description=" + this.description + ")";
    }
}
