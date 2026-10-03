package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;", "Ljava/io/Serializable;", "name", "", "styleIcon", "styleId", UTraceSQLiteHelperKt.COL_TAGS, "bigImageUrl", "select", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBigImageUrl", "()Ljava/lang/String;", "getName", "getSelect", "()Z", "setSelect", "(Z)V", "getStyleIcon", "getStyleId", "getTags", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageTags implements Serializable {

    @NotNull
    private final String bigImageUrl;

    @NotNull
    private final String name;
    private boolean select;

    @NotNull
    private final String styleIcon;

    @NotNull
    private final String styleId;

    @NotNull
    private final String tags;

    public ImageTags(@NotNull String name, @NotNull String styleIcon, @NotNull String styleId, @NotNull String tags, @NotNull String bigImageUrl, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(styleIcon, "styleIcon");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(bigImageUrl, "bigImageUrl");
        this.name = name;
        this.styleIcon = styleIcon;
        this.styleId = styleId;
        this.tags = tags;
        this.bigImageUrl = bigImageUrl;
        this.select = z;
    }

    public static /* synthetic */ ImageTags copy$default(ImageTags imageTags, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageTags.name;
        }
        if ((i & 2) != 0) {
            str2 = imageTags.styleIcon;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = imageTags.styleId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = imageTags.tags;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = imageTags.bigImageUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = imageTags.select;
        }
        return imageTags.copy(str, str6, str7, str8, str9, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyleIcon() {
        return this.styleIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    @NotNull
    public final ImageTags copy(@NotNull String name, @NotNull String styleIcon, @NotNull String styleId, @NotNull String tags, @NotNull String bigImageUrl, boolean select) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(styleIcon, "styleIcon");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(bigImageUrl, "bigImageUrl");
        return new ImageTags(name, styleIcon, styleId, tags, bigImageUrl, select);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageTags)) {
            return false;
        }
        ImageTags imageTags = (ImageTags) other;
        return Intrinsics.areEqual(this.name, imageTags.name) && Intrinsics.areEqual(this.styleIcon, imageTags.styleIcon) && Intrinsics.areEqual(this.styleId, imageTags.styleId) && Intrinsics.areEqual(this.tags, imageTags.tags) && Intrinsics.areEqual(this.bigImageUrl, imageTags.bigImageUrl) && this.select == imageTags.select;
    }

    @NotNull
    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getSelect() {
        return this.select;
    }

    @NotNull
    public final String getStyleIcon() {
        return this.styleIcon;
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    public final String getTags() {
        return this.tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((this.name.hashCode() * 31) + this.styleIcon.hashCode()) * 31) + this.styleId.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.bigImageUrl.hashCode()) * 31;
        boolean z = this.select;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    @NotNull
    public String toString() {
        return "ImageTags(name='" + this.name + "',  styleId='" + this.styleId + "', tags='" + this.tags + "', select=" + this.select + ")";
    }
}
