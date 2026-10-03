package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateImageResDesc;", "", "preview", "", "background", "frontground", "editPreview", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "getEditPreview", "getFrontground", "getPreview", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DofTemplateImageResDesc {

    @NotNull
    private final String background;

    @NotNull
    private final String editPreview;

    @NotNull
    private final String frontground;

    @NotNull
    private final String preview;

    public DofTemplateImageResDesc() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DofTemplateImageResDesc copy$default(DofTemplateImageResDesc dofTemplateImageResDesc, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dofTemplateImageResDesc.preview;
        }
        if ((i & 2) != 0) {
            str2 = dofTemplateImageResDesc.background;
        }
        if ((i & 4) != 0) {
            str3 = dofTemplateImageResDesc.frontground;
        }
        if ((i & 8) != 0) {
            str4 = dofTemplateImageResDesc.editPreview;
        }
        return dofTemplateImageResDesc.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFrontground() {
        return this.frontground;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEditPreview() {
        return this.editPreview;
    }

    @NotNull
    public final DofTemplateImageResDesc copy(@NotNull String preview, @NotNull String background, @NotNull String frontground, @NotNull String editPreview) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(frontground, "frontground");
        Intrinsics.checkNotNullParameter(editPreview, "editPreview");
        return new DofTemplateImageResDesc(preview, background, frontground, editPreview);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DofTemplateImageResDesc)) {
            return false;
        }
        DofTemplateImageResDesc dofTemplateImageResDesc = (DofTemplateImageResDesc) other;
        return Intrinsics.areEqual(this.preview, dofTemplateImageResDesc.preview) && Intrinsics.areEqual(this.background, dofTemplateImageResDesc.background) && Intrinsics.areEqual(this.frontground, dofTemplateImageResDesc.frontground) && Intrinsics.areEqual(this.editPreview, dofTemplateImageResDesc.editPreview);
    }

    @NotNull
    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final String getEditPreview() {
        return this.editPreview;
    }

    @NotNull
    public final String getFrontground() {
        return this.frontground;
    }

    @NotNull
    public final String getPreview() {
        return this.preview;
    }

    public int hashCode() {
        return (((((this.preview.hashCode() * 31) + this.background.hashCode()) * 31) + this.frontground.hashCode()) * 31) + this.editPreview.hashCode();
    }

    @NotNull
    public String toString() {
        return "DofTemplateImageResDesc(preview=" + this.preview + ", background=" + this.background + ", frontground=" + this.frontground + ", editPreview=" + this.editPreview + ")";
    }

    public DofTemplateImageResDesc(@NotNull String preview, @NotNull String background, @NotNull String frontground, @NotNull String editPreview) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(frontground, "frontground");
        Intrinsics.checkNotNullParameter(editPreview, "editPreview");
        this.preview = preview;
        this.background = background;
        this.frontground = frontground;
        this.editPreview = editPreview;
    }

    public /* synthetic */ DofTemplateImageResDesc(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
