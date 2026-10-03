package com.heytap.health.community.focus;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/community/focus/ImageAttr;", "Ljava/io/Serializable;", "link", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "(Ljava/lang/String;II)V", "getHeight", "()I", "getLink", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageAttr implements Serializable {
    private final int height;

    @NotNull
    private final String link;
    private final int width;

    public ImageAttr(@NotNull String link, int i, int i2) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.link = link;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ ImageAttr copy$default(ImageAttr imageAttr, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageAttr.link;
        }
        if ((i3 & 2) != 0) {
            i = imageAttr.width;
        }
        if ((i3 & 4) != 0) {
            i2 = imageAttr.height;
        }
        return imageAttr.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final ImageAttr copy(@NotNull String link, int width, int height) {
        Intrinsics.checkNotNullParameter(link, "link");
        return new ImageAttr(link, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageAttr)) {
            return false;
        }
        ImageAttr imageAttr = (ImageAttr) other;
        return Intrinsics.areEqual(this.link, imageAttr.link) && this.width == imageAttr.width && this.height == imageAttr.height;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.link.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return "ImageAttr(link=" + this.link + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
