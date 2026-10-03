package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/community/data/PostPictureData;", "", "clientFileId", "", "objectUrl", "wide", "", "high", "(Ljava/lang/String;Ljava/lang/String;II)V", "getClientFileId", "()Ljava/lang/String;", "getHigh", "()I", "getObjectUrl", "getWide", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PostPictureData {

    @NotNull
    private final String clientFileId;
    private final int high;

    @NotNull
    private final String objectUrl;
    private final int wide;

    public PostPictureData(@NotNull String clientFileId, @NotNull String objectUrl, int i, int i2) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(objectUrl, "objectUrl");
        this.clientFileId = clientFileId;
        this.objectUrl = objectUrl;
        this.wide = i;
        this.high = i2;
    }

    public static /* synthetic */ PostPictureData copy$default(PostPictureData postPictureData, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postPictureData.clientFileId;
        }
        if ((i3 & 2) != 0) {
            str2 = postPictureData.objectUrl;
        }
        if ((i3 & 4) != 0) {
            i = postPictureData.wide;
        }
        if ((i3 & 8) != 0) {
            i2 = postPictureData.high;
        }
        return postPictureData.copy(str, str2, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getObjectUrl() {
        return this.objectUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWide() {
        return this.wide;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHigh() {
        return this.high;
    }

    @NotNull
    public final PostPictureData copy(@NotNull String clientFileId, @NotNull String objectUrl, int wide, int high) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(objectUrl, "objectUrl");
        return new PostPictureData(clientFileId, objectUrl, wide, high);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPictureData)) {
            return false;
        }
        PostPictureData postPictureData = (PostPictureData) other;
        return Intrinsics.areEqual(this.clientFileId, postPictureData.clientFileId) && Intrinsics.areEqual(this.objectUrl, postPictureData.objectUrl) && this.wide == postPictureData.wide && this.high == postPictureData.high;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    public final int getHigh() {
        return this.high;
    }

    @NotNull
    public final String getObjectUrl() {
        return this.objectUrl;
    }

    public final int getWide() {
        return this.wide;
    }

    public int hashCode() {
        return (((((this.clientFileId.hashCode() * 31) + this.objectUrl.hashCode()) * 31) + Integer.hashCode(this.wide)) * 31) + Integer.hashCode(this.high);
    }

    @NotNull
    public String toString() {
        return "PostPictureData(clientFileId=" + this.clientFileId + ", objectUrl=" + this.objectUrl + ", wide=" + this.wide + ", high=" + this.high + ")";
    }
}
