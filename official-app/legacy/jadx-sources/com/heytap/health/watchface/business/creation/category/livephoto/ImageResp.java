package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageResp;", "", "uploadUrl", "", "imgId", "(Ljava/lang/String;Ljava/lang/String;)V", "getImgId", "()Ljava/lang/String;", "getUploadUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ImageResp {

    @NotNull
    private final String imgId;

    @NotNull
    private final String uploadUrl;

    public ImageResp(@NotNull String uploadUrl, @NotNull String imgId) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(imgId, "imgId");
        this.uploadUrl = uploadUrl;
        this.imgId = imgId;
    }

    public static /* synthetic */ ImageResp copy$default(ImageResp imageResp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageResp.uploadUrl;
        }
        if ((i & 2) != 0) {
            str2 = imageResp.imgId;
        }
        return imageResp.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgId() {
        return this.imgId;
    }

    @NotNull
    public final ImageResp copy(@NotNull String uploadUrl, @NotNull String imgId) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(imgId, "imgId");
        return new ImageResp(uploadUrl, imgId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageResp)) {
            return false;
        }
        ImageResp imageResp = (ImageResp) other;
        return Intrinsics.areEqual(this.uploadUrl, imageResp.uploadUrl) && Intrinsics.areEqual(this.imgId, imageResp.imgId);
    }

    @NotNull
    public final String getImgId() {
        return this.imgId;
    }

    @NotNull
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        return (this.uploadUrl.hashCode() * 31) + this.imgId.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageResp(uploadUrl=" + this.uploadUrl + ", imgId=" + this.imgId + ")";
    }
}
