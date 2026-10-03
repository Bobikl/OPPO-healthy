package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/CreationTaskStatus;", "", "livePhotoCoverUrl", "", "livePhotoVideoUrl", "oliveUrl", "status", "", ParserTag.TAG_PERCENT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getLivePhotoCoverUrl", "()Ljava/lang/String;", "getLivePhotoVideoUrl", "getOliveUrl", "getPercent", "()I", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreationTaskStatus {

    @NotNull
    private final String livePhotoCoverUrl;

    @NotNull
    private final String livePhotoVideoUrl;

    @NotNull
    private final String oliveUrl;
    private final int percent;
    private final int status;

    public CreationTaskStatus(@NotNull String livePhotoCoverUrl, @NotNull String livePhotoVideoUrl, @NotNull String oliveUrl, int i, int i2) {
        Intrinsics.checkNotNullParameter(livePhotoCoverUrl, "livePhotoCoverUrl");
        Intrinsics.checkNotNullParameter(livePhotoVideoUrl, "livePhotoVideoUrl");
        Intrinsics.checkNotNullParameter(oliveUrl, "oliveUrl");
        this.livePhotoCoverUrl = livePhotoCoverUrl;
        this.livePhotoVideoUrl = livePhotoVideoUrl;
        this.oliveUrl = oliveUrl;
        this.status = i;
        this.percent = i2;
    }

    public static /* synthetic */ CreationTaskStatus copy$default(CreationTaskStatus creationTaskStatus, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = creationTaskStatus.livePhotoCoverUrl;
        }
        if ((i3 & 2) != 0) {
            str2 = creationTaskStatus.livePhotoVideoUrl;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = creationTaskStatus.oliveUrl;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = creationTaskStatus.status;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = creationTaskStatus.percent;
        }
        return creationTaskStatus.copy(str, str4, str5, i4, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLivePhotoCoverUrl() {
        return this.livePhotoCoverUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLivePhotoVideoUrl() {
        return this.livePhotoVideoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOliveUrl() {
        return this.oliveUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    @NotNull
    public final CreationTaskStatus copy(@NotNull String livePhotoCoverUrl, @NotNull String livePhotoVideoUrl, @NotNull String oliveUrl, int status, int percent) {
        Intrinsics.checkNotNullParameter(livePhotoCoverUrl, "livePhotoCoverUrl");
        Intrinsics.checkNotNullParameter(livePhotoVideoUrl, "livePhotoVideoUrl");
        Intrinsics.checkNotNullParameter(oliveUrl, "oliveUrl");
        return new CreationTaskStatus(livePhotoCoverUrl, livePhotoVideoUrl, oliveUrl, status, percent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreationTaskStatus)) {
            return false;
        }
        CreationTaskStatus creationTaskStatus = (CreationTaskStatus) other;
        return Intrinsics.areEqual(this.livePhotoCoverUrl, creationTaskStatus.livePhotoCoverUrl) && Intrinsics.areEqual(this.livePhotoVideoUrl, creationTaskStatus.livePhotoVideoUrl) && Intrinsics.areEqual(this.oliveUrl, creationTaskStatus.oliveUrl) && this.status == creationTaskStatus.status && this.percent == creationTaskStatus.percent;
    }

    @NotNull
    public final String getLivePhotoCoverUrl() {
        return this.livePhotoCoverUrl;
    }

    @NotNull
    public final String getLivePhotoVideoUrl() {
        return this.livePhotoVideoUrl;
    }

    @NotNull
    public final String getOliveUrl() {
        return this.oliveUrl;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.livePhotoCoverUrl.hashCode() * 31) + this.livePhotoVideoUrl.hashCode()) * 31) + this.oliveUrl.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.percent);
    }

    @NotNull
    public String toString() {
        return "CreationTaskStatus(livePhotoCoverUrl='" + this.livePhotoCoverUrl + "', livePhotoVideoUrl='" + this.livePhotoVideoUrl + "', oliveUrl='" + this.oliveUrl + "', status=" + this.status + ", percent=" + this.percent + ")";
    }
}
