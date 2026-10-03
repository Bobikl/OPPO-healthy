package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fd4, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/fd4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "title", "b", "c", "subtitle", "I", "()I", "errorCode", "Z", "()Z", "showRetry", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CreateKeyError {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int errorCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean showRetry;

    public CreateKeyError(@NotNull String title, @NotNull String subtitle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.errorCode = i;
        this.showRetry = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowRetry() {
        return this.showRetry;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateKeyError)) {
            return false;
        }
        CreateKeyError createKeyError = (CreateKeyError) other;
        return Intrinsics.areEqual(this.title, createKeyError.title) && Intrinsics.areEqual(this.subtitle, createKeyError.subtitle) && this.errorCode == createKeyError.errorCode && this.showRetry == createKeyError.showRetry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Integer.hashCode(this.errorCode)) * 31;
        boolean z = this.showRetry;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "CreateKeyError(title=" + this.title + ", subtitle=" + this.subtitle + ", errorCode=" + this.errorCode + ", showRetry=" + this.showRetry + ")";
    }

    public /* synthetic */ CreateKeyError(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? false : z);
    }
}
