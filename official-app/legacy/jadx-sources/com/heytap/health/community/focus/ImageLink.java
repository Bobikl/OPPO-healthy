package com.heytap.health.community.focus;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/community/focus/ImageLink;", "Ljava/io/Serializable;", "thumb", "Lcom/heytap/health/community/focus/ImageAttr;", "hd", "(Lcom/heytap/health/community/focus/ImageAttr;Lcom/heytap/health/community/focus/ImageAttr;)V", "getHd", "()Lcom/heytap/health/community/focus/ImageAttr;", "getThumb", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageLink implements Serializable {

    @NotNull
    private final ImageAttr hd;

    @NotNull
    private final ImageAttr thumb;

    public ImageLink(@NotNull ImageAttr thumb, @NotNull ImageAttr hd) {
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(hd, "hd");
        this.thumb = thumb;
        this.hd = hd;
    }

    public static /* synthetic */ ImageLink copy$default(ImageLink imageLink, ImageAttr imageAttr, ImageAttr imageAttr2, int i, Object obj) {
        if ((i & 1) != 0) {
            imageAttr = imageLink.thumb;
        }
        if ((i & 2) != 0) {
            imageAttr2 = imageLink.hd;
        }
        return imageLink.copy(imageAttr, imageAttr2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageAttr getThumb() {
        return this.thumb;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageAttr getHd() {
        return this.hd;
    }

    @NotNull
    public final ImageLink copy(@NotNull ImageAttr thumb, @NotNull ImageAttr hd) {
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(hd, "hd");
        return new ImageLink(thumb, hd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLink)) {
            return false;
        }
        ImageLink imageLink = (ImageLink) other;
        return Intrinsics.areEqual(this.thumb, imageLink.thumb) && Intrinsics.areEqual(this.hd, imageLink.hd);
    }

    @NotNull
    public final ImageAttr getHd() {
        return this.hd;
    }

    @NotNull
    public final ImageAttr getThumb() {
        return this.thumb;
    }

    public int hashCode() {
        return (this.thumb.hashCode() * 31) + this.hd.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageLink(thumb=" + this.thumb + ", hd=" + this.hd + ")";
    }
}
